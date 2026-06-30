package v52;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: q, reason: collision with root package name */
    public static v52.c f433304q;

    /* renamed from: i, reason: collision with root package name */
    public v52.b f433313i;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f433307c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f433308d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f433309e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f433310f = false;

    /* renamed from: g, reason: collision with root package name */
    public int f433311g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f433312h = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f433314j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f433315k = -1;

    /* renamed from: l, reason: collision with root package name */
    public long f433316l = -1;

    /* renamed from: m, reason: collision with root package name */
    public boolean f433317m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f433318n = false;

    /* renamed from: o, reason: collision with root package name */
    public r45.c45 f433319o = null;

    /* renamed from: p, reason: collision with root package name */
    public r45.c45 f433320p = null;

    /* renamed from: a, reason: collision with root package name */
    public final c62.c f433305a = new c62.c();

    /* renamed from: b, reason: collision with root package name */
    public final c62.g f433306b = new c62.g();

    public c() {
        if (b52.b.m()) {
            x52.i.e();
        }
    }

    public static v52.c g() {
        if (f433304q == null) {
            synchronized (v52.c.class) {
                if (f433304q == null) {
                    f433304q = new v52.c();
                }
            }
        }
        return f433304q;
    }

    public static void o(java.lang.String str, long j17) {
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "notify session close [%s] [%d]", str, java.lang.Long.valueOf(j17));
        com.tencent.mm.autogen.events.SessionChangeEvent sessionChangeEvent = new com.tencent.mm.autogen.events.SessionChangeEvent();
        am.rt rtVar = sessionChangeEvent.f54757g;
        rtVar.f7840a = str;
        rtVar.f7841b = j17;
        rtVar.f7842c = 1;
        sessionChangeEvent.e();
    }

    public static void p(java.lang.String str, long j17) {
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "notify session start [%s] [%d]", str, java.lang.Long.valueOf(j17));
        com.tencent.mm.autogen.events.SessionChangeEvent sessionChangeEvent = new com.tencent.mm.autogen.events.SessionChangeEvent();
        am.rt rtVar = sessionChangeEvent.f54757g;
        rtVar.f7840a = str;
        rtVar.f7841b = j17;
        rtVar.f7842c = 0;
        sessionChangeEvent.e();
    }

    public static void x(r45.c45 c45Var) {
        int i17;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = c45Var == null ? "NULL" : c45Var.f371270d;
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "HellSessionMonitor, report: %s", objArr);
        r45.lw3 h17 = x52.c.h();
        if (h17 == null) {
            return;
        }
        r45.iw3 a17 = y52.a.a();
        com.tencent.mm.plugin.expt.hellhound.ext.session.config.b bVar = com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99783a;
        java.util.LinkedList sessions = h17.f379878f;
        kotlin.jvm.internal.o.f(sessions, "sessions");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : sessions) {
            r45.c45 c45Var2 = (r45.c45) obj;
            java.lang.String sessionId = c45Var2.f371270d;
            kotlin.jvm.internal.o.f(sessionId, "sessionId");
            if (kotlin.jvm.internal.o.b(bVar.a(sessionId), "999") && ((i17 = c45Var2.f371274h) == 0 || i17 == 1 || i17 == 2 || i17 == 4 || i17 == 5)) {
                arrayList.add(obj);
            }
        }
        java.util.List<r45.c45> S0 = kz5.n0.S0(arrayList);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellKSessionConfig", "after, sessionList.size: " + S0.size());
        java.lang.String str = null;
        for (r45.c45 c45Var3 : S0) {
            nm5.b l17 = bVar.l(c45Var3.f371270d);
            if (l17 != null) {
                str = "_" + l17.a(1);
            }
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellKSessionConfig", "handleChatting, session, Start: " + c45Var3.f371270d + ", " + str);
            java.lang.String d17 = bVar.d(c45Var3.f371274h);
            c45Var3.f371270d = d17;
            if (!kotlin.jvm.internal.o.b(d17, "-1")) {
                c45Var3.f371270d += str;
            }
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellKSessionConfig", "handleChatting, session, End: " + c45Var3.f371270d);
        }
        if (!h17.f379880h.isEmpty() || !sessions.isEmpty()) {
            java.util.LinkedList linkedList = a17.f377354d;
            if (!linkedList.isEmpty()) {
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionReport", "reportWhenEvent8 BEGIN !!");
                a62.h.i(a17, h17, false);
                a62.h.a(h17, (r45.jw3) linkedList.getFirst());
                a62.h.d(h17, a17, c45Var);
            }
        }
        r45.lw3 h18 = x52.c.h();
        if (h18 != null) {
            h18.f379883n = 0L;
            x52.c.k(h18);
        }
        y52.b.g();
    }

    public static void y(r45.c45 c45Var, java.lang.String str) {
        android.view.View view;
        if (c45Var == null) {
            return;
        }
        if (c45Var.f371270d.startsWith("142")) {
            if (str == null || b52.b.k(str)) {
                try {
                    androidx.fragment.app.Fragment f17 = i52.l.f(b52.b.f(), "com.tencent.mm.ui.MoreTabUI");
                    int i17 = com.tencent.mm.ui.MoreTabUI.B1;
                    java.lang.reflect.Field declaredField = com.tencent.mm.ui.MoreTabUI.class.getDeclaredField("storyGallery");
                    declaredField.setAccessible(true);
                    java.lang.Object obj = declaredField.get(f17);
                    int i18 = com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView.f172085l1;
                    java.lang.reflect.Field declaredField2 = com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView.class.getDeclaredField("holderView");
                    declaredField2.setAccessible(true);
                    view = (android.view.View) declaredField2.get(obj);
                } catch (java.lang.Exception unused) {
                    view = null;
                }
                if (view == null) {
                    com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentMonitor", "isStoryGalleryShow = NULL");
                } else {
                    r0 = view.getVisibility() != 0;
                    com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentMonitor", "isStoryGalleryShow: %b", java.lang.Boolean.valueOf(r0));
                }
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "retainCurSession, 142: isActive: %b", java.lang.Boolean.valueOf(r0));
                if (!r0) {
                    return;
                }
            } else {
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "retainCurSession, 142: isStoryGalleryViewShow: FALSE");
            }
        }
        r45.lw3 lw3Var = new r45.lw3();
        r45.c45 c45Var2 = new r45.c45();
        com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.a(c45Var);
        c45Var2.f371270d = c45Var.f371270d;
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "retainCurSession, curSession.session: %s", c45Var.f371270d);
        c45Var2.f371279p = true;
        c45Var2.f371282s = 1;
        c45Var2.f371283t = c45Var.f371283t;
        c45Var2.f371273g = c45Var.f371273g;
        c45Var2.f371274h = c45Var.f371274h;
        c45Var2.f371280q = c45Var.f371280q;
        c45Var2.f371277n = c45Var.f371277n;
        c45Var2.f371278o = c45Var.f371278o;
        c45Var2.f371271e = x52.c.d();
        java.util.LinkedList linkedList = lw3Var.f379878f;
        linkedList.addLast(c45Var2);
        lw3Var.f379879g = linkedList.size() - 1;
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "retainCurSession.session: %s, %s", c45Var2.f371270d, c45Var2.f371273g);
        x52.c.i(lw3Var);
    }

    public void a(android.app.Activity activity, int i17) {
        if (com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.c()) {
            com.tencent.mars.xlog.Log.w("HABBYGE-MALI.HellSessionMonitor", "HellSessionMonitor, catchParamsOnActivityAsync: FALSE");
            return;
        }
        if (activity == null) {
            java.util.Map map = z52.a.f470239a;
        } else {
            java.util.Map map2 = z52.a.f470239a;
            if (i17 == 0) {
                int hashCode = activity.hashCode();
                java.util.HashMap hashMap = (java.util.HashMap) map2;
                if (hashMap.containsKey(java.lang.Integer.valueOf(hashCode))) {
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) hashMap.get(java.lang.Integer.valueOf(hashCode));
                    if (weakReference == null || weakReference.get() == null) {
                        hashMap.remove(java.lang.Integer.valueOf(hashCode));
                        hashMap.put(java.lang.Integer.valueOf(hashCode), new java.lang.ref.WeakReference(activity));
                    }
                } else {
                    hashMap.put(java.lang.Integer.valueOf(hashCode), new java.lang.ref.WeakReference(activity));
                }
                d52.d.a().d(400, java.lang.Integer.valueOf(hashCode));
            } else if (i17 == 2) {
                int hashCode2 = activity.hashCode();
                java.util.HashMap hashMap2 = (java.util.HashMap) map2;
                if (hashMap2.containsKey(java.lang.Integer.valueOf(hashCode2))) {
                    java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) hashMap2.get(java.lang.Integer.valueOf(hashCode2));
                    if (weakReference2 == null || weakReference2.get() == null) {
                        hashMap2.remove(java.lang.Integer.valueOf(hashCode2));
                        hashMap2.put(java.lang.Integer.valueOf(hashCode2), new java.lang.ref.WeakReference(activity));
                    }
                } else {
                    hashMap2.put(java.lang.Integer.valueOf(hashCode2), new java.lang.ref.WeakReference(activity));
                }
                d52.d.a().d(401, java.lang.Integer.valueOf(hashCode2));
            }
        }
        java.util.Map map3 = z52.c.f470241a;
        if (activity == null) {
            return;
        }
        if (i17 == 0) {
            synchronized (z52.c.class) {
                int hashCode3 = activity.hashCode();
                java.util.Map map4 = z52.c.f470241a;
                if (((java.util.HashMap) map4).containsKey(java.lang.Integer.valueOf(hashCode3))) {
                    java.lang.ref.WeakReference weakReference3 = (java.lang.ref.WeakReference) ((java.util.HashMap) map4).get(java.lang.Integer.valueOf(hashCode3));
                    if (weakReference3 == null || weakReference3.get() == null) {
                        ((java.util.HashMap) map4).remove(java.lang.Integer.valueOf(hashCode3));
                        java.util.HashMap hashMap3 = (java.util.HashMap) map4;
                        hashMap3.put(java.lang.Integer.valueOf(hashCode3), new java.lang.ref.WeakReference(activity));
                    }
                } else {
                    java.util.HashMap hashMap4 = (java.util.HashMap) map4;
                    hashMap4.put(java.lang.Integer.valueOf(hashCode3), new java.lang.ref.WeakReference(activity));
                }
                d52.d.a().d(402, java.lang.Integer.valueOf(hashCode3));
            }
            return;
        }
        if (i17 != 2) {
            return;
        }
        synchronized (z52.c.class) {
            int hashCode4 = activity.hashCode();
            java.util.Map map5 = z52.c.f470241a;
            if (((java.util.HashMap) map5).containsKey(java.lang.Integer.valueOf(hashCode4))) {
                java.lang.ref.WeakReference weakReference4 = (java.lang.ref.WeakReference) ((java.util.HashMap) map5).get(java.lang.Integer.valueOf(hashCode4));
                if (weakReference4 == null || weakReference4.get() == null) {
                    ((java.util.HashMap) map5).remove(java.lang.Integer.valueOf(hashCode4));
                    java.util.HashMap hashMap5 = (java.util.HashMap) map5;
                    hashMap5.put(java.lang.Integer.valueOf(hashCode4), new java.lang.ref.WeakReference(activity));
                }
            } else {
                java.util.HashMap hashMap6 = (java.util.HashMap) map5;
                hashMap6.put(java.lang.Integer.valueOf(hashCode4), new java.lang.ref.WeakReference(activity));
            }
            d52.d.a().d(403, java.lang.Integer.valueOf(hashCode4));
        }
    }

    public void b(androidx.fragment.app.Fragment fragment, int i17) {
        r45.c45 e17;
        r45.c45 e18;
        if (com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.c()) {
            com.tencent.mars.xlog.Log.w("HABBYGE-MALI.HellSessionMonitor", "HellSessionMonitor, catchParamsOnFragment: FALSE");
            return;
        }
        java.util.Map map = z52.a.f470239a;
        if (fragment != null) {
            if (i17 == 0) {
                r45.c45 e19 = x52.c.e();
                if (e19 != null) {
                    z52.a.d(fragment, e19, true);
                }
            } else if (i17 == 2 && (e18 = x52.c.e()) != null) {
                z52.a.d(fragment, e18, false);
            }
        }
        java.util.Map map2 = z52.c.f470241a;
        if (fragment == null) {
            return;
        }
        if (i17 != 0) {
            if (i17 == 2 && (e17 = x52.c.e()) != null) {
                z52.c.a(fragment, e17, false);
                return;
            }
            return;
        }
        r45.c45 e27 = x52.c.e();
        if (e27 != null) {
            z52.c.a(fragment, e27, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.String r19, int r20, long r21, int r23) {
        /*
            Method dump skipped, instructions count: 1537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v52.c.c(java.lang.String, int, long, int):void");
    }

    public java.lang.String d() {
        if (!a52.a.b() || !a52.a.c() || b52.b.h() == 0) {
            return "-1";
        }
        r45.c45 e17 = x52.c.e();
        if (e17 != null) {
            return e17.f371270d;
        }
        java.lang.String str = this.f433307c;
        return str == null ? "-2" : str;
    }

    public java.lang.String e() {
        r45.c45 e17 = x52.c.e();
        if (e17 != null) {
            return com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.j(e17.f371270d) ? com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.e(e17) : com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.b(e17.f371270d);
        }
        java.lang.String str = this.f433307c;
        java.lang.String b17 = str != null ? com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.b(str) : null;
        return android.text.TextUtils.isEmpty(b17) ? "-2" : b17;
    }

    public final java.lang.String f(java.lang.String str, r45.c45 c45Var) {
        if (!r52.a.d(c45Var.f371281r) && !r52.a.a(c45Var.f371281r)) {
            return null;
        }
        if (!b52.b.i(str)) {
            boolean z17 = false;
            if (!android.text.TextUtils.isEmpty(str) && (java.util.regex.Pattern.matches("^(AppBrandUIMoveTaskToBackStubUI)[0-9]*$", str) || java.util.regex.Pattern.matches("AppBrandUIMoveTaskToBackStubUIMM", str))) {
                z17 = true;
            }
            if (!z17) {
                return null;
            }
        }
        nm5.b l17 = com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99783a.l(c45Var.f371270d);
        java.lang.String str2 = com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99785c;
        if (l17 == null || u46.l.e(str2)) {
            return null;
        }
        return str2 + "_" + ((java.lang.String) l17.a(1));
    }

    public final android.util.Pair h(r45.c45 c45Var, r45.c45 c45Var2, r45.lw3 lw3Var) {
        int size = lw3Var.f379880h.size();
        java.util.LinkedList linkedList = lw3Var.f379880h;
        if (c45Var == null && c45Var2 == null) {
            if (size <= 0) {
                return null;
            }
            if (size < 2) {
                r45.w35 w35Var = (r45.w35) linkedList.getLast();
                return android.util.Pair.create(w35Var.f388848m + "_" + w35Var.f388845g, null);
            }
            if (size == 2) {
                r45.w35 w35Var2 = (r45.w35) linkedList.getLast();
                r45.w35 w35Var3 = (r45.w35) linkedList.get(0);
                return android.util.Pair.create(w35Var2.f388848m + "_" + w35Var2.f388845g, w35Var3.f388848m + "_" + w35Var3.f388845g);
            }
            r45.w35 w35Var4 = (r45.w35) linkedList.getLast();
            int i17 = size - 2;
            for (int i18 = i17; i18 >= 0; i18--) {
                r45.w35 w35Var5 = (r45.w35) linkedList.get(i18);
                if (!w35Var4.f388848m.equals(w35Var5.f388848m)) {
                    return android.util.Pair.create(w35Var4.f388848m + "_" + w35Var4.f388845g, w35Var5.f388848m + "_" + w35Var5.f388845g);
                }
            }
            r45.w35 w35Var6 = (r45.w35) linkedList.get(i17);
            return android.util.Pair.create(w35Var4.f388848m + "_" + w35Var4.f388845g, w35Var6.f388848m + "_" + w35Var6.f388845g);
        }
        if (c45Var == null || c45Var2 != null) {
            if (c45Var == null) {
                return null;
            }
            if (size <= 0) {
                return android.util.Pair.create(c45Var.f371270d, c45Var2.f371270d);
            }
            if (size < 2) {
                r45.w35 w35Var7 = (r45.w35) linkedList.getLast();
                long j17 = w35Var7.f388845g;
                if (j17 > c45Var.f371275i) {
                    return android.util.Pair.create(w35Var7.f388848m + "_" + w35Var7.f388845g, c45Var.f371270d);
                }
                if (j17 <= c45Var2.f371275i) {
                    return android.util.Pair.create(c45Var.f371270d, c45Var2.f371270d);
                }
                return android.util.Pair.create(c45Var.f371270d, w35Var7.f388848m + "_" + w35Var7.f388845g);
            }
            r45.w35 w35Var8 = (r45.w35) linkedList.getLast();
            r45.w35 w35Var9 = (r45.w35) linkedList.get(size - 2);
            long j18 = w35Var8.f388845g;
            long j19 = c45Var.f371275i;
            if (j18 <= j19) {
                if (j18 <= c45Var2.f371275i) {
                    return android.util.Pair.create(c45Var.f371270d, c45Var2.f371270d);
                }
                return android.util.Pair.create(c45Var.f371270d, w35Var8.f388848m + "_" + w35Var8.f388845g);
            }
            if (j19 >= w35Var9.f388845g) {
                return android.util.Pair.create(w35Var8.f388848m + "_" + w35Var8.f388845g, c45Var.f371270d);
            }
            return android.util.Pair.create(w35Var8.f388848m + "_" + w35Var8.f388845g, w35Var9.f388848m + "_" + w35Var9.f388845g);
        }
        if (size <= 0) {
            return android.util.Pair.create(c45Var.f371270d, null);
        }
        if (size < 2) {
            r45.w35 w35Var10 = (r45.w35) linkedList.getLast();
            if (w35Var10.f388845g > c45Var.f371275i) {
                return android.util.Pair.create(w35Var10.f388848m + "_" + w35Var10.f388845g, c45Var.f371270d);
            }
            return android.util.Pair.create(c45Var.f371270d, w35Var10.f388848m + "_" + w35Var10.f388845g);
        }
        if (size == 2) {
            r45.w35 w35Var11 = (r45.w35) linkedList.getLast();
            r45.w35 w35Var12 = (r45.w35) linkedList.get(size - 2);
            long j27 = w35Var11.f388845g;
            long j28 = c45Var.f371275i;
            if (j27 <= j28) {
                return android.util.Pair.create(c45Var.f371270d, w35Var11.f388848m + "_" + w35Var11.f388845g);
            }
            if (w35Var12.f388845g <= j28) {
                return android.util.Pair.create(w35Var11.f388848m + "_" + w35Var11.f388845g, c45Var.f371270d);
            }
            return android.util.Pair.create(w35Var11.f388848m + "_" + w35Var11.f388845g, w35Var12.f388848m + "_" + w35Var12.f388845g);
        }
        r45.w35 w35Var13 = (r45.w35) linkedList.getLast();
        if (w35Var13.f388845g <= c45Var.f371275i) {
            return android.util.Pair.create(c45Var.f371270d, w35Var13.f388848m + "_" + w35Var13.f388845g);
        }
        int i19 = size - 2;
        r45.w35 w35Var14 = (r45.w35) linkedList.get(i19);
        if (w35Var14.f388845g <= c45Var.f371275i) {
            return android.util.Pair.create(w35Var13.f388848m + "_" + w35Var13.f388845g, c45Var.f371270d);
        }
        if (!w35Var13.f388848m.equals(w35Var14.f388848m)) {
            return android.util.Pair.create(w35Var13.f388848m + "_" + w35Var13.f388845g, w35Var14.f388848m + "_" + w35Var14.f388845g);
        }
        while (i19 >= 0) {
            r45.w35 w35Var15 = (r45.w35) linkedList.get(i19);
            if (!w35Var15.f388848m.equals(w35Var13.f388848m)) {
                if (w35Var15.f388845g <= c45Var.f371275i) {
                    return android.util.Pair.create(w35Var13.f388848m + "_" + w35Var13.f388845g, c45Var.f371270d);
                }
                return android.util.Pair.create(w35Var13.f388848m + "_" + w35Var13.f388845g, w35Var15.f388848m + "_" + w35Var15.f388845g);
            }
            if (w35Var15.f388845g <= c45Var.f371275i) {
                return android.util.Pair.create(w35Var13.f388848m + "_" + w35Var13.f388845g, c45Var.f371270d);
            }
            i19--;
        }
        return android.util.Pair.create(w35Var13.f388848m + "_" + w35Var13.f388845g, c45Var.f371270d);
    }

    public final boolean i(java.lang.String str, int i17) {
        v52.b bVar;
        if (com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99788f == null) {
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99788f = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_hell_finder_report_open_fix_session_id, false));
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellKSessionConfig", "open fix 19943 isOpenFixSessionId = [" + com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99788f + ']');
        }
        java.lang.Boolean bool = com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99788f;
        if (!(bool != null ? bool.booleanValue() : false) || (bVar = this.f433313i) == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "check FakeOn8Event last8EventPage %s, %d, cur 7eventPage %s  %d, %b", bVar.f433302b, java.lang.Integer.valueOf(bVar.f433303c), str, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f433313i.f433301a));
        if (this.f433313i.f433301a) {
            return (kotlin.jvm.internal.o.b("FinderChattingUI", str) || kotlin.jvm.internal.o.b("com.tencent.mm.ui.chatting.variants.FinderChattingUI", str)) && this.f433313i.f433303c != i17;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:216:0x04a3, code lost:
    
        if ((!android.text.TextUtils.isEmpty(r2) && (java.util.regex.Pattern.matches("^(AppBrandUIMoveTaskToBackStubUI)[0-9]*$", r2) || java.util.regex.Pattern.matches("AppBrandUIMoveTaskToBackStubUIMM", r2))) != false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0681, code lost:
    
        if ("148".equals(r5) != false) goto L326;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0958  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(android.app.Activity r22, r45.b2 r23, int r24, r45.b2 r25) {
        /*
            Method dump skipped, instructions count: 2425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v52.c.j(android.app.Activity, r45.b2, int, r45.b2):void");
    }

    public final void k(int i17, r45.b2 b2Var, long j17) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "monitorChatUIFragment: %d", java.lang.Integer.valueOf(i17));
        if (i17 != 6) {
            if (i17 == 7) {
                r45.c45 e17 = x52.c.e();
                if (e17 == null) {
                    com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionClose, curSession不合法");
                    return;
                }
                nm5.b c17 = v52.a.c();
                java.lang.String str = (java.lang.String) c17.a(0);
                int intValue = ((java.lang.Integer) c17.a(1)).intValue();
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionClose: %s, %d", str, java.lang.Integer.valueOf(intValue));
                int i18 = e17.f371274h;
                if (intValue != i18) {
                    com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionClose, != %d", java.lang.Integer.valueOf(i18));
                    return;
                } else {
                    com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionClose, ==");
                    s(e17, j17);
                    return;
                }
            }
            return;
        }
        androidx.fragment.app.FragmentActivity f17 = b52.b.f();
        androidx.fragment.app.Fragment f18 = f17 == null ? null : i52.l.f(f17, "com.tencent.mm.ui.chatting.ChattingUIFragment");
        int hashCode = f18 == null ? 0 : f18.hashCode();
        r45.c45 e18 = x52.c.e();
        if (e18 == null) {
            java.lang.String g17 = b2Var != null ? b52.b.g(b2Var.f370438h) : null;
            e18 = n(null, g17, "ChattingUIFragment", hashCode, j17);
            if (e18 == null) {
                com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionStart, curSession == null");
                return;
            } else {
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionStart, lastPage: %s", g17);
                z17 = true;
            }
        } else {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionStart new Session: %s", java.lang.Long.valueOf(j17));
            androidx.fragment.app.Fragment f19 = i52.l.f(b52.b.f(), "com.tencent.mm.ui.chatting.ChattingUIFragment");
            y52.b.b(e18, "com.tencent.mm.ui.chatting.ChattingUIFragment", f19 == null ? 0 : f19.hashCode(), j17);
            e18.f371282s = 0;
            java.lang.String b17 = x52.m.b();
            if (b17 == null) {
                b17 = "";
            }
            e18.f371285v = b17;
            x52.c.a(e18);
            u(e18);
            return;
        }
        if (b62.b.a(e18.f371270d)) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionStart, NOT, sessionId: %s", e18.f371270d);
            androidx.fragment.app.Fragment f27 = i52.l.f(b52.b.f(), "com.tencent.mm.ui.chatting.ChattingUIFragment");
            y52.b.b(e18, "com.tencent.mm.ui.chatting.ChattingUIFragment", f27 != null ? f27.hashCode() : 0, j17);
            return;
        }
        nm5.b c18 = v52.a.c();
        java.lang.String str2 = (java.lang.String) c18.a(0);
        int intValue2 = ((java.lang.Integer) c18.a(1)).intValue();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionStart: %s, %d", str2, java.lang.Integer.valueOf(intValue2));
        if (intValue2 == e18.f371274h) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionStart, curChatType == chatType");
            if (this.f433314j == 7) {
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionStart, 7-Event");
                return;
            }
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionStart, 7-Event-NOT");
            androidx.fragment.app.Fragment f28 = i52.l.f(b52.b.f(), "com.tencent.mm.ui.chatting.ChattingUIFragment");
            y52.b.b(e18, "com.tencent.mm.ui.chatting.ChattingUIFragment", f28 != null ? f28.hashCode() : 0, j17);
            return;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionStart, curChatType!=chatType: %d, %d", java.lang.Integer.valueOf(intValue2), java.lang.Integer.valueOf(e18.f371274h));
        s(e18, j17);
        r45.c45 n17 = n(null, "MainUI", "ChattingUIFragment", hashCode, j17);
        if (n17 != null) {
            androidx.fragment.app.Fragment f29 = i52.l.f(b52.b.f(), "com.tencent.mm.ui.chatting.ChattingUIFragment");
            y52.b.b(n17, "com.tencent.mm.ui.chatting.ChattingUIFragment", f29 == null ? 0 : f29.hashCode(), j17);
            n17.f371282s = 0;
            java.lang.String b18 = x52.m.b();
            if (b18 == null) {
                b18 = "";
            }
            n17.f371285v = b18;
            x52.c.a(n17);
            u(n17);
        }
    }

    public void l(int i17, int i18, long j17) {
        r45.bn6 bn6Var;
        if (com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.c()) {
            com.tencent.mars.xlog.Log.w("HABBYGE-MALI.HellSessionMonitor", "HellSessionMonitor, monitorStorySession: FALSE");
            return;
        }
        boolean z17 = true;
        if (i17 != 8) {
            if (i17 != 9) {
                return;
            }
            if (i18 != 1) {
                if (i18 != 3) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "monitorStoryGallery: OUT, FROM_PAUSE Event-8, !!");
                r45.b2 e17 = f52.c.b().e();
                if (e17 == null || (bn6Var = e17.f370434d) == null) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "monitorStoryGalleryViewSession, topActivity: %s", b52.b.g(bn6Var.f370900d));
                return;
            }
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "monitorStoryGallery: OUT, FROM_StoryGallery_GONE");
            r45.c45 e18 = x52.c.e();
            if (e18 == null) {
                com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellSessionMonitor", "closeStoryGalleryView, 不是合法session !!!");
            } else {
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "closeStoryGalleryView, curSession: %s", e18.f371270d);
                if ("142".equals(com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.b(e18.f371270d))) {
                    s(e18, j17);
                } else if (!"StoryGalleryView".equals(e18.f371273g)) {
                    com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "curActivity: %s IS NOT curSession: %s startPage: %s", "StoryGalleryView", e18.f371270d, e18.f371273g);
                    x52.c.j(e18);
                }
            }
            androidx.fragment.app.Fragment f17 = i52.l.f(b52.b.f(), "com.tencent.mm.ui.MoreTabUI");
            int hashCode = f17 != null ? f17.hashCode() : 0;
            w("com.tencent.mm.ui.MoreTabUI", hashCode, j17);
            y52.b.b(null, "MoreTabUI", hashCode, j17);
            return;
        }
        if (i18 != 0) {
            if (i18 != 2) {
                return;
            }
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "monitorStoryGallery: IN, FROM_RESUME, Event-7, !!");
            return;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "monitorStoryGallery: IN, FROM_StoryGallery_SHOW");
        v("com.tencent.mm.ui.MoreTabUI", j17);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "关闭(闭环)MoreTabUI无效页之后，再开启动态视频session");
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "openStoryGalleryView");
        r45.c45 e19 = x52.c.e();
        if (e19 == null) {
            e19 = n(null, "MoreTabUI", "StoryGalleryView", 0, j17);
            if (e19 == null) {
                com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellSessionMonitor", "openStoryGalleryView, 不是合法session ~~~");
                return;
            }
        } else {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "openStoryGalleryView, curSession: %s", e19.f371270d);
            z17 = false;
        }
        y52.b.b(e19, "StoryGalleryView", 0, j17);
        if (!z17) {
            x52.c.j(e19);
            return;
        }
        e19.f371282s = 0;
        java.lang.String b17 = x52.m.b();
        if (b17 == null) {
            b17 = "";
        }
        e19.f371285v = b17;
        x52.c.a(e19);
        u(e19);
    }

    public final void m(int i17, long j17) {
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "newChattingUISession");
        r45.c45 n17 = n(null, "MainUI", "ChattingUI", i17, j17);
        if (n17 == null) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellSessionMonitor", "_doChattingUIInContinue, 不是合法session ~~~");
            return;
        }
        java.lang.String b17 = x52.m.b();
        if (b17 == null) {
            b17 = "";
        }
        n17.f371285v = b17;
        y52.b.b(n17, "com.tencent.mm.ui.chatting.ChattingUI", i17, j17);
        n17.f371282s = 0;
        x52.c.a(n17);
        u(n17);
    }

    public r45.c45 n(android.app.Activity activity, java.lang.String str, java.lang.String str2, int i17, long j17) {
        java.lang.String g17;
        r45.p44 p44Var;
        r45.p44 p44Var2;
        if (str2 == null) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellSessionMonitor", "newSession: dstPageName is NULL");
            return null;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "newSession: srcPageName: %s, dstPageName: %s", str, str2);
        if ("WebViewUI".equals(str2)) {
            p44Var = new r45.p44();
            p44Var.f382747d = "minimize_secene";
            p44Var.f382748e = h52.b.c("minimize_secene");
            p44Var2 = new r45.p44();
            p44Var2.f382747d = "KPublisherId";
            p44Var2.f382748e = h52.b.c("KPublisherId");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(p44Var.f382748e);
            arrayList.add(p44Var2.f382748e);
            g17 = com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.g(activity, str, str2, arrayList);
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "newSession(WebViewUI)sid = %s, %s", g17, java.lang.Long.valueOf(j17));
        } else {
            g17 = com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.g(activity, str, str2, null);
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "newSession(no args)sid = %s, %s", g17, java.lang.Long.valueOf(j17));
            p44Var = null;
            p44Var2 = null;
        }
        if (android.text.TextUtils.isEmpty(g17)) {
            return null;
        }
        r45.c45 c45Var = new r45.c45();
        c45Var.f371270d = g17 + "_" + j17;
        c45Var.f371271e = x52.c.d();
        c45Var.f371273g = str2;
        c45Var.f371284u = i17;
        c45Var.f371278o = str;
        c45Var.f371275i = j17;
        if ("WebViewUI".equals(str2)) {
            r45.x35 x35Var = new r45.x35();
            c45Var.f371277n = x35Var;
            x35Var.f389754d.add(p44Var);
            c45Var.f371277n.f389754d.add(p44Var2);
        } else {
            java.lang.String str3 = c45Var.f371273g;
            r52.b bVar = r52.c.f392629h;
            if (bVar.a(str, str2)) {
                if (kotlin.jvm.internal.o.b("ConvBoxServiceConversationUI", str)) {
                    c45Var.f371274h = 1;
                } else if (bVar.b(str)) {
                    c45Var.f371285v = d();
                } else {
                    str3 = c45Var.f371278o;
                }
            }
            if ("ChattingUI".equals(str3)) {
                nm5.b b17 = v52.a.b();
                c45Var.f371280q = (java.lang.String) b17.a(0);
                c45Var.f371274h = ((java.lang.Integer) b17.a(1)).intValue();
            } else if ("ChattingUIFragment".equals(str3)) {
                nm5.b c17 = v52.a.c();
                c45Var.f371280q = (java.lang.String) c17.a(0);
                c45Var.f371274h = ((java.lang.Integer) c17.a(1)).intValue();
            }
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.a(c45Var);
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "newSession, %s", c45Var.f371270d);
        }
        c45Var.f371281r = str2;
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "newSession: %s, %s", c45Var.f371270d, str2);
        this.f433307c = c45Var.f371270d;
        return c45Var;
    }

    public void q(int i17) {
        this.f433305a.getClass();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FloatBallSessionHandler", "onFloatSession, %d", java.lang.Integer.valueOf(i17));
        c62.d.d(-1, i17);
        r45.n33 a17 = c62.d.a();
        if (a17 == null) {
            a17 = new r45.n33();
        }
        a17.f381042d = i17;
        c62.d.b(a17);
    }

    public void r(boolean z17, java.lang.String str, int i17, long j17) {
        if (z17) {
            java.lang.String g17 = b52.b.g(str);
            if ("AppBrandLaunchProxyUI".equals(g17) || "AppBrandPreLoadingUI".equals(g17)) {
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("HABBYGE-MALI.HellSessionMonitor", "onFloatSessionExit: %b, %s", java.lang.Boolean.valueOf(z17), str);
        c62.c cVar = this.f433305a;
        cVar.getClass();
        r45.n33 a17 = c62.d.a();
        if (a17 == null) {
            a17 = new r45.n33();
        }
        a17.f381046h = false;
        c62.d.b(a17);
        android.util.Pair c17 = c62.d.c();
        if (c17 == null) {
            return;
        }
        int intValue = ((java.lang.Integer) c17.first).intValue();
        int intValue2 = ((java.lang.Integer) c17.second).intValue();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FloatBallSessionHandler", "onFloatSessionExit, finish: %b, %d, %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2));
        if (intValue == 2 && intValue2 != 3 && intValue2 != 4) {
            com.tencent.mars.xlog.Log.w("HABBYGE-MALI.FloatBallSessionHandler", "FoatBall, onFloatSessionExit: onFloatMenuItemClicked");
            return;
        }
        r45.c45 e17 = x52.c.e();
        if (e17 == null) {
            com.tencent.mars.xlog.Log.w("HABBYGE-MALI.FloatBallSessionHandler", "onFloatSessionExit, curSession == null");
            return;
        }
        if (!z17) {
            cVar.a(e17, false, intValue, intValue2, j17);
            return;
        }
        java.lang.String b17 = com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.b(e17.f371270d);
        if (b17 == null || !b17.equals("145")) {
            com.tencent.mars.xlog.Log.w("HABBYGE-MALI.FloatBallSessionHandler", "onFloatSessionExit, sid: %s, %s", b17, e17.f371270d);
            return;
        }
        r45.n33 a18 = c62.d.a();
        int i18 = a18 == null ? -1 : a18.f381042d;
        if (i18 == 3 || i18 == 4) {
            r45.n33 a19 = c62.d.a();
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FloatBallSessionHandler", "FloatBall, state, read %d", java.lang.Integer.valueOf(a19 == null ? 8 : a19.f381047i));
            r45.n33 a27 = c62.d.a();
            if ((a27 == null ? 8 : a27.f381047i) == 8) {
                cVar.a(e17, true, intValue, intValue2, j17);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01d1, code lost:
    
        if (r19.f371270d.startsWith(r7) != false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(r45.c45 r19, long r20) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v52.c.s(r45.c45, long):void");
    }

    public void t(r45.c45 c45Var, long j17, boolean z17) {
        java.lang.String str;
        if (z17 || c45Var == null || (str = c45Var.f371270d) == null || !str.startsWith("150")) {
            s(c45Var, j17);
            this.f433318n = false;
        } else {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellSessionMonitor", "HABBYGE-MLAI, onSessionClose, curSession ge pi la !!!!!!");
            this.f433318n = true;
        }
    }

    public void u(r45.c45 c45Var) {
        if (c45Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "onSessionStart: %s, %s, %s", c45Var.f371270d, java.lang.Long.valueOf(c45Var.f371275i), c45Var.f371285v);
        p52.k.f352046d.getClass();
        if ("143".equals(com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.b(c45Var.f371270d))) {
            p52.c cVar = p52.h.f352016a;
        }
        x52.m.a(c45Var.f371270d);
        x52.j jVar = x52.k.f452119a;
        int a17 = g52.a.a();
        if (a17 == 7 || a17 == 8) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.SessionPairDao", "setCurSession, activityMethod: " + a17);
        } else {
            r45.h16 a18 = jVar.a();
            if (a18 == null) {
                a18 = new r45.h16();
            }
            boolean z17 = a18.f375768i;
            if (z17) {
                a18.f375763d = a18.f375765f;
            } else {
                a18.f375764e = a18.f375766g;
            }
            a18.f375767h = z17;
            a18.f375768i = true;
            a18.f375765f = c45Var;
            jVar.b(a18);
        }
        java.lang.String str = c45Var.f371270d;
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FuzzyMatch", "resetFuzzyDaoOnStart: " + str);
        if (str != null) {
            t52.b bVar = t52.c.f415711a;
            r45.s53 a19 = bVar.a();
            if (a19 != null) {
                java.util.LinkedList linkedList = a19.f385517d;
                for (int size = linkedList.size() - 1; -1 < size; size--) {
                    java.lang.Object obj = linkedList.get(size);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    r45.a16 a16Var = (r45.a16) obj;
                    if (!kotlin.jvm.internal.o.b(str, a16Var.f369645d)) {
                        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FuzzyMatchDao", "resetOnStart, need remove: " + a16Var.f369645d);
                        java.util.LinkedList linkedList2 = a16Var.f369646e;
                        for (int size2 = linkedList2.size() + (-1); -1 < size2; size2--) {
                            java.lang.Object obj2 = linkedList2.get(size2);
                            kotlin.jvm.internal.o.f(obj2, "get(...)");
                            if (((r45.u53) obj2).f387051h) {
                                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FuzzyMatchDao", "resetOnStart, real remove: " + a16Var.f369645d);
                                linkedList2.remove(size2);
                            }
                        }
                        if (linkedList2.isEmpty()) {
                            linkedList.remove(size);
                        }
                    }
                }
                bVar.d(a19);
            }
            c52.c.d("mmkv_fuzzy_matched_bckup", new byte[0]);
            c52.c.d("mmkv_ssionPg_matched_bckup", new byte[0]);
        }
        p(com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.b(c45Var.f371270d), c45Var.f371275i);
    }

    public void v(java.lang.String str, long j17) {
        boolean z17 = false;
        if (this.f433317m) {
            this.f433317m = false;
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellSessionMonitor", "onUnknownSessionClose exception !!!!!!");
            return;
        }
        r45.lw3 h17 = x52.c.h();
        r45.w35 w35Var = null;
        if (h17 != null) {
            int i17 = h17.f379881i;
            java.util.LinkedList linkedList = h17.f379880h;
            if (i17 >= 0 && i17 < linkedList.size()) {
                w35Var = (r45.w35) linkedList.get(h17.f379881i);
            }
        }
        if (w35Var == null) {
            return;
        }
        w35Var.f388846h = j17;
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "onSessionClose, unknow: %s, %s, %s, %s", str, w35Var.f388848m, java.lang.Long.valueOf(w35Var.f388845g), java.lang.Long.valueOf(w35Var.f388846h));
        r45.lw3 h18 = x52.c.h();
        if (h18 != null) {
            int i18 = h18.f379881i;
            java.util.LinkedList linkedList2 = h18.f379880h;
            if (i18 >= 0 && i18 < linkedList2.size()) {
                z17 = true;
            }
            if (z17) {
                linkedList2.set(h18.f379881i, w35Var);
                x52.c.k(h18);
            }
        }
        o(com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.h(w35Var.f388848m), j17);
    }

    public void w(java.lang.String str, int i17, long j17) {
        androidx.fragment.app.Fragment a17;
        if (android.text.TextUtils.isEmpty(str) || this.f433318n) {
            this.f433318n = false;
            this.f433317m = true;
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellSessionMonitor", "addUnknownPage: page is NULL");
            return;
        }
        r45.w35 w35Var = new r45.w35();
        w35Var.f388848m = b52.b.g(str);
        w35Var.f388849n = i17;
        if (this.f433315k == 7) {
            w35Var.f388845g = this.f433316l;
            this.f433315k = -1;
        } else {
            w35Var.f388845g = j17;
        }
        w35Var.f388844f = x52.c.d();
        if ("LauncherUI".equals(w35Var.f388848m)) {
            androidx.fragment.app.Fragment e17 = i52.l.e("com.tencent.mm.ui.LauncherUI");
            if (e17 != null) {
                w35Var.f388848m = e17.getClass().getSimpleName();
                w35Var.f388849n = e17.hashCode();
            }
        } else if (("FinderHomeUI".equals(w35Var.f388848m) || "FinderHomeAffinityUI".equals(w35Var.f388848m) || "FinderConversationUI".equals(w35Var.f388848m)) && (a17 = p52.k.a()) != null) {
            w35Var.f388848m = a17.getClass().getSimpleName();
        }
        java.lang.String b17 = x52.m.b();
        if (b17 == null) {
            b17 = "";
        }
        w35Var.f388852q = b17;
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionMonitor", "onSessionStart, unknow: %s, %s, %s", w35Var.f388848m, java.lang.Long.valueOf(w35Var.f388845g), w35Var.f388852q);
        r45.lw3 h17 = x52.c.h();
        if (h17 == null) {
            h17 = new r45.lw3();
        }
        h17.f379880h.addLast(w35Var);
        h17.f379881i = h17.f379880h.size() - 1;
        h17.f379884o = false;
        x52.c.k(h17);
        x52.m.a(w35Var.f388848m + "_" + w35Var.f388845g);
        x52.j jVar = x52.k.f452119a;
        r45.h16 a18 = jVar.a();
        if (a18 == null) {
            a18 = new r45.h16();
        }
        boolean z17 = a18.f375768i;
        if (z17) {
            a18.f375763d = a18.f375765f;
        } else {
            a18.f375764e = a18.f375766g;
        }
        a18.f375767h = z17;
        a18.f375768i = false;
        a18.f375766g = w35Var;
        jVar.b(a18);
        p(com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.h(w35Var.f388848m), j17);
    }
}
