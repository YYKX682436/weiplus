package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class ic implements in5.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f173984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusHistoryUI f173985b;

    public ic(com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter, com.tencent.mm.plugin.textstatus.ui.TextStatusHistoryUI textStatusHistoryUI) {
        this.f173984a = wxRecyclerAdapter;
        this.f173985b = textStatusHistoryUI;
    }

    @Override // in5.y0
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, in5.w0 data) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(data, "data");
        if (data.f293152e >= this.f173984a.getItemCount() - 1) {
            com.tencent.mm.plugin.textstatus.ui.TextStatusHistoryUI textStatusHistoryUI = this.f173985b;
            if (textStatusHistoryUI.f173636h) {
                return;
            }
            qj4.s.l(qj4.s.f363958a, 14L, null, null, 0L, null, 0L, 62, null);
            textStatusHistoryUI.f173636h = true;
        }
    }
}
