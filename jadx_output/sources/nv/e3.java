package nv;

/* loaded from: classes11.dex */
public class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.MsgSynchronizeStartEvent f340321d;

    public e3(nv.f3 f3Var, com.tencent.mm.autogen.events.MsgSynchronizeStartEvent msgSynchronizeStartEvent) {
        this.f340321d = msgSynchronizeStartEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.MsgSynchronizeStartEvent msgSynchronizeStartEvent = this.f340321d;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupCore", "receive msgSynchronizeStartEvent run userCloseMsgSync[%b]", java.lang.Boolean.valueOf(msgSynchronizeStartEvent.f54502g.f8572c));
        am.zj zjVar = msgSynchronizeStartEvent.f54502g;
        if (zjVar.f8572c) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(466L, 13L, 1L, false);
            return;
        }
        byte[] bArr = zjVar.f8570a;
        if (bArr == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupCore", "msgsynchronize loginconfirmok key is null!");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(466L, 14L, 1L, false);
            return;
        }
        int i17 = zjVar.f8571b;
        vi3.k kVar = vi3.k.f437601f;
        if (kVar == null) {
            vi3.k.f437601f = new vi3.k();
        } else {
            kVar.a();
            vi3.k.f437601f = new vi3.k();
        }
        vi3.k kVar2 = vi3.k.f437601f;
        java.lang.String str = zjVar.f8573d;
        kVar2.f437603b = i17;
        kVar2.d("afterLogin", "", bArr, str);
    }
}
