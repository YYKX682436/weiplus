package com.tencent.mm.pluginsdk.model;

/* loaded from: classes5.dex */
public final class w2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f189490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.x2 f189491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f189492f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.pluginsdk.model.x2 x2Var, java.lang.Object obj) {
        super(1);
        this.f189490d = c0Var;
        this.f189491e = x2Var;
        this.f189492f = obj;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f189490d.f310112d = ((java.lang.Boolean) obj).booleanValue();
        this.f189491e.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImportFavVideo", "transcodeVideo ret callback:" + this.f189490d.f310112d);
        java.lang.Object obj2 = this.f189492f;
        com.tencent.mm.pluginsdk.model.x2 x2Var = this.f189491e;
        synchronized (obj2) {
            try {
                obj2.notifyAll();
            } catch (java.lang.Exception e17) {
                x2Var.getClass();
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ImportFavVideo", e17, "", new java.lang.Object[0]);
            }
        }
        return jz5.f0.f302826a;
    }
}
