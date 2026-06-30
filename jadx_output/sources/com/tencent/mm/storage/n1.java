package com.tencent.mm.storage;

/* loaded from: classes.dex */
public final class n1 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f195137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f195138e;

    public n1(java.util.LinkedList linkedList, int i17) {
        this.f195137d = linkedList;
        this.f195138e = i17;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizRecycleCardLogic", "recycleReport callback errType = " + i17 + ", errCode=" + i18 + ", size = " + this.f195137d.size() + ", fromScene=" + this.f195138e);
        return 0;
    }
}
