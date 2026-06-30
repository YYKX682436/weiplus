package nc4;

/* loaded from: classes4.dex */
public final class g0 implements nc4.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f336147a;

    public g0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f336147a = context;
    }

    @Override // nc4.c
    public db5.h4 a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildMenuItem", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance");
        android.content.Context context = this.f336147a;
        db5.h4 h4Var = new db5.h4(context, 3, 0);
        h4Var.f228368i = i65.a.r(context, com.tencent.mm.R.string.f490407u4);
        h4Var.f228373q = i65.a.r(context, com.tencent.mm.R.string.f490412u9);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildMenuItem", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance");
        return h4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    @Override // nc4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(yz5.l r39, kotlin.coroutines.Continuation r40) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nc4.g0.b(yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // nc4.c
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance");
    }

    @Override // nc4.c
    public boolean show() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("show", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance");
        return true;
    }

    @Override // nc4.c
    public int type() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("type", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance");
        int h17 = nc4.d.f336125g.h();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("type", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance");
        return h17;
    }
}
