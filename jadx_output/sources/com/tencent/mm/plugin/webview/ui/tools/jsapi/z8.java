package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes11.dex */
public final class z8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f185593d;

    /* renamed from: e, reason: collision with root package name */
    public int f185594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.e9 f185595f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185596g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(com.tencent.mm.plugin.webview.ui.tools.jsapi.e9 e9Var, nw4.y2 y2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f185595f = e9Var;
        this.f185596g = y2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.webview.ui.tools.jsapi.z8(this.f185595f, this.f185596g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.webview.ui.tools.jsapi.z8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.tencent.mm.ui.widget.dialog.u3] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.tencent.mm.ui.widget.dialog.u3] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.ui.widget.dialog.u3 Q;
        ?? r27 = "MicroMsg.PrivateCommonApiHandler";
        pz5.a aVar = pz5.a.f359186d;
        ?? r37 = this.f185594e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        nw4.y2 y2Var = this.f185596g;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.e9 e9Var = this.f185595f;
        try {
            try {
                if (r37 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    android.content.Context context = e9Var.f185084a.f184975d;
                    Q = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), e9Var.f185084a.f184975d.getString(com.tencent.mm.R.string.ggd), true, false, null);
                    com.tencent.mm.modelsimple.j jVar = com.tencent.mm.modelsimple.j.f71351a;
                    this.f185593d = Q;
                    this.f185594e = 1;
                    if (jVar.a(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (r37 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q = (com.tencent.mm.ui.widget.dialog.u3) this.f185593d;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                Q.dismiss();
                android.content.Context context2 = e9Var.f185084a.f184975d;
                r27 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity;
                r37 = 0;
                r37 = 0;
                com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = r27 != 0 ? (com.tencent.mm.ui.MMFragmentActivity) context2 : null;
                if (mMFragmentActivity != null) {
                    js.w0 w0Var = (js.w0) i95.n0.c(js.w0.class);
                    com.tencent.mm.plugin.webview.ui.tools.jsapi.y8 y8Var = new com.tencent.mm.plugin.webview.ui.tools.jsapi.y8(mMFragmentActivity, e9Var, y2Var);
                    is.i0 i0Var = (is.i0) w0Var;
                    i0Var.getClass();
                    java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
                    if (c01.z1.t() && !com.tencent.mm.sdk.platformtools.t8.K0(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("AffiliatedAcctForgetPwdUrl"))) {
                        c71.b.c(mMFragmentActivity, ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("AffiliatedAcctForgetPwdUrl"), 0, true);
                    } else if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SetPwdServiceSetPwdService", "has not bind mobile");
                        android.content.Intent intent = new android.content.Intent(mMFragmentActivity, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMContactUI.class);
                        intent.putExtra("bind_scene", 4);
                        intent.putExtra("bind_scene", 4);
                        db5.e1.C(mMFragmentActivity, mMFragmentActivity.getString(com.tencent.mm.R.string.f492804hx4), "", mMFragmentActivity.getString(com.tencent.mm.R.string.ail), mMFragmentActivity.getString(com.tencent.mm.R.string.f490347sg), true, new is.b0(i0Var, mMFragmentActivity, intent, y8Var), new is.c0(i0Var, y8Var));
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SetPwdServiceSetPwdService", "has bind mobile");
                        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(mMFragmentActivity);
                        java.lang.String string = mMFragmentActivity.getString(com.tencent.mm.R.string.f490820ax4);
                        java.lang.String string2 = mMFragmentActivity.getString(com.tencent.mm.R.string.f490818ax2, str);
                        java.lang.String string3 = mMFragmentActivity.getString(com.tencent.mm.R.string.f490819ax3);
                        java.lang.String string4 = mMFragmentActivity.getString(com.tencent.mm.R.string.f490817ax1);
                        java.lang.String string5 = mMFragmentActivity.getString(com.tencent.mm.R.string.f490347sg);
                        u1Var.u(string);
                        u1Var.g(string2);
                        com.tencent.mm.ui.widget.dialog.a aVar2 = u1Var.f211996a.f211821b;
                        aVar2.f211734x = string3;
                        aVar2.f211735y = string4;
                        aVar2.f211736z = string5;
                        is.e0 e0Var = new is.e0(i0Var, mMFragmentActivity, str, y8Var);
                        is.g0 g0Var = new is.g0(i0Var, mMFragmentActivity, y8Var);
                        is.h0 h0Var = new is.h0(i0Var, y8Var);
                        aVar2.I = e0Var;
                        aVar2.f211708J = g0Var;
                        aVar2.K = h0Var;
                        u1Var.q(false);
                        android.widget.Button button = (android.widget.Button) u1Var.f211998c.findViewById(com.tencent.mm.R.id.jl8);
                        if (button != null) {
                            button.setTextColor(mMFragmentActivity.getResources().getColor(com.tencent.mm.R.color.f478712f3));
                        }
                    }
                }
                return f0Var;
            } catch (rm0.j e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(r27, e17, "", new java.lang.Object[0]);
                tm.a b17 = tm.a.b(e17.f397426g);
                if (b17 != null) {
                    com.tencent.mars.xlog.Log.i(r27, "summertips errCode[%d], showType[%d], url[%s], desc[%s]", new java.lang.Integer(e17.f397425f), new java.lang.Integer(b17.f420400c), b17.f420398a, b17.f420399b);
                    db5.e1.G(e9Var.f185084a.f184975d, b17.f420399b, b17.f420401d, false, new com.tencent.mm.plugin.webview.ui.tools.jsapi.w8(e9Var, y2Var));
                }
                r37.dismiss();
                return f0Var;
            }
        } catch (java.lang.Throwable th6) {
            r37.dismiss();
            throw th6;
        }
    }
}
