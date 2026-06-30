package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes.dex */
public final class k1 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f175634d = com.tencent.mm.sdk.platformtools.o4.R("MicroMsg.VLogDataManager");

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f175635e;

    static {
        new com.tencent.mm.plugin.vlog.model.j1(null);
    }

    public k1() {
        new java.util.LinkedList();
        new java.util.LinkedHashMap();
        new java.util.LinkedList();
        this.f175635e = new java.util.ArrayList();
        gm0.j1.d().a(1469, this);
        gm0.j1.d().a(2972, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof po4.a) {
            if (i17 == 0 && i18 == 0) {
                ((po4.a) m1Var).getClass();
                kotlin.jvm.internal.o.o("response");
                throw null;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.VLogDataManager", "generate vlog from server error, errType = " + i17 + ", errCode = " + i18);
        }
    }
}
