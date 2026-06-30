package com.tencent.mm.ui.chatting;

/* loaded from: classes.dex */
public class tc implements db5.l4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f202717a;

    public tc(android.content.Context context) {
        this.f202717a = context;
    }

    @Override // db5.l4
    public void a(android.widget.TextView textView, android.view.MenuItem menuItem) {
        if (textView != null) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(((java.lang.Object) menuItem.getTitle()) + "", true);
            if (n17 == null || ((int) n17.E2) <= 0) {
                textView.setText(((java.lang.Object) menuItem.getTitle()) + "");
                return;
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String f27 = n17.f2();
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this.f202717a, f27, textSize));
        }
    }
}
