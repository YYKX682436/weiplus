package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class e4 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl5.i f198957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u53.u f198958e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f198959f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.h4 f198960g;

    public e4(com.tencent.mm.ui.chatting.component.h4 h4Var, fl5.i iVar, u53.u uVar, com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f198960g = h4Var;
        this.f198957d = iVar;
        this.f198958e = uVar;
        this.f198959f = chatFooter;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        fl5.i iVar = this.f198957d;
        int i39 = iVar.i();
        if (i39 < 0) {
            return;
        }
        com.tencent.mm.ui.chatting.component.h4 h4Var = this.f198960g;
        int b17 = i39 - i65.a.b(h4Var.f198580d.g(), 52);
        u53.u uVar = this.f198958e;
        java.lang.String format = (android.text.TextUtils.isEmpty(((y53.m) uVar).field_tag) || ((y53.m) uVar).field_accountType != 1) ? null : java.lang.String.format(" (%s)", ((y53.m) uVar).field_tag);
        java.lang.String P0 = ((y53.m) uVar).v0().P0();
        if (P0 == null) {
            P0 = "";
        }
        if (format != null) {
            P0 = P0.concat(format);
        }
        float desiredWidth = android.text.Layout.getDesiredWidth(P0 + " : ", iVar.getPaint());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String P02 = ((y53.m) uVar).v0().P0();
        if (P02 == null || desiredWidth <= b17) {
            sb6.append(P02);
        } else {
            java.lang.String h17 = com.tencent.mm.ui.tools.v4.h(P02, format == null ? 20 : 12);
            if (java.lang.Character.isHighSurrogate(h17.charAt(h17.length() - 1))) {
                h17 = h17.substring(0, h17.length() - 1);
            }
            sb6.append(h17);
            sb6.append("...");
        }
        if (format != null) {
            sb6.append(format);
        }
        if (sb6.length() != 0) {
            sb6.append(" : ");
        }
        java.lang.String t17 = h4Var.f198580d.t();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.app.Activity g17 = h4Var.f198580d.g();
        ((ke0.e) xVar).getClass();
        this.f198959f.o1(t17, bool, com.tencent.mm.pluginsdk.ui.span.c0.i(g17, sb6), bool);
        iVar.removeOnLayoutChangeListener(this);
    }
}
