package r02;

/* loaded from: classes8.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.TaskItemView f368310d;

    public k0(com.tencent.mm.plugin.downloader_app.ui.TaskItemView taskItemView) {
        this.f368310d = taskItemView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.downloader_app.ui.TaskItemView taskItemView = this.f368310d;
        if (taskItemView.G == null) {
            taskItemView.G = new android.graphics.Rect();
        }
        if (taskItemView.E == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TaskItemView", "downloadTipBubble is null");
            return;
        }
        taskItemView.f97403m.getGlobalVisibleRect(taskItemView.G);
        taskItemView.E.a(taskItemView.f97403m);
        taskItemView.E.setOutsideTouchable(true);
        taskItemView.F = true;
    }
}
