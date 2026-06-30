package t74;

/* loaded from: classes4.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f416207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w64.n f416208f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f416209g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f416210h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(t74.w1 w1Var, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, w64.n nVar, android.view.View view, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f416206d = w1Var;
        this.f416207e = adClickActionInfo;
        this.f416208f = nVar;
        this.f416209g = view;
        this.f416210h = snsInfo;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$1$1");
        t74.n1 n1Var = new t74.n1(this.f416206d, this.f416207e, this.f416208f, this.f416209g, this.f416210h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$1$1");
        return n1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$1$1");
        java.lang.Object invokeSuspend = ((t74.n1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$1$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.l clickPos;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$1$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        t74.w1 w1Var = this.f416206d;
        android.view.ViewGroup c17 = w1Var.t0().c();
        com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTouchContainer adFlipCardTouchContainer = c17 instanceof com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTouchContainer ? (com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTouchContainer) c17 : null;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (adFlipCardTouchContainer == null || (clickPos = adFlipCardTouchContainer.getClickPos()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$1$1");
            return f0Var;
        }
        float floatValue = ((java.lang.Number) clickPos.f302833d).floatValue();
        float floatValue2 = ((java.lang.Number) clickPos.f302834e).floatValue();
        int N = t74.w1.N(w1Var);
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.f416207e;
        android.view.View view = this.f416209g;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f416210h;
        w64.n nVar = this.f416208f;
        if (N == 0) {
            if (adClickActionInfo != null) {
                adClickActionInfo.f162569a = 33;
                nVar.o(adClickActionInfo, snsInfo, 0);
            }
            t74.i2 R = t74.w1.R(w1Var);
            if (R != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCardClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
                R.f416164g++;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCardClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
            }
            nVar.k(view);
        } else if (t74.w1.e0(w1Var, floatValue, floatValue2, t74.w1.D(w1Var))) {
            if (adClickActionInfo != null) {
                adClickActionInfo.f162569a = 33;
                nVar.o(adClickActionInfo, snsInfo, 1);
            }
            t74.i2 R2 = t74.w1.R(w1Var);
            if (R2 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCardClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
                R2.f416164g++;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCardClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
            }
            nVar.k(view);
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMActionContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            android.widget.LinearLayout u07 = w1Var.u0();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMActionContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            if (t74.w1.e0(w1Var, floatValue, floatValue2, u07)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMActionContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
                android.widget.LinearLayout u08 = w1Var.u0();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMActionContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
                if (kotlin.jvm.internal.o.a(u08 != null ? new java.lang.Float(u08.getAlpha()) : null, 1.0f)) {
                    t74.a2 C = t74.w1.C(w1Var);
                    com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f17 = C != null ? C.f() : null;
                    if (f17 != null) {
                        f17.f162569a = 34;
                        nVar.n(f17, snsInfo);
                    }
                    t74.i2 R3 = t74.w1.R(w1Var);
                    if (R3 != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateLearnMoreClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
                        R3.f416165h++;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLearnMoreClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
                    }
                    nVar.k(view);
                }
            }
            com.tencent.mars.xlog.Log.w(w1Var.j(), "click outside target view");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$1$1");
        return f0Var;
    }
}
