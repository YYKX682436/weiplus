package qd2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd2.g f361700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wt3.h0 f361701e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(qd2.g gVar, wt3.h0 h0Var) {
        super(2);
        this.f361700d = gVar;
        this.f361701e = h0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f361700d.f361730d = true;
        com.tencent.mars.xlog.Log.i("FinderAudioExtractor", "[downloadImgBgm] success:" + booleanValue + " isFileLegal:" + this.f361700d.b(((com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) this.f361701e).f155715i) + " filePath:" + ((java.lang.String) obj2) + '}');
        this.f361700d.c(booleanValue);
        return jz5.f0.f302826a;
    }
}
