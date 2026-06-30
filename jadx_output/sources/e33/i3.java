package e33;

/* loaded from: classes10.dex */
public class i3 implements kk.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e33.l3 f247286a;

    public i3(e33.l3 l3Var) {
        this.f247286a = l3Var;
    }

    @Override // kk.h
    public void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        if (bitmap == null || bitmap.isRecycled() || this.f247286a.f247325h.indexOfKey(bitmap.hashCode()) >= 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("ImageAdapter", "bitmap recycle %s", bitmap.toString());
        bitmap.recycle();
    }
}
