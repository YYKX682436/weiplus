package vp2;

/* loaded from: classes2.dex */
public final class b implements so2.j5, wp2.a {

    /* renamed from: d, reason: collision with root package name */
    public final r45.fa2 f438905d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f438906e;

    public b(r45.fa2 container) {
        kotlin.jvm.internal.o.g(container, "container");
        this.f438905d = container;
        this.f438906e = new java.util.ArrayList();
    }

    @Override // wp2.a
    public com.tencent.mm.protobuf.g a() {
        return this.f438905d.f374132n;
    }

    @Override // wp2.a
    public void b(int i17) {
        this.f438905d.f374130i = i17;
    }

    @Override // wp2.a
    public int c() {
        return this.f438906e.size();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((obj instanceof vp2.b) && ((vp2.b) obj).f438905d.f374125d == this.f438905d.f374125d) ? 0 : -1;
    }

    public final java.util.ArrayList e() {
        return this.f438906e;
    }

    @Override // wp2.a
    public void f(com.tencent.mm.protobuf.g gVar) {
        this.f438905d.f374132n = gVar;
    }

    @Override // wp2.a
    public java.util.List g() {
        return kz5.p0.f313996d;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f438905d.f374125d;
    }

    @Override // in5.c
    public int h() {
        return 5;
    }

    @Override // wp2.a
    public int i() {
        return this.f438905d.f374125d;
    }
}
