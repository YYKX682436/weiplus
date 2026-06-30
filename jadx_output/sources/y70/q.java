package y70;

/* loaded from: classes11.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y70.s f459690d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(y70.s sVar) {
        super(1);
        this.f459690d = sVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g75.z state = (g75.z) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof m70.f)) {
            m70.f fVar = (m70.f) dVar;
            y70.s sVar = this.f459690d;
            if (!sVar.h().e("HAS_SHOWN_KEY", false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImgDownload.MsgImgShowImagePPC", "MsgImgShowImageBypassAction - showImage");
                sVar.j(state, fVar.f324473b, fVar.f324474c);
            }
        }
        return jz5.f0.f302826a;
    }
}
