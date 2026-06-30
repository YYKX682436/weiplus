package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class f implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.o f142801d;

    public f(com.tencent.mm.plugin.ipcall.ui.o oVar) {
        this.f142801d = oVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.ipcall.ui.o oVar = this.f142801d;
        java.lang.String replace = oVar.f142950b.getText().toString().replace("+", "");
        if (replace.startsWith("0") || replace.startsWith("*") || replace.startsWith("#")) {
            oVar.f142950b.setText("+");
            oVar.f142960l = "+";
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        boolean z17;
        int measureText;
        com.tencent.mm.plugin.ipcall.ui.o oVar = this.f142801d;
        android.view.ViewGroup.LayoutParams layoutParams = oVar.f142954f.getLayoutParams();
        android.widget.TextView textView = oVar.f142955g;
        android.widget.TextView textView2 = oVar.f142950b;
        if (layoutParams != null) {
            android.text.TextPaint paint = textView2.getPaint();
            if ("+".equals(textView2.getText().toString())) {
                measureText = (int) paint.measureText(textView2.getText().toString());
                android.view.View view = oVar.f142952d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/DialPadController$2", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/ipcall/ui/DialPadController$2", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setVisibility(8);
            } else {
                measureText = (int) paint.measureText(((java.lang.Object) textView2.getText()) + "+");
                android.view.View view2 = oVar.f142952d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/DialPadController$2", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/ipcall/ui/DialPadController$2", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setVisibility(0);
            }
            android.view.View view3 = oVar.f142954f;
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) view3.getLayoutParams();
            layoutParams2.width = measureText;
            view3.setLayoutParams(layoutParams2);
        }
        java.lang.String replace = textView2.getText().toString().replace("+", "");
        if (t83.c.l(replace)) {
            textView.setText(t83.c.f(replace));
            java.util.LinkedList linkedList = oVar.f142964p;
            if (linkedList != null && linkedList.size() > 0) {
                java.lang.String g17 = t83.c.g(replace);
                java.util.Iterator it = oVar.f142964p.iterator();
                while (it.hasNext()) {
                    r45.o57 o57Var = (r45.o57) it.next();
                    if (o57Var != null && o57Var.f381967e.equals(g17)) {
                        z17 = true;
                        break;
                    }
                }
            }
        } else {
            textView.setText(oVar.f142957i.getString(com.tencent.mm.R.string.g3k));
        }
        z17 = false;
        android.widget.TextView textView3 = oVar.f142956h;
        if (z17) {
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        com.tencent.mm.plugin.ipcall.ui.n nVar = oVar.f142949a;
        if (nVar != null) {
            com.tencent.mm.plugin.ipcall.ui.IPCallDialUI iPCallDialUI = (com.tencent.mm.plugin.ipcall.ui.IPCallDialUI) nVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallDialUI", "onModifyCountryCodeByUser:countryCode:%s,mCountryCode:%s", replace, iPCallDialUI.f142601s);
            int i27 = iPCallDialUI.f142605w;
            if (i27 == 2 || i27 == -1 || iPCallDialUI.f142601s.equals(replace)) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallDialUI", "modifyCountryCodeByUsder");
            iPCallDialUI.f142605w = 2;
            if (iPCallDialUI.f142604v == 1) {
                iPCallDialUI.f142604v = 2;
            } else {
                iPCallDialUI.f142604v = 4;
            }
        }
    }
}
