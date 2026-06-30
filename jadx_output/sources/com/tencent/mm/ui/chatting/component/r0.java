package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public final class r0 implements a75.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.s0 f199808a;

    public r0(com.tencent.mm.ui.chatting.component.s0 s0Var) {
        this.f199808a = s0Var;
    }

    @Override // a75.b
    public void handleEvent(java.util.List eventList) {
        java.lang.Integer num;
        kotlin.jvm.internal.o.g(eventList, "eventList");
        java.util.Iterator it = eventList.iterator();
        while (it.hasNext()) {
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) ((com.tencent.mm.ui.chatting.component.q0) it.next()).f199732a).entrySet()) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) entry.getKey();
                android.view.View view = (android.view.View) entry.getValue();
                com.tencent.mm.ui.chatting.component.s0 s0Var = this.f199808a;
                s0Var.getClass();
                int height = view.getHeight();
                if (height != 0) {
                    if (f9Var.getType() == 1) {
                        s0Var.f199895h.put(java.lang.Integer.valueOf((f9Var.j().length() / 10) * 10), java.lang.Integer.valueOf(height));
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChatItemHeightRecordComponent", "realRecordMsgHeight[" + f9Var.getMsgId() + "][" + f9Var.j().length() + "]:" + height);
                    } else {
                        java.util.Map map = s0Var.f199894g;
                        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
                        if (!linkedHashMap.keySet().contains(java.lang.Integer.valueOf(f9Var.getType())) || ((num = (java.lang.Integer) linkedHashMap.get(java.lang.Integer.valueOf(f9Var.getType()))) != null && num.intValue() == 0)) {
                            map.put(java.lang.Integer.valueOf(f9Var.getType()), java.lang.Integer.valueOf(height));
                            com.tencent.mm.sdk.platformtools.o4.M("MMKV_ItemHeightRecord").putInt(java.lang.String.valueOf(f9Var.getType()), height);
                        }
                    }
                }
            }
        }
    }
}
