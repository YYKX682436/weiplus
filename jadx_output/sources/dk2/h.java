package dk2;

/* loaded from: classes10.dex */
public final class h implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo f233541d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f233542e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f233543f;

    /* renamed from: g, reason: collision with root package name */
    public int f233544g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.bm1 f233545h;

    public h(com.tencent.mm.protocal.protobuf.FinderJumpInfo data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f233541d = data;
        this.f233542e = new java.util.ArrayList();
        this.f233545h = dk2.i.f233596a.b(data.getExt_info());
    }

    @Override // in5.c
    public long getItemId() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
