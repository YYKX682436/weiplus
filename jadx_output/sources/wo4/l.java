package wo4;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.Surface f448272a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f448273b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f448274c;

    /* renamed from: d, reason: collision with root package name */
    public final vo4.i f448275d;

    /* renamed from: e, reason: collision with root package name */
    public volatile int f448276e;

    /* renamed from: f, reason: collision with root package name */
    public zv3.a f448277f;

    /* renamed from: g, reason: collision with root package name */
    public long f448278g;

    /* renamed from: h, reason: collision with root package name */
    public final zv3.g f448279h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f448280i;

    /* renamed from: j, reason: collision with root package name */
    public final yz5.l f448281j;

    public l(android.view.Surface surface, int i17, int i18, int i19, int i27, int i28, int i29, float f17, float f18, com.tencent.mm.plugin.vlog.model.m1 scriptModel, yz5.p pVar, yz5.l lVar) {
        kotlin.jvm.internal.o.g(surface, "surface");
        kotlin.jvm.internal.o.g(scriptModel, "scriptModel");
        this.f448272a = surface;
        this.f448273b = pVar;
        this.f448274c = lVar;
        vo4.i iVar = new vo4.i(i17, i18, i19, i27, f17, f18, false, false);
        this.f448275d = iVar;
        vo4.p pVar2 = new vo4.p(i17, i18, i19, i27);
        this.f448278g = -1L;
        this.f448281j = new wo4.j(this);
        vo4.k kVar = vo4.k.f438649a;
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogMaterialsInfoCache", "clearCache");
        vo4.k.f438650b.clear();
        pVar2.a(surface);
        iVar.d(pVar2);
        iVar.c(30, 30);
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogDirector", iVar.hashCode() + "  setScript  durationMs :" + i28 + "  musicUrl:");
        iVar.f438644o = i28;
        iVar.f438643n = 0L;
        iVar.f438642m = true;
        vo4.t tVar = iVar.f438636g;
        if (tVar != null) {
            tVar.b(new vo4.f(iVar, scriptModel));
        }
        wo4.h hVar = new wo4.h(this);
        wo4.i iVar2 = new wo4.i(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogDirector", "setCallback");
        iVar.f438637h = hVar;
        iVar.f438638i = iVar2;
        zv3.g gVar = new zv3.g(new zv3.d(scriptModel.f175679g, scriptModel.f175680h, scriptModel.f175677e, i17, i18, i17, i18, 0, true, null, 512, null));
        this.f448279h = gVar;
        gVar.d();
    }
}
