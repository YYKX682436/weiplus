package p61;

/* loaded from: classes5.dex */
public class e1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p61.g1 f352238d;

    public e1(p61.g1 g1Var) {
        this.f352238d = g1Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.setHeaderTitle(com.tencent.mm.R.string.agp);
        p61.g1 g1Var = this.f352238d;
        if ((g1Var.f352261d & 2) != 0) {
            g4Var.a(0, com.tencent.mm.R.string.ah9);
        }
        if ((g1Var.f352261d & 1) != 0) {
            g4Var.a(1, com.tencent.mm.R.string.f490710ag1);
        }
    }
}
