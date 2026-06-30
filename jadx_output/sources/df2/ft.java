package df2;

/* loaded from: classes10.dex */
public final class ft extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.lt f230168e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft(df2.lt ltVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230168e = ltVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.ft(this.f230168e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.ft) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00a7 -> B:12:0x0023). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f230167d
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L19
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            goto L1f
        L11:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L19:
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r10
            goto L96
        L1f:
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r10
        L23:
            df2.lt r1 = r11.f230168e
            com.tencent.mm.view.RecyclerHorizontalViewPager r6 = r1.f230706n
            r7 = 0
            if (r6 != 0) goto L2b
            goto L2e
        L2b:
            r6.setFrozeTouch(r7)
        L2e:
            boolean r6 = r1.f230715w
            if (r6 == 0) goto L3f
            r1.f230715w = r7
            r11.f230167d = r4
            r6 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r1 = kotlinx.coroutines.k1.b(r6, r11)
            if (r1 != r0) goto L96
            return r0
        L3f:
            in5.c r1 = r1.f230710r
            boolean r6 = r1 instanceof dk2.h
            if (r6 == 0) goto L48
            dk2.h r1 = (dk2.h) r1
            goto L49
        L48:
            r1 = r5
        L49:
            if (r1 == 0) goto L96
            java.lang.String r6 = df2.lt.W
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "delay title: "
            r6.<init>(r7)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r7 = r1.f233541d
            if (r7 == 0) goto L5d
            java.lang.String r7 = r7.getWording()
            goto L5e
        L5d:
            r7 = r5
        L5e:
            r6.append(r7)
            java.lang.String r7 = " , time: "
            r6.append(r7)
            r7 = 17
            r45.bm1 r1 = r1.f233545h
            if (r1 == 0) goto L76
            int r8 = r1.getInteger(r7)
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r8)
            goto L77
        L76:
            r9 = r5
        L77:
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = "Finder.LivePromoteBannerController"
            com.tencent.mars.xlog.Log.i(r8, r6)
            if (r1 == 0) goto L8b
            int r1 = r1.getInteger(r7)
            long r6 = (long) r1
            goto L8d
        L8b:
            r6 = 5000(0x1388, double:2.4703E-320)
        L8d:
            r11.f230167d = r3
            java.lang.Object r1 = kotlinx.coroutines.k1.b(r6, r11)
            if (r1 != r0) goto L96
            return r0
        L96:
            kotlinx.coroutines.p0 r1 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r1 = kotlinx.coroutines.internal.b0.f310484a
            df2.et r6 = new df2.et
            df2.lt r7 = r11.f230168e
            r6.<init>(r7, r5)
            r11.f230167d = r2
            java.lang.Object r1 = kotlinx.coroutines.l.g(r1, r6, r11)
            if (r1 != r0) goto L23
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.ft.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
