package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes9.dex */
public class a4 implements com.tencent.mm.pluginsdk.model.app.d4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.b4 f188801a;

    public a4(com.tencent.mm.pluginsdk.model.app.b4 b4Var) {
        this.f188801a = b4Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.d4
    public void a(int i17, int i18) {
        com.tencent.mm.pluginsdk.model.app.b4 b4Var = this.f188801a;
        com.tencent.mm.pluginsdk.model.app.c4 c4Var = b4Var.f188819d;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.pluginsdk.model.app.c4 c4Var2 = b4Var.f188819d;
        c4Var.f188842t = elapsedRealtime - c4Var2.f188841s;
        c4Var2.H((i17 == 0 && i18 == 0) ? 0 : i18);
        com.tencent.mm.pluginsdk.model.app.c4 c4Var3 = b4Var.f188819d;
        c4Var3.f188830e.onSceneEnd(i17, i18, "", c4Var3);
    }
}
