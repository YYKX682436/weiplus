package ou4;

/* loaded from: classes8.dex */
public final class s implements ou4.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f349017a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f349018b;

    /* renamed from: c, reason: collision with root package name */
    public final ou4.o f349019c;

    /* renamed from: d, reason: collision with root package name */
    public final ou4.t f349020d;

    /* renamed from: e, reason: collision with root package name */
    public final ou4.x f349021e;

    /* renamed from: f, reason: collision with root package name */
    public pi0.l1 f349022f;

    /* renamed from: g, reason: collision with root package name */
    public pi0.n1 f349023g;

    /* renamed from: h, reason: collision with root package name */
    public final ou4.j f349024h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f349025i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f349026j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f349027k;

    public s(java.lang.String containerId, java.lang.String businessId, ou4.o businessConfig, ou4.t containerConfig, ou4.x manager) {
        kotlin.jvm.internal.o.g(containerId, "containerId");
        kotlin.jvm.internal.o.g(businessId, "businessId");
        kotlin.jvm.internal.o.g(businessConfig, "businessConfig");
        kotlin.jvm.internal.o.g(containerConfig, "containerConfig");
        kotlin.jvm.internal.o.g(manager, "manager");
        this.f349017a = containerId;
        this.f349018b = businessId;
        this.f349019c = businessConfig;
        this.f349020d = containerConfig;
        this.f349021e = manager;
        this.f349024h = new ou4.j(containerId);
        this.f349025i = new java.util.ArrayList();
    }

    public void a(java.util.List plugins) {
        kotlin.jvm.internal.o.g(plugins, "plugins");
        if (this.f349027k) {
            return;
        }
        pi0.l1 l1Var = this.f349022f;
        if (l1Var != null) {
            l1Var.a(plugins);
        } else {
            ((java.util.ArrayList) this.f349025i).addAll(plugins);
        }
    }

    public final void b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createFlutterInstance: businessId=");
        sb6.append(this.f349018b);
        sb6.append(", plugin=");
        ou4.o oVar = this.f349019c;
        sb6.append(oVar.f348999b);
        com.tencent.mars.xlog.Log.i("FlutterContainer", sb6.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f349024h);
        java.util.List list = this.f349020d.f349030c;
        if (list == null) {
            list = oVar.f349001d;
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        java.util.List list2 = this.f349025i;
        if (!list2.isEmpty()) {
            arrayList.addAll(list2);
            ((java.util.ArrayList) list2).clear();
        }
        pi0.q Ui = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui();
        java.lang.String str = oVar.f348999b;
        java.lang.String str2 = oVar.f349000c;
        if (str2 == null) {
            str2 = "home";
        }
        this.f349022f = new pi0.l1(Ui, str, arrayList, false, str2);
        com.tencent.mars.xlog.Log.i("FlutterContainer", "createFlutterInstance: success, pluginCount=" + arrayList.size());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.lang.String r8, java.util.Map r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ou4.p
            if (r0 == 0) goto L13
            r0 = r10
            ou4.p r0 = (ou4.p) r0
            int r1 = r0.f349008g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f349008g = r1
            goto L18
        L13:
            ou4.p r0 = new ou4.p
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f349006e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f349008g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r8 = r0.f349005d
            ou4.s r8 = (ou4.s) r8
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L2e
            goto Ldb
        L2e:
            r9 = move-exception
            goto Lc2
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.ResultKt.throwOnFailure(r10)
            boolean r10 = r7.f349027k
            if (r10 != 0) goto Ldb
            boolean r10 = r7.f349026j
            if (r10 != 0) goto L46
            goto Ldb
        L46:
            pi0.l1 r10 = r7.f349022f     // Catch: java.lang.Exception -> Lc0
            if (r10 == 0) goto Ldb
            if (r9 == 0) goto Lb4
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> Lc0
            r2.<init>()     // Catch: java.lang.Exception -> Lc0
            java.util.Set r9 = r9.entrySet()     // Catch: java.lang.Exception -> Lc0
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Exception -> Lc0
        L59:
            boolean r5 = r9.hasNext()     // Catch: java.lang.Exception -> Lc0
            if (r5 == 0) goto L7c
            java.lang.Object r5 = r9.next()     // Catch: java.lang.Exception -> Lc0
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Exception -> Lc0
            java.lang.Object r6 = r5.getValue()     // Catch: java.lang.Exception -> Lc0
            if (r6 == 0) goto L6d
            r6 = r4
            goto L6e
        L6d:
            r6 = 0
        L6e:
            if (r6 == 0) goto L59
            java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Exception -> Lc0
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Exception -> Lc0
            r2.put(r6, r5)     // Catch: java.lang.Exception -> Lc0
            goto L59
        L7c:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> Lc0
            int r5 = r2.size()     // Catch: java.lang.Exception -> Lc0
            int r5 = kz5.b1.d(r5)     // Catch: java.lang.Exception -> Lc0
            r9.<init>(r5)     // Catch: java.lang.Exception -> Lc0
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Exception -> Lc0
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> Lc0
        L91:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Exception -> Lc0
            if (r5 == 0) goto Laf
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Exception -> Lc0
            r6 = r5
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Exception -> Lc0
            java.lang.Object r6 = r6.getKey()     // Catch: java.lang.Exception -> Lc0
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Exception -> Lc0
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Exception -> Lc0
            kotlin.jvm.internal.o.d(r5)     // Catch: java.lang.Exception -> Lc0
            r9.put(r6, r5)     // Catch: java.lang.Exception -> Lc0
            goto L91
        Laf:
            java.util.Map r9 = kz5.c1.t(r9)     // Catch: java.lang.Exception -> Lc0
            goto Lb5
        Lb4:
            r9 = 0
        Lb5:
            r0.f349005d = r7     // Catch: java.lang.Exception -> Lc0
            r0.f349008g = r4     // Catch: java.lang.Exception -> Lc0
            java.lang.Object r8 = r10.o(r8, r9, r0)     // Catch: java.lang.Exception -> Lc0
            if (r8 != r1) goto Ldb
            return r1
        Lc0:
            r9 = move-exception
            r8 = r7
        Lc2:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "pushRoute: failed, containerId="
            r10.<init>(r0)
            java.lang.String r8 = r8.f349017a
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = "FlutterContainer"
            com.tencent.mars.xlog.Log.e(r10, r8, r9)
        Ldb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ou4.s.c(java.lang.String, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void d(java.util.List handlers) {
        kotlin.jvm.internal.o.g(handlers, "handlers");
        ou4.j jVar = this.f349024h;
        jVar.getClass();
        java.util.Iterator it = handlers.iterator();
        while (it.hasNext()) {
            ou4.c0 handler = (ou4.c0) it.next();
            kotlin.jvm.internal.o.g(handler, "handler");
            jVar.f348985f.put(handler.b(), handler);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(android.view.ViewGroup r9, androidx.lifecycle.o r10, com.tencent.mm.flutter.ui.FlutterPageStyle r11, androidx.appcompat.app.AppCompatActivity r12, kotlin.coroutines.Continuation r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof ou4.q
            if (r0 == 0) goto L13
            r0 = r13
            ou4.q r0 = (ou4.q) r0
            int r1 = r0.f349012g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f349012g = r1
            goto L18
        L13:
            ou4.q r0 = new ou4.q
            r0.<init>(r8, r13)
        L18:
            r6 = r0
            java.lang.Object r13 = r6.f349010e
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f349012g
            r2 = 1
            r7 = 0
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r9 = r6.f349009d
            ou4.s r9 = (ou4.s) r9
            kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Exception -> L2d
            goto L57
        L2d:
            r10 = move-exception
            goto L62
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            kotlin.ResultKt.throwOnFailure(r13)
            boolean r13 = r8.f349027k
            if (r13 != 0) goto L7c
            boolean r13 = r8.f349026j
            if (r13 != 0) goto L43
            goto L7c
        L43:
            pi0.l1 r1 = r8.f349022f     // Catch: java.lang.Exception -> L60
            if (r1 == 0) goto L5a
            r6.f349009d = r8     // Catch: java.lang.Exception -> L60
            r6.f349012g = r2     // Catch: java.lang.Exception -> L60
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            java.lang.Object r13 = r1.x(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L60
            if (r13 != r0) goto L56
            return r0
        L56:
            r9 = r8
        L57:
            pi0.n1 r13 = (pi0.n1) r13     // Catch: java.lang.Exception -> L2d
            goto L5c
        L5a:
            r9 = r8
            r13 = r7
        L5c:
            r9.f349023g = r13     // Catch: java.lang.Exception -> L2d
            r7 = r13
            goto L7c
        L60:
            r10 = move-exception
            r9 = r8
        L62:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "showAsView: failed, containerId="
            r11.<init>(r12)
            java.lang.String r9 = r9.f349017a
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r11 = "FlutterContainer"
            com.tencent.mars.xlog.Log.e(r11, r9, r10)
        L7c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ou4.s.e(android.view.ViewGroup, androidx.lifecycle.o, com.tencent.mm.flutter.ui.FlutterPageStyle, androidx.appcompat.app.AppCompatActivity, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ou4.s.f(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
