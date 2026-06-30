package om5;

/* loaded from: classes10.dex */
public final class l5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.io.File f346572d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(java.io.File file) {
        super(1);
        this.f346572d = file;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.vfs.f6 storage = (com.tencent.mm.vfs.f6) obj;
        kotlin.jvm.internal.o.g(storage, "$this$storage");
        java.lang.String name = this.f346572d.getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        storage.f212926b = name;
        storage.j("${data}/${dir}");
        return jz5.f0.f302826a;
    }
}
