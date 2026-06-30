package lc4;

/* loaded from: classes4.dex */
public final class a extends lc4.b {
    public final void a(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, xc4.p pVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleDelete", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataDelete");
        xc4.p pVar2 = new xc4.p();
        pVar2.convertFrom(pVar.t0(), false);
        mvvmList.u(new zc4.b(pVar2, true));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleDelete", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataDelete");
    }
}
