package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f202376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f202377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f202378f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.y f202379g;

    public o(com.tencent.mm.ui.chatting.presenter.y yVar, boolean z17, long j17, int i17) {
        this.f202379g = yVar;
        this.f202376d = z17;
        this.f202377e = j17;
        this.f202378f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f202376d;
        java.lang.String str = z17 ? "chat_history_search_show_tab_result" : "chat_history_search_tab_result_exit";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("search_chat_sessionid", de5.a.f229397b);
        hashMap.put("clk_search_sessionid", "" + java.lang.System.currentTimeMillis());
        hashMap.put(z17 ? "show_result_duration" : "click_exit_duration", java.lang.Long.valueOf(this.f202377e));
        com.tencent.mm.ui.chatting.presenter.y yVar = this.f202379g;
        hashMap.put("clk_search_tab", java.lang.Integer.valueOf(yVar.k()));
        hashMap.put("chat_msg_cnt", java.lang.Integer.valueOf(((com.tencent.mm.storage.g9) c01.d9.b().u()).j7(yVar.f202542e)));
        hashMap.put("chat_name", yVar.f202542e);
        hashMap.put("search_result_cnt", java.lang.Integer.valueOf(this.f202378f));
        yVar.getClass();
        hashMap.put("from", "v1");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(str, hashMap, 38014);
    }
}
