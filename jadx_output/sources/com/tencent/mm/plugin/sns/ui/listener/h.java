package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class h implements ff0.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.DoFavoriteEvent f169787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f169788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f169789c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.c f169790d;

    public h(com.tencent.mm.plugin.sns.ui.listener.c cVar, com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, r45.jj4 jj4Var) {
        this.f169790d = cVar;
        this.f169787a = doFavoriteEvent;
        this.f169788b = snsInfo;
        this.f169789c = jj4Var;
    }

    @Override // ff0.u
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetThumbResult", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener$3");
        pm0.v.W(new com.tencent.mm.plugin.sns.ui.listener.g(this, str));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetThumbResult", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener$3");
    }
}
