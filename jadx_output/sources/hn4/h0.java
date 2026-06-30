package hn4;

/* loaded from: classes3.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI f282572d;

    public h0(com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI topStoryListVideoUI) {
        this.f282572d = topStoryListVideoUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI topStoryListVideoUI = this.f282572d;
        if (topStoryListVideoUI.C1.getVisibility() == 0) {
            android.view.View view = topStoryListVideoUI.C1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
