package yf2;

/* loaded from: classes3.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.z f461808d;

    public x(yf2.z zVar) {
        this.f461808d = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view;
        yf2.z zVar = this.f461808d;
        if (!zVar.f461823p && (view = zVar.f461820m) != null) {
            view.setEnabled(true);
        }
        android.view.View view2 = zVar.f461820m;
        if (view2 != null) {
            view2.setOnClickListener(new yf2.w(zVar));
        }
    }
}
