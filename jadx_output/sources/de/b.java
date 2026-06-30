package de;

/* loaded from: classes7.dex */
public final class b implements com.tencent.mm.plugin.appbrand.utils.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f229365a;

    public b(de.c cVar, yz5.l lVar) {
        this.f229365a = lVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c0
    public final void a(java.lang.String str) {
        jz5.f0 f0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.LogoCaptureDelegate", "loadIcon, localPath: " + str);
        android.graphics.Bitmap i07 = com.tencent.mm.sdk.platformtools.x.i0(str);
        yz5.l lVar = this.f229365a;
        if (i07 != null) {
            lVar.invoke(com.tencent.mm.sdk.platformtools.x.X(i07, 3));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            lVar.invoke(null);
        }
    }
}
