package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u001a\u0010\u0016\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u001aR(\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u001a¨\u0006%"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveMiniView;", "Lcom/tencent/mm/live/core/mini/AbsLiveMiniView;", "", "visibility", "Ljz5/f0;", "setLiveFloatUpperView", "", "coverUrl", "setBgCoverUrl", "Landroid/graphics/Bitmap;", "bitmap", "setFloatBitmapCover", "Lcom/tencent/mm/plugin/finder/live/view/tb;", "callback", "setupClickListener", "newState", "setState", "getCurrentState", "e", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "value", org.chromium.base.BaseSwitches.V, "setCoverUrl", "(Ljava/lang/String;)V", "w", "setAnchorUsername", "anchorUsername", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class FinderLiveMiniView extends com.tencent.mm.live.core.mini.AbsLiveMiniView {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String TAG;

    /* renamed from: f, reason: collision with root package name */
    public int f116034f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f116035g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f116036h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f116037i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f116038m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f116039n;

    /* renamed from: o, reason: collision with root package name */
    public final em2.d0 f116040o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.mini.FinderMiniWindowFloatLayout f116041p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView f116042q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.ViewGroup f116043r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f116044s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.tb f116045t;

    /* renamed from: u, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f116046u;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public java.lang.String coverUrl;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public java.lang.String anchorUsername;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View.OnClickListener f116049x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveMiniView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static /* synthetic */ void h(com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView finderLiveMiniView, android.widget.ImageView imageView, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadBackgroundImage");
        }
        if ((i17 & 1) != 0) {
            imageView = finderLiveMiniView.f116037i;
        }
        finderLiveMiniView.g(imageView);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0289 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView r24, boolean r25, gk2.e r26, int r27, org.json.JSONObject r28, org.json.JSONObject r29, org.json.JSONObject r30, android.graphics.Point r31, int r32, java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 1007
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView.j(com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView, boolean, gk2.e, int, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, android.graphics.Point, int, java.lang.Object):void");
    }

    private final void setAnchorUsername(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.TAG, "set anchorUsername:" + str);
        this.anchorUsername = str;
    }

    private final void setCoverUrl(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.TAG, "set coverUrl:" + str);
        this.coverUrl = str;
    }

    @Override // com.tencent.mm.live.core.mini.AbsLiveMiniView
    public void a(int i17) {
        int i18 = this.f116034f;
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        this.f116034f = i18 | i17;
        com.tencent.mars.xlog.Log.i(this.TAG, "applyState applyState:" + i17 + ", state:" + this.f116034f);
        m();
    }

    @Override // com.tencent.mm.live.core.mini.AbsLiveMiniView
    public void b(boolean z17, boolean z18) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.kif);
        if (z17) {
            com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveRootView finderLiveAudioWaveRootView = (com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveRootView) findViewById(com.tencent.mm.R.id.kig);
            finderLiveAudioWaveRootView.getTitleTxt().setText(getContext().getResources().getString(com.tencent.mm.R.string.e2c));
            finderLiveAudioWaveRootView.titleTxt.setTextSize(1, 12.0f);
            int h17 = i65.a.h(finderLiveAudioWaveRootView.getContext(), com.tencent.mm.R.dimen.f479688cn);
            int h18 = i65.a.h(finderLiveAudioWaveRootView.getContext(), com.tencent.mm.R.dimen.f479673ca);
            i65.a.h(finderLiveAudioWaveRootView.getContext(), com.tencent.mm.R.dimen.f479646bl);
            float b17 = i65.a.b(finderLiveAudioWaveRootView.getContext(), 2);
            finderLiveAudioWaveRootView.leftWave.setLayoutParams(new android.widget.LinearLayout.LayoutParams(h18, h17));
            finderLiveAudioWaveRootView.rightWave.setLayoutParams(new android.widget.LinearLayout.LayoutParams(h18, h17));
            finderLiveAudioWaveRootView.leftWave.setTranslationX(i65.a.b(finderLiveAudioWaveRootView.getContext(), 2));
            finderLiveAudioWaveRootView.rightWave.setTranslationX(-i65.a.b(finderLiveAudioWaveRootView.getContext(), 2));
            float f17 = h18;
            finderLiveAudioWaveRootView.leftWave.setArcWidth(f17);
            finderLiveAudioWaveRootView.rightWave.setArcWidth(f17);
            finderLiveAudioWaveRootView.leftWave.setWaveWidth(b17);
            finderLiveAudioWaveRootView.rightWave.setWaveWidth(b17);
            finderLiveAudioWaveRootView.leftWave.setWaveStart(true, false);
            finderLiveAudioWaveRootView.rightWave.setWaveStart(true, true);
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.kie);
            kotlin.jvm.internal.o.d(imageView);
            g(imageView);
            frameLayout.setVisibility(0);
        } else {
            frameLayout.setVisibility(8);
        }
        if (z18) {
            ((kotlinx.coroutines.flow.h3) this.f116046u).k(java.lang.Boolean.valueOf(z17));
        }
    }

    @Override // com.tencent.mm.live.core.mini.AbsLiveMiniView
    public int c() {
        return 15;
    }

    @Override // com.tencent.mm.live.core.mini.AbsLiveMiniView
    public void d() {
        android.view.View.OnClickListener a17;
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        dk2.ef efVar = dk2.ef.f233372a;
        ml2.r0.Oj(r0Var, 8, null, null, java.lang.Boolean.valueOf(dk2.ef.f233386h.f255169b.f255178b == 0), dk2.ef.F, 6, null);
        com.tencent.mm.plugin.finder.live.view.tb tbVar = this.f116045t;
        if (tbVar == null || (a17 = tbVar.a()) == null) {
            return;
        }
        a17.onClick(this);
    }

    @Override // com.tencent.mm.live.core.mini.AbsLiveMiniView
    public void e(boolean z17) {
        int i17 = z17 ? 1 : 2;
        dk2.ef efVar = dk2.ef.f233372a;
        em2.u uVar = dk2.ef.f233386h;
        em2.w wVar = uVar.f255169b;
        if (z17) {
            if (wVar.f255183g > 0) {
                wVar.f255182f += c01.id.c() - wVar.f255183g;
            }
            wVar.f255183g = 0L;
        } else {
            wVar.getClass();
            wVar.f255183g = c01.id.c();
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveMiniWindowReporter", "onPlayBtnClick resume:" + z17 + ", lastPauseTime:" + wVar.f255183g + ", totalPauseTime:" + wVar.f255182f);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Oj((ml2.r0) c17, 7, null, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(uVar.f255169b.f255178b == 0), dk2.ef.F, 2, null);
    }

    @Override // com.tencent.mm.live.core.mini.AbsLiveMiniView
    public void f(int i17) {
        int i18 = this.f116034f;
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        this.f116034f = i18 & (~i17);
        com.tencent.mars.xlog.Log.i(this.TAG, "releaseState releaseState:" + i17 + ", state:" + this.f116034f);
        m();
    }

    public final void g(android.widget.ImageView imageView) {
        java.lang.String str;
        java.lang.String str2 = this.coverUrl;
        if (str2 == null || str2.length() == 0) {
            ya2.b2 b17 = ya2.h.f460484a.b(this.anchorUsername);
            str = b17 != null ? b17.field_liveCoverImg : null;
        } else {
            str = this.coverUrl;
        }
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.i(this.TAG, "loadBackgroundImage backgroundUrl is empty!");
            return;
        }
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128356f));
        com.tencent.mm.plugin.finder.live.view.w6 w6Var = new com.tencent.mm.plugin.finder.live.view.w6(imageView, this);
        a17.getClass();
        a17.f447873d = w6Var;
        a17.f();
    }

    @Override // com.tencent.mm.live.core.mini.AbsLiveMiniView
    /* renamed from: getCurrentState, reason: from getter */
    public int getF116034f() {
        return this.f116034f;
    }

    public final java.lang.String getTAG() {
        return this.TAG;
    }

    public final void i(boolean z17) {
        em2.d0 d0Var = this.f116040o;
        if (d0Var.f255109s == 0) {
            em2.e0 e0Var = (em2.e0) ((jz5.n) d0Var.f255094d).getValue();
            if (!(e0Var.f282613a != null)) {
                com.tencent.mars.xlog.Log.i("Finder.FloatLayoutRatioAdapter", "onAnchorAudioChange layout isInitialized = false");
                return;
            }
            int childCount = e0Var.d().getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                if (e0Var.d().getChildAt(i17) instanceof yj2.e) {
                    android.view.View childAt = e0Var.d().getChildAt(i17);
                    kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.mic.widget.preview.FinderLiveMicCommonPreviewWidget");
                    ((yj2.e) childAt).f(z17);
                }
            }
        }
    }

    public final void k(java.lang.String str, java.lang.String str2, boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i(this.TAG, "setupMiniView isAnchor:" + z17);
        this.f116044s = z17;
        com.tencent.mm.plugin.finder.live.view.mini.FinderMiniWindowFloatLayout finderMiniWindowFloatLayout = this.f116041p;
        if (z17) {
            finderMiniWindowFloatLayout.setVisibility(8);
        } else {
            finderMiniWindowFloatLayout.setRadius(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8));
            finderMiniWindowFloatLayout.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView = this.f116042q;
        liveVoiceRoomLayoutView.setVisibility(8);
        android.view.ViewGroup viewGroup = this.f116043r;
        viewGroup.setVisibility(8);
        em2.d0 d0Var = this.f116040o;
        d0Var.getClass();
        d0Var.f255114x = this;
        d0Var.f255113w = finderMiniWindowFloatLayout;
        d0Var.f255115y = liveVoiceRoomLayoutView;
        d0Var.f255116z = viewGroup;
        if (finderMiniWindowFloatLayout != null) {
            finderMiniWindowFloatLayout.setAdapter((em2.e0) ((jz5.n) d0Var.f255094d).getValue());
        }
        if (finderMiniWindowFloatLayout != null) {
            finderMiniWindowFloatLayout.setLayoutManager(new com.tencent.mm.view.ratio.a());
        }
        ((em2.i) ((jz5.n) d0Var.f255095e).getValue()).b(liveVoiceRoomLayoutView);
        setAnchorUsername(str);
        setCoverUrl(str2);
        this.f116037i.setImageDrawable(null);
        if (z18) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f116039n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(weImageView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView", "setupMiniView", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            weImageView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(weImageView, "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView", "setupMiniView", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (z17) {
            return;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f116039n;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(weImageView2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView", "setupMiniView", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        weImageView2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(weImageView2, "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView", "setupMiniView", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f116039n.setOnClickListener(this.f116049x);
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.finder.live.view.a7(this, null), 3, null);
    }

    public final void l(boolean z17) {
        android.widget.ImageView imageView = this.f116037i;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView", "switchStateViewVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(imageView, "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView", "switchStateViewVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view = this.f116036h;
        int i18 = z17 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView", "switchStateViewVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView", "switchStateViewVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f116039n.setOnClickListener(z17 ? null : this.f116049x);
    }

    public final void m() {
        gk2.e eVar;
        int i17;
        boolean z17 = pm0.v.z(this.f116034f, 4);
        android.widget.ImageView imageView = this.f116038m;
        android.widget.TextView textView = this.f116035g;
        if (z17) {
            com.tencent.mars.xlog.Log.i(this.TAG, "showFinishView");
            setLiveFloatUpperView(0);
            textView.setText(getContext().getResources().getString(com.tencent.mm.R.string.gdy));
            l(true);
            h(this, null, 1, null);
            imageView.setVisibility(0);
            int childCount = getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View childAt = getChildAt(i18);
                if (!(childAt.getId() != com.tencent.mm.R.id.fb9)) {
                    childAt = null;
                }
                if (childAt != null) {
                    childAt.getVisibility();
                }
            }
            setContentDescription(getContext().getResources().getString(com.tencent.mm.R.string.jpa));
            sendAccessibilityEvent(128);
            if (!this.f116044s || (eVar = dk2.ef.I) == null) {
                return;
            }
            com.tencent.mm.plugin.finder.assist.u8 u8Var = com.tencent.mm.plugin.finder.assist.u8.f102599a;
            if (com.tencent.mm.plugin.finder.assist.u8.f102600b <= 0 || (i17 = com.tencent.mm.plugin.finder.assist.u8.f102606h) != 0) {
                return;
            }
            com.tencent.mm.plugin.finder.assist.u8.f102606h = i17 + 1;
            u8Var.b(eVar, com.tencent.mm.plugin.finder.assist.u8.f102604f > 0 ? 1 : 0, 0, "anchorEndInMiniView", "0-vBitrate:" + hn0.v.f282442c);
            return;
        }
        if (pm0.v.z(this.f116034f, 2)) {
            textView.setText(getContext().getResources().getString(com.tencent.mm.R.string.gdz));
            l(true);
            imageView.setVisibility(8);
            h(this, null, 1, null);
            setContentDescription(getContext().getResources().getString(com.tencent.mm.R.string.jpd));
            return;
        }
        if (pm0.v.z(this.f116034f, 1)) {
            textView.setText(getContext().getResources().getString(com.tencent.mm.R.string.gdv));
            l(true);
            imageView.setVisibility(0);
            h(this, null, 1, null);
            setContentDescription(getContext().getResources().getString(com.tencent.mm.R.string.jpc));
            sendAccessibilityEvent(128);
            return;
        }
        if (!pm0.v.z(this.f116034f, 8)) {
            l(false);
            setContentDescription(getContext().getResources().getString(com.tencent.mm.R.string.jp_));
            return;
        }
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.gdx);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = getContext().getResources().getString(com.tencent.mm.R.string.jpb);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        l(true);
        imageView.setVisibility(8);
        textView.setText(string);
        h(this, null, 1, null);
        setContentDescription(string2);
        sendAccessibilityEvent(128);
    }

    @Override // com.tencent.mm.live.core.mini.AbsLiveMiniView
    public void setBgCoverUrl(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.TAG, "setCoverUrl:" + str);
        setCoverUrl(str);
    }

    @Override // com.tencent.mm.live.core.mini.AbsLiveMiniView
    public void setFloatBitmapCover(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.view.y6(this, bitmap));
        }
    }

    @Override // com.tencent.mm.live.core.mini.AbsLiveMiniView
    public void setLiveFloatUpperView(int i17) {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.fb9);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView", "setLiveFloatUpperView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView", "setLiveFloatUpperView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.live.core.mini.AbsLiveMiniView
    public void setState(int i17) {
        com.tencent.mars.xlog.Log.i(this.TAG, "setState newState:" + i17 + ", state:" + this.f116034f);
        this.f116034f = i17;
        m();
    }

    public final void setupClickListener(com.tencent.mm.plugin.finder.live.view.tb callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f116045t = callback;
        setOnClickListener(callback.b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveMiniView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.TAG = "FinderLiveMiniView";
        this.f116040o = new em2.d0(context, 0, 2, null);
        this.f116046u = kotlinx.coroutines.flow.i3.a(java.lang.Boolean.FALSE);
        this.coverUrl = "";
        this.anchorUsername = "";
        android.view.View.inflate(context, com.tencent.mm.R.layout.avk, this);
        setBackgroundColor(-16777216);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.fbo);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f116041p = (com.tencent.mm.plugin.finder.live.view.mini.FinderMiniWindowFloatLayout) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.qrr);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f116042q = (com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f485464rt3);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f116043r = (android.view.ViewGroup) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.fbc);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f116035g = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.fb_);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f116036h = findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.fbb);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById6;
        this.f116037i = imageView;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.fba);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f116038m = (android.widget.ImageView) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.f485416qu0);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f116039n = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById8;
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(new fo0.p(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8)));
        l(false);
        setContentDescription(context.getResources().getString(com.tencent.mm.R.string.jp_));
        this.f116049x = new com.tencent.mm.plugin.finder.live.view.t6(this, context);
    }

    public /* synthetic */ FinderLiveMiniView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }
}
