package ju3;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout f301864d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout baseEditVideoPluginLayout) {
        super(0);
        this.f301864d = baseEditVideoPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.os.Bundle bundle;
        com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout baseEditVideoPluginLayout = this.f301864d;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = baseEditVideoPluginLayout.configProvider;
        iu3.e eVar = new iu3.e(baseEditVideoPluginLayout, baseEditVideoPluginLayout, (recordConfigProvider == null || (bundle = recordConfigProvider.M) == null) ? true : bundle.getBoolean("key_use_music_panel_v2"));
        baseEditVideoPluginLayout.getPluginList().add(eVar);
        return eVar;
    }
}
