package d33;

/* loaded from: classes9.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f226232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.picker.view.ImageCropUI f226233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gif.b f226234f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f226235g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(android.widget.ImageView imageView, com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI, com.tencent.mm.plugin.gif.b bVar, yz5.p pVar) {
        super(0);
        this.f226232d = imageView;
        this.f226233e = imageCropUI;
        this.f226234f = bVar;
        this.f226235g = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI = this.f226233e;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = imageCropUI.f138476t;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        imageCropUI.A = true;
        com.tencent.mm.plugin.gif.b bVar = this.f226234f;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(bVar.getIntrinsicWidth(), bVar.getIntrinsicHeight());
        android.widget.ImageView imageView = this.f226232d;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageDrawable(bVar);
        this.f226235g.invoke(java.lang.Integer.valueOf(bVar.getIntrinsicWidth()), java.lang.Integer.valueOf(bVar.getIntrinsicHeight()));
        return jz5.f0.f302826a;
    }
}
