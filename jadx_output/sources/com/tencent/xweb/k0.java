package com.tencent.xweb;

/* loaded from: classes13.dex */
public class k0 implements android.webkit.ValueCallback {
    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.Object valueOf;
        java.lang.Object obj2;
        if (!(obj instanceof java.lang.Object[])) {
            by5.c4.g("RuntimeToSdkChannel", "RuntimeToSdkChannel, invalid args");
            return;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) obj;
        if (objArr.length < 3) {
            by5.c4.g("RuntimeToSdkChannel", "RuntimeToSdkChannel, invalid args length");
            return;
        }
        boolean z17 = false;
        java.lang.Object obj3 = objArr[0];
        if (!(obj3 instanceof java.lang.String)) {
            by5.c4.g("RuntimeToSdkChannel", "RuntimeToSdkChannel, invalid args[0]");
            return;
        }
        java.lang.String str = (java.lang.String) obj3;
        java.lang.Object obj4 = objArr[1];
        if ("GET_CONFIG_CMD".equals(str)) {
            obj2 = "";
            if (obj4 instanceof java.lang.String[]) {
                java.lang.String[] strArr = (java.lang.String[]) obj4;
                if (strArr.length < 2) {
                    by5.c4.g("RuntimeToSdkChannel", "handleGetConfigCmd, invalid args length");
                } else {
                    obj2 = android.text.TextUtils.isEmpty(strArr[1]) ? com.tencent.xweb.b.m().f(strArr[0]) : com.tencent.xweb.b.m().g(strArr[0], strArr[1]);
                }
            } else {
                by5.c4.g("RuntimeToSdkChannel", "handleGetConfigCmd, invalid args");
            }
        } else if ("GET_CONFIG_CMD_EXTEND".equals(str)) {
            obj2 = "";
            if (obj4 instanceof java.lang.String[]) {
                java.lang.String[] strArr2 = (java.lang.String[]) obj4;
                if (strArr2.length < 2) {
                    by5.c4.g("RuntimeToSdkChannel", "handleGetConfigCmdExtend, invalid args length");
                } else {
                    valueOf = android.text.TextUtils.isEmpty(strArr2[1]) ? com.tencent.xweb.c.z().f(strArr2[0]) : com.tencent.xweb.c.z().g(strArr2[0], strArr2[1]);
                    obj2 = valueOf;
                }
            } else {
                by5.c4.g("RuntimeToSdkChannel", "handleGetConfigCmdExtend, invalid args");
            }
        } else {
            java.lang.Object obj5 = null;
            if ("INVOKE_INSTANCE_METHOD".equals(str)) {
                if (obj4 instanceof java.lang.Object[]) {
                    java.lang.Object[] objArr2 = (java.lang.Object[]) obj4;
                    if (objArr2 == null || objArr2.length < 2) {
                        by5.c4.g("RuntimeToSdkChannel", "handleInvokeMethod, invalid args length");
                    } else {
                        java.lang.Object obj6 = objArr2[0];
                        if (!(obj6 instanceof java.lang.Object)) {
                            by5.c4.g("RuntimeToSdkChannel", "handleInvokeMethod, invalid args[0]");
                        } else if (objArr2[1] instanceof java.lang.String) {
                            if (obj6 instanceof java.lang.String) {
                                java.lang.String str2 = (java.lang.String) obj6;
                                if (!android.text.TextUtils.isEmpty(str2)) {
                                    try {
                                        obj6 = java.lang.Class.forName(str2).newInstance();
                                    } catch (java.lang.Throwable th6) {
                                        by5.c4.d("ReflectionUtils", "instanceFromName, error", th6);
                                    }
                                }
                                obj6 = null;
                            }
                            if (obj6 == null) {
                                by5.c4.g("RuntimeToSdkChannel", "handleInvokeMethod, instance is null");
                            } else {
                                java.lang.String str3 = (java.lang.String) objArr2[1];
                                if (2 == objArr2.length) {
                                    valueOf = by5.j0.a(obj6, str3);
                                } else if (4 == objArr2.length) {
                                    java.lang.Object obj7 = objArr2[2];
                                    if (obj7 instanceof java.lang.Class[]) {
                                        java.lang.Object obj8 = objArr2[3];
                                        valueOf = !(obj8 instanceof java.lang.Object[]) ? by5.j0.a(obj6, str3) : by5.j0.b(obj6, str3, (java.lang.Class[]) obj7, (java.lang.Object[]) obj8);
                                    } else {
                                        valueOf = by5.j0.a(obj6, str3);
                                    }
                                } else {
                                    valueOf = by5.j0.a(obj6, str3);
                                }
                            }
                        } else {
                            by5.c4.g("RuntimeToSdkChannel", "handleInvokeMethod, invalid args[1]");
                        }
                    }
                } else {
                    by5.c4.g("RuntimeToSdkChannel", "handleInvokeMethod, invalid args");
                }
                obj2 = obj5;
            } else if ("INVOKE_STATIC_METHOD".equals(str)) {
                if (obj4 instanceof java.lang.Object[]) {
                    java.lang.Object[] objArr3 = (java.lang.Object[]) obj4;
                    if (objArr3 == null || objArr3.length < 2) {
                        by5.c4.g("RuntimeToSdkChannel", "handleStaticMethod, invalid args length");
                    } else {
                        java.lang.Object obj9 = objArr3[0];
                        if (obj9 instanceof java.lang.String) {
                            java.lang.Object obj10 = objArr3[1];
                            if (obj10 instanceof java.lang.String) {
                                java.lang.String str4 = (java.lang.String) obj9;
                                java.lang.String str5 = (java.lang.String) obj10;
                                if (2 == objArr3.length) {
                                    valueOf = by5.j0.c(str4, str5);
                                } else if (4 == objArr3.length) {
                                    java.lang.Object obj11 = objArr3[2];
                                    if (obj11 instanceof java.lang.Class[]) {
                                        java.lang.Object obj12 = objArr3[3];
                                        if (obj12 instanceof java.lang.Object[]) {
                                            java.lang.Object[] objArr4 = (java.lang.Object[]) obj12;
                                            try {
                                                java.lang.reflect.Method method = java.lang.Class.forName(str4).getMethod(str5, (java.lang.Class[]) obj11);
                                                method.setAccessible(true);
                                                obj5 = method.invoke(null, objArr4);
                                            } catch (java.lang.Throwable th7) {
                                                by5.c4.d("ReflectionUtils", "invokeStatic, error", th7);
                                            }
                                        } else {
                                            valueOf = by5.j0.c(str4, str5);
                                        }
                                    } else {
                                        valueOf = by5.j0.c(str4, str5);
                                    }
                                } else {
                                    valueOf = by5.j0.a(str4, str5);
                                }
                            } else {
                                by5.c4.g("RuntimeToSdkChannel", "handleStaticMethod, invalid args[1]");
                            }
                        } else {
                            by5.c4.g("RuntimeToSdkChannel", "handleStaticMethod, invalid args[0]");
                        }
                    }
                } else {
                    by5.c4.g("RuntimeToSdkChannel", "handleStaticMethod, invalid args");
                }
                obj2 = obj5;
            } else {
                if ("KEY_XPROFILE_RESULT_FORWARD_TO_SDK".equals(str) || "KEY_XPROFILE_TRACING_FRAME_COST_RESULT".equals(str)) {
                    com.tencent.xweb.t2 t2Var = com.tencent.xweb.s2.f220542a;
                    t2Var.getClass();
                    if (obj4 instanceof java.lang.Object[]) {
                        java.lang.Object[] objArr5 = (java.lang.Object[]) obj4;
                        java.lang.Object obj13 = objArr5[0];
                        if ((obj13 instanceof java.lang.String) && objArr5.length >= 2) {
                            android.support.v4.media.f.a(((java.util.concurrent.ConcurrentHashMap) t2Var.f220598b).get((java.lang.String) obj13));
                        }
                    }
                } else if ("KEY_CREATE_JAVA_CRASH_DUMP_FILE".equals(str)) {
                    if (obj4 instanceof java.lang.String) {
                        java.lang.String str6 = (java.lang.String) obj4;
                        if (!android.text.TextUtils.isEmpty(str6) && vx5.l0.f441380a != null) {
                            by5.c4.f("RuntimeToSdkChannel", "handleCreateJavaCrashDumpFile, serviceName:" + str6);
                            if (str6.contains("SandboxedProcessService")) {
                                ((com.tencent.mm.legacy.app.y0) vx5.l0.f441380a).getClass();
                                valueOf = com.tencent.mm.app.t4.c(com.tencent.mm.sdk.platformtools.x2.f193071a, bm5.f1.a(), "xweb_sandbox_crash");
                            } else if (str6.contains("PrivilegedProcessService")) {
                                ((com.tencent.mm.legacy.app.y0) vx5.l0.f441380a).getClass();
                                valueOf = com.tencent.mm.app.t4.c(com.tencent.mm.sdk.platformtools.x2.f193071a, bm5.f1.a(), "xweb_gpu_crash");
                            }
                        }
                    } else {
                        by5.c4.g("RuntimeToSdkChannel", "handleCreateJavaCrashDumpFile, invalid args");
                    }
                } else if ("KEY_CREATE_NATIVE_CRASH_DUMP_FILE".equals(str)) {
                    if (obj4 instanceof java.lang.String) {
                        java.lang.String str7 = (java.lang.String) obj4;
                        if (!android.text.TextUtils.isEmpty(str7) && vx5.l0.f441380a != null) {
                            by5.c4.f("RuntimeToSdkChannel", "handleCreateNativeCrashDumpFile, serviceName:" + str7);
                            if (str7.contains("SandboxedProcessService")) {
                                ((com.tencent.mm.legacy.app.y0) vx5.l0.f441380a).getClass();
                                valueOf = com.tencent.mm.app.t4.d(com.tencent.mm.sdk.platformtools.x2.f193071a, bm5.f1.a(), "xweb_sandbox_crash");
                            } else if (str7.contains("PrivilegedProcessService")) {
                                ((com.tencent.mm.legacy.app.y0) vx5.l0.f441380a).getClass();
                                valueOf = com.tencent.mm.app.t4.d(com.tencent.mm.sdk.platformtools.x2.f193071a, bm5.f1.a(), "xweb_gpu_crash");
                            }
                        }
                    } else {
                        by5.c4.g("RuntimeToSdkChannel", "handleCreateNativeCrashDumpFile, invalid args");
                    }
                } else if ("KEY_X_MEMORY_DUMP".equals(str)) {
                    if (obj4 instanceof android.os.Bundle) {
                        android.os.Bundle bundle = (android.os.Bundle) obj4;
                        if (!bundle.containsKey("json") || !bundle.containsKey("map")) {
                            by5.c4.g("RuntimeToSdkChannel", "handleMemoryDump, invalid args, Bundle not containsKey");
                        }
                    } else {
                        by5.c4.g("RuntimeToSdkChannel", "handleMemoryDump, invalid args");
                    }
                } else if ("KEY_REPORT_REQUEST_IP".equals(str)) {
                    if (obj4 instanceof android.os.Bundle) {
                        android.os.Bundle bundle2 = (android.os.Bundle) obj4;
                        com.tencent.xweb.v2 v2Var = com.tencent.xweb.x2.f220620a;
                        if (v2Var != null) {
                            com.tencent.mm.plugin.webview.model.j5 j5Var = ((com.tencent.mm.plugin.webview.model.i5) v2Var).f182945a;
                            kotlin.jvm.internal.o.d(bundle2);
                            j5Var.getClass();
                            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.webview.model.h5(bundle2, j5Var), "WebViewReportIp");
                        }
                    } else {
                        by5.c4.g("RuntimeToSdkChannel", "handleReportRequestIP, invalid args");
                    }
                } else if ("KEY_INCREASE_CHILD_PROCESS_CRASH_COUNT".equals(str)) {
                    com.tencent.xweb.t1.h();
                } else if ("KEY_DECREASE_CHILD_PROCESS_CRASH_COUNT".equals(str)) {
                    synchronized (com.tencent.xweb.t1.class) {
                        android.content.SharedPreferences c17 = by5.d4.c();
                        if (c17 != null) {
                            int max = java.lang.Math.max(c17.getInt(com.tencent.xweb.t1.e(), 0) - 1, 0);
                            by5.c4.f("XWebChildProcessMonitor", "decreaseCrashCount, new crash count:" + max);
                            c17.edit().putInt(com.tencent.xweb.t1.e(), max).apply();
                        }
                    }
                } else if ("KEY_MULTI_PROCESS_DOWNGRADE_SYS".equals(str)) {
                    if (obj4 instanceof java.lang.String) {
                        com.tencent.xweb.t1.m(true, (java.lang.String) obj4);
                    } else {
                        com.tencent.xweb.t1.m(true, null);
                    }
                } else if ("KEY_MULTI_PROCESS_DOWNGRADE_CRASH".equals(str)) {
                    if (obj4 instanceof java.lang.String) {
                        com.tencent.xweb.t1.j((java.lang.String) obj4);
                    } else {
                        com.tencent.xweb.t1.j(null);
                    }
                } else if ("KEY_GET_LOCATION_START".equals(str)) {
                    if (obj4 instanceof java.lang.Boolean) {
                        ((java.lang.Boolean) obj4).booleanValue();
                        ux5.a aVar = ux5.b.a().f431883a;
                        if (aVar != null) {
                            com.tencent.mm.xwebutil.r0 r0Var = (com.tencent.mm.xwebutil.r0) aVar;
                            if (!r0Var.f214884a) {
                                i11.u.a(com.tencent.mm.sdk.platformtools.x2.f193071a).e(r0Var.f214885b, com.tencent.mm.sdk.platformtools.x2.f193071a, 0, android.os.Looper.getMainLooper());
                                r0Var.f214884a = true;
                            }
                            z17 = true;
                        }
                        valueOf = java.lang.Boolean.valueOf(z17);
                    }
                } else if ("KEY_GET_LOCATION_STOP".equals(str)) {
                    ux5.a aVar2 = ux5.b.a().f431883a;
                    if (aVar2 != null) {
                        com.tencent.mm.xwebutil.r0 r0Var2 = (com.tencent.mm.xwebutil.r0) aVar2;
                        i11.u a17 = i11.u.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
                        i11.s sVar = r0Var2.f214885b;
                        a17.getClass();
                        a17.f287152a.post(new i11.x(a17, sVar));
                        r0Var2.f214884a = false;
                    }
                } else if ("KEY_START_REMOTE_DEBUG".equals(str)) {
                    by5.c4.f("RuntimeToSdkChannel", "handleStartRemoteDebug, process:" + org.xwalk.core.XWalkEnvironment.getProcessName());
                    if (obj4 instanceof java.lang.String) {
                        java.lang.String str8 = (java.lang.String) obj4;
                        if (by5.a1.c()) {
                            com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
                            u0Var.m(str8);
                            u0Var.l(true);
                            org.xwalk.core.XWalkEnvironment.f347970c.startService(new android.content.Intent(org.xwalk.core.XWalkEnvironment.f347970c, (java.lang.Class<?>) com.tencent.xweb.remotedebug.XWebRemoteDebugService.class));
                            boolean z18 = wx5.e.f450589a;
                            android.content.Intent intent = new android.content.Intent();
                            intent.setAction("com.tencent.xweb.remotedebug");
                            intent.putExtra("extra_action", 1);
                            intent.putExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_EXTRA_DATA, str8);
                            intent.putExtra("package_name", org.xwalk.core.XWalkEnvironment.l());
                            intent.setPackage(org.xwalk.core.XWalkEnvironment.l());
                            by5.c4.f("XWebRemoteDebugBroadcastManager", "broadcastRemoteDebugStarted");
                            org.xwalk.core.XWalkEnvironment.f347970c.sendBroadcast(intent);
                        }
                    } else {
                        by5.c4.g("RuntimeToSdkChannel", "handleStartRemoteDebug, not support args");
                    }
                } else if ("KEY_STOP_REMOTE_DEBUG".equals(str)) {
                    by5.c4.f("RuntimeToSdkChannel", "handleStopRemoteDebug, process:" + org.xwalk.core.XWalkEnvironment.getProcessName());
                    if (by5.a1.c()) {
                        com.tencent.xweb.u0 u0Var2 = com.tencent.xweb.t0.f220594a;
                        u0Var2.m(null);
                        u0Var2.l(false);
                        org.xwalk.core.XWalkEnvironment.f347970c.stopService(new android.content.Intent(org.xwalk.core.XWalkEnvironment.f347970c, (java.lang.Class<?>) com.tencent.xweb.remotedebug.XWebRemoteDebugService.class));
                        boolean z19 = wx5.e.f450589a;
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.setAction("com.tencent.xweb.remotedebug");
                        intent2.putExtra("extra_action", 2);
                        intent2.putExtra("package_name", org.xwalk.core.XWalkEnvironment.l());
                        intent2.setPackage(org.xwalk.core.XWalkEnvironment.l());
                        by5.c4.f("XWebRemoteDebugBroadcastManager", "broadcastRemoteDebugStopped");
                        org.xwalk.core.XWalkEnvironment.f347970c.sendBroadcast(intent2);
                    }
                }
                obj2 = obj5;
            }
            obj2 = valueOf;
        }
        objArr[2] = obj2;
    }
}
