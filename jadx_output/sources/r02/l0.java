package r02;

/* loaded from: classes8.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.TaskItemView f368312d;

    public l0(com.tencent.mm.plugin.downloader_app.ui.TaskItemView taskItemView) {
        this.f368312d = taskItemView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.downloader_app.ui.TaskItemView taskItemView = this.f368312d;
        taskItemView.f97402i.setVisibility(0);
        taskItemView.f97404n.setVisibility(8);
        com.tencent.mm.plugin.downloader_app.ui.ProgressImageView progressImageView = taskItemView.f97403m;
        progressImageView.f97392h = true;
        if (com.tencent.mm.ui.bk.C()) {
            progressImageView.setImageResource(com.tencent.mm.R.drawable.avt);
        } else {
            progressImageView.setImageResource(com.tencent.mm.R.drawable.avu);
        }
    }
}
