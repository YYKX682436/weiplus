package uk4;

/* loaded from: classes10.dex */
public class b implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uk4.e f428526d;

    public b(uk4.e eVar) {
        this.f428526d = eVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        uk4.e eVar = this.f428526d;
        android.view.ViewTreeObserver viewTreeObserver = eVar.f428537n;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                eVar.f428537n = eVar.f428536m.getViewTreeObserver();
            }
            eVar.f428537n.removeGlobalOnLayoutListener(eVar);
            eVar.f428537n = null;
        }
        eVar.getClass();
        eVar.f428530d = null;
        eVar.getClass();
        eVar.f428543t.removeAllViews();
        eVar.f428544u.clear();
    }
}
