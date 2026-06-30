package lm2;

/* loaded from: classes4.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f319418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qn f319419e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, r45.qn qnVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f319418d = str;
        this.f319419e = qnVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lm2.l(this.f319418d, this.f319419e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        lm2.l lVar = (lm2.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lVar.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0095 A[Catch: all -> 0x013f, TryCatch #1 {all -> 0x013f, blocks: (B:12:0x005f, B:14:0x0065, B:16:0x006d, B:17:0x0070, B:18:0x0073, B:50:0x0080, B:22:0x0095, B:23:0x009a, B:24:0x00a3, B:26:0x00a9, B:33:0x00c5, B:36:0x00cb, B:38:0x00cf, B:40:0x00f1, B:45:0x00d7, B:54:0x0086), top: B:11:0x005f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9 A[Catch: all -> 0x013f, TryCatch #1 {all -> 0x013f, blocks: (B:12:0x005f, B:14:0x0065, B:16:0x006d, B:17:0x0070, B:18:0x0073, B:50:0x0080, B:22:0x0095, B:23:0x009a, B:24:0x00a3, B:26:0x00a9, B:33:0x00c5, B:36:0x00cb, B:38:0x00cf, B:40:0x00f1, B:45:0x00d7, B:54:0x0086), top: B:11:0x005f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4 A[SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lm2.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
