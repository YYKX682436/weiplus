package za2;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f470881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f470882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f470883f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.ref.WeakReference weakReference, boolean z17, long j17) {
        super(0);
        this.f470881d = weakReference;
        this.f470882e = z17;
        this.f470883f = j17;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a A[Catch: Exception -> 0x002e, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:7:0x000b, B:9:0x000f, B:11:0x001b, B:13:0x001f, B:17:0x002a), top: B:6:0x000b }] */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r5 = this;
            java.lang.ref.WeakReference r0 = r5.f470881d
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 != 0) goto Lb
            goto L42
        Lb:
            boolean r1 = r5.f470882e     // Catch: java.lang.Exception -> L2e
            if (r1 == 0) goto L42
            za2.b r1 = za2.b.f470884a     // Catch: java.lang.Exception -> L2e
            long r2 = r5.f470883f     // Catch: java.lang.Exception -> L2e
            co0.a r4 = co0.b.f43709e2     // Catch: java.lang.Exception -> L2e
            co0.b r2 = r4.c(r2)     // Catch: java.lang.Exception -> L2e
            if (r2 == 0) goto L27
            kn0.p r2 = r2.D     // Catch: java.lang.Exception -> L2e
            if (r2 == 0) goto L27
            boolean r2 = r2.f()     // Catch: java.lang.Exception -> L2e
            r3 = 1
            if (r2 != r3) goto L27
            goto L28
        L27:
            r3 = 0
        L28:
            if (r3 != 0) goto L42
            za2.b.a(r1, r0)     // Catch: java.lang.Exception -> L2e
            goto L42
        L2e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "fix exception "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "PhoneWindowLeakFixed"
            com.tencent.mars.xlog.Log.e(r1, r0)
        L42:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: za2.a.invoke():java.lang.Object");
    }
}
