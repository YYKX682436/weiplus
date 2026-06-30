package te3;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.sns.MagicSnsTimelineDemoUI f418581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f418582e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.magicbrush.sns.MagicSnsTimelineDemoUI magicSnsTimelineDemoUI, n0.v2 v2Var) {
        super(0);
        this.f418581d = magicSnsTimelineDemoUI;
        this.f418582e = v2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        n0.v2 v2Var = this.f418582e;
        if (te3.n.a(v2Var) != 1) {
            v2Var.setValue(1);
            com.tencent.mm.plugin.magicbrush.sns.MagicSnsTimelineDemoUI magicSnsTimelineDemoUI = this.f418581d;
            com.tencent.mm.plugin.magicbrush.sns.MagicSnsTimelineDemoUI.T6(magicSnsTimelineDemoUI, magicSnsTimelineDemoUI.f148140i);
        }
        return jz5.f0.f302826a;
    }
}
