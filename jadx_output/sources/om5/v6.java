package om5;

/* loaded from: classes10.dex */
public final class v6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final om5.v6 f346683d = new om5.v6();

    public v6() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.vfs.f6 storage = (com.tencent.mm.vfs.f6) obj;
        kotlin.jvm.internal.o.g(storage, "$this$storage");
        storage.f212926b = "files/xlog";
        storage.j("${data}/${dir}");
        storage.f212930f = java.lang.Boolean.TRUE;
        storage.c(10 * 86400000);
        return jz5.f0.f302826a;
    }
}
