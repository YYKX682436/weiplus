package ga2;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f269833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f269834e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(in5.s0 s0Var, android.graphics.Bitmap bitmap) {
        super(0);
        this.f269833d = s0Var;
        this.f269834e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView imageView = (android.widget.ImageView) this.f269833d.itemView.findViewById(com.tencent.mm.R.id.tsh);
        if (imageView != null) {
            imageView.setImageBitmap(this.f269834e);
        }
        return jz5.f0.f302826a;
    }
}
