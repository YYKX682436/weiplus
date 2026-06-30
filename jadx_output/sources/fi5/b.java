package fi5;

/* loaded from: classes12.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f263069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fi5.f f263070e;

    public b(java.lang.Runnable runnable, fi5.f fVar) {
        this.f263069d = runnable;
        this.f263070e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f263069d.run();
        fi5.f fVar = this.f263070e;
        com.tencent.mm.ui.widget.snackbar.j.c(fVar.getString(com.tencent.mm.R.string.c9u), null, fVar.getActivity(), null, null);
    }
}
