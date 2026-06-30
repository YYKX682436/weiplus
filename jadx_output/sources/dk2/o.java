package dk2;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.vg f233822d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(dk2.vg vgVar) {
        super(3);
        this.f233822d = vgVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        bw5.gq0 gq0Var = (bw5.gq0) obj3;
        dk2.vg vgVar = this.f233822d;
        if (booleanValue) {
            vgVar.f234254a.set(7, gq0Var != null ? gq0Var.getUrl() : null);
        } else {
            com.tencent.mars.xlog.Log.w("FinderLiveAnchorMusicData", "fetch song url for listenId " + vgVar.f234254a.getString(9) + " failed. ErrorMsg " + str);
        }
        return jz5.f0.f302826a;
    }
}
