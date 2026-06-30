package gc3;

/* loaded from: classes9.dex */
public final class q implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceTransLayout f270438d;

    public q(com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceTransLayout luckyMoneyVoiceTransLayout) {
        this.f270438d = luckyMoneyVoiceTransLayout;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        z21.e sceneVoiceInputAddrProxy;
        gc3.n voiceListener;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/voice/LuckyMoneyVoiceTransLayout$onTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceTransLayout luckyMoneyVoiceTransLayout = this.f270438d;
        if (action == 0) {
            luckyMoneyVoiceTransLayout.f147619s = false;
            luckyMoneyVoiceTransLayout.getCurrentState();
            luckyMoneyVoiceTransLayout.setCurrentState(1);
            if (!iq.b.C(luckyMoneyVoiceTransLayout.getContext()) && !iq.b.v(luckyMoneyVoiceTransLayout.getContext()) && !iq.b.e(luckyMoneyVoiceTransLayout.getContext())) {
                tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                android.content.Context context = luckyMoneyVoiceTransLayout.getContext();
                ((sb0.f) jVar).getClass();
                if (j35.u.d(context, "android.permission.RECORD_AUDIO", true)) {
                    if (luckyMoneyVoiceTransLayout.currentState == 1) {
                        java.lang.String str = luckyMoneyVoiceTransLayout.com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH java.lang.String;
                        if (com.tencent.mm.vfs.w6.j(str)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyVoiceInputLayout", "fileExists delete first");
                            com.tencent.mm.vfs.w6.h(str);
                        }
                        luckyMoneyVoiceTransLayout.currentState = 2;
                        gc3.a aVar = luckyMoneyVoiceTransLayout.voiceDetectListener;
                        if (aVar != null && (voiceListener = ((gc3.o) aVar).f270436a.getVoiceListener()) != null) {
                            com.tencent.mm.plugin.luckymoney.ui.nh nhVar = (com.tencent.mm.plugin.luckymoney.ui.nh) voiceListener;
                            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onDetectStart");
                            android.view.View view2 = nhVar.f147242a.f146405h;
                            if (view2 != null) {
                                view2.post(new com.tencent.mm.plugin.luckymoney.ui.ih(nhVar));
                            }
                        }
                        luckyMoneyVoiceTransLayout.f147603p.c(50L, 50L);
                        luckyMoneyVoiceTransLayout.k(true);
                        if (com.tencent.mm.sdk.platformtools.x2.n()) {
                            ((x90.o) ((y90.i) i95.n0.c(y90.i.class))).getClass();
                            sceneVoiceInputAddrProxy = new z21.w();
                        } else {
                            ((x90.o) ((y90.i) i95.n0.c(y90.i.class))).getClass();
                            sceneVoiceInputAddrProxy = com.tencent.mm.modelvoiceaddr.SceneVoiceInputAddrProxy.getInstance();
                        }
                        z21.e eVar = sceneVoiceInputAddrProxy;
                        luckyMoneyVoiceTransLayout.f147596f = eVar;
                        if (eVar != null) {
                            eVar.init(luckyMoneyVoiceTransLayout.disableTrans, false, 1, 13, new gc3.d(luckyMoneyVoiceTransLayout));
                        }
                        z21.e eVar2 = luckyMoneyVoiceTransLayout.f147596f;
                        if (eVar2 != null) {
                            eVar2.start(str);
                        }
                    }
                } else if (luckyMoneyVoiceTransLayout.getContext() instanceof android.app.Activity) {
                    tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
                    android.content.Context context2 = luckyMoneyVoiceTransLayout.getContext();
                    kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
                    ((sb0.f) jVar2).Di((android.app.Activity) context2, new java.lang.String[]{"android.permission.RECORD_AUDIO"}, 80, null, null);
                }
            }
        } else if (action == 1) {
            luckyMoneyVoiceTransLayout.getCurrentState();
            boolean z17 = luckyMoneyVoiceTransLayout.f147619s;
            luckyMoneyVoiceTransLayout.f147619s = false;
            luckyMoneyVoiceTransLayout.c();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/luckymoney/ui/voice/LuckyMoneyVoiceTransLayout$onTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
