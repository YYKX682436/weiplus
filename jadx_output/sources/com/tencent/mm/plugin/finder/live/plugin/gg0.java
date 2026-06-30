package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class gg0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.kg0 f112697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f112698e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg0(com.tencent.mm.plugin.finder.live.plugin.kg0 kg0Var, boolean z17) {
        super(0);
        this.f112697d = kg0Var;
        this.f112698e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.kg0 kg0Var = this.f112697d;
        kg0Var.f113233s.setTranslationY(com.tencent.mm.ui.bl.b(kg0Var.f365323d.getContext()).y);
        if (this.f112698e) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.jg0(kg0Var));
        } else {
            kg0Var.K0(8);
            yz5.a aVar = kg0Var.F;
            if (aVar != null) {
                aVar.invoke();
            }
            kg0Var.F = null;
        }
        return jz5.f0.f302826a;
    }
}
