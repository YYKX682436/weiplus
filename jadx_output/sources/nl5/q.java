package nl5;

/* loaded from: classes15.dex */
public final class q implements nl5.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nl5.s f338335a;

    public q(nl5.s sVar) {
        this.f338335a = sVar;
    }

    @Override // nl5.a0
    public void a(android.view.View v17, nl5.z item, java.lang.String curSelect) {
        int i17;
        int i18;
        int length;
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(curSelect, "curSelect");
        nl5.s sVar = this.f338335a;
        sVar.getClass();
        int i19 = item.f338398b;
        nl5.s0 s0Var = sVar.f338339a;
        if (i19 != 1) {
            switch (i19) {
                case android.R.id.selectAll:
                    s0Var.k();
                    android.widget.TextView textView = s0Var.f338357h;
                    s0Var.m(0, textView.getText().length());
                    s0Var.f338373x = false;
                    textView.post(new nl5.r(sVar));
                    textView.setCursorVisible(false);
                    break;
                case android.R.id.cut:
                    java.lang.Object systemService = s0Var.f338356g.getSystemService("clipboard");
                    kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    nl5.b0 b0Var = s0Var.f338355f;
                    java.lang.String str = b0Var.f338247c;
                    ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText(str, str));
                    s0Var.l();
                    s0Var.k();
                    android.widget.TextView textView2 = s0Var.f338357h;
                    java.lang.CharSequence text = textView2.getText();
                    android.text.Editable editable = text instanceof android.text.Editable ? (android.text.Editable) text : null;
                    if (editable != null) {
                        int i27 = b0Var.f338245a;
                        int i28 = b0Var.f338246b;
                        if (i28 >= i27 && i27 <= (length = editable.length()) && i28 <= length && i27 >= 0 && i28 >= 0) {
                            editable.delete(i27, i28);
                        }
                    }
                    android.content.Context context = s0Var.f338356g;
                    try {
                        android.widget.Toast.makeText(context, context.getResources().getString(com.tencent.mm.R.string.gui), 0).show();
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mm.ui.yk.d("EditHelper.OperateWindow", th6, "show toast err", new java.lang.Object[0]);
                    }
                    textView2.setCursorVisible(true);
                    break;
                case android.R.id.copy:
                    java.lang.Object systemService2 = s0Var.f338356g.getSystemService("clipboard");
                    kotlin.jvm.internal.o.e(systemService2, "null cannot be cast to non-null type android.content.ClipboardManager");
                    java.lang.String str2 = s0Var.f338355f.f338247c;
                    ((android.content.ClipboardManager) systemService2).setPrimaryClip(android.content.ClipData.newPlainText(str2, str2));
                    s0Var.l();
                    s0Var.k();
                    boolean z17 = com.tencent.mm.ui.dl.f208345a;
                    java.lang.String str3 = android.os.Build.MANUFACTURER;
                    if (!(!android.text.TextUtils.isEmpty(str3) && str3.equalsIgnoreCase("samsung")) || android.os.Build.VERSION.SDK_INT <= 32) {
                        android.content.Context context2 = s0Var.f338356g;
                        try {
                            android.widget.Toast.makeText(context2, context2.getResources().getString(com.tencent.mm.R.string.guh), 0).show();
                        } catch (java.lang.Throwable th7) {
                            com.tencent.mm.ui.yk.d("EditHelper.OperateWindow", th7, "show toast err", new java.lang.Object[0]);
                        }
                    }
                    android.widget.TextView textView3 = s0Var.f338357h;
                    textView3.setCursorVisible(true);
                    android.text.Selection.setSelection(textView3.getEditableText(), textView3.getSelectionEnd());
                    break;
                case android.R.id.paste:
                    s0Var.f338357h.onTextContextMenuItem(android.R.id.paste);
                    android.widget.TextView textView4 = s0Var.f338357h;
                    textView4.setCursorVisible(true);
                    s0Var.R = textView4.getSelectionStart();
                    break;
                default:
                    s0Var.f338357h.setCursorVisible(true);
                    break;
            }
        } else {
            s0Var.k();
            android.widget.TextView textView5 = s0Var.f338357h;
            int selectionStart = textView5.getSelectionStart();
            if (selectionStart > 0) {
                try {
                    i17 = textView5.getLayout().getOffsetToLeftOf(selectionStart);
                } catch (java.lang.Throwable unused) {
                    i17 = selectionStart - 1;
                }
                s0Var.m(i17, selectionStart);
            } else {
                try {
                    i18 = textView5.getLayout().getOffsetToRightOf(selectionStart);
                } catch (java.lang.Throwable unused2) {
                    i18 = selectionStart + 1;
                }
                s0Var.m(selectionStart, i18);
            }
            s0Var.f338373x = false;
            s0Var.n(s0Var.f338350b);
            s0Var.n(s0Var.f338352c);
            s0Var.p(s0Var.g());
            textView5.setCursorVisible(false);
        }
        if (((java.util.HashMap) s0Var.H).containsKey(java.lang.Integer.valueOf(i19))) {
            android.widget.TextView textView6 = s0Var.f338357h;
            textView6.onTextContextMenuItem(i19);
            s0Var.l();
            s0Var.k();
            textView6.setCursorVisible(true);
        }
        nl5.a0 a0Var = s0Var.f338368s;
        if (a0Var != null) {
            a0Var.a(v17, item, curSelect);
        }
    }

    @Override // nl5.a0
    public void b(java.util.List items, int i17) {
        kotlin.jvm.internal.o.g(items, "items");
    }
}
