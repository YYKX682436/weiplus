package dz0;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz0.v f244994d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(dz0.v vVar) {
        super(1);
        this.f244994d = vVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f244994d.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MJSegmentClipBehaviorHolder", "jumpSecondCutAppWithSegmentInfo: " + booleanValue);
        if (booleanValue) {
            bz0.h hVar = bz0.j.f36761l;
            if (hVar != null) {
                hVar.f36745b = true;
            }
            if ((hVar != null ? hVar.f36746c : null) == null && hVar != null) {
                hVar.f36746c = -1;
            }
        }
        return jz5.f0.f302826a;
    }
}
