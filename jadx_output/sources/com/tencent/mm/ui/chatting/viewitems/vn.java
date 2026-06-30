package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class vn implements al5.w1 {
    public vn(com.tencent.mm.ui.chatting.viewitems.zm zmVar) {
    }

    public void a(java.lang.Exception exc, java.lang.String str, java.lang.String str2) {
        if (o45.wf.f343030h) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("Content", str);
        hashMap.put("Exception", exc.toString());
        hashMap.put("Stack", exc.getStackTrace());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.i("NeatTextView", str2, hashMap);
    }
}
