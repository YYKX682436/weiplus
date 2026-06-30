package df5;

/* loaded from: classes10.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final ua5.f f232230a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f232231b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f232232c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f232233d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f232234e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f232235f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f232236g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f232237h;

    /* renamed from: i, reason: collision with root package name */
    public android.text.SpannableStringBuilder f232238i;

    /* renamed from: j, reason: collision with root package name */
    public android.text.SpannableStringBuilder f232239j;

    /* renamed from: k, reason: collision with root package name */
    public int f232240k;

    /* renamed from: l, reason: collision with root package name */
    public int f232241l;

    public v(ua5.f animator, yz5.a baseCharsProvider, yz5.a durationMsProvider, yz5.a globalRemainingProvider, yz5.a aVar) {
        kotlin.jvm.internal.o.g(animator, "animator");
        kotlin.jvm.internal.o.g(baseCharsProvider, "baseCharsProvider");
        kotlin.jvm.internal.o.g(durationMsProvider, "durationMsProvider");
        kotlin.jvm.internal.o.g(globalRemainingProvider, "globalRemainingProvider");
        this.f232230a = animator;
        this.f232231b = baseCharsProvider;
        this.f232232c = durationMsProvider;
        this.f232233d = globalRemainingProvider;
        this.f232234e = aVar;
        this.f232235f = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public final void a() {
        int intValue = ((java.lang.Number) this.f232231b.invoke()).intValue();
        if (intValue < 1) {
            intValue = 1;
        }
        long j17 = (((java.lang.Number) this.f232232c.invoke()).intValue() >= 1 ? r2 : 1) / intValue;
        if (j17 < 1) {
            j17 = 1;
        }
        df5.u uVar = new df5.u(this);
        this.f232236g = uVar;
        this.f232235f.postDelayed(uVar, j17);
    }
}
