package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class qm extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.wm f119536e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zi2.w f119537f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm(java.lang.String str, com.tencent.mm.plugin.finder.live.widget.wm wmVar, zi2.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f119535d = str;
        this.f119536e = wmVar;
        this.f119537f = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.qm(this.f119535d, this.f119536e, this.f119537f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.qm qmVar = (com.tencent.mm.plugin.finder.live.widget.qm) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qmVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        dk2.u7 u7Var = dk2.u7.f234181a;
        java.lang.String giftId = this.f119535d;
        ce2.i e17 = u7Var.e(giftId);
        com.tencent.mm.plugin.finder.live.widget.wm wmVar = this.f119536e;
        if (e17 != null) {
            wmVar.f120212m = giftId;
            zi2.w wVar = this.f119537f;
            wVar.getClass();
            ch2.r rVar = (ch2.r) wVar.U0(ch2.r.class);
            if (rVar != null) {
                kotlin.jvm.internal.o.g(giftId, "giftId");
                rVar.f41450m = giftId;
            }
            if (wmVar.f120221v == null) {
                android.content.Context context = wmVar.f120206d.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                wmVar.f120221v = new vg2.y1(context, (tg2.h) ((jz5.n) wmVar.f120219t).getValue(), com.tencent.mm.plugin.finder.live.widget.pm.f119392d);
            }
            wmVar.l(wVar);
            wmVar.getClass();
            ((mm2.c1) wVar.P0(mm2.c1.class)).f328886t3.observe(wVar, new com.tencent.mm.plugin.finder.live.widget.mm(wmVar, wVar));
            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(e17.R0(), com.tencent.mm.plugin.finder.storage.y90.f128356f));
            android.widget.ImageView imageView = wmVar.f120210h;
            kotlin.jvm.internal.o.f(imageView, "access$getIconView$p(...)");
            a17.c(imageView);
            wmVar.f120214o = true;
            wmVar.f120206d.setTag(giftId);
            wVar.getClass();
            jf2.k0 k0Var = (jf2.k0) wVar.U0(jf2.k0.class);
            if (k0Var != null) {
                k0Var.a7("onKTVGiftResourceLoaded", false);
            }
            com.tencent.mars.xlog.Log.i(wmVar.f120208f, "onUpdateOuterGift: gift loaded and ready, giftId=" + giftId);
        } else {
            com.tencent.mars.xlog.Log.w(wmVar.f120208f, "onUpdateOuterGift: giftInfo not found after loading, giftId=" + giftId);
            wmVar.n();
        }
        return jz5.f0.f302826a;
    }
}
