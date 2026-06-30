package dy4;

/* loaded from: classes15.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.j f244661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf.f f244662e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(dy4.j jVar, sf.f fVar) {
        super(3);
        this.f244661d = jVar;
        this.f244662e = fVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = (java.lang.String) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        sf.f fVar = this.f244662e;
        dy4.j jVar = this.f244661d;
        if (intValue == 0) {
            com.tencent.rtmp.TXLivePlayer tXLivePlayer = jVar.f244668h;
            if (tXLivePlayer != null) {
                tXLivePlayer.startLivePlay(str, 1);
            }
            fVar.g("ok");
        } else {
            com.tencent.mars.xlog.Log.e(jVar.r(), "get url failed with errMsg %s", str2);
            fVar.g("fail");
        }
        return jz5.f0.f302826a;
    }
}
