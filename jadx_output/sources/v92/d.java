package v92;

/* loaded from: classes15.dex */
public final class d implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v92.g f434155d;

    public d(v92.g gVar) {
        this.f434155d = gVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            v92.g gVar = this.f434155d;
            if (gVar.o()) {
                if (gVar.y()) {
                    g4Var.l(20012, gVar.f434158a.getResources().getString(com.tencent.mm.R.string.p5o), com.tencent.mm.R.raw.trash_on_regular, gVar.g());
                }
            } else if (gVar.v()) {
                g4Var.l(20005, gVar.f434158a.getResources().getString(com.tencent.mm.R.string.gys), com.tencent.mm.R.raw.icons_outlined_report_problem, gVar.f());
            }
        }
    }
}
