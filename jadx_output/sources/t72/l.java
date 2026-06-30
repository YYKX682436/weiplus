package t72;

/* loaded from: classes4.dex */
public final class l extends jm0.g implements o72.z4 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f416072g = com.tencent.mm.sdk.platformtools.o4.M("fav_tags_service");

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f416073f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
        this.f416073f = jz5.h.b(new t72.k(service));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0118 A[LOOP:0: B:13:0x0116->B:14:0x0118, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object T6(java.util.List r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t72.l.T6(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void U6(java.util.List list, yz5.l callback) {
        kotlin.jvm.internal.o.g(list, "list");
        kotlin.jvm.internal.o.g(callback, "callback");
        v65.i.b(Y6(), null, new t72.d(this, list, callback, null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c9 A[LOOP:0: B:14:0x00c3->B:16:0x00c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object V6(java.util.List r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t72.l.V6(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public java.lang.Object W6(java.util.List list, kotlin.coroutines.Continuation continuation) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            t72.a f17 = t72.b.f416040a.f((java.lang.String) it.next());
            if (f17 != null) {
                linkedList.add(new java.lang.Integer(f17.field_id));
            }
        }
        return V6(linkedList, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object X6(java.util.List r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t72.l.X6(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.tencent.mm.sdk.coroutines.LifecycleScope Y6() {
        return (com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) this.f416073f).getValue();
    }
}
