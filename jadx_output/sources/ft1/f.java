package ft1;

/* loaded from: classes8.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f266484d;

    /* renamed from: e, reason: collision with root package name */
    public int f266485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ft1.j f266486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xg3.t f266487g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ft1.j jVar, xg3.t tVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f266486f = jVar;
        this.f266487g = tVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ft1.f(this.f266486f, this.f266487g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ft1.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0063 A[Catch: Exception -> 0x01d6, TRY_ENTER, TryCatch #0 {Exception -> 0x01d6, blocks: (B:9:0x0055, B:12:0x0063, B:14:0x0073, B:16:0x0077, B:17:0x0082, B:19:0x008c, B:20:0x0094, B:22:0x00a0, B:24:0x00a4, B:25:0x00a8, B:27:0x00ae, B:29:0x00d3, B:30:0x00d7, B:32:0x00dd, B:34:0x0104, B:39:0x0111, B:41:0x0115, B:42:0x0119, B:44:0x011e, B:46:0x0124, B:48:0x0128, B:51:0x0133, B:52:0x0140, B:54:0x0146, B:63:0x015e, B:65:0x0166, B:67:0x01b6, B:69:0x01cd, B:72:0x002b, B:78:0x016c, B:80:0x0188, B:82:0x018c, B:83:0x0197, B:86:0x01a4, B:94:0x01de, B:98:0x0214), top: B:8:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b6 A[Catch: Exception -> 0x01d6, TryCatch #0 {Exception -> 0x01d6, blocks: (B:9:0x0055, B:12:0x0063, B:14:0x0073, B:16:0x0077, B:17:0x0082, B:19:0x008c, B:20:0x0094, B:22:0x00a0, B:24:0x00a4, B:25:0x00a8, B:27:0x00ae, B:29:0x00d3, B:30:0x00d7, B:32:0x00dd, B:34:0x0104, B:39:0x0111, B:41:0x0115, B:42:0x0119, B:44:0x011e, B:46:0x0124, B:48:0x0128, B:51:0x0133, B:52:0x0140, B:54:0x0146, B:63:0x015e, B:65:0x0166, B:67:0x01b6, B:69:0x01cd, B:72:0x002b, B:78:0x016c, B:80:0x0188, B:82:0x018c, B:83:0x0197, B:86:0x01a4, B:94:0x01de, B:98:0x0214), top: B:8:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x002b A[Catch: Exception -> 0x01d6, TRY_ENTER, TryCatch #0 {Exception -> 0x01d6, blocks: (B:9:0x0055, B:12:0x0063, B:14:0x0073, B:16:0x0077, B:17:0x0082, B:19:0x008c, B:20:0x0094, B:22:0x00a0, B:24:0x00a4, B:25:0x00a8, B:27:0x00ae, B:29:0x00d3, B:30:0x00d7, B:32:0x00dd, B:34:0x0104, B:39:0x0111, B:41:0x0115, B:42:0x0119, B:44:0x011e, B:46:0x0124, B:48:0x0128, B:51:0x0133, B:52:0x0140, B:54:0x0146, B:63:0x015e, B:65:0x0166, B:67:0x01b6, B:69:0x01cd, B:72:0x002b, B:78:0x016c, B:80:0x0188, B:82:0x018c, B:83:0x0197, B:86:0x01a4, B:94:0x01de, B:98:0x0214), top: B:8:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01de A[Catch: Exception -> 0x01d6, TryCatch #0 {Exception -> 0x01d6, blocks: (B:9:0x0055, B:12:0x0063, B:14:0x0073, B:16:0x0077, B:17:0x0082, B:19:0x008c, B:20:0x0094, B:22:0x00a0, B:24:0x00a4, B:25:0x00a8, B:27:0x00ae, B:29:0x00d3, B:30:0x00d7, B:32:0x00dd, B:34:0x0104, B:39:0x0111, B:41:0x0115, B:42:0x0119, B:44:0x011e, B:46:0x0124, B:48:0x0128, B:51:0x0133, B:52:0x0140, B:54:0x0146, B:63:0x015e, B:65:0x0166, B:67:0x01b6, B:69:0x01cd, B:72:0x002b, B:78:0x016c, B:80:0x0188, B:82:0x018c, B:83:0x0197, B:86:0x01a4, B:94:0x01de, B:98:0x0214), top: B:8:0x0055 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0052 -> B:8:0x0055). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ft1.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
