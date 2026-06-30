package i72;

/* loaded from: classes14.dex */
public class c extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f289415a;

    public c(com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView faceDetectCameraView, i72.a aVar) {
        super(android.os.Looper.getMainLooper());
        this.f289415a = new java.lang.ref.WeakReference(faceDetectCameraView);
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17;
        java.lang.ref.WeakReference weakReference = this.f289415a;
        if (weakReference == null || weakReference.get() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectCameraView", "hy: no referenced view. exit");
            return;
        }
        boolean z17 = true;
        if (message.what == 1) {
            com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult faceCharacteristicsResult = (com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult) message.obj;
            int i18 = faceCharacteristicsResult.f99948d;
            if (i18 <= 0) {
                if (((com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView) this.f289415a.get()).f100097h != null) {
                    i72.n nVar = (i72.n) ((com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView) this.f289415a.get()).f100097h;
                    nVar.getClass();
                    faceCharacteristicsResult.toString();
                    if (!nVar.f289428a.f100127o) {
                        com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView = nVar.f289428a;
                        if (!faceDetectView.f100128p) {
                            e72.h hVar = faceDetectView.f100125m;
                            if (hVar != null && hVar.g(faceCharacteristicsResult)) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectView", "hy: motion eat result");
                                com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView2 = nVar.f289428a;
                                com.tencent.mm.plugin.facedetect.views.FaceDetectView.a(faceDetectView2, faceDetectView2.f100125m.d());
                                return;
                            }
                            nVar.f289428a.getClass();
                            e72.h hVar2 = nVar.f289428a.f100125m;
                            if (hVar2 == null || !hVar2.i()) {
                                com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView3 = nVar.f289428a;
                                faceDetectView3.getClass();
                                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                                if (elapsedRealtime - faceDetectView3.f100132t > 1500) {
                                    faceDetectView3.f100132t = elapsedRealtime;
                                } else {
                                    z17 = false;
                                }
                                if (!z17) {
                                    return;
                                }
                            }
                            nVar.f289428a.c();
                            com.tencent.mm.plugin.facedetect.views.FaceDetectView.b(nVar.f289428a);
                            return;
                        }
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.FaceDetectView", "hy: already end pr paused");
                    return;
                }
                return;
            }
            if (i18 > 0 && i18 < 10) {
                if (((com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView) this.f289415a.get()).f100097h != null) {
                    i72.y yVar = ((com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView) this.f289415a.get()).f100097h;
                    int i19 = faceCharacteristicsResult.f99948d;
                    java.lang.String str = faceCharacteristicsResult.f99949e;
                    i72.n nVar2 = (i72.n) yVar;
                    nVar2.getClass();
                    com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectView", "hy: onDetectError: %d, %s", java.lang.Integer.valueOf(i19), str);
                    if (!nVar2.f289428a.f100127o) {
                        com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView4 = nVar2.f289428a;
                        if (!faceDetectView4.f100128p) {
                            e72.h hVar3 = faceDetectView4.f100125m;
                            if (hVar3 != null && hVar3.f(i19, str)) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectView", "hy: motion eat result");
                                com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView5 = nVar2.f289428a;
                                com.tencent.mm.plugin.facedetect.views.FaceDetectView.a(faceDetectView5, faceDetectView5.f100125m.d());
                                return;
                            }
                            nVar2.f289428a.f(false, null);
                            nVar2.f289428a.getClass();
                            com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView6 = nVar2.f289428a;
                            faceDetectView6.e(str != null ? str : faceDetectView6.getContext().getString(com.tencent.mm.R.string.c6l));
                            com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView7 = nVar2.f289428a;
                            i72.x xVar = faceDetectView7.f100124i;
                            if (xVar != null) {
                                if (str == null) {
                                    str = faceDetectView7.getContext().getString(com.tencent.mm.R.string.c6l);
                                }
                                ((com.tencent.mm.plugin.facedetect.ui.FaceDetectUI) xVar).V6(i19, str);
                                return;
                            }
                            return;
                        }
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.FaceDetectView", "hy: already end or paused");
                    return;
                }
                return;
            }
            if (((com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView) this.f289415a.get()).f100097h != null) {
                i72.n nVar3 = (i72.n) ((com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView) this.f289415a.get()).f100097h;
                nVar3.getClass();
                java.lang.String str2 = faceCharacteristicsResult.f99949e;
                if (!nVar3.f289428a.f100127o) {
                    com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView8 = nVar3.f289428a;
                    if (!faceDetectView8.f100128p) {
                        e72.h hVar4 = faceDetectView8.f100125m;
                        if (hVar4 != null && hVar4.c(faceCharacteristicsResult)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectView", "hy: motion eat result");
                            com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView9 = nVar3.f289428a;
                            com.tencent.mm.plugin.facedetect.views.FaceDetectView.a(faceDetectView9, faceDetectView9.f100125m.d());
                            return;
                        }
                        com.tencent.mm.plugin.facedetect.views.FaceDetectView.b(nVar3.f289428a);
                        com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView10 = nVar3.f289428a;
                        faceDetectView10.getClass();
                        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                        if (elapsedRealtime2 - faceDetectView10.f100132t > 1500) {
                            faceDetectView10.f100132t = elapsedRealtime2;
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView11 = nVar3.f289428a;
                            if (faceDetectView11.f100129q || !((i17 = faceCharacteristicsResult.f99948d) == 10 || i17 == 11)) {
                                if (str2 == null) {
                                    str2 = "";
                                }
                                faceDetectView11.e(str2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.FaceDetectView", "hy: already end");
            }
        }
    }
}
