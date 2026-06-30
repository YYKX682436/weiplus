package o45;

/* loaded from: classes12.dex */
public abstract class bh {
    public static r45.he a(o45.zg zgVar) {
        r45.he heVar = new r45.he();
        heVar.f376080g = zgVar.getClientVersion();
        heVar.f376082i = zgVar.getSceneStatus();
        heVar.f376078e = zgVar.getUin();
        com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(zgVar.getDeviceID().getBytes());
        heVar.f376079f = b17;
        if (b17.f192156a.length >= 16) {
            b17.f(16);
            heVar.f376079f = b17;
        }
        com.tencent.mm.protobuf.g b18 = com.tencent.mm.protobuf.g.b(zgVar.getDeviceType().getBytes());
        heVar.f376081h = b18;
        if (b18.f192156a.length >= 132) {
            b18.f(132);
            heVar.f376081h = b18;
        }
        try {
            heVar.f376077d = com.tencent.mm.protobuf.g.a(new java.lang.String("\u0000"), com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMBase", e17.getLocalizedMessage());
        }
        return heVar;
    }

    public static void b(o45.ah ahVar, r45.ie ieVar) {
        r45.du5 du5Var = ieVar.f376960e;
        if (du5Var != null) {
            ahVar.setErrMsg(du5Var.f372756d);
        } else {
            ahVar.setErrMsg("");
            com.tencent.mars.xlog.Log.e("MicroMsg.MMBase", "ErrMsg is Null!!!!!!");
        }
    }
}
