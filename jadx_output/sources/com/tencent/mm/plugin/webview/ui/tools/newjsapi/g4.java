package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes11.dex */
public final class g4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f186105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186106e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f186107f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f186108g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f186109h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f186110i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f186111m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186112n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186113o;

    public g4(com.tencent.mm.ui.widget.dialog.u3 u3Var, java.lang.String str, int i17, int i18, int i19, boolean z17, boolean z18, nw4.k kVar, nw4.y2 y2Var) {
        this.f186105d = u3Var;
        this.f186106e = str;
        this.f186107f = i17;
        this.f186108g = i18;
        this.f186109h = i19;
        this.f186110i = z17;
        this.f186111m = z18;
        this.f186112n = kVar;
        this.f186113o = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f186105d.dismiss();
        com.tencent.mm.autogen.events.DeleteProfileMsgEvent deleteProfileMsgEvent = new com.tencent.mm.autogen.events.DeleteProfileMsgEvent();
        java.lang.String str = this.f186106e;
        am.a4 a4Var = deleteProfileMsgEvent.f54088g;
        a4Var.f6121a = str;
        a4Var.f6122b = this.f186107f;
        a4Var.f6123c = this.f186108g;
        a4Var.f6124d = this.f186109h;
        a4Var.f6125e = this.f186110i;
        boolean z17 = this.f186111m;
        a4Var.f6126f = z17;
        deleteProfileMsgEvent.e();
        nw4.k kVar = this.f186112n;
        nw4.y2 y2Var = this.f186113o;
        if (z17) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
            return;
        }
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
    }
}
