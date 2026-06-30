package ze5;

/* loaded from: classes5.dex */
public final class v7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.j8 f472259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView f472260e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(ze5.j8 j8Var, com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView) {
        super(1);
        this.f472259d = j8Var;
        this.f472260e = markdownNativeMvvmView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        rd5.d dVar;
        we5.a aVar;
        com.tencent.mm.storage.f9 f9Var;
        v11.h currentInteractOptions;
        v11.e button = (v11.e) obj;
        kotlin.jvm.internal.o.g(button, "button");
        ze5.j8 j8Var = this.f472259d;
        j8Var.getClass();
        com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView = this.f472260e;
        java.lang.Object tag = markdownNativeMvvmView.getTag();
        com.tencent.mm.ui.chatting.viewitems.er erVar = tag instanceof com.tencent.mm.ui.chatting.viewitems.er ? (com.tencent.mm.ui.chatting.viewitems.er) tag : null;
        if (erVar != null && (dVar = erVar.f203905a) != null && (f9Var = (aVar = dVar.f394254d).f445300b) != null) {
            yb5.d dVar2 = aVar.f445299a;
            android.app.Activity g17 = dVar2 != null ? dVar2.g() : null;
            if (g17 != null && (currentInteractOptions = markdownNativeMvvmView.getCurrentInteractOptions()) != null) {
                v11.b bVar = v11.b.f432330e;
                java.lang.String exceptButtonId = button.f432361g;
                kotlin.jvm.internal.o.g(exceptButtonId, "exceptButtonId");
                java.util.List<v11.e> list = currentInteractOptions.f432393a;
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                for (v11.e eVar : list) {
                    arrayList.add(kotlin.jvm.internal.o.b(eVar.f432361g, exceptButtonId) ? eVar.b(bVar) : eVar.b(v11.b.f432331f));
                }
                v11.h hVar = new v11.h(arrayList);
                markdownNativeMvvmView.h(hVar);
                int ordinal = button.f432355a.ordinal();
                if (ordinal == 0) {
                    j8Var.n0(f9Var.I0(), button.f432357c, button.f432361g, markdownNativeMvvmView, hVar);
                } else if (ordinal == 1) {
                    java.lang.String str = button.f432359e;
                    if (str.length() > 0) {
                        try {
                            android.content.Intent intent = new android.content.Intent();
                            intent.putExtra("rawUrl", str);
                            j45.l.j(g17, "webview", ".ui.tools.WebViewUI", intent, null);
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingItemMarkdownMvvm", e17, "openUrl error", new java.lang.Object[0]);
                        }
                        v11.b bVar2 = v11.b.f432331f;
                        java.util.List<v11.e> list2 = hVar.f432393a;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list2, 10));
                        for (v11.e eVar2 : list2) {
                            if (kotlin.jvm.internal.o.b(eVar2.f432361g, exceptButtonId)) {
                                eVar2 = eVar2.b(bVar2);
                            }
                            arrayList2.add(eVar2);
                        }
                        v11.h hVar2 = new v11.h(arrayList2);
                        markdownNativeMvvmView.h(hVar2);
                        if (button.f432357c.length() > 0) {
                            j8Var.n0(f9Var.I0(), button.f432357c, button.f432361g, markdownNativeMvvmView, hVar2);
                        }
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
