package com.tencent.mm.plugin.ipcall.model;

/* loaded from: classes14.dex */
public class IPCallSvrNotifyListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.IPCallSvrNotifyEvent> {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.model.q f142460d;

    public IPCallSvrNotifyListener() {
        super(com.tencent.mm.app.a0.f53288d);
        this.__eventId = -303045513;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.IPCallSvrNotifyEvent iPCallSvrNotifyEvent) {
        byte[] bArr;
        com.tencent.mm.autogen.events.IPCallSvrNotifyEvent iPCallSvrNotifyEvent2 = iPCallSvrNotifyEvent;
        if ((iPCallSvrNotifyEvent2 instanceof com.tencent.mm.autogen.events.IPCallSvrNotifyEvent) && (bArr = iPCallSvrNotifyEvent2.f54440g.f7620a) != null && bArr.length > 0 && bArr[0] == 101) {
            int length = bArr.length - 1;
            byte[] bArr2 = new byte[length];
            java.lang.System.arraycopy(bArr, 1, bArr2, 0, length);
            try {
                r45.oe5 oe5Var = (r45.oe5) new r45.oe5().parseFrom(bArr2);
                int i17 = oe5Var.f382200d;
                java.util.LinkedList linkedList = oe5Var.f382202f;
                if (linkedList != null) {
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        int i18 = ((r45.xe5) it.next()).f390014d;
                    }
                }
                com.tencent.mm.plugin.ipcall.model.q qVar = this.f142460d;
                if (qVar != null) {
                    ((r83.e) qVar).f304890d.b(8, oe5Var, 0, 0);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.IPCallSvrNotifyListener", "parse PstnNotify error: %s", e17.getMessage());
            }
        }
        return false;
    }
}
