package r35;

/* loaded from: classes9.dex */
public class v0 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f369286d;

    public v0(android.graphics.Bitmap bitmap) {
        this.f369286d = bitmap;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        android.graphics.Bitmap bitmap = this.f369286d;
        if (bitmap != null) {
            bitmap.isRecycled();
        }
    }
}
