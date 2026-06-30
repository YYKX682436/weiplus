package qd1;

/* loaded from: classes7.dex */
public class c implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f361613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f361614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f361615f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qd1.f f361616g;

    public c(qd1.f fVar, com.tencent.mm.ui.widget.dialog.k0 k0Var, java.util.Map map, int i17) {
        this.f361616g = fVar;
        this.f361613d = k0Var;
        this.f361614e = map;
        this.f361615f = i17;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        this.f361613d.o(null);
        g4Var.clear();
        int i17 = 0;
        while (true) {
            qd1.f fVar = this.f361616g;
            if (i17 >= fVar.f361632i.size()) {
                return;
            }
            if (this.f361614e.containsKey(java.lang.Integer.valueOf(i17))) {
                g4Var.u(i17, (java.lang.CharSequence) fVar.f361632i.get(i17), true, false);
            } else {
                g4Var.d(i17, this.f361615f, (java.lang.CharSequence) fVar.f361632i.get(i17));
            }
            i17++;
        }
    }
}
