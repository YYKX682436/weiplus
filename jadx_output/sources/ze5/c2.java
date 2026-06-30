package ze5;

/* loaded from: classes9.dex */
public final class c2 implements com.tencent.mm.storage.a9 {

    /* renamed from: d, reason: collision with root package name */
    public final int f471864d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.model.app.d f471865e;

    public c2(com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.pluginsdk.model.app.e wi6;
        this.f471864d = dk5.w.f234966a.a(f9Var);
        com.tencent.mm.pluginsdk.model.app.d dVar = null;
        if (f9Var != null && (wi6 = com.tencent.mm.pluginsdk.model.app.u5.wi()) != null) {
            dVar = wi6.J0(f9Var.getMsgId(), f9Var.Q0());
        }
        this.f471865e = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.storage.a9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean U(java.lang.Object r4) {
        /*
            r3 = this;
            ze5.c2 r4 = (ze5.c2) r4
            java.lang.String r0 = "other"
            kotlin.jvm.internal.o.g(r4, r0)
            int r0 = r3.f471864d
            int r1 = r4.f471864d
            r2 = 0
            if (r0 != r1) goto L26
            r0 = 1
            com.tencent.mm.pluginsdk.model.app.d r1 = r3.f471865e
            if (r1 == 0) goto L22
            com.tencent.mm.pluginsdk.model.app.d r4 = r4.f471865e
            boolean r4 = r1.compareContent(r4)
            if (r4 != r0) goto L1d
            r4 = r0
            goto L1e
        L1d:
            r4 = r2
        L1e:
            if (r4 != r0) goto L22
            r4 = r0
            goto L23
        L22:
            r4 = r2
        L23:
            if (r4 == 0) goto L26
            r2 = r0
        L26:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.c2.U(java.lang.Object):boolean");
    }
}
