package vp2;

/* loaded from: classes2.dex */
public final class b0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f438907d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.fa2 f438908e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f438909f;

    public b0(java.lang.String content, r45.fa2 container) {
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(container, "container");
        this.f438907d = content;
        this.f438908e = container;
        this.f438909f = new java.util.ArrayList();
    }

    public final java.lang.String a() {
        return this.f438907d;
    }

    public final java.util.List b() {
        return this.f438909f;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((obj instanceof vp2.b0) && kotlin.jvm.internal.o.b(((vp2.b0) obj).f438907d, this.f438907d)) ? 0 : -1;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return -5000;
    }
}
