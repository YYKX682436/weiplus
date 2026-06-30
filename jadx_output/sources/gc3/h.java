package gc3;

/* loaded from: classes12.dex */
public class h implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceLayout f270428d;

    public h(com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceLayout luckyMoneyVoiceLayout) {
        this.f270428d = luckyMoneyVoiceLayout;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/voice/LuckyMoneyVoiceLayout$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceLayout luckyMoneyVoiceLayout = this.f270428d;
        if (action == 0) {
            luckyMoneyVoiceLayout.getClass();
            if (iq.b.C(luckyMoneyVoiceLayout.getContext()) || iq.b.v(luckyMoneyVoiceLayout.getContext()) || iq.b.e(luckyMoneyVoiceLayout.getContext())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyVoiceLayout", "voip is running, cann't record voice");
                luckyMoneyVoiceLayout.b(new gc3.i(luckyMoneyVoiceLayout));
            } else {
                tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                android.content.Context context = luckyMoneyVoiceLayout.getContext();
                ((sb0.f) jVar).getClass();
                if (j35.u.d(context, "android.permission.RECORD_AUDIO", true)) {
                    luckyMoneyVoiceLayout.f147608h = com.tencent.mm.plugin.luckymoney.model.e5.f();
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyVoiceLayout", "doStart currentState:%s filePath:%s", java.lang.Integer.valueOf(luckyMoneyVoiceLayout.f147611n), luckyMoneyVoiceLayout.f147608h);
                    if (luckyMoneyVoiceLayout.f147611n == 1) {
                        luckyMoneyVoiceLayout.f147611n = 2;
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        luckyMoneyVoiceLayout.f147609i = java.lang.System.currentTimeMillis();
                        luckyMoneyVoiceLayout.f147615r.c(25L, 25L);
                        luckyMoneyVoiceLayout.f147616s.c(5000L, 5000L);
                        luckyMoneyVoiceLayout.f147607g = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.k0.f259102c, null);
                        cv.h1 h1Var = (cv.h1) i95.n0.c(cv.h1.class);
                        to.c cVar = to.c.SILK;
                        ((bv.p0) h1Var).getClass();
                        w21.f1 f1Var = new w21.f1(cVar);
                        luckyMoneyVoiceLayout.f147606f = f1Var;
                        f1Var.f442367c = luckyMoneyVoiceLayout.f147613p;
                        f1Var.startRecord(luckyMoneyVoiceLayout.f147608h);
                        com.tencent.mm.plugin.luckymoney.ui.jp jpVar = luckyMoneyVoiceLayout.f147605e;
                        jpVar.f147088m = 6;
                        jpVar.invalidateSelf();
                        luckyMoneyVoiceLayout.b(new gc3.j(luckyMoneyVoiceLayout, true));
                    }
                } else {
                    android.app.Activity activity = (android.app.Activity) luckyMoneyVoiceLayout.getContext();
                    if (activity != null) {
                        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(activity, new java.lang.String[]{"android.permission.RECORD_AUDIO"}, 80, null, null);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyVoiceLayout", "context = " + activity);
                }
            }
        } else if (action == 1) {
            int i17 = luckyMoneyVoiceLayout.f147611n;
            luckyMoneyVoiceLayout.getClass();
            if (i17 == 2) {
                com.tencent.mm.sdk.platformtools.b4 b4Var = luckyMoneyVoiceLayout.f147615r;
                if (b4Var != null) {
                    b4Var.d();
                }
                com.tencent.mm.sdk.platformtools.b4 b4Var2 = luckyMoneyVoiceLayout.f147616s;
                if (b4Var2 != null) {
                    b4Var2.d();
                }
                ((w21.f1) luckyMoneyVoiceLayout.f147606f).stopRecord();
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyVoiceLayout", "abandonFocus: ");
                if (luckyMoneyVoiceLayout.f147607g != null) {
                    ((f25.n0) i95.n0.c(f25.n0.class)).yg(luckyMoneyVoiceLayout.f147607g);
                    luckyMoneyVoiceLayout.f147607g = null;
                }
                luckyMoneyVoiceLayout.f147611n = 1;
                com.tencent.mm.plugin.luckymoney.ui.jp jpVar2 = luckyMoneyVoiceLayout.f147605e;
                jpVar2.f147088m = 2;
                jpVar2.invalidateSelf();
                long j17 = luckyMoneyVoiceLayout.f147609i;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                luckyMoneyVoiceLayout.f147610m = java.lang.System.currentTimeMillis() - j17;
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/luckymoney/ui/voice/LuckyMoneyVoiceLayout$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
