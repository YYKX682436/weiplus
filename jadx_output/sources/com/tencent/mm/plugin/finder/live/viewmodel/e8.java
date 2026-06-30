package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class e8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.g8 f117079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.h8 f117080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f117081f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMSwitchBtn f117082g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(com.tencent.mm.plugin.finder.live.viewmodel.g8 g8Var, com.tencent.mm.plugin.finder.live.viewmodel.h8 h8Var, boolean z17, com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn) {
        super(1);
        this.f117079d = g8Var;
        this.f117080e = h8Var;
        this.f117081f = z17;
        this.f117082g = mMSwitchBtn;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (booleanValue) {
            this.f117079d.f117117e.invoke(this.f117080e, java.lang.Boolean.valueOf(this.f117081f));
        }
        this.f117082g.setCheck(booleanValue);
        return jz5.f0.f302826a;
    }
}
