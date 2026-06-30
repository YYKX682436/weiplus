package lr;

/* loaded from: classes10.dex */
public final class a1 extends lr.o0 {

    /* renamed from: f, reason: collision with root package name */
    public final float f320492f;

    /* renamed from: g, reason: collision with root package name */
    public final float f320493g;

    /* renamed from: h, reason: collision with root package name */
    public final float f320494h;

    public a1() {
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
        this.f320492f = resources.getDimension(com.tencent.mm.R.dimen.f480374w5);
        this.f320493g = resources.getDimension(com.tencent.mm.R.dimen.f479688cn);
        this.f320494h = resources.getDimension(com.tencent.mm.R.dimen.f479688cn) - 1;
        resources.getDimension(com.tencent.mm.R.dimen.f479646bl);
        this.f320561b = 8;
        e();
    }

    @Override // lr.o0
    public float a() {
        return this.f320493g;
    }

    @Override // lr.o0
    public float b() {
        return this.f320492f;
    }

    @Override // lr.o0
    public float c() {
        return this.f320494h;
    }
}
