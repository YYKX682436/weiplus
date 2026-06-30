package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public final class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.a2 f191976d;

    public x1(com.tencent.mm.pluginsdk.ui.tools.a2 a2Var) {
        this.f191976d = a2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$FileSelectorAdapter$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.d(view);
        com.tencent.mm.pluginsdk.ui.tools.a2 a2Var = this.f191976d;
        a2Var.getClass();
        java.lang.Object tag = view.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) tag).intValue();
        com.tencent.mm.pluginsdk.ui.tools.f2 item = a2Var.getItem(intValue);
        com.tencent.mars.xlog.Log.i(a2Var.f191502d, "onMoreClick: pos:" + intValue + ",item:" + item);
        if (item instanceof com.tencent.mm.pluginsdk.ui.tools.d2) {
            com.tencent.mm.pluginsdk.ui.tools.d2 listFileItem = (com.tencent.mm.pluginsdk.ui.tools.d2) item;
            com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI = a2Var.f191510o;
            fileSelectorUI.getClass();
            kotlin.jvm.internal.o.g(listFileItem, "listFileItem");
            fileSelectorUI.f191381u.f191524a.f60195i = 1L;
            java.lang.String str = listFileItem.f191565i;
            int P = r26.n0.P(listFileItem.f191564h, ".", 0, false, 6, null) + 1;
            if (P >= listFileItem.f191564h.length()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "open file error : file path error");
                db5.t7.g(fileSelectorUI, fileSelectorUI.getResources().getString(com.tencent.mm.R.string.ibj));
            } else {
                java.lang.CharSequence charSequence = listFileItem.f191564h;
                java.lang.String obj = charSequence.subSequence(P, charSequence.length()).toString();
                if (3 == fileSelectorUI.f191367d && !listFileItem.f191568l) {
                    com.tencent.mm.pluginsdk.ui.tools.a2 a2Var2 = fileSelectorUI.f191374n;
                    if (a2Var2 == null) {
                        kotlin.jvm.internal.o.o("adapter");
                        throw null;
                    }
                    if (1 == a2Var2.f191509n) {
                        if (r26.i0.p(obj, "ppt", true) || r26.i0.p(obj, "pdf", true) || r26.i0.p(obj, "doc", true) || r26.i0.p(obj, "docx", true) || r26.i0.p(obj, "pptx", true)) {
                            fileSelectorUI.d7(listFileItem.f191560d, listFileItem.f191561e);
                        } else {
                            db5.t7.g(fileSelectorUI, fileSelectorUI.getResources().getString(com.tencent.mm.R.string.ibk));
                        }
                    }
                }
                com.tencent.mm.pluginsdk.ui.tools.a2 a2Var3 = fileSelectorUI.f191374n;
                if (a2Var3 == null) {
                    kotlin.jvm.internal.o.o("adapter");
                    throw null;
                }
                if (2 != a2Var3.f191509n || com.tencent.mm.vfs.w6.j(listFileItem.f191565i)) {
                    fileSelectorUI.k7(str, listFileItem.f191564h.toString());
                } else {
                    com.tencent.mm.pluginsdk.ui.tools.c2 c2Var = (com.tencent.mm.pluginsdk.ui.tools.c2) listFileItem;
                    fileSelectorUI.e7(c2Var.f191539r, c2Var.f191537p);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$FileSelectorAdapter$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
