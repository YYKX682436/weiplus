package vq;

/* loaded from: classes4.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final vq.u f439226d = new vq.u();

    public u() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        f21.g b17 = rr.t.b(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a("/sdcard/temp/egg.xml")));
        if (b17 != null) {
            f21.g K = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).K();
            K.f258899e = b17.f258899e;
            java.util.LinkedList linkedList = K.f258898d;
            linkedList.clear();
            java.util.Iterator it = b17.f258898d.iterator();
            while (it.hasNext()) {
                f21.e eVar = (f21.e) it.next();
                if (eVar.f258878n <= 13) {
                    linkedList.add(eVar);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
