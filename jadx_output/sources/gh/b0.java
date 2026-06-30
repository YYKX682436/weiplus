package gh;

/* loaded from: classes7.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f271798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gh.r f271799e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.graphics.Bitmap bitmap, gh.r rVar) {
        super(0);
        this.f271798d = bitmap;
        this.f271799e = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj = this.f271799e;
        android.graphics.Bitmap bitmap = this.f271798d;
        return bitmap != null ? ((android.view.TextureView) obj).getBitmap(bitmap) : ((android.view.TextureView) obj).getBitmap();
    }
}
