package pi0;

/* loaded from: classes11.dex */
public final class g0 {

    /* renamed from: e */
    public static final pi0.b0 f354572e = new pi0.b0(null);

    /* renamed from: f */
    public static final java.util.HashMap f354573f = new java.util.HashMap();

    /* renamed from: g */
    public static boolean f354574g;

    /* renamed from: a */
    public final java.lang.String f354575a;

    /* renamed from: b */
    public aj0.l f354576b;

    /* renamed from: c */
    public aj0.e f354577c;

    /* renamed from: d */
    public final pi0.h0 f354578d = new pi0.h0();

    public g0(java.lang.String str) {
        this.f354575a = str;
    }

    public static /* synthetic */ java.lang.Object b(pi0.g0 g0Var, android.content.Context context, long j17, android.graphics.Point point, boolean z17, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            j17 = 300;
        }
        long j18 = j17;
        if ((i17 & 4) != 0) {
            point = null;
        }
        android.graphics.Point point2 = point;
        if ((i17 & 8) != 0) {
            z17 = true;
        }
        return g0Var.a(context, j18, point2, z17, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r8, long r9, android.graphics.Point r11, boolean r12, kotlin.coroutines.Continuation r13) {
        /*
            r7 = this;
            boolean r11 = r13 instanceof pi0.c0
            if (r11 == 0) goto L13
            r11 = r13
            pi0.c0 r11 = (pi0.c0) r11
            int r0 = r11.f354541g
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r11.f354541g = r0
            goto L18
        L13:
            pi0.c0 r11 = new pi0.c0
            r11.<init>(r7, r13)
        L18:
            java.lang.Object r13 = r11.f354539e
            pz5.a r0 = pz5.a.f359186d
            int r1 = r11.f354541g
            jz5.f0 r2 = jz5.f0.f302826a
            java.lang.String r3 = "MicroMsg.FlutterSnapshotHelper"
            r4 = 1
            if (r1 == 0) goto L37
            if (r1 != r4) goto L2f
            java.lang.Object r8 = r11.f354538d
            pi0.g0 r8 = (pi0.g0) r8
            kotlin.ResultKt.throwOnFailure(r13)     // Catch: kotlinx.coroutines.x3 -> L6b
            goto L85
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = 0
            java.lang.String r1 = r7.f354575a
            if (r1 == 0) goto L48
            int r1 = r1.length()
            if (r1 != 0) goto L46
            goto L48
        L46:
            r1 = r13
            goto L49
        L48:
            r1 = r4
        L49:
            if (r1 == 0) goto L4c
            return r2
        L4c:
            long r5 = java.lang.System.currentTimeMillis()
            pi0.h0 r1 = r7.f354578d
            r1.f354585a = r5
            pi0.f0 r1 = new pi0.f0     // Catch: kotlinx.coroutines.x3 -> L6a
            if (r12 == 0) goto L59
            r13 = r4
        L59:
            r12 = 0
            r1.<init>(r7, r8, r13, r12)     // Catch: kotlinx.coroutines.x3 -> L6a
            r11.f354538d = r7     // Catch: kotlinx.coroutines.x3 -> L6a
            r11.f354541g = r4     // Catch: kotlinx.coroutines.x3 -> L6a
            java.lang.Object r8 = kotlinx.coroutines.a4.b(r9, r1, r11)     // Catch: kotlinx.coroutines.x3 -> L6a
            if (r8 != r0) goto L68
            return r0
        L68:
            r8 = r7
            goto L85
        L6a:
            r8 = r7
        L6b:
            pi0.h0 r9 = r8.f354578d
            r9.f354587c = r4
            java.lang.String r9 = "engineId"
            java.lang.String r10 = r8.f354575a
            kotlin.jvm.internal.o.g(r10, r9)
            java.lang.String r9 = "prepareSnapshotTimeout:"
            java.lang.String r9 = r9.concat(r10)
            io.flutter.Log.i(r3, r9)
            java.lang.String r9 = "snapshot timeout"
            io.flutter.Log.w(r3, r9)
        L85:
            r8.getClass()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "prepareSnapshot cost:"
            r9.<init>(r10)
            long r10 = java.lang.System.currentTimeMillis()
            pi0.h0 r8 = r8.f354578d
            long r12 = r8.f354585a
            long r10 = r10 - r12
            r9.append(r10)
            java.lang.String r10 = ", timeout:"
            r9.append(r10)
            boolean r8 = r8.f354587c
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            io.flutter.Log.i(r3, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.g0.a(android.content.Context, long, android.graphics.Point, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
