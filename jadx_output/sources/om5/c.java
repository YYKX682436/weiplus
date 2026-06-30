package om5;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final om5.c f346467d = new om5.c();

    public c() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.vfs.f6 storage = (com.tencent.mm.vfs.f6) obj;
        kotlin.jvm.internal.o.g(storage, "$this$storage");
        storage.f212926b = "ecs/temp_files";
        com.tencent.mm.vfs.f6.g(storage, 256 * 1048576, 7 * 86400000, null, 4, null);
        storage.f212929e = java.lang.Boolean.TRUE;
        return jz5.f0.f302826a;
    }
}
