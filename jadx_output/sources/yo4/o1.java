package yo4;

/* loaded from: classes10.dex */
public final class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout f464277d;

    public o1(com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout multiVideoPluginLayout) {
        this.f464277d = multiVideoPluginLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout multiVideoPluginLayout = this.f464277d;
        android.view.ViewParent parent = multiVideoPluginLayout.f175875r.f274412f.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        viewGroup.removeView(multiVideoPluginLayout.f175875r.f274412f);
        com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer = multiVideoPluginLayout.f175875r.f274412f;
        bp4.k0 multiPreviewPlugin = multiVideoPluginLayout.getMultiPreviewPlugin();
        viewGroup.addView(timeEditorItemContainer, multiPreviewPlugin.f23213i.indexOfChild(multiPreviewPlugin.f23210f) + 1);
    }
}
