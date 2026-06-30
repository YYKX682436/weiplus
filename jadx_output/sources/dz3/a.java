package dz3;

/* loaded from: classes15.dex */
public class a implements com.tencent.mm.plugin.scanner.model.e1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f245097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.RectF f245098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tz3.c f245099f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f245100g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f245101h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f245102i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dz3.i f245103m;

    public a(dz3.i iVar, byte[] bArr, android.graphics.RectF rectF, tz3.c cVar, int i17, int i18, int i19) {
        this.f245103m = iVar;
        this.f245097d = bArr;
        this.f245098e = rectF;
        this.f245099f = cVar;
        this.f245100g = i17;
        this.f245101h = i18;
        this.f245102i = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.RectF rectF;
        if (!this.f245103m.f245133a) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReIdAiScanImageDecodeQueue", "decodeFullImage not inited");
            return;
        }
        tz3.c cVar = this.f245099f;
        byte[] bArr = this.f245097d;
        if (bArr == null || (rectF = this.f245098e) == null) {
            if (cVar != null) {
                cVar.b(null);
                return;
            }
            return;
        }
        sz3.c1 i17 = com.tencent.mm.plugin.scanner.model.d1.i(this.f245100g, rectF, bArr, this.f245101h, this.f245102i);
        if (i17 != null) {
            i17.f413974a = 3;
            i17.f413975b = java.lang.System.currentTimeMillis();
        }
        if (cVar != null) {
            cVar.b(i17);
        }
    }
}
