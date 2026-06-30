package sj3;

/* loaded from: classes8.dex */
public final class j2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.g3 f408599d;

    public j2(sj3.g3 g3Var) {
        this.f408599d = g3Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Object obj2;
        java.util.List list = (java.util.List) obj;
        tj3.x xVar = this.f408599d.f408533n;
        kotlin.jvm.internal.o.d(list);
        xVar.getClass();
        int size = list.size();
        java.util.List list2 = xVar.f419804c;
        java.util.ArrayList arrayList = (java.util.ArrayList) list2;
        if (size != arrayList.size()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAvatarLayoutAdapter", "response list change");
            arrayList.clear();
            arrayList.addAll(list);
            if (xVar.f419806e) {
                xVar.f419807f = true;
                xVar.f419806e = false;
            }
            xVar.f419803b.invoke();
            return;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj2 = it.next();
                if (((com.tencent.mm.plugin.multitalk.ui.t) obj2).a()) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        boolean z17 = obj2 != null;
        int size2 = list.size();
        for (int i17 = 0; i17 < size2; i17++) {
            if (!kotlin.jvm.internal.o.b(kz5.n0.a0(list2, i17), list.get(i17))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAvatarLayoutAdapter", "response list change");
                java.util.ArrayList arrayList2 = (java.util.ArrayList) list2;
                arrayList2.clear();
                arrayList2.addAll(list);
                if (z17 != xVar.f419806e) {
                    xVar.f419807f = true;
                    xVar.f419806e = z17;
                }
                xVar.f419803b.invoke();
                return;
            }
        }
    }
}
