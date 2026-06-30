package mm2;

/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.w f329467d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(mm2.w wVar) {
        super(2);
        this.f329467d = wVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        mm2.w wVar = this.f329467d;
        ((mm2.w) wVar.business(mm2.w.class)).f329505q = intValue;
        ((mm2.w) wVar.business(mm2.w.class)).f329506r = intValue2;
        com.tencent.mars.xlog.Log.i("LiveUtil", "validVideoSize videoWidth:" + intValue + ",videoHeight:" + intValue2);
        boolean z17 = intValue > 0 && intValue2 > 0;
        com.tencent.mars.xlog.Log.i("LiveUtil", "isLandscapeVideo validVideoSize:" + z17);
        if (z17 && intValue >= intValue2) {
            mm2.h hVar = wVar.f329504p;
            if (hVar != null) {
                hVar.setScaleType(1);
            }
        } else {
            mm2.h hVar2 = wVar.f329504p;
            if (hVar2 != null) {
                hVar2.setScaleType(0);
            }
        }
        com.tencent.mars.xlog.Log.i("LiveAdVideoSlice", "onVideoSizeChange [" + intValue + " x " + intValue2 + ']');
        return jz5.f0.f302826a;
    }
}
