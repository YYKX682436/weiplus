package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class s2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f151433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f151434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC f151435f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(int i17, int i18, com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC) {
        super(0);
        this.f151433d = i17;
        this.f151434e = i18;
        this.f151435f = musicMvMainUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm3.l0 l0Var;
        if (this.f151433d >= 0 && this.f151434e >= 0 && (l0Var = this.f151435f.f150989v) != null) {
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = this.f151435f;
            int i17 = this.f151433d;
            int i18 = this.f151434e;
            java.lang.String str = musicMvMainUIC.f150974d;
            int i19 = l0Var.f264090c;
            int i27 = l0Var.f264092e;
            if (i17 < i19) {
                l0Var.f264092e = i27 + 1;
            }
            l0Var.f264090c = i17;
            l0Var.f264091d = (int) ((100 * i17) / i18);
        }
        return jz5.f0.f302826a;
    }
}
