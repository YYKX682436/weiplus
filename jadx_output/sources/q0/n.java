package q0;

/* loaded from: classes16.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.base.SelectContactCustomCombineProxyUIC C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.ui.mvvm.uic.base.SelectContactCustomCombineProxyUIC selectContactCustomCombineProxyUIC) {
        super(1);
        this.C = selectContactCustomCombineProxyUIC;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.t0 t0Var;
        j75.e eVar;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        com.tencent.mm.ui.mvvm.uic.base.SelectContactCustomCombineProxyUIC selectContactCustomCombineProxyUIC = this.C;
        android.view.ViewGroup.LayoutParams layoutParams = ((em.l2) ((jz5.n) selectContactCustomCombineProxyUIC.B6).getValue()).k().getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i65.a.b(selectContactCustomCombineProxyUIC.getActivity(), 0);
        }
        ((em.l2) ((jz5.n) selectContactCustomCombineProxyUIC.B6).getValue()).k().setLayoutParams(layoutParams);
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.t0) && (eVar = (t0Var = (wi5.t0) dVar).f298067a) != null && (eVar instanceof wi5.w0)) {
            if (((wi5.w0) eVar).f446358b == wi5.u0.f446345d) {
                java.util.LinkedList linkedList = state.f446319o;
                selectContactCustomCombineProxyUIC.f209257z6 = new java.util.ArrayList(linkedList);
                if (t0Var.f446343d != 7) {
                    com.tencent.mm.autogen.events.SelectContactListToOutsideEvent selectContactListToOutsideEvent = new com.tencent.mm.autogen.events.SelectContactListToOutsideEvent();
                    selectContactListToOutsideEvent.f54746m.f277770a = new java.util.ArrayList(linkedList);
                    selectContactListToOutsideEvent.e();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
