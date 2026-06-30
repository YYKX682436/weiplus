package so2;

/* loaded from: classes10.dex */
public final class d2 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.c64 f410312d;

    public d2(r45.c64 lbsLife) {
        kotlin.jvm.internal.o.g(lbsLife, "lbsLife");
        this.f410312d = lbsLife;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((obj instanceof r45.c64) && kotlin.jvm.internal.o.b(((r45.c64) obj).f371310d, this.f410312d.f371310d)) ? 0 : -1;
    }

    @Override // in5.c
    public long getItemId() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
