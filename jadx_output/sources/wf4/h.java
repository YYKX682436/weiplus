package wf4;

/* loaded from: classes12.dex */
public final class h implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf4.a f445692a;

    public h(wf4.a aVar) {
        this.f445692a = aVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        wf4.a aVar = this.f445692a;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.e("ExtTranslateVoiceEventListenerKtHelper", "doCheckVoiceRecognizeRequest cgiBack is null");
            ((wf4.b) aVar).a(0, 0, "cgiBack is null");
        } else {
            com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListenerKtHelper", "doCheckVoiceRecognizeRequest errType:" + fVar.f70615a + ", errCode:" + fVar.f70616b);
            int i17 = fVar.f70615a;
            if (i17 == 0 && fVar.f70616b == 0) {
                r45.z20 z20Var = (r45.z20) fVar.f70618d;
                if (z20Var == null) {
                    com.tencent.mars.xlog.Log.e("ExtTranslateVoiceEventListenerKtHelper", "doCheckVoiceRecognizeRequest resp is null");
                    ((wf4.b) aVar).a(fVar.f70615a, fVar.f70616b, "resp is null");
                } else {
                    int integer = z20Var.getInteger(1);
                    final java.lang.String string = z20Var.getString(2);
                    com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListenerKtHelper", "doCheckVoiceRecognizeRequest checkResult:" + integer + ", resultText:" + string);
                    if (integer == 1) {
                        final wf4.b bVar = (wf4.b) aVar;
                        bVar.getClass();
                        com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListener", "ilink check result: finish");
                        ik1.h0.b(new java.lang.Runnable() { // from class: wf4.b$$b
                            @Override // java.lang.Runnable
                            public final void run() {
                                wf4.b bVar2 = wf4.b.this;
                                java.lang.String str = string;
                                if (bVar2.f445636a.f445679n) {
                                    return;
                                }
                                bVar2.f445636a.b();
                                wf4.g gVar = bVar2.f445636a;
                                gVar.A = 0;
                                gVar.C = true;
                                wf4.f fVar2 = wf4.f.FINISH;
                                gVar.f(fVar2, null);
                                bVar2.f445636a.c(str, fVar2, null);
                            }
                        });
                    } else if (integer == 2) {
                        final wf4.b bVar2 = (wf4.b) aVar;
                        bVar2.getClass();
                        com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListener", "ilink check result: processing");
                        ik1.h0.b(new java.lang.Runnable() { // from class: wf4.b$$d
                            @Override // java.lang.Runnable
                            public final void run() {
                                wf4.b bVar3 = wf4.b.this;
                                if (bVar3.f445636a.f445679n) {
                                    return;
                                }
                                bVar3.f445636a.f(wf4.f.GET, null);
                            }
                        });
                    } else if (integer != 3) {
                        com.tencent.mars.xlog.Log.w("ExtTranslateVoiceEventListenerKtHelper", "doCheckVoiceRecognizeRequest unknown checkResult:" + integer);
                        ((wf4.b) aVar).a(fVar.f70615a, fVar.f70616b, "unknown checkResult:" + integer);
                    } else {
                        final wf4.b bVar3 = (wf4.b) aVar;
                        bVar3.getClass();
                        com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListener", "ilink check result: not start");
                        ik1.h0.b(new java.lang.Runnable() { // from class: wf4.b$$e
                            @Override // java.lang.Runnable
                            public final void run() {
                                wf4.b bVar4 = wf4.b.this;
                                if (bVar4.f445636a.f445679n) {
                                    return;
                                }
                                bVar4.f445636a.f(wf4.f.UPLOAD, null);
                            }
                        });
                    }
                }
            } else if (i17 == 2) {
                final wf4.b bVar4 = (wf4.b) aVar;
                bVar4.getClass();
                com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListener", "ilink check result: network overtime");
                ik1.h0.b(new java.lang.Runnable() { // from class: wf4.b$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        wf4.b bVar5 = wf4.b.this;
                        if (bVar5.f445636a.f445679n) {
                            return;
                        }
                        bVar5.f445636a.f(wf4.f.NETWORK_OVERTIME, null);
                    }
                });
            } else {
                ((wf4.b) aVar).a(i17, fVar.f70616b, fVar.f70617c);
            }
        }
        return jz5.f0.f302826a;
    }
}
