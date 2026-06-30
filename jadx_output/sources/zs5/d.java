package zs5;

/* loaded from: classes9.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs5.y f475336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f475337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f475338f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f475339g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f475340h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f475341i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f475342m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f475343n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zs5.y yVar, byte[] bArr, android.graphics.Point point, int i17, int i18, android.graphics.Rect rect, android.graphics.Rect rect2, long j17) {
        super(0);
        this.f475336d = yVar;
        this.f475337e = bArr;
        this.f475338f = point;
        this.f475339g = i17;
        this.f475340h = i18;
        this.f475341i = rect;
        this.f475342m = rect2;
        this.f475343n = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.wechat.aff.iam_scan.d1 d1Var;
        int i17 = this.f475339g;
        int i18 = this.f475340h;
        zs5.y yVar = this.f475336d;
        yVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (yVar.f475514o == 0 && (d1Var = yVar.f475508i) != null) {
            yVar.f475514o = currentTimeMillis - d1Var.f216988g;
        }
        android.graphics.Point point = this.f475338f;
        java.util.Objects.toString(point);
        java.util.Objects.toString(this.f475341i);
        android.graphics.Rect rect = this.f475342m;
        java.util.Objects.toString(rect);
        byte[] bArr = this.f475337e;
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        long j17 = yVar.f475522w + 1;
        yVar.f475522w = j17;
        yVar.f475518s.put(java.lang.Long.valueOf(j17), allocateDirect);
        yVar.f475519t.put(java.lang.Long.valueOf(j17), bArr);
        yVar.f475502c = point;
        yVar.f475503d = i17;
        yVar.f475504e = i18;
        com.tencent.wechat.aff.iam_scan.x xVar = new com.tencent.wechat.aff.iam_scan.x();
        xVar.f217152d = j17;
        xVar.f217153e = bArr.length;
        xVar.f217154f = point.x;
        xVar.f217155g = point.y;
        xVar.f217156h = i17;
        xVar.f217157i = et5.h.g(i18);
        com.tencent.wechat.aff.iam_scan.u0 u0Var = new com.tencent.wechat.aff.iam_scan.u0();
        u0Var.f217139d = rect.top;
        u0Var.f217140e = rect.left;
        u0Var.f217141f = rect.width();
        u0Var.f217142g = rect.height();
        xVar.f217158m = u0Var;
        xVar.f217159n = this.f475343n;
        xVar.f217160o = currentTimeMillis2;
        xVar.f217161p = currentTimeMillis;
        xVar.f217162q = yVar.f475514o;
        com.tencent.wechat.aff.iam_scan.h0.f217048b.a(allocateDirect, xVar, new zs5.h(currentTimeMillis, yVar, bArr, point, i17, i18, j17, allocateDirect));
        return jz5.f0.f302826a;
    }
}
