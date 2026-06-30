package ex0;

/* loaded from: classes5.dex */
public final class e implements ex0.h {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f257123a = java.lang.String.valueOf(java.lang.System.currentTimeMillis());

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTime f257124b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f257125c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f257126d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f257127e;

    /* renamed from: f, reason: collision with root package name */
    public vu0.u f257128f;

    public e() {
        com.tencent.maas.model.time.MJTime InvalidTime = com.tencent.maas.model.time.MJTime.InvalidTime;
        kotlin.jvm.internal.o.f(InvalidTime, "InvalidTime");
        this.f257124b = InvalidTime;
        this.f257125c = new float[0];
        this.f257127e = new java.util.ArrayList();
        this.f257128f = vu0.u.f440160e;
    }

    @Override // ex0.h
    public vu0.u e() {
        return this.f257128f;
    }

    @Override // ex0.h
    public void f(vu0.u uVar) {
        kotlin.jvm.internal.o.g(uVar, "<set-?>");
        this.f257128f = uVar;
    }
}
