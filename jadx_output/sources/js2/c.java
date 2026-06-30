package js2;

/* loaded from: classes2.dex */
public final class c implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f301519d;

    /* renamed from: e, reason: collision with root package name */
    public final int f301520e;

    public c(com.tencent.mm.protobuf.g shopInfo, int i17) {
        kotlin.jvm.internal.o.g(shopInfo, "shopInfo");
        this.f301519d = shopInfo;
        this.f301520e = i17;
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
        return js2.c.class.hashCode();
    }
}
