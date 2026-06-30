package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes9.dex */
public final class i5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ck f187267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.q60 f187268e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.l5 f187269f;

    public i5(r45.ck ckVar, r45.q60 q60Var, com.tencent.mm.plugin.webview.ui.tools.widget.l5 l5Var) {
        this.f187267d = ckVar;
        this.f187268e = q60Var;
        this.f187269f = l5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r45.m9 m9Var = new r45.m9();
        m9Var.f380263h = this.f187267d.f371601e;
        m9Var.f380271s = this.f187268e.f383704g;
        m9Var.f380262g = 4;
        this.f187269f.f187384f.r(m9Var);
        cx4.a.c(13);
    }
}
