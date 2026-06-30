package ys2;

/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ys2.s f465183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f465184e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ys2.s sVar, android.graphics.Bitmap bitmap) {
        super(0);
        this.f465183d = sVar;
        this.f465184e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ys2.s sVar = this.f465183d;
        sVar.f465189g.setImageBitmap(this.f465184e);
        float width = r2.getWidth() / r2.getHeight();
        android.view.View view = sVar.f465187e;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.View view2 = sVar.f465186d;
        if (width > 1.0f) {
            layoutParams.width = (int) view2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479670c7);
            layoutParams.height = (int) view2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.by);
        } else {
            layoutParams.width = (int) view2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.by);
            layoutParams.height = (int) view2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479670c7);
        }
        view.setLayoutParams(layoutParams);
        return jz5.f0.f302826a;
    }
}
