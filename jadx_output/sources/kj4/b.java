package kj4;

/* loaded from: classes2.dex */
public final class b implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f308452d;

    /* renamed from: e, reason: collision with root package name */
    public final pj4.b2 f308453e;

    public b(java.lang.String statusId, pj4.b2 likeInfo) {
        kotlin.jvm.internal.o.g(statusId, "statusId");
        kotlin.jvm.internal.o.g(likeInfo, "likeInfo");
        this.f308452d = statusId;
        this.f308453e = likeInfo;
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
