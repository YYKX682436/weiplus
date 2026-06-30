package d85;

/* loaded from: classes12.dex */
public final class c implements yj0.c {
    @Override // yj0.c
    public java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object[] objArr) {
        int i17;
        int i18;
        int i19;
        java.lang.Object[] objArr2 = objArr;
        d85.f fVar = d85.f.f227152a;
        com.tencent.mars.xlog.Log.i("CameraHooker", "[CameraHooker] method:" + str4 + ",methodDec:" + str5 + ",caller:" + obj);
        java.lang.Object obj2 = null;
        if (str4 != null) {
            int hashCode = str4.hashCode();
            int i27 = 0;
            if (hashCode != -452631290) {
                if (hashCode != 3417674) {
                    if (hashCode == 1090594823 && str4.equals("release")) {
                        if (obj instanceof android.hardware.Camera) {
                            android.hardware.Camera camera = (android.hardware.Camera) obj;
                            d85.f.a(d85.f.f227152a, 1, 3, camera.getParameters().get("wechat-scene"));
                            camera.release();
                            i27 = camera.hashCode();
                        }
                        com.tencent.mars.xlog.Log.i("CameraHooker", "on camera release " + i27);
                        return null;
                    }
                } else if (str4.equals("open")) {
                    if (kotlin.jvm.internal.o.b(str5, "()Landroid/hardware/Camera;")) {
                        if (k85.t.b(k85.t.f305439a, str4, null, 2, null)) {
                            com.tencent.mars.xlog.Log.w("CameraHooker", "openCamera return");
                            d85.f.b(d85.f.f227152a, "openCameraHook", new java.lang.Throwable(), "3", "return");
                            return null;
                        }
                        try {
                            com.tencent.mars.xlog.Log.i("CameraHooker", "on camera open");
                            android.hardware.Camera open = android.hardware.Camera.open();
                            d85.f fVar2 = d85.f.f227152a;
                            d85.f.b(fVar2, "openCameraHook", new java.lang.Throwable(), "1");
                            d85.f.a(fVar2, 1, 1, open.getParameters().get("wechat-scene"));
                            return open;
                        } catch (java.lang.Throwable th6) {
                            d85.f fVar3 = d85.f.f227152a;
                            com.tencent.mars.xlog.Log.printErrStackTrace("CameraHooker", th6, "openCamera failed", new java.lang.Object[0]);
                            d85.f.b(d85.f.f227152a, "openCameraHook", th6, "2", th6.getMessage());
                            uo.n.f429522a.e(th6);
                            throw th6;
                        }
                    }
                    if (kotlin.jvm.internal.o.b(str5, "(I)Landroid/hardware/Camera;")) {
                        if (k85.t.b(k85.t.f305439a, str4, null, 2, null)) {
                            d85.f.b(d85.f.f227152a, "openCameraIdHook", new java.lang.Throwable(), "3", "return");
                            return null;
                        }
                        if (objArr2 != null) {
                            if (!(!(objArr2.length == 0))) {
                                objArr2 = null;
                            }
                            if (objArr2 != null) {
                                if (!(objArr2[0] instanceof java.lang.Integer)) {
                                    objArr2 = null;
                                }
                                if (objArr2 != null) {
                                    java.lang.Object obj3 = objArr2[0];
                                    kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Int");
                                    int intValue = ((java.lang.Integer) obj3).intValue();
                                    try {
                                        com.tencent.mars.xlog.Log.i("CameraHooker", "on camera open: " + intValue);
                                        android.hardware.Camera open2 = android.hardware.Camera.open(intValue);
                                        d85.f fVar4 = d85.f.f227152a;
                                        d85.f.b(fVar4, "openCameraIdHook", new java.lang.Throwable(), "1", "", "id-" + intValue);
                                        d85.f.a(fVar4, 1, 1, open2.getParameters().get("wechat-scene"));
                                        return open2;
                                    } catch (java.lang.Throwable th7) {
                                        d85.f fVar5 = d85.f.f227152a;
                                        com.tencent.mars.xlog.Log.printErrStackTrace("CameraHooker", th7, "openCameraId failed, id = " + intValue, new java.lang.Object[0]);
                                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                                        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                                        linkedHashMap.put("permission", java.lang.Boolean.valueOf(j35.u.h(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.CAMERA")));
                                        linkedHashMap.put("fg", java.lang.Boolean.valueOf(!com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground()));
                                        linkedHashMap.put("fgResumeDuringMin", java.lang.Long.valueOf(d85.f.f227156e <= 0 ? -1L : (android.os.SystemClock.uptimeMillis() - d85.f.f227156e) / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL));
                                        linkedHashMap.put("fgResumeDuringSec", java.lang.Long.valueOf(d85.f.f227156e <= 0 ? -1L : (android.os.SystemClock.uptimeMillis() - d85.f.f227156e) / 1000));
                                        java.lang.String str6 = com.tencent.matrix.lifecycle.owners.f0.f52719a;
                                        linkedHashMap.put("recentScene", com.tencent.matrix.lifecycle.owners.f0.f52735q);
                                        linkedHashMap.put("visibleScene", com.tencent.matrix.lifecycle.owners.f0.f52740v);
                                        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                                        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                                        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) systemService).getRunningAppProcesses();
                                        kotlin.jvm.internal.o.f(runningAppProcesses, "getRunningAppProcesses(...)");
                                        java.util.Iterator<T> it = runningAppProcesses.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            java.lang.Object next = it.next();
                                            if (((android.app.ActivityManager.RunningAppProcessInfo) next).pid == android.os.Process.myPid()) {
                                                obj2 = next;
                                                break;
                                            }
                                        }
                                        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (android.app.ActivityManager.RunningAppProcessInfo) obj2;
                                        if (runningAppProcessInfo != null) {
                                            linkedHashMap.put("importance", java.lang.Integer.valueOf(runningAppProcessInfo.importance));
                                        }
                                        d85.f.f227152a.c("openCameraIdHook", th7, linkedHashMap, "2", th7.getMessage(), "id-" + intValue);
                                        uo.n.f429522a.e(th7);
                                        throw th7;
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (str4.equals("startPreview")) {
                if (obj instanceof android.hardware.Camera) {
                    android.hardware.Camera camera2 = (android.hardware.Camera) obj;
                    camera2.startPreview();
                    android.hardware.Camera.Size previewSize = camera2.getParameters().getPreviewSize();
                    int i28 = previewSize.width;
                    i18 = previewSize.height;
                    i19 = camera2.getParameters().getPreviewFrameRate();
                    int hashCode2 = camera2.hashCode();
                    d85.f.a(d85.f.f227152a, 1, 2, camera2.getParameters().get("wechat-scene"));
                    i17 = i28;
                    i27 = hashCode2;
                } else {
                    i17 = 0;
                    i18 = 0;
                    i19 = 0;
                }
                com.tencent.mars.xlog.Log.i("CameraHooker", "on camera startPreview " + i27 + ": " + i17 + '-' + i18 + ", fps " + i19);
            }
        }
        return null;
    }
}
