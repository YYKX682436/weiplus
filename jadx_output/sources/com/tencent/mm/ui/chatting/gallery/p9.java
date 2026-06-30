package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class p9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f201271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ja f201272e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201273f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.ui.chatting.gallery.ja jaVar, com.tencent.mm.storage.f9 f9Var) {
        super(0);
        this.f201271d = c0Var;
        this.f201272e = jaVar;
        this.f201273f = f9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f201271d.f310112d;
        com.tencent.mm.ui.chatting.gallery.ja jaVar = this.f201272e;
        com.tencent.mm.storage.f9 f9Var = this.f201273f;
        if (z17 && jaVar.S()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "will auto download video [" + f9Var.getMsgId() + "].");
            jaVar.f200886d.f201092g.v7(f9Var, false);
        }
        if (jaVar.S()) {
            ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).mj(java.lang.Long.valueOf(f9Var.getMsgId()), f9Var.Q0());
        }
        return jz5.f0.f302826a;
    }
}
