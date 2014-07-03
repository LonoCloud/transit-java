// Copyright (c) Cognitect, Inc.
// All rights reserved.

package com.cognitect.transit.impl;

import com.cognitect.transit.ArrayBuilder;
import com.cognitect.transit.MapBuilder;

public interface BuilderAware {
    void setBuilders(MapBuilder mapBuilder, ListBuilder listBuilder, ArrayBuilder arrayBuilder, SetBuilder setBuilder);
}
