package s23;

/* loaded from: classes4.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final s23.m f402308d = new s23.m();

    public m() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int h17 = s23.n.f402309d.h();
        com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandleNew", "updateAlbumUISelectLimit: newLimit:" + h17);
        if (h17 > 0) {
            java.util.Iterator it = s23.n.f402311f.iterator();
            while (it.hasNext()) {
                ((s23.o) it.next()).b(h17);
            }
        }
        return jz5.f0.f302826a;
    }
}
