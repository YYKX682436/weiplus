package ny;

/* loaded from: classes3.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ny.g f341367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f341368e;

    public b(ny.g gVar, android.view.ViewGroup viewGroup) {
        this.f341367d = gVar;
        this.f341368e = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ny.g gVar = this.f341367d;
        if (gVar.getParent() != null) {
            this.f341368e.removeView(gVar);
        }
        android.graphics.Bitmap bitmap = gVar.f341376d;
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        gVar.f341376d = null;
    }
}
