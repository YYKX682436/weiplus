package so2;

/* loaded from: classes3.dex */
public final class u2 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.fd2 f410635d;

    public u2(r45.fd2 tagInfo) {
        kotlin.jvm.internal.o.g(tagInfo, "tagInfo");
        this.f410635d = tagInfo;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        so2.u2 u2Var = obj instanceof so2.u2 ? (so2.u2) obj : null;
        if (u2Var != null) {
            int integer = u2Var.f410635d.getInteger(0);
            int integer2 = this.f410635d.getInteger(0);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (integer == integer2) {
                return 0;
            }
        }
        return -1;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return so2.u2.class.hashCode();
    }
}
