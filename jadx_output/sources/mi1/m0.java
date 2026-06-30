package mi1;

/* loaded from: classes7.dex */
public final class m0 implements kotlinx.coroutines.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f326618d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f326619e = new android.util.SparseArray();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f326620f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public mi1.j0 f326621g;

    /* renamed from: h, reason: collision with root package name */
    public kotlinx.coroutines.r2 f326622h;

    public void a(mi1.g2 consume) {
        kotlin.jvm.internal.o.g(consume, "consume");
        java.util.Iterator it = consume.c().iterator();
        while (it.hasNext()) {
            this.f326619e.put(((java.lang.Number) it.next()).intValue(), consume);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mi1.m0.b():void");
    }

    public void c(mi1.j0 event) {
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enqueue eventType ");
        int i17 = event.f326585a;
        sb6.append(i17);
        sb6.append(" priority ");
        sb6.append(event.f326587c);
        sb6.append(" type ");
        sb6.append(event.f326589e);
        sb6.append("  targetState ");
        sb6.append(event.f326586b);
        com.tencent.mars.xlog.Log.i("CapsuleAnimatorEventDispatcher", sb6.toString());
        if (this.f326619e.get(i17) == null) {
            com.tencent.mars.xlog.Log.i("CapsuleAnimatorEventDispatcher", "enqueue but no consumer,ignore");
        } else {
            ik1.h0.b(new mi1.l0(event, this));
        }
    }

    public final boolean d(java.util.LinkedList linkedList, mi1.j0 j0Var) {
        if (!mi1.p0.a(j0Var, (mi1.j0) linkedList.peekFirst())) {
            return false;
        }
        if (!linkedList.isEmpty()) {
            java.util.Iterator it = linkedList.iterator();
            java.util.LinkedList linkedList2 = null;
            while (it.hasNext()) {
                mi1.j0 j0Var2 = (mi1.j0) it.next();
                if (j0Var2.f326587c != j0Var.f326587c) {
                    if (linkedList2 == null) {
                        linkedList2 = new java.util.LinkedList();
                    }
                    linkedList2.add(j0Var2);
                }
            }
            if (linkedList2 != null) {
                linkedList.removeAll(linkedList2);
            }
        }
        linkedList.addLast(j0Var);
        return true;
    }

    public final void e(mi1.j0 j0Var, mi1.j0 j0Var2) {
        this.f326621g = null;
        if (j0Var.f326585a != 1) {
            this.f326618d.remove(j0Var);
        }
        j0Var.f326592h = 4;
        android.util.SparseArray sparseArray = this.f326619e;
        mi1.g2 g2Var = (mi1.g2) sparseArray.get(j0Var.f326585a);
        if (g2Var != null && g2Var.d(j0Var) && g2Var.isShow()) {
            this.f326621g = j0Var;
            com.tencent.mars.xlog.Log.i("CapsuleAnimatorEventDispatcher", "adjustCurrentEvent currentEvent " + this.f326621g);
        }
        if (j0Var2 != null) {
            j0Var2.f326592h = 4;
            mi1.g2 g2Var2 = (mi1.g2) sparseArray.get(j0Var2.f326585a);
            if (g2Var2 != null && g2Var2.d(j0Var2) && g2Var2.isShow()) {
                this.f326621g = j0Var2;
                com.tencent.mars.xlog.Log.i("CapsuleAnimatorEventDispatcher", "adjustCurrentEvent stay last currentEvent " + this.f326621g);
            }
        }
        b();
    }

    @Override // kotlinx.coroutines.y0
    public oz5.l getCoroutineContext() {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        kotlinx.coroutines.r2 r2Var = this.f326622h;
        if (r2Var == null) {
            r2Var = kotlinx.coroutines.t3.a(null, 1, null);
        }
        this.f326622h = r2Var;
        return g3Var.plus(r2Var);
    }
}
