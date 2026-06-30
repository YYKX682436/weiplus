package ox1;

/* loaded from: classes12.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox1.s f349602d;

    public i(ox1.s sVar) {
        this.f349602d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        int i18;
        int d17;
        java.lang.String sb6;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.Editor.EditorSelectManager", "paste");
        boolean z17 = ox1.s.K;
        ox1.s sVar = this.f349602d;
        if (!z17 || !sVar.f349615a) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Editor.EditorSelectManager", "paste: not init or not editable");
            sVar.p();
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (ox1.s.a(sVar)) {
            mx1.a aVar = sVar.f349636v;
            if (aVar != null) {
                ((com.tencent.mm.plugin.component.editor.EditorUI) aVar).h7();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        sVar.p();
        int c17 = nx1.b.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.String str = "";
        boolean z18 = false;
        java.util.ArrayList arrayList2 = null;
        if (c17 == 2) {
            if (sVar.f349636v != null && nx1.b.d(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                ((com.tencent.mm.plugin.component.editor.EditorUI) sVar.f349636v).f7();
                yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            try {
                java.lang.CharSequence a17 = com.tencent.mm.sdk.platformtools.b0.a();
                if (a17 instanceof android.text.Spanned) {
                    sb6 = lx1.c.a((android.text.Spanned) a17);
                } else {
                    java.lang.String charSequence = a17.toString();
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    lx1.c.c(charSequence, sb7, 0, charSequence.length());
                    sb6 = sb7.toString();
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(sb6)) {
                    str = sb6;
                }
                nx1.b.a();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Editor.EditorSelectManager", "get clipboard data error : ", e17);
                sVar.r();
                yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        } else {
            if (c17 != 3) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Editor.EditorSelectManager", "paste: no data");
                sVar.r();
                yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.util.ArrayList b17 = nx1.b.b();
            if (b17.size() <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Editor.EditorSelectManager", "paste: tempDataList is null or empty");
                sVar.r();
                yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (b17.size() == 1 && b17.get(0) != null && ((ix1.a) b17.get(0)).b() == 1) {
                str = ((ix1.l) b17.get(0)).f295338s;
            } else {
                arrayList2 = b17;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) && (arrayList2 == null || arrayList2.size() == 0)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Editor.EditorSelectManager", "paste: no useful data");
            sVar.r();
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (sVar.f349636v != null) {
            int m17 = sVar.m();
            if (m17 != 0) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder(str);
                if (arrayList2 != null) {
                    java.util.Iterator it = arrayList2.iterator();
                    i17 = 0;
                    while (it.hasNext()) {
                        ix1.a aVar2 = (ix1.a) it.next();
                        if (aVar2 != null) {
                            if (aVar2.b() != 1) {
                                i17++;
                            } else {
                                sb8.append(((ix1.l) aVar2).f295338s);
                            }
                        }
                    }
                } else {
                    i17 = 0;
                }
                int d18 = com.tencent.mm.plugin.component.editor.u1.d(sb8.toString());
                if (m17 == 2 || m17 == 3) {
                    for (int i19 = sVar.f349637w.f349595a; i19 <= sVar.f349637w.f349597c; i19++) {
                        ix1.a l17 = nx1.d.q().l(i19);
                        if (l17 != null) {
                            if (l17.b() == 1) {
                                ox1.e eVar = sVar.f349637w;
                                int i27 = eVar.f349595a;
                                if (i19 == i27 && i19 == eVar.f349597c) {
                                    java.lang.String str2 = ((ix1.l) l17).f295338s;
                                    int i28 = eVar.f349596b;
                                    int i29 = eVar.f349598d;
                                    i18 = 0;
                                    d17 = com.tencent.mm.plugin.component.editor.u1.e(str2, i28, i29, false);
                                } else if (i19 == i27) {
                                    d17 = com.tencent.mm.plugin.component.editor.u1.e(((ix1.l) l17).f295338s, eVar.f349596b, -1, true);
                                    i18 = 0;
                                } else if (i19 == eVar.f349597c) {
                                    java.lang.String str3 = ((ix1.l) l17).f295338s;
                                    int i37 = eVar.f349598d;
                                    i18 = 0;
                                    d17 = com.tencent.mm.plugin.component.editor.u1.e(str3, 0, i37, false);
                                } else {
                                    i18 = 0;
                                    d17 = com.tencent.mm.plugin.component.editor.u1.d(((ix1.l) l17).f295338s);
                                }
                                d18 -= d17 + i18;
                            } else if (l17.b() != 1) {
                                i17--;
                            }
                        }
                    }
                }
                z18 = nx1.d.q().f(d18, i17);
            }
            if (z18) {
                ((com.tencent.mm.plugin.component.editor.EditorUI) sVar.f349636v).f7();
                yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        int m18 = sVar.m();
        if (m18 == 1 || m18 == 2) {
            sVar.f(true, arrayList2, str);
        } else if (m18 == 3) {
            sVar.e(true, arrayList2, str);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Editor.EditorSelectManager", "paste: invalid selection");
            sVar.r();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
