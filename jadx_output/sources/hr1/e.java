package hr1;

/* loaded from: classes11.dex */
public final class e extends dm.e1 {

    /* renamed from: y0, reason: collision with root package name */
    public static final l75.e0 f283344y0 = dm.e1.initAutoDBInfo(hr1.e.class);
    public com.tencent.mm.storage.z3 Y;
    public java.lang.CharSequence Z;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f283345p0;

    /* renamed from: x0, reason: collision with root package name */
    public final hr1.d f283346x0;

    public e(hr1.d opDelegator) {
        kotlin.jvm.internal.o.g(opDelegator, "opDelegator");
        this.f283346x0 = opDelegator;
    }

    @Override // dm.e1, l75.f0
    public l75.e0 getDBInfo() {
        l75.e0 info = f283344y0;
        kotlin.jvm.internal.o.f(info, "info");
        return info;
    }

    public final boolean t0() {
        return this.systemRowid >= 0;
    }

    public java.lang.String toString() {
        java.lang.String str = this.f283345p0;
        return str == null ? "" : str;
    }

    public final void u0() {
        hr1.d dVar = this.f283346x0;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    public e() {
    }
}
