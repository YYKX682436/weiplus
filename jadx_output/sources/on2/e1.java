package on2;

/* loaded from: classes3.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f346888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on2.z0 f346889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346890f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ on2.j1 f346891g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f346892h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(android.graphics.Bitmap bitmap, on2.z0 z0Var, java.lang.String str, on2.j1 j1Var, r45.dz1 dz1Var) {
        super(0);
        this.f346888d = bitmap;
        this.f346889e = z0Var;
        this.f346890f = str;
        this.f346891g = j1Var;
        this.f346892h = dz1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        on2.z0 z0Var = this.f346889e;
        android.graphics.Bitmap bitmap = this.f346888d;
        if (bitmap != null) {
            z0Var.f347085m.setImageBitmap(bitmap);
            android.widget.ImageView imageView = z0Var.f347085m;
            imageView.setVisibility(0);
            imageView.setOnClickListener(new on2.d1(this.f346891g, z0Var, this.f346892h));
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveLotteryPanelListAdapter", this.f346890f + " resource is null");
            z0Var.f347085m.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
