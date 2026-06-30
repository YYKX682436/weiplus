package tl5;

/* loaded from: classes10.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl5.s f420377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f420378e;

    public n(tl5.s sVar, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f420377d = sVar;
        this.f420378e = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tl5.s sVar = this.f420377d;
        tl5.d dVar = sVar.f420388d;
        if (dVar == null) {
            return;
        }
        dVar.animate().alpha(0.0f).setDuration(sVar.f420386b.f409287e).withEndAction(new tl5.m(dVar, this.f420378e, sVar)).start();
    }
}
