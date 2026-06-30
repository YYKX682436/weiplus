package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class h9 {
    public final android.animation.ValueAnimator A;
    public final android.animation.ValueAnimator B;
    public android.animation.ObjectAnimator C;
    public boolean D;
    public boolean E;
    public final java.util.List F;
    public android.animation.ValueAnimator G;
    public z21.w H;
    public final e70.a0 I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f190354J;
    public kotlinx.coroutines.r2 K;
    public volatile boolean L;
    public com.tencent.mm.pluginsdk.ui.chat.k8 M;
    public android.animation.AnimatorSet N;
    public android.animation.AnimatorSet O;
    public kotlinx.coroutines.r2 P;
    public kotlinx.coroutines.r2 Q;
    public boolean R;
    public final jz5.g S;
    public final jz5.g T;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f190355a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f190356b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f190357c;

    /* renamed from: d, reason: collision with root package name */
    public long f190358d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190359e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f190360f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.c0 f190361g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f190362h;

    /* renamed from: i, reason: collision with root package name */
    public final int f190363i;

    /* renamed from: j, reason: collision with root package name */
    public final int f190364j;

    /* renamed from: k, reason: collision with root package name */
    public db5.d5 f190365k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f190366l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f190367m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f190368n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f190369o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f190370p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f190371q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f190372r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f190373s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f190374t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f190375u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f190376v;

    /* renamed from: w, reason: collision with root package name */
    public final float f190377w;

    /* renamed from: x, reason: collision with root package name */
    public final android.animation.ValueAnimator f190378x;

    /* renamed from: y, reason: collision with root package name */
    public final android.animation.ValueAnimator f190379y;

    /* renamed from: z, reason: collision with root package name */
    public final android.animation.ValueAnimator f190380z;

    public h9(com.tencent.mm.pluginsdk.ui.chat.ChatFooter mChatFooter) {
        kotlin.jvm.internal.o.g(mChatFooter, "mChatFooter");
        this.f190355a = "";
        this.f190356b = "";
        this.f190359e = mChatFooter;
        android.content.Context context = mChatFooter.getContext();
        this.f190360f = context;
        kotlinx.coroutines.c0 a17 = kotlinx.coroutines.t3.a(null, 1, null);
        this.f190361g = a17;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f190362h = kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a.plus(a17));
        this.f190377w = com.tencent.mm.ui.zk.a(context, 12);
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofInt(36, 1224).setDuration(200L);
        kotlin.jvm.internal.o.f(duration, "setDuration(...)");
        this.f190378x = duration;
        android.animation.ValueAnimator duration2 = android.animation.ValueAnimator.ofInt(36, 1224).setDuration(200L);
        kotlin.jvm.internal.o.f(duration2, "setDuration(...)");
        this.f190379y = duration2;
        android.animation.ValueAnimator duration3 = android.animation.ValueAnimator.ofInt(114, 56).setDuration(200L);
        kotlin.jvm.internal.o.f(duration3, "setDuration(...)");
        this.f190380z = duration3;
        android.animation.ValueAnimator duration4 = android.animation.ValueAnimator.ofInt(20, 32).setDuration(200L);
        kotlin.jvm.internal.o.f(duration4, "setDuration(...)");
        this.A = duration4;
        android.animation.ValueAnimator duration5 = android.animation.ValueAnimator.ofInt(20, 32).setDuration(200L);
        kotlin.jvm.internal.o.f(duration5, "setDuration(...)");
        this.B = duration5;
        this.D = true;
        this.F = new java.util.ArrayList();
        this.f190354J = "";
        com.tencent.mm.ui.ah a18 = com.tencent.mm.ui.bh.a(context);
        int i17 = a18.f197135a;
        int i18 = a18.f197136b;
        this.f190363i = java.lang.Math.min(i17, i18) / 2;
        this.f190364j = java.lang.Math.max(i17, i18);
        if (j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigVoiceInputIlink()) == 1) {
            this.I = ((i70.g) ((e70.b0) i95.n0.c(e70.b0.class))).wi(true);
        }
        this.S = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.r8(this));
        this.T = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.q8(this));
    }

    public final void a() {
        android.animation.AnimatorSet animatorSet = this.N;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.N = null;
        android.animation.AnimatorSet animatorSet2 = this.O;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.O = null;
        kotlinx.coroutines.r2 r2Var = this.P;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.P = null;
        this.f190378x.cancel();
        this.f190379y.cancel();
        this.f190380z.cancel();
        this.A.cancel();
        this.B.cancel();
        d();
    }

    public final int b() {
        return ((java.lang.Number) ((jz5.n) this.T).getValue()).intValue();
    }

    public final void c() {
        z21.j0 j0Var;
        db5.d5 d5Var = this.f190365k;
        if (d5Var == null) {
            return;
        }
        this.f190365k = null;
        if (d5Var.isShowing()) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(d5Var.getContentView(), "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(300L);
            ofFloat.addListener(new com.tencent.mm.pluginsdk.ui.chat.n8(d5Var));
            ofFloat.start();
        }
        z21.w wVar = this.H;
        if (wVar != null && wVar.C && (j0Var = wVar.A) != null) {
            j0Var.f469640w = true;
        }
        f();
        this.f190359e.W0();
    }

    public final void d() {
        android.view.View view = this.f190370p;
        if (view != null) {
            view.setTranslationX(0.0f);
        }
        android.view.View view2 = this.f190367m;
        if (view2 != null) {
            view2.setTranslationX(0.0f);
        }
        android.view.View view3 = this.f190368n;
        if (view3 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/QuickVoice2TxtHelper", "resetAnimationStates", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/pluginsdk/ui/chat/QuickVoice2TxtHelper", "resetAnimationStates", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f190369o;
        if (weImageView != null) {
            weImageView.setAlpha(0.0f);
        }
        android.view.View view4 = this.f190371q;
        if (view4 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/QuickVoice2TxtHelper", "resetAnimationStates", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/pluginsdk/ui/chat/QuickVoice2TxtHelper", "resetAnimationStates", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void e() {
        android.content.Context context = this.f190360f;
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.QuickVoice2TxtHelper", "showNetErrorTip: context is null, skip showing network error tip");
            return;
        }
        u35.e eVar = u35.e.f424436a;
        java.lang.String str = this.f190355a;
        com.tencent.mm.pluginsdk.ui.chat.y4 chattingContext = this.f190359e.getChattingContext();
        java.lang.String c17 = chattingContext != null ? chattingContext.c() : null;
        if (c17 == null) {
            c17 = "";
        }
        eVar.b(str, c17, this.f190354J.length(), 3, this.f190356b);
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = context.getString(com.tencent.mm.R.string.npp);
        e4Var.c();
        c();
    }

    public final void f() {
        android.view.ViewGroup.LayoutParams layoutParams;
        z21.w wVar = this.H;
        if (wVar != null) {
            wVar.cancel(true);
        }
        kotlinx.coroutines.r2 r2Var = this.K;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.K = null;
        android.animation.ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.G = null;
        ((java.util.ArrayList) this.F).clear();
        android.view.View view = this.f190371q;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            ((android.widget.FrameLayout.LayoutParams) layoutParams).topMargin = b();
            android.view.View view2 = this.f190371q;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams);
            }
        }
        android.animation.ObjectAnimator objectAnimator = this.C;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.D = true;
    }

    public final void g(float f17, float f18) {
        android.widget.ImageView imageView = this.f190372r;
        if (imageView == null) {
            return;
        }
        java.lang.Object parent = imageView.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view == null) {
            return;
        }
        if (f17 > 0.0f || f18 > 0.0f) {
            if (imageView.getWidth() <= 0 || imageView.getHeight() <= 0 || view.getWidth() <= 0 || view.getHeight() <= 0) {
                imageView.post(new com.tencent.mm.pluginsdk.ui.chat.g9(this, f17, f18));
                return;
            }
            view.getLocationOnScreen(new int[2]);
            view.getWidth();
            imageView.getWidth();
            imageView.setX((f17 - r2[0]) - (imageView.getWidth() / 2.0f));
            imageView.setY((f18 - r2[1]) - (imageView.getHeight() / 2.0f));
        }
    }
}
