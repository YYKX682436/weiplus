package cq;

/* loaded from: classes2.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f221293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f221294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221295f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f221296g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221297h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221298i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f221299m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f221300n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(kotlin.jvm.internal.f0 f0Var, yz5.q qVar, java.lang.String str, int i17, yz5.l lVar, java.lang.String str2, int i18, androidx.lifecycle.y yVar) {
        super(1);
        this.f221293d = f0Var;
        this.f221294e = qVar;
        this.f221295f = str;
        this.f221296g = i17;
        this.f221297h = lVar;
        this.f221298i = str2;
        this.f221299m = i18;
        this.f221300n = yVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r11.b() == true) goto L11;
     */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r11) {
        /*
            r10 = this;
            com.tencent.mm.modelbase.f r11 = (com.tencent.mm.modelbase.f) r11
            kotlin.jvm.internal.f0 r4 = r10.f221293d
            int r0 = r4.f310116d
            int r0 = r0 + (-1)
            r4.f310116d = r0
            r0 = 0
            if (r11 == 0) goto L12
            com.tencent.mm.protobuf.f r1 = r11.f70618d
            r45.l13 r1 = (r45.l13) r1
            goto L13
        L12:
            r1 = r0
        L13:
            if (r11 == 0) goto L1d
            boolean r2 = r11.b()
            r3 = 1
            if (r2 != r3) goto L1d
            goto L1e
        L1d:
            r3 = 0
        L1e:
            jz5.f0 r9 = jz5.f0.f302826a
            yz5.l r2 = r10.f221297h
            if (r3 == 0) goto L7e
            if (r1 == 0) goto L7e
            r11 = 4
            boolean r11 = r1.getBoolean(r11)
            java.lang.String r3 = "requestFinderUploadHeadImg"
            if (r11 == 0) goto L57
            yz5.q r11 = r10.f221294e
            if (r11 == 0) goto L3f
            int r0 = r10.f221296g
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = r10.f221295f
            r11.invoke(r1, r2, r0)
        L3f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "upload completed "
            r11.<init>(r0)
            r0 = 3
            java.lang.String r0 = r1.getString(r0)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.tencent.mars.xlog.Log.i(r3, r11)
            goto L83
        L57:
            int r11 = r4.f310116d
            if (r11 >= 0) goto L66
            java.lang.String r11 = "maxRequestLimit < 0"
            com.tencent.mars.xlog.Log.i(r3, r11)
            if (r2 == 0) goto L84
            r2.invoke(r0)
            goto L83
        L66:
            java.lang.String r0 = r10.f221298i
            int r11 = r10.f221299m
            yz5.l r2 = r10.f221297h
            androidx.lifecycle.y r3 = r10.f221300n
            yz5.q r5 = r10.f221294e
            java.lang.String r6 = r10.f221295f
            int r7 = r10.f221296g
            r8 = 2
            int r8 = r1.getInteger(r8)
            r1 = r11
            cq.j1.l(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L83
        L7e:
            if (r2 == 0) goto L84
            r2.invoke(r11)
        L83:
            r0 = r9
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cq.v0.invoke(java.lang.Object):java.lang.Object");
    }
}
