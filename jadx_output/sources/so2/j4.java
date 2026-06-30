package so2;

/* loaded from: classes2.dex */
public final class j4 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.yw2 f410443d;

    public j4(r45.yw2 divider) {
        kotlin.jvm.internal.o.g(divider, "divider");
        this.f410443d = divider;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return -1;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f410443d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return this.f410443d.getInteger(2);
    }
}
