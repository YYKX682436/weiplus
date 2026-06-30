package kv3;

/* loaded from: classes5.dex */
public final class d implements oa.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv3.h f312676d;

    public d(kv3.h hVar) {
        this.f312676d = hVar;
    }

    @Override // oa.c
    public void h0(oa.i iVar) {
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
        java.lang.Object obj;
        if (iVar == null || (obj = iVar.f343778a) == null || !(obj instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m0)) {
            return;
        }
        ((com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m0) obj).a(false);
        com.tencent.mars.xlog.Log.i(this.f312676d.I, "onTabUnselected " + obj);
    }

    @Override // oa.c
    public void u1(oa.i iVar) {
        java.lang.Object obj;
        if (iVar == null || (obj = iVar.f343778a) == null || !(obj instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m0)) {
            return;
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m0 m0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m0) obj;
        m0Var.a(true);
        kv3.h hVar = this.f312676d;
        androidx.viewpager.widget.ViewPager viewPager = hVar.Q;
        if (viewPager != null) {
            viewPager.setCurrentItem(m0Var.f156293c);
        }
        com.tencent.mars.xlog.Log.i(hVar.I, "onTabSelected " + obj);
    }
}
