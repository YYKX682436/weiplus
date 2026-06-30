package nv;

/* loaded from: classes4.dex */
public class b3 implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupCore.MsgSynchronize", "appMsgListener onreceive appmsg");
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(x51.j1.g(p0Var.f70726a.f377561h), "appmsg", null);
        if (((java.lang.String) d17.get(".appmsg.action")).equals("phone")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupCore.MsgSynchronize", "this appmsg is from phone, ignore.");
            return;
        }
        gm0.j1.e().j(new nv.a3(this, (java.lang.String) d17.get(".appmsg.messageaction"), (java.lang.String) d17.get(".appmsg.extinfo"), ((java.lang.String) d17.get(".appmsg.appattach.aeskey")).getBytes()));
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
