package dk2;

/* loaded from: classes3.dex */
public final class r3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f234002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234003e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f234004f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(dk2.r4 r4Var, java.lang.String str, int i17) {
        super(0);
        this.f234002d = r4Var;
        this.f234003e = str;
        this.f234004f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dk2.r4 r4Var = this.f234002d;
        java.lang.String str = r4Var.f234009d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showCenterCustomizeToast ");
        java.lang.String str2 = this.f234003e;
        sb6.append(str2);
        sb6.append(" context:");
        sb6.append(r4Var.M());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        android.content.Context M = r4Var.M();
        if (M != null) {
            db5.t7.f(M, str2, new dk2.q3(this.f234004f));
        }
        return jz5.f0.f302826a;
    }
}
