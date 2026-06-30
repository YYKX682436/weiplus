package pg2;

/* loaded from: classes3.dex */
public final class a0 extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug5.v f354080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f354081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nn0.c f354082f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.ka4 f354083g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pg2.j0 f354084h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f354085i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ mn0.l0 f354086m;

    public a0(ug5.v vVar, java.lang.String str, nn0.c cVar, r45.ka4 ka4Var, pg2.j0 j0Var, android.content.Context context, mn0.l0 l0Var) {
        this.f354080d = vVar;
        this.f354081e = str;
        this.f354082f = cVar;
        this.f354083g = ka4Var;
        this.f354084h = j0Var;
        this.f354085i = context;
        this.f354086m = l0Var;
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
    }

    @Override // mn0.a, com.tencent.rtmp.ITXLivePlayListener
    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        super.onPlayEvent(i17, bundle);
        if (i17 == -2304) {
            qg2.e.f362799a.b(this.f354081e);
            return;
        }
        if (i17 == 2009) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(bundle != null ? bundle.getInt("EVT_PARAM1") : 0);
            ug5.v vVar = this.f354080d;
            vVar.f("key_video_w", valueOf);
            vVar.f("key_video_h", java.lang.Integer.valueOf(bundle != null ? bundle.getInt("EVT_PARAM2") : 0));
            return;
        }
        if (i17 != 2103) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveSurfaceViewService", "onWarningReconnect:");
        qg2.e eVar = qg2.e.f362799a;
        pg2.j0 j0Var = this.f354084h;
        android.content.Context context = this.f354085i;
        mn0.l0 l0Var = this.f354086m;
        eVar.c("preloadStartLivePlayer.Surface", this.f354082f, this.f354083g, j0Var.Ui(context, l0Var != null ? l0Var.f329773d : 0L, l0Var != null ? l0Var.f329772c : 0L));
    }
}
