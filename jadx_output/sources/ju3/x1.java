package ju3;

/* loaded from: classes10.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout f302039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout recordPluginLayout) {
        super(1);
        this.f302039d = recordPluginLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout recordPluginLayout = this.f302039d;
        if (booleanValue) {
            ((android.widget.Switch) recordPluginLayout.findViewById(com.tencent.mm.R.id.gxj)).setChecked(true);
            ((android.widget.Switch) recordPluginLayout.findViewById(com.tencent.mm.R.id.f484048cu1)).setChecked(false);
        } else {
            ((android.widget.Switch) recordPluginLayout.findViewById(com.tencent.mm.R.id.gxj)).setChecked(false);
            ((android.widget.Switch) recordPluginLayout.findViewById(com.tencent.mm.R.id.f484048cu1)).setChecked(true);
        }
        return jz5.f0.f302826a;
    }
}
