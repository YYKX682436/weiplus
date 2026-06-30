package gm2;

/* loaded from: classes3.dex */
public final class j1 implements gm2.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final gm2.e2 f273418a;

    /* renamed from: b, reason: collision with root package name */
    public final int f273419b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f273420c;

    public j1(android.view.View view, gm2.e2 sizeMode, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(sizeMode, "sizeMode");
        this.f273418a = sizeMode;
        this.f273419b = i17;
        this.f273420c = new java.lang.ref.WeakReference(view);
    }

    @Override // gm2.z1
    public int a(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return android.graphics.Color.parseColor("#FFFFFF");
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int b(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return 1;
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int c(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return 0;
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int d(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return 0;
    }

    @Override // gm2.z1
    public int[] e(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        int a17 = ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 16.0f);
        int a18 = ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 20.0f);
        int[] iArr = new int[2];
        if (this.f273418a == gm2.e2.f273362h) {
            iArr[0] = a18;
            iArr[1] = a18;
        } else {
            iArr[0] = a17;
            iArr[1] = a17;
        }
        return iArr;
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int f(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return 0;
    }

    @Override // gm2.z1
    public gm2.u1 g(int i17) {
        return null;
    }

    @Override // gm2.z1
    public gm2.v1 h(int i17) {
        return null;
    }
}
