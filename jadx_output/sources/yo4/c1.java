package yo4;

/* loaded from: classes10.dex */
public final class c1 implements ml5.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout f464189a;

    public c1(com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout multiVideoPluginLayout) {
        this.f464189a = multiVideoPluginLayout;
    }

    @Override // ml5.h
    public void onChange() {
        com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout multiVideoPluginLayout = this.f464189a;
        android.graphics.RectF visibilityRect = multiVideoPluginLayout.getMultiPreviewPlugin().f23211g.getVisibilityRect();
        android.graphics.Rect rect = lt3.n.f321263d;
        rect.set((int) visibilityRect.left, (int) visibilityRect.top, (int) visibilityRect.right, (int) visibilityRect.bottom);
        gp4.j jVar = multiVideoPluginLayout.f175875r;
        jVar.getClass();
        jVar.f274412f.w(rect);
        multiVideoPluginLayout.f175873p1.z(multiVideoPluginLayout.getMultiPreviewPlugin().f23211g.getVisibilityRect());
    }
}
