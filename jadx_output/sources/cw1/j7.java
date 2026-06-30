package cw1;

/* loaded from: classes12.dex */
public final class j7 implements aw1.w {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f223047a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f223048b;

    /* renamed from: c, reason: collision with root package name */
    public long f223049c;

    /* renamed from: d, reason: collision with root package name */
    public int f223050d;

    /* renamed from: e, reason: collision with root package name */
    public long f223051e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanOtherAccountUI f223052f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f223053g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yv1.g1 f223054h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f223055i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.view.View f223056j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ android.view.View f223057k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ android.view.View f223058l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f223059m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f223060n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f223061o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f223062p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f223063q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f223064r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f223065s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f223066t;

    public j7(com.tencent.mm.plugin.clean.ui.fileindexui.CleanOtherAccountUI cleanOtherAccountUI, boolean z17, yv1.g1 g1Var, long j17, android.view.View view, android.view.View view2, android.view.View view3, android.widget.TextView textView, android.widget.TextView textView2, boolean z18, android.widget.TextView textView3, android.widget.TextView textView4, int i17, android.widget.TextView textView5, android.widget.TextView textView6) {
        this.f223052f = cleanOtherAccountUI;
        this.f223053g = z17;
        this.f223054h = g1Var;
        this.f223055i = j17;
        this.f223056j = view;
        this.f223057k = view2;
        this.f223058l = view3;
        this.f223059m = textView;
        this.f223060n = textView2;
        this.f223061o = z18;
        this.f223062p = textView3;
        this.f223063q = textView4;
        this.f223064r = i17;
        this.f223065s = textView5;
        this.f223066t = textView6;
        java.lang.String string = cleanOtherAccountUI.getString(com.tencent.mm.R.string.f490915ey3);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f223047a = string;
        java.lang.String string2 = cleanOtherAccountUI.getString(com.tencent.mm.R.string.d4a);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        this.f223048b = string2;
    }

    @Override // aw1.w
    public void a(int i17, long j17) {
        this.f223050d = i17;
        this.f223049c = j17;
        c(i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0296  */
    @Override // aw1.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(boolean r36, long r37, int r39) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cw1.j7.b(boolean, long, int):void");
    }

    public final void c(int i17) {
        int i18;
        yv1.h1.f(2, this.f223052f.f95797g);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f223051e;
        if (i17 <= 0 || currentTimeMillis <= 0 || (i18 = this.f223064r) <= 0) {
            return;
        }
        int f17 = e06.p.f((i17 * 100) / i18, 0, 100);
        int i19 = (int) (((this.f223064r - i17) / (i17 / ((float) currentTimeMillis))) / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
        ((ku5.t0) ku5.t0.f312615d).B(new cw1.i7(this.f223065s, this, f17, this.f223066t, i19 < 0 ? 0 : i19));
    }
}
