package ek4;

/* loaded from: classes12.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f253677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253678e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ek4.y f253679f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ek4.s sVar, java.lang.String str, ek4.y yVar) {
        super(0);
        this.f253677d = sVar;
        this.f253678e = str;
        this.f253679f = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ek4.s sVar = this.f253677d;
        java.util.HashMap hashMap = sVar.f253686b;
        java.lang.String str = this.f253678e;
        boolean containsKey = hashMap.containsKey(str);
        ek4.y yVar = this.f253679f;
        if (containsKey) {
            dn.c cVar = new dn.c();
            int d17 = ek4.s.d(sVar, str, cVar);
            if (yVar != null) {
                yVar.a(d17, cVar);
            }
        } else if (yVar != null) {
            yVar.a(-1, null);
        }
        return jz5.f0.f302826a;
    }
}
