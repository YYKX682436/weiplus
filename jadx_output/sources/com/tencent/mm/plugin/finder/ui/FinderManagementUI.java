package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR$\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006$"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderManagementUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Landroid/view/View;", "t", "Landroid/view/View;", "getNotSeeHim", "()Landroid/view/View;", "setNotSeeHim", "(Landroid/view/View;)V", "notSeeHim", "u", "getNotSeeAccount", "setNotSeeAccount", "notSeeAccount", org.chromium.base.BaseSwitches.V, "getNotSeeMine", "setNotSeeMine", "notSeeMine", "w", "getPersonalizeSetting", "setPersonalizeSetting", "personalizeSetting", "x", "getInteractiveInfo", "setInteractiveInfo", "interactiveInfo", "y", "getLiveRoleGroup", "setLiveRoleGroup", "liveRoleGroup", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getFinderTitle", "setFinderTitle", "finderTitle", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FinderManagementUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {

    /* renamed from: A, reason: from kotlin metadata */
    public android.view.View finderTitle;
    public boolean B;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public android.view.View notSeeHim;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public android.view.View notSeeAccount;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public android.view.View notSeeMine;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public android.view.View personalizeSetting;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public android.view.View interactiveInfo;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public android.view.View liveRoleGroup;

    /* renamed from: z, reason: collision with root package name */
    public boolean f128619z;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b8w;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.u8.class)), pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.r8.class)), pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.q8.class)), pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.t8.class)), pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.u7.class))});
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.LinkedList<r45.z63> list;
        android.view.View view;
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f491422d14);
        setBackBtn(new com.tencent.mm.plugin.finder.ui.w9(this));
        this.B = getIntent().getBooleanExtra("intent_status_from_live_square_center", false);
        this.f128619z = getIntent().getBooleanExtra("intent_status_from_privacy_to_video_setting", false);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f486157ke1);
        this.notSeeHim = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.ui.x9(this));
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.kcn);
        this.notSeeAccount = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.ui.y9(this));
        }
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.kcp);
        this.notSeeMine = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new com.tencent.mm.plugin.finder.ui.z9(this));
        }
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.ktx);
        this.personalizeSetting = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new com.tencent.mm.plugin.finder.ui.aa(this));
        }
        this.interactiveInfo = com.tencent.mm.plugin.finder.ui.ca.f128983a.a(this);
        this.liveRoleGroup = findViewById(com.tencent.mm.R.id.ief);
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.g4e);
        this.finderTitle = findViewById5;
        if (this.f128619z) {
            android.view.View view2 = this.notSeeAccount;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = this.liveRoleGroup;
            if (view3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view4 = this.finderTitle;
            if (view4 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view5 = this.personalizeSetting;
            if (view5 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (this.B) {
            if (findViewById5 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view6 = this.notSeeHim;
            if (view6 != null) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view7 = this.notSeeMine;
            if (view7 != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view8 = this.notSeeAccount;
            if (view8 != null) {
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
                arrayList8.add(8);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view9 = this.personalizeSetting;
            if (view9 != null) {
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal9 = zj0.c.f473285a;
                arrayList9.add(8);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(view9, "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.r_c);
            if (findViewById6 != null) {
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal10 = zj0.c.f473285a;
                arrayList10.add(0);
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(findViewById6, arrayList10.toArray(), "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById6.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        g92.b bVar = g92.b.f269769e;
        r45.ls2 ls2Var = (r45.ls2) bVar.k2().d().getCustom(26);
        if ((ls2Var != null && ls2Var.getInteger(0) == 1) && (view = this.personalizeSetting) != null) {
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal11 = zj0.c.f473285a;
            arrayList11.add(8);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(view, arrayList11.toArray(), "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int dimension = (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486158ke2);
        if (textView != null) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.erq);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            textView.setText(hc2.x0.k(string, context, '#', com.tencent.mm.R.raw.icons_filled_channels_like_thick, com.tencent.mm.R.color.FG_0, dimension, dimension, 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null));
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kcq);
        if (textView2 != null) {
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.erm);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            textView2.setText(hc2.x0.k(string2, context2, '#', com.tencent.mm.R.raw.icons_filled_channels_like_thick, com.tencent.mm.R.color.FG_0, dimension, dimension, 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null));
        }
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.ru8);
        r45.a73 a73Var = (r45.a73) bVar.k2().e().getCustom(11);
        r45.a73 a73Var2 = null;
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.t8.l(a73Var != null ? a73Var.toByteArray() : null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal12 = zj0.c.f473285a;
            arrayList12.add(8);
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(findViewById7, arrayList12.toArray(), "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById7.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(findViewById7, "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            r45.a73 a73Var3 = new r45.a73();
            try {
                a73Var3.parseFrom(com.tencent.mm.sdk.platformtools.t8.h(l17));
                a73Var2 = a73Var3;
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
            if (a73Var2 != null && (list = a73Var2.getList(0)) != null) {
                for (r45.z63 z63Var : list) {
                    if (z63Var != null) {
                        zl2.r.f473938a.a(z63Var, "SimpleUIComponent_get");
                    }
                }
            }
            androidx.appcompat.app.AppCompatActivity context3 = getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            if (a73Var2 != null) {
                java.util.LinkedList list2 = a73Var2.getList(0);
                if ((list2 == null || list2.isEmpty()) ? false : true) {
                    if (findViewById7 != null) {
                        java.util.ArrayList arrayList13 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal13 = zj0.c.f473285a;
                        arrayList13.add(0);
                        java.util.Collections.reverse(arrayList13);
                        yj0.a.d(findViewById7, arrayList13.toArray(), "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById7.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
                        yj0.a.f(findViewById7, "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (findViewById7 != null) {
                        findViewById7.setOnClickListener(new com.tencent.mm.plugin.finder.ui.ba(this, V6));
                    }
                    i95.m c17 = i95.n0.c(zy2.zb.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    zy2.zb.I8((zy2.zb) c17, ml2.u1.T2, kz5.c1.i(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "4"), new jz5.l("type", "3"), new jz5.l("ref_scene", "2")), V6.getString(1), java.lang.Integer.valueOf(V6.getInteger(5)).toString(), null, null, false, 112, null);
                }
            }
            if (findViewById7 != null) {
                java.util.ArrayList arrayList14 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal14 = zj0.c.f473285a;
                arrayList14.add(8);
                java.util.Collections.reverse(arrayList14);
                yj0.a.d(findViewById7, arrayList14.toArray(), "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById7.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
                yj0.a.f(findViewById7, "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        zy2.u8 u8Var = (zy2.u8) pf5.z.f353948a.a(this).c(zy2.u8.class);
        long a17 = c01.id.a();
        com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var = (com.tencent.mm.plugin.finder.live.viewmodel.v9) u8Var;
        v9Var.f117503y = 2;
        v9Var.f117504z = a17;
    }

    public final void setFinderTitle(android.view.View view) {
        this.finderTitle = view;
    }

    public final void setInteractiveInfo(android.view.View view) {
        this.interactiveInfo = view;
    }

    public final void setLiveRoleGroup(android.view.View view) {
        this.liveRoleGroup = view;
    }

    public final void setNotSeeAccount(android.view.View view) {
        this.notSeeAccount = view;
    }

    public final void setNotSeeHim(android.view.View view) {
        this.notSeeHim = view;
    }

    public final void setNotSeeMine(android.view.View view) {
        this.notSeeMine = view;
    }

    public final void setPersonalizeSetting(android.view.View view) {
        this.personalizeSetting = view;
    }
}
