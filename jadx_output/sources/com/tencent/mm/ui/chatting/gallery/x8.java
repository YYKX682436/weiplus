package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class x8 implements wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f201556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ja f201558f;

    public x8(kotlinx.coroutines.q qVar, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.gallery.ja jaVar) {
        this.f201556d = qVar;
        this.f201557e = f9Var;
        this.f201558f = jaVar;
    }

    @Override // wf0.u1
    public void h(wf0.r1 notifyInfo) {
        kotlin.jvm.internal.o.g(notifyInfo, "notifyInfo");
        kotlinx.coroutines.q qVar = this.f201556d;
        if (((kotlinx.coroutines.r) qVar).o()) {
            return;
        }
        t21.v2 s17 = com.tencent.mm.ui.chatting.gallery.j1.s(this.f201557e);
        java.lang.String d17 = s17 != null ? s17.d() : null;
        java.lang.String str = notifyInfo.f445529a;
        if (kotlin.jvm.internal.o.b(str, d17)) {
            com.tencent.mm.ui.chatting.gallery.ja jaVar = this.f201558f;
            com.tencent.mm.ui.chatting.gallery.t8 t8Var = (com.tencent.mm.ui.chatting.gallery.t8) jaVar.f201080u.get(str);
            if (s17 == null || t8Var == null) {
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                t21.o2.Ui().A(this);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("Couldn't find video info: info=" + s17 + ", item=" + t8Var))));
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "onNotifyChange, status:" + s17.f415011i);
            if (s17.f415011i == 198) {
                if (jaVar.G(t8Var)) {
                    dp.a.makeText(jaVar.f200886d.f201092g, com.tencent.mm.R.string.k78, 0).show();
                }
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                t21.o2.Ui().A(this);
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("Video is expired or failed to download"))));
                return;
            }
            int g17 = t21.d3.g(s17);
            int i17 = t8Var.f201408a;
            com.tencent.mm.ui.chatting.gallery.ta k17 = jaVar.k(i17);
            if (jaVar.f200886d.f201092g.I7() == i17 && k17 != null) {
                jaVar.K(k17, g17);
            }
            if (s17.i()) {
                jaVar.G(t8Var);
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                t21.o2.Ui().A(this);
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
            }
        }
    }
}
