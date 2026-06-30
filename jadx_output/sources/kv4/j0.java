package kv4;

/* loaded from: classes5.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv4.l0 f312705d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(kv4.l0 l0Var) {
        super(1);
        this.f312705d = l0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        e06.k range = (e06.k) obj;
        kotlin.jvm.internal.o.g(range, "range");
        kv4.l0 l0Var = this.f312705d;
        java.util.List list = l0Var.f312711b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (((rv4.c0) ((mv4.j) obj2)).b()) {
                arrayList.add(obj2);
            }
        }
        int i17 = range.f246209d;
        if (i17 < 0) {
            i17 = 0;
        }
        int i18 = range.f246210e;
        int size = i18 < 0 ? arrayList.size() : i18 + 1;
        int size2 = arrayList.size();
        java.util.List list2 = l0Var.f312711b;
        if (i17 >= size2 || size > arrayList.size()) {
            com.tencent.mars.xlog.Log.e("[FTSNativeGlobalTeach] FTSTeachVerticalEntryViewItem", "expose check skip total:" + list2.size() + " visible:" + arrayList.size() + " start:" + i17 + " end:" + size);
        } else {
            list2.size();
            arrayList.size();
            java.util.Iterator it = arrayList.subList(i17, size).iterator();
            while (it.hasNext()) {
                ((rv4.c0) ((mv4.j) it.next())).w();
            }
        }
        return jz5.f0.f302826a;
    }
}
