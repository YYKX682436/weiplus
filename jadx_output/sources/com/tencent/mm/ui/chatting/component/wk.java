package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.y1.class)
/* loaded from: classes9.dex */
public final class wk extends com.tencent.mm.ui.chatting.component.a implements sb5.y1 {

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f200181e = new android.util.SparseArray();

    @Override // yn.d
    public void Z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ServiceNotifyExposeReportComponent", "onFinish");
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        android.util.SparseArray sparseArray = this.f200181e;
        int i17 = 0;
        while (true) {
            if (!(i17 < sparseArray.size())) {
                return;
            }
            int i18 = i17 + 1;
            com.tencent.mm.ui.chatting.component.vk vkVar = (com.tencent.mm.ui.chatting.component.vk) sparseArray.valueAt(i17);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(vkVar.f200133a);
            java.util.Set set = vkVar.f200134b;
            com.tencent.mars.xlog.Log.i("MicroMsg.ServiceNotifyExposeReportComponent", "clear reportId %d, exposedMsgs: %d", valueOf, java.lang.Integer.valueOf(set.size()));
            set.clear();
            i17 = i18;
        }
    }

    public boolean m0(long j17, int i17) {
        android.util.SparseArray sparseArray = this.f200181e;
        com.tencent.mm.ui.chatting.component.vk vkVar = (com.tencent.mm.ui.chatting.component.vk) sparseArray.get(i17);
        if (vkVar == null) {
            vkVar = new com.tencent.mm.ui.chatting.component.vk(i17);
            sparseArray.put(i17, vkVar);
        }
        return vkVar.f200134b.contains(java.lang.Long.valueOf(j17));
    }

    public void n0(long j17, int i17) {
        com.tencent.mm.ui.chatting.component.vk vkVar = (com.tencent.mm.ui.chatting.component.vk) this.f200181e.get(i17);
        if (vkVar != null) {
            vkVar.f200134b.add(java.lang.Long.valueOf(j17));
        }
    }
}
