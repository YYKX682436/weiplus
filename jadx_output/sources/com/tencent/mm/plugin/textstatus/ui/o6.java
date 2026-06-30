package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class o6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.StatusIconConfigUpdateEvent f174145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f174146e;

    public o6(com.tencent.mm.autogen.events.StatusIconConfigUpdateEvent statusIconConfigUpdateEvent, com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f174145d = statusIconConfigUpdateEvent;
        this.f174146e = textStatusDoWhatActivityV2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.f2 adapter;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("config update old");
        com.tencent.mm.autogen.events.StatusIconConfigUpdateEvent statusIconConfigUpdateEvent = this.f174145d;
        sb6.append(statusIconConfigUpdateEvent.f54867g.f8406a);
        sb6.append(" new:");
        sb6.append(statusIconConfigUpdateEvent.f54867g.f8407b);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", sb6.toString());
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f174146e;
        textStatusDoWhatActivityV2.Y.clear();
        textStatusDoWhatActivityV2.Y.addAll(textStatusDoWhatActivityV2.c7().h());
        textStatusDoWhatActivityV2.Z = textStatusDoWhatActivityV2.h7(textStatusDoWhatActivityV2.c7().g());
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = textStatusDoWhatActivityV2.f173537e;
        if (wxRecyclerView == null || (adapter = wxRecyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }
}
