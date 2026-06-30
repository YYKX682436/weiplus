package xd4;

/* loaded from: classes4.dex */
public interface f {
    int a();

    void b(android.app.Activity activity, android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView, r45.jj4 jj4Var);

    void c(int i17);

    void d(x25.b bVar);

    void destroy();

    void onConfigurationChanged(android.content.res.Configuration configuration);

    default void onTouchExplorationStateChanged(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchExplorationStateChanged", "com.tencent.mm.plugin.sns.ui.video.ISnsVideoSeekBar");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchExplorationStateChanged", "com.tencent.mm.plugin.sns.ui.video.ISnsVideoSeekBar");
    }
}
