package vw3;

/* loaded from: classes5.dex */
public final class u2 implements jc3.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerMagicBootsUI f441141a;

    public u2(com.tencent.mm.plugin.repairer.ui.RepairerMagicBootsUI repairerMagicBootsUI) {
        this.f441141a = repairerMagicBootsUI;
    }

    @Override // jc3.m0
    public void J(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.u3.h(new vw3.s2(this.f441141a, str));
    }

    @Override // jc3.m0
    public void K(com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.sdk.platformtools.u3.h(new vw3.t2(this.f441141a, info));
    }
}
