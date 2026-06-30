package so2;

/* loaded from: classes2.dex */
public final class i0 implements in5.c, com.tencent.mm.plugin.finder.feed.model.internal.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderContact f410415d;

    public i0(com.tencent.mm.protocal.protobuf.FinderContact contact) {
        kotlin.jvm.internal.o.g(contact, "contact");
        this.f410415d = contact;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return 0;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f410415d.getUsername() != null ? r0.hashCode() : 0;
    }

    @Override // in5.c
    public int h() {
        return so2.i0.class.getName().hashCode();
    }
}
