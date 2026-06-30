package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class x5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.StatusIconConfigUpdateEvent f174421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity f174422e;

    public x5(com.tencent.mm.autogen.events.StatusIconConfigUpdateEvent statusIconConfigUpdateEvent, com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity textStatusDoWhatActivity) {
        this.f174421d = statusIconConfigUpdateEvent;
        this.f174422e = textStatusDoWhatActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.f2 adapter;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("config update old");
        com.tencent.mm.autogen.events.StatusIconConfigUpdateEvent statusIconConfigUpdateEvent = this.f174421d;
        sb6.append(statusIconConfigUpdateEvent.f54867g.f8406a);
        sb6.append(" new:");
        sb6.append(statusIconConfigUpdateEvent.f54867g.f8407b);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivity", sb6.toString());
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity textStatusDoWhatActivity = this.f174422e;
        textStatusDoWhatActivity.f173524r.clear();
        textStatusDoWhatActivity.f173524r.addAll(bk4.i.a().g());
        textStatusDoWhatActivity.f173525s = textStatusDoWhatActivity.Y6(textStatusDoWhatActivity.f173524r);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = textStatusDoWhatActivity.f173513d;
        if (wxRecyclerView == null || (adapter = wxRecyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }
}
