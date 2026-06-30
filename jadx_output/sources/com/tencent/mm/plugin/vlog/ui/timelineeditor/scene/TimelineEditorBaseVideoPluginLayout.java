package com.tencent.mm.plugin.vlog.ui.timelineeditor.scene;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u00107\u001a\u000206\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b:\u0010;J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0004R$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010*\u001a\u00020\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00105\u001a\u00020.8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006<"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/timelineeditor/scene/TimelineEditorBaseVideoPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/AutoRegisterPluginLayout;", "", "seekStart", "Ljz5/f0;", "setSingleTrackPlayRange", "Lr95/e;", "getCurrentTrackPlayRange", "Lrm5/j;", "getCurrentTrack", "Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "m", "Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "getConfigProvider", "()Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "setConfigProvider", "(Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)V", "configProvider", "Lct0/b;", "o", "Lct0/b;", "getCaptureInfo", "()Lct0/b;", "setCaptureInfo", "(Lct0/b;)V", "captureInfo", "Landroid/view/ViewGroup;", "p", "Landroid/view/ViewGroup;", "getPluginLayout", "()Landroid/view/ViewGroup;", "pluginLayout", "", "s", "Ljava/lang/String;", "getEditId", "()Ljava/lang/String;", "setEditId", "(Ljava/lang/String;)V", "editId", "t", "Z", "isMediaMute", "()Z", "setMediaMute", "(Z)V", "", "u", "J", "getMaxCropVideoDurationMs", "()J", "setMaxCropVideoDurationMs", "(J)V", "maxCropVideoDurationMs", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class TimelineEditorBaseVideoPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.AutoRegisterPluginLayout {

    /* renamed from: i */
    public yo4.p f176074i;

    /* renamed from: m, reason: from kotlin metadata */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider;

    /* renamed from: n */
    public it3.y f176076n;

    /* renamed from: o, reason: from kotlin metadata */
    public ct0.b captureInfo;

    /* renamed from: p, reason: from kotlin metadata */
    public final android.view.ViewGroup pluginLayout;

    /* renamed from: q */
    public final android.view.ViewGroup f176079q;

    /* renamed from: r */
    public final android.view.ViewGroup f176080r;

    /* renamed from: s, reason: from kotlin metadata */
    public java.lang.String editId;

    /* renamed from: t, reason: from kotlin metadata */
    public boolean isMediaMute;

    /* renamed from: u, reason: from kotlin metadata */
    public long maxCropVideoDurationMs;

    /* renamed from: v */
    public long f176084v;

    /* renamed from: w */
    public boolean f176085w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineEditorBaseVideoPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.editId = "";
        this.maxCropVideoDurationMs = 60000L;
        com.tencent.mars.xlog.Log.i(C(), "create TimelineEditorVideoPluginLayout instance[" + hashCode() + ']');
        android.app.Activity activity = (android.app.Activity) context;
        if (((android.view.ViewGroup) activity.findViewById(com.tencent.mm.R.id.lpx)).getChildCount() == 0) {
            ((android.view.ViewGroup) activity.getWindow().getDecorView().findViewById(android.R.id.content)).setAlpha(0.0f);
        }
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d0u, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.kxs);
        ((com.tencent.mm.ui.widget.InsectRelativeLayout) findViewById).setDiscardKeyboard(true);
        kotlin.jvm.internal.o.f(findViewById, "also(...)");
        this.pluginLayout = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f487306o85);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById2;
        this.f176079q = viewGroup;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.o87);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f176080r = (android.view.ViewGroup) findViewById3;
        android.view.View findViewById4 = viewGroup.findViewById(com.tencent.mm.R.id.o89);
        if (findViewById4 != null) {
            dq4.c.f242369a.f(findViewById4);
        }
    }

    public static /* synthetic */ void F(com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout timelineEditorBaseVideoPluginLayout, java.lang.Long l17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeVideo");
        }
        if ((i17 & 1) != 0) {
            l17 = null;
        }
        timelineEditorBaseVideoPluginLayout.E(l17);
    }

    private final r95.e getCurrentTrackPlayRange() {
        int i17;
        lp4.u uVar;
        rm5.v vVar;
        bp4.o1 o1Var = (bp4.o1) j(bp4.o1.class);
        if (o1Var == null || (i17 = o1Var.f23310i) < 0 || (uVar = (lp4.u) j(lp4.u.class)) == null || (vVar = uVar.f320429h) == null) {
            return null;
        }
        java.util.ArrayList arrayList = vVar.f397584l;
        rm5.j jVar = (rm5.j) arrayList.get(i17);
        long j17 = jVar.f397502d;
        long j18 = jVar.f397503e;
        r95.e eVar = new r95.e(j17, j18);
        if (jVar.f397515q.a()) {
            eVar = new r95.e(j17 - (jVar.f397515q.f397531c / 2), j18);
        }
        int i18 = i17 + 1;
        if (i18 >= arrayList.size()) {
            return eVar;
        }
        rm5.j jVar2 = (rm5.j) arrayList.get(i18);
        return jVar2.f397515q.a() ? new r95.e(eVar.f393455a, eVar.f393456b + (jVar2.f397515q.f397531c / 2)) : eVar;
    }

    public final void setSingleTrackPlayRange(boolean z17) {
        lp4.l0 l0Var;
        r95.e currentTrackPlayRange = getCurrentTrackPlayRange();
        if (currentTrackPlayRange != null) {
            lp4.l0 l0Var2 = (lp4.l0) j(lp4.l0.class);
            long j17 = currentTrackPlayRange.f393455a;
            if (l0Var2 != null) {
                l0Var2.B(j17, currentTrackPlayRange.f393456b);
            }
            if (!z17 || (l0Var = (lp4.l0) j(lp4.l0.class)) == null) {
                return;
            }
            l0Var.A(j17);
        }
    }

    public void A() {
        android.os.Bundle bundle;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.oy6);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        lp4.l0 l0Var = new lp4.l0((com.tencent.mm.videocomposition.play.VideoCompositionPlayView) findViewById, this);
        r95.b bVar = new r95.b();
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.configProvider;
        long j17 = 60000;
        if (recordConfigProvider != null) {
            j17 = recordConfigProvider.M.getLong("video_max_duration", 60000L);
            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineEditorModelParser", "getMaxDurationMs by parse:" + j17);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineEditorModelParser", "getMaxDurationMs by default:60000");
        }
        this.maxCropVideoDurationMs = j17;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = this.configProvider;
        long j18 = 0;
        if (recordConfigProvider2 != null) {
            j18 = recordConfigProvider2.M.getLong("video_track_max_duration", 0L);
            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineEditorModelParser", "getMaxTrackDurationMs by parse:" + j18);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineEditorModelParser", "getMaxDurationMs by default:0");
        }
        this.f176084v = j18;
        int B = i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a) / 2;
        s95.d0 d0Var = (s95.d0) bVar.a();
        d0Var.f405031n = B;
        d0Var.onChanged();
        int k17 = i65.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a) / 2;
        s95.d0 d0Var2 = (s95.d0) bVar.a();
        d0Var2.f405032o = k17;
        d0Var2.onChanged();
        new lp4.u(this, bVar);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        lp4.d1.A(new lp4.d1(context, this), null, 1, null);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.d7f);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        new yt3.i(this, (android.widget.ImageView) findViewById2, this);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.bet);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView editorInputView = new yt3.t((com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView) findViewById3, this).f465670f;
        editorInputView.setEnableClickOutsideConfirm(true);
        new yt3.m(this, this, editorInputView);
        new bp4.d1(this, this);
        yo4.p pVar = new yo4.p(this, this, G());
        pVar.f464290u = true;
        pVar.A().setBackground(com.tencent.mm.R.drawable.b8v);
        l0Var.f320376i = pVar;
        this.f176074i = pVar;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f487305o84);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        new yt3.q((android.widget.ImageView) findViewById4, this);
        new lp4.j0(this, this);
        lp4.p pVar2 = new lp4.p(this, this);
        l0Var.z(pVar2);
        new bp4.p2(this, this).z(pVar2);
        l0Var.z(new bp4.e4(this, this));
        new bp4.o1(this, this);
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.f484181d92);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        new bp4.z3((com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder) findViewById5, this);
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.f484180d91);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        l0Var.z(new lp4.a1((com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder) findViewById6, this));
        boolean z17 = false;
        new hp4.a(this, this, false);
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.d7d);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.d7u);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.d7t);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        l0Var.z(new cp4.r((android.view.ViewGroup) findViewById7, (com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder) findViewById8, (com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder) findViewById9, this));
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.f484183d95);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        l0Var.z(new ep4.j((android.view.ViewGroup) findViewById10, this));
        new bp4.p4(this, this);
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider3 = this.configProvider;
        if (recordConfigProvider3 != null && (bundle = recordConfigProvider3.M) != null) {
            z17 = bundle.getBoolean("KEY_FINDER_POST_OPEN_AIGC_DRAFT_PREVIEW_ONLY");
        }
        this.f176085w = z17;
    }

    public void B(it3.y navigator, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(navigator, "navigator");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        android.os.Bundle bundle = configProvider.M;
        if (bundle != null) {
            bundle.getBoolean("KEY_DISABLE_VIDEO_ENHANCEMENT", false);
            bp4.p4 p4Var = (bp4.p4) j(bp4.p4.class);
            if (p4Var != null) {
                p4Var.f23346h.setVisibility(8);
            }
        }
    }

    public java.lang.String C() {
        return "MicroMsg.TimelineEditorVideoPluginLayout";
    }

    public final void D() {
        bp4.p2 p2Var = (bp4.p2) j(bp4.p2.class);
        if (p2Var != null) {
            p2Var.A();
        }
        lp4.l0 l0Var = (lp4.l0) j(lp4.l0.class);
        if (l0Var != null) {
            l0Var.f320373f.pause();
        }
        yo4.p pVar = (yo4.p) j(yo4.p.class);
        if (pVar != null) {
            pVar.D();
        }
    }

    public final void E(java.lang.Long l17) {
        lp4.l0 l0Var;
        bp4.p2 p2Var = (bp4.p2) j(bp4.p2.class);
        if (p2Var != null) {
            p2Var.B();
        }
        lp4.l0 l0Var2 = (lp4.l0) j(lp4.l0.class);
        if (l0Var2 != null) {
            l0Var2.f320373f.h();
        }
        yo4.p pVar = (yo4.p) j(yo4.p.class);
        if (pVar != null) {
            pVar.G();
        }
        if (l17 == null || (l0Var = (lp4.l0) j(lp4.l0.class)) == null) {
            return;
        }
        l0Var.A(l17.longValue());
    }

    public final boolean G() {
        android.os.Bundle bundle;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.configProvider;
        if (recordConfigProvider == null || (bundle = recordConfigProvider.M) == null) {
            return false;
        }
        return bundle.getBoolean("key_use_music_panel_v2");
    }

    public final void H() {
        android.view.ViewGroup viewGroup = this.pluginLayout;
        viewGroup.setVisibility(0);
        viewGroup.animate().cancel();
        viewGroup.animate().alpha(1.0f).setDuration(100L).start();
    }

    public final ct0.b getCaptureInfo() {
        return this.captureInfo;
    }

    public final com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider getConfigProvider() {
        return this.configProvider;
    }

    public final rm5.j getCurrentTrack() {
        int i17;
        lp4.u uVar;
        rm5.v vVar;
        bp4.o1 o1Var = (bp4.o1) j(bp4.o1.class);
        if (o1Var == null || (i17 = o1Var.f23310i) < 0 || (uVar = (lp4.u) j(lp4.u.class)) == null || (vVar = uVar.f320429h) == null) {
            return null;
        }
        return (rm5.j) vVar.f397584l.get(i17);
    }

    public final java.lang.String getEditId() {
        return this.editId;
    }

    public final long getMaxCropVideoDurationMs() {
        return this.maxCropVideoDurationMs;
    }

    public final android.view.ViewGroup getPluginLayout() {
        return this.pluginLayout;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void m(it3.y navigator, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(navigator, "navigator");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        this.configProvider = configProvider;
        this.f176076n = navigator;
        android.os.Bundle bundle = configProvider.M;
        if (bundle != null) {
            bundle.setClassLoader(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.class.getClassLoader());
        }
        dw3.c0.f244182a.c(configProvider);
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineEditorFirstEnterOperate", "checkResUpdate");
        ou3.q qVar = ou3.q.f348970c;
        qVar.a();
        qVar.j();
        A();
        yo4.p pVar = (yo4.p) j(yo4.p.class);
        if (pVar != null) {
            pVar.f464281i.setImageDrawable(pVar.f464278f.getContext().getResources().getDrawable(com.tencent.mm.R.raw.popvideo_post_selected_origin));
        }
        yt3.m mVar = (yt3.m) j(yt3.m.class);
        if (mVar != null) {
            mVar.A(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f481057jk), null);
        }
        B(navigator, configProvider);
        super.m(navigator, configProvider);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[SYNTHETIC] */
    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttach() {
        /*
            r7 = this;
            super.onAttach()
            java.util.ArrayList r0 = r7.getPluginList()
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r0.next()
            yt3.r2 r1 = (yt3.r2) r1
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r2 = r7.configProvider
            r3 = 0
            if (r2 == 0) goto L58
            com.tencent.mm.component.api.jumper.UICustomParam r2 = r2.f155677o
            if (r2 == 0) goto L58
            java.util.Map r2 = r2.f64779h
            if (r2 == 0) goto L58
            java.lang.String r4 = r1.name()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "nameTranslate "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.TimelineEditorPluginUtil"
            com.tencent.mars.xlog.Log.i(r6, r5)
            java.lang.Class<yo4.p> r5 = yo4.p.class
            java.lang.String r5 = r5.getName()
            boolean r5 = kotlin.jvm.internal.o.b(r4, r5)
            if (r5 == 0) goto L49
            java.lang.String r4 = "plugin_music"
        L49:
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L58
            boolean r2 = r2.booleanValue()
            goto L59
        L58:
            r2 = r3
        L59:
            r2 = r2 ^ 1
            if (r2 == 0) goto L5e
            goto L60
        L5e:
            r3 = 8
        L60:
            r1.setVisibility(r3)
            goto Lb
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout.onAttach():void");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public boolean onBackPress() {
        if (super.onBackPress()) {
            return true;
        }
        if (!this.f176085w) {
            it3.y yVar = this.f176076n;
            if (yVar == null) {
                return true;
            }
            it3.y.a(yVar, 0, null, 2, null);
            return true;
        }
        android.content.Context context = getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null) {
            return true;
        }
        activity.finish();
        return true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onDetach() {
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView;
        super.onDetach();
        lp4.l0 l0Var = (lp4.l0) j(lp4.l0.class);
        if (l0Var != null && (videoCompositionPlayView = l0Var.f320373f) != null) {
            videoCompositionPlayView.stop();
        }
        lp4.l0 l0Var2 = (lp4.l0) j(lp4.l0.class);
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView2 = l0Var2 != null ? l0Var2.f320373f : null;
        if (videoCompositionPlayView2 == null) {
            return;
        }
        videoCompositionPlayView2.setAlpha(0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x033d  */
    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(ct0.b r23) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout.r(ct0.b):void");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.AutoRegisterPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void release() {
        super.release();
        so4.g.f410776a.i();
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void reset() {
        super.reset();
        this.f176080r.setVisibility(0);
        this.f176079q.setVisibility(0);
    }

    public final void setCaptureInfo(ct0.b bVar) {
        this.captureInfo = bVar;
    }

    public final void setConfigProvider(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider) {
        this.configProvider = recordConfigProvider;
    }

    public final void setEditId(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.editId = str;
    }

    public final void setMaxCropVideoDurationMs(long j17) {
        this.maxCropVideoDurationMs = j17;
    }

    public final void setMediaMute(boolean z17) {
        this.isMediaMute = z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:299:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:425:? A[RETURN, SYNTHETIC] */
    @Override // ju3.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(ju3.c0 r38, android.os.Bundle r39) {
        /*
            Method dump skipped, instructions count: 2038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout.w(ju3.c0, android.os.Bundle):void");
    }

    public final void z() {
        android.view.ViewGroup viewGroup = this.pluginLayout;
        viewGroup.animate().cancel();
        viewGroup.animate().alpha(0.0f).setDuration(100L).withEndAction(new pp4.a(this)).start();
    }
}
