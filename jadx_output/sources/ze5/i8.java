package ze5;

/* loaded from: classes5.dex */
public final class i8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView f472003a;

    public i8(com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView) {
        this.f472003a = markdownNativeMvvmView;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMarkdownMvvm", "sendCallbackButtonClick, errType=" + fVar.f70615a + ", errCode=" + fVar.f70616b + ", errMsg=" + fVar.f70617c);
        if (!fVar.b()) {
            df5.l lVar = this.f472003a.f204652p;
            if (lVar == null) {
                kotlin.jvm.internal.o.o("interactOptionsView");
                throw null;
            }
            lVar.d();
        }
        return jz5.f0.f302826a;
    }
}
