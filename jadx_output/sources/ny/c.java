package ny;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ny.g f341369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f341370e;

    public c(ny.g gVar, android.view.ViewGroup viewGroup) {
        this.f341369d = gVar;
        this.f341370e = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ny.g gVar = this.f341369d;
        if (gVar.getParent() != null) {
            this.f341370e.removeView(gVar);
        }
        android.graphics.Bitmap bitmap = gVar.f341376d;
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        gVar.f341376d = null;
    }
}
