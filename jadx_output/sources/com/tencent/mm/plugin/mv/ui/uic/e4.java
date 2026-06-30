package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class e4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.h4 f151113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f151114e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fm3.q f151115f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(com.tencent.mm.plugin.mv.ui.uic.h4 h4Var, int i17, fm3.q qVar) {
        super(1);
        this.f151113d = h4Var;
        this.f151114e = i17;
        this.f151115f = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fm3.w animationInfo = (fm3.w) obj;
        kotlin.jvm.internal.o.g(animationInfo, "animationInfo");
        com.tencent.mm.plugin.mv.ui.uic.g3 g3Var = this.f151113d.f151171r;
        if (g3Var != null) {
            ((jm3.c0) g3Var).a(this.f151114e, this.f151115f, true, animationInfo);
        }
        return jz5.f0.f302826a;
    }
}
