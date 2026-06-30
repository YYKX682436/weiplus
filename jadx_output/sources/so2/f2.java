package so2;

/* loaded from: classes.dex */
public final class f2 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final long f410343d;

    public f2(long j17) {
        this.f410343d = j17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((obj instanceof so2.f2) && ((so2.f2) obj).f410343d == this.f410343d) ? 0 : -1;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f410343d;
    }

    @Override // in5.c
    public int h() {
        return com.tencent.rtmp.TXLiveConstants.PLAY_EVT_STREAM_SWITCH_SUCC;
    }

    public java.lang.String toString() {
        return "ItemId=" + this.f410343d + ",ItemType=2015";
    }
}
