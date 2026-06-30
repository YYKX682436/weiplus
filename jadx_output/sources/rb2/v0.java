package rb2;

/* loaded from: classes3.dex */
public final class v0 implements com.tencent.mm.ui.tools.s5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rb2.y0 f393794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393795b;

    public v0(rb2.y0 y0Var, in5.s0 s0Var) {
        this.f393794a = y0Var;
        this.f393795b = s0Var;
    }

    @Override // com.tencent.mm.ui.tools.s5
    public final void a() {
        gd2.n nVar = this.f393794a.f393831g;
        boolean z17 = true;
        if (!nVar.f270550f && ((gd2.x) ((jz5.n) nVar.f270554j).getValue()).f270572i != 1) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        android.content.Context context = this.f393795b.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity a17 = tm3.a.a(context);
        if (a17 == null) {
            return;
        }
        if (a17 instanceof com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI) {
            ((com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI) a17).e7();
        } else {
            a17.finish();
        }
    }
}
