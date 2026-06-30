package hq2;

/* loaded from: classes2.dex */
public final class c implements so2.j5, wp2.a {

    /* renamed from: d, reason: collision with root package name */
    public final r45.fa2 f283209d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f283210e;

    /* renamed from: f, reason: collision with root package name */
    public int f283211f;

    /* renamed from: g, reason: collision with root package name */
    public final eq2.b f283212g;

    public c(r45.fa2 container) {
        kotlin.jvm.internal.o.g(container, "container");
        this.f283209d = container;
        this.f283210e = new java.util.ArrayList();
        this.f283211f = -1;
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(eq2.b.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f283212g = (eq2.b) a17;
    }

    @Override // wp2.a
    public com.tencent.mm.protobuf.g a() {
        return this.f283209d.f374132n;
    }

    @Override // wp2.a
    public void b(int i17) {
        this.f283209d.f374130i = i17;
    }

    @Override // wp2.a
    public int c() {
        return this.f283210e.size();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((obj instanceof hq2.c) && ((hq2.c) obj).f283209d.f374125d == this.f283209d.f374125d) ? 0 : -1;
    }

    public final void e(int i17, hq2.b convertData, r45.dk2 dk2Var) {
        kotlin.jvm.internal.o.g(convertData, "convertData");
        this.f283212g.O6(i17, 0, 0, 0, 0, convertData.f283208e, dk2Var != null ? dk2Var.getByteString(6) : null, dk2Var);
    }

    @Override // wp2.a
    public void f(com.tencent.mm.protobuf.g gVar) {
        this.f283209d.f374132n = gVar;
    }

    @Override // wp2.a
    public java.util.List g() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList card_list = this.f283209d.f374129h;
        kotlin.jvm.internal.o.f(card_list, "card_list");
        java.util.Iterator it = card_list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.ea2) it.next()).getCustom(2);
            if (finderObject != null) {
                arrayList.add(java.lang.Long.valueOf(finderObject.getId()));
            }
        }
        return arrayList;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return -4998;
    }

    @Override // wp2.a
    public int i() {
        return this.f283209d.f374125d;
    }
}
