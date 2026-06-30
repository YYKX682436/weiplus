package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class sp implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.tp f161550d;

    public sp(com.tencent.mm.plugin.setting.ui.setting.tp tpVar) {
        this.f161550d = tpVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f161550d.f161586d.f160776q.notifyDataSetChanged();
    }
}
