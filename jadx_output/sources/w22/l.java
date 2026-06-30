package w22;

/* loaded from: classes10.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w22.v f442562d;

    public l(w22.v vVar) {
        this.f442562d = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w22.v vVar = this.f442562d;
        ((y22.m) vVar.f442582c).b();
        db5.t7.makeText(vVar.f442580a, com.tencent.mm.R.string.bwb, 0).show();
        vVar.h();
    }
}
