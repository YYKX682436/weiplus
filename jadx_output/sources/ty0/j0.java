package ty0;

/* loaded from: classes5.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f422852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f422853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f422854f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f422855g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ty0.b1 b1Var, n0.e5 e5Var, n0.v2 v2Var, n0.e5 e5Var2) {
        super(4);
        this.f422852d = b1Var;
        this.f422853e = e5Var;
        this.f422854f = v2Var;
        this.f422855g = e5Var2;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        e0.g items = (e0.g) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        n0.o oVar = (n0.o) obj3;
        int intValue2 = ((java.lang.Number) obj4).intValue();
        kotlin.jvm.internal.o.g(items, "$this$items");
        if ((intValue2 & 112) == 0) {
            intValue2 |= ((n0.y0) oVar).c(intValue) ? 32 : 16;
        }
        if ((intValue2 & 721) == 144) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj5 = n0.e1.f333492a;
        com.tencent.maas.model.MJMusicInfo mJMusicInfo = (com.tencent.maas.model.MJMusicInfo) ty0.z0.h(this.f422853e).get(intValue);
        float f17 = ((p2.h) this.f422854f.getValue()).f351380d;
        java.lang.String songName = mJMusicInfo.getSongName();
        kotlin.jvm.internal.o.f(songName, "getSongName(...)");
        java.lang.String singerNames = mJMusicInfo.getSingerNames();
        kotlin.jvm.internal.o.f(singerNames, "getSingerNames(...)");
        ty0.z0.g(f17, songName, singerNames, this.f422852d.f422796f, kotlin.jvm.internal.o.b((java.lang.String) this.f422855g.getValue(), mJMusicInfo.getMusicID()), null, oVar, 0, 32);
        return jz5.f0.f302826a;
    }
}
