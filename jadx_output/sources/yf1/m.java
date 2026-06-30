package yf1;

/* loaded from: classes7.dex */
public class m implements tf.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yf1.n f461647a;

    public m(yf1.n nVar) {
        this.f461647a = nVar;
    }

    @Override // tf.m0
    public void a() {
    }

    @Override // tf.m0
    public void e(boolean z17) {
        yf1.n nVar = this.f461647a;
        pd1.m mVar = nVar.f461648a;
        if (mVar != null) {
            ((com.tencent.mm.plugin.appbrand.pip.y) mVar).e(nVar, z17);
        } else {
            nVar.f461649b = z17 ? 2 : 3;
        }
    }

    @Override // tf.m0
    public void f() {
        yf1.n nVar = this.f461647a;
        pd1.m mVar = nVar.f461648a;
        if (mVar != null) {
            ((com.tencent.mm.plugin.appbrand.pip.y) mVar).f(nVar);
        } else {
            nVar.f461649b = 7;
        }
    }

    @Override // tf.m0
    public void j() {
        yf1.n nVar = this.f461647a;
        pd1.m mVar = nVar.f461648a;
        if (mVar != null) {
            ((com.tencent.mm.plugin.appbrand.pip.y) mVar).c(nVar);
        } else {
            nVar.f461649b = 0;
        }
    }

    @Override // tf.m0
    public void l() {
        yf1.n nVar = this.f461647a;
        pd1.m mVar = nVar.f461648a;
        if (mVar != null) {
            ((com.tencent.mm.plugin.appbrand.pip.y) mVar).b(nVar);
        } else {
            nVar.f461649b = 1;
        }
    }

    @Override // tf.m0
    public void onPause() {
        yf1.n nVar = this.f461647a;
        pd1.m mVar = nVar.f461648a;
        if (mVar != null) {
            ((com.tencent.mm.plugin.appbrand.pip.y) mVar).d(nVar);
        } else {
            nVar.f461649b = 4;
        }
    }

    @Override // tf.m0
    public void onStop() {
        yf1.n nVar = this.f461647a;
        pd1.m mVar = nVar.f461648a;
        if (mVar != null) {
            ((com.tencent.mm.plugin.appbrand.pip.y) mVar).d(nVar);
        } else {
            nVar.f461649b = 4;
        }
    }
}
