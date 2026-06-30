package uf3;

/* loaded from: classes12.dex */
public final class d implements y51.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uf3.g f427181a;

    public d(uf3.g gVar) {
        this.f427181a = gVar;
    }

    @Override // y51.d
    public void a(long j17, int i17) {
        java.lang.Object[] objArr = {java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17)};
        uf3.g gVar = this.f427181a;
        gVar.P("onParseVideoError >> mediaId: %d, errCode: %d", objArr);
        gVar.S(gVar.K().getString(com.tencent.mm.R.string.fjg));
    }

    @Override // y51.d
    public void b(long j17, aq.u0 videoMetaData) {
        kotlin.jvm.internal.o.g(videoMetaData, "videoMetaData");
        this.f427181a.P("onParseVideoSuccess >> mediaId: " + j17 + " w-h:(" + java.lang.Integer.valueOf(videoMetaData.f12979e) + '-' + java.lang.Integer.valueOf(videoMetaData.f12978d) + ')', new java.lang.Object[0]);
    }
}
