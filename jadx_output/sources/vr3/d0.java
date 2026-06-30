package vr3;

/* loaded from: classes3.dex */
public final class d0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.um f439626d;

    public d0(r45.um topicInfo) {
        kotlin.jvm.internal.o.g(topicInfo, "topicInfo");
        this.f439626d = topicInfo;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((obj instanceof vr3.d0) && ((vr3.d0) obj).f439626d.f387476g == this.f439626d.f387476g) ? 0 : -1;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f439626d.f387476g;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
