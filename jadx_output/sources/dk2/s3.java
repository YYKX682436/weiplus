package dk2;

/* loaded from: classes3.dex */
public final class s3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f234058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234059e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(dk2.r4 r4Var, java.lang.String str) {
        super(0);
        this.f234058d = r4Var;
        this.f234059e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dk2.r4 r4Var = this.f234058d;
        java.lang.String str = r4Var.f234009d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showCenterTextToast ");
        java.lang.String str2 = this.f234059e;
        sb6.append(str2);
        sb6.append(" context:");
        sb6.append(r4Var.M());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        android.content.Context M = r4Var.M();
        if (M != null) {
            db5.t7.m(M, str2);
        }
        return jz5.f0.f302826a;
    }
}
