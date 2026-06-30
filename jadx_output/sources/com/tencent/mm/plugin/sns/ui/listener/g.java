package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f169780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.h f169781e;

    public g(com.tencent.mm.plugin.sns.ui.listener.h hVar, java.lang.String str) {
        this.f169781e = hVar;
        this.f169780d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener$3$1");
        com.tencent.mm.plugin.sns.ui.listener.h hVar = this.f169781e;
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = hVar.f169787a;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = hVar.f169788b;
        r45.jj4 jj4Var = hVar.f169789c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.tencent.mm.plugin.sns.ui.listener.c cVar = hVar.f169790d;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = cVar.f169756g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject2 = cVar.f169756g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        qb4.a.j(doFavoriteEvent, snsInfo, jj4Var, timeLineObject, timeLineObject2.ContentObj.f369852w, this.f169780d);
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent2 = hVar.f169787a;
        doFavoriteEvent2.f54090g.f6323i = com.tencent.mm.plugin.sns.ui.listener.c.a(cVar);
        doFavoriteEvent2.f54090g.f6327m = 25;
        doFavoriteEvent2.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener$3$1");
    }
}
