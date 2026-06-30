package kv4;

/* loaded from: classes12.dex */
public final class m0 implements jv4.j {

    /* renamed from: a, reason: collision with root package name */
    public final rv4.b0 f312714a;

    /* renamed from: b, reason: collision with root package name */
    public final rv4.y f312715b;

    public m0(rv4.b0 data, rv4.y delegate) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f312714a = data;
        this.f312715b = delegate;
    }

    @Override // jv4.j
    public int a() {
        if (this.f312714a.c()) {
            return ((java.util.ArrayList) getItems()).size() + 1;
        }
        return 0;
    }

    @Override // jv4.j
    public java.util.List getItems() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        rv4.b0 b0Var = this.f312714a;
        arrayList.add(new lv4.b(b0Var, this.f312715b, b0Var.f400438a));
        java.util.List list = b0Var.f400442e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((rv4.c0) ((mv4.j) obj)).b()) {
                arrayList2.add(obj);
            }
        }
        arrayList.add(new kv4.l0(b0Var, arrayList2, ((java.util.ArrayList) b0Var.f400442e).size() > 4));
        return arrayList;
    }
}
