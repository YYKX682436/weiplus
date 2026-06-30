package om5;

/* loaded from: classes10.dex */
public final class v7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final om5.v7 f346684d = new om5.v7();

    public v7() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.vfs.f6 storage = (com.tencent.mm.vfs.f6) obj;
        kotlin.jvm.internal.o.g(storage, "$this$storage");
        jz5.l lVar = new jz5.l[]{new jz5.l("noStrip", "")}[0];
        java.lang.Object obj2 = lVar.f302834e;
        boolean z17 = obj2 instanceof java.lang.String;
        java.util.HashMap hashMap = storage.f212935k;
        java.lang.Object obj3 = lVar.f302833d;
        if (z17 || !(obj2 instanceof java.lang.Object[])) {
            hashMap.put(obj3, obj2.toString());
        } else {
            hashMap.put(obj3, obj2);
        }
        storage.f212934j = om5.u7.f346673d;
        return jz5.f0.f302826a;
    }
}
