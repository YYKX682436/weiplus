package z52;

/* loaded from: classes15.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f470239a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.ref.WeakReference f470240b = null;

    public static void a(java.lang.Object obj, r45.c16 c16Var, java.lang.String str, r45.c45 c45Var, long j17, boolean z17) {
        if (z17) {
            if (c16Var.f371220d.equals(str)) {
                e(obj, c16Var, c45Var.f371270d, j17, true);
            }
        } else if (c16Var.f371220d.equals(str)) {
            e(obj, c16Var, c45Var.f371270d, j17, false);
        }
    }

    public static void b(java.lang.Object obj, java.lang.String str, r45.c16 c16Var, java.lang.String str2, boolean z17) {
        nm5.b e17 = y52.b.e(str2, str);
        if (e17 == null) {
            return;
        }
        r45.jw3 jw3Var = (r45.jw3) e17.a(0);
        java.util.Iterator it = c16Var.f371221e.iterator();
        while (it.hasNext()) {
            r45.b45 b45Var = (r45.b45) it.next();
            if (b45Var != null) {
                z52.b.a(obj, b45Var, jw3Var, false, z17);
            }
        }
        y52.b.i(jw3Var, ((java.lang.Integer) e17.a(1)).intValue());
    }

    public static void c(java.lang.Object obj, java.lang.String str, r45.c16 c16Var, r45.c16 c16Var2, r45.c45 c45Var, boolean z17, r45.g16 g16Var) {
        java.lang.String str2;
        nm5.c c17 = h52.e.c(106);
        java.lang.String str3 = null;
        if (c17 == null) {
            r45.x1 a17 = ((h52.d) h52.c.a().f279039a).a();
            str2 = (a17 == null || a17.f389632p.equals("")) ? null : a17.f389632p;
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellhoundUtil", "FuzzyMatch._getPrePage by activityJumpSrc: %s", str2);
            if (str2 == null) {
                r45.y43 a18 = i52.f.a();
                if (a18 != null) {
                    str3 = a18.f390775d;
                }
                str2 = str3;
            }
        } else {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellhoundUtil", "FuzzyMatch._getPrePage by key_pause: %s, %b, %s", c17.a(0), c17.a(1), c17.a(2));
            if (((java.lang.Boolean) c17.a(1)).booleanValue()) {
                str2 = (java.lang.String) c17.a(2);
                if (str2 == null) {
                    r45.y43 a19 = i52.f.a();
                    if (a19 != null) {
                        str3 = a19.f390775d;
                    }
                    str2 = str3;
                }
            } else {
                str2 = (java.lang.String) c17.a(0);
                if (str2 == null) {
                    r45.y43 a27 = i52.f.a();
                    if (a27 != null) {
                        str3 = a27.f390775d;
                    }
                    str2 = str3;
                }
            }
        }
        if (c16Var2.f371220d.equals(str) && c16Var.f371220d.equals(str2)) {
            int i17 = g16Var.f374827i;
            if (i17 == 0) {
                b(obj, str, c16Var2, c45Var.f371270d, z17);
            } else if (i17 == 1) {
                a(obj, c16Var2, str, c45Var, g16Var.f374823e, z17);
            }
        }
    }

    public static void d(java.lang.Object obj, r45.c45 c45Var, boolean z17) {
        int i17;
        com.tencent.mm.plugin.expt.hellhound.ext.session.config.e.a().getClass();
        r45.d16 a17 = x52.e.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellPageParamsCatcher", "HellPageParamsCatcher, _doCatchOnActivity, config is NULL !!");
            return;
        }
        java.lang.String b17 = com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.b(c45Var.f371270d);
        if (com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.j(c45Var.f371270d)) {
            b17 = com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.e(c45Var);
        }
        java.lang.String str = b17;
        java.util.Iterator it = a17.f371993d.iterator();
        while (it.hasNext()) {
            r45.g16 g16Var = (r45.g16) it.next();
            if (g16Var != null && (g16Var.f374822d.equals(str) || "-1".equals(g16Var.f374822d))) {
                java.lang.String canonicalName = obj.getClass().getCanonicalName();
                java.util.LinkedList linkedList = g16Var.f374824f;
                int size = linkedList.size();
                if (size == 1) {
                    r45.c16 c16Var = (r45.c16) linkedList.get(0);
                    if (c16Var != null) {
                        java.lang.String canonicalName2 = obj.getClass().getCanonicalName();
                        int i18 = g16Var.f374827i;
                        if (i18 == 0) {
                            if (c16Var.f371220d.equals(canonicalName2)) {
                                b(obj, canonicalName2, c16Var, c45Var.f371270d, z17);
                            }
                        } else if (i18 == 1) {
                            a(obj, c16Var, canonicalName2, c45Var, g16Var.f374823e, z17);
                        }
                    }
                } else {
                    int i19 = 1;
                    while (true) {
                        if (i19 < size) {
                            r45.c16 c16Var2 = (r45.c16) linkedList.get(i19 - 1);
                            r45.c16 c16Var3 = (r45.c16) linkedList.get(i19);
                            if (c16Var2 == null || c16Var3 == null) {
                                i17 = i19;
                            } else {
                                int i27 = g16Var.f374827i;
                                if (i27 == 0) {
                                    i17 = i19;
                                    c(obj, canonicalName, c16Var2, c16Var3, c45Var, z17, g16Var);
                                } else {
                                    i17 = i19;
                                    if (i27 != 1) {
                                        continue;
                                    } else if (size == 2) {
                                        long j17 = g16Var.f374823e;
                                        if (z17) {
                                            if (c16Var3.f371220d.equals(canonicalName)) {
                                                e(obj, c16Var3, c45Var.f371270d, j17, true);
                                            } else if (c16Var2.f371220d.equals(canonicalName)) {
                                                e(obj, c16Var2, c45Var.f371270d, j17, true);
                                            }
                                        } else if (c16Var3.f371220d.equals(canonicalName)) {
                                            e(obj, c16Var3, c45Var.f371270d, j17, false);
                                        } else if (c16Var2.f371220d.equals(canonicalName)) {
                                            e(obj, c16Var2, c45Var.f371270d, j17, false);
                                        }
                                    } else {
                                        c(obj, canonicalName, c16Var2, c16Var3, c45Var, z17, g16Var);
                                    }
                                }
                            }
                            i19 = i17 + 1;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.Object r8, r45.c16 r9, java.lang.String r10, long r11, boolean r13) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z52.a.e(java.lang.Object, r45.c16, java.lang.String, long, boolean):void");
    }

    public static void f(int i17) {
        android.app.Activity activity;
        r45.c45 e17;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.HashMap) f470239a).get(java.lang.Integer.valueOf(i17));
        if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null || activity.isDestroyed() || (e17 = x52.c.e()) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellPageParamsCatcher", "catchOnActivityFinishAsync: %s", e17.f371270d);
        d(activity, e17, false);
    }

    public static void g(int i17) {
        android.app.Activity activity;
        r45.c45 e17;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.HashMap) f470239a).get(java.lang.Integer.valueOf(i17));
        if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null || activity.isDestroyed() || (e17 = x52.c.e()) == null) {
            return;
        }
        d(activity, e17, true);
    }
}
