package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s83.c f142764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.e f142765e;

    public c(com.tencent.mm.plugin.ipcall.ui.e eVar, s83.c cVar) {
        this.f142765e = eVar;
        this.f142764d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ipcall.ui.e eVar = this.f142765e;
        s83.c cVar = this.f142764d;
        if (cVar == null || cVar.systemRowid == -1) {
            eVar.f142787d.f142953e.setText("");
        } else {
            eVar.f142787d.f142953e.setText(cVar.field_systemAddressBookUsername);
        }
    }
}
