package y70;

/* loaded from: classes12.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d75.c f459687e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String str, d75.c cVar) {
        super(0);
        this.f459686d = str;
        this.f459687e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashMap b17 = v70.b0.f433600m.b();
        java.lang.String str = this.f459686d;
        java.lang.Object obj = b17.get(str);
        if (obj == null) {
            obj = new java.util.HashSet();
            b17.put(str, obj);
        }
        java.util.HashSet hashSet = (java.util.HashSet) obj;
        d75.c cVar = this.f459687e;
        hashSet.remove(cVar);
        hashSet.add(cVar);
        return jz5.f0.f302826a;
    }
}
