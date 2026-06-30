package tc5;

/* loaded from: classes10.dex */
public final class a implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI f417552a;

    public a(com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI) {
        this.f417552a = msgHistoryGalleryUI;
    }

    @Override // n3.k0
    public final n3.g3 a(android.view.View view, n3.g3 insets) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(insets, "insets");
        e3.d a17 = insets.a(7);
        kotlin.jvm.internal.o.f(a17, "getInsets(...)");
        int i17 = this.f417552a.D;
        view.setPadding(a17.f247044a + i17, a17.f247045b, a17.f247046c + i17, a17.f247047d);
        return n3.g3.f334337b;
    }
}
