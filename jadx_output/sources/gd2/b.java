package gd2;

/* loaded from: classes3.dex */
public final class b implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.i f270524d;

    public b(gd2.i iVar) {
        this.f270524d = iVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        gd2.i iVar = this.f270524d;
        g4Var.g(2, iVar.f270532a.getString(com.tencent.mm.R.string.i89), com.tencent.mm.R.raw.icons_outlined_download);
        if (iVar.f270539h || ((java.lang.Boolean) iVar.f270536e.invoke()).booleanValue()) {
            g4Var.g(4, iVar.f270532a.getString(com.tencent.mm.R.string.b2f), com.tencent.mm.R.raw.icons_outlined_translate);
        }
        if (((java.lang.Boolean) iVar.f270537f.invoke()).booleanValue()) {
            g4Var.g(12, iVar.f270532a.getString(com.tencent.mm.R.string.b2c), com.tencent.mm.R.raw.icons_outlined_ocr);
        }
    }
}
