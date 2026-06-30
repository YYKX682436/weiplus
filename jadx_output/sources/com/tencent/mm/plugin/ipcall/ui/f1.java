package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class f1 implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallContactUI f142803d;

    public f1(com.tencent.mm.plugin.ipcall.ui.IPCallContactUI iPCallContactUI) {
        this.f142803d = iPCallContactUI;
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        boolean equals = "↑".equals(str);
        com.tencent.mm.plugin.ipcall.ui.IPCallContactUI iPCallContactUI = this.f142803d;
        if (equals) {
            iPCallContactUI.f142551f.setSelection(0);
            return;
        }
        java.util.HashMap hashMap = iPCallContactUI.f142552g.f143049r;
        int intValue = hashMap.containsKey(str) ? ((java.lang.Integer) hashMap.get(str)).intValue() : -1;
        if (intValue != -1) {
            iPCallContactUI.f142551f.setSelection(intValue);
        }
    }
}
