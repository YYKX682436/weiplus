package zl2;

/* loaded from: classes.dex */
public final class r2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f473945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f473946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473947f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(android.graphics.Bitmap bitmap, yz5.l lVar, java.lang.String str) {
        super(0);
        this.f473945d = bitmap;
        this.f473946e = lVar;
        this.f473947f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getPlayerBackground bitmap: ");
        android.graphics.Bitmap bitmap = this.f473945d;
        sb6.append(bitmap);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", sb6.toString());
        if (bitmap != null) {
            this.f473946e.invoke(bitmap);
            ((java.util.HashMap) zl2.r4.f473960k).put(this.f473947f, bitmap);
        }
        return jz5.f0.f302826a;
    }
}
