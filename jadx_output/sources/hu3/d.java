package hu3;

/* loaded from: classes5.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f285103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f285104f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(hu3.n0 n0Var, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f285102d = n0Var;
        this.f285103e = i17;
        this.f285104f = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hu3.d(this.f285102d, this.f285103e, this.f285104f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        hu3.d dVar = (hu3.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r4 == false) goto L17;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            kotlin.ResultKt.throwOnFailure(r6)
            hu3.n0 r6 = r5.f285102d
            android.media.ImageReader r0 = r6.f285169p
            int r1 = r5.f285104f
            int r2 = r5.f285103e
            r3 = 1
            if (r0 == 0) goto L2b
            r4 = 0
            if (r0 == 0) goto L1b
            int r0 = r0.getWidth()
            if (r0 != r2) goto L1b
            r0 = r3
            goto L1c
        L1b:
            r0 = r4
        L1c:
            if (r0 == 0) goto L2b
            android.media.ImageReader r0 = r6.f285169p
            if (r0 == 0) goto L29
            int r0 = r0.getHeight()
            if (r0 != r1) goto L29
            r4 = r3
        L29:
            if (r4 != 0) goto L6a
        L2b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "create imageReader:["
            r0.<init>(r4)
            r0.append(r2)
            java.lang.String r4 = ", "
            r0.append(r4)
            r0.append(r1)
            r4 = 93
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "MicroMsg.ProfessionalTemplateCorePlugin"
            com.tencent.mars.xlog.Log.i(r4, r0)
            android.media.ImageReader r0 = r6.f285169p
            if (r0 == 0) goto L52
            r0.close()
        L52:
            android.media.ImageReader r0 = android.media.ImageReader.newInstance(r2, r1, r3, r3)
            r6.f285169p = r0
            android.media.ImageReader r0 = r6.f285169p
            if (r0 == 0) goto L6a
            android.os.Handler r1 = new android.os.Handler
            android.os.HandlerThread r2 = r6.f285170q
            android.os.Looper r2 = r2.getLooper()
            r1.<init>(r2)
            r0.setOnImageAvailableListener(r6, r1)
        L6a:
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hu3.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
