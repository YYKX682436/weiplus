package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public final class e3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI f191604d;

    public e3(com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI) {
        this.f191604d = fileSelectorUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI = this.f191604d;
        com.tencent.mm.pluginsdk.ui.tools.a2 a2Var = fileSelectorUI.f191374n;
        if (a2Var == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        com.tencent.mm.pluginsdk.ui.tools.f2 item = a2Var.getItem(i17);
        if (fileSelectorUI.G) {
            yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (item == null) {
            yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        int i18 = item.f191623a;
        if (i18 == 2) {
            yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (i18 == 3) {
            fileSelectorUI.f191381u.f191524a.f60195i = 1L;
            com.tencent.mm.pluginsdk.ui.tools.d2 d2Var = (com.tencent.mm.pluginsdk.ui.tools.d2) item;
            java.lang.String str = d2Var.f191565i;
            int P = r26.n0.P(d2Var.f191564h, ".", 0, false, 6, null) + 1;
            if (P >= d2Var.f191564h.length()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorUI", "open file error : file path error");
                db5.t7.g(fileSelectorUI, fileSelectorUI.getResources().getString(com.tencent.mm.R.string.ibj));
                yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            java.lang.CharSequence charSequence = d2Var.f191564h;
            java.lang.String obj = charSequence.subSequence(P, charSequence.length()).toString();
            if (3 == fileSelectorUI.f191367d && !d2Var.f191568l) {
                com.tencent.mm.pluginsdk.ui.tools.a2 a2Var2 = fileSelectorUI.f191374n;
                if (a2Var2 == null) {
                    kotlin.jvm.internal.o.o("adapter");
                    throw null;
                }
                if (1 == a2Var2.f191509n) {
                    if (r26.i0.p(obj, "ppt", true) || r26.i0.p(obj, "pdf", true) || r26.i0.p(obj, "doc", true) || r26.i0.p(obj, "docx", true) || r26.i0.p(obj, "pptx", true)) {
                        fileSelectorUI.d7(d2Var.f191560d, d2Var.f191561e);
                    } else {
                        db5.t7.g(fileSelectorUI, fileSelectorUI.getResources().getString(com.tencent.mm.R.string.ibk));
                    }
                    yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    return;
                }
            }
            com.tencent.mm.pluginsdk.ui.tools.a2 a2Var3 = fileSelectorUI.f191374n;
            if (a2Var3 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            if (2 == a2Var3.f191509n && !com.tencent.mm.vfs.w6.j(d2Var.f191565i) && !fileSelectorUI.h7()) {
                com.tencent.mm.pluginsdk.ui.tools.c2 c2Var = (com.tencent.mm.pluginsdk.ui.tools.c2) item;
                fileSelectorUI.e7(c2Var.f191539r, c2Var.f191537p);
                yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            } else if (fileSelectorUI.h7()) {
                com.tencent.mm.pluginsdk.ui.tools.a2 a2Var4 = fileSelectorUI.f191374n;
                if (a2Var4 == null) {
                    kotlin.jvm.internal.o.o("adapter");
                    throw null;
                }
                kotlin.jvm.internal.o.d(view);
                a2Var4.m(view, i17);
            } else {
                fileSelectorUI.k7(str, d2Var.f191564h.toString());
            }
        } else if (i18 == 4) {
            fileSelectorUI.f191381u.f191524a.f60195i = 1L;
            try {
                com.tencent.mm.pluginsdk.ui.tools.e2 e2Var = (com.tencent.mm.pluginsdk.ui.tools.e2) item;
                if (e2Var.f191602q) {
                    if (fileSelectorUI.h7()) {
                        com.tencent.mm.pluginsdk.ui.tools.a2 a2Var5 = fileSelectorUI.f191374n;
                        if (a2Var5 == null) {
                            kotlin.jvm.internal.o.o("adapter");
                            throw null;
                        }
                        kotlin.jvm.internal.o.d(view);
                        a2Var5.m(view, i17);
                    } else {
                        fileSelectorUI.k7(e2Var.f191565i, e2Var.f191564h.toString());
                    }
                } else {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(e2Var.f191565i)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FileSelectorUI", "can not open sub path because current path not exist");
                        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                        return;
                    }
                    java.lang.String str2 = e2Var.f191565i;
                    if (str2 != null) {
                        com.tencent.mm.pluginsdk.ui.tools.a2 a2Var6 = fileSelectorUI.f191374n;
                        if (a2Var6 == null) {
                            kotlin.jvm.internal.o.o("adapter");
                            throw null;
                        }
                        a2Var6.p(str2);
                    }
                    com.tencent.mm.pluginsdk.ui.tools.a2 a2Var7 = fileSelectorUI.f191374n;
                    if (a2Var7 == null) {
                        kotlin.jvm.internal.o.o("adapter");
                        throw null;
                    }
                    a2Var7.notifyDataSetChanged();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FileSelectorUI", "error:" + e17.getMessage());
                yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
