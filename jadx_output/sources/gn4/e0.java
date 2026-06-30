package gn4;

/* loaded from: classes9.dex */
public class e0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI f273609d;

    public e0(com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI topStoryFSVideoUI) {
        this.f273609d = topStoryFSVideoUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        an4.a aVar;
        if (menuItem.getItemId() == 2 && (aVar = this.f273609d.f175167z) != null) {
            aVar.B(true);
        }
    }
}
