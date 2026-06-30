package ex0;

/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f257140d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ex0.a0 a0Var) {
        super(1);
        this.f257140d = a0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ax0.e eVar;
        ex0.r segmentVM = (ex0.r) obj;
        kotlin.jvm.internal.o.g(segmentVM, "segmentVM");
        com.tencent.mars.xlog.Log.i("TimelineViewModelEditingState", "Skimming did select : " + segmentVM);
        ex0.a0 a0Var = this.f257140d;
        a0Var.l(segmentVM);
        segmentVM.f257171e = ax0.b.f14965e;
        int ordinal = segmentVM.f257169c.ordinal();
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
        return jz5.f0.f302826a;
    }
}
