package xt2;

/* loaded from: classes3.dex */
public final class y4 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f457118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.b5 f457119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f457120f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.hx0 f457121g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(az2.f fVar, xt2.b5 b5Var, yz5.a aVar, r45.hx0 hx0Var) {
        super(3);
        this.f457118d = fVar;
        this.f457119e = b5Var;
        this.f457120f = aVar;
        this.f457121g = hx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0054  */
    @Override // yz5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            r4 = this;
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.String r6 = (java.lang.String) r6
            r45.o12 r7 = (r45.o12) r7
            java.lang.String r0 = "errMsg"
            kotlin.jvm.internal.o.g(r6, r0)
            java.lang.String r0 = "<anonymous parameter 2>"
            kotlin.jvm.internal.o.g(r7, r0)
            az2.f r7 = r4.f457118d
            r7.b()
            xt2.b5 r7 = r4.f457119e
            if (r5 == 0) goto L86
            gk2.e r5 = r7.f456637i
            java.lang.Class<mm2.f6> r6 = mm2.f6.class
            androidx.lifecycle.c1 r5 = r5.a(r6)
            mm2.f6 r5 = (mm2.f6) r5
            r45.yv2 r5 = r5.f329051x0
            r45.g12 r6 = new r45.g12
            r6.<init>()
            r45.hx0 r0 = r4.f457121g
            r1 = 1
            com.tencent.mm.protobuf.g r0 = r0.getByteString(r1)
            r2 = 0
            if (r0 == 0) goto L3d
            byte[] r0 = r0.g()
            goto L3e
        L3d:
            r0 = r2
        L3e:
            if (r0 != 0) goto L41
            goto L51
        L41:
            r6.parseFrom(r0)     // Catch: java.lang.Exception -> L45
            goto L52
        L45:
            r6 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r0 = "safeParser"
            java.lang.String r3 = ""
            com.tencent.mm.sdk.platformtools.Log.a(r0, r3, r6)
        L51:
            r6 = r2
        L52:
            if (r6 == 0) goto L71
            if (r5 != 0) goto L57
            goto L63
        L57:
            r0 = 0
            int r2 = r6.getInteger(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.set(r0, r2)
        L63:
            if (r5 != 0) goto L66
            goto L71
        L66:
            int r6 = r6.getInteger(r1)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.set(r1, r6)
        L71:
            r5 = 2131764860(0x7f10267c, float:1.9160865E38)
            com.tencent.mm.ui.MMActivity r6 = r7.f456636h
            java.lang.String r5 = r6.getString(r5)
            r7 = 2131690843(0x7f0f055b, float:1.9010741E38)
            db5.t7.i(r6, r5, r7)
            yz5.a r5 = r4.f457120f
            r5.invoke()
            goto L8b
        L86:
            com.tencent.mm.ui.MMActivity r5 = r7.f456636h
            db5.t7.g(r5, r6)
        L8b:
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.y4.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
