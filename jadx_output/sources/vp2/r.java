package vp2;

/* loaded from: classes2.dex */
public final class r implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.na2 f438952d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.fa2 f438953e;

    public r(r45.na2 jumper, r45.fa2 container) {
        kotlin.jvm.internal.o.g(jumper, "jumper");
        kotlin.jvm.internal.o.g(container, "container");
        this.f438952d = jumper;
        this.f438953e = container;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return -1;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 7;
    }
}
