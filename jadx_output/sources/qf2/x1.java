package qf2;

/* loaded from: classes3.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f362643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362644e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(qf2.y1 y1Var, java.lang.String str) {
        super(0);
        this.f362643d = y1Var;
        this.f362644e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qf2.v0 v0Var;
        qf2.y1 y1Var = this.f362643d;
        ((mm2.y2) y1Var.business(mm2.y2.class)).c7();
        com.tencent.mm.plugin.finder.live.plugin.na naVar = (com.tencent.mm.plugin.finder.live.plugin.na) y1Var.R6(com.tencent.mm.plugin.finder.live.plugin.na.class);
        if (naVar != null) {
            naVar.B1();
        }
        ((mm2.o4) y1Var.business(mm2.o4.class)).Z = null;
        y1Var.i7(this.f362644e);
        if (zl2.r4.f473950a.x1() && (v0Var = (qf2.v0) y1Var.controller(qf2.v0.class)) != null) {
            qf2.v0.e7(v0Var, "", true, false, null, 12, null);
        }
        return jz5.f0.f302826a;
    }
}
