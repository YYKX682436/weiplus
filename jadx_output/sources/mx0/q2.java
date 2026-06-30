package mx0;

/* loaded from: classes5.dex */
public final class q2 implements mx0.x {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f332233d;

    /* renamed from: e, reason: collision with root package name */
    public final mx0.r1 f332234e;

    /* renamed from: f, reason: collision with root package name */
    public final mx0.z f332235f;

    /* renamed from: g, reason: collision with root package name */
    public final yx0.b8 f332236g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f332237h;

    /* renamed from: i, reason: collision with root package name */
    public int f332238i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f332239m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f332240n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f332241o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f332242p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f332243q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f332244r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f332245s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f332246t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f332247u;

    public q2(android.view.ViewGroup parent, mx0.r1 micMutePlugin, mx0.z controller, yx0.b8 templateCorePlugin, wx0.g1 subtitlePlugin) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(micMutePlugin, "micMutePlugin");
        kotlin.jvm.internal.o.g(controller, "controller");
        kotlin.jvm.internal.o.g(templateCorePlugin, "templateCorePlugin");
        kotlin.jvm.internal.o.g(subtitlePlugin, "subtitlePlugin");
        this.f332233d = parent;
        this.f332234e = micMutePlugin;
        this.f332235f = controller;
        this.f332236g = templateCorePlugin;
        this.f332239m = jz5.h.b(new mx0.l2(this));
        this.f332240n = jz5.h.b(new mx0.j2(this));
        this.f332241o = jz5.h.b(new mx0.o2(this));
        this.f332242p = jz5.h.b(new mx0.i2(this));
        this.f332243q = jz5.h.b(new mx0.p2(this));
        jz5.g b17 = jz5.h.b(new mx0.z1(this));
        this.f332244r = b17;
        this.f332245s = jz5.h.b(new mx0.h2(this));
        this.f332246t = jz5.h.b(new mx0.k2(this));
        c().setSelected(true);
        e().setOnClickListener(new mx0.x1(this));
        java.lang.Object value = ((jz5.n) b17).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.view.View) value).setOnClickListener(new mx0.y1(this));
    }

    public static final void a(mx0.q2 q2Var, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, java.lang.String str) {
        q2Var.getClass();
        audioCacheInfo.f155715i = str;
        boolean j17 = com.tencent.mm.vfs.w6.j(str);
        audioCacheInfo.f155716m = j17;
        if (j17) {
            i95.m c17 = i95.n0.c(m40.k0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((c61.p7) ((m40.k0) c17)).fj(str);
        }
    }

    public void b() {
        e().setEnabled(false);
        if (this.f332238i != 0) {
            return;
        }
        e().animate().cancel();
        e().animate().alpha(0.8f).setDuration(300L).start();
    }

    public final android.widget.TextView c() {
        java.lang.Object value = this.f332240n.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final mx0.k3 d() {
        return (mx0.k3) ((jz5.n) this.f332246t).getValue();
    }

    public final android.view.View e() {
        java.lang.Object value = this.f332239m.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final void f(boolean z17) {
        if (this.f332237h == z17) {
            return;
        }
        this.f332237h = z17;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0) ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingMusicPickerComponentLayout) d().o().e()).b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0.class);
        if (e0Var != null) {
            e0Var.E(z17);
        }
        jz5.g gVar = this.f332245s;
        jz5.g gVar2 = this.f332242p;
        jz5.g gVar3 = this.f332244r;
        jz5.g gVar4 = this.f332243q;
        jz5.g gVar5 = this.f332241o;
        mx0.r1 r1Var = this.f332234e;
        if (z17) {
            r1Var.setVisibility(0);
            java.lang.Object value = ((jz5.n) gVar5).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            android.view.View view = (android.view.View) value;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Object value2 = ((jz5.n) gVar4).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            android.view.View view2 = (android.view.View) value2;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Object value3 = ((jz5.n) gVar3).getValue();
            kotlin.jvm.internal.o.f(value3, "getValue(...)");
            android.view.View view3 = (android.view.View) value3;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Object value4 = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value4, "getValue(...)");
            ((com.tencent.mm.ui.widget.imageview.WeImageView) value4).setVisibility(8);
            java.lang.Object value5 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value5, "getValue(...)");
            android.view.View view4 = (android.view.View) value5;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        r1Var.setVisibility(8);
        java.lang.Object value6 = ((jz5.n) gVar5).getValue();
        kotlin.jvm.internal.o.f(value6, "getValue(...)");
        android.view.View view5 = (android.view.View) value6;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object value7 = ((jz5.n) gVar4).getValue();
        kotlin.jvm.internal.o.f(value7, "getValue(...)");
        android.view.View view6 = (android.view.View) value7;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object value8 = ((jz5.n) gVar3).getValue();
        kotlin.jvm.internal.o.f(value8, "getValue(...)");
        android.view.View view7 = (android.view.View) value8;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object value9 = ((jz5.n) gVar2).getValue();
        kotlin.jvm.internal.o.f(value9, "getValue(...)");
        ((com.tencent.mm.ui.widget.imageview.WeImageView) value9).setVisibility(0);
        java.lang.Object value10 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value10, "getValue(...)");
        android.view.View view8 = (android.view.View) value10;
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(0);
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
        yj0.a.f(view8, "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void g(boolean z17) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d17;
        c().setText(i65.a.r(this.f332233d.getContext(), com.tencent.mm.R.string.lng));
        c().requestFocus();
        f(false);
        if (!z17 || (d17 = ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingMusicPickerComponentLayout) d().o().e()).d()) == null) {
            return;
        }
        d17.t(null, false);
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        mx0.k3 d17 = d();
        if (!d17.f222354d || !d17.f222354d) {
            return false;
        }
        d17.g().setShow(false);
        return true;
    }

    @Override // yt3.r2
    public void onPause() {
        mx0.k3 d17 = d();
        if (d17.f222354d) {
            ev0.t.c(d17.f222353c, false, null, 3, null);
        }
    }

    @Override // yt3.r2
    public void onResume() {
        mx0.k3 d17 = d();
        if (d17.f222354d) {
            d17.f222353c.d();
        }
    }

    @Override // yt3.r2
    public void release() {
        d().e();
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        if (this.f332238i == i17) {
            return;
        }
        this.f332238i = i17;
        if (i17 == 0) {
            sa5.d.c(e(), 0.0f, 0L, null, 7, null);
        } else {
            sa5.d.d(e(), 0, 0L, null, 7, null);
        }
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        this.f332247u = configProvider;
    }
}
