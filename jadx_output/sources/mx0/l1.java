package mx0;

/* loaded from: classes5.dex */
public final class l1 implements yt3.r2, android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f332120d;

    /* renamed from: e, reason: collision with root package name */
    public final mx0.z f332121e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f332122f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f332123g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f332124h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f332125i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f332126m;

    public l1(android.view.ViewGroup bottomContainer, mx0.z controller) {
        kotlin.jvm.internal.o.g(bottomContainer, "bottomContainer");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f332120d = bottomContainer;
        this.f332121e = controller;
        jz5.i iVar = jz5.i.f302831f;
        this.f332122f = jz5.h.a(iVar, new mx0.j1(this));
        this.f332123g = jz5.h.a(iVar, new mx0.i1(this));
        this.f332124h = jz5.h.a(iVar, new mx0.k1(this));
        this.f332125i = jz5.h.a(iVar, new mx0.f1(this));
    }

    public final void a() {
        android.view.View view = (android.view.View) this.f332122f.getValue();
        if (view != null) {
            view.setEnabled(false);
        }
        android.view.View view2 = (android.view.View) this.f332123g.getValue();
        if (view2 != null) {
            view2.setEnabled(false);
        }
        android.view.View view3 = (android.view.View) this.f332124h.getValue();
        if (view3 != null) {
            view3.setEnabled(false);
        }
        com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView c17 = c();
        if (c17 != null) {
            c17.setEnabled(false);
        }
        android.view.ViewGroup viewGroup = this.f332120d;
        viewGroup.animate().cancel();
        viewGroup.animate().alpha(0.8f).setDuration(300L).start();
    }

    public final void b() {
        android.view.View view = (android.view.View) this.f332122f.getValue();
        if (view != null) {
            view.setEnabled(true);
        }
        android.view.View view2 = (android.view.View) this.f332123g.getValue();
        if (view2 != null) {
            view2.setEnabled(true);
        }
        android.view.View view3 = (android.view.View) this.f332124h.getValue();
        if (view3 != null) {
            view3.setEnabled(true);
        }
        com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView c17 = c();
        if (c17 != null) {
            c17.setEnabled(true);
        }
        android.view.ViewGroup viewGroup = this.f332120d;
        viewGroup.animate().cancel();
        viewGroup.animate().alpha(1.0f).setDuration(300L).start();
    }

    public final com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView c() {
        return (com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView) this.f332125i.getValue();
    }

    public final void d(boolean z17) {
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.j5(m7Var, !z17, null), 3, null);
        int i17 = z17 ? com.tencent.mm.R.drawable.cws : com.tencent.mm.R.drawable.da7;
        com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView c17 = c();
        if (c17 != null) {
            c17.setImageResource(i17);
        }
        this.f332126m = z17;
    }

    public final void e() {
        android.view.View view = (android.view.View) this.f332122f.getValue();
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportPreviewUIPlugin", "showButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportPreviewUIPlugin", "showButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = (android.view.View) this.f332123g.getValue();
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportPreviewUIPlugin", "showButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportPreviewUIPlugin", "showButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = (android.view.View) this.f332124h.getValue();
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportPreviewUIPlugin", "showButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportPreviewUIPlugin", "showButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView c17 = c();
        if (c17 == null) {
            return;
        }
        c17.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportPreviewUIPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view == null) {
            yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportPreviewUIPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int id6 = view.getId();
        if (id6 == com.tencent.mm.R.id.slz) {
            android.view.ViewGroup viewGroup = this.f332120d;
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(viewGroup.getContext(), 1, true);
            k0Var.q(i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.oio), 17);
            k0Var.f211872n = mx0.g1.f331987d;
            k0Var.f211881s = new mx0.h1(k0Var, this);
            k0Var.v();
        } else if (id6 == com.tencent.mm.R.id.sly) {
            a();
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) this.f332121e;
            shootComposingPluginLayout.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingPluginLayout", "reportJump2VideoCropPageForMaterialImportPreview");
            ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
            yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.q5(m7Var, null), 3, null);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            java.util.Map Ai = m7Var.Ai();
            Ai.put("view_id", "sc_asset_generate_crop");
            ((cy1.a) rVar).yj("sc_asset_generate_crop", null, Ai, 6, false);
            yx0.b8 b8Var = shootComposingPluginLayout.f69557v;
            mx0.y5 y5Var = new mx0.y5(shootComposingPluginLayout);
            b8Var.getClass();
            mx0.e1 e1Var = b8Var.X1;
            if (e1Var != null) {
                if (e1Var.d()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MaterialImportHelper", "enterImportCrop: importPreviewState " + e1Var.f331935b);
                    e1Var.f(mx0.d0.f331899m);
                    kotlinx.coroutines.l.d(e1Var.f331938e, null, null, new mx0.k0(e1Var, y5Var, null), 3, null);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MaterialImportHelper", "enterImportCrop: importPreviewState " + e1Var.f331935b);
                    y5Var.invoke(null);
                }
            }
        } else if (id6 == com.tencent.mm.R.id.hqz) {
            a();
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout2 = (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) this.f332121e;
            shootComposingPluginLayout2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingPluginLayout", "reportJump2VideoPostPageForMaterialImportPreview");
            i95.m c17 = i95.n0.c(w40.e.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            w40.e.eh((w40.e) c17, "SCAssetGenerateToPost", "MJShootComposing", ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ni(), 0, 8, null);
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = shootComposingPluginLayout2.f69542J;
            if (recordConfigProvider != null) {
                shootComposingPluginLayout2.v0(true, new mx0.b6(recordConfigProvider, shootComposingPluginLayout2, null));
            }
        } else if (id6 == com.tencent.mm.R.id.slx) {
            ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
            yy0.m7 m7Var2 = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            kotlinx.coroutines.l.d(m7Var2.Di(), null, null, new yy0.s5(m7Var2, null), 3, null);
            dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
            java.util.Map Ai2 = m7Var2.Ai();
            Ai2.put("view_id", "sc_asset_generate_beauty_makeup");
            ((cy1.a) rVar2).yj("sc_asset_generate_beauty_makeup", null, Ai2, 6, false);
            a();
            com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView c18 = c();
            if (c18 != null) {
                c18.performHapticFeedback(6);
            }
            this.f332121e.setShouldDisableBeautyAndMakeup(!this.f332126m);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportPreviewUIPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f332120d.setVisibility(i17);
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        android.view.ViewGroup viewGroup = this.f332120d;
        viewGroup.addView(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f489468eo5, viewGroup, false));
        android.view.View view = (android.view.View) this.f332122f.getValue();
        if (view != null) {
            view.setOnClickListener(this);
        }
        android.view.View view2 = (android.view.View) this.f332123g.getValue();
        if (view2 != null) {
            view2.setOnClickListener(this);
        }
        android.view.View view3 = (android.view.View) this.f332124h.getValue();
        if (view3 != null) {
            view3.setOnClickListener(this);
        }
        com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView c17 = c();
        if (c17 != null) {
            c17.setOnClickListener(this);
        }
        d(this.f332126m);
        viewGroup.setVisibility(8);
    }
}
