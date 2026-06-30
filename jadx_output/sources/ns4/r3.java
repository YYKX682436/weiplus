package ns4;

/* loaded from: classes8.dex */
public final class r3 implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ns4.b4 f339635a;

    public r3(ns4.b4 b4Var) {
        this.f339635a = b4Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public final void onDismiss() {
        ot5.g.c("WeCoinSubscribePanel", "dialog on dismiss");
        ns4.b4 b4Var = this.f339635a;
        if (b4Var.f339457q == null) {
            ot5.g.c("WeCoinSubscribePanel", "continuation == null)");
            return;
        }
        if (b4Var.f339458r) {
            return;
        }
        ot5.g.c("WeCoinSubscribePanel", "dialog dismiss & cancel");
        kotlin.coroutines.Continuation continuation = b4Var.f339457q;
        if (continuation != null) {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
        }
        b4Var.f339457q = null;
    }
}
