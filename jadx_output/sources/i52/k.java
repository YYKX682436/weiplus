package i52;

/* loaded from: classes15.dex */
public final class k implements b52.e, b52.d {

    /* renamed from: b, reason: collision with root package name */
    public e42.h0 f288490b;

    /* renamed from: d, reason: collision with root package name */
    public final j52.a f288492d = new i52.j(this);

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f288491c = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final i52.i f288489a = new i52.i(this);

    public static boolean a(androidx.fragment.app.FragmentActivity fragmentActivity, java.lang.String str) {
        try {
            androidx.fragment.app.Fragment f17 = i52.l.f(fragmentActivity, str);
            int i17 = com.tencent.mm.ui.MoreTabUI.B1;
            java.lang.reflect.Field declaredField = com.tencent.mm.ui.MoreTabUI.class.getDeclaredField("storyGallery");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(f17);
            int i18 = com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView.f172085l1;
            java.lang.reflect.Field declaredField2 = com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView.class.getDeclaredField("mIsActive");
            declaredField2.setAccessible(true);
            return ((java.lang.Boolean) declaredField2.get(obj)).booleanValue();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public void b(androidx.fragment.app.FragmentActivity fragmentActivity, java.lang.String str, int i17, long j17, boolean z17) {
        if (z17) {
            r45.z43 z43Var = new r45.z43();
            r45.bn6 bn6Var = new r45.bn6();
            z43Var.f391687d = bn6Var;
            if (fragmentActivity != null) {
                bn6Var.f370900d = fragmentActivity.getClass().getCanonicalName();
                z43Var.f391687d.f370901e = fragmentActivity.hashCode();
                z43Var.f391687d.f370902f = j17;
            }
            z43Var.f391688e = str;
            z43Var.f391690g = i17;
            z43Var.f391689f = j17;
            if (fragmentActivity != null && "com.tencent.mm.ui.MoreTabUI".equals(str)) {
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentMonitor", "stopStoryMonitor: %s", str);
                j52.c.c().b(fragmentActivity);
            }
            d52.d.a().d(6, z43Var);
        } else if (fragmentActivity == null && str == null) {
            r45.b2 e17 = f52.c.b().e();
            if (e17 != null) {
                java.lang.String str2 = e17.f370434d.f370900d;
                e42.h0 h0Var = this.f288490b;
                if (h0Var != null) {
                    ((a52.d) h0Var).a("Biz", str2, i17, j17);
                }
            }
        } else if (fragmentActivity != null) {
            java.lang.String canonicalName = fragmentActivity.getClass().getCanonicalName();
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentMonitor", "_onPause: %s, %s", canonicalName, str);
            f52.c.b().f(canonicalName, str, i17);
            if (str.equals("com.tencent.mm.ui.MoreTabUI")) {
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, _onPause-2");
                j52.c c17 = j52.c.c();
                c17.b(fragmentActivity);
                int i18 = c17.f297800b;
                if (i18 == 1 || i18 == -1) {
                    com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, _onPause-2");
                } else if (i18 == 0) {
                    com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentMonitor", "StoryGalleryView, _onPause");
                    c17.f297800b = -1;
                    e42.h0 h0Var2 = this.f288490b;
                    if (h0Var2 != null) {
                        ((a52.d) h0Var2).c(3, j17);
                    }
                }
            }
            e42.h0 h0Var3 = this.f288490b;
            if (h0Var3 != null) {
                ((a52.d) h0Var3).a(canonicalName, str, i17, j17);
            }
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f288491c).iterator();
        while (it.hasNext()) {
            ((e42.j0) it.next()).G(i17);
        }
    }

    public void c(androidx.fragment.app.FragmentActivity fragmentActivity, androidx.fragment.app.Fragment fragment, java.lang.String str, int i17, long j17, boolean z17) {
        e42.h0 h0Var;
        android.os.Bundle arguments;
        android.os.Bundle arguments2;
        if (fragment != null) {
            b52.a a17 = b52.a.a();
            a17.getClass();
            com.tencent.mars.xlog.Log.w("HABBYGE-MALI.HellhoundMonitor", "HellhoundMonitor-setPageObj: %s", fragment.getClass().getSimpleName());
            a17.f18079c = new java.lang.ref.WeakReference(fragment);
        }
        j52.a aVar = this.f288492d;
        if (z17) {
            r45.a53 a53Var = new r45.a53();
            if (fragment != null && (arguments2 = fragment.getArguments()) != null) {
                a53Var.f369733e = arguments2.getString("Chat_User");
            }
            a53Var.f369735g = str;
            a53Var.f369738m = i17;
            a53Var.f369734f = true;
            a53Var.f369737i = j17;
            r45.bn6 bn6Var = new r45.bn6();
            a53Var.f369732d = bn6Var;
            if (fragmentActivity != null) {
                bn6Var.f370900d = fragmentActivity.getClass().getCanonicalName();
                a53Var.f369732d.f370901e = fragmentActivity.hashCode();
                a53Var.f369732d.f370902f = j17;
            }
            if (fragmentActivity != null) {
                a53Var.f369736h = a(fragmentActivity, str);
                if ("com.tencent.mm.ui.MoreTabUI".equals(str)) {
                    j52.c.c().e(fragmentActivity, aVar);
                }
            }
            d52.d.a().d(5, a53Var);
        } else {
            if (fragment != null && (arguments = fragment.getArguments()) != null) {
                java.lang.String string = arguments.getString("Chat_User");
                if (!android.text.TextUtils.isEmpty(string)) {
                    i52.e.b("Chat_User", string);
                }
            }
            if (fragmentActivity == null && fragment == null && str == null) {
                r45.b2 e17 = f52.c.b().e();
                if (e17 != null) {
                    com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentMonitor", "onFragmentResume -> _onResumeForBiz --2");
                    e42.h0 h0Var2 = this.f288490b;
                    if (h0Var2 != null) {
                        ((a52.d) h0Var2).b("Biz", e17.f370434d.f370900d, i17, j17);
                    }
                }
            } else if (fragmentActivity != null) {
                java.lang.String canonicalName = fragmentActivity.getClass().getCanonicalName();
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentMonitor", "_onFragmentResume: %s, %s", canonicalName, str);
                f52.c.b().g(canonicalName, str, i17);
                if (str.equals("com.tencent.mm.ui.MoreTabUI")) {
                    com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, onResume-1");
                    j52.c c17 = j52.c.c();
                    c17.e(fragmentActivity, aVar);
                    int i18 = c17.f297800b;
                    if (i18 == 1 || i18 == -1) {
                        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, _onResume-2");
                    } else if (i18 == 0) {
                        boolean a18 = a(fragmentActivity, str);
                        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentMonitor", "StoryGalleryView, _onResume: %b", java.lang.Boolean.valueOf(a18));
                        if (a18 && (h0Var = this.f288490b) != null) {
                            ((a52.d) h0Var).d(2, j17);
                        }
                    }
                }
                e42.h0 h0Var3 = this.f288490b;
                if (h0Var3 != null) {
                    ((a52.d) h0Var3).b(canonicalName, str, i17, j17);
                }
            }
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f288491c).iterator();
        while (it.hasNext()) {
            ((e42.j0) it.next()).q(fragmentActivity, fragment);
        }
    }
}
