package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.j3 f142851d;

    public h3(com.tencent.mm.plugin.ipcall.ui.j3 j3Var) {
        this.f142851d = j3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f142851d.notifyDataSetChanged();
    }
}
