package r50;

/* loaded from: classes5.dex */
public final class w implements nl5.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f392616a;

    public w(r50.j0 j0Var) {
        this.f392616a = j0Var;
    }

    @Override // nl5.a0
    public void a(android.view.View v17, nl5.z item, java.lang.String curSelect) {
        gl5.d1 d1Var;
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(curSelect, "curSelect");
        int i17 = item.f338398b;
        boolean z17 = i17 == 6;
        r50.j0 j0Var = this.f392616a;
        if (z17) {
            j0Var.W6().e().append("\n");
        }
        if ((i17 == 7) && (d1Var = (gl5.d1) ((jz5.n) j0Var.f392586e).getValue()) != null) {
            android.view.ViewParent parent = d1Var.e().getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                if (viewGroup.indexOfChild(d1Var.e()) != viewGroup.getChildCount() - 1) {
                    viewGroup.removeView(d1Var.e());
                    viewGroup.addView(d1Var.e());
                }
            }
            fl5.i iVar = d1Var.f272925b;
            android.view.View l17 = iVar.l();
            kotlin.jvm.internal.o.f(l17, "wrapView(...)");
            int[] iArr = new int[2];
            l17.getLocationOnScreen(iArr);
            gl5.g0 g0Var = new gl5.g0(l17.getMeasuredWidth(), l17.getMeasuredHeight(), iArr);
            d1Var.f272929f = true;
            android.view.View e17 = d1Var.e();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(e17, arrayList.toArray(), "com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen", "openFullScreenEdt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(e17, "com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen", "openFullScreenEdt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Object value = ((jz5.n) d1Var.f272939p).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            ((com.tencent.mm.ui.widget.imageview.WeImageButton) value).setVisibility(4);
            android.view.ViewGroup.LayoutParams layoutParams = d1Var.c().getLayoutParams();
            layoutParams.width = -1;
            d1Var.c().setLayoutParams(layoutParams);
            d1Var.g(d1Var.c());
            iVar.setMaxHeight(Integer.MAX_VALUE);
            iVar.setImeOptions(6);
            iVar.setEnableSendBtn(false);
            iVar.setInputType(131073);
            d1Var.f();
            java.lang.Object value2 = ((jz5.n) d1Var.f272938o).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            iVar.getSizeAnimController().a(false);
            iVar.l().post(new gl5.z0(d1Var, g0Var));
        }
        if (i17 == 8) {
            a31.m mVar = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f452619d;
            if (mVar != null) {
                mVar.l(2);
            }
            j0Var.W6().e().f();
        }
    }

    @Override // nl5.a0
    public void b(java.util.List items, int i17) {
        kotlin.jvm.internal.o.g(items, "items");
        r50.j0 j0Var = this.f392616a;
        java.lang.String string = j0Var.getContext().getString(com.tencent.mm.R.string.f492530o93);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        items.add(new nl5.z(string, 6));
        gl5.d1 d1Var = (gl5.d1) ((jz5.n) j0Var.f392586e).getValue();
        if (d1Var.f272929f && d1Var.e().getParent() != null) {
            return;
        }
        java.lang.String string2 = j0Var.getContext().getString(com.tencent.mm.R.string.f492536o94);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        items.add(new nl5.z(string2, 8));
        java.lang.String string3 = j0Var.getContext().getString(com.tencent.mm.R.string.gul);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        items.add(new nl5.z(string3, 7));
    }
}
