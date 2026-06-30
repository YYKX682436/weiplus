package nu4;

/* loaded from: classes7.dex */
public final class b extends com.tencent.mm.vfs.r6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String path) {
        super(com.tencent.mm.vfs.z7.a(path));
        kotlin.jvm.internal.o.g(path, "path");
    }

    public final boolean O(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        return com.tencent.mm.vfs.w6.j(u() + '/' + id6);
    }

    public final com.tencent.mm.vfs.r6 Q(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        if (!com.tencent.mm.vfs.w6.j(u())) {
            com.tencent.mm.vfs.w6.u(u());
        }
        return new com.tencent.mm.vfs.r6(u() + '/' + id6);
    }
}
