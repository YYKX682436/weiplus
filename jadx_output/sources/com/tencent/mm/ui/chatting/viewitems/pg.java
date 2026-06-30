package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes.dex */
public class pg implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f205266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f205267b;

    public pg(android.widget.TextView textView, android.content.Context context) {
        this.f205266a = textView;
        this.f205267b = context;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        android.content.Context context = this.f205267b;
        android.widget.TextView textView = this.f205266a;
        if (n17 == null || ((int) n17.E2) <= 0 || !c01.e2.G(str)) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.aj6);
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, string, textSize));
            return;
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(str);
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        float textSize2 = textView.getTextSize();
        ((ke0.e) xVar2).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, e17, textSize2));
    }
}
