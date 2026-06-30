package om5;

/* loaded from: classes10.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final om5.p f346610d = new om5.p();

    public p() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.vfs.f6 storage = (com.tencent.mm.vfs.f6) obj;
        kotlin.jvm.internal.o.g(storage, "$this$storage");
        storage.f212926b = "files/mmkv";
        storage.j("${data}/${dir}");
        return jz5.f0.f302826a;
    }
}
