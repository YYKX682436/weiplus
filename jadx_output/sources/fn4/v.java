package fn4;

/* loaded from: classes8.dex */
public class v implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI f264613d;

    public v(com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI topStoryBaseVideoUI) {
        this.f264613d = topStoryBaseVideoUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        an4.a aVar;
        if (menuItem.getItemId() == 2 && (aVar = this.f264613d.f175144x) != null) {
            aVar.B(true);
        }
    }
}
