package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class s1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.SDKOAuthGetA8KeyUI f186829d;

    public s1(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthGetA8KeyUI sDKOAuthGetA8KeyUI) {
        this.f186829d = sDKOAuthGetA8KeyUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthGetA8KeyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.webview.ui.tools.SDKOAuthGetA8KeyUI.f183689n;
        com.tencent.mm.plugin.webview.ui.tools.SDKOAuthGetA8KeyUI sDKOAuthGetA8KeyUI = this.f186829d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = sDKOAuthGetA8KeyUI.f183695i;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        sDKOAuthGetA8KeyUI.f183695i = db5.e1.Q(sDKOAuthGetA8KeyUI, null, sDKOAuthGetA8KeyUI.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.webview.ui.tools.u1(sDKOAuthGetA8KeyUI));
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthGetA8KeyUI", "dealWithConfirm, start get a8 key, url = " + sDKOAuthGetA8KeyUI.f183690d);
        sDKOAuthGetA8KeyUI.f183694h = o45.cg.a();
        gm0.j1.d().g((com.tencent.mm.modelbase.m1) ((v60.u) ((w60.j) i95.n0.c(w60.j.class))).Ai(sDKOAuthGetA8KeyUI.f183690d, c01.z1.r(), 106, 0, sDKOAuthGetA8KeyUI.f183694h, new byte[0]));
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthGetA8KeyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
