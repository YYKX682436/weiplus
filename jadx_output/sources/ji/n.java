package ji;

/* loaded from: classes12.dex */
public final class n implements com.tencent.matrix.lifecycle.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ji.o f299893d;

    public n(ji.o oVar) {
        this.f299893d = oVar;
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        ji.o oVar = this.f299893d;
        oVar.f299894a.removeCallbacks(oVar.f299895b);
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        ji.o oVar = this.f299893d;
        oVar.f299894a.postDelayed(oVar.f299895b, oVar.f299896c.f299903g);
    }
}
