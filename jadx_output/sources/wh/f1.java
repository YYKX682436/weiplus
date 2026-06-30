package wh;

/* loaded from: classes12.dex */
public class f1 implements wh.a2 {
    @Override // wh.a2
    public java.lang.Object a(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        return null;
    }

    @Override // wh.a2
    public void b(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        wh.g1 g1Var;
        oj.j.e("Matrix.battery.PowerHooker", "onServiceMethodInvoke: method name %s", method.getName());
        wh.i1 i1Var = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        wh.g1 g1Var2 = null;
        i1Var = null;
        i1Var = null;
        i1Var = null;
        int i17 = 0;
        if (!method.getName().equals("acquireWakeLock")) {
            if (method.getName().equals("releaseWakeLock")) {
                if (objArr == null) {
                    oj.j.f("Matrix.battery.PowerHooker", "createReleaseWakeLockArgs args null", new java.lang.Object[0]);
                } else {
                    int i18 = android.os.Build.VERSION.SDK_INT;
                    oj.j.c("Matrix.battery.PowerHooker", "createReleaseWakeLockArgs apiLevel:%d, codeName:%s, versionRelease:%s", java.lang.Integer.valueOf(i18), android.os.Build.VERSION.CODENAME, java.lang.Integer.valueOf(i18));
                    oj.j.c("Matrix.battery.PowerHooker", "createReleaseWakeLockArgsAccordingToArgsLength: length:%s", java.lang.Integer.valueOf(objArr.length));
                    if (objArr.length != 2) {
                        oj.j.f("Matrix.battery.PowerHooker", "createReleaseWakeLockArgs2 args length invalid : %d", java.lang.Integer.valueOf(objArr.length));
                    } else {
                        wh.i1 i1Var2 = new wh.i1(null);
                        java.lang.Object obj = objArr[0];
                        if (obj instanceof android.os.IBinder) {
                            i1Var2.f445800a = (android.os.IBinder) obj;
                            java.lang.Object obj2 = objArr[1];
                            if (obj2 instanceof java.lang.Integer) {
                                i1Var2.f445801b = ((java.lang.Integer) obj2).intValue();
                                i1Var = i1Var2;
                            } else {
                                oj.j.f("Matrix.battery.PowerHooker", "createReleaseWakeLockArgs2 args idx 1 not Integer, %s", obj2);
                            }
                        } else {
                            oj.j.f("Matrix.battery.PowerHooker", "createReleaseWakeLockArgs2 args idx 0 not IBinder, %s", obj);
                        }
                    }
                }
                if (i1Var == null) {
                    oj.j.f("Matrix.battery.PowerHooker", "dispatchReleaseWakeLock AcquireWakeLockArgs null", new java.lang.Object[0]);
                    return;
                }
                synchronized (wh.j1.class) {
                    while (true) {
                        java.util.List list = wh.j1.f445813a;
                        if (i17 < ((java.util.ArrayList) list).size()) {
                            ((rh.q3) ((wh.h1) ((java.util.ArrayList) list).get(i17))).b(i1Var.f445800a, i1Var.f445801b);
                            i17++;
                        }
                    }
                }
                return;
            }
            return;
        }
        if (objArr == null) {
            oj.j.f("Matrix.battery.PowerHooker", "createAcquireWakeLockArgs args null", new java.lang.Object[0]);
        } else {
            int i19 = android.os.Build.VERSION.SDK_INT;
            oj.j.c("Matrix.battery.PowerHooker", "createAcquireWakeLockArgs apiLevel:%d, codeName:%s, versionRelease:%s", java.lang.Integer.valueOf(i19), android.os.Build.VERSION.CODENAME, java.lang.Integer.valueOf(i19));
            int length = objArr.length;
            oj.j.c("Matrix.battery.PowerHooker", "createAcquireWakeLockArgsAccordingToArgsLength: length:%s", java.lang.Integer.valueOf(length));
            if (length != 4) {
                if (objArr.length == 6 || objArr.length == 5) {
                    g1Var = new wh.g1(null);
                    java.lang.Object obj3 = objArr[0];
                    if (obj3 instanceof android.os.IBinder) {
                        g1Var.f445784a = (android.os.IBinder) obj3;
                        java.lang.Object obj4 = objArr[1];
                        if (obj4 instanceof java.lang.Integer) {
                            g1Var.f445785b = ((java.lang.Integer) obj4).intValue();
                            java.lang.Object obj5 = objArr[2];
                            if (obj5 == null || (obj5 instanceof java.lang.String)) {
                                g1Var.f445786c = (java.lang.String) obj5;
                                java.lang.Object obj6 = objArr[3];
                                if (obj6 == null || (obj6 instanceof java.lang.String)) {
                                    g1Var.f445787d = (java.lang.String) obj6;
                                    java.lang.Object obj7 = objArr[4];
                                    if (obj7 == null || (obj7 instanceof android.os.WorkSource)) {
                                        g1Var.f445788e = (android.os.WorkSource) obj7;
                                        if (objArr.length != 5) {
                                            java.lang.Object obj8 = objArr[5];
                                            if (obj8 == null || (obj8 instanceof java.lang.String)) {
                                                g1Var.f445789f = (java.lang.String) obj8;
                                            } else {
                                                oj.j.f("Matrix.battery.PowerHooker", "createAcquireWakeLockArgs6 args idx 5 not String, %s", obj8);
                                            }
                                        }
                                        g1Var2 = g1Var;
                                    } else {
                                        oj.j.f("Matrix.battery.PowerHooker", "createAcquireWakeLockArgs6 args idx 4 not WorkSource, %s", obj7);
                                    }
                                } else {
                                    oj.j.f("Matrix.battery.PowerHooker", "createAcquireWakeLockArgs6 args idx 3 not String, %s", obj6);
                                }
                            } else {
                                oj.j.f("Matrix.battery.PowerHooker", "createAcquireWakeLockArgs6 args idx 2 not String, %s", obj5);
                            }
                        } else {
                            oj.j.f("Matrix.battery.PowerHooker", "createAcquireWakeLockArgs6 args idx 1 not Integer, %s", obj4);
                        }
                    } else {
                        oj.j.f("Matrix.battery.PowerHooker", "createAcquireWakeLockArgs6 args idx 0 not IBinder, %s", obj3);
                    }
                } else {
                    oj.j.f("Matrix.battery.PowerHooker", "createAcquireWakeLockArgs6 args length invalid : %d", java.lang.Integer.valueOf(objArr.length));
                }
            } else if (objArr.length != 4) {
                oj.j.f("Matrix.battery.PowerHooker", "createAcquireWakeLockArgs4 args length invalid : %d", java.lang.Integer.valueOf(objArr.length));
            } else {
                g1Var = new wh.g1(null);
                java.lang.Object obj9 = objArr[2];
                if (obj9 == null || (obj9 instanceof java.lang.String)) {
                    g1Var.f445786c = (java.lang.String) obj9;
                    java.lang.Object obj10 = objArr[3];
                    if (obj10 == null || (obj10 instanceof android.os.WorkSource)) {
                        g1Var.f445788e = (android.os.WorkSource) obj10;
                        java.lang.Object obj11 = objArr[0];
                        if (obj11 instanceof java.lang.Integer) {
                            g1Var.f445785b = ((java.lang.Integer) obj11).intValue();
                            java.lang.Object obj12 = objArr[1];
                            if (obj12 instanceof android.os.IBinder) {
                                g1Var.f445784a = (android.os.IBinder) obj12;
                                g1Var2 = g1Var;
                            } else {
                                oj.j.f("Matrix.battery.PowerHooker", "createAcquireWakeLockArgs6 args idx 1 not IBinder, %s", obj12);
                            }
                        } else if (obj11 instanceof android.os.IBinder) {
                            g1Var.f445784a = (android.os.IBinder) obj11;
                            java.lang.Object obj13 = objArr[1];
                            if (obj13 instanceof java.lang.Integer) {
                                g1Var.f445785b = ((java.lang.Integer) obj13).intValue();
                                g1Var2 = g1Var;
                            } else {
                                oj.j.f("Matrix.battery.PowerHooker", "createAcquireWakeLockArgs4 args idx 1 not Integer, %s", obj13);
                            }
                        } else {
                            oj.j.f("Matrix.battery.PowerHooker", "createAcquireWakeLockArgs4 args idx 0 not IBinder an Integer, %s", obj11);
                        }
                    } else {
                        oj.j.f("Matrix.battery.PowerHooker", "createAcquireWakeLockArgs6 args idx 3 not WorkSource, %s", obj10);
                    }
                } else {
                    oj.j.f("Matrix.battery.PowerHooker", "createAcquireWakeLockArgs6 args idx 2 not String, %s", obj9);
                }
            }
        }
        if (g1Var2 == null) {
            oj.j.f("Matrix.battery.PowerHooker", "dispatchAcquireWakeLock AcquireWakeLockArgs null", new java.lang.Object[0]);
            return;
        }
        synchronized (wh.j1.class) {
            while (true) {
                java.util.List list2 = wh.j1.f445813a;
                if (i17 < ((java.util.ArrayList) list2).size()) {
                    ((rh.q3) ((wh.h1) ((java.util.ArrayList) list2).get(i17))).a(g1Var2.f445784a, g1Var2.f445785b, g1Var2.f445786c, g1Var2.f445787d, g1Var2.f445788e, g1Var2.f445789f);
                    i17++;
                }
            }
        }
    }
}
