package pe;

/* loaded from: classes7.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe.e f353589d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(pe.e eVar) {
        super(1);
        this.f353589d = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (!(str == null || str.length() == 0)) {
            java.util.HashMap hashMap = this.f353589d.f353591a;
            java.lang.String a17 = pe.a.f353588a != null ? j62.e.g().a(str, "", true, true) : null;
            hashMap.put(str, a17 != null ? a17 : "");
        }
        return jz5.f0.f302826a;
    }
}
