package po0;

/* loaded from: classes5.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f357280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f357281e;

    public a(yz5.l lVar, android.graphics.Bitmap bitmap) {
        this.f357280d = lVar;
        this.f357281e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar = this.f357280d;
        if (lVar != null) {
            lVar.invoke(this.f357281e);
        }
    }
}
