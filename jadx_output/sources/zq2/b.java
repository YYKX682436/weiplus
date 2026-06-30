package zq2;

/* loaded from: classes2.dex */
public class b implements so2.j5, wp2.a {

    /* renamed from: d, reason: collision with root package name */
    public final r45.fa2 f475026d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f475027e;

    public b(r45.uz2 themeInfo, r45.fa2 container) {
        kotlin.jvm.internal.o.g(themeInfo, "themeInfo");
        kotlin.jvm.internal.o.g(container, "container");
        this.f475026d = container;
        this.f475027e = new java.util.ArrayList();
    }

    @Override // wp2.a
    public com.tencent.mm.protobuf.g a() {
        return this.f475026d.f374132n;
    }

    @Override // wp2.a
    public void b(int i17) {
        this.f475026d.f374130i = i17;
    }

    @Override // wp2.a
    public int c() {
        return this.f475027e.size();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((obj instanceof zq2.b) && ((zq2.b) obj).f475026d.f374125d == this.f475026d.f374125d) ? 0 : -1;
    }

    @Override // wp2.a
    public void f(com.tencent.mm.protobuf.g gVar) {
        this.f475026d.f374132n = gVar;
    }

    @Override // wp2.a
    public java.util.List g() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList card_list = this.f475026d.f374129h;
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
        return this.f475026d.f374125d;
    }

    @Override // in5.c
    public int h() {
        return 4;
    }

    @Override // wp2.a
    public int i() {
        return this.f475026d.f374125d;
    }
}
