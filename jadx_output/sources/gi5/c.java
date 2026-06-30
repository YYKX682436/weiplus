package gi5;

/* loaded from: classes12.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f272297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gi5.g f272298e;

    public c(java.lang.Runnable runnable, gi5.g gVar) {
        this.f272297d = runnable;
        this.f272298e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f272297d.run();
        gi5.g gVar = this.f272298e;
        com.tencent.mm.ui.widget.snackbar.j.c(gVar.getString(com.tencent.mm.R.string.c9u), null, gVar.getActivity(), null, null);
    }
}
