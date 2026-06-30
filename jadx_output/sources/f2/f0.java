package f2;

/* loaded from: classes13.dex */
public final class f0 implements f2.g0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f258801d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f258802e;

    public f0(java.lang.Object value, boolean z17) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f258801d = value;
        this.f258802e = z17;
    }

    @Override // f2.g0
    public boolean a() {
        return this.f258802e;
    }

    @Override // n0.e5
    public java.lang.Object getValue() {
        return this.f258801d;
    }

    public /* synthetic */ f0(java.lang.Object obj, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(obj, (i17 & 2) != 0 ? true : z17);
    }
}
