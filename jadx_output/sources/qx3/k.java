package qx3;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vx3.i f367366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx3.o f367367e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(vx3.i iVar, qx3.o oVar) {
        super(2);
        this.f367366d = iVar;
        this.f367367e = oVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (((java.lang.Number) obj2).intValue() != 0) {
            vx3.i iVar = this.f367366d;
            if (iVar.C) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RingtonePlayerFlow", "onPlayMusicError, try switch to video!");
                dk4.a aVar = iVar.f441284a;
                if (aVar != null) {
                    aVar.f234481r = null;
                }
                iVar.m(false);
                qx3.o oVar = this.f367367e;
                oVar.R6();
                oVar.O6(iVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
