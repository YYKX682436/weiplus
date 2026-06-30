package wh;

/* loaded from: classes10.dex */
public final class y {
    public y(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(java.lang.String stackTrace, int i17) {
        java.util.Collection collection;
        kotlin.jvm.internal.o.g(stackTrace, "stackTrace");
        java.util.List g17 = new r26.t("\n").g(stackTrace, 0);
        if (!g17.isEmpty()) {
            java.util.ListIterator listIterator = g17.listIterator(g17.size());
            while (listIterator.hasPrevious()) {
                if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                    collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = kz5.p0.f313996d;
        java.util.ArrayList arrayList = (java.util.ArrayList) kz5.n0.V0(collection);
        int size = arrayList.size();
        if (size <= i17) {
            i17 = size;
        }
        java.util.List<java.lang.String> subList = arrayList.subList(0, i17);
        if ((subList instanceof java.util.Collection) && subList.isEmpty()) {
            return false;
        }
        for (java.lang.String str : subList) {
            if (str == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            java.lang.String obj = r26.n0.u0(str).toString();
            jz5.g gVar = wh.j0.f445806e;
            if (((r26.t) wh.j0.f445806e.getValue()).e(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(java.lang.String stackTrace, int i17) {
        java.util.Collection collection;
        kotlin.jvm.internal.o.g(stackTrace, "stackTrace");
        java.util.List g17 = new r26.t("\n").g(stackTrace, 0);
        if (!g17.isEmpty()) {
            java.util.ListIterator listIterator = g17.listIterator(g17.size());
            while (listIterator.hasPrevious()) {
                if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                    collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = kz5.p0.f313996d;
        java.util.ArrayList arrayList = (java.util.ArrayList) kz5.n0.V0(collection);
        int size = arrayList.size();
        if (size <= i17) {
            i17 = size;
        }
        java.util.List<java.lang.String> subList = arrayList.subList(0, i17);
        if ((subList instanceof java.util.Collection) && subList.isEmpty()) {
            return false;
        }
        for (java.lang.String str : subList) {
            if (str == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            java.lang.String obj = r26.n0.u0(str).toString();
            jz5.g gVar = wh.j0.f445806e;
            if (((r26.t) wh.j0.f445807f.getValue()).e(obj)) {
                return true;
            }
        }
        return false;
    }
}
