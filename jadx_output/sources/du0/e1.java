package du0;

/* loaded from: classes5.dex */
public final /* synthetic */ class e1 extends kotlin.jvm.internal.m implements yz5.q {
    public e1(java.lang.Object obj) {
        super(3, obj, du0.p1.class, "applyMusicOnClose", "applyMusicOnClose(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;ZZ)V", 0);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = (com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj3).booleanValue();
        du0.p1 p1Var = (du0.p1) this.receiver;
        p1Var.q7(audioCacheInfo);
        p1Var.p7(audioCacheInfo, booleanValue, booleanValue2);
        return jz5.f0.f302826a;
    }
}
