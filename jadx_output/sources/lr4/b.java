package lr4;

/* loaded from: classes11.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvListUI f320720d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvListUI w1wPersonalMsgBaseConvListUI) {
        super(4);
        this.f320720d = w1wPersonalMsgBaseConvListUI;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        vu4.d actionType = (vu4.d) obj;
        java.lang.String str = (java.lang.String) obj2;
        java.lang.String str2 = (java.lang.String) obj3;
        java.lang.String str3 = (java.lang.String) obj4;
        kotlin.jvm.internal.o.g(actionType, "actionType");
        gr4.f fVar = (gr4.f) i95.n0.c(gr4.f.class);
        com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvListUI w1wPersonalMsgBaseConvListUI = this.f320720d;
        java.lang.String str4 = w1wPersonalMsgBaseConvListUI.f177549h;
        java.lang.String str5 = w1wPersonalMsgBaseConvListUI.f177550i;
        java.lang.String str6 = w1wPersonalMsgBaseConvListUI.f177551m;
        java.lang.String str7 = w1wPersonalMsgBaseConvListUI.f177552n;
        java.lang.String str8 = w1wPersonalMsgBaseConvListUI.f177548g;
        if (str8 != null) {
            ((fr4.g0) fVar).cj(actionType, str4, str5, str6, str7, str8, vu4.e.f440306e, str == null ? "" : str, str2 == null ? "" : str2, str3 != null ? str3 : "", w1wPersonalMsgBaseConvListUI.f177547f == 1 ? vu4.g.f440323e : vu4.g.f440324f);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("currentPageId");
        throw null;
    }
}
