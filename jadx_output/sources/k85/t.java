package k85;

/* loaded from: classes15.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final k85.t f305439a = new k85.t();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f305440b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f305441c = {"LauncherUI", "ComposeUI", "AlbumPreviewUI", "MultiStageCitySelectUI", "FinderPostUI"};

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f305442d = "MMKV_KEY_EXPT_PERMISSION_DIALOG";

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f305443e = com.tencent.mm.sdk.platformtools.o4.M("MMKV_KEY_EXPT_VALUE");

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f305444f;

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f305444f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExptChangeEvent>(a0Var) { // from class: com.tencent.mm.sensitive.ui.PermissionSwitchCheckUtil$listener$1
            {
                this.__eventId = -31521245;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExptChangeEvent exptChangeEvent) {
                com.tencent.mm.autogen.events.ExptChangeEvent event = exptChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                k85.t.f305439a.g();
                return false;
            }
        };
    }

    public static final void a(k85.t tVar, android.app.Activity activity, d85.g0 g0Var, d85.f0 f0Var, yz5.a aVar) {
        tVar.getClass();
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(activity);
        y1Var.i(false);
        android.view.View inflate = android.view.View.inflate(activity, com.tencent.mm.R.layout.c9f, null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) inflate;
        android.view.View findViewById = roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.f483313aa1);
        android.widget.TextView textView = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.f484050cu2);
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.obc)).getPaint(), 0.8f);
        if (f0Var != null) {
            d85.f0 f0Var2 = d85.f0.Q;
            d85.g0 g0Var2 = d85.g0.IMAGE_LOCATION_DATA;
            if (f0Var == f0Var2 && (g0Var == g0Var2 || g0Var == d85.g0.IMAGE_CONTENT_DATA)) {
                textView.setText(activity.getString(com.tencent.mm.R.string.lnz));
            } else if (f0Var == d85.f0.f227163n && g0Var == g0Var2) {
                textView.setText(activity.getString(com.tencent.mm.R.string.n1b));
            } else {
                java.lang.Object obj = e85.i.f250317c.get(g0Var.f227192d);
                java.lang.Object obj2 = e85.i.f250318d.get(f0Var.f227176d);
                if (obj != null && obj2 != null) {
                    textView.setText(activity.getString(com.tencent.mm.R.string.ivv, (java.lang.String) obj, (java.lang.String) obj2));
                }
            }
        } else {
            java.lang.String str = (java.lang.String) e85.i.f250317c.get(g0Var.f227192d);
            if (str != null) {
                textView.setText(activity.getString(com.tencent.mm.R.string.ivw, str));
            }
        }
        findViewById.setOnClickListener(new k85.m(y1Var));
        y1Var.f212037s = new k85.n(aVar);
        y1Var.k(roundedCornerFrameLayout);
        y1Var.d(true);
        y1Var.s();
    }

    public static boolean b(k85.t tVar, java.lang.String methodName, yz5.l lVar, int i17, java.lang.Object obj) {
        java.lang.String str;
        java.lang.String c17;
        d85.f0 f0Var;
        int i18;
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        tVar.getClass();
        kotlin.jvm.internal.o.g(methodName, "methodName");
        boolean z17 = false;
        if (!com.tencent.mm.sdk.platformtools.x2.j() && (str = (java.lang.String) d85.o0.f227229a.get(methodName)) != null && (c17 = com.tencent.mm.sensitive.business.BusinessStackRecorder.f193183f.c()) != null) {
            try {
            } catch (java.lang.IllegalArgumentException unused) {
            }
            try {
                for (d85.g0 g0Var : d85.g0.values()) {
                    if (!r26.i0.p(g0Var.f227192d, str, true)) {
                    }
                    break;
                }
                break;
                d85.f0[] values = d85.f0.values();
                int length = values.length;
                for (int i19 = 0; i19 < length; i19++) {
                    f0Var = values[i19];
                    if (r26.i0.p(f0Var.f227176d, c17, true)) {
                        break;
                    }
                }
            } catch (java.lang.IllegalArgumentException unused2) {
            }
            g0Var = null;
            f0Var = null;
            if (g0Var != null && f0Var != null) {
                k85.t tVar2 = f305439a;
                java.lang.Boolean e17 = tVar2.e(g0Var);
                if (e17 != null) {
                    java.lang.Boolean bool = true ^ e17.booleanValue() ? e17 : null;
                    if (bool != null) {
                        bool.booleanValue();
                    }
                }
                z17 = tVar2.d(g0Var, f0Var, lVar);
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.i("Kenneth-methodCall", "method:" + methodName + " return default value， asking permission:" + str + " in business:" + c17 + ",process:" + bm5.f1.a());
            }
        }
        return z17;
    }

    public final boolean c(android.app.Activity activity, d85.g0 permission, d85.f0 business, yz5.l lVar) {
        kotlin.jvm.internal.o.g(permission, "permission");
        kotlin.jvm.internal.o.g(business, "business");
        if (!f(permission, business)) {
            return false;
        }
        java.lang.Boolean e17 = e(permission);
        jz5.f0 f0Var = null;
        if (e17 != null) {
            if (!(!e17.booleanValue())) {
                e17 = null;
            }
            if (e17 != null) {
                e17.booleanValue();
                return false;
            }
        }
        j85.g.f298251a.c(permission, business, null);
        com.tencent.mm.sdk.platformtools.o4 Zi = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Zi(permission.f227192d);
        if (Zi != null) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(Zi.getBoolean(business.f227176d, !business.f227178f.booleanValue()));
            if (!(!valueOf.booleanValue())) {
                valueOf = null;
            }
            if (valueOf != null) {
                valueOf.booleanValue();
                k85.t tVar = f305439a;
                if (activity != null) {
                    tVar.i(activity, permission, business, lVar);
                    f0Var = jz5.f0.f302826a;
                }
                if (f0Var == null) {
                    pm0.v.V(0L, new k85.h(lVar, permission, business));
                }
                return true;
            }
        }
        return false;
    }

    public final boolean d(d85.g0 permission, d85.f0 business, yz5.l lVar) {
        e85.h hVar;
        java.util.HashMap hashMap;
        e85.g gVar;
        java.util.List list;
        kotlin.jvm.internal.o.g(permission, "permission");
        kotlin.jvm.internal.o.g(business, "business");
        if (!f(permission, business)) {
            com.tencent.mars.xlog.Log.i("PermissionSwitchCheckUtil", "[checkManually] 2");
            return false;
        }
        java.lang.Boolean e17 = e(permission);
        jz5.f0 f0Var = null;
        if (e17 != null) {
            if (!(!e17.booleanValue())) {
                e17 = null;
            }
            if (e17 != null) {
                e17.booleanValue();
                com.tencent.mars.xlog.Log.i("PermissionSwitchCheckUtil", "[checkManually] 3");
                return false;
            }
        }
        j85.g.f298251a.c(permission, business, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkManually] permission:");
        java.lang.String str = permission.f227192d;
        sb6.append(str);
        sb6.append(", business:");
        java.lang.String str2 = business.f227176d;
        sb6.append(str2);
        sb6.append(", value:");
        com.tencent.mm.sdk.platformtools.o4 Zi = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Zi(str);
        java.lang.Boolean bool = business.f227178f;
        sb6.append(Zi != null ? java.lang.Boolean.valueOf(Zi.getBoolean(str2, !bool.booleanValue())) : null);
        com.tencent.mars.xlog.Log.i("PermissionSwitchCheckUtil", sb6.toString());
        com.tencent.mm.sdk.platformtools.o4 Zi2 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Zi(str);
        if (Zi2 != null) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(Zi2.getBoolean(str2, !bool.booleanValue()));
            if (!(!valueOf.booleanValue())) {
                valueOf = null;
            }
            if (valueOf != null) {
                valueOf.booleanValue();
                com.tencent.mars.xlog.Log.i("PermissionSwitchCheckUtil", "[checkManually] 5");
                e85.b bVar = com.tencent.mm.sensitive.business.BusinessStackRecorder.f193183f;
                e85.c cVar = (e85.c) kz5.n0.k0(com.tencent.mm.sensitive.business.BusinessStackRecorder.f193186i);
                java.lang.String str3 = cVar != null ? cVar.f250299b : null;
                java.lang.Boolean valueOf2 = (str3 == null || (hVar = (e85.h) e85.i.f250315a.get(permission)) == null || (hashMap = hVar.f250314c) == null || (gVar = (e85.g) hashMap.get(business)) == null || (list = gVar.f250311d) == null) ? null : java.lang.Boolean.valueOf(list.contains(str3));
                if (valueOf2 != null && !kotlin.jvm.internal.o.b(valueOf2, java.lang.Boolean.FALSE)) {
                    return true;
                }
                java.lang.ref.WeakReference i17 = com.tencent.mm.app.w.INSTANCE.i();
                android.app.Activity activity = i17 != null ? (android.app.Activity) i17.get() : null;
                k85.t tVar = f305439a;
                if (activity != null) {
                    tVar.i(activity, permission, business, lVar);
                    f0Var = jz5.f0.f302826a;
                }
                if (f0Var == null) {
                    pm0.v.V(0L, new k85.h(lVar, permission, business));
                }
                return true;
            }
        }
        com.tencent.mars.xlog.Log.i("PermissionSwitchCheckUtil", "[checkManually] 4");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
    
        if (r7 == 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean e(d85.g0 r10) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k85.t.e(d85.g0):java.lang.Boolean");
    }

    public final boolean f(d85.g0 g0Var, d85.f0 f0Var) {
        java.util.HashMap hashMap;
        e85.g gVar;
        java.util.HashMap hashMap2 = e85.i.f250315a;
        e85.h hVar = (e85.h) e85.i.f250315a.get(g0Var);
        if (hVar == null || (hashMap = hVar.f250314c) == null || (gVar = (e85.g) hashMap.get(f0Var)) == null) {
            return false;
        }
        return gVar.f250310c;
    }

    public final void g() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = f305443e;
        java.lang.String str = f305442d;
        o4Var.putBoolean(str, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_use_new_permission_dialog, !o4Var.getBoolean(str, true) ? 1 : 0) == 0);
    }

    public final jz5.l h(android.app.Activity activity, d85.g0 permission, d85.f0 business, yz5.l lVar, yz5.l lVar2, java.lang.String str) {
        java.lang.String string;
        java.lang.String str2;
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(permission, "permission");
        kotlin.jvm.internal.o.g(business, "business");
        java.util.HashMap hashMap = f305440b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(activity);
        sb6.append('_');
        java.lang.String permission2 = permission.f227192d;
        sb6.append(permission2);
        jz5.l lVar3 = (jz5.l) hashMap.get(sb6.toString());
        if (lVar3 != null && ((java.lang.Boolean) lVar3.f302833d).booleanValue()) {
            com.tencent.mars.xlog.Log.i("PermissionSwitchCheckUtil", "[showBusinessPermissionDialogUI] false case showing");
            if (lVar != null) {
                jz5.l lVar4 = (jz5.l) hashMap.get(activity + '_' + permission2);
                if (lVar4 != null && (linkedList = (java.util.LinkedList) lVar4.f302834e) != null) {
                    linkedList.add(lVar);
                }
            }
            return new jz5.l(java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
        }
        java.lang.String str3 = activity + '_' + permission2;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (lVar != null) {
            linkedList2.add(lVar);
        }
        hashMap.put(str3, new jz5.l(bool, linkedList2));
        com.tencent.mars.xlog.Log.i("PermissionSwitchCheckUtil", "[showBusinessPermissionDialogUI] show on " + activity + ", permission:" + permission + ", business:" + business);
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(activity);
        y1Var.i(false);
        android.view.View inflate = android.view.View.inflate(activity, com.tencent.mm.R.layout.c9a, null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) inflate;
        roundedCornerFrameLayout.b((float) com.tencent.mm.ui.zk.a(activity, 12), (float) com.tencent.mm.ui.zk.a(activity, 12), 0.0f, 0.0f);
        d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.ktf);
        android.widget.TextView textView = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.cui);
        android.widget.TextView textView2 = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.obc);
        android.view.View findViewById = roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.bys);
        android.view.View findViewById2 = roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.h1x);
        d85.d1 d1Var = (d85.d1) m0Var;
        java.lang.Integer cj6 = d1Var.cj(permission2);
        kotlin.jvm.internal.o.f(cj6, "getPermissionIcon(...)");
        weImageView.setImageResource(cj6.intValue());
        java.lang.String business2 = business.f227176d;
        if (str != null) {
            string = str;
        } else {
            kotlin.jvm.internal.o.g(permission2, "permission");
            kotlin.jvm.internal.o.g(business2, "business");
            java.lang.String str4 = (java.lang.String) e85.i.f250317c.get(permission2);
            java.lang.String str5 = (java.lang.String) e85.i.f250318d.get(business2);
            if (d1Var.nj(permission2, business2) && kotlin.jvm.internal.o.b(permission2, d85.g0.LOCAION.f227192d)) {
                if (str5 != null) {
                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.iuy, str5);
                }
                string = null;
            } else {
                if (str4 != null && str5 != null) {
                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.iux, str5, str4);
                }
                string = null;
            }
        }
        textView2.setText(string);
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        android.util.Pair Vi = d1Var.Vi(permission2, business2);
        if (Vi != null) {
            java.lang.Object obj = Vi.first;
            java.lang.Integer num = (java.lang.Integer) obj;
            java.lang.Integer num2 = (java.lang.Integer) (num == null || num.intValue() != -1 ? obj : null);
            if (num2 == null || (str2 = activity.getString(num2.intValue())) == null) {
                str2 = "";
            }
            textView.setText(str2);
        }
        android.widget.TextView textView3 = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.b5i);
        android.widget.TextView textView4 = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.khs);
        com.tencent.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(textView4.getPaint(), 0.8f);
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        findViewById2.setOnClickListener(new k85.c(lVar2, c0Var, y1Var, activity, permission, business, lVar, str));
        findViewById.setOnClickListener(new k85.d(activity, permission, business, lVar2, y1Var));
        textView3.setOnClickListener(new k85.e(activity, permission, business, lVar2, y1Var));
        kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
        textView4.setOnClickListener(new k85.f(activity, permission, business, lVar2, c0Var2, y1Var));
        y1Var.k(roundedCornerFrameLayout);
        y1Var.f212037s = new k85.g(c0Var, activity, permission, c0Var2);
        y1Var.d(true);
        y1Var.s();
        return new jz5.l(bool, bool);
    }

    public final void i(android.app.Activity topActivity, d85.g0 permission, d85.f0 business, yz5.l lVar) {
        kotlin.jvm.internal.o.g(topActivity, "topActivity");
        kotlin.jvm.internal.o.g(permission, "permission");
        kotlin.jvm.internal.o.g(business, "business");
        pm0.v.X(new k85.l(topActivity, permission, business, lVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x011f, code lost:
    
        if (r2 == null) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(android.app.Activity r20, d85.g0 r21, d85.f0 r22, yz5.l r23) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k85.t.j(android.app.Activity, d85.g0, d85.f0, yz5.l):void");
    }
}
