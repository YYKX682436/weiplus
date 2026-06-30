package so2;

/* loaded from: classes.dex */
public final class e5 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.r03 f410330d;

    /* renamed from: e, reason: collision with root package name */
    public final int f410331e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f410332f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f410333g;

    public e5(r45.r03 topicInfo, int i17) {
        kotlin.jvm.internal.o.g(topicInfo, "topicInfo");
        this.f410330d = topicInfo;
        this.f410331e = i17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((obj instanceof so2.e5) && ((so2.e5) obj).f410330d.getLong(1) == this.f410330d.getLong(1)) ? 0 : -1;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f410330d.getLong(1);
    }

    @Override // in5.c
    public int h() {
        return this.f410331e;
    }
}
