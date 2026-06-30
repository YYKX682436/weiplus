package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes4.dex */
public class t implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.v f189081a;

    public t(com.tencent.mm.pluginsdk.model.app.v vVar) {
        this.f189081a = vVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.pluginsdk.model.app.v vVar = this.f189081a;
        com.tencent.mm.pluginsdk.model.app.w.a(vVar.f189096c, 0, 0, "", 0, vVar.f189097d);
        com.tencent.mm.pluginsdk.model.app.w.A(vVar.f189097d, false);
        com.tencent.mm.pluginsdk.model.app.w.b(vVar.f189097d, false, vVar.f189099f);
        com.tencent.mm.pluginsdk.model.app.a5 a5Var = vVar.f189100g;
        if (a5Var != null) {
            a5Var.a(false, true);
        }
    }
}
