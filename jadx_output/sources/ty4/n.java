package ty4;

@j95.b
/* loaded from: classes15.dex */
public class n extends i95.w implements uy4.v {
    public n(android.content.Context context) {
        new java.util.HashMap();
    }

    public boolean Ai(java.lang.String str) {
        yy4.a b17 = sy4.m.f413884c.b(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isOnline ");
        sb6.append(str);
        sb6.append(", ");
        sb6.append(b17.y0());
        com.tencent.mars.xlog.Log.i("LabAppLifeService", sb6.toString());
        return b17.y0();
    }

    public boolean Bi(java.lang.String str) {
        if (sy4.m.f413884c.b(str).field_Switch == 2) {
            com.tencent.mars.xlog.Log.i("LabAppLifeService", "appid %s is open ", str);
            return true;
        }
        com.tencent.mars.xlog.Log.i("LabAppLifeService", "appid %s is close", str);
        return false;
    }

    public void Di(java.lang.String str) {
        yy4.a b17 = sy4.m.f413884c.b(str);
        sy4.q qVar = new sy4.q();
        qVar.f413891a = str;
        qVar.f413892b = b17.field_expId;
        qVar.f413894d = java.lang.System.currentTimeMillis();
        qVar.f413893c = 3;
        sy4.r.b(qVar);
    }

    public void Ni(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("LabAppLifeService", "switchEntry " + str + "," + z17);
        sy4.m mVar = sy4.m.f413884c;
        yy4.a b17 = mVar.b(str);
        int i17 = z17 ? 2 : 1;
        if (b17.field_Switch != i17) {
            b17.field_Switch = i17;
            mVar.c().update(b17, new java.lang.String[0]);
            r45.i54 i54Var = new r45.i54();
            r45.h54 h54Var = new r45.h54();
            h54Var.f375854d = b17.field_bItemFromXExpt == 1 ? 0 : com.tencent.mm.sdk.platformtools.t8.D1(b17.field_expId, 0);
            h54Var.f375855e = b17.field_LabsAppId;
            h54Var.f375856f = b17.field_Switch != 2 ? 2 : 1;
            i54Var.f376747d.add(h54Var);
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(207, i54Var));
            sy4.r.a(str, b17.field_Switch == 2 ? 4 : 5, false);
        }
    }

    public boolean wi(java.lang.String str) {
        yy4.a b17 = sy4.m.f413884c.b(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hitExp ");
        sb6.append(str);
        sb6.append(", ");
        sb6.append(b17.z0());
        com.tencent.mars.xlog.Log.i("LabAppLifeService", sb6.toString());
        return b17.z0();
    }
}
