package ir1;

/* loaded from: classes11.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.conversation.ui.BizFansGreetBoxFragment f294006d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.plugin.brandservice.conversation.ui.BizFansGreetBoxFragment bizFansGreetBoxFragment) {
        super(0);
        this.f294006d = bizFansGreetBoxFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.brandservice.conversation.ui.BizFansGreetBoxFragment bizFansGreetBoxFragment = this.f294006d;
        ir1.e0 e0Var = new ir1.e0(bizFansGreetBoxFragment, bizFansGreetBoxFragment.f93951w, 1);
        int i17 = e0Var.f293959f;
        e0Var.f293965o = new ir1.t(i17);
        wn.u uVar = bizFansGreetBoxFragment.f64738u;
        if (uVar != null) {
            e0Var.f293966p = new ir1.r(i17, uVar.f447380d, null, 4, null);
            return e0Var;
        }
        kotlin.jvm.internal.o.o("readyChattingUIC");
        throw null;
    }
}
