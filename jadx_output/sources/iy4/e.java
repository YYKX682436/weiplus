package iy4;

/* loaded from: classes11.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f295949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295950e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f295951f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f295952g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ iy4.g f295953h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f295954i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f295955m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j17, java.lang.String str, long j18, long j19, iy4.g gVar, long j27, int i17) {
        super(0);
        this.f295949d = j17;
        this.f295950e = str;
        this.f295951f = j18;
        this.f295952g = j19;
        this.f295953h = gVar;
        this.f295954i = j27;
        this.f295955m = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getChatPackageAsync taskId = ");
        sb6.append(this.f295949d);
        sb6.append(", conversationId = ");
        java.lang.String str = this.f295950e;
        sb6.append(str);
        sb6.append(", fromTime = ");
        sb6.append(this.f295951f);
        sb6.append(", toTime = ");
        sb6.append(this.f295952g);
        com.tencent.mars.xlog.Log.i("AffExtDeviceNativeUtilImpl", sb6.toString());
        long j17 = this.f295951f;
        long j18 = this.f295952g;
        iy4.g gVar = this.f295953h;
        if (j17 > j18) {
            com.tencent.mars.xlog.Log.i("AffExtDeviceNativeUtilImpl", "getChatPackageAsync fromTime > toTime, skip DB query, return");
            com.tencent.wechat.aff.ext_device.e eVar = gVar.f295963b;
            if (eVar != null) {
                eVar.a(this.f295949d, true, 0L, new bw5.w0());
            }
        } else {
            jz5.o a17 = co1.g.f43768a.a(this.f295950e, Long.MIN_VALUE, j17, j18, this.f295954i, this.f295955m, gVar.f295964c);
            bw5.w0 w0Var = (bw5.w0) a17.f302841d;
            boolean booleanValue = ((java.lang.Boolean) a17.f302842e).booleanValue();
            long longValue = ((java.lang.Number) a17.f302843f).longValue();
            com.tencent.mars.xlog.Log.i("AffExtDeviceNativeUtilImpl", "onGetChatPackageComplete return, conversationId = " + str + ", isLast = " + booleanValue + ", realOffset = " + longValue);
            com.tencent.wechat.aff.ext_device.e eVar2 = gVar.f295963b;
            if (eVar2 != null) {
                eVar2.a(this.f295949d, booleanValue, longValue, w0Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
