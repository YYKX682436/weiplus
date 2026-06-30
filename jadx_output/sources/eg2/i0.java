package eg2;

/* loaded from: classes3.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f252576a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f252577b;

    /* renamed from: c, reason: collision with root package name */
    public kotlinx.coroutines.r2 f252578c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f252579d;

    public i0(kotlinx.coroutines.y0 scope) {
        kotlin.jvm.internal.o.g(scope, "scope");
        this.f252576a = scope;
        this.f252577b = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public void a() {
        if (this.f252577b.compareAndSet(false, true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveHDBaseTask", "cancel: marked as cancelled");
            java.lang.String str = this.f252579d;
            if (str != null) {
                if (str.length() > 0) {
                    kotlinx.coroutines.l.d(this.f252576a, kotlinx.coroutines.q1.f310570c, null, new eg2.g0(this, str, null), 2, null);
                }
            }
        }
    }

    public abstract java.lang.String b();

    public abstract int c();

    /* JADX WARN: Removed duplicated region for block: B:14:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c4 -> B:11:0x003c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r20, long r21, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eg2.i0.d(java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(yz5.l r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof eg2.h0
            if (r0 == 0) goto L13
            r0 = r11
            eg2.h0 r0 = (eg2.h0) r0
            int r1 = r0.f252574g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f252574g = r1
            goto L18
        L13:
            eg2.h0 r0 = new eg2.h0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f252572e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f252574g
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.throwOnFailure(r11)
            goto L94
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            java.lang.Object r10 = r0.f252571d
            eg2.i0 r10 = (eg2.i0) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto L53
        L3b:
            kotlin.ResultKt.throwOnFailure(r11)
            java.util.concurrent.atomic.AtomicBoolean r11 = r9.f252577b
            boolean r11 = r11.get()
            if (r11 == 0) goto L47
            return r4
        L47:
            r0.f252571d = r9
            r0.f252574g = r5
            java.lang.Object r11 = r10.invoke(r0)
            if (r11 != r1) goto L52
            return r1
        L52:
            r10 = r9
        L53:
            r45.ao1 r11 = (r45.ao1) r11
            java.lang.String r2 = "MicroMsg.FinderLiveHDBaseTask"
            if (r11 != 0) goto L5f
            java.lang.String r10 = "submitAndPoll: initialRequest returned null"
            com.tencent.mars.xlog.Log.e(r2, r10)
            return r4
        L5f:
            r6 = 3
            java.lang.String r7 = r11.getString(r6)
            r10.f252579d = r7
            int r7 = r11.getInteger(r5)
            if (r7 == r6) goto L6d
            return r11
        L6d:
            java.lang.String r6 = r11.getString(r6)
            if (r6 == 0) goto L7b
            int r7 = r6.length()
            if (r7 != 0) goto L7a
            goto L7b
        L7a:
            r5 = 0
        L7b:
            if (r5 == 0) goto L83
            java.lang.String r10 = "submitAndPoll: NEED_NEXT_QUERY but taskId is empty"
            com.tencent.mars.xlog.Log.e(r2, r10)
            return r4
        L83:
            r2 = 4
            int r11 = r11.getInteger(r2)
            long r7 = (long) r11
            r0.f252571d = r4
            r0.f252574g = r3
            java.lang.Object r11 = r10.d(r6, r7, r0)
            if (r11 != r1) goto L94
            return r1
        L94:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: eg2.i0.e(yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
