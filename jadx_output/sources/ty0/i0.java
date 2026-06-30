package ty0;

/* loaded from: classes5.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f422846d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(n0.e5 e5Var) {
        super(1);
        this.f422846d = e5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String musicID = ((com.tencent.maas.model.MJMusicInfo) ty0.z0.h(this.f422846d).get(((java.lang.Number) obj).intValue())).getMusicID();
        kotlin.jvm.internal.o.f(musicID, "getMusicID(...)");
        return musicID;
    }
}
