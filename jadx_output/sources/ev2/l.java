package ev2;

/* loaded from: classes10.dex */
public final class l implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ev2.n f256918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ev2.e f256919b;

    public l(ev2.n nVar, ev2.e eVar) {
        this.f256918a = nVar;
        this.f256919b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f A[SYNTHETIC] */
    @Override // fp0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(fp0.d r14, fp0.u r15) {
        /*
            r13 = this;
            ev2.q r14 = (ev2.q) r14
            java.lang.String r0 = "task"
            kotlin.jvm.internal.o.g(r14, r0)
            java.lang.String r0 = "status"
            kotlin.jvm.internal.o.g(r15, r0)
            ev2.n r0 = ev2.n.f256921f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "task callback "
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.MusicUni.FinderLikeActionMgr"
            com.tencent.mars.xlog.Log.i(r1, r0)
            fp0.u r0 = fp0.u.f265290f
            ev2.n r2 = r13.f256918a
            if (r15 != r0) goto Lb8
            r2.getClass()
            ev2.e r14 = r13.f256919b
            boolean r15 = r14 instanceof ev2.t
            java.util.concurrent.ConcurrentLinkedQueue r0 = r2.f256923b
            r3 = 0
            if (r15 == 0) goto L85
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r4 = r0.iterator()
        L3f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L84
            java.lang.Object r5 = r4.next()
            r6 = r5
            ev2.e r6 = (ev2.e) r6
            boolean r7 = r6 instanceof ev2.t
            if (r7 == 0) goto L54
            r7 = r6
            ev2.t r7 = (ev2.t) r7
            goto L55
        L54:
            r7 = r3
        L55:
            if (r7 != 0) goto L58
            goto L7d
        L58:
            r8 = r6
            ev2.t r8 = (ev2.t) r8
            long r9 = r8.f256937g
            long r11 = r7.f256937g
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 != 0) goto L7d
            jv2.c r7 = r7.f256934d
            long r9 = r7.t0()
            jv2.c r7 = r8.f256934d
            long r7 = r7.t0()
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 != 0) goto L7d
            long r7 = r14.f256907b
            long r9 = r6.f256907b
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 <= 0) goto L7d
            r6 = 1
            goto L7e
        L7d:
            r6 = 0
        L7e:
            if (r6 == 0) goto L3f
            r15.add(r5)
            goto L3f
        L84:
            r3 = r15
        L85:
            if (r3 == 0) goto Lb4
            java.util.Iterator r15 = r3.iterator()
        L8b:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto Lb4
            java.lang.Object r3 = r15.next()
            ev2.e r3 = (ev2.e) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "drop action now action "
            r4.<init>(r5)
            r4.append(r14)
            r5 = 32
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.tencent.mars.xlog.Log.i(r1, r4)
            r0.remove(r3)
            goto L8b
        Lb4:
            r2.d()
            goto Lcf
        Lb8:
            boolean r15 = r14.f256929g
            if (r15 == 0) goto Lc3
            java.util.concurrent.ConcurrentLinkedQueue r15 = r2.f256923b
            ev2.e r14 = r14.f256928f
            r15.add(r14)
        Lc3:
            java.lang.Runnable r14 = r2.f256926e
            com.tencent.mm.sdk.platformtools.u3.l(r14)
            java.lang.Runnable r14 = r2.f256926e
            long r0 = nv2.a.f340431a
            com.tencent.mm.sdk.platformtools.u3.i(r14, r0)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ev2.l.a(fp0.d, fp0.u):void");
    }
}
