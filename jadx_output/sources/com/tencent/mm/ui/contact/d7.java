package com.tencent.mm.ui.contact;

/* loaded from: classes10.dex */
public class d7 implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.OnlyChatContactMgrUI f206666d;

    public d7(com.tencent.mm.ui.contact.OnlyChatContactMgrUI onlyChatContactMgrUI) {
        this.f206666d = onlyChatContactMgrUI;
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        boolean equals = "↑".equals(str);
        com.tencent.mm.ui.contact.OnlyChatContactMgrUI onlyChatContactMgrUI = this.f206666d;
        if (equals) {
            onlyChatContactMgrUI.f206502d.setSelection(0);
            return;
        }
        java.util.HashMap hashMap = onlyChatContactMgrUI.f206503e.f206963o;
        int intValue = hashMap.get(str) == null ? -1 : ((java.lang.Integer) hashMap.get(str)).intValue();
        if (intValue != -1) {
            onlyChatContactMgrUI.f206502d.setSelection(intValue);
        }
    }
}
