package on2;

/* loaded from: classes3.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f346914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on2.z0 f346915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346916f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(android.graphics.Bitmap bitmap, on2.z0 z0Var, java.lang.String str) {
        super(0);
        this.f346914d = bitmap;
        this.f346915e = z0Var;
        this.f346916f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        on2.z0 z0Var = this.f346915e;
        android.graphics.Bitmap bitmap = this.f346914d;
        if (bitmap != null) {
            z0Var.f347085m.setImageBitmap(bitmap);
            android.widget.ImageView imageView = z0Var.f347085m;
            imageView.setVisibility(0);
            imageView.setOnClickListener(null);
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveLotteryPanelListAdapter", this.f346916f + " resource is null");
            z0Var.f347085m.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
