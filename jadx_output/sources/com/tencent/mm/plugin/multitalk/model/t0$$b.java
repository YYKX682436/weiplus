package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes.dex */
public final /* synthetic */ class t0$$b implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.Integer) ((java.util.Map.Entry) obj2).getValue()).intValue() - ((java.lang.Integer) ((java.util.Map.Entry) obj).getValue()).intValue();
    }
}
