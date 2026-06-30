package vp2;

/* loaded from: classes2.dex */
public final class l implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.oa2 f438935d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.fa2 f438936e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.ea2 f438937f;

    /* renamed from: g, reason: collision with root package name */
    public org.json.JSONObject f438938g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f438939h;

    public l(r45.oa2 noticeInfo, r45.fa2 container, r45.ea2 streamCard) {
        kotlin.jvm.internal.o.g(noticeInfo, "noticeInfo");
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(streamCard, "streamCard");
        this.f438935d = noticeInfo;
        this.f438936e = container;
        this.f438937f = streamCard;
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
        return 10;
    }
}
