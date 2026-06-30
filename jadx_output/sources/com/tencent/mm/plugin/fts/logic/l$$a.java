package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes11.dex */
public final /* synthetic */ class l$$a implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return com.tencent.mm.plugin.fts.jni.FTSJNIUtils.stringCompareUtfBinary((java.lang.String) obj, (java.lang.String) obj2);
    }
}
