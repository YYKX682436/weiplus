package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class ip implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.jp f161171d;

    public ip(com.tencent.mm.plugin.setting.ui.setting.jp jpVar) {
        this.f161171d = jpVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.setting.ui.setting.jp jpVar = this.f161171d;
        jpVar.f161210f.f160776q.notifyDataSetChanged();
        jpVar.f161210f.V6(false);
    }
}
