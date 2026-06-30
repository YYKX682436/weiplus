package hf2;

/* loaded from: classes10.dex */
public final class u1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.b2 f281173d;

    public u1(hf2.b2 b2Var) {
        this.f281173d = b2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.text.Editable text;
        android.content.Context context;
        java.util.LinkedList linkedList;
        r45.ji0 ji0Var;
        android.view.Window window;
        android.view.View decorView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerTextOptionWidget$editClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hf2.b2 b2Var = this.f281173d;
        hf2.l2 l76 = b2Var.f281006a.l7();
        l76.getClass();
        com.tencent.mars.xlog.Log.i(l76.f281105b, "editClickListener".concat(" hidePanel"));
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = l76.f281107d;
        java.lang.String str = null;
        if (liveBottomSheetPanel != null) {
            com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(liveBottomSheetPanel, null, 1, null);
        }
        l76.f281104a.f281190v = false;
        hf2.x xVar = b2Var.f281006a;
        r45.h84 h84Var = xVar.f281186r;
        java.lang.String string = h84Var != null ? h84Var.getString(0) : null;
        boolean z17 = !(string == null || string.length() == 0);
        java.lang.String str2 = b2Var.f281007b;
        com.tencent.mars.xlog.Log.i(str2, "editClickListener isMaasSticker:" + z17);
        if (z17) {
            hf2.y0 g76 = xVar.g7();
            android.view.View view2 = g76.f281204e;
            if (view2 != null) {
                zl2.r4.f473950a.Q2(view2);
            }
            hf2.x xVar2 = g76.f281200a;
            com.tencent.mm.ui.MMActivity N6 = xVar2.N6();
            if (N6 != null && (window = N6.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.post(new hf2.p0(g76));
            }
            android.view.View inflate = android.view.LayoutInflater.from(xVar2.O6()).inflate(com.tencent.mm.R.layout.deg, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
            g76.f281204e = viewGroup;
            g76.f281205f = (android.widget.EditText) viewGroup.findViewById(com.tencent.mm.R.id.q8k);
            android.view.View view3 = g76.f281204e;
            g76.f281206g = view3 != null ? view3.findViewById(com.tencent.mm.R.id.cpe) : null;
            android.view.View view4 = g76.f281204e;
            android.view.View findViewById = view4 != null ? view4.findViewById(com.tencent.mm.R.id.jpp) : null;
            g76.f281207h = findViewById;
            if (findViewById != null) {
                findViewById.setOnClickListener(new hf2.u0(g76));
            }
            android.view.View view5 = g76.f281204e;
            android.view.View findViewById2 = view5 != null ? view5.findViewById(com.tencent.mm.R.id.asv) : null;
            g76.f281208i = findViewById2;
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new hf2.w0(g76));
            }
            android.view.ViewGroup viewGroup2 = xVar2.f281191w;
            if (viewGroup2 != null) {
                viewGroup2.addView(g76.f281204e, new android.view.ViewGroup.LayoutParams(-1, -1));
            }
            android.view.View view6 = xVar2.h7().f281014i;
            if (view6 != null) {
                view6.bringToFront();
            }
            android.widget.EditText editText = g76.f281205f;
            r45.ei0 ei0Var = xVar2.f281185q;
            java.lang.String str3 = (ei0Var == null || (linkedList = ei0Var.f373529d) == null || (ji0Var = (r45.ji0) kz5.n0.Z(linkedList)) == null) ? null : ji0Var.f377829n;
            java.lang.String str4 = str3 != null ? str3 : "";
            int length = str4.length();
            int i17 = g76.f281202c;
            if (length > i17) {
                str4 = str4.substring(0, i17 - 1);
                kotlin.jvm.internal.o.f(str4, "substring(...)");
            }
            if (editText != null) {
                editText.requestFocus();
            }
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ((editText == null || (context = editText.getContext()) == null) ? null : context.getSystemService("input_method"));
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(editText, 0);
            }
            zl2.r4 r4Var = zl2.r4.f473950a;
            int i18 = g76.f281202c;
            r4Var.Z2(editText, null, i18, i18, false, com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_1, new hf2.s0(g76, editText));
            if (editText != null) {
                editText.setText(str4);
            }
            if (editText != null) {
                android.text.Editable text2 = editText.getText();
                editText.setSelection(text2 != null ? text2.length() : 0);
            }
            hf2.y0.e(editText, g76);
            android.view.View view7 = g76.f281207h;
            if (view7 != null) {
                if (editText != null && (text = editText.getText()) != null) {
                    str = text.toString();
                }
                view7.setEnabled(!(str == null || str.length() == 0));
            }
        } else {
            hf2.h0 f76 = xVar.f7();
            android.view.View view8 = f76.f281073d;
            if (view8 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view8, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerEditorWidget", "showStickerInput", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerEditorWidget", "showStickerInput", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view9 = f76.f281073d;
            if (view9 != null) {
                view9.bringToFront();
            }
            qc0.g1 g1Var = f76.f281072c;
            if (g1Var != null) {
                ((com.tencent.mm.plugin.recordvideo.ui.editor.sticker.StickerEditorContainer) g1Var).j(true, 17.0f);
            }
            com.tencent.mars.xlog.Log.i(str2, "".concat(" hide"));
            android.view.View view10 = b2Var.f281014i;
            if (view10 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view10, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerTextOptionWidget", "hide", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view10, "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerTextOptionWidget", "hide", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerTextOptionWidget$editClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
