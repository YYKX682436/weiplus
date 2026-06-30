package df2;

/* loaded from: classes3.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230366d;

    /* renamed from: e, reason: collision with root package name */
    public int f230367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.k f230368f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(df2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230368f = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.i(this.f230368f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x002a -> B:5:0x002d). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f230367e
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            java.lang.Object r1 = r10.f230366d
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r10
            goto L2d
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = 0
            r1 = r11
            r11 = r10
        L20:
            r11.f230366d = r1
            r11.f230367e = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r3 = kotlinx.coroutines.k1.b(r3, r11)
            if (r3 != r0) goto L2d
            return r0
        L2d:
            un0.h r3 = un0.s.f429418b
            r4 = 0
            if (r3 == 0) goto L34
            r3 = r2
            goto L35
        L34:
            r3 = r4
        L35:
            if (r1 == 0) goto L7c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            boolean r1 = kotlin.jvm.internal.o.b(r1, r5)
            if (r1 != 0) goto L7c
            java.lang.String r1 = "toString(...)"
            java.lang.String r5 = ""
            java.lang.String r6 = "message"
            java.lang.String r7 = "error_code"
            df2.k r8 = r11.f230368f
            if (r3 == 0) goto L65
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            r9.put(r7, r4)
            r9.put(r6, r5)
            java.lang.String r4 = r9.toString()
            kotlin.jvm.internal.o.f(r4, r1)
            java.lang.String r1 = "recoverRecord"
            r8.a7(r1, r4)
            goto L7c
        L65:
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            r9.put(r7, r4)
            r9.put(r6, r5)
            java.lang.String r4 = r9.toString()
            kotlin.jvm.internal.o.f(r4, r1)
            java.lang.String r1 = "pauseRecord"
            r8.a7(r1, r4)
        L7c:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
