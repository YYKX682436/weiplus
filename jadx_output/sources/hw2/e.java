package hw2;

/* loaded from: classes5.dex */
public final class e implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f285512d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f285513e;

    /* renamed from: f, reason: collision with root package name */
    public iu3.i f285514f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView f285515g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f285516h;

    /* renamed from: i, reason: collision with root package name */
    public final st3.k f285517i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f285518m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f285519n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f285520o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f285521p;

    /* renamed from: q, reason: collision with root package name */
    public final long f285522q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f285523r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Runnable f285524s;

    public e(android.view.ViewGroup parent, ju3.d0 status) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f285512d = parent;
        this.f285513e = status;
        this.f285516h = kz5.p0.f313996d;
        this.f285517i = new st3.k();
        this.f285521p = true;
        this.f285522q = 500L;
        this.f285523r = new java.util.ArrayList();
        this.f285524s = new hw2.d(this);
    }

    public final void a() {
        if (this.f285515g != null) {
            return;
        }
        android.view.ViewGroup viewGroup = this.f285512d;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView = new com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView(context, null);
        this.f285515g = editorAudioView;
        editorAudioView.setVisibility(8);
        viewGroup.addView(this.f285515g);
        android.content.Context context2 = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        this.f285514f = new iu3.i(context2);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView2 = this.f285515g;
        if (editorAudioView2 != null) {
            editorAudioView2.setBackground(com.tencent.mm.R.drawable.b8v);
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView3 = this.f285515g;
        if (editorAudioView3 != null) {
            editorAudioView3.setOnVisibleChangeCallback(new hw2.b(this));
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView4 = this.f285515g;
        if (editorAudioView4 != null) {
            editorAudioView4.enableSelectFinderVideo(com.tencent.mm.plugin.vlog.model.v0.a());
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView5 = this.f285515g;
        if (editorAudioView5 != null) {
            com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView.resetStyle$default(editorAudioView5, java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f480929fm), null, null, java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f482142b40), null, java.lang.Integer.valueOf(com.tencent.mm.R.raw.popvideo_post_selected_origin), null, null, null, null, null, null, null, true, 8144, null);
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView6 = this.f285515g;
        if (editorAudioView6 != null) {
            editorAudioView6.setCallback(new hw2.c(this));
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView7 = this.f285515g;
        if (editorAudioView7 != null) {
            editorAudioView7.setLocalAudioList(this.f285516h);
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView8 = this.f285515g;
        if (editorAudioView8 != null) {
            com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView.setup$default(editorAudioView8, "", new java.util.ArrayList(), -1L, -1L, false, this.f285517i, this.f285518m, 16, null);
        }
    }

    public final void b() {
        iu3.i iVar = this.f285514f;
        if (iVar != null) {
            iVar.a();
        }
        java.util.Iterator it = this.f285523r.iterator();
        while (it.hasNext()) {
            ((hw2.a) it.next()).getClass();
        }
    }

    public final void c() {
        iu3.i iVar = this.f285514f;
        if (iVar != null) {
            iVar.e();
        }
        java.util.Iterator it = this.f285523r.iterator();
        while (it.hasNext()) {
            ((hw2.a) it.next()).getClass();
        }
    }

    public final void d(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, boolean z17, boolean z18) {
        java.lang.Integer valueOf = recordConfigProvider != null ? java.lang.Integer.valueOf(recordConfigProvider.F) : null;
        st3.k kVar = this.f285517i;
        if (valueOf != null && valueOf.intValue() == 2) {
            st3.v vVar = st3.v.f412606e;
            kVar.getClass();
            kVar.f412551f = vVar;
            kVar.f412547b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_video_editor_lyrics_enable, 0) == 1;
        } else if (valueOf != null && valueOf.intValue() == 1) {
            st3.v vVar2 = st3.v.f412608g;
            kVar.getClass();
            kVar.f412551f = vVar2;
        } else if (valueOf != null && valueOf.intValue() == 3) {
            st3.v vVar3 = st3.v.f412605d;
            kVar.getClass();
            kVar.f412551f = vVar3;
            kVar.f412547b = true;
            kVar.f412550e = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_story_visitor_enable, false);
        } else if (valueOf != null && valueOf.intValue() == 5) {
            st3.v vVar4 = st3.v.f412607f;
            kVar.getClass();
            kVar.f412551f = vVar4;
        } else if (valueOf != null && valueOf.intValue() == 11) {
            st3.v vVar5 = st3.v.f412609h;
            kVar.getClass();
            kVar.f412551f = vVar5;
            kVar.f412547b = false;
        }
        kVar.f412549d = z17;
        this.f285518m = z18;
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView = this.f285515g;
        return editorAudioView != null && editorAudioView.onBackPress();
    }

    @Override // yt3.r2
    public void onPause() {
        b();
    }

    @Override // yt3.r2
    public void onResume() {
        if (!this.f285520o || this.f285519n == null) {
            return;
        }
        c();
    }

    @Override // yt3.r2
    public void release() {
        this.f285519n = null;
        iu3.i iVar = this.f285514f;
        if (iVar != null) {
            iVar.d();
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView = this.f285515g;
        if (editorAudioView != null) {
            editorAudioView.destroy();
        }
    }

    @Override // yt3.r2
    public void reset() {
        iu3.i iVar;
        if (this.f285519n == null || (iVar = this.f285514f) == null) {
            return;
        }
        iVar.f(0L);
    }
}
