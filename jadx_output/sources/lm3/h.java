package lm3;

/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f319487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f319488e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        super(0);
        this.f319487d = imageView;
        this.f319488e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f319487d.setImageBitmap(this.f319488e);
        return jz5.f0.f302826a;
    }
}
