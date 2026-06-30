package nv2;

@j95.b
/* loaded from: classes2.dex */
public final class v extends i95.w implements nv2.g0 {

    /* renamed from: e, reason: collision with root package name */
    public nv2.x f340594e;

    /* renamed from: f, reason: collision with root package name */
    public nv2.x f340595f;

    /* renamed from: g, reason: collision with root package name */
    public nv2.x f340596g;

    /* renamed from: h, reason: collision with root package name */
    public nv2.s f340597h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f340593d = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f340598i = new java.util.HashMap();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ai(int r3, java.lang.String r4, boolean r5) {
        /*
            r2 = this;
            java.lang.String r0 = "finderUserName"
            kotlin.jvm.internal.o.g(r4, r0)
            r2.requireAccountInitialized()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "recordClean type:"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = "  finderUserName: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " isClean:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FeedCleaner"
            com.tencent.mars.xlog.Log.i(r1, r0)
            r0 = 1
            r1 = 0
            if (r3 == r0) goto L4c
            r0 = 2
            if (r3 == r0) goto L41
            r0 = 3
            if (r3 == r0) goto L36
            goto L51
        L36:
            nv2.x r3 = r2.f340596g
            if (r3 == 0) goto L3b
            goto L50
        L3b:
            java.lang.String r3 = "noSeeFriend"
            kotlin.jvm.internal.o.o(r3)
            throw r1
        L41:
            nv2.x r3 = r2.f340595f
            if (r3 == 0) goto L46
            goto L50
        L46:
            java.lang.String r3 = "noSeeAuthorRecorder"
            kotlin.jvm.internal.o.o(r3)
            throw r1
        L4c:
            nv2.x r3 = r2.f340594e
            if (r3 == 0) goto L5f
        L50:
            r1 = r3
        L51:
            if (r1 == 0) goto L5e
            java.util.Set r3 = r1.f340623a
            if (r5 == 0) goto L5b
            r3.add(r4)
            goto L5e
        L5b:
            r3.remove(r4)
        L5e:
            return
        L5f:
            java.lang.String r3 = "followRecorder"
            kotlin.jvm.internal.o.o(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nv2.v.Ai(int, java.lang.String, boolean):void");
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("Finder.FeedCleaner", "onAccountInit");
        java.lang.String T0 = g92.b.f269769e.T0();
        this.f340593d = T0;
        java.util.HashMap hashMap = this.f340598i;
        if (hashMap.containsKey(T0)) {
            java.lang.Object obj = hashMap.get(this.f340593d);
            kotlin.jvm.internal.o.d(obj);
            this.f340597h = (nv2.s) obj;
        }
        nv2.s sVar = this.f340597h;
        if (sVar != null) {
            this.f340594e = sVar.f340578b;
            this.f340595f = sVar.f340579c;
            this.f340596g = sVar.f340580d;
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f340594e = new nv2.x();
            this.f340595f = new nv2.x();
            nv2.x xVar = new nv2.x();
            this.f340596g = xVar;
            java.lang.String str = this.f340593d;
            nv2.x xVar2 = this.f340594e;
            if (xVar2 == null) {
                kotlin.jvm.internal.o.o("followRecorder");
                throw null;
            }
            nv2.x xVar3 = this.f340595f;
            if (xVar3 == null) {
                kotlin.jvm.internal.o.o("noSeeAuthorRecorder");
                throw null;
            }
            nv2.s sVar2 = new nv2.s(str, xVar2, xVar3, xVar);
            hashMap.put(this.f340593d, sVar2);
            this.f340597h = sVar2;
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("Finder.FeedCleaner", "onAccountRelease");
    }

    public final boolean wi(int i17) {
        if (i17 != 1 && i17 != 35) {
            if (i17 == 3) {
                nv2.x xVar = this.f340594e;
                if (xVar == null) {
                    kotlin.jvm.internal.o.o("followRecorder");
                    throw null;
                }
                boolean z17 = !xVar.f340623a.isEmpty();
                if (this.f340595f != null) {
                    return z17 | (!r3.f340623a.isEmpty());
                }
                kotlin.jvm.internal.o.o("noSeeAuthorRecorder");
                throw null;
            }
            if (i17 != 4) {
                return false;
            }
        }
        if (this.f340595f != null) {
            return !r5.f340623a.isEmpty();
        }
        kotlin.jvm.internal.o.o("noSeeAuthorRecorder");
        throw null;
    }
}
