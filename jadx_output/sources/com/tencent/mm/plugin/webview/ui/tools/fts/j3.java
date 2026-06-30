package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes15.dex */
public final class j3 {
    public z21.e A;
    public final com.tencent.mm.sdk.platformtools.n3 B;
    public boolean C;
    public java.lang.String D;
    public final android.animation.ValueAnimator.AnimatorUpdateListener E;
    public final com.tencent.mm.sdk.platformtools.b4 F;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f184451a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f184452b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.fts.w2 f184453c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.fts.w2 f184454d;

    /* renamed from: e, reason: collision with root package name */
    public final int f184455e;

    /* renamed from: f, reason: collision with root package name */
    public final int f184456f;

    /* renamed from: g, reason: collision with root package name */
    public final android.animation.ValueAnimator f184457g;

    /* renamed from: h, reason: collision with root package name */
    public final android.animation.ValueAnimator f184458h;

    /* renamed from: i, reason: collision with root package name */
    public final android.animation.ValueAnimator f184459i;

    /* renamed from: j, reason: collision with root package name */
    public final android.animation.ValueAnimator f184460j;

    /* renamed from: k, reason: collision with root package name */
    public final android.animation.ValueAnimator f184461k;

    /* renamed from: l, reason: collision with root package name */
    public db5.d5 f184462l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f184463m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.transvoice.ui.SoundWaveView f184464n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f184465o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup f184466p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewGroup f184467q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f184468r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f184469s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f184470t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewGroup f184471u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f184472v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f184473w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f184474x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f184475y;

    /* renamed from: z, reason: collision with root package name */
    public int f184476z;

