package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class p1 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.m f185322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185323b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185324c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185327f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185328g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f185329h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185330i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185331j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185332k;

    public p1(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, com.tencent.mm.pluginsdk.model.app.m mVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z17, java.lang.String str7, java.lang.String str8) {
        this.f185332k = c1Var;
        this.f185322a = mVar;
        this.f185323b = str;
        this.f185324c = str2;
        this.f185325d = str3;
        this.f185326e = str4;
        this.f185327f = str5;
        this.f185328g = str6;
        this.f185329h = z17;
        this.f185330i = str7;
        this.f185331j = str8;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185332k;
        if (!z17) {
            c1Var.j7(1, 3);
            c1Var.i5(c1Var.f184976e, this.f185331j, null);
            return;
        }
        this.f185332k.Q5(this.f185322a, this.f185323b, this.f185324c, this.f185325d, this.f185326e, this.f185327f, str, this.f185328g);
        if (this.f185329h) {
            j45.l.u(c1Var.f184975d, ".ui.chatting.ChattingUI", new android.content.Intent().putExtra("Chat_User", this.f185324c), null);
        } else {
            android.content.Context context = c1Var.f184975d;
            if (context != null) {
                db5.e1.T(context, j65.q.a(context).getString(com.tencent.mm.R.string.f490560yi));
            }
        }
        c1Var.j7(1, 1);
        c1Var.i5(c1Var.f184976e, this.f185330i, null);
    }
}
