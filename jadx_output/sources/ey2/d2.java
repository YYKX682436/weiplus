package ey2;

/* loaded from: classes2.dex */
public final class d2 {
    public d2(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(com.tencent.mm.plugin.finder.feed.ys item) {
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(item.f111192d.getLong(0));
        sb6.append('_');
        java.util.LinkedList list = item.f111192d.getList(4);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) kz5.n0.Z(list);
        sb6.append(finderObject != null ? java.lang.Long.valueOf(finderObject.getId()) : null);
        sb6.append('_');
        java.util.LinkedList list2 = item.f111192d.getList(4);
        kotlin.jvm.internal.o.f(list2, "getObject(...)");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) kz5.n0.k0(list2);
        sb6.append(finderObject2 != null ? java.lang.Long.valueOf(finderObject2.getId()) : null);
        return sb6.toString();
    }
}
