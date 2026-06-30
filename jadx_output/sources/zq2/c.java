package zq2;

/* loaded from: classes2.dex */
public final class c implements so2.j5, wp2.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f475028d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.fa2 f475029e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f475030f;

    /* renamed from: g, reason: collision with root package name */
    public final xq2.b f475031g;

    public c(java.lang.String themeId, r45.fa2 container) {
        kotlin.jvm.internal.o.g(themeId, "themeId");
        kotlin.jvm.internal.o.g(container, "container");
        this.f475028d = themeId;
        this.f475029e = container;
        this.f475030f = new java.util.ArrayList();
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(xq2.b.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f475031g = (xq2.b) a17;
    }

    @Override // wp2.a
    public com.tencent.mm.protobuf.g a() {
        return this.f475029e.f374132n;
    }

    @Override // wp2.a
    public void b(int i17) {
        this.f475029e.f374130i = i17;
    }

    @Override // wp2.a
    public int c() {
        return this.f475030f.size();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((obj instanceof zq2.c) && kotlin.jvm.internal.o.b(((zq2.c) obj).f475028d, this.f475028d)) ? 0 : -1;
    }

    @Override // wp2.a
    public void f(com.tencent.mm.protobuf.g gVar) {
        this.f475029e.f374132n = gVar;
    }

    @Override // wp2.a
    public java.util.List g() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList card_list = this.f475029e.f374129h;
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
        return -4999;
    }

    @Override // wp2.a
    public int i() {
        return this.f475029e.f374125d;
    }
}
