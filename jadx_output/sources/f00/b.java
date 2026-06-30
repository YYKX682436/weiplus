package f00;

/* loaded from: classes9.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f00.d f258290d;

    public b(f00.d dVar) {
        this.f258290d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context;
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        f00.d dVar = this.f258290d;
        f00.v vVar = dVar.f258294b;
        if (vVar != null && (u3Var = ((f00.u) vVar).f258328b) != null) {
            u3Var.dismiss();
        }
        f00.v vVar2 = dVar.f258294b;
        if (vVar2 != null) {
            f00.u uVar = (f00.u) vVar2;
            java.lang.ref.WeakReference weakReference = uVar.f258331a;
            if (weakReference == null || (context = (android.content.Context) weakReference.get()) == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            java.lang.String str = uVar.f258329c;
            android.content.DialogInterface.OnCancelListener onCancelListener = uVar.f258330d;
            uVar.f258328b = com.tencent.mm.ui.widget.dialog.u3.f(context, str, onCancelListener != null, 0, onCancelListener);
        }
    }
}
