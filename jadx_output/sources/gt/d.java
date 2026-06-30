package gt;

/* loaded from: classes7.dex */
public class d implements gm0.i2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f275195d;

    public d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f275195d = arrayList;
        arrayList.add(new k91.o0(new k91.p0()));
        arrayList.add(new com.tencent.mm.plugin.appbrand.appusage.r3());
        arrayList.add(new com.tencent.mm.plugin.appbrand.appusage.p());
        arrayList.add(new com.tencent.mm.plugin.appbrand.jsruntime.s1());
        arrayList.add(new com.tencent.mm.plugin.appbrand.menu.i0());
    }

    @Override // gm0.i2
    public void kh(int i17) {
        java.util.Iterator it = ((java.util.ArrayList) this.f275195d).iterator();
        while (it.hasNext()) {
            c01.i8 i8Var = (c01.i8) it.next();
            if (i8Var.b(i17)) {
                java.lang.System.currentTimeMillis();
                i8Var.c(i17);
                java.lang.System.currentTimeMillis();
                i8Var.a();
            }
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }
}
