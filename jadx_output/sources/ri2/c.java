package ri2;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ri2.j f396044d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ri2.j jVar) {
        super(1);
        this.f396044d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        km2.q it = (km2.q) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String str = it.f309171b;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = it.f309172c;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = it.f309173d;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = it.f309170a;
        this.f396044d.c(str, str2, str3, str4 != null ? str4 : "");
        return jz5.f0.f302826a;
    }
}
