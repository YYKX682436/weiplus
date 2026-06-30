package l01;

/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f314784a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f314785b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f314786c = new java.util.HashMap();

    public p(com.tencent.mm.sdk.platformtools.n3 n3Var, l01.c cVar) {
        this.f314784a = n3Var;
    }

    public void a(java.lang.String str, l01.o oVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || oVar == null) {
            return;
        }
        java.util.Map map = this.f314785b;
        java.util.List list = (java.util.List) ((java.util.HashMap) map).get(str);
        if (list == null) {
            list = new java.util.LinkedList();
            ((java.util.HashMap) map).put(str, list);
        }
        list.add(oVar);
    }

    public void b(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.util.List list = (java.util.List) ((java.util.HashMap) this.f314785b).remove(str);
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((l01.o) it.next()).b();
        }
        list.clear();
    }

    public void c(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.util.List list = (java.util.List) ((java.util.HashMap) this.f314785b).remove(str);
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((l01.o) it.next()).a();
        }
    }

    public boolean d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        return ((java.util.HashMap) this.f314786c).containsKey(str);
    }

    public void e(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        ((java.util.HashMap) this.f314786c).remove(str);
    }
}
