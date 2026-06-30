package so2;

/* loaded from: classes.dex */
public final class m1 implements so2.j5 {
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((obj instanceof so2.m1 ? (so2.m1) obj : null) == null || ((long) obj.hashCode()) != ((long) hashCode())) ? -1 : 0;
    }

    public boolean equals(java.lang.Object obj) {
        so2.m1 m1Var = obj instanceof so2.m1 ? (so2.m1) obj : null;
        return m1Var != null && ((long) m1Var.hashCode()) == ((long) hashCode());
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_PROGRESS;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MoreLiveListItem");
        sb6.append(hashCode());
        return sb6.toString();
    }
}
