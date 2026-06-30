package sm3;

/* loaded from: classes10.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm3.o f409887d;

    public l(sm3.o oVar) {
        this.f409887d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sm3.o oVar = this.f409887d;
        int size = oVar.f409897e.getTracks().size();
        oVar.getClass();
        oVar.notifyItemChanged(size + 1);
    }
}
