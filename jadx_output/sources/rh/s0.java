package rh;

/* loaded from: classes12.dex */
public class s0 implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f395503a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f395504b;

    public s0(rh.c1 c1Var, java.lang.Long l17) {
        this.f395504b = c1Var;
        this.f395503a = l17;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0089  */
    @Override // wh.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r7) {
        /*
            r6 = this;
            rh.c3 r7 = (rh.c3) r7
            rh.c1 r0 = r6.f395504b
            qh.f0 r0 = r0.f395329k
            android.content.Context r0 = r0.d()
            java.lang.Long r1 = r6.f395503a
            long r1 = r1.longValue()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            int r1 = (int) r1
            java.lang.Integer r2 = wh.m.f445830a
            java.lang.String r2 = "context"
            kotlin.jvm.internal.o.g(r0, r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            r4 = 0
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 < r3) goto L57
            java.lang.String r2 = "power"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch: java.lang.Exception -> L3d
            if (r0 == 0) goto L34
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch: java.lang.Exception -> L3d
            float r0 = r0.getThermalHeadroom(r1)     // Catch: java.lang.Exception -> L3d
            goto L58
        L34:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L3d
            java.lang.String r1 = "null cannot be cast to non-null type android.os.PowerManager"
            r0.<init>(r1)     // Catch: java.lang.Exception -> L3d
            throw r0     // Catch: java.lang.Exception -> L3d
        L3d:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getThermalHeadroom failed: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "Matrix.battery.Utils"
            oj.j.f(r2, r0, r1)
        L57:
            r0 = r5
        L58:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "onSampling "
            r1.<init>(r2)
            int r2 = r7.f395346g
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            java.lang.String r7 = r7.f395340a
            r1.append(r7)
            java.lang.String r7 = ", val = "
            r1.append(r7)
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "Matrix.battery.CompositeMonitors"
            oj.j.c(r2, r7, r1)
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 != 0) goto L89
            java.lang.Integer r7 = rh.c3.f395339o
            goto L8d
        L89:
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
        L8d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rh.s0.apply(java.lang.Object):java.lang.Object");
    }
}
