package ya2;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f460488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f460489e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.view.View view, android.graphics.Bitmap bitmap) {
        super(0);
        this.f460488d = view;
        this.f460489e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f460488d;
        boolean z17 = view instanceof com.tencent.mm.ui.widget.QImageView;
        android.graphics.Bitmap bitmap = this.f460489e;
        if (z17) {
            ((com.tencent.mm.ui.widget.QImageView) view).setImageBitmap(bitmap);
        } else if (view instanceof com.tencent.mm.ui.MMImageView) {
            ((com.tencent.mm.ui.MMImageView) view).setImageBitmap(bitmap);
        }
        return jz5.f0.f302826a;
    }
}
