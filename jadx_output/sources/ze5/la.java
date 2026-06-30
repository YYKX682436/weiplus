package ze5;

/* loaded from: classes9.dex */
public class la extends rd5.d {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Class f472072m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(we5.a params, java.lang.Class cls) {
        super(params);
        kotlin.jvm.internal.o.g(params, "params");
        this.f472072m = cls;
    }

    @Override // rd5.d, xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // rd5.a
    public boolean i() {
        return true;
    }

    @Override // rd5.d
    public we5.b o() {
        java.lang.Class cls = this.f472072m;
        if (cls != null) {
            return (we5.b) cls.newInstance();
        }
        return null;
    }
}
