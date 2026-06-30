package df2;

/* loaded from: classes3.dex */
public final class wh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.fi f231688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f231689e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh(df2.fi fiVar, android.graphics.Bitmap bitmap) {
        super(0);
        this.f231688d = fiVar;
        this.f231689e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View S6 = this.f231688d.S6(com.tencent.mm.R.id.opb);
        android.widget.ImageView imageView = S6 != null ? (android.widget.ImageView) S6.findViewById(com.tencent.mm.R.id.oiw) : null;
        if (imageView != null) {
            imageView.setImageBitmap(this.f231689e);
        }
        return jz5.f0.f302826a;
    }
}
