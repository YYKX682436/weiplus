package nv2;

/* loaded from: classes2.dex */
public final class m implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nv2.o f340539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nv2.r f340540b;

    public m(nv2.o oVar, nv2.r rVar) {
        this.f340539a = oVar;
        this.f340540b = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c A[SYNTHETIC] */
    @Override // fp0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(fp0.d r13, fp0.u r14) {
        /*
            r12 = this;
            nv2.q r13 = (nv2.q) r13
            java.lang.String r0 = "task"
            kotlin.jvm.internal.o.g(r13, r0)
            java.lang.String r0 = "status"
            kotlin.jvm.internal.o.g(r14, r0)
            nv2.o r0 = nv2.o.f340558e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "task callback "
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FavActionMgr"
            com.tencent.mars.xlog.Log.i(r1, r0)
            fp0.u r0 = fp0.u.f265290f
            nv2.o r2 = r12.f340539a
            if (r14 != r0) goto La5
            r2.getClass()
            nv2.r r13 = r12.f340540b
            boolean r14 = r13 instanceof nv2.l
            java.util.concurrent.ConcurrentLinkedQueue r0 = r2.f340560b
            r3 = 0
            if (r14 == 0) goto L72
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r4 = r0.iterator()
        L3c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L71
            java.lang.Object r5 = r4.next()
            r6 = r5
            nv2.r r6 = (nv2.r) r6
            boolean r7 = r6 instanceof nv2.l
            if (r7 == 0) goto L51
            r7 = r6
            nv2.l r7 = (nv2.l) r7
            goto L52
        L51:
            r7 = r3
        L52:
            if (r7 != 0) goto L55
            goto L6a
        L55:
            r8 = r6
            nv2.l r8 = (nv2.l) r8
            long r8 = r8.f340520e
            long r10 = r7.f340520e
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 != 0) goto L6a
            long r7 = r13.f340575c
            long r9 = r6.f340575c
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 <= 0) goto L6a
            r6 = 1
            goto L6b
        L6a:
            r6 = 0
        L6b:
            if (r6 == 0) goto L3c
            r14.add(r5)
            goto L3c
        L71:
            r3 = r14
        L72:
            if (r3 == 0) goto La1
            java.util.Iterator r14 = r3.iterator()
        L78:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto La1
            java.lang.Object r3 = r14.next()
            nv2.r r3 = (nv2.r) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "drop action now action "
            r4.<init>(r5)
            r4.append(r13)
            r5 = 32
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.tencent.mars.xlog.Log.i(r1, r4)
            r0.remove(r3)
            goto L78
        La1:
            r2.e()
            goto Lbc
        La5:
            boolean r14 = r13.f340569g
            if (r14 == 0) goto Lb0
            java.util.concurrent.ConcurrentLinkedQueue r14 = r2.f340560b
            nv2.r r13 = r13.f340568f
            r14.add(r13)
        Lb0:
            java.lang.Runnable r13 = r2.f340562d
            com.tencent.mm.sdk.platformtools.u3.l(r13)
            java.lang.Runnable r13 = r2.f340562d
            long r0 = nv2.a.f340431a
            com.tencent.mm.sdk.platformtools.u3.i(r13, r0)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nv2.m.a(fp0.d, fp0.u):void");
    }
}
