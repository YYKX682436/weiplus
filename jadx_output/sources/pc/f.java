package pc;

/* loaded from: classes14.dex */
public abstract class f {
    public static com.tencent.cloud.huiyan.enums.HuiYanAuthEvent a(int i17, boolean z17) {
        com.tencent.cloud.huiyan.enums.HuiYanAuthEvent huiYanAuthEvent;
        com.tencent.cloud.huiyan.enums.HuiYanAuthEvent huiYanAuthEvent2 = com.tencent.cloud.huiyan.enums.HuiYanAuthEvent.NONE;
        mc.p.f325531a.b("CommonUtils", "callbackAuthEvent: actionType " + i17 + ", isDoneEvent: " + z17);
        if (i17 == 1) {
            com.tencent.cloud.huiyan.enums.HuiYanProcessStatus huiYanProcessStatus = com.tencent.cloud.huiyan.enums.HuiYanProcessStatus.ActionBlink;
            if (!z17) {
                int i18 = ic.d.f290281k;
                ic.c.f290280a.getClass();
                pc.l.f353211a.f353212a = huiYanProcessStatus;
            }
            huiYanAuthEvent = z17 ? com.tencent.cloud.huiyan.enums.HuiYanAuthEvent.BLINK_CHECK_DONE : com.tencent.cloud.huiyan.enums.HuiYanAuthEvent.BLINK_CHECK;
        } else if (i17 == 2) {
            com.tencent.cloud.huiyan.enums.HuiYanProcessStatus huiYanProcessStatus2 = com.tencent.cloud.huiyan.enums.HuiYanProcessStatus.ActionOpenMouth;
            if (!z17) {
                int i19 = ic.d.f290281k;
                ic.c.f290280a.getClass();
                pc.l.f353211a.f353212a = huiYanProcessStatus2;
            }
            huiYanAuthEvent = z17 ? com.tencent.cloud.huiyan.enums.HuiYanAuthEvent.OPEN_MOUTH_CHECK_DONE : com.tencent.cloud.huiyan.enums.HuiYanAuthEvent.OPEN_MOUTH_CHECK;
        } else if (i17 == 3) {
            com.tencent.cloud.huiyan.enums.HuiYanProcessStatus huiYanProcessStatus3 = com.tencent.cloud.huiyan.enums.HuiYanProcessStatus.ActionNodHead;
            if (!z17) {
                int i27 = ic.d.f290281k;
                ic.c.f290280a.getClass();
                pc.l.f353211a.f353212a = huiYanProcessStatus3;
            }
            huiYanAuthEvent = z17 ? com.tencent.cloud.huiyan.enums.HuiYanAuthEvent.NOD_HEAD_CHECK_DONE : com.tencent.cloud.huiyan.enums.HuiYanAuthEvent.NOD_HEAD_CHECK;
        } else if (i17 != 4) {
            if (i17 == 5) {
                com.tencent.cloud.huiyan.enums.HuiYanProcessStatus huiYanProcessStatus4 = com.tencent.cloud.huiyan.enums.HuiYanProcessStatus.ActionSilence;
                if (!z17) {
                    int i28 = ic.d.f290281k;
                    ic.c.f290280a.getClass();
                    pc.l.f353211a.f353212a = huiYanProcessStatus4;
                }
            } else if (i17 == 7) {
                huiYanAuthEvent = com.tencent.cloud.huiyan.enums.HuiYanAuthEvent.REFLECT_CHECK;
            }
            huiYanAuthEvent = huiYanAuthEvent2;
        } else {
            com.tencent.cloud.huiyan.enums.HuiYanProcessStatus huiYanProcessStatus5 = com.tencent.cloud.huiyan.enums.HuiYanProcessStatus.ActionShakeHead;
            if (!z17) {
                int i29 = ic.d.f290281k;
                ic.c.f290280a.getClass();
                pc.l.f353211a.f353212a = huiYanProcessStatus5;
            }
            huiYanAuthEvent = z17 ? com.tencent.cloud.huiyan.enums.HuiYanAuthEvent.SHAKE_HEAD_CHECK_DONE : com.tencent.cloud.huiyan.enums.HuiYanAuthEvent.SHAKE_HEAD_CHECK;
        }
        if (huiYanAuthEvent != huiYanAuthEvent2) {
            int i37 = ic.d.f290281k;
            ic.c.f290280a.c(huiYanAuthEvent);
        }
        return huiYanAuthEvent;
    }

    public static void b() {
        try {
            final lc.i a17 = mc.a.f325494a.a();
            if (a17 != null) {
                a17.a(new java.lang.Runnable() { // from class: pc.f$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        lc.i iVar = lc.i.this;
                        if (iVar instanceof lc.g) {
                            lc.g gVar = (lc.g) iVar;
                            mc.q qVar = mc.p.f325531a;
                            qVar.b("CommonUtils", "closeCurrentFragment!");
                            gVar.getClass();
                            qVar.e("AuthingFragment", "releaseDeviceRes!");
                            gVar.f317823x = false;
                            if (gVar.f317820u != null) {
                                gVar.f317820u.release();
                                oc.g.f344101a.a();
                                gVar.f317820u = null;
                            }
                        }
                        lc.g gVar2 = (lc.g) iVar;
                        if (gVar2.getActivity() == null) {
                            mc.p.f325531a.e("BaseFragment", "getActivity is null!");
                        } else {
                            android.app.Activity activity = gVar2.getActivity();
                            java.util.Objects.requireNonNull(activity);
                            if (activity.isFinishing()) {
                                mc.p.f325531a.e("BaseFragment", "getActivity is finishing!");
                            } else {
                                int i17 = ic.d.f290281k;
                                ic.d dVar = ic.c.f290280a;
                                dVar.f290284c = true;
                                com.tencent.cloud.huiyan.entity.AuthUiConfig e17 = dVar.e();
                                if (e17 == null || !e17.isKeepAuthView()) {
                                    mc.b bVar = mc.a.f325494a;
                                    if (bVar.f325496b != null) {
                                        bVar.f325496b = null;
                                    }
                                    if (bVar.f325495a != null) {
                                        bVar.f325495a = null;
                                    }
                                    mc.p.f325531a.e("BaseFragment", "getActivity start finish!");
                                    android.app.Activity activity2 = gVar2.getActivity();
                                    java.util.Objects.requireNonNull(activity2);
                                    activity2.finish();
                                }
                            }
                        }
                        int i18 = ic.d.f290281k;
                        ic.c.f290280a.f290284c = true;
                    }
                });
            }
        } catch (java.lang.Exception e17) {
            mc.p.f325531a.e("CommonUtils", "close current fragment error! e" + e17.getLocalizedMessage());
        }
    }

    public static void c(int i17, java.lang.String str) {
        int i18 = ic.d.f290281k;
        ic.c.f290280a.b(i17, str);
    }

    public static boolean d(java.lang.String str, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
            try {
                if (!new java.io.File(str).exists()) {
                    return false;
                }
                try {
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(str);
                    try {
                        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(str2);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = fileInputStream.read(bArr);
                                if (read == -1) {
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                    fileInputStream.close();
                                    return true;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (java.lang.Exception unused) {
                    mc.p.f325531a.e("CommonUtils", "copy video error.");
                    return false;
                }
            } catch (java.lang.Exception e17) {
                mc.p.f325531a.e("CommonUtils", "source file is null: " + e17.getLocalizedMessage());
            }
        }
        return false;
    }
}
