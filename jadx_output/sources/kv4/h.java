package kv4;

/* loaded from: classes12.dex */
public final class h implements jv4.j {

    /* renamed from: a, reason: collision with root package name */
    public final mv4.a f312701a;

    public h(mv4.a data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f312701a = data;
    }

    @Override // jv4.j
    public int a() {
        return java.lang.Math.min(((java.util.ArrayList) getItems()).size(), 1);
    }

    @Override // jv4.j
    public java.util.List getItems() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        mv4.a aVar = this.f312701a;
        if (((mv4.b) kz5.n0.Z(((rv4.a) aVar).f400424a)) != null) {
            arrayList.add(new kv4.l(aVar));
        }
        return arrayList;
    }
}
