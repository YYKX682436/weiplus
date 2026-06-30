package so2;

/* loaded from: classes2.dex */
public final class d0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.vx0 f410308d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f410309e;

    public d0(r45.vx0 collectionInfo) {
        kotlin.jvm.internal.o.g(collectionInfo, "collectionInfo");
        this.f410308d = collectionInfo;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((obj instanceof so2.d0) && ((so2.d0) obj).f410308d.getLong(0) == this.f410308d.getLong(0)) ? 0 : -1;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f410308d.getLong(0);
    }

    @Override // in5.c
    public int h() {
        return so2.d0.class.getName().hashCode();
    }
}
