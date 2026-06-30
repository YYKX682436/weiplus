package p05;

/* loaded from: classes4.dex */
public final class a extends com.tencent.mm.modelbase.i {
    public a() {
        r45.p87 p87Var = new r45.p87();
        r45.q87 q87Var = new r45.q87();
        if (tq5.i.f421269a == 0) {
            tq5.i.f421269a = 2014500;
        }
        p87Var.f382858d = tq5.i.f421269a;
        p87Var.f382859e = wo.q.f447782c;
        p87Var.f382860f = com.tencent.mm.sdk.platformtools.z.f193115k ? 64 : 32;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = p87Var;
        lVar.f70665b = q87Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/wevisiongetdevicemodelscore";
        lVar.f70667d = 7179;
        p(lVar.a());
    }
}
