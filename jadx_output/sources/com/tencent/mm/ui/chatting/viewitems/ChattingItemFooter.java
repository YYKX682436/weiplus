package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ChattingItemFooter extends android.widget.LinearLayout implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f203208d;

    public ChattingItemFooter(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f203208d = context;
    }

    public final void a(r01.g0 g0Var) {
        c01.d9.e().g(new r01.g3(null, 1, g0Var.b(), null, getContext() instanceof android.app.Activity ? ((android.app.Activity) getContext()).getIntent().getStringExtra("uinserve_search_click_id") : ""));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        if (!(tag instanceof r01.g0)) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        r01.g0 g0Var = (r01.g0) tag;
        int i17 = g0Var.f368074b;
        if (i17 == 1) {
            g0Var.f368080h = "menu_click";
            a(g0Var);
        } else if (i17 == 2) {
            g0Var.f368080h = "menu_click";
            a(g0Var);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", g0Var.f368077e);
            intent.putExtra("showShare", false);
            intent.putExtra("geta8key_username", (java.lang.String) null);
            intent.putExtra("key_enable_teen_mode_check", true);
            intent.putExtra("key_enable_fts_quick", true);
            j45.l.j(this.f203208d, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
