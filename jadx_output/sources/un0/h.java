package un0;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f429352a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Intent f429353b;

    /* renamed from: c, reason: collision with root package name */
    public int f429354c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f429355d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f429356e;

    /* renamed from: f, reason: collision with root package name */
    public long f429357f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.SurfaceTexture f429358g;

    /* renamed from: h, reason: collision with root package name */
    public int f429359h;

    /* renamed from: i, reason: collision with root package name */
    public int f429360i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.r f429361j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.List f429362k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.List f429363l;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.a f429364m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f429365n;

    public h(boolean z17, android.content.Intent intent, int i17, boolean z18, android.graphics.Bitmap bitmap, long j17, android.graphics.SurfaceTexture surfaceTexture, int i18, int i19, yz5.r rVar, java.util.List list, java.util.List list2, yz5.a aVar, yz5.l lVar, int i27, kotlin.jvm.internal.i iVar) {
        boolean z19 = (i27 & 1) != 0 ? false : z17;
        android.content.Intent intent2 = (i27 & 2) != 0 ? null : intent;
        int i28 = (i27 & 4) != 0 ? -1000 : i17;
        boolean z27 = (i27 & 8) != 0 ? true : z18;
        android.graphics.Bitmap bitmap2 = (i27 & 16) != 0 ? null : bitmap;
        long j18 = (i27 & 32) != 0 ? 0L : j17;
        android.graphics.SurfaceTexture surfaceTexture2 = (i27 & 64) != 0 ? null : surfaceTexture;
        int i29 = (i27 & 128) != 0 ? 0 : i18;
        int i37 = (i27 & 256) == 0 ? i19 : 0;
        yz5.r rVar2 = (i27 & 512) == 0 ? rVar : null;
        java.util.List onInnerStartCallback = (i27 & 1024) != 0 ? new java.util.ArrayList() : list;
        java.util.List onInnerStopCallback = (i27 & 2048) != 0 ? new java.util.ArrayList() : list2;
        yz5.a isAppForeground = (i27 & 4096) != 0 ? un0.f.f429350d : aVar;
        yz5.l invokeToStop = (i27 & 8192) != 0 ? un0.g.f429351d : lVar;
        kotlin.jvm.internal.o.g(onInnerStartCallback, "onInnerStartCallback");
        kotlin.jvm.internal.o.g(onInnerStopCallback, "onInnerStopCallback");
        kotlin.jvm.internal.o.g(isAppForeground, "isAppForeground");
        kotlin.jvm.internal.o.g(invokeToStop, "invokeToStop");
        this.f429352a = z19;
        this.f429353b = intent2;
        this.f429354c = i28;
        this.f429355d = z27;
        this.f429356e = bitmap2;
        this.f429357f = j18;
        this.f429358g = surfaceTexture2;
        this.f429359h = i29;
        this.f429360i = i37;
        this.f429361j = rVar2;
        this.f429362k = onInnerStartCallback;
        this.f429363l = onInnerStopCallback;
        this.f429364m = isAppForeground;
        this.f429365n = invokeToStop;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un0.h)) {
            return false;
        }
        un0.h hVar = (un0.h) obj;
        return this.f429352a == hVar.f429352a && kotlin.jvm.internal.o.b(this.f429353b, hVar.f429353b) && this.f429354c == hVar.f429354c && this.f429355d == hVar.f429355d && kotlin.jvm.internal.o.b(this.f429356e, hVar.f429356e) && this.f429357f == hVar.f429357f && kotlin.jvm.internal.o.b(this.f429358g, hVar.f429358g) && this.f429359h == hVar.f429359h && this.f429360i == hVar.f429360i && kotlin.jvm.internal.o.b(this.f429361j, hVar.f429361j) && kotlin.jvm.internal.o.b(this.f429362k, hVar.f429362k) && kotlin.jvm.internal.o.b(this.f429363l, hVar.f429363l) && kotlin.jvm.internal.o.b(this.f429364m, hVar.f429364m) && kotlin.jvm.internal.o.b(this.f429365n, hVar.f429365n);
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f429352a) * 31;
        android.content.Intent intent = this.f429353b;
        int hashCode2 = (((((hashCode + (intent == null ? 0 : intent.hashCode())) * 31) + java.lang.Integer.hashCode(this.f429354c)) * 31) + java.lang.Boolean.hashCode(this.f429355d)) * 31;
        android.graphics.Bitmap bitmap = this.f429356e;
        int hashCode3 = (((hashCode2 + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + java.lang.Long.hashCode(this.f429357f)) * 31;
        android.graphics.SurfaceTexture surfaceTexture = this.f429358g;
        int hashCode4 = (((((hashCode3 + (surfaceTexture == null ? 0 : surfaceTexture.hashCode())) * 31) + java.lang.Integer.hashCode(this.f429359h)) * 31) + java.lang.Integer.hashCode(this.f429360i)) * 31;
        yz5.r rVar = this.f429361j;
        return ((((((((hashCode4 + (rVar != null ? rVar.hashCode() : 0)) * 31) + this.f429362k.hashCode()) * 31) + this.f429363l.hashCode()) * 31) + this.f429364m.hashCode()) * 31) + this.f429365n.hashCode();
    }

    public java.lang.String toString() {
        return "RecordCommunication(isPermissionResultSuccess=" + this.f429352a + ", permissionResultIntent=" + this.f429353b + ", permissionResultCode=" + this.f429354c + ", isVerticalRecord=" + this.f429355d + ", coverBitmap=" + this.f429356e + ", coverBitmapUpdateTime=" + this.f429357f + ", surfaceTexture=" + this.f429358g + ", width=" + this.f429359h + ", height=" + this.f429360i + ", onAudioFrameAvailable=" + this.f429361j + ", onInnerStartCallback=" + this.f429362k + ", onInnerStopCallback=" + this.f429363l + ", isAppForeground=" + this.f429364m + ", invokeToStop=" + this.f429365n + ')';
    }
}
