package jq4;

/* loaded from: classes2.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f301211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f301212e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f301213f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f301214g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(android.widget.ImageView imageView, android.view.View view, android.view.View view2, android.graphics.Bitmap bitmap, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f301211d = imageView;
        this.f301212e = view;
        this.f301213f = view2;
        this.f301214g = bitmap;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jq4.w0(this.f301211d, this.f301212e, this.f301213f, this.f301214g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        jq4.w0 w0Var = (jq4.w0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        w0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.widget.ImageView imageView = this.f301211d;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        android.view.View view = this.f301213f;
        layoutParams.width = view.getWidth();
        layoutParams.height = view.getHeight();
        imageView.setLayoutParams(layoutParams);
        android.view.View view2 = this.f301212e;
        android.view.ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        layoutParams2.width = view.getWidth();
        layoutParams2.height = view.getHeight();
        view2.setLayoutParams(layoutParams2);
        view2.setBackground(new android.graphics.drawable.BitmapDrawable(view.getResources(), this.f301214g));
        return jz5.f0.f302826a;
    }
}
