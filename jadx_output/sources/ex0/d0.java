package ex0;

/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f257122d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ex0.a0 a0Var) {
        super(1);
        this.f257122d = a0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ax0.e eVar;
        ex0.r segmentVM = (ex0.r) obj;
        kotlin.jvm.internal.o.g(segmentVM, "segmentVM");
        com.tencent.mars.xlog.Log.i("TimelineViewModelEditingState", "generalEditing did select : " + segmentVM);
        ex0.a0 a0Var = this.f257122d;
        boolean b17 = kotlin.jvm.internal.o.b(segmentVM, a0Var.n());
        ug.m mVar = segmentVM.f257169c;
        if (!b17) {
            a0Var.l(segmentVM);
            segmentVM.f257171e = ax0.b.f14965e;
            int ordinal = mVar.ordinal();
            if (ordinal == 1) {
                eVar = ax0.e.f14976e;
            } else if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                switch (ordinal) {
                    case 10:
                        eVar = ax0.e.f14980i;
                        break;
                    case 11:
                    case 12:
                        eVar = ax0.e.f14979h;
                        break;
                    default:
                        eVar = ax0.e.f14980i;
                        break;
                }
            } else {
                eVar = ax0.e.f14977f;
            }
            a0Var.O(eVar);
        } else if (segmentVM.p()) {
            if (ex0.c0.f257120a[mVar.ordinal()] == 1) {
                ex0.r n17 = a0Var.n();
                if ((n17 != null ? n17.f257171e : null) == ax0.b.f14965e) {
                    a0Var.O(a0Var.z() ? ax0.e.f14977f : ax0.e.f14980i);
                    a0Var.v(segmentVM);
                }
            } else {
                a0Var.O(a0Var.z() ? ax0.e.f14977f : ax0.e.f14980i);
                a0Var.v(segmentVM);
            }
        }
        return jz5.f0.f302826a;
    }
}
