package id2;

/* loaded from: classes3.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290664d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(id2.v1 v1Var) {
        super(0);
        this.f290664d = v1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        id2.v1 v1Var = this.f290664d;
        com.tencent.mars.xlog.Log.i(v1Var.f290834d, "buy success, finish");
        gk2.e eVar = dk2.ef.I;
        if (eVar != null && (liveMutableData = ((mm2.s2) eVar.a(mm2.s2.class)).f329409n) != null) {
            liveMutableData.postValue(java.lang.Boolean.FALSE);
        }
        v1Var.getActivity().finish();
        return jz5.f0.f302826a;
    }
}
