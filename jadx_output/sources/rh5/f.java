package rh5;

/* loaded from: classes3.dex */
public final class f implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh5.g f395824d;

    public f(rh5.g gVar) {
        this.f395824d = gVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        rh5.g gVar = this.f395824d;
        g4Var.g(16, gVar.getString(com.tencent.mm.R.string.lwe), com.tencent.mm.R.raw.translate_off_regular);
        g4Var.g(17, gVar.getString(com.tencent.mm.R.string.lwf), com.tencent.mm.R.raw.language_transfer_regular);
        g4Var.g(18, gVar.getString(com.tencent.mm.R.string.lwh), com.tencent.mm.R.raw.icons_outlined_feedback_error);
        g4Var.g(19, gVar.getString(com.tencent.mm.R.string.lwi), com.tencent.mm.R.raw.icons_outlined_download);
    }
}
