package m41;

/* loaded from: classes8.dex */
public final class d extends com.tencent.mm.ipcinvoker.wx_extension.c {

    /* renamed from: d, reason: collision with root package name */
    public final j41.h0 f323442d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f323443e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f323444f;

    /* renamed from: g, reason: collision with root package name */
    public final int f323445g;

    /* renamed from: h, reason: collision with root package name */
    public k41.g0 f323446h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f323447i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j41.h0 getRequest, j41.j0 opRequest, r45.s4 addContactContext) {
        super(new r45.hq6(), new r45.iq6());
        com.tencent.mm.protobuf.g gVar;
        com.tencent.mm.protobuf.g gVar2;
        kotlin.jvm.internal.o.g(getRequest, "getRequest");
        kotlin.jvm.internal.o.g(opRequest, "opRequest");
        kotlin.jvm.internal.o.g(addContactContext, "addContactContext");
        this.f323442d = getRequest;
        this.f323443e = "MicroMsg.CgiTryAddOpenIMKefuContact";
        this.f323444f = "/cgi-bin/micromsg-bin/tryaddopenimkefucontact";
        this.f323445g = 17290;
        r45.gq6 gq6Var = new r45.gq6();
        java.lang.String str = addContactContext.f385488f;
        if (str != null) {
            byte[] bytes = str.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            gVar = com.tencent.mm.protobuf.g.b(bytes);
        } else {
            gVar = null;
        }
        gq6Var.f375486d = gVar;
        gq6Var.f375487e = addContactContext.f385489g;
        byte[] bArr = opRequest.f297651e;
        gq6Var.f375488f = bArr != null ? com.tencent.mm.protobuf.g.b(bArr) : null;
        java.lang.String str2 = opRequest.f297652f;
        if (str2 != null) {
            byte[] bytes2 = str2.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
            gVar2 = com.tencent.mm.protobuf.g.b(bytes2);
        } else {
            gVar2 = null;
        }
        gq6Var.f375489g = gVar2;
        gq6Var.f375490h = getRequest.f297636f;
        r45.hq6 hq6Var = (r45.hq6) this.f68420a;
        hq6Var.f376393g = gq6Var;
        java.lang.String str3 = getRequest.f297632b;
        hq6Var.f376390d = str3;
        java.lang.String str4 = opRequest.f297647a;
        hq6Var.f376391e = str4;
        int i17 = getRequest.f297631a;
        hq6Var.f376392f = i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initRequest url: ");
        sb6.append(str3);
        sb6.append(", username: ");
        sb6.append(str4);
        sb6.append(", scene: ");
        sb6.append(i17);
        sb6.append(", ticketSize: ");
        java.lang.String str5 = addContactContext.f385488f;
        sb6.append(str5 != null ? java.lang.Integer.valueOf(str5.length()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiTryAddOpenIMKefuContact", sb6.toString());
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.c
    public int a() {
        return this.f323445g;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.c
    public java.lang.String b() {
        return this.f323443e;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.c
    public java.lang.String c() {
        return this.f323444f;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.tencent.mm.ipcinvoker.wx_extension.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m41.d.d(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
