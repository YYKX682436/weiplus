package gn4;

/* loaded from: classes15.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI f273640d;

    public m0(com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI topStoryFSVideoUI) {
        this.f273640d = topStoryFSVideoUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        gn4.c1 c1Var = this.f273640d.f175156o;
        int y17 = c1Var.y();
        int itemCount = c1Var.getItemCount();
        x.o oVar = c1Var.f264490e;
        int i17 = oVar.f450851g;
        java.lang.Object[] objArr = oVar.f450850f;
        for (int i18 = 0; i18 < i17; i18++) {
            objArr[i18] = null;
        }
        oVar.f450851g = 0;
        oVar.f450848d = false;
        c1Var.notifyItemRangeRemoved(itemCount - y17, y17);
    }
}
