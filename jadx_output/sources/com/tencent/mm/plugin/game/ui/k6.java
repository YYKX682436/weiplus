package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class k6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f141449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.m6 f141450e;

    public k6(com.tencent.mm.plugin.game.ui.m6 m6Var, java.lang.String str) {
        this.f141450e = m6Var;
        this.f141449d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.game.ui.m6 m6Var = this.f141450e;
        r53.f.u(m6Var.f141476d, this.f141449d);
        android.content.Context context = m6Var.f141476d;
        com.tencent.mm.plugin.game.model.b bVar = m6Var.f141477e;
        com.tencent.mm.game.report.l.g(context, bVar.f140212o2, bVar.f140213p2, bVar.f140214q2, 17, bVar.field_appId, m6Var.f141479g, bVar.f140210m2, bVar.f140221x2);
    }
}
