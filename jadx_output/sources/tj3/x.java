package tj3;

/* loaded from: classes8.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final sj3.g3 f419802a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.a f419803b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f419804c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f419805d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f419806e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f419807f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f419808g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f419809h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f419810i;

    public x(sj3.g3 multiTalkNewTalkingUILogic) {
        kotlin.jvm.internal.o.g(multiTalkNewTalkingUILogic, "multiTalkNewTalkingUILogic");
        this.f419802a = multiTalkNewTalkingUILogic;
        this.f419803b = tj3.v.f419800d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f419804c = arrayList;
        this.f419805d = arrayList;
        this.f419808g = jz5.h.b(tj3.w.f419801d);
        this.f419809h = new java.util.ArrayList();
    }

    public final void a(java.util.Set visibleUser, java.lang.String str) {
        kotlin.jvm.internal.o.g(visibleUser, "visibleUser");
        java.util.List list = this.f419805d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            com.tencent.mm.plugin.multitalk.ui.t tVar = (com.tencent.mm.plugin.multitalk.ui.t) next;
            if (tVar.f150299d || tVar.a()) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((com.tencent.mm.plugin.multitalk.ui.t) it6.next()).f150297b);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList2) {
            java.lang.String str2 = (java.lang.String) obj;
            if (visibleUser.contains(str2) && !kotlin.jvm.internal.o.b(str2, (java.lang.String) ((jz5.n) this.f419808g).getValue())) {
                arrayList3.add(obj);
            }
        }
        int size = arrayList3.size();
        java.util.List list2 = this.f419809h;
        if (size == ((java.util.ArrayList) list2).size() && kotlin.jvm.internal.o.b(str, this.f419810i) && !this.f419807f) {
            boolean z17 = !kotlin.jvm.internal.o.b(str, this.f419810i);
            if (!z17) {
                java.util.Iterator it7 = arrayList3.iterator();
                while (it7.hasNext()) {
                    if (!((java.util.ArrayList) list2).contains((java.lang.String) it7.next())) {
                        z17 = true;
                    }
                }
            }
            if (!z17) {
                return;
            }
        }
        this.f419810i = str;
        ((java.util.ArrayList) list2).clear();
        ((java.util.ArrayList) list2).addAll(arrayList3);
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAvatarLayoutAdapter", "onVisibleUserChanged: visibleUser " + visibleUser + ", videoUser " + arrayList3 + ", " + str + ", forceRefresh " + this.f419807f);
        this.f419807f = false;
        if (kz5.n0.O(arrayList3, str)) {
            com.tencent.mm.plugin.multitalk.model.v0 Ri = com.tencent.mm.plugin.multitalk.model.e3.Ri();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList3) {
                if (!kotlin.jvm.internal.o.b((java.lang.String) obj2, str)) {
                    arrayList4.add(obj2);
                }
            }
            Ri.Y(kz5.n0.X0(arrayList4), str);
            return;
        }
        com.tencent.mm.plugin.multitalk.model.v0 Ri2 = com.tencent.mm.plugin.multitalk.model.e3.Ri();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj3 : arrayList3) {
            if (!kotlin.jvm.internal.o.b((java.lang.String) obj3, str)) {
                arrayList5.add(obj3);
            }
        }
        Ri2.Y(kz5.n0.X0(arrayList5), "");
    }
}
