package nx1;

/* loaded from: classes12.dex */
public class z implements mx1.c {

    /* renamed from: f, reason: collision with root package name */
    public static int f341329f;

    /* renamed from: g, reason: collision with root package name */
    public static android.util.DisplayMetrics f341330g;

    /* renamed from: b, reason: collision with root package name */
    public final kx1.a f341332b;

    /* renamed from: a, reason: collision with root package name */
    public final transient java.util.ArrayList f341331a = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public mx1.b f341333c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f341334d = false;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View.OnKeyListener f341335e = new nx1.y(this);

    public z(kx1.a aVar) {
        this.f341332b = aVar;
        com.tencent.mm.plugin.component.editor.EditorUI editorUI = (com.tencent.mm.plugin.component.editor.EditorUI) aVar;
        o25.n1.a(editorUI.getContext());
        com.tencent.mm.ui.bk.q(editorUI.getContext());
        f341329f = com.tencent.mm.sdk.platformtools.d2.f(editorUI.getContext())[0];
        android.util.DisplayMetrics displayMetrics = editorUI.getContext().getResources().getDisplayMetrics();
        f341330g = displayMetrics;
        android.util.TypedValue.applyDimension(1, 8.0f, displayMetrics);
        px1.k.f358825h = 0.0f;
    }

    public static boolean a(nx1.z zVar, com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText, int i17) {
        zVar.getClass();
        int selectionStart = wXRTEditText.getSelectionStart();
        if (selectionStart != wXRTEditText.getSelectionEnd()) {
            return false;
        }
        if (selectionStart == wXRTEditText.getParagraphsInSelection().f341315d) {
            wXRTEditText.K = true;
            px1.s sVar = px1.v.f358861b;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            zVar.d(sVar, bool);
            zVar.d(px1.v.f358862c, bool);
            zVar.d(px1.v.f358863d, bool);
            zVar.d(px1.v.f358860a, bool);
            qx1.q qVar = (qx1.q) zVar.f341333c;
            qVar.f367317k = false;
            qVar.f367311e.setPressed(false);
            qx1.q qVar2 = (qx1.q) zVar.f341333c;
            qVar2.f367318l = false;
            qVar2.f367312f.setPressed(false);
            qx1.q qVar3 = (qx1.q) zVar.f341333c;
            qVar3.f367319m = false;
            qVar3.f367313g.setPressed(false);
            wXRTEditText.K = false;
        }
        return selectionStart == 0 && i17 != 0;
    }

