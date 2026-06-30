package jf5;

/* loaded from: classes14.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout f299517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout nativeSelectableLayout) {
        super(2);
        this.f299517d = nativeSelectableLayout;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        float floatValue2 = ((java.lang.Number) obj2).floatValue();
        com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout nativeSelectableLayout = this.f299517d;
        if (nativeSelectableLayout.f204673t == null) {
            nativeSelectableLayout.f204673t = nativeSelectableLayout.A;
            nativeSelectableLayout.D = null;
            nativeSelectableLayout.E = null;
            nativeSelectableLayout.F = null;
        }
        nativeSelectableLayout.f204674u = new android.graphics.PointF(floatValue, floatValue2);
        nativeSelectableLayout.k();
        jf5.i iVar = nativeSelectableLayout.f204673t;
        if (iVar == null) {
            iVar = nativeSelectableLayout.A;
        }
        com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout.c(nativeSelectableLayout, iVar, floatValue, floatValue2);
        jf5.q0 q0Var = nativeSelectableLayout.f204660d;
        jf5.n0 n0Var = q0Var.f299499b;
        jf5.i iVar2 = nativeSelectableLayout.A;
        jf5.i iVar3 = jf5.i.f299467e;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.SelectionHandleView selectionHandleView = nativeSelectableLayout.f204664h;
        if (iVar2 == iVar3) {
            selectionHandleView.setCurrentOffset(n0Var != null ? n0Var.f299485b : 0);
        } else {
            jf5.n0 n0Var2 = q0Var.f299498a;
            selectionHandleView.setCurrentOffset(n0Var2 != null ? n0Var2.f299485b : 0);
        }
        jf5.p pVar = nativeSelectableLayout.R;
        nativeSelectableLayout.removeCallbacks(pVar);
        nativeSelectableLayout.postOnAnimation(pVar);
        return jz5.f0.f302826a;
    }
}
