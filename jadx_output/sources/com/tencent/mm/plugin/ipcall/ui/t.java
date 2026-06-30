package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.w f143008d;

    public t(com.tencent.mm.plugin.ipcall.ui.w wVar) {
        this.f143008d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f143008d.notifyDataSetChanged();
    }
}
