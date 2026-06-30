package qy0;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager f367567d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager mMMusicManager) {
        super(1);
        this.f367567d = mMMusicManager;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String musicId = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(musicId, "musicId");
        com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager mMMusicManager = this.f367567d;
        if (kotlin.jvm.internal.o.b(musicId, ((com.tencent.maas.model.MJMusicInfo) ((n0.q4) mMMusicManager.f69745g).getValue()).getMusicID())) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMMusicManager", "switch music: current play music is " + musicId + ", no need to switch");
        } else {
            mMMusicManager.a(musicId);
        }
        return jz5.f0.f302826a;
    }
}
