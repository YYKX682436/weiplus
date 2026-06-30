package m41;

/* loaded from: classes8.dex */
public final class b extends com.tencent.mm.ipcinvoker.wx_extension.c {

    /* renamed from: d, reason: collision with root package name */
    public final j41.h0 f323434d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f323435e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f323436f;

    /* renamed from: g, reason: collision with root package name */
    public final int f323437g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j41.h0 getRequest, j41.j0 opRequest, r45.s4 addContactContext) {
        super(new r45.xk0(), new r45.yk0());
        com.tencent.mm.protobuf.g gVar;
        kotlin.jvm.internal.o.g(getRequest, "getRequest");
        kotlin.jvm.internal.o.g(opRequest, "opRequest");
        kotlin.jvm.internal.o.g(addContactContext, "addContactContext");
        this.f323434d = getRequest;
        this.f323435e = "MicroMsg.CgiEnterOpenIMKefuChat";
        this.f323436f = "/cgi-bin/micromsg-bin/enteropenimkefuchat";
        this.f323437g = 14879;
        r45.vk0 vk0Var = new r45.vk0();
        vk0Var.f388314f = addContactContext.f385489g;
        byte[] bArr = opRequest.f297651e;
        vk0Var.f388312d = bArr != null ? com.tencent.mm.protobuf.g.b(bArr) : null;
        java.lang.String str = opRequest.f297652f;
        if (str != null) {
            byte[] bytes = str.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            gVar = com.tencent.mm.protobuf.g.b(bytes);
        } else {
            gVar = null;
        }
        vk0Var.f388313e = gVar;
        vk0Var.f388315g = getRequest.f297636f;
        r45.xk0 xk0Var = (r45.xk0) this.f68420a;
        xk0Var.f390178g = vk0Var;
        java.lang.String str2 = getRequest.f297632b;
        xk0Var.f390175d = str2;
        java.lang.String str3 = opRequest.f297647a;
        xk0Var.f390176e = str3;
        int i17 = getRequest.f297631a;
        xk0Var.f390177f = i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initRequest url: ");
        sb6.append(str2);
        sb6.append(", username: ");
        sb6.append(str3);
        sb6.append(", scene: ");
        sb6.append(i17);
        sb6.append(", ticketSize: ");
        java.lang.String str4 = addContactContext.f385488f;
        sb6.append(str4 != null ? java.lang.Integer.valueOf(str4.length()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiEnterOpenIMKefuChat", sb6.toString());
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.c
    public int a() {
        return this.f323437g;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.c
    public java.lang.String b() {
        return this.f323435e;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.c
    public java.lang.String c() {
        return this.f323436f;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.tencent.mm.ipcinvoker.wx_extension.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof m41.a
            if (r0 == 0) goto L13
            r0 = r7
            m41.a r0 = (m41.a) r0
            int r1 = r0.f323433g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f323433g = r1
            goto L18
        L13:
            m41.a r0 = new m41.a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f323431e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f323433g
            java.lang.String r3 = "MicroMsg.CgiEnterOpenIMKefuChat"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r0 = r0.f323430d
            m41.b r0 = (m41.b) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L49
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.String r7 = "send EnterOpenIMKefuChat"
            com.tencent.mars.xlog.Log.i(r3, r7)
            r0.f323430d = r6
            r0.f323433g = r4
            java.lang.Object r7 = super.d(r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            r0 = r6
        L49:
            r45.yk0 r7 = (r45.yk0) r7
            r0.getClass()
            java.lang.String r1 = "processResponse EnterOpenIMKefuChat"
            com.tencent.mars.xlog.Log.i(r3, r1)
            r45.k05 r1 = r7.f391174f
            r2 = 0
            if (r1 == 0) goto L83
            java.lang.String r1 = r1.f378271d
            if (r1 == 0) goto L83
            int r5 = r1.length()
            if (r5 <= 0) goto L63
            goto L64
        L63:
            r4 = 0
        L64:
            if (r4 == 0) goto L67
            goto L68
        L67:
            r1 = r2
        L68:
            if (r1 == 0) goto L83
            gm0.b0 r4 = gm0.j1.u()
            com.tencent.mm.storage.n3 r4 = r4.c()
            com.tencent.mm.storage.u3 r5 = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_KEFU_ENC_USERNAME_STRING_SYNC
            r4.x(r5, r1)
            java.lang.String r4 = "encUserName = "
            java.lang.String r1 = r4.concat(r1)
            com.tencent.mars.xlog.Log.i(r3, r1)
            jz5.f0 r1 = jz5.f0.f302826a
            goto L84
        L83:
            r1 = r2
        L84:
            if (r1 != 0) goto L98
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            com.tencent.mm.storage.u3 r4 = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_KEFU_ENC_USERNAME_STRING_SYNC
            r1.x(r4, r2)
            java.lang.String r1 = "encUserName is empty"
            com.tencent.mars.xlog.Log.i(r3, r1)
        L98:
            r45.h05 r1 = r7.f391173e
            if (r1 == 0) goto Lbf
            k41.o0 r2 = k41.o0.f304031a
            j41.h0 r0 = r0.f323434d
            java.lang.String r4 = r0.f297632b
            k41.g0 r1 = r2.a(r4, r1)
            if (r1 == 0) goto Lac
            r2.e(r1)
            goto Lbf
        Lac:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "openImKfContact is null after convertFromContactProto, url: "
            r1.<init>(r2)
            java.lang.String r0 = r0.f297632b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.mars.xlog.Log.e(r3, r0)
        Lbf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m41.b.d(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
