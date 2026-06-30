package k61;

/* loaded from: classes9.dex */
public class a implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f304481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k61.b f304482b;

    public a(k61.b bVar, km5.b bVar2) {
        this.f304482b = bVar;
        this.f304481a = bVar2;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.AAQueryListInteractor", "on AAQueryList finish, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        int i17 = fVar.f70615a;
        km5.b bVar = this.f304481a;
        if (i17 != 0 || fVar.f70616b != 0) {
            bVar.a(java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 31L, 1L, false);
            return null;
        }
        r45.f0 f0Var = (r45.f0) fVar.f70618d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AAQueryListInteractor", "on AAQueryList finish, retcode: %s, retmsg: %s", java.lang.Integer.valueOf(f0Var.f373861d), f0Var.f373862e);
        int i18 = f0Var.f373861d;
        if (i18 != 0) {
            if (i18 <= 0 || !com.tencent.mm.sdk.platformtools.t8.K0(f0Var.f373862e)) {
                bVar.a(java.lang.Boolean.FALSE);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 32L, 1L, false);
                return null;
            }
            bVar.a(f0Var.f373862e);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 32L, 1L, false);
            return null;
        }
        java.util.LinkedList linkedList = f0Var.f373863f;
        com.tencent.mars.xlog.Log.i("MicroMsg.AAQueryListInteractor", "on AAQueryList finish get success, return record size: %s", java.lang.Integer.valueOf(linkedList.size()));
        int size = linkedList.size();
        k61.b bVar2 = this.f304482b;
        bVar2.f304483o += size;
        java.lang.String str = f0Var.f373865h;
        bVar2.f304484p = str;
        bVar2.f304485q = f0Var.f373866i;
        bVar2.f304486r = f0Var.f373867m;
        bVar2.f304487s = f0Var.f373868n;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(bVar2.f304487s)) {
            bVar2.f304488t = false;
        } else {
            bVar2.f304488t = true;
        }
        bVar.c(linkedList, f0Var.f373864g, java.lang.Boolean.valueOf(bVar2.f304488t));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 30L, 1L, false);
        return null;
    }
}
