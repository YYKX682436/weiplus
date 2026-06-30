package d22;

/* loaded from: classes9.dex */
public final class a0 implements com.tencent.mm.modelbase.u0, h45.l {

    /* renamed from: d, reason: collision with root package name */
    public final d22.a f225824d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f225825e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f225826f;

    /* renamed from: g, reason: collision with root package name */
    public z12.f f225827g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f225828h;

    public a0(d22.a rewardInfo) {
        kotlin.jvm.internal.o.g(rewardInfo, "rewardInfo");
        this.f225824d = rewardInfo;
        this.f225825e = "MicroMsg.MMEmoticonRewardLiteAppLogic";
    }

    public final void a(boolean z17, int i17) {
        yz5.p pVar = this.f225824d.f225823g;
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        }
    }

    public final void b(java.lang.String str) {
        android.content.Context context = this.f225824d.f225822f;
        db5.e1.y(context, str, null, context != null ? context.getString(com.tencent.mm.R.string.by_) : null, d22.y.f225878d);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        android.app.ProgressDialog progressDialog;
        kotlin.jvm.internal.o.g(scene, "scene");
        android.app.ProgressDialog progressDialog2 = this.f225826f;
        if ((progressDialog2 != null && progressDialog2.isShowing()) && (progressDialog = this.f225826f) != null) {
            progressDialog.dismiss();
        }
        int type = scene.getType();
        java.lang.String str2 = this.f225825e;
        if (type != 830) {
            com.tencent.mars.xlog.Log.i(str2, "unknown scene. type:%d", java.lang.Integer.valueOf(type));
            a(false, -1);
            return;
        }
        z12.f fVar = (z12.f) scene;
        d22.a aVar = this.f225824d;
        if (i17 == 0 && i18 == 0) {
            boolean isSwitch2InWxAppPay = ((h45.q) i95.n0.c(h45.q.class)).isSwitch2InWxAppPay(((r45.fb) fVar.f469286d.f70711b.f70700a).f374162d);
            com.tencent.mars.xlog.Log.i(str2, "doEmojiReward, isSwitch2InWxAppPay:%b", java.lang.Boolean.valueOf(isSwitch2InWxAppPay));
            if (isSwitch2InWxAppPay) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("prepayId", ((r45.fb) fVar.f469286d.f70711b.f70700a).f374162d);
                bundle.putInt("payScene", 5);
                bundle.putInt("payChannel", 0);
                android.content.Context context = aVar.f225822f;
                bundle.putString("customSucTip", context != null ? context.getString(com.tencent.mm.R.string.dtj) : null);
                ((h45.q) i95.n0.c(h45.q.class)).startInWxAppPayUseCase(this, bundle);
            } else {
                android.content.Context context2 = aVar.f225822f;
                dp.a.makeText(context2, context2 != null ? context2.getString(com.tencent.mm.R.string.byf) : null, 0).show();
                a(false, -1);
            }
        } else if (i17 == 4) {
            if (!this.f225828h) {
                this.f225828h = true;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12738, aVar.f225817a, java.lang.Integer.valueOf(aVar.f225820d), java.lang.Integer.valueOf(aVar.f225821e), 2);
            }
            if (i18 == 6) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(408L, 6L, 1L, false);
                if (str != null) {
                    b(str);
                } else {
                    android.content.Context context3 = aVar.f225822f;
                    if (context3 != null && (string3 = context3.getString(com.tencent.mm.R.string.bzb)) != null) {
                        b(string3);
                    }
                }
            } else if (i18 == 7) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(408L, 7L, 1L, false);
                if (str != null) {
                    b(str);
                } else {
                    android.content.Context context4 = aVar.f225822f;
                    if (context4 != null && (string2 = context4.getString(com.tencent.mm.R.string.bzd)) != null) {
                        b(string2);
                    }
                }
            } else if (i18 == 10) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(408L, 5L, 1L, false);
                if (str != null) {
                    b(str);
                } else {
                    android.content.Context context5 = aVar.f225822f;
                    if (context5 != null && (string = context5.getString(com.tencent.mm.R.string.bzc)) != null) {
                        b(string);
                    }
                }
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(408L, 8L, 1L, false);
                android.content.Context context6 = aVar.f225822f;
                dp.a.makeText(context6, context6 != null ? context6.getString(com.tencent.mm.R.string.byf) : null, 0).show();
            }
            a(false, -1);
        } else {
            if (!this.f225828h) {
                this.f225828h = true;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12738, aVar.f225817a, java.lang.Integer.valueOf(aVar.f225820d), java.lang.Integer.valueOf(aVar.f225821e), 2);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(408L, 8L, 1L, false);
            android.content.Context context7 = aVar.f225822f;
            dp.a.makeText(context7, context7 != null ? context7.getString(com.tencent.mm.R.string.byf) : null, 0).show();
            a(false, -1);
        }
        gm0.j1.n().f273288b.q(830, this);
    }
}
