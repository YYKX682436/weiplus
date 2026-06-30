package rn3;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f397947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f397948f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rn3.f f397949g;

    public e(rn3.f fVar, java.lang.String str, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        this.f397949g = fVar;
        this.f397946d = str;
        this.f397947e = bitmap;
        this.f397948f = bitmap2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download url ");
        java.lang.String str = this.f397946d;
        sb6.append(str);
        sb6.append(" , result ");
        android.graphics.Bitmap bitmap = this.f397947e;
        sb6.append(bitmap == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NormalIconNewTipPreference", sb6.toString());
        rn3.f fVar = this.f397949g;
        if (str.equals(fVar.f397950a.f152358b2)) {
            com.tencent.mm.plugin.newtips.NormalIconNewTipPreference normalIconNewTipPreference = fVar.f397950a;
            normalIconNewTipPreference.getClass();
            if (normalIconNewTipPreference instanceof com.tencent.mm.plugin.newtips.CustomSizeIconNewTipPreference) {
                android.graphics.Bitmap bitmap2 = this.f397948f;
                android.graphics.Bitmap s07 = (bitmap2 == null || bitmap2.isRecycled()) ? null : com.tencent.mm.sdk.platformtools.x.s0(bitmap2, false, fVar.f397950a.i0(bitmap2));
                fVar.f397950a.l0(s07);
                fVar.f397950a.R(s07);
            } else {
                fVar.f397950a.R(bitmap);
            }
            com.tencent.mm.plugin.newtips.NormalIconNewTipPreference normalIconNewTipPreference2 = fVar.f397950a;
            normalIconNewTipPreference2.f152358b2 = null;
            normalIconNewTipPreference2.k0();
        }
    }
}
