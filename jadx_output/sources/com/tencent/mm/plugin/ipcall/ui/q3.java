package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class q3 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI f142989d;

    public q3(com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI iPCallRechargeUI) {
        this.f142989d = iPCallRechargeUI;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallRechargeUI$4", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI iPCallRechargeUI = this.f142989d;
        ((android.widget.TextView) view).setHighlightColor(iPCallRechargeUI.getResources().getColor(com.tencent.mm.R.color.a9e));
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = iPCallRechargeUI.getString(com.tencent.mm.R.string.g4g) + "&usedcc=";
        com.tencent.mm.plugin.ipcall.model.j a17 = com.tencent.mm.plugin.ipcall.model.j.a();
        if (!a17.f142473c) {
            a17.b(false);
        }
        java.util.ArrayList arrayList2 = a17.f142471a;
        if (arrayList2.size() > 0) {
            int size = arrayList2.size();
            if (size > 5) {
                size = 5;
            }
            for (int i17 = 0; i17 < size; i17++) {
                java.lang.String g17 = t83.c.g(((java.lang.Integer) arrayList2.get(i17)).toString());
                if (!com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                    str = str + g17 + "|";
                }
            }
            if (str.endsWith("|")) {
                str = str.substring(0, str.length() - 1);
            }
        } else {
            str = str + t83.c.g(t83.f.f());
        }
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        j45.l.j(iPCallRechargeUI, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallRechargeUI$4", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setColor(this.f142989d.getResources().getColor(com.tencent.mm.R.color.f479308vo));
        textPaint.setUnderlineText(false);
    }
}
