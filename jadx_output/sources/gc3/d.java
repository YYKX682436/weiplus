package gc3;

/* loaded from: classes9.dex */
public final class d implements z21.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceInputLayout f270424a;

    public d(com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceInputLayout luckyMoneyVoiceInputLayout) {
        this.f270424a = luckyMoneyVoiceInputLayout;
    }

    @Override // z21.b
    public void a(java.lang.String[] lst, java.util.List voiceIdSet) {
        kotlin.jvm.internal.o.g(lst, "lst");
        kotlin.jvm.internal.o.g(voiceIdSet, "voiceIdSet");
        com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceInputLayout luckyMoneyVoiceInputLayout = this.f270424a;
        if (luckyMoneyVoiceInputLayout.getVoiceDetectListener() != null) {
            kz5.n0.g0(voiceIdSet, "|", null, null, 0, null, null, 62, null);
            kz5.z.d0(lst, "|", null, null, 0, null, null, 62, null);
        }
        luckyMoneyVoiceInputLayout.f147601n.removeMessages(0);
        luckyMoneyVoiceInputLayout.f147601n.sendEmptyMessageDelayed(0, luckyMoneyVoiceInputLayout.f147599i);
    }

    @Override // z21.b
    public void b(java.util.List list) {
        gc3.a voiceDetectListener = this.f270424a.getVoiceDetectListener();
        if (voiceDetectListener != null) {
            java.util.List S0 = list != null ? kz5.n0.S0(list) : null;
            gc3.o oVar = (gc3.o) voiceDetectListener;
            if (S0 == null || !(!S0.isEmpty())) {
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = S0.iterator();
            int i17 = 0;
            while (true) {
                java.lang.String str = "";
                if (!it.hasNext()) {
                    break;
                }
                int i18 = i17 + 1;
                z21.c cVar = (z21.c) it.next();
                if (i17 != 0) {
                    str = "|";
                }
                sb6.append(str);
                sb6.append(cVar.f469560b + '-' + cVar.f469559a);
                i17 = i18;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyVoiceTransLayout", "onDetectedKeyword, " + ((java.lang.Object) sb6));
            gc3.n voiceListener = oVar.f270436a.getVoiceListener();
            if (voiceListener != null) {
                com.tencent.mm.plugin.luckymoney.ui.nh nhVar = (com.tencent.mm.plugin.luckymoney.ui.nh) voiceListener;
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = nhVar.f147242a;
                luckyMoneyNewYearSendUIV2.f146436w2 = S0;
                if (luckyMoneyNewYearSendUIV2.f146440x2 == -1 || S0.size() <= nhVar.f147242a.f146440x2) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onDetectKeywords size:%s index:%s words:%s", java.lang.Integer.valueOf(S0.size()), java.lang.Integer.valueOf(nhVar.f147242a.f146440x2), fc3.e.f261020q.a(nhVar.f147242a.f146436w2, 0));
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV22 = nhVar.f147242a;
                java.util.List list2 = luckyMoneyNewYearSendUIV22.f146436w2;
                java.util.List newWords = list2.subList(luckyMoneyNewYearSendUIV22.f146440x2, list2.size());
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV23 = nhVar.f147242a;
                luckyMoneyNewYearSendUIV23.f146440x2 = luckyMoneyNewYearSendUIV23.f146436w2.size();
                fc3.e eVar = nhVar.f147242a.S;
                eVar.getClass();
                kotlin.jvm.internal.o.g(newWords, "newWords");
                try {
                    java.util.List<z21.c> S02 = kz5.n0.S0(newWords);
                    eVar.f261034k = true;
                    for (z21.c cVar2 : S02) {
                        long j17 = eVar.f261032i;
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
                        long j18 = eVar.f261026c;
                        if (currentTimeMillis > j18) {
                            java.lang.String keyword = cVar2.f469559a;
                            kotlin.jvm.internal.o.f(keyword, "keyword");
                            eVar.d(keyword);
                        } else {
                            long j19 = j18 - currentTimeMillis;
                            eVar.f261032i += j18;
                            java.lang.String str2 = cVar2.f469559a;
                            ku5.u0 u0Var = ku5.t0.f312615d;
                            fc3.c cVar3 = new fc3.c(eVar, str2);
                            ku5.t0 t0Var = (ku5.t0) u0Var;
                            t0Var.getClass();
                            t0Var.z(cVar3, j19, false);
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuckyMoneyKeywordTextHelper", th6, "", new java.lang.Object[0]);
                }
            }
        }
    }

    @Override // z21.b
    public void c() {
    }

    @Override // z21.b
    public void d(int i17) {
        com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceInputLayout luckyMoneyVoiceInputLayout = this.f270424a;
        luckyMoneyVoiceInputLayout.f147601n.removeMessages(0);
        luckyMoneyVoiceInputLayout.f147601n.removeMessages(1);
        gc3.a voiceDetectListener = luckyMoneyVoiceInputLayout.getVoiceDetectListener();
        if (voiceDetectListener != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyVoiceTransLayout", "onDetectFinish");
            gc3.n voiceListener = ((gc3.o) voiceDetectListener).f270436a.getVoiceListener();
            if (voiceListener != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onDetectTransFinish");
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = ((com.tencent.mm.plugin.luckymoney.ui.nh) voiceListener).f147242a;
                java.util.List list = luckyMoneyNewYearSendUIV2.f146436w2;
                if (list != null && list.size() > 0) {
                    fc3.e eVar = luckyMoneyNewYearSendUIV2.S;
                    java.util.List keywords = luckyMoneyNewYearSendUIV2.f146436w2;
                    eVar.getClass();
                    kotlin.jvm.internal.o.g(keywords, "keywords");
                    java.util.List list2 = eVar.f261029f;
                    if (list2 == null || list2.size() <= 0) {
                        eVar.c(keywords);
                    } else {
                        int size = keywords.size();
                        java.util.List list3 = eVar.f261029f;
                        kotlin.jvm.internal.o.d(list3);
                        if (size > list3.size()) {
                            eVar.f261029f = keywords;
                        }
                    }
                }
            }
        }
        if (luckyMoneyVoiceInputLayout.currentState == 1) {
            return;
        }
        luckyMoneyVoiceInputLayout.currentState = 1;
        luckyMoneyVoiceInputLayout.j();
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceInputLayout luckyMoneyVoiceInputLayout = this.f270424a;
        luckyMoneyVoiceInputLayout.f147601n.removeMessages(0);
        luckyMoneyVoiceInputLayout.f147601n.removeMessages(1);
        android.os.Message message = new android.os.Message();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("localCode", i17);
        bundle.putInt("errType", i18);
        bundle.putInt("errCode", i19);
        message.setData(bundle);
        message.what = 1;
        luckyMoneyVoiceInputLayout.f147602o.sendMessage(message);
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // z21.b
    public void g() {
        com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceInputLayout luckyMoneyVoiceInputLayout = this.f270424a;
        luckyMoneyVoiceInputLayout.getCurrentState();
        luckyMoneyVoiceInputLayout.f147603p.d();
        luckyMoneyVoiceInputLayout.f147602o.sendEmptyMessage(0);
    }
}
