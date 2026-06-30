package nz4;

/* loaded from: classes12.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nz4.y f341627d;

    public l(nz4.y yVar) {
        this.f341627d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList b17;
        java.lang.String str;
        int i17;
        int i18;
        int e17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("NoteSelectManager", "paste");
        hz4.h hVar = ((hz4.f) hz4.f.wi()).f286407d;
        if (hVar != null) {
            java.lang.String h17 = hVar.h();
            hz4.i iVar = hVar.f286418i;
            java.lang.String a17 = iVar.a(h17);
            boolean g17 = hVar.g();
            com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct favoriteNoteClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct();
            favoriteNoteClickReportStruct.f56344d = 32;
            favoriteNoteClickReportStruct.f56346f = favoriteNoteClickReportStruct.b("noteid", a17, true);
            favoriteNoteClickReportStruct.f56347g = g17 ? 1 : 0;
            favoriteNoteClickReportStruct.f56345e = favoriteNoteClickReportStruct.b("sessionID", iVar.f286425a, true);
            favoriteNoteClickReportStruct.k();
            pz4.a.f359185a.b(favoriteNoteClickReportStruct);
        }
        boolean z17 = nz4.y.M;
        nz4.y yVar = this.f341627d;
        if (!z17 || !yVar.f341643a) {
            com.tencent.mars.xlog.Log.e("NoteSelectManager", "paste: not init or not editable");
            yVar.p();
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (nz4.y.a(yVar)) {
            lz4.a aVar = yVar.f341664v;
            if (aVar != null) {
                ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) aVar).w7();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        yVar.p();
        int c17 = mz4.u.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
        boolean z18 = false;
        if (c17 == 2) {
            if (yVar.f341664v != null && mz4.u.d(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) yVar.f341664v).v7();
                yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            try {
                nz4.d a18 = nz4.e.f341601a.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
                str = a18.f341599a;
                b17 = a18.f341600b;
                mz4.u.a();
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("NoteSelectManager", "get clipboard data error : ", e18);
                yVar.s();
                yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        } else {
            if (c17 != 3) {
                com.tencent.mars.xlog.Log.e("NoteSelectManager", "paste: no data");
                yVar.s();
                yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            b17 = mz4.u.b();
            if (b17.size() <= 0) {
                com.tencent.mars.xlog.Log.e("NoteSelectManager", "paste: tempDataList is null or empty");
                yVar.s();
                yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (b17.size() == 1 && b17.get(0) != null && ((iz4.c) b17.get(0)).d() == 1) {
                str = ((iz4.i) b17.get(0)).f296155t;
                b17 = null;
            } else {
                str = "";
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) && (b17 == null || b17.size() == 0)) {
            com.tencent.mars.xlog.Log.e("NoteSelectManager", "paste: no useful data");
            yVar.s();
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (yVar.f341664v != null) {
            int m17 = yVar.m();
            if (m17 != 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
                if (b17 != null) {
                    java.util.Iterator it = b17.iterator();
                    i17 = 0;
                    while (it.hasNext()) {
                        iz4.c cVar = (iz4.c) it.next();
                        if (cVar != null) {
                            if (cVar.d() != 1) {
                                i17++;
                            } else {
                                sb6.append(((iz4.i) cVar).f296155t);
                            }
                        }
                    }
                } else {
                    i17 = 0;
                }
                int e19 = qz4.c.e(sb6.toString());
                if (m17 == 2 || m17 == 3) {
                    for (int i19 = yVar.f341665w.f341619a; i19 <= yVar.f341665w.f341621c; i19++) {
                        iz4.c l17 = ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) yVar.f341664v).J1.l(i19);
                        if (l17 != null) {
                            if (l17.d() == 1) {
                                nz4.h hVar2 = yVar.f341665w;
                                int i27 = hVar2.f341619a;
                                if (i19 == i27 && i19 == hVar2.f341621c) {
                                    java.lang.String str2 = ((iz4.i) l17).f296155t;
                                    int i28 = hVar2.f341620b;
                                    int i29 = hVar2.f341622d;
                                    i18 = 0;
                                    e17 = qz4.c.f(str2, i28, i29, false);
                                } else if (i19 == i27) {
                                    e17 = qz4.c.f(((iz4.i) l17).f296155t, hVar2.f341620b, -1, true);
                                    i18 = 0;
                                } else if (i19 == hVar2.f341621c) {
                                    java.lang.String str3 = ((iz4.i) l17).f296155t;
                                    int i37 = hVar2.f341622d;
                                    i18 = 0;
                                    e17 = qz4.c.f(str3, 0, i37, false);
                                } else {
                                    i18 = 0;
                                    e17 = qz4.c.e(((iz4.i) l17).f296155t);
                                }
                                e19 -= e17 + i18;
                            } else if (l17.d() != 1) {
                                i17--;
                            }
                        }
                    }
                }
                z18 = ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) yVar.f341664v).J1.f(e19, i17);
            }
            if (z18) {
                ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) yVar.f341664v).v7();
                yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        int m18 = yVar.m();
        if (m18 == 1 || m18 == 2) {
            yVar.f(true, b17, str);
        } else if (m18 == 3) {
            yVar.e(true, b17, str);
        } else {
            com.tencent.mars.xlog.Log.e("NoteSelectManager", "paste: invalid selection");
            yVar.s();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
