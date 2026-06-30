package gk0;

/* loaded from: classes3.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d75.c f272441e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, d75.c cVar) {
        super(0);
        this.f272440d = str;
        this.f272441e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gk0.n0.K0.getClass();
        java.util.HashMap hashMap = (java.util.HashMap) ((jz5.n) gk0.m0.f272443b).getValue();
        java.lang.String str = this.f272440d;
        java.lang.Object obj = hashMap.get(str);
        if (obj == null) {
            obj = new java.util.HashSet();
            hashMap.put(str, obj);
        }
        java.util.HashSet hashSet = (java.util.HashSet) obj;
        d75.c cVar = this.f272441e;
        hashSet.remove(cVar);
        hashSet.add(cVar);
        return jz5.f0.f302826a;
    }
}
