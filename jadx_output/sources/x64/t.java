package x64;

/* loaded from: classes4.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f452328d;

    /* renamed from: e, reason: collision with root package name */
    public int f452329e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f452330f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452331g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452332h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.content.Context context, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f452330f = context;
        this.f452331g = str;
        this.f452332h = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1");
        x64.t tVar = new x64.t(this.f452330f, this.f452331g, this.f452332h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1");
        return tVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1");
        java.lang.Object invokeSuspend = ((x64.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object c17;
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        java.lang.String str;
        r45.ua0 ua0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f452329e;
        java.lang.String str2 = this.f452331g;
        java.lang.String str3 = null;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.content.Context context = this.f452330f;
            com.tencent.mm.ui.widget.dialog.u3 Q = context instanceof android.app.Activity ? db5.e1.Q(context, "", ((android.app.Activity) context).getString(com.tencent.mm.R.string.f490468vx), false, true, x64.p.f452317d) : null;
            r45.ta0 ta0Var = new r45.ta0();
            java.lang.String str4 = this.f452332h;
            ta0Var.f386230e = str4;
            ta0Var.f386229d = str2;
            ta0Var.f386231f = 3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            com.tencent.mars.xlog.Log.i("AdJumpWxKefuClick", "CustomerServiceSignReq start url=" + str2 + " uxInfo=" + str4 + " type=" + ta0Var.f386231f);
            x64.s sVar = new x64.s(ta0Var, 2634, "/cgi-bin/mmoc-bin/adplayinfo/customer_service_sign", null);
            this.f452328d = Q;
            this.f452329e = 1;
            c17 = kotlinx.coroutines.a4.c(20000L, sVar, this);
            if (c17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1");
                return aVar;
            }
            u3Var = Q;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1");
                throw illegalStateException;
            }
            u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f452328d;
            kotlin.ResultKt.throwOnFailure(obj);
            c17 = obj;
        }
        k64.b bVar = (k64.b) c17;
        if (bVar != null && (ua0Var = (r45.ua0) bVar.c()) != null) {
            str3 = ua0Var.f387164d;
        }
        if (str3 == null) {
            str3 = "";
        }
        x64.u uVar = x64.u.f452333a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        com.tencent.mars.xlog.Log.i("AdJumpWxKefuClick", "CustomerServiceSignResp end url=".concat(str3));
        if (r26.n0.N(str3)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1903, 7);
            str = str2;
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1903, 6);
            str = str3;
        }
        if (u3Var != null) {
            u3Var.dismiss();
        }
        uVar.b(this.f452330f, str, this.f452332h, 23, false);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1");
        return f0Var;
    }
}
