package so2;

/* loaded from: classes2.dex */
public final class j1 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderObject f410439d;

    public j1(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        this.f410439d = finderObject;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObject a() {
        return this.f410439d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((obj instanceof so2.j1 ? (so2.j1) obj : null) == null || ((so2.j1) obj).f410439d.getId() != getItemId()) ? -1 : 0;
    }

    public boolean equals(java.lang.Object obj) {
        so2.j1 j1Var = obj instanceof so2.j1 ? (so2.j1) obj : null;
        return j1Var != null && j1Var.f410439d.getId() == this.f410439d.getId();
    }

    @Override // in5.c
    public long getItemId() {
        return this.f410439d.getId();
    }

    @Override // in5.c
    public int h() {
        return 2004;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveItem:");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[nickname:");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f410439d;
        sb7.append(hc2.b0.k(finderObject.getNickname(), 0, 0, 3, null));
        sb7.append(",feedId:");
        sb7.append(finderObject.getId());
        sb7.append(",liveId:");
        r45.nw1 liveInfo = finderObject.getLiveInfo();
        sb7.append(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null);
        sb7.append(",friendLikeCount:");
        sb7.append(finderObject.getFriendLikeCount());
        sb7.append(']');
        sb6.append(sb7.toString());
        java.lang.String sb8 = sb6.toString();
        kotlin.jvm.internal.o.f(sb8, "toString(...)");
        return sb8;
    }
}
