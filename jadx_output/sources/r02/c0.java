package r02;

/* loaded from: classes8.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.TaskItemView f368291d;

    public c0(com.tencent.mm.plugin.downloader_app.ui.TaskItemView taskItemView) {
        this.f368291d = taskItemView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.downloader_app.ui.TaskItemView taskItemView = this.f368291d;
        taskItemView.f97402i.setVisibility(0);
        taskItemView.f97404n.setVisibility(8);
        com.tencent.mm.plugin.downloader_app.ui.ProgressImageView progressImageView = taskItemView.f97403m;
        progressImageView.f97392h = false;
        progressImageView.setImageResource("download_wait_wifi");
    }
}
