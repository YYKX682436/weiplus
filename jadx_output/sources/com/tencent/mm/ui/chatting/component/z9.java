package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public class z9 implements java.lang.Runnable {
    public z9(com.tencent.mm.ui.chatting.component.da daVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList;
        com.tencent.mm.smiley.e1 b17 = com.tencent.mm.smiley.e1.b();
        synchronized (b17.f193243c) {
            arrayList = new java.util.ArrayList(b17.f193243c);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.smiley.e1.b().c(((com.tencent.mm.storage.emotion.SmileyPanelConfigInfo) it.next()).field_key);
        }
    }
}
