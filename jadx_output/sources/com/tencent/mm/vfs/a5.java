package com.tencent.mm.vfs;

/* loaded from: classes10.dex */
public final class a5 implements com.tencent.mm.vfs.v5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.vfs.a5 f212782a = new com.tencent.mm.vfs.a5();

    @Override // com.tencent.mm.vfs.v5
    public void a(java.lang.String id6, com.tencent.mm.vfs.FileSystem fs6, int i17, java.util.Map p17) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(fs6, "fs");
        kotlin.jvm.internal.o.g(p17, "p");
        java.lang.Object obj = p17.get("emptyRef");
        java.lang.Object obj2 = p17.get("overRef");
        java.lang.Object obj3 = p17.get("underRef");
        if (kotlin.jvm.internal.o.b(obj, 0) && kotlin.jvm.internal.o.b(obj2, 0) && kotlin.jvm.internal.o.b(obj3, 0)) {
            return;
        }
        com.tencent.stubs.logger.Log.i("VFS.RefCounted", "RefCounted maintenance, emptyRef: " + obj + ", overRef: " + obj2 + ", underRef: " + obj3);
        jx3.f.INSTANCE.d(21019, 0, obj, 65701, "", id6, obj2, "", "", obj3);
    }
}
