package kt;

@j95.b
/* loaded from: classes8.dex */
public class a extends i95.w implements ap3.f {
    public void Ai(java.lang.String str) {
        zo3.p.Ni().f(str);
    }

    public void Bi(com.tencent.mm.pluginsdk.model.app.m mVar) {
        com.tencent.mm.pluginsdk.model.app.z Ri = zo3.p.Ri();
        Ri.getClass();
        if (mVar == null || mVar.field_status == 5) {
            return;
        }
        mVar.field_status = 3;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoStorage", "setBlack package name = %s", mVar.field_packageName);
        Ri.update(mVar, new java.lang.String[0]);
    }

    public com.tencent.mm.pluginsdk.model.app.m wi(java.lang.String str) {
        if (gm0.j1.a()) {
            return zo3.p.Ri().z0(str);
        }
        return null;
    }
}
