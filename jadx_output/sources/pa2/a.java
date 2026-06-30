package pa2;

/* loaded from: classes2.dex */
public final class a implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pa2.g f352968d;

    public a(pa2.g gVar) {
        this.f352968d = gVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var == null || !g4Var.z()) {
            return;
        }
        pa2.g gVar = this.f352968d;
        g4Var.d(10001, b3.l.getColor(gVar.f434158a, com.tencent.mm.R.color.Red_100), gVar.f434158a.getResources().getString(com.tencent.mm.R.string.p5o));
    }
}
