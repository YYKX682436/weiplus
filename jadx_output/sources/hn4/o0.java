package hn4;

/* loaded from: classes3.dex */
public class o0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI f282592d;

    public o0(com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI topStoryListVideoUI) {
        this.f282592d = topStoryListVideoUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI topStoryListVideoUI = this.f282592d;
        if (topStoryListVideoUI.C1.getVisibility() == 0) {
            if (com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI.k7(topStoryListVideoUI, topStoryListVideoUI.G1, motionEvent.getX(), motionEvent.getY())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryListVideoUI", "touch in mContentViewFull");
                yj0.a.i(false, this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            android.view.View view2 = topStoryListVideoUI.C1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
