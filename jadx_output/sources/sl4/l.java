package sl4;

/* loaded from: classes11.dex */
public final class l extends com.tencent.unit_rc.BaseObject implements jm4.h2 {

    /* renamed from: d, reason: collision with root package name */
    public final bw5.eq0 f409277d;

    /* renamed from: e, reason: collision with root package name */
    public final rl4.c f409278e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.unit_rc.WeakPtr f409279f;

    /* renamed from: g, reason: collision with root package name */
    public sl4.a f409280g;

    /* renamed from: h, reason: collision with root package name */
    public bl4.b f409281h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Boolean f409282i;

    public l(bw5.eq0 tingBizType, rl4.c cVar) {
        kotlin.jvm.internal.o.g(tingBizType, "tingBizType");
        this.f409277d = tingBizType;
        this.f409278e = cVar;
    }

    public final void a(b66.g gVar) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(gVar != null ? gVar.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMinimizeModule", "attachPlayApp playApp: %s", objArr);
        this.f409279f = new com.tencent.unit_rc.WeakPtr(gVar);
        if (gVar == null || ((b66.i) gVar).getAppId() != bw5.eq0.TingChatRoom) {
            return;
        }
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "createFloatBallHelper type: "
            r0.<init>(r1)
            bw5.eq0 r1 = r3.f409277d
            r0.append(r1)
            java.lang.String r2 = ", playApp: "
            r0.append(r2)
            com.tencent.unit_rc.WeakPtr r2 = r3.f409279f
            r0.append(r2)
            java.lang.String r2 = ", hashCode: "
            r0.append(r2)
            int r2 = r3.hashCode()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.TingMinimizeModule"
            com.tencent.mars.xlog.Log.i(r2, r0)
            com.tencent.unit_rc.WeakPtr r0 = r3.f409279f
            if (r0 == 0) goto L7e
            rl4.c r0 = r3.f409278e
            if (r0 == 0) goto L40
            wl4.h r1 = new wl4.h
            r1.<init>(r0)
            com.tencent.unit_rc.WeakPtr r0 = r3.f409279f
            r1.f(r0)
            r3.f409280g = r1
            return
        L40:
            java.lang.String r0 = "appId"
            kotlin.jvm.internal.o.g(r1, r0)
            int r0 = r1.ordinal()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L73
            r1 = 2
            if (r0 == r1) goto L6d
            r1 = 3
            if (r0 == r1) goto L67
            r1 = 6
            if (r0 == r1) goto L61
            r1 = 8
            if (r0 == r1) goto L5b
            goto L73
        L5b:
            cm4.a r0 = new cm4.a
            r0.<init>()
            goto L74
        L61:
            xl4.e r0 = new xl4.e
            r0.<init>()
            goto L74
        L67:
            vl4.l r0 = new vl4.l
            r0.<init>()
            goto L74
        L6d:
            zl4.e r0 = new zl4.e
            r0.<init>()
            goto L74
        L73:
            r0 = r2
        L74:
            if (r0 == 0) goto L7c
            com.tencent.unit_rc.WeakPtr r1 = r3.f409279f
            r0.f(r1)
            r2 = r0
        L7c:
            r3.f409280g = r2
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sl4.l.d():void");
    }
}
