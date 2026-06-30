package j20;

/* loaded from: classes.dex */
public final class c implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f297220a;

    public c(yz5.l lVar) {
        this.f297220a = lVar;
    }

    @Override // j35.b0
    public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 == 157) {
            boolean z17 = false;
            if (iArr != null && iArr[0] == 0) {
                z17 = true;
            }
            com.tencent.mars.xlog.Log.i("EcsPoiPermission", "granted:" + z17);
            yz5.l lVar = this.f297220a;
            if (z17) {
                lVar.invoke(java.lang.Boolean.TRUE);
            } else {
                lVar.invoke(java.lang.Boolean.FALSE);
            }
        }
    }
}
