package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public abstract class t1 {
    public static com.tencent.mm.plugin.game.model.b a(m53.h hVar) {
        m53.i6 i6Var;
        if (hVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GamePBData", "Invalid pb object");
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(hVar.f323717d)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GamePBData", "No AppID field, abort");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GamePBData", "Parsing AppID: %s", hVar.f323717d);
        com.tencent.mm.plugin.game.model.b bVar = new com.tencent.mm.plugin.game.model.b();
        bVar.field_appId = hVar.f323717d;
        bVar.field_appName = hVar.f323719f;
        bVar.field_appIconUrl = hVar.f323718e;
        bVar.field_appType = ",1,";
        bVar.field_packageName = hVar.f323723m;
        bVar.field_appVersion = hVar.f323732v;
        bVar.field_appInfoFlag = hVar.f323727q;
        m53.b0 b0Var = hVar.f323725o;
        if (b0Var != null) {
            bVar.z0(b0Var.f323568d);
            bVar.y0(hVar.f323725o.f323569e);
            bVar.w0(hVar.f323725o.f323572h);
            bVar.A0(hVar.f323725o.f323570f);
            m53.b0 b0Var2 = hVar.f323725o;
            bVar.f140222y2 = b0Var2.f323574m;
            bVar.f140223z2 = b0Var2.f323573i;
            bVar.A2 = b0Var2.f323575n;
        }
        m53.b0 b0Var3 = hVar.f323725o;
        if (b0Var3 != null && (i6Var = b0Var3.f323571g) != null) {
            bVar.W = i6Var.f323798d;
            bVar.A = true;
            bVar.X = i6Var.f323799e;
            bVar.A = true;
            bVar.U = i6Var.f323800f;
            bVar.A = true;
            bVar.V = i6Var.f323801g;
            bVar.A = true;
            bVar.Z = i6Var.f323803i;
            bVar.A = true;
        }
        bVar.f140207j2 = hVar.f323720g;
        bVar.f140206i2 = hVar.f323721h;
        bVar.f140204g2 = hVar.f323726p;
        bVar.f140208k2 = hVar.f323722i;
        bVar.f140215r2 = hVar.f323724n;
        bVar.f140210m2 = hVar.f323728r;
        bVar.f140211n2 = hVar.f323729s;
        bVar.f140218u2 = hVar.f323735y;
        bVar.B2 = hVar.A;
        bVar.C2 = hVar.B;
        return bVar;
    }
}
