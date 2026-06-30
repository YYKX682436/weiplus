package com.tencent.mm.protobuf;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.k f192151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f192152e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.protobuf.k kVar, java.util.LinkedList linkedList) {
        super(3);
        this.f192151d = kVar;
        this.f192152e = linkedList;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object k17, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.reflect.Constructor constructor;
        ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(k17, "k");
        java.lang.Class cls = this.f192151d.f192164e;
        java.lang.Object newInstance = (cls == null || (constructor = cls.getConstructor(new java.lang.Class[0])) == null) ? null : constructor.newInstance(new java.lang.Object[0]);
        com.tencent.mm.protobuf.e eVar = newInstance instanceof com.tencent.mm.protobuf.e ? (com.tencent.mm.protobuf.e) newInstance : null;
        if (eVar != null) {
            eVar.set(0, k17);
            eVar.set(1, obj);
            java.util.LinkedList linkedList = this.f192152e;
            java.util.Iterator it = linkedList.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (kotlin.jvm.internal.o.b(((com.tencent.mm.protobuf.e) it.next()).getOrDefault(0), k17)) {
                    break;
                }
                i17++;
            }
            if (i17 != -1) {
                linkedList.remove(i17);
            }
            linkedList.add(eVar);
        }
        return jz5.f0.f302826a;
    }
}
