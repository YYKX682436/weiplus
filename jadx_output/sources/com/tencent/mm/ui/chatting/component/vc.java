package com.tencent.mm.ui.chatting.component;

/* loaded from: classes13.dex */
public class vc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.qc f200125d;

    public vc(com.tencent.mm.ui.chatting.component.qc qcVar) {
        this.f200125d = qcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.qc qcVar = this.f200125d;
        int size = ((java.util.ArrayList) qcVar.f199769n).size();
        while (true) {
            size--;
            if (size < 20) {
                qcVar.f199768m.notifyItemRangeRemoved(20, ((java.util.ArrayList) qcVar.f199769n).size() - 20);
                return;
            } else {
                rn.c cVar = (rn.c) ((java.util.ArrayList) qcVar.f199769n).remove(size);
                if (cVar != null) {
                    qcVar.f199770o.remove(cVar);
                }
            }
        }
    }
}
