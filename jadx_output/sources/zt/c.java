package zt;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d75.c f475531e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, d75.c cVar) {
        super(0);
        this.f475530d = str;
        this.f475531e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.g gVar = ot.g.f348308m;
        java.util.HashMap hashMap = (java.util.HashMap) ((jz5.n) ot.g.f348308m).getValue();
        java.lang.String str = this.f475530d;
        java.lang.Object obj = hashMap.get(str);
        if (obj == null) {
            obj = new java.util.HashSet();
            hashMap.put(str, obj);
        }
        java.util.HashSet hashSet = (java.util.HashSet) obj;
        d75.c cVar = this.f475531e;
        hashSet.remove(cVar);
        hashSet.add(cVar);
        return jz5.f0.f302826a;
    }
}
