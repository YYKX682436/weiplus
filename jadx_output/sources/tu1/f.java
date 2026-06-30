package tu1;

/* loaded from: classes13.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tu1.o f422095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pu1.b f422096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f422097f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(tu1.o oVar, pu1.b bVar, android.content.Context context) {
        super(0);
        this.f422095d = oVar;
        this.f422096e = bVar;
        this.f422097f = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.media.projection.MediaProjection mediaProjection;
        tu1.o oVar = this.f422095d;
        android.content.Context context = this.f422097f;
        tu1.d dVar = new tu1.d(oVar, context);
        oVar.getClass();
        pu1.b bVar = this.f422096e;
        bVar.f256320j = false;
        int i17 = bVar.f256315e;
        if (i17 == 0) {
            i17 = 30;
        }
        bVar.f256315e = i17;
        int i18 = bVar.f256314d;
        if (i18 == 0) {
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            e42.d0 d0Var = e42.d0.clicfg_finder_screec_cast_pc_video_bitrate;
            bVar.f256314d = ((h62.d) e0Var).Ni(d0Var, 4000) * 1000;
            i18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(d0Var, 4000) * 1000;
        }
        bVar.f256314d = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastManager", "config is " + bVar);
        oVar.f422115f = new ru1.t(bVar, dVar);
        tu1.e eVar = new tu1.e(context, oVar);
        pu1.a aVar = bVar.f358419p;
        pu1.a aVar2 = aVar.f358415a ? aVar : null;
        if (aVar2 != null) {
            if (android.os.Build.VERSION.SDK_INT >= 29 && b3.l.checkSelfPermission(context, "android.permission.RECORD_AUDIO") == 0 && (mediaProjection = oVar.f422111b) != null) {
                try {
                    oVar.f422116g = new ru1.g(mediaProjection, context, aVar, eVar);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ScreenCastManager", "createMediaProjection failed cause " + e17);
                }
            }
            if (oVar.f422116g == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastManager", "mScreenCastAudioEncoder still null");
                oVar.f422116g = new ru1.e(aVar2, eVar);
            }
        }
        ru1.u uVar = oVar.f422116g;
        if (uVar != null) {
            uVar.a();
        }
        oVar.f422120k = true;
        return jz5.f0.f302826a;
    }
}
