package gn4;

/* loaded from: classes15.dex */
public class u0 implements android.view.View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI f273657a;

    public u0(com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI topStoryFSVideoUI) {
        this.f273657a = topStoryFSVideoUI;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(int i17) {
        int i18 = com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI.T;
        android.view.View decorView = this.f273657a.getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 2 | 4096 | 4);
    }
}
