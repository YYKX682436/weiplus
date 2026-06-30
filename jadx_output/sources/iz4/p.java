package iz4;

/* loaded from: classes12.dex */
public final class p extends iz4.o {

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f296136t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public sz4.t f296137u;

    @Override // iz4.c
    public int d() {
        return 7;
    }

    @Override // iz4.c
    public void e() {
        super.e();
        this.f296137u = null;
    }

    @Override // iz4.o
    public java.lang.String f() {
        java.util.LinkedList linkedList = this.f296136t;
        if (linkedList.size() <= 0) {
            java.lang.String str = this.f296131o;
            kotlin.jvm.internal.o.f(str, "getMaxLocalEditorId(...)");
            return str;
        }
        java.lang.Object last = linkedList.getLast();
        iz4.o oVar = last instanceof iz4.o ? (iz4.o) last : null;
        java.lang.String str2 = oVar != null ? oVar.f296131o : null;
        if (str2 != null) {
            return str2;
        }
        java.lang.String str3 = this.f296131o;
        kotlin.jvm.internal.o.f(str3, "getMaxLocalEditorId(...)");
        return str3;
    }

    public final void g(iz4.c item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f296136t.add(item);
    }

    public final iz4.p h(nz4.h hVar) {
        int i17;
        iz4.p pVar = new iz4.p();
        java.util.LinkedList linkedList = this.f296136t;
        if (hVar != null && (i17 = hVar.f341619a) == hVar.f341621c && i17 == a()) {
            int i18 = hVar.f341622d;
            for (int i19 = hVar.f341620b; i19 < i18; i19++) {
                java.lang.Object obj = linkedList.get(i19);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                iz4.c a17 = qz4.c.a((iz4.c) obj, null);
                kotlin.jvm.internal.o.f(a17, "cloneDataItem(...)");
                pVar.g(a17);
            }
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(qz4.c.a((iz4.c) it.next(), null));
            }
            pVar.f296136t.addAll(arrayList);
        }
        return pVar;
    }

    public final java.lang.String i() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<div>");
        for (iz4.c cVar : this.f296136t) {
            if (cVar instanceof iz4.o) {
                iz4.o item = (iz4.o) cVar;
                kotlin.jvm.internal.o.g(item, "item");
                java.lang.String str = item.f296131o;
                java.lang.String format = java.lang.String.format("<object data-type=\"%d\" id=\"%s\" name=\"%s\" class=\"item item-\"></object>", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(item.f296133q), str, str}, 3));
                kotlin.jvm.internal.o.f(format, "format(...)");
                sb6.append(format);
            }
        }
        sb6.append("</div>");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final int j() {
        return this.f296136t.size();
    }
}
