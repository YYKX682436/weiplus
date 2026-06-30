package ze5;

/* loaded from: classes9.dex */
public final class v3 implements com.tencent.mm.storage.a9 {

    /* renamed from: d, reason: collision with root package name */
    public final int f472245d;

    /* renamed from: e, reason: collision with root package name */
    public final int f472246e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f472247f;

    public v3(com.tencent.mm.storage.f9 f9Var) {
        this.f472245d = f9Var != null ? te5.h.f418649a.e(f9Var) : 0;
        this.f472246e = f9Var != null ? te5.h.f418649a.d(f9Var) : 0;
        this.f472247f = f9Var != null ? te5.h.f418649a.a(f9Var) : false;
    }

    @Override // com.tencent.mm.storage.a9
    public boolean U(java.lang.Object obj) {
        ze5.v3 other = (ze5.v3) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return this.f472245d == other.f472245d && this.f472246e == other.f472246e && this.f472247f == other.f472247f;
    }
}
