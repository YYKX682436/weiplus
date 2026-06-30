package ni2;

/* loaded from: classes3.dex */
public final class g1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.l1 f337303d;

    public g1(ni2.l1 l1Var) {
        this.f337303d = l1Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        android.content.res.Resources resources;
        int i17;
        g4Var.clear();
        ni2.l1 l1Var = this.f337303d;
        if (((mm2.e1) l1Var.f337371c.P0(mm2.e1.class)).b7()) {
            resources = l1Var.f337369a.getResources();
            i17 = com.tencent.mm.R.string.nsx;
        } else {
            resources = l1Var.f337369a.getResources();
            i17 = com.tencent.mm.R.string.dxj;
        }
        g4Var.f(1, resources.getString(i17));
    }
}
