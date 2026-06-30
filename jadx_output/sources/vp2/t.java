package vp2;

/* loaded from: classes2.dex */
public final class t implements so2.j5, wp2.a, yp2.a {

    /* renamed from: d, reason: collision with root package name */
    public final r45.fa2 f438955d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f438956e;

    public t(r45.fa2 container) {
        kotlin.jvm.internal.o.g(container, "container");
        this.f438955d = container;
        this.f438956e = new java.util.ArrayList();
    }

    @Override // wp2.a
    public com.tencent.mm.protobuf.g a() {
        return this.f438955d.f374132n;
    }

    @Override // wp2.a
    public void b(int i17) {
        this.f438955d.f374130i = i17;
    }

    @Override // wp2.a
    public int c() {
        return this.f438956e.size();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((obj instanceof vp2.t) && ((vp2.t) obj).f438955d.f374125d == this.f438955d.f374125d) ? 0 : -1;
    }

    @Override // yp2.a
    public r45.fa2 e() {
        return this.f438955d;
    }

    @Override // wp2.a
    public void f(com.tencent.mm.protobuf.g gVar) {
        this.f438955d.f374132n = gVar;
    }

    @Override // wp2.a
    public java.util.List g() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList card_list = this.f438955d.f374129h;
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
        return this.f438955d.f374125d;
    }

    @Override // in5.c
    public int h() {
        return 19;
    }

    @Override // wp2.a
    public int i() {
        return this.f438955d.f374125d;
    }

    public final java.util.ArrayList j() {
        return this.f438956e;
    }
}
