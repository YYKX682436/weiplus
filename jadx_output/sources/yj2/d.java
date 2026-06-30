package yj2;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f462649d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.widget.ImageView imageView) {
        super(1);
        this.f462649d = imageView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            this.f462649d.setImageDrawable(new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), bitmap));
        }
        return jz5.f0.f302826a;
    }
}
