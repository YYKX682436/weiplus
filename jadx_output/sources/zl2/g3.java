package zl2;

/* loaded from: classes2.dex */
public final class g3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f473787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f473788e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(android.view.View view, yz5.l lVar) {
        super(1);
        this.f473787d = view;
        this.f473788e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        yz5.l lVar = this.f473788e;
        if (bitmap != null) {
            android.view.View view = this.f473787d;
            if (view instanceof android.widget.ImageView) {
                ((android.widget.ImageView) view).setImageDrawable(new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), bitmap));
            } else {
                view.setBackground(new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), bitmap));
            }
            if (lVar != null) {
                lVar.invoke(bitmap);
            }
        } else if (lVar != null) {
            lVar.invoke(null);
        }
        return jz5.f0.f302826a;
    }
}
