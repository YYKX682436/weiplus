package lj4;

/* loaded from: classes3.dex */
public final class h implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f318986d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f318987e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f318988f;

    public h(java.lang.String name, java.lang.String desc, java.lang.String topicId, java.lang.String statusId, java.lang.String headImgUrl) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(topicId, "topicId");
        kotlin.jvm.internal.o.g(statusId, "statusId");
        kotlin.jvm.internal.o.g(headImgUrl, "headImgUrl");
        this.f318986d = name;
        this.f318987e = topicId;
        this.f318988f = statusId;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
