package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class n6 implements com.tencent.mm.vfs.v5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.vfs.n6 f213095a = new com.tencent.mm.vfs.n6();

    @Override // com.tencent.mm.vfs.v5
    public void a(java.lang.String id6, com.tencent.mm.vfs.FileSystem fs6, int i17, java.util.Map p17) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(fs6, "fs");
        kotlin.jvm.internal.o.g(p17, "p");
        java.lang.Object obj = p17.get("fileCount");
        java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        int intValue = num != null ? num.intValue() : 0;
        if (intValue <= 0) {
            return;
        }
        java.lang.String concat = "@SDCardRemain-".concat(id6);
        java.lang.String concat2 = "@SDCardRemain-".concat(id6);
        java.lang.Object obj2 = p17.get("totalSize");
        java.lang.Long l17 = obj2 instanceof java.lang.Long ? (java.lang.Long) obj2 : null;
        long longValue = l17 != null ? l17.longValue() : 0L;
        java.lang.Object obj3 = p17.get("dirCount");
        java.lang.Integer num2 = obj3 instanceof java.lang.Integer ? (java.lang.Integer) obj3 : null;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        java.lang.Object obj4 = p17.get("maxDepth");
        java.lang.Integer num3 = obj4 instanceof java.lang.Integer ? (java.lang.Integer) obj4 : null;
        int intValue3 = num3 != null ? num3.intValue() : 0;
        java.lang.Object obj5 = p17.get("maxFileSize");
        java.lang.Long l18 = obj5 instanceof java.lang.Long ? (java.lang.Long) obj5 : null;
        long longValue2 = l18 != null ? l18.longValue() : 0L;
        java.lang.Object obj6 = p17.get("averageAge");
        java.lang.Long l19 = obj6 instanceof java.lang.Long ? (java.lang.Long) obj6 : null;
        com.tencent.mm.vfs.c1.g(concat, new com.tencent.mm.vfs.a1(concat2, 0, 0, id6, longValue, intValue, intValue2, intValue3, longValue2, l19 != null ? l19.longValue() : 0L, 0L, 0L));
    }
}
