package k33;

/* loaded from: classes4.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k33.b f303855d;

    public a(k33.b bVar) {
        this.f303855d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k33.b bVar = this.f303855d;
        if (bVar.isShowing()) {
            bVar.dismiss();
        }
    }
}
