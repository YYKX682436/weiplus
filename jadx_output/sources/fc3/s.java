package fc3;

/* loaded from: classes9.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f261076a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f261077b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f261078c;

    /* renamed from: d, reason: collision with root package name */
    public long f261079d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.PointF f261080e;

    /* renamed from: f, reason: collision with root package name */
    public float f261081f;

    /* renamed from: g, reason: collision with root package name */
    public float f261082g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f261083h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.animation.BaseInterpolator f261084i;

    /* renamed from: j, reason: collision with root package name */
    public int f261085j;

    /* renamed from: k, reason: collision with root package name */
    public android.graphics.Typeface f261086k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f261087l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f261088m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f261089n;

    /* renamed from: o, reason: collision with root package name */
    public final long f261090o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f261091p;

    public s(android.content.Context context, android.widget.FrameLayout layout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(layout, "layout");
        this.f261076a = context;
        this.f261077b = layout;
        this.f261078c = new java.util.ArrayList();
        this.f261079d = 300L;
        this.f261080e = new android.graphics.PointF(0.0f, 0.0f);
        this.f261081f = 12.0f;
        this.f261082g = 1.0f;
        this.f261084i = new android.view.animation.LinearInterpolator();
        this.f261085j = context.getResources().getColor(com.tencent.mm.R.color.FG_0);
        this.f261087l = true;
        this.f261088m = true;
        this.f261090o = 2000L;
    }

    public static final void a(fc3.s sVar, fc3.k kVar) {
        if (!sVar.f261089n || la5.b.f317600a.g(true)) {
            sVar.f261091p = true;
            return;
        }
        int b17 = i65.a.b(sVar.f261076a, 10);
        float f17 = kVar.f261051b.x;
        kotlin.jvm.internal.o.d(kVar.f261054e);
        float width = f17 - (r3.getWidth() / 2);
        e06.k kVar2 = new e06.k(-b17, b17);
        c06.d dVar = c06.e.f37716d;
        float j17 = width + e06.p.j(kVar2, dVar);
        float f18 = kVar.f261051b.y;
        kotlin.jvm.internal.o.d(kVar.f261054e);
        float height = (f18 - (r7.getHeight() / 2)) + e06.p.j(new e06.k(r5, b17), dVar);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(kVar.f261054e, "translationX", j17);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(kVar.f261054e, "translationY", height);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(sVar.f261090o);
        animatorSet.setInterpolator(new android.view.animation.AccelerateInterpolator());
        animatorSet.addListener(new fc3.p(new java.lang.ref.WeakReference(sVar), new java.lang.ref.WeakReference(kVar)));
        kVar.f261057h = animatorSet;
        animatorSet.start();
    }

    public final void b(fc3.k kVar) {
        boolean z17 = this.f261088m;
        android.widget.FrameLayout frameLayout = this.f261077b;
        java.util.List list = this.f261078c;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletTextAnimator", hashCode() + " removeText:" + kVar.f261050a + " tvList:" + ((java.util.ArrayList) list).size() + " layout count:" + frameLayout.getChildCount());
        }
        kVar.f261056g = 5;
        android.animation.AnimatorSet animatorSet = kVar.f261057h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        frameLayout.removeView(kVar.f261054e);
        ((java.util.ArrayList) list).remove(kVar);
        if (this.f261088m) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletTextAnimator", hashCode() + " removeText2:" + kVar.f261050a + " tvList:" + ((java.util.ArrayList) list).size() + " layout count:" + frameLayout.getChildCount());
        }
    }

    public final void c(fc3.k walletText) {
        kotlin.jvm.internal.o.g(walletText, "walletText");
        boolean z17 = this.f261088m;
        android.widget.FrameLayout frameLayout = this.f261077b;
        java.lang.String str = walletText.f261050a;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletTextAnimator", "shootText:" + str + " to " + walletText.f261051b + " tvList:" + ((java.util.ArrayList) this.f261078c).size() + " child:" + frameLayout.getChildCount());
        }
        android.content.Context context = this.f261076a;
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTextSize(1, this.f261081f);
        textView.setX(this.f261080e.x);
        textView.setY(this.f261080e.y);
        if (this.f261087l) {
            textView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i65.a.a(context, this.f261081f), -2));
            textView.setEms(1);
        } else {
            textView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        }
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        textView.setImportantForAccessibility(2);
        textView.setTextColor(this.f261085j);
        android.graphics.Typeface typeface = this.f261086k;
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
        float f17 = walletText.f261055f;
        if (f17 > 0.01d) {
            textView.setLayerType(1, null);
            android.text.SpannableString spannableString = new android.text.SpannableString(str);
            spannableString.setSpan(new android.text.style.MaskFilterSpan(new android.graphics.BlurMaskFilter(f17, android.graphics.BlurMaskFilter.Blur.NORMAL)), 0, spannableString.length(), 33);
            textView.setText(spannableString);
        } else {
            textView.setText(str);
        }
        textView.setLineSpacing(0.0f, 0.8f);
        frameLayout.addView(textView);
        walletText.f261054e = textView;
        textView.post(new fc3.o(textView, this, walletText));
    }

    public final void d(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletTextAnimator", hashCode() + " stopAll withAnimation:" + z17);
        this.f261091p = true;
        java.util.List list = this.f261078c;
        if (z17) {
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setDuration(300L);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((fc3.k) it.next()).f261056g = 4;
            }
            java.util.List S0 = kz5.n0.S0(list);
            ofFloat.addUpdateListener(new fc3.q(S0));
            ofFloat.addListener(new fc3.r(ofFloat, S0, this));
            ofFloat.start();
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append(" removeAllText size:");
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        sb6.append(arrayList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletTextAnimator", sb6.toString());
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            android.widget.FrameLayout frameLayout = this.f261077b;
            if (!hasNext) {
                frameLayout.removeAllViews();
                return;
            }
            fc3.k kVar = (fc3.k) it6.next();
            kVar.f261056g = 5;
            android.animation.AnimatorSet animatorSet = kVar.f261057h;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            frameLayout.removeView(kVar.f261054e);
            it6.remove();
        }
    }
}
