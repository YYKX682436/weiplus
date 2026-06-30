package mm3;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.h6 f329618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f329619e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk4.c f329620f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f329621g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f329622h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.mv.ui.uic.h6 h6Var, int i17, pk4.c cVar, long j17, java.util.List list) {
        super(2);
        this.f329618d = h6Var;
        this.f329619e = i17;
        this.f329620f = cVar;
        this.f329621g = j17;
        this.f329622h = list;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fm3.b bVar = (fm3.b) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "preview transition: " + bVar);
        this.f329618d.O6(this.f329619e, bVar);
        com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout multiMediaEffectVideoLayout = (com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) this.f329620f;
        long j17 = this.f329621g;
        multiMediaEffectVideoLayout.d(j17);
        multiMediaEffectVideoLayout.c();
        kl3.t.g().a().c((int) j17);
        kl3.t.g().a().resume();
        java.util.Iterator it = this.f329622h.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (kotlin.jvm.internal.o.b(((fm3.b) it.next()).f264028a, bVar != null ? bVar.f264028a : null)) {
                break;
            }
            i17++;
        }
        int i18 = i17 + 1;
        if (i18 < 0) {
            i18 = 0;
        }
        if (booleanValue) {
            com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct c17 = fm3.g0.f264070a.c();
            c17.f59482k = 16L;
            c17.G = 0;
            c17.F = i18;
            c17.k();
        } else {
            com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct c18 = fm3.g0.f264070a.c();
            c18.f59482k = 15L;
            c18.G = 0;
            c18.F = i18;
            c18.k();
        }
        return jz5.f0.f302826a;
    }
}
