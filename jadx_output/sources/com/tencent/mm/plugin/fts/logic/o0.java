package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class o0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o13.z f137642d;

    public o0(com.tencent.mm.plugin.fts.logic.q0 q0Var, o13.z zVar) {
        this.f137642d = zVar;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        ((com.tencent.mm.plugin.fts.d0) this.f137642d).getClass();
        return com.tencent.mm.plugin.fts.jni.FTSJNIUtils.stringCompareUtfBinary((java.lang.String) obj, (java.lang.String) obj2);
    }
}
