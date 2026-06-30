package ed2;

/* loaded from: classes2.dex */
public final class m extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: f, reason: collision with root package name */
    public static final ed2.l f251276f = new ed2.l(null);

    /* renamed from: d, reason: collision with root package name */
    public boolean f251277d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f251278e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f251277d = true;
        this.f251278e = new java.util.concurrent.ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean O6(ed2.j r13) {
        /*
            r12 = this;
            r0 = 1
            if (r13 != 0) goto L4
            return r0
        L4:
            boolean r1 = r12.f251277d
            if (r1 != 0) goto L9
            return r0
        L9:
            java.util.concurrent.ConcurrentHashMap r1 = r12.f251278e
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L9d
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L8e
            java.lang.Object r5 = r3.getKey()
            ed2.j r5 = (ed2.j) r5
            r5.getClass()
            java.lang.String r6 = r5.f251271a
            java.lang.String r7 = r13.f251271a
            boolean r6 = kotlin.jvm.internal.o.b(r6, r7)
            if (r6 == 0) goto L45
            goto L8a
        L45:
            ed2.k r6 = ed2.k.f251275a
            long r6 = r13.f251272b
            r8 = 0
            long r10 = r6 & r8
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 != 0) goto L5b
            long r10 = r5.f251272b
            long r6 = r6 & r10
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L59
            goto L5b
        L59:
            r6 = r4
            goto L5c
        L5b:
            r6 = r0
        L5c:
            if (r6 == 0) goto L8a
            java.lang.String r6 = r5.f251274d
            java.lang.String r7 = "global_scope"
            boolean r8 = kotlin.jvm.internal.o.b(r6, r7)
            if (r8 != 0) goto L79
            java.lang.String r8 = r13.f251274d
            boolean r7 = kotlin.jvm.internal.o.b(r8, r7)
            if (r7 != 0) goto L79
            boolean r6 = kotlin.jvm.internal.o.b(r6, r8)
            if (r6 == 0) goto L77
            goto L79
        L77:
            r6 = r4
            goto L7a
        L79:
            r6 = r0
        L7a:
            if (r6 == 0) goto L8a
            int r5 = r5.f251273c
            int r6 = r13.f251273c
            r5 = r5 & r6
            if (r5 == 0) goto L85
            r5 = r0
            goto L86
        L85:
            r5 = r4
        L86:
            if (r5 == 0) goto L8a
            r5 = r0
            goto L8b
        L8a:
            r5 = r4
        L8b:
            if (r5 == 0) goto L8e
            r4 = r0
        L8e:
            if (r4 == 0) goto L18
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            r2.put(r4, r3)
            goto L18
        L9d:
            boolean r1 = r2.isEmpty()
            r1 = r1 ^ r0
            java.lang.String r3 = "Bubble "
            java.lang.String r5 = "FinderBubbleVisibilityManager"
            if (r1 == 0) goto Lc0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r13)
            java.lang.String r13 = " conflicts with "
            r0.append(r13)
            r0.append(r2)
            java.lang.String r13 = r0.toString()
            com.tencent.mars.xlog.Log.w(r5, r13)
            return r4
        Lc0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r13)
            java.lang.String r13 = " canShow=true"
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            com.tencent.mars.xlog.Log.i(r5, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ed2.m.O6(ed2.j):boolean");
    }

    public final void P6(ed2.j jVar, boolean z17) {
        if (jVar != null && this.f251277d) {
            this.f251278e.put(jVar, java.lang.Boolean.valueOf(z17));
            com.tencent.mars.xlog.Log.i("FinderBubbleVisibilityManager", "Bubble " + jVar + " visibility: " + z17);
        }
    }

    @Override // pf5.o, pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        this.f251278e.clear();
        com.tencent.mars.xlog.Log.i("FinderBubbleVisibilityManager", "Cleared all bubble states");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f251277d = true;
        this.f251278e = new java.util.concurrent.ConcurrentHashMap();
    }
}
