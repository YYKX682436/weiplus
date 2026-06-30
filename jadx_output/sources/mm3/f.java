package mm3;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f329624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk4.c f329625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.h6 f329626f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f329627g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mm3.n f329628h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.jf2 f329629i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j17, pk4.c cVar, com.tencent.mm.plugin.mv.ui.uic.h6 h6Var, int i17, mm3.n nVar, r45.jf2 jf2Var) {
        super(1);
        this.f329624d = j17;
        this.f329625e = cVar;
        this.f329626f = h6Var;
        this.f329627g = i17;
        this.f329628h = nVar;
        this.f329629i = jf2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fm3.b bVar = (fm3.b) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on select pag: pag=");
        sb6.append(bVar);
        sb6.append(", resume progress to ");
        long j17 = this.f329624d;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvPreviewTrackUIC", sb6.toString());
        pk4.c cVar = this.f329625e;
        cVar.setLoop(true);
        com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout multiMediaEffectVideoLayout = (com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar;
        gk4.r rVar = multiMediaEffectVideoLayout.f174566f;
        com.tencent.mars.xlog.Log.i(rVar.f272602g, "clearPlayRange");
        rVar.f272617v = -1L;
        rVar.f272618w = -1L;
        com.tencent.mm.plugin.mv.ui.uic.h6 h6Var = this.f329626f;
        int i17 = this.f329627g;
        h6Var.O6(i17, bVar);
        multiMediaEffectVideoLayout.d(j17);
        kl3.t.g().a().c((int) j17);
        com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView mvTracksEditView = this.f329628h.f329653d;
        if (mvTracksEditView == null) {
            kotlin.jvm.internal.o.o("tracksEditView");
            throw null;
        }
        mvTracksEditView.c(i17, bVar != null);
        r45.jf2 jf2Var = this.f329629i;
        if (jf2Var != null) {
            jf2Var.set(10, bVar != null ? bVar.f264028a : null);
        }
        return jz5.f0.f302826a;
    }
}
