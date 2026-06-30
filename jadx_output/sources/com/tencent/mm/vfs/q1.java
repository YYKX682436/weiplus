package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class q1 implements com.tencent.mm.vfs.v5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.vfs.q1 f213134a = new com.tencent.mm.vfs.q1();

    @Override // com.tencent.mm.vfs.v5
    public void a(java.lang.String id6, com.tencent.mm.vfs.FileSystem fs6, int i17, java.util.Map p17) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(fs6, "fs");
        kotlin.jvm.internal.o.g(p17, "p");
        java.lang.Object obj = p17.get("deleteFiles");
        java.lang.Object obj2 = p17.get("deleteSize");
        com.tencent.mm.vfs.e7 e7Var = com.tencent.mm.vfs.e7.f212911a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.vfs.e7.f212916f;
        com.tencent.stubs.logger.Log.i("VFS.Expire", "[" + id6 + "] deleted count: " + obj + ", size: " + obj2);
        if (!concurrentHashMap.containsKey(id6) || (arrayList = (java.util.ArrayList) concurrentHashMap.get(id6)) == null) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.vfs.n1 n1Var = (com.tencent.mm.vfs.n1) it.next();
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((java.lang.Integer) obj).intValue();
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
            n1Var.a(id6, intValue, ((java.lang.Long) obj2).longValue());
        }
    }
}
