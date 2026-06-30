package u92;

/* loaded from: classes2.dex */
public final class b extends by1.f {

    /* renamed from: e, reason: collision with root package name */
    public static final u92.a f425822e = new u92.a(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String key) {
        super(key);
        kotlin.jvm.internal.o.g(key, "key");
    }

    @Override // by1.f
    public boolean d() {
        java.lang.Object obj = this.f36361b;
        if (obj == null) {
            return false;
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (!(fVar != null && fVar.f70615a == 0)) {
            return false;
        }
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        return fVar2 != null && fVar2.f70616b == 0;
    }
}
