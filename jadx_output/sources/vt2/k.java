package vt2;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f439967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f439968e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439969f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439970g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ byte[] f439971h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439972i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f439973m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f439974n;

    public k(long j17, long j18, java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.String str3, r45.y23 y23Var, tt2.e1 e1Var) {
        this.f439967d = j17;
        this.f439968e = j18;
        this.f439969f = str;
        this.f439970g = str2;
        this.f439971h = bArr;
        this.f439972i = str3;
        this.f439973m = y23Var;
        this.f439974n = e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        boolean z17 = g92.b.f269769e.k2().getInteger(4) == 3;
        long j17 = this.f439967d;
        long j18 = this.f439968e;
        java.lang.String str2 = this.f439969f;
        java.lang.String str3 = this.f439970g;
        if (z17) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            str = xy2.c.e(context);
        } else {
            str = null;
        }
        java.lang.String str4 = str;
        com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(this.f439971h);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.hj6 hj6Var = new r45.hj6();
        hj6Var.set(0, 2);
        r45.xy2 xy2Var = new r45.xy2();
        r45.y23 y23Var = this.f439973m;
        xy2Var.set(0, java.lang.Long.valueOf(y23Var.getLong(0)));
        hj6Var.set(1, com.tencent.mm.protobuf.g.b(xy2Var.toByteArray()));
        linkedList.add(hj6Var);
        new ek2.o2(j17, j18, str2, str3, str4, b17, linkedList, this.f439972i, new vt2.m(this.f439967d, y23Var, new java.lang.ref.WeakReference(this.f439974n)), null).l();
    }
}
