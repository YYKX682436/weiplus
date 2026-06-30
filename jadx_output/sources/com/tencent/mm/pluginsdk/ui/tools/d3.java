package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public final class d3 implements com.tencent.mm.ui.tools.b9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI f191572d;

    public d3(com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI) {
        this.f191572d = fileSelectorUI;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String searchText) {
        android.view.View view;
        kotlin.jvm.internal.o.g(searchText, "searchText");
        com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI = this.f191572d;
        if (!fileSelectorUI.f191380t && (view = fileSelectorUI.f191376p) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$8", "onSearchChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$8", "onSearchChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.pluginsdk.ui.tools.a2 a2Var = fileSelectorUI.f191374n;
        if (a2Var == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        a2Var.n(searchText);
        fileSelectorUI.f191381u.f191525b.add(searchText);
        fileSelectorUI.f191380t = false;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
        com.tencent.mm.pluginsdk.ui.tools.o1 o1Var = com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI.I;
        com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI = this.f191572d;
        fileSelectorUI.getClass();
        fileSelectorUI.f191378r = true;
        android.view.View view = fileSelectorUI.f191376p;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$8", "onEnterSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$8", "onEnterSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.ui.tools.l8 l8Var = fileSelectorUI.f191375o;
        if (l8Var != null) {
            l8Var.f210551r = true;
        }
        fileSelectorUI.f191381u.f191524a.f60194h = 1L;
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "enter search");
        com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI.U6(fileSelectorUI, 8);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void Z2() {
        com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI = this.f191572d;
        fileSelectorUI.f191378r = false;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.pluginsdk.ui.tools.c3(fileSelectorUI));
        fileSelectorUI.getController().N0();
        android.view.View view = fileSelectorUI.f191376p;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$8", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$8", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        fileSelectorUI.setActionbarColor(fileSelectorUI.getResources().getColor(com.tencent.mm.R.color.aaw));
        com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI.U6(fileSelectorUI, 0);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String searchText) {
        kotlin.jvm.internal.o.g(searchText, "searchText");
        return false;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
    }
}
