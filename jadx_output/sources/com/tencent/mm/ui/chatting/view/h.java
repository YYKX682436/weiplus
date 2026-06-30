package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class h {
    public h(kotlin.jvm.internal.i iVar) {
    }

    public final void a(long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : com.tencent.mm.ui.chatting.view.r.f203063n.entrySet()) {
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) entry.getKey();
            com.tencent.mm.ui.chatting.view.i iVar = (com.tencent.mm.ui.chatting.view.i) entry.getValue();
            if (iVar.f202957b == j17) {
                iVar.f202956a.cancel();
                kotlin.jvm.internal.o.d(mMNeat7extView);
                arrayList.add(mMNeat7extView);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.chatting.view.r.f203063n.remove((com.tencent.mm.ui.widget.MMNeat7extView) it.next());
        }
    }
}
