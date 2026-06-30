package zl2;

/* loaded from: classes3.dex */
public final class a3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f473645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473646e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(android.graphics.Bitmap bitmap, java.lang.String str) {
        super(0);
        this.f473645d = bitmap;
        this.f473646e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f473645d;
        if (bitmap != null) {
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).hj(this.f473646e, null, bitmap, null);
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "resource is null!");
        }
        return jz5.f0.f302826a;
    }
}
