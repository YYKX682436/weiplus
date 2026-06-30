package gx0;

/* loaded from: classes5.dex */
public final class fh implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.kh f276440d;

    public fh(gx0.kh khVar) {
        this.f276440d = khVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.String str;
        cx0.f fVar = (cx0.f) obj;
        if (fVar == null) {
            return;
        }
        gx0.kh khVar = this.f276440d;
        gx0.bf.q7(khVar.V6(), fVar.f224520c, true, 0L, 4, null);
        cx0.a aVar = cx0.a.f224493d;
        cx0.a aVar2 = fVar.f224518a;
        java.lang.String str2 = fVar.f224519b;
        if (aVar2 == aVar) {
            str = ((java.lang.String) ((jz5.n) khVar.f276645u).getValue()) + str2;
        } else {
            str = ((java.lang.String) ((jz5.n) khVar.f276646v).getValue()) + str2;
        }
        if (str2.length() > 0) {
            com.tencent.mm.ui.widget.dialog.f4 f4Var = khVar.f276647w;
            if (f4Var != null) {
                f4Var.cancel();
            }
            android.app.Activity context = khVar.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = str;
            com.tencent.mm.ui.widget.dialog.f4 a17 = e4Var.a();
            khVar.f276647w = a17;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = a17.f211791d;
            if (e4Var2 != null) {
                e4Var2.c();
            }
        }
    }
}
