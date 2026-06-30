package jq4;

/* loaded from: classes5.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f301169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f301170e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f301171f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(android.widget.ImageView imageView, android.view.View view, android.graphics.Bitmap bitmap, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f301169d = imageView;
        this.f301170e = view;
        this.f301171f = bitmap;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jq4.m0(this.f301169d, this.f301170e, this.f301171f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        jq4.m0 m0Var = (jq4.m0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        m0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(this.f301170e.getResources(), this.f301171f);
        bitmapDrawable.setAlpha(230);
        bitmapDrawable.setFilterBitmap(true);
        this.f301169d.setBackground(bitmapDrawable);
        return jz5.f0.f302826a;
    }
}
