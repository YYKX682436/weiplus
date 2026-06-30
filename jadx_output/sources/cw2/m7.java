package cw2;

/* loaded from: classes15.dex */
public final class m7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.z5 f223869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f223870e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(cw2.z5 z5Var, com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy) {
        super(0);
        this.f223869d = z5Var;
        this.f223870e = finderThumbPlayerProxy;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f223869d.d();
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f223870e;
        finderThumbPlayerProxy.G1 = null;
        finderThumbPlayerProxy.setNeedWaitRciRendered(false);
        com.tencent.mars.xlog.Log.i(finderThumbPlayerProxy.getFTPPTag(), "preDecideEnhance: enhance disabled, postProcessor released");
        return jz5.f0.f302826a;
    }
}
