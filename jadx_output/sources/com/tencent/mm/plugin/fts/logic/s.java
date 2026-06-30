package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class s implements java.util.Comparator {
    public s(com.tencent.mm.plugin.fts.logic.l lVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return com.tencent.mm.plugin.fts.jni.FTSJNIUtils.stringCompareUtfBinary((java.lang.String) obj, (java.lang.String) obj2);
    }
}
