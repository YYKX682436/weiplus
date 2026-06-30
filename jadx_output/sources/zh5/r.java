package zh5;

/* loaded from: classes12.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f473063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zh5.v f473064e;

    public r(java.lang.Runnable runnable, zh5.v vVar) {
        this.f473063d = runnable;
        this.f473064e = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f473063d.run();
        zh5.v vVar = this.f473064e;
        com.tencent.mm.ui.widget.snackbar.j.c(vVar.getString(com.tencent.mm.R.string.c9u), null, vVar.getActivity(), null, null);
    }
}
