package fu0;

/* loaded from: classes5.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f266759d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f266760e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f266761f;

    /* renamed from: g, reason: collision with root package name */
    public int f266762g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f266763h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f266764i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ im5.c f266765m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f266766n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(org.json.JSONObject jSONObject, yz5.l lVar, im5.c cVar, kotlinx.coroutines.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f266763h = jSONObject;
        this.f266764i = lVar;
        this.f266765m = cVar;
        this.f266766n = y0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fu0.c(this.f266763h, this.f266764i, this.f266765m, this.f266766n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fu0.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01ac A[Catch: Exception -> 0x01f4, all -> 0x01f8, TryCatch #2 {all -> 0x01f8, blocks: (B:8:0x0027, B:10:0x01a8, B:12:0x01ac, B:16:0x01b2, B:19:0x01d3, B:101:0x01fd, B:26:0x0038, B:28:0x0187, B:30:0x018b, B:31:0x0191, B:36:0x0049, B:38:0x0132, B:41:0x0138, B:43:0x015d, B:45:0x0170, B:51:0x0053, B:113:0x005d, B:56:0x0067, B:57:0x0070, B:59:0x0076, B:62:0x0086, B:68:0x008e, B:71:0x0095, B:72:0x009e, B:74:0x00a4, B:77:0x00b4, B:83:0x00ba, B:86:0x00c3, B:91:0x00f7, B:94:0x0125), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01b2 A[Catch: Exception -> 0x01f4, all -> 0x01f8, TryCatch #2 {all -> 0x01f8, blocks: (B:8:0x0027, B:10:0x01a8, B:12:0x01ac, B:16:0x01b2, B:19:0x01d3, B:101:0x01fd, B:26:0x0038, B:28:0x0187, B:30:0x018b, B:31:0x0191, B:36:0x0049, B:38:0x0132, B:41:0x0138, B:43:0x015d, B:45:0x0170, B:51:0x0053, B:113:0x005d, B:56:0x0067, B:57:0x0070, B:59:0x0076, B:62:0x0086, B:68:0x008e, B:71:0x0095, B:72:0x009e, B:74:0x00a4, B:77:0x00b4, B:83:0x00ba, B:86:0x00c3, B:91:0x00f7, B:94:0x0125), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018b A[Catch: Exception -> 0x01f4, all -> 0x01f8, TryCatch #2 {all -> 0x01f8, blocks: (B:8:0x0027, B:10:0x01a8, B:12:0x01ac, B:16:0x01b2, B:19:0x01d3, B:101:0x01fd, B:26:0x0038, B:28:0x0187, B:30:0x018b, B:31:0x0191, B:36:0x0049, B:38:0x0132, B:41:0x0138, B:43:0x015d, B:45:0x0170, B:51:0x0053, B:113:0x005d, B:56:0x0067, B:57:0x0070, B:59:0x0076, B:62:0x0086, B:68:0x008e, B:71:0x0095, B:72:0x009e, B:74:0x00a4, B:77:0x00b4, B:83:0x00ba, B:86:0x00c3, B:91:0x00f7, B:94:0x0125), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0191 A[Catch: Exception -> 0x01f4, all -> 0x01f8, TryCatch #2 {all -> 0x01f8, blocks: (B:8:0x0027, B:10:0x01a8, B:12:0x01ac, B:16:0x01b2, B:19:0x01d3, B:101:0x01fd, B:26:0x0038, B:28:0x0187, B:30:0x018b, B:31:0x0191, B:36:0x0049, B:38:0x0132, B:41:0x0138, B:43:0x015d, B:45:0x0170, B:51:0x0053, B:113:0x005d, B:56:0x0067, B:57:0x0070, B:59:0x0076, B:62:0x0086, B:68:0x008e, B:71:0x0095, B:72:0x009e, B:74:0x00a4, B:77:0x00b4, B:83:0x00ba, B:86:0x00c3, B:91:0x00f7, B:94:0x0125), top: B:2:0x0019 }] */
    /* JADX WARN: Type inference failed for: r14v25, types: [java.util.List] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fu0.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
