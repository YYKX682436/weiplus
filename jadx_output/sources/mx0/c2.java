package mx0;

/* loaded from: classes5.dex */
public final /* synthetic */ class c2 extends kotlin.jvm.internal.m implements yz5.l {
    public c2(java.lang.Object obj) {
        super(1, obj, mx0.q2.class, "onMusicSelected", "onMusicSelected(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = (com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) obj;
        mx0.q2 q2Var = (mx0.q2) this.receiver;
        q2Var.getClass();
        java.lang.String str = audioCacheInfo != null ? audioCacheInfo.f155723t : null;
        if (str == null) {
            mx0.x.l(q2Var, false, 1, null);
        } else {
            q2Var.c().setText(str);
            q2Var.c().requestFocus();
            q2Var.f(true);
        }
        return jz5.f0.f302826a;
    }
}
