package wk;

/* loaded from: classes4.dex */
public class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String str;
        com.tencent.mm.autogen.events.ExtCursorForTimeLineEvent extCursorForTimeLineEvent = (com.tencent.mm.autogen.events.ExtCursorForTimeLineEvent) iEvent;
        if (p94.w0.e() == null) {
            return true;
        }
        am.d8 d8Var = extCursorForTimeLineEvent.f54195h;
        p94.l0 e17 = p94.w0.e();
        java.lang.String str2 = extCursorForTimeLineEvent.f54194g.f6338a;
        com.tencent.mm.plugin.sns.storage.f2 f2Var = (com.tencent.mm.plugin.sns.storage.f2) e17;
        f2Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCursorForTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        f2Var.o2();
        if (f2Var.b3(str2)) {
            str = "select *,rowid from SnsInfo  where  (sourceType & 2 != 0 )  AND " + f2Var.p1(str2);
        } else {
            str = "select *,rowid from SnsInfo  where  (sourceType & 2 != 0 ) ";
        }
        android.database.Cursor B = f2Var.f165994d.B(str + com.tencent.mm.plugin.sns.storage.f2.f165982o, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCursorForTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        d8Var.f6436a = B;
        return true;
    }
}
