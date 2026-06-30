package l00;

/* loaded from: classes7.dex */
public final class e extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "notifyEcsGiftAnimationStatus";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MBJsApiNotifyEcsGiftAnimationStatus", "notifyEcsGiftAnimationStatus invoke");
        java.lang.String optString = data.optString("status", "");
        bw5.rc0 rc0Var = new bw5.rc0();
        rc0Var.f32491d = optString;
        rc0Var.f32492e[1] = true;
        byte[] byteArray = rc0Var.toByteArray();
        lc3.e eVar = this.f317890a;
        l00.h hVar = eVar instanceof l00.h ? (l00.h) eVar : null;
        if (hVar == null) {
            s().invoke(h(1, "invalid context"));
            return;
        }
        kotlin.jvm.internal.o.d(byteArray);
        l00.i iVar = hVar.f314726y;
        if (iVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", "onEcsGiftAnimationStatus apiName: notifyEcsGiftAnimationStatus, data size: " + byteArray.length);
            com.tencent.pigeon.ecs.EcsMagicBizFlutterApi ecsMagicBizFlutterApi = ((l00.m) iVar).f314733g;
            if (ecsMagicBizFlutterApi != null) {
                ecsMagicBizFlutterApi.invoke("", "notifyEcsGiftAnimationStatus", byteArray, l00.l.f314729d);
            }
        }
        s().invoke(k());
    }
}
