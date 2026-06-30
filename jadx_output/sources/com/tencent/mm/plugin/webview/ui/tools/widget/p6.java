package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes7.dex */
public class p6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f187501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.t6 f187502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k2 f187503f;

    public p6(com.tencent.mm.plugin.webview.ui.tools.widget.x6 x6Var, java.util.LinkedList linkedList, com.tencent.mm.plugin.webview.ui.tools.widget.t6 t6Var, com.tencent.mm.ui.widget.dialog.k2 k2Var) {
        this.f187501d = linkedList;
        this.f187502e = t6Var;
        this.f187503f = k2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/WebAuthorizeDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList = this.f187501d;
            if (i17 >= linkedList.size()) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putSerializable("key_scope", arrayList2);
                this.f187502e.a(1, bundle);
                this.f187503f.dismiss();
                yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/WebAuthorizeDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (((r45.jv5) linkedList.get(i17)).f378133f == 2 || ((r45.jv5) linkedList.get(i17)).f378133f == 3) {
                arrayList2.add(((r45.jv5) linkedList.get(i17)).f378131d);
            }
            i17++;
        }
    }
}
