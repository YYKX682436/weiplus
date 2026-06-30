package nc4;

/* loaded from: classes4.dex */
public final class k0 implements nc4.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f336162a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f336163b;

    public k0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f336162a = context;
        this.f336163b = "MicroMsg.SpringEntrance";
    }

    @Override // nc4.c
    public db5.h4 a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildMenuItem", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SpringEntrance");
        db5.h4 k17 = xa4.g.k(this.f336162a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildMenuItem", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SpringEntrance");
        return k17;
    }

    @Override // nc4.c
    public java.lang.Object b(yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleSelect", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SpringEntrance");
        lVar.invoke(java.lang.Boolean.TRUE);
        android.content.Context context = this.f336162a;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            xa4.g.E(activity);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleSelect", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SpringEntrance");
        return f0Var;
    }

    @Override // nc4.c
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SpringEntrance");
        com.tencent.mars.xlog.Log.i(this.f336163b, "onActivityResult: " + i17 + ' ' + i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SpringEntrance");
    }

    @Override // nc4.c
    public boolean show() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("show", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SpringEntrance");
        boolean v17 = xa4.g.v();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SpringEntrance");
        return v17;
    }

    @Override // nc4.c
    public int type() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("type", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SpringEntrance");
        int h17 = nc4.d.f336128m.h();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("type", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SpringEntrance");
        return h17;
    }
}
