package iu3;

/* loaded from: classes5.dex */
public final class e implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f294991d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f294992e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f294993f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f294994g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f294995h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f294996i;

    /* renamed from: m, reason: collision with root package name */
    public final iu3.i f294997m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f294998n;

    /* renamed from: o, reason: collision with root package name */
    public st3.k f294999o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f295000p;

    public e(android.view.ViewGroup parent, ju3.d0 status, boolean z17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f294991d = parent;
        this.f294992e = status;
        this.f294993f = z17;
        android.view.View findViewById = parent.findViewById(com.tencent.mm.R.id.d7_);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = parent.findViewById(com.tencent.mm.R.id.d7a);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById2;
        this.f294994g = imageView2;
        android.view.View findViewById3 = parent.findViewById(com.tencent.mm.R.id.d7b);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f294995h = findViewById3;
        this.f294996i = jz5.h.b(new iu3.d(this));
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f294997m = new iu3.i(context);
        this.f294999o = new st3.k();
        this.f295000p = true;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_show_mediacomponent_audio, true);
        this.f295000p = fj6;
        com.tencent.mars.xlog.Log.i("MicroMsg.EditAddMusicPlugin", "forceEnable " + fj6);
        imageView2.setImageDrawable(parent.getContext().getResources().getDrawable(com.tencent.mm.R.raw.popvideo_post_selected));
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(parent.getContext(), com.tencent.mm.R.raw.icons_filled_music, -1));
        imageView.setOnClickListener(this);
        if (fj6) {
            b().setOnVisibleChangeCallback(new iu3.a(this));
            b().setCallback(new iu3.b(this));
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/music/EditAddMusicPlugin", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/recordvideo/plugin/music/EditAddMusicPlugin", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void a() {
        st3.k kVar = this.f294999o;
        if (kVar.f412551f == st3.v.f412605d && kVar.f412550e) {
            b().setShow(true);
        }
    }

    public final com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView b() {
        return (com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView) this.f294996i.getValue();
    }

    public final boolean c() {
        return b().getMuteOrigin();
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        if (!b().isShow()) {
            return false;
        }
        b().back();
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/music/EditAddMusicPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!com.tencent.mm.sdk.platformtools.f9.SessionMusic.k(view != null ? view.getContext() : null, null)) {
            yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/music/EditAddMusicPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        b().setShow(true);
        nu3.i iVar = nu3.i.f340218a;
        nu3.i.c(iVar, "KEY_CLICK_MUSIC_COUNT_INT", 0, 2, null);
        iVar.b(6);
        iVar.d(5);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/music/EditAddMusicPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void onDetach() {
        b().reset();
        wt3.u uVar = wt3.v.f449504h;
        wt3.v vVar = wt3.v.f449505i;
        if (vVar != null) {
            vVar.a();
        }
    }

    @Override // yt3.r2
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditAddMusicPlugin", "pauseAudio");
        this.f294997m.a();
    }

    @Override // yt3.r2
    public void onResume() {
        if (b().getWithMusic()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditAddMusicPlugin", "resumeMusic");
            this.f294997m.e();
        }
    }

    @Override // yt3.r2
    public void q() {
        kk4.v vVar = this.f294997m.f295008c;
        if (vVar != null) {
            vVar.C(true);
        }
    }

    @Override // yt3.r2
    public void release() {
        reset();
        this.f294998n = null;
        this.f294997m.d();
        b().destroy();
    }

    @Override // yt3.r2
    public void reset() {
        this.f294994g.setVisibility(8);
        android.view.View view = this.f294995h;
        kotlin.jvm.internal.o.g(view, "view");
        view.setTag(com.tencent.mm.R.id.f482773nl, i65.a.r(view.getContext(), com.tencent.mm.R.string.f489971h0));
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        if (this.f295000p) {
            android.view.View view = this.f294995h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/music/EditAddMusicPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/music/EditAddMusicPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // yt3.r2
    public void v() {
        kk4.v vVar;
        if (!b().getWithMusic() || (vVar = this.f294997m.f295008c) == null) {
            return;
        }
        vVar.C(false);
    }
}
