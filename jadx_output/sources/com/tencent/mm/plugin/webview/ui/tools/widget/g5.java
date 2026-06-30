package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes9.dex */
public final class g5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ck f187233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.l5 f187234e;

    public g5(r45.ck ckVar, com.tencent.mm.plugin.webview.ui.tools.widget.l5 l5Var) {
        this.f187233d = ckVar;
        this.f187234e = l5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r45.m9 m9Var = new r45.m9();
        m9Var.f380263h = this.f187233d.f371601e;
        m9Var.f380262g = 2;
        this.f187234e.f187384f.r(m9Var);
        cx4.a.c(13);
    }
}
