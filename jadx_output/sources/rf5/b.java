package rf5;

/* loaded from: classes10.dex */
public interface b extends pf5.g, bm5.s0 {
    default void J0(com.tencent.mm.ui.MMFragmentActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        rf5.a aVar = (rf5.a) pf5.z.f353948a.a(activity).a(rf5.a.class);
        aVar.getClass();
        java.lang.String tag = getTag();
        java.util.HashMap hashMap = aVar.f395132d;
        if (hashMap.containsKey(tag)) {
            java.util.LinkedList linkedList = (java.util.LinkedList) hashMap.get(getTag());
            if (linkedList != null) {
                linkedList.add(this);
                return;
            }
            return;
        }
        java.lang.String tag2 = getTag();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.add(this);
        hashMap.put(tag2, linkedList2);
    }

    default void x8(com.tencent.mm.ui.MMFragmentActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        rf5.a aVar = (rf5.a) pf5.z.f353948a.a(activity).a(rf5.a.class);
        aVar.getClass();
        java.lang.String tag = getTag();
        java.util.HashMap hashMap = aVar.f395132d;
        java.util.LinkedList linkedList = (java.util.LinkedList) hashMap.get(tag);
        if (linkedList != null) {
            linkedList.remove(this);
            if (linkedList.isEmpty()) {
                hashMap.remove(getTag());
            }
        }
    }
}
