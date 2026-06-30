package kf2;

/* loaded from: classes.dex */
public final class e extends kf2.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(df2.k controller, com.tencent.mm.plugin.lite.s liteAppStore) {
        super(controller, liteAppStore);
        kotlin.jvm.internal.o.g(controller, "controller");
        kotlin.jvm.internal.o.g(liteAppStore, "liteAppStore");
    }

    @Override // kf2.x
    public boolean d(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        com.tencent.mm.plugin.finder.live.util.y.d(this.f307311a, kotlinx.coroutines.q1.f310570c, null, new kf2.d(obj, this, j17, i17, null), 2, null);
        return true;
    }

    @Override // kf2.x
    public java.lang.String e() {
        return "BanLiveComment";
    }
}
