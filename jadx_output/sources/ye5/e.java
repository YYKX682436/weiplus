package ye5;

/* loaded from: classes9.dex */
public final class e extends ye5.b {
    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
    }

    @Override // ze5.c9
    public com.tencent.mm.mvvm.MvvmView d0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new com.tencent.mm.ui.chatting.viewitems.foldItem.ChattingItemFoldSys$ExpandTextView(context, null, 0, 6, null);
    }

    @Override // ze5.c9
    public q31.p e0(yb5.d ui6, com.tencent.mm.storage.f9 msg, java.lang.String str) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        ye5.c cVar = new ye5.c();
        cVar.f461244d = new ye5.d(msg);
        return cVar;
    }
}
