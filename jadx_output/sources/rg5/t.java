package rg5;

/* loaded from: classes8.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rg5.x f395281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(rg5.x xVar) {
        super(0);
        this.f395281d = xVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList = rg5.x.f395285i;
        java.lang.String str = this.f395281d.f395287b ? "find_friends_by_ting_play_state" : "find_friends_by_ting";
        com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryPreferenceMgr", "mCurrentTingEntryKey: ".concat(str));
        return str;
    }
}
