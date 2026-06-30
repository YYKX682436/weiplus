package lm3;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f319492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f319493e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        super(0);
        this.f319492d = imageView;
        this.f319493e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f319492d.setImageBitmap(this.f319493e);
        return jz5.f0.f302826a;
    }
}
