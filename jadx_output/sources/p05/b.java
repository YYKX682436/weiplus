package p05;

/* loaded from: classes4.dex */
public final class b extends com.tencent.mm.modelbase.i {
    public b() {
        r45.s87 s87Var = new r45.s87();
        r45.t87 t87Var = new r45.t87();
        if (tq5.i.f421269a == 0) {
            tq5.i.f421269a = 2014500;
        }
        s87Var.f385565d = tq5.i.f421269a;
        s87Var.f385566e = wo.q.f447782c;
        s87Var.f385567f = com.tencent.mm.sdk.platformtools.z.f193115k ? 64 : 32;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = s87Var;
        lVar.f70665b = t87Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/wevisiongeteffectconfig";
        lVar.f70667d = 8116;
        p(lVar.a());
    }
}
