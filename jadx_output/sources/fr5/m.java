package fr5;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f265985a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f265986b;

    /* renamed from: c, reason: collision with root package name */
    public final fr5.l f265987c;

    /* renamed from: d, reason: collision with root package name */
    public final float f265988d;

    /* renamed from: e, reason: collision with root package name */
    public final float f265989e;

    /* renamed from: f, reason: collision with root package name */
    public final fr5.f f265990f;

    /* renamed from: g, reason: collision with root package name */
    public zq5.l f265991g;

    /* renamed from: h, reason: collision with root package name */
    public zq5.l f265992h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.VelocityTracker f265993i;

    /* renamed from: j, reason: collision with root package name */
    public int f265994j;

    /* renamed from: k, reason: collision with root package name */
    public int f265995k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f265996l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f265997m;

    /* renamed from: n, reason: collision with root package name */
    public zq5.l f265998n;

    /* renamed from: o, reason: collision with root package name */
    public int f265999o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Float f266000p;

    public m(android.view.View view, yz5.p canDrag, fr5.l onGestureListener) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(canDrag, "canDrag");
        kotlin.jvm.internal.o.g(onGestureListener, "onGestureListener");
        this.f265985a = view;
        this.f265986b = canDrag;
        this.f265987c = onGestureListener;
        this.f265994j = -1;
        this.f265997m = true;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(view.getContext());
        this.f265988d = viewConfiguration.getScaledTouchSlop();
        this.f265989e = viewConfiguration.getScaledMinimumFlingVelocity();
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f265990f = new fr5.f(context, new fr5.d(new fr5.k(this), null, null, 6, null), null, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x012b, code lost:
    
        if (((java.lang.Boolean) r13.invoke(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(r2 > 0.0f ? -1 : 1))).booleanValue() != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0150, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x014e, code lost:
    
        if (((java.lang.Boolean) r13.invoke(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(r11 > 0.0f ? -1 : 1))).booleanValue() != false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr5.m.a(android.view.MotionEvent):void");
    }
}
