package vp2;

/* loaded from: classes2.dex */
public final class a implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.nt0 f438901d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f438902e;

    /* renamed from: f, reason: collision with root package name */
    public final int f438903f;

    /* renamed from: g, reason: collision with root package name */
    public final int f438904g;

    public a(r45.nt0 adInfo, java.lang.String url, r45.fa2 container, int i17, int i18) {
        kotlin.jvm.internal.o.g(adInfo, "adInfo");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(container, "container");
        this.f438901d = adInfo;
        this.f438902e = url;
        this.f438903f = i17;
        this.f438904g = i18;
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
        return 8;
    }
}
