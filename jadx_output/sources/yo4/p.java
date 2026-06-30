package yo4;

/* loaded from: classes5.dex */
public final class p extends yt3.a implements android.view.View.OnClickListener, bp4.b0, bp4.a0, bp4.c0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f464278f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f464279g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f464280h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f464281i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f464282m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f464283n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f464284o;

    /* renamed from: p, reason: collision with root package name */
    public final iu3.i f464285p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f464286q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f464287r;

    /* renamed from: s, reason: collision with root package name */
    public final st3.k f464288s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f464289t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f464290u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f464291v;

    /* renamed from: w, reason: collision with root package name */
    public long f464292w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f464293x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f464294y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.view.ViewGroup parent, ju3.d0 status, boolean z17) {
        super(status, null);
        java.lang.String str;
        android.view.View view;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f464278f = parent;
        this.f464279g = z17;
        android.view.View findViewById = parent.findViewById(com.tencent.mm.R.id.d7_);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        this.f464280h = imageView;
        android.view.View findViewById2 = parent.findViewById(com.tencent.mm.R.id.d7a);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById2;
        this.f464281i = imageView2;
        android.view.View findViewById3 = parent.findViewById(com.tencent.mm.R.id.d7b);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f464282m = findViewById3;
        this.f464283n = jz5.h.b(new yo4.i(this));
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f464285p = new iu3.i(context);
        android.view.View findViewById4 = parent.findViewById(com.tencent.mm.R.id.f487304o83);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f464286q = findViewById4;
        st3.k kVar = new st3.k();
        this.f464288s = kVar;
        this.f464289t = true;
        this.f464291v = true;
        this.f464292w = -1L;
        this.f464293x = new java.util.ArrayList();
        i95.m c17 = i95.n0.c(e42.e0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        boolean fj6 = ((h62.d) ((e42.e0) c17)).fj(e42.d0.clicfg_show_mediacomponent_audio, true);
        this.f464289t = fj6;
        E(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f480929fm), null, null, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditAddMusicPlugin", "forceEnable " + fj6);
        imageView2.setImageDrawable(parent.getContext().getResources().getDrawable(com.tencent.mm.R.raw.popvideo_post_selected));
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(parent.getContext(), com.tencent.mm.R.raw.icons_filled_sound, -1));
        imageView.setOnClickListener(this);
        if (fj6) {
            A().setOnVisibleChangeCallback(new yo4.d(status, this));
            A().setCallback(new yo4.e(status, this, (android.os.Bundle) ((jz5.n) kVar.f412552g).getValue(), com.tencent.mm.plugin.vlog.model.i0.f175614f));
            com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView A = A();
            mv3.a aVar = A instanceof mv3.a ? (mv3.a) A : null;
            if (aVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EditAddMusicPlugin", "[setupMusicPickerChannels] audioPanel is not FinderMusicPickerDrawer, skip");
            } else {
                com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout d17 = aVar.d();
                com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.view.FinderMusicPickerComponentLayout finderMusicPickerComponentLayout = d17 instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.view.FinderMusicPickerComponentLayout ? (com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.view.FinderMusicPickerComponentLayout) d17 : null;
                if (finderMusicPickerComponentLayout == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.EditAddMusicPlugin", "[setupMusicPickerChannels] contentView is not FinderMusicPickerComponentLayout, skip");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.EditAddMusicPlugin", "[setupMusicPickerChannels] hook clip / volume channels onto pickerLayout=" + finderMusicPickerComponentLayout.hashCode());
                    finderMusicPickerComponentLayout.setMusicClipInitialRangeProvider(yo4.j.f464238d);
                    finderMusicPickerComponentLayout.setOnMusicClipChange(new yo4.k(this));
                    finderMusicPickerComponentLayout.setMusicClipPlayProgressListenerRegistrar(new yo4.l(this));
                    yo4.m mVar = yo4.m.f464261d;
                    yo4.n nVar = new yo4.n(this);
                    com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0) finderMusicPickerComponentLayout.b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0.class);
                    if (e0Var != null) {
                        e0Var.A = mVar;
                        e0Var.B = nVar;
                        e0Var.C = null;
                        e0Var.D = 100;
                    }
                }
            }
            str = "MicroMsg.EditAddMusicPlugin";
            view = findViewById4;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            str = "MicroMsg.EditAddMusicPlugin";
            view = findViewById4;
            yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        A().enableSelectFinderVideo(com.tencent.mm.plugin.vlog.model.v0.a());
        com.tencent.mars.xlog.Log.i(str, "get shouldShowSelectFinderVideoTooltip " + A());
        if (!A().getShouldShowSelectFinderVideoRedDot()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            android.view.View view2 = view;
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        android.view.View view3 = view;
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.postDelayed(new yo4.f(this), 5000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void K(yo4.p r21, ct0.b r22, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r23, boolean r24, boolean r25, boolean r26, int r27, java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yo4.p.K(yo4.p, ct0.b, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider, boolean, boolean, boolean, int, java.lang.Object):void");
    }

    public final com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView A() {
        return (com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView) this.f464283n.getValue();
    }

    public final boolean B() {
        return A().getMuteOrigin();
    }

    public final void C() {
        A().toggleLyrics(false);
    }

    public final void D() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditAddMusicPlugin", "pauseMusic");
        this.f464285p.a();
        java.util.Iterator it = this.f464293x.iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
    }

    public final void E(java.lang.Integer num, java.lang.Integer num2, java.lang.String str, int i17) {
        com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView.resetStyle$default(A(), num, num2, str, java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f482142b40), null, java.lang.Integer.valueOf(com.tencent.mm.R.raw.popvideo_post_selected_origin), null, null, null, null, null, null, null, true, 8144, null);
        if (i17 != -1) {
            this.f464281i.setImageDrawable(this.f464278f.getContext().getResources().getDrawable(i17));
        }
    }

    public final void F() {
        this.f464285p.f(0L);
        java.util.Iterator it = this.f464293x.iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
    }

    public final void G() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resumeMusic soundTrackType=");
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = this.f464287r;
        sb6.append(audioCacheInfo != null ? java.lang.Integer.valueOf(audioCacheInfo.f155719p) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditAddMusicPlugin", sb6.toString());
        if (this.f464287r == null) {
            return;
        }
        this.f464285p.e();
        java.util.Iterator it = this.f464293x.iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
    }

    public final void H(long j17) {
        this.f464285p.f(j17);
        java.util.Iterator it = this.f464293x.iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
    }

    public final void I(java.lang.String editId) {
        kotlin.jvm.internal.o.g(editId, "editId");
        android.os.Bundle bundle = (android.os.Bundle) ((jz5.n) this.f464288s.f412552g).getValue();
        if (bundle != null) {
            bundle.putString("KEY_EDIT_ID", editId);
        }
    }

    public final void J(java.util.List audioList) {
        kotlin.jvm.internal.o.g(audioList, "audioList");
        A().setLocalAudioList(audioList);
    }

    public final void L() {
        if (!A().isShow()) {
            oo4.d.f347197a.h(25496, (android.os.Bundle) ((jz5.n) this.f464288s.f412552g).getValue());
        }
        A().setShow(true);
    }

    public final void M(java.lang.String str) {
        if (this.f464279g) {
            android.widget.TextView textView = this.f464284o;
            android.view.ViewGroup viewGroup = this.f464278f;
            if (textView == null) {
                android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.f486050k03);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new yo4.o(this));
                }
                if (findViewById != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "updateMusicTipsBar", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "updateMusicTipsBar", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.f464284o = findViewById != null ? (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.jzj) : null;
            }
            if (kotlin.jvm.internal.o.b(str, "")) {
                str = i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.lfc);
            }
            android.widget.TextView textView2 = this.f464284o;
            if (textView2 != null) {
                textView2.setText(str);
            }
            android.widget.TextView textView3 = this.f464284o;
            if (textView3 != null) {
                textView3.requestFocus();
            }
        }
    }

    @Override // bp4.b0
    public void b(com.tencent.mm.plugin.vlog.model.h1 h1Var, long j17, boolean z17) {
    }

    @Override // bp4.a0
    public void c(long j17) {
    }

    @Override // bp4.c0
    public void h(long j17, java.lang.Object obj) {
        H(j17);
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        if (A().onBackPress()) {
            return true;
        }
        A().reset();
        wt3.u uVar = wt3.v.f449504h;
        wt3.v vVar = wt3.v.f449505i;
        if (vVar == null) {
            return false;
        }
        vVar.a();
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f464291v) {
            this.f464294y = this.f464286q.getVisibility() == 0;
            android.view.View view2 = this.f464286q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            L();
            nu3.i iVar = nu3.i.f340218a;
            nu3.i.c(iVar, "KEY_CLICK_MUSIC_COUNT_INT", 0, 2, null);
            iVar.b(6);
            iVar.d(5);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void onDetach() {
        onPause();
    }

    @Override // bp4.a0
    public void onFinish() {
    }

    @Override // yt3.r2
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditAddMusicPlugin", "pauseAudio");
        D();
    }

    @Override // yt3.r2
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
    }

    @Override // yt3.r2
    public void onResume() {
        if (this.f464290u || !A().getWithMusic()) {
            return;
        }
        G();
    }

    @Override // bp4.c0
    public void pause() {
    }

    @Override // yt3.r2
    public void release() {
        reset();
        this.f464287r = null;
        this.f464285p.d();
        A().destroy();
    }

    @Override // yt3.r2
    public void reset() {
        this.f464281i.setVisibility(8);
        this.f464287r = null;
        iu3.i iVar = this.f464285p;
        com.tencent.mars.xlog.Log.i(iVar.f295007b, "reset music");
        kk4.v vVar = iVar.f295008c;
        if (vVar != null) {
            vVar.stop();
        }
        kk4.v vVar2 = iVar.f295008c;
        if (vVar2 != null) {
            vVar2.recycle();
        }
        iVar.f295008c = null;
    }

    @Override // bp4.c0
    public void resume() {
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        if (this.f464289t) {
            android.view.View view = this.f464282m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void z() {
        st3.k kVar = this.f464288s;
        if (kVar.f412551f == st3.v.f412605d && kVar.f412550e) {
            L();
        }
    }
}
