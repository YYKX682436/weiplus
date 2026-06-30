package lr;

/* loaded from: classes10.dex */
public final class b0 extends lr.o0 {

    /* renamed from: f, reason: collision with root package name */
    public final float f320496f;

    /* renamed from: g, reason: collision with root package name */
    public final float f320497g;

    /* renamed from: h, reason: collision with root package name */
    public final float f320498h;

    public b0() {
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
        this.f320496f = resources.getDimension(com.tencent.mm.R.dimen.f480372w3);
        this.f320497g = resources.getDimension(com.tencent.mm.R.dimen.f479688cn);
        this.f320498h = resources.getDimension(com.tencent.mm.R.dimen.f479672c9) - 1;
        resources.getDimension(com.tencent.mm.R.dimen.f479646bl);
        this.f320561b = 5;
        e();
    }

    @Override // lr.o0
    public float a() {
        return this.f320497g;
    }

    @Override // lr.o0
    public float b() {
        return this.f320496f;
    }

    @Override // lr.o0
    public float c() {
        return this.f320498h;
    }

    @Override // lr.o0
    public void e() {
        if (com.tencent.mm.ui.bk.A()) {
            super.e();
            return;
        }
        float f17 = this.f320560a;
        float f18 = 2;
        float f19 = this.f320497g;
        float f27 = f17 - (f18 * f19);
        float f28 = this.f320496f;
        if (f27 < f28 * f18) {
            this.f320561b = 1;
            return;
        }
        float f29 = this.f320498h;
        float f37 = (f27 - f28) / (f28 + f29);
        float b17 = a06.d.b(f37) != 0 ? f37 / a06.d.b(f37) : 0.0f;
        int i17 = ((b17 >= 1.0f || b17 <= 0.989f) ? (int) f37 : ((int) f37) + 1) + 1;
        float f38 = i17;
        int i18 = (int) ((f27 - (f28 * f38)) / (i17 - 1));
        this.f320562c = i18;
        this.f320563d = (int) (((this.f320560a - (f38 * f28)) - (i18 * i17)) / f18);
        this.f320564e = i18 / 2;
        com.tencent.mars.xlog.Log.i("customPanelSizeResolver", "updateSize: " + i17 + ", itemSize: " + f28 + ", edgeSize: " + f19 + ", minSpaceSize: " + f29 + ", spanCount: " + this.f320561b + ", itemSpace: " + this.f320562c + ", contentPadding: " + this.f320563d + ", titlePadding: " + this.f320564e + " parentWidth: " + this.f320560a + ' ' + ((f27 - f28) / (f28 + f29)) + "， ratio: " + b17);
        this.f320561b = i17;
    }
}
