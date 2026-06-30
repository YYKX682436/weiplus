package of0;

/* loaded from: classes8.dex */
public class q extends com.tencent.mm.sdk.event.n {
    public q() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks;
        android.content.ComponentName componentName;
        boolean z17 = false;
        if (((com.tencent.mm.autogen.events.FinderTeenModeChangeEvent) iEvent).f54331g == null) {
            return false;
        }
        android.app.ActivityManager activityManager = (android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (componentName = runningTasks.get(0).baseActivity) != null && com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeAffinityUI.class.getName().equals(componentName.getClassName())) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStoryTeenModeEvent", "FinderTeenModeChangeEvent: teen mode change， isTopStoryTaskForeground: %b", java.lang.Boolean.valueOf(z17));
        if (!z17) {
            o11.g gVar = wm4.u.f447309a;
            com.tencent.mm.autogen.events.TopStoryEvent topStoryEvent = new com.tencent.mm.autogen.events.TopStoryEvent();
            topStoryEvent.f54898g.f6509a = 4;
            topStoryEvent.e();
        }
        return true;
    }
}
