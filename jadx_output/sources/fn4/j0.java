package fn4;

/* loaded from: classes15.dex */
public class j0 extends com.tencent.mm.network.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn4.k0 f264558d;

    public j0(fn4.k0 k0Var) {
        this.f264558d = k0Var;
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        fn4.k0 k0Var = this.f264558d;
        int i18 = k0Var.f264569c;
        k0Var.f264569c = k0Var.a();
        if (k0Var.f264569c != i18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryNetworkMgr", "network change current:%d change:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(k0Var.f264569c));
            com.tencent.mm.sdk.platformtools.u3.h(new fn4.i0(this, i18));
        }
    }
}