    public j3(android.content.Context context, java.lang.ref.WeakReference uIWeakReference) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(uIWeakReference, "uIWeakReference");
        this.f184451a = context;
        this.f184452b = uIWeakReference;
        com.tencent.mm.plugin.webview.ui.tools.fts.w2 w2Var = com.tencent.mm.plugin.webview.ui.tools.fts.w2.f184707d;
        this.f184453c = w2Var;
        this.f184454d = w2Var;
        this.f184455e = com.tencent.mm.ui.zk.a(context, 0);
        this.f184456f = com.tencent.mm.ui.zk.a(context, 25);
        this.f184457g = android.animation.ValueAnimator.ofInt(250, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT).setDuration(200L);
        this.f184458h = android.animation.ValueAnimator.ofInt(40, 800).setDuration(200L);
        this.f184459i = android.animation.ValueAnimator.ofInt(72, 0).setDuration(200L);
        this.f184460j = android.animation.ValueAnimator.ofInt(22, 0).setDuration(200L);
        this.f184461k = android.animation.ValueAnimator.ofInt(8, 0).setDuration(200L);
        this.B = new com.tencent.mm.plugin.webview.ui.tools.fts.f3(this);
        this.D = "";
        this.E = new com.tencent.mm.plugin.webview.ui.tools.fts.i3(this);
        this.F = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.webview.ui.tools.fts.z2(this), true);
    }

    public static final void a(com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var) {
        if (j3Var.D.length() > 0) {
            j3Var.D = r26.n0.u0(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.v(j3Var.D, "。", " ", false, 4, null), "\\.", " ", false), "，", " ", false), ",", " ", false)).toString();
        }
    }

    public static final void b(com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var) {
        com.tencent.mm.plugin.webview.ui.tools.fts.w2 w2Var = j3Var.f184454d;
        if (w2Var != j3Var.f184453c) {
            int ordinal = w2Var.ordinal();
            if (ordinal == 1) {
                j3Var.c();
            } else if (ordinal == 2) {
                j3Var.d();
            }
            int ordinal2 = j3Var.f184453c.ordinal();
            if (ordinal2 == 1) {
                android.view.View view = j3Var.f184470t;
                kotlin.jvm.internal.o.d(view);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSVoiceSearchHelper", "activeNewVoice2txtCancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSVoiceSearchHelper", "activeNewVoice2txtCancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = j3Var.f184469s;
                kotlin.jvm.internal.o.d(weImageView);
                android.content.Context context = j3Var.f184451a;
                weImageView.r(context.getResources().getColor(com.tencent.mm.R.color.f478712f3), 0.9f);
                android.view.View view2 = j3Var.f184468r;
                kotlin.jvm.internal.o.d(view2);
                view2.setBackgroundDrawable(context.getResources().getDrawable(com.tencent.mm.R.drawable.asz));
                android.view.View view3 = j3Var.f184468r;
                kotlin.jvm.internal.o.d(view3);
                view3.animate().scaleX(1.2f).scaleY(1.2f).setDuration(100L).start();
                android.widget.TextView textView = j3Var.f184465o;
                kotlin.jvm.internal.o.d(textView);
                textView.setVisibility(8);
                return;
            }
            if (ordinal2 != 2) {
                return;
            }
            android.view.View view4 = j3Var.f184472v;
            kotlin.jvm.internal.o.d(view4);
            view4.animate().translationY(0.0f).alpha(1.0f).setDuration(100L).withEndAction(new com.tencent.mm.plugin.webview.ui.tools.fts.y2(j3Var)).start();
            android.view.View view5 = j3Var.f184473w;
            kotlin.jvm.internal.o.d(view5);
            view5.animate().translationY(0.0f).alpha(1.0f).setDuration(100L).start();
            android.view.View view6 = j3Var.f184474x;
            kotlin.jvm.internal.o.d(view6);
            view6.animate().translationY(0.0f).setDuration(100L).start();
            com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView = j3Var.f184464n;
            kotlin.jvm.internal.o.d(soundWaveView);
            soundWaveView.setVisibility(0);
            com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView2 = j3Var.f184464n;
            kotlin.jvm.internal.o.d(soundWaveView2);
            android.view.ViewGroup.LayoutParams layoutParams = soundWaveView2.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((android.widget.RelativeLayout.LayoutParams) layoutParams).bottomMargin = 0;
            com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView3 = j3Var.f184464n;
            kotlin.jvm.internal.o.d(soundWaveView3);
            soundWaveView3.requestLayout();
            android.widget.TextView textView2 = j3Var.f184465o;
            kotlin.jvm.internal.o.d(textView2);
            textView2.setVisibility(0);
        }
    }

    public final void c() {
        android.view.View view = this.f184470t;
        kotlin.jvm.internal.o.d(view);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSVoiceSearchHelper", "inactiveNewVoice2txtCancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSVoiceSearchHelper", "inactiveNewVoice2txtCancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f184469s;
        kotlin.jvm.internal.o.d(weImageView);
        android.content.Context context = this.f184451a;
        weImageView.r(context.getResources().getColor(com.tencent.mm.R.color.f478553an), 1.0f);
        android.view.View view2 = this.f184468r;
        kotlin.jvm.internal.o.d(view2);
        view2.setBackgroundDrawable(context.getResources().getDrawable(com.tencent.mm.R.drawable.cvu));
        android.view.View view3 = this.f184468r;
        kotlin.jvm.internal.o.d(view3);
        view3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).withStartAction(new com.tencent.mm.plugin.webview.ui.tools.fts.c3(this)).start();
    }

    public final void d() {
        android.view.View view = this.f184472v;
        kotlin.jvm.internal.o.d(view);
        android.view.ViewPropertyAnimator animate = view.animate();
        int i17 = this.f184455e;
        animate.translationY(i17).alpha(0.0f).setDuration(100L).withStartAction(new com.tencent.mm.plugin.webview.ui.tools.fts.d3(this)).start();
        android.view.View view2 = this.f184473w;
        kotlin.jvm.internal.o.d(view2);
        view2.animate().translationY(i17).alpha(0.0f).setDuration(100L).start();
        android.view.View view3 = this.f184474x;
        kotlin.jvm.internal.o.d(view3);
        view3.animate().translationY(i17).setDuration(100L).start();
    }

    public final void e(android.content.Context context, android.view.View ftsVoiceBtnsLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(ftsVoiceBtnsLayout, "ftsVoiceBtnsLayout");
        ftsVoiceBtnsLayout.setOnTouchListener(new com.tencent.mm.plugin.webview.ui.tools.fts.e3(ftsVoiceBtnsLayout, this, context));
        android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.E;
        this.f184457g.addUpdateListener(animatorUpdateListener);
        this.f184458h.addUpdateListener(animatorUpdateListener);
        this.f184459i.addUpdateListener(animatorUpdateListener);
        this.f184460j.addUpdateListener(animatorUpdateListener);
        this.f184461k.addUpdateListener(animatorUpdateListener);
    }
}
