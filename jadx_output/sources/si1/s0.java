package si1;

/* loaded from: classes.dex */
public class s0 implements si1.p0 {
    @Override // si1.p0
    public void F6(com.tencent.mm.plugin.appbrand.jsapi.l lVar, final java.lang.String str) {
        com.tencent.mm.plugin.appbrand.utils.d5.b(new java.lang.Runnable() { // from class: si1.s0$$a
            @Override // java.lang.Runnable
            public final void run() {
                dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, java.lang.String.format("jsapi banned %s", str), 0).show();
            }
        });
    }
}
