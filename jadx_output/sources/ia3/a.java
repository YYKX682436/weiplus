package ia3;

/* loaded from: classes15.dex */
public class a implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f289985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289986b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f289987c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f289989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f289990f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.LiteAppCenter.NativeCallback f289991g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ia3.e f289992h;

    public a(ia3.e eVar, long j17, java.lang.String str, long j18, java.lang.String str2, boolean z17, int i17, com.tencent.mm.plugin.lite.LiteAppCenter.NativeCallback nativeCallback) {
        this.f289992h = eVar;
        this.f289985a = j17;
        this.f289986b = str;
        this.f289987c = j18;
        this.f289988d = str2;
        this.f289989e = z17;
        this.f289990f = i17;
        this.f289991g = nativeCallback;
    }

    @Override // j35.b0
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf((iArr == null || iArr.length <= 0) ? -1 : iArr[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVoiceHelper", "onRequestPermissionsResult, requestCode: %d, grantResults: %s", objArr);
        if (i17 != 80 || iArr == null || iArr.length == 0) {
            return;
        }
        if (iArr[0] == 0) {
            this.f289992h.b(this.f289985a, this.f289986b, this.f289987c, this.f289988d, this.f289989e, this.f289990f, this.f289991g);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVoiceHelper", "onRequestPermissionsResult: permission denied");
            this.f289992h.a(3, "startSpeechRecognition:fail permission denied", this.f289991g);
        }
    }
}
