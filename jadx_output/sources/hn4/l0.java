package hn4;

/* loaded from: classes15.dex */
public class l0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI f282586d;

    public l0(com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI topStoryListVideoUI) {
        this.f282586d = topStoryListVideoUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f282586d.finish();
    }
}
