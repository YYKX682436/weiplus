package so2;

/* loaded from: classes3.dex */
public final class c3 extends in5.w implements com.tencent.mm.plugin.finder.feed.model.internal.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.cz1 f410296d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f410297e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f410298f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f410299g;

    /* renamed from: h, reason: collision with root package name */
    public final int f410300h;

    public c3(r45.cz1 lotteryInfo, boolean z17, java.lang.String str, java.lang.String str2, int i17) {
        kotlin.jvm.internal.o.g(lotteryInfo, "lotteryInfo");
        this.f410296d = lotteryInfo;
        this.f410297e = z17;
        this.f410298f = str;
        this.f410299g = str2;
        this.f410300h = i17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return 0;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return so2.c3.class.hashCode();
    }
}
