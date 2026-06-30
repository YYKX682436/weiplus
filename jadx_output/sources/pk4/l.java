package pk4;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout f356505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kk4.v f356506e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f356507f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout mMMvVideoLayout, kk4.v vVar, long j17) {
        super(1);
        this.f356505d = mMMvVideoLayout;
        this.f356506e = vVar;
        this.f356507f = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dk4.a aVar;
        dk4.a aVar2;
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj;
        com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout mMMvVideoLayout = this.f356505d;
        java.lang.String str = mMMvVideoLayout.f174512d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recreatePlayerSurface create surface finished:");
        sb6.append(surfaceTexture != null ? surfaceTexture.hashCode() : 0);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        mMMvVideoLayout.f174524s = surfaceTexture;
        kk4.v vVar = this.f356506e;
        int i17 = (vVar == null || (aVar2 = vVar.f308578c) == null) ? 0 : aVar2.f234485v;
        int i18 = (vVar == null || (aVar = vVar.f308578c) == null) ? 0 : aVar.f234486w;
        java.lang.String str2 = mMMvVideoLayout.f174512d;
        com.tencent.mars.xlog.Log.i(str2, "recreatePlayerSurface defaultBufferSize:[" + i17 + ',' + i18 + ']');
        android.graphics.SurfaceTexture surfaceTexture2 = mMMvVideoLayout.f174524s;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setDefaultBufferSize(i17, i18);
        }
        mMMvVideoLayout.f174525t = new android.view.Surface(mMMvVideoLayout.f174524s);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("recreatePlayerSurface create playerSurface:");
        android.view.Surface surface = mMMvVideoLayout.f174525t;
        sb7.append(surface != null ? surface.hashCode() : 0);
        sb7.append(", cost:");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb7.append(android.os.SystemClock.elapsedRealtime() - this.f356507f);
        com.tencent.mars.xlog.Log.i(str2, sb7.toString());
        if (vVar != null) {
            kk4.b.h(vVar, mMMvVideoLayout.f174525t, false, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
