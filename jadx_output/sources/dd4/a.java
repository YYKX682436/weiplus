package dd4;

/* loaded from: classes.dex */
public final class a implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public static final dd4.a f228967d = new dd4.a();

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleDebugSheet$1");
        g4Var.clear();
        g4Var.f(0, "显示菜单");
        g4Var.f(1, "切换HDR/SDR");
        g4Var.f(2, "显示视频信息");
        g4Var.f(3, "清理该视频");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleDebugSheet$1");
    }
}
