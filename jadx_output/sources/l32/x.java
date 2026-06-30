package l32;

/* loaded from: classes13.dex */
public class x implements com.tencent.mm.modelbase.j1 {
    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.plugin.exdevice.model.z1 z1Var;
        com.tencent.mm.plugin.exdevice.model.z1 z1Var2;
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.exdevice.model.z1 z1Var3;
        com.tencent.mm.protobuf.f fVar2;
        com.tencent.mm.plugin.exdevice.model.a2 a2Var = com.tencent.mm.plugin.exdevice.model.a2.INSTANCE;
        a2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "onSceneEnd errType = " + i17 + ", errCode = " + i18 + ",errMsg = " + str);
        r45.iq3 iq3Var = null;
        if (m1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.GetBoundDeviceLogic", "scene == null, do scene failed : %d, %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
            android.app.ProgressDialog progressDialog = a2Var.f98846d;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            a2Var.f98846d.dismiss();
            a2Var.f98846d = null;
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "scene.getType() = %s", java.lang.Integer.valueOf(m1Var.getType()));
        int i27 = 0;
        if (m1Var.getType() != 539) {
            if (m1Var.getType() == 6693) {
                a2Var.f98848f = false;
                if (i17 != 0 || i18 != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.GetBoundDeviceLogic", "scene.getType() = %s, %s, %s", java.lang.Integer.valueOf(m1Var.getType()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                    return;
                }
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "update get bound hard device time : %d", java.lang.Long.valueOf(currentTimeMillis));
                com.tencent.mm.sdk.platformtools.o4.M("exdevice_kv").putLong(gm0.j1.b().h() + "_iot", currentTimeMillis);
                com.tencent.mm.modelbase.o oVar = ((com.tencent.mm.plugin.exdevice.model.j2) m1Var).f98943e;
                if (oVar != null && (fVar = oVar.f70711b.f70700a) != null) {
                    iq3Var = (r45.iq3) fVar;
                }
                if (iq3Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.GetBoundDeviceLogic", "nsResp == null, bind iot device");
                    return;
                }
                java.util.Iterator it = iq3Var.f377265e.iterator();
                while (it.hasNext()) {
                    r45.of4 of4Var = ((r45.pf4) it.next()).f383008i;
                    if (of4Var != null && ((i19 = of4Var.f382225e) == 4011 || i19 == 13000 || i19 == 13001)) {
                        i27++;
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "storage_device_count=%s, device_cnt=%d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(iq3Var.f377264d));
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "device_list_size:%d", java.lang.Integer.valueOf(iq3Var.f377265e.size()));
                ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.exdevice.model.x1(a2Var, i27, iq3Var), "updateIotDevice");
                return;
            }
            return;
        }
        a2Var.f98847e = false;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.GetBoundDeviceLogic", "scene.getType() = %s, %s, %s", java.lang.Integer.valueOf(m1Var.getType()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            java.lang.ref.WeakReference weakReference = a2Var.f98849g;
            if (weakReference != null && (z1Var = (com.tencent.mm.plugin.exdevice.model.z1) weakReference.get()) != null) {
                z1Var.a(false);
            }
            android.app.ProgressDialog progressDialog2 = a2Var.f98846d;
            if (progressDialog2 == null || !progressDialog2.isShowing()) {
                return;
            }
            a2Var.f98846d.dismiss();
            a2Var.f98846d = null;
            return;
        }
        com.tencent.mm.modelbase.o oVar2 = ((com.tencent.mm.plugin.exdevice.model.h2) m1Var).f98917e;
        r45.sb3 sb3Var = (oVar2 == null || (fVar2 = oVar2.f70711b.f70700a) == null) ? null : (r45.sb3) fVar2;
        if (sb3Var == null || (linkedList = sb3Var.f385607e) == null) {
            java.lang.ref.WeakReference weakReference2 = a2Var.f98849g;
            if (weakReference2 != null && (z1Var2 = (com.tencent.mm.plugin.exdevice.model.z1) weakReference2.get()) != null) {
                z1Var2.a(false);
            }
            android.app.ProgressDialog progressDialog3 = a2Var.f98846d;
            if (progressDialog3 == null || !progressDialog3.isShowing()) {
                return;
            }
            a2Var.f98846d.dismiss();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "hard device_cnt:%d", java.lang.Integer.valueOf(linkedList.size()));
        gm0.j1.e().j(new com.tencent.mm.plugin.exdevice.model.y1(a2Var, sb3Var));
        java.lang.ref.WeakReference weakReference3 = a2Var.f98849g;
        if (weakReference3 != null && (z1Var3 = (com.tencent.mm.plugin.exdevice.model.z1) weakReference3.get()) != null) {
            z1Var3.a(true);
        }
        android.app.ProgressDialog progressDialog4 = a2Var.f98846d;
        if (progressDialog4 == null || !progressDialog4.isShowing()) {
            return;
        }
        a2Var.f98846d.dismiss();
        a2Var.f98846d = null;
    }
}
