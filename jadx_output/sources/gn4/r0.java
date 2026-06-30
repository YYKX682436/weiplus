package gn4;

/* loaded from: classes15.dex */
public class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI f273651d;

    public r0(com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI topStoryFSVideoUI) {
        this.f273651d = topStoryFSVideoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI topStoryFSVideoUI = this.f273651d;
        r45.un6 un6Var = topStoryFSVideoUI.f175153i;
        if (un6Var.f387518x) {
            un6Var.f387518x = false;
            if (topStoryFSVideoUI.V6() == 0) {
                to.a.c((android.media.AudioManager) topStoryFSVideoUI.getContext().getSystemService("audio"), 3, 1, 0);
            }
        } else {
            un6Var.f387518x = true;
        }
        topStoryFSVideoUI.Y6();
        topStoryFSVideoUI.t();
        topStoryFSVideoUI.m();
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
