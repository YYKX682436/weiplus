package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class lb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.tb f201935d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(com.tencent.mm.ui.chatting.tb tbVar) {
        super(0);
        this.f201935d = tbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.chatting.tb tbVar = this.f201935d;
        em.i1 i1Var = tbVar.f202711d;
        if (i1Var == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        i1Var.a().removeCallbacks(tbVar.f202716i);
        com.tencent.mars.xlog.Log.i("MicroMsg.MarkdownPreviewUIC", "[PREVIEW_TAP] cancel delayed finish by child interaction");
        return jz5.f0.f302826a;
    }
}
