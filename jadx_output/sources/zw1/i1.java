package zw1;

/* loaded from: classes15.dex */
public class i1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.k1 f476659d;

    public i1(zw1.k1 k1Var) {
        this.f476659d = k1Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        if (tw1.f.Di().Ri()) {
            g4Var.add(0, 1, 0, com.tencent.mm.R.string.b_1);
        } else {
            g4Var.add(0, 1, 0, com.tencent.mm.R.string.b_c);
        }
        zw1.k1 k1Var = this.f476659d;
        if (k1Var.f476686d != null) {
            for (int i17 = 0; i17 < k1Var.f476686d.size(); i17++) {
                r45.uk4 uk4Var = (r45.uk4) k1Var.f476686d.get(i17);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(uk4Var.f387432e)) {
                    g4Var.add(0, i17 + 1 + 1, 0, uk4Var.f387432e);
                }
            }
        }
    }
}
