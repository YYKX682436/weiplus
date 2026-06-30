package r14;

/* loaded from: classes3.dex */
public final class r implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r14.y f368625d;

    public r(r14.y yVar, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f368625d = yVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        kotlin.jvm.internal.o.d(g4Var);
        r14.y yVar = this.f368625d;
        yVar.getClass();
        r14.a[] aVarArr = r14.a.f368606d;
        com.tencent.mm.ui.MMActivity mMActivity = yVar.f368633a;
        g4Var.h(5, mMActivity.getString(com.tencent.mm.R.string.hq8), com.tencent.mm.R.raw.icons_outlined_download, mMActivity.getResources().getColor(com.tencent.mm.R.color.FG_0));
        g4Var.h(6, mMActivity.getString(com.tencent.mm.R.string.hpu), com.tencent.mm.R.raw.icons_outlined_pencil, mMActivity.getResources().getColor(com.tencent.mm.R.color.FG_0));
        if (yVar.f368636d) {
            return;
        }
        g4Var.h(7, mMActivity.getString(com.tencent.mm.R.string.hq7), com.tencent.mm.R.raw.icons_outlined_refresh, mMActivity.getResources().getColor(com.tencent.mm.R.color.FG_0));
    }
}