    public com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText b() {
        nx1.d q17 = nx1.d.q();
        java.util.ArrayList arrayList = this.f341331a;
        q17.getClass();
        if (arrayList != null) {
            arrayList.clear();
            synchronized (q17) {
                java.util.ArrayList arrayList2 = q17.f341282a;
                if (arrayList2 != null) {
                    java.util.Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ix1.a aVar = (ix1.a) it.next();
                        com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText = aVar.f295316f;
                        if (wXRTEditText != null) {
                            arrayList.add(wXRTEditText);
                        } else {
                            com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText2 = aVar.f295314d;
                            if (wXRTEditText2 != null && aVar.f295315e != null) {
                                arrayList.add(wXRTEditText2);
                                arrayList.add(aVar.f295315e);
                            }
                        }
                    }
                }
            }
        }
        java.util.ArrayList arrayList3 = this.f341331a;
        if (arrayList3 == null) {
            return null;
        }
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText3 = (com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText) it6.next();
            if (wXRTEditText3.hasFocus()) {
                return wXRTEditText3;
            }
        }
        return null;
    }

    public com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText c() {
        com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText b17 = b();
        if (b17 != null) {
            return b17;
        }
        java.util.ArrayList arrayList = this.f341331a;
        return arrayList.size() >= 1 ? (com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText) arrayList.get(arrayList.size() - 1) : b17;
    }

    public void d(px1.u uVar, java.lang.Object obj) {
        com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText b17 = b();
        if (b17 != null) {
            if (b17.getEditTextType() != 0) {
                b17.M = true;
                b17.L = uVar.b();
                b17.getText().append("\n");
                return;
            }
            int i17 = b17.getSelection().f341315d;
            int length = b17.getText().length();
            if ((obj instanceof java.lang.Boolean) && ((java.lang.Boolean) obj).booleanValue() && i17 == length) {
                b17.x();
                b17.getText().append("\n");
                b17.B();
                b17.setSelection(i17);
            }
            b17.u(uVar, obj);
        }
    }

    public void e(com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText, android.text.Spannable spannable, android.text.Spannable spannable2, int i17, int i18, int i19, int i27) {
        java.lang.String w17 = wXRTEditText.w(nx1.w.f341324b);
        int editTextType = wXRTEditText.getEditTextType();
        kx1.a aVar = this.f341332b;
        if (editTextType == 0) {
            ix1.a l17 = nx1.d.q().l(wXRTEditText.getRecyclerItemPosition());
            if (l17 != null && l17.b() == 1) {
                int h17 = (spannable2 == null ? 0 : com.tencent.mm.plugin.component.editor.u1.h(spannable2.toString())) - (spannable == null ? 0 : com.tencent.mm.plugin.component.editor.u1.h(spannable.toString()));
                if (nx1.d.q().f(h17, 0)) {
                    com.tencent.mm.plugin.component.editor.EditorUI editorUI = (com.tencent.mm.plugin.component.editor.EditorUI) aVar;
                    editorUI.getClass();
                    editorUI.f7();
                    com.tencent.mm.plugin.component.editor.EditorUI editorUI2 = (com.tencent.mm.plugin.component.editor.EditorUI) aVar;
                    editorUI2.getClass();
                    editorUI2.j3(wXRTEditText.getRecyclerItemPosition(), 0L);
                } else {
                    nx1.d.q().i();
                    ix1.l lVar = (ix1.l) l17;
                    lVar.f295313c = i27;
                    lVar.f295338s = w17;
                    lVar.f295312b = true;
                    l17.f295317g = false;
                    nx1.d.q().f341286e += h17;
                }
            }
        } else {
            wXRTEditText.setText("");
            if (com.tencent.mm.sdk.platformtools.t8.K0(w17)) {
                return;
            }
            ix1.l lVar2 = new ix1.l();
            if (w17.equals("<br/>")) {
                w17 = "";
            }
            lVar2.f295338s = w17;
            int r17 = nx1.d.q().r(lVar2, wXRTEditText, true, true, true, false, false);
            nx1.d.q().d(r17 - 1, r17 + 1, true);
        }
        com.tencent.mm.plugin.component.editor.EditorUI editorUI3 = (com.tencent.mm.plugin.component.editor.EditorUI) aVar;
        editorUI3.getClass();
        editorUI3.U3();
    }

    public void f(com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText) {
        if (wXRTEditText.B == 0) {
            wXRTEditText.setTextSize(0, i65.a.h(wXRTEditText.getContext(), com.tencent.mm.R.dimen.f479897ia));
        }
        nx1.q.f341320d = wXRTEditText.getTextSize();
        wXRTEditText.f96599r = this;
        wXRTEditText.setRichTextEditing(null);
        wXRTEditText.setOnKeyListener(this.f341335e);
    }

    public void g(int i17, long j17) {
        com.tencent.mm.plugin.component.editor.EditorUI editorUI = (com.tencent.mm.plugin.component.editor.EditorUI) this.f341332b;
        editorUI.getClass();
        editorUI.j7(i17, j17);
    }

    public void h(boolean z17, long j17) {
        com.tencent.mm.plugin.component.editor.EditorUI editorUI = (com.tencent.mm.plugin.component.editor.EditorUI) this.f341332b;
        editorUI.getClass();
        editorUI.k7(z17, j17);
    }
}
