package je2;

/* loaded from: classes3.dex */
public final class a0 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f299194f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f299195g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f299196h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f299197i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f299194f = "Finder.LiveVipSlice";
    }

    public final void N6(r45.nw1 liveInfo, java.lang.String str) {
        kotlin.jvm.internal.o.g(liveInfo, "liveInfo");
        r45.cg2 cg2Var = (r45.cg2) liveInfo.getCustom(59);
        this.f299195g = cg2Var != null ? cg2Var.getBoolean(0) : false;
        r45.o52 o52Var = (r45.o52) liveInfo.getCustom(28);
        this.f299196h = (o52Var != null ? o52Var.getInteger(8) : 0) > 0;
        this.f299197i = pm0.v.z(liveInfo.getInteger(37), 1048576);
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        android.content.Context context = k0Var != null ? k0Var.getContext() : null;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
        if (appCompatActivity != null) {
            if (this.f299197i && (dk2.ef.f233380e instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout)) {
                zl2.r4.f473950a.X2(appCompatActivity, 8192, 8192);
            } else {
                zl2.r4.f473950a.E(appCompatActivity, 8192);
            }
        }
        com.tencent.mars.xlog.Log.i(this.f299194f, "[refreshData] scene:" + str + ", isVisitorVip:" + this.f299195g + ", isChargeLiveVipFree:" + this.f299196h + ", isVipLive:" + this.f299197i);
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        this.f299195g = false;
        this.f299196h = false;
        this.f299197i = false;
    }
}
