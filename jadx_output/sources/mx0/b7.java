package mx0;

/* loaded from: classes5.dex */
public final class b7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f331855d;

    public b7(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        this.f331855d = shootComposingPluginLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mx0.ja templateUIPlugin;
        templateUIPlugin = this.f331855d.getTemplateUIPlugin();
        templateUIPlugin.f332080i.notifyDataSetChanged();
    }
}
