package yo4;

/* loaded from: classes10.dex */
public final class a0 implements ml5.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout f464168a;

    public a0(com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout) {
        this.f464168a = multiVideoFullScreenPluginLayout;
    }

    @Override // ml5.h
    public void onChange() {
        com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout = this.f464168a;
        android.graphics.RectF rectF = multiVideoFullScreenPluginLayout.getMultiPreviewPlugin().f23216o;
        android.graphics.Rect rect = lt3.n.f321263d;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        gp4.j jVar = multiVideoFullScreenPluginLayout.f175850r;
        jVar.getClass();
        jVar.f274412f.w(rect);
    }
}
