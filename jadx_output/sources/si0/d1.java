package si0;

/* loaded from: classes4.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f408051d;

    /* renamed from: e, reason: collision with root package name */
    public int f408052e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ si0.m1 f408053f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f408054g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f408055h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f408056i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(si0.m1 m1Var, java.util.Map map, yz5.l lVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f408053f = m1Var;
        this.f408054g = map;
        this.f408055h = lVar;
        this.f408056i = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new si0.d1(this.f408053f, this.f408054g, this.f408055h, this.f408056i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((si0.d1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0087  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r13.f408052e
            yz5.l r2 = r13.f408055h
            java.lang.String r3 = "object_buffer"
            jz5.f0 r4 = jz5.f0.f302826a
            long r5 = r13.f408056i
            r7 = 2
            r8 = 1
            si0.m1 r9 = r13.f408053f
            java.util.Map r10 = r13.f408054g
            r11 = 0
            if (r1 == 0) goto L32
            if (r1 == r8) goto L2a
            if (r1 != r7) goto L22
            java.lang.Object r0 = r13.f408051d
            com.tencent.mm.ui.widget.dialog.u3 r0 = (com.tencent.mm.ui.widget.dialog.u3) r0
            kotlin.ResultKt.throwOnFailure(r14)
            goto L80
        L22:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L2a:
            java.lang.Object r1 = r13.f408051d
            android.content.Context r1 = (android.content.Context) r1
            kotlin.ResultKt.throwOnFailure(r14)
            goto L4e
        L32:
            kotlin.ResultKt.throwOnFailure(r14)
            android.content.Context r1 = r9.i()
            if (r1 != 0) goto L3c
            return r4
        L3c:
            kotlinx.coroutines.p0 r14 = kotlinx.coroutines.q1.f310570c
            si0.b1 r12 = new si0.b1
            r12.<init>(r5, r11)
            r13.f408051d = r1
            r13.f408052e = r8
            java.lang.Object r14 = kotlinx.coroutines.l.g(r14, r12, r13)
            if (r14 != r0) goto L4e
            return r0
        L4e:
            com.tencent.mm.plugin.sns.storage.SnsInfo r14 = (com.tencent.mm.plugin.sns.storage.SnsInfo) r14
            if (r14 == 0) goto L60
            byte[] r14 = r14.field_attrBuf
            java.lang.String r0 = "field_attrBuf"
            kotlin.jvm.internal.o.f(r14, r0)
            r10.put(r3, r14)
            r9.g(r10, r2)
            goto L9d
        L60:
            r14 = 2131756166(0x7f100486, float:1.9143232E38)
            java.lang.String r14 = i65.a.r(r1, r14)
            r8 = 0
            com.tencent.mm.ui.widget.dialog.u3 r14 = com.tencent.mm.ui.widget.dialog.u3.f(r1, r14, r8, r8, r11)
            kotlinx.coroutines.p0 r1 = kotlinx.coroutines.q1.f310570c
            si0.c1 r8 = new si0.c1
            r8.<init>(r5, r11)
            r13.f408051d = r14
            r13.f408052e = r7
            java.lang.Object r1 = kotlinx.coroutines.l.g(r1, r8, r13)
            if (r1 != r0) goto L7e
            return r0
        L7e:
            r0 = r14
            r14 = r1
        L80:
            r45.n96 r14 = (r45.n96) r14
            r0.dismiss()
            if (r14 == 0) goto L89
            com.tencent.mm.protocal.protobuf.SnsObject r11 = r14.f381186d
        L89:
            if (r11 == 0) goto L9d
            com.tencent.mm.protocal.protobuf.SnsObject r14 = r14.f381186d
            byte[] r14 = r14.toByteArray()
            java.lang.String r0 = "toByteArray(...)"
            kotlin.jvm.internal.o.f(r14, r0)
            r10.put(r3, r14)
            r9.g(r10, r2)
        L9d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: si0.d1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
