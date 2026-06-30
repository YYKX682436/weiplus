package zn4;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final zn4.a f474492a = new zn4.a();

    public final java.lang.Object a(java.lang.Object obj) {
        com.tencent.mm.protobuf.g gVar = null;
        if (obj != null) {
            if (obj instanceof java.lang.String ? true : obj instanceof java.lang.Integer ? true : obj instanceof java.lang.Float ? true : obj instanceof java.lang.Long ? true : obj instanceof java.lang.Double ? true : obj instanceof java.lang.Boolean) {
                return obj;
            }
            if (!(obj instanceof com.tencent.mm.protobuf.g)) {
                if (obj instanceof e14.k) {
                    return ((e14.k) obj).deepCopy();
                }
                if (!(obj instanceof java.util.LinkedList)) {
                    throw new java.lang.IllegalArgumentException("不支持的类型: " + obj);
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                for (java.lang.Object obj2 : (java.util.LinkedList) obj) {
                    if (obj2 == null) {
                        linkedList.add(null);
                    } else if (obj2 instanceof java.lang.String ? true : obj2 instanceof java.lang.Integer ? true : obj2 instanceof java.lang.Float ? true : obj2 instanceof java.lang.Long ? true : obj2 instanceof java.lang.Double ? true : obj2 instanceof java.lang.Boolean) {
                        linkedList.add(obj2);
                    } else {
                        linkedList.add(f474492a.a(obj2));
                    }
                }
                return linkedList;
            }
            byte[] g17 = ((com.tencent.mm.protobuf.g) obj).g();
            gVar = new com.tencent.mm.protobuf.g(g17, 0, g17.length);
        }
        return gVar;
    }
}
