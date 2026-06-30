package vw;

/* loaded from: classes11.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f440597d;

    /* renamed from: e, reason: collision with root package name */
    public int f440598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dw5.p f440599f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f440600g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rv.i3 f440601h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rv.j3 f440602i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(dw5.p pVar, android.content.Context context, rv.i3 i3Var, rv.j3 j3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f440599f = pVar;
        this.f440600g = context;
        this.f440601h = i3Var;
        this.f440602i = j3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vw.c1(this.f440599f, this.f440600g, this.f440601h, this.f440602i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vw.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00c0  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            r26 = this;
            r9 = r26
            pz5.a r10 = pz5.a.f359186d
            int r0 = r9.f440598e
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 == r2) goto L1d
            if (r0 != r1) goto L15
            kotlin.ResultKt.throwOnFailure(r27)
            r0 = r27
            goto Lba
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1d:
            java.lang.Object r0 = r9.f440597d
            pi0.l1 r0 = (pi0.l1) r0
            kotlin.ResultKt.throwOnFailure(r27)
            goto L6c
        L25:
            kotlin.ResultKt.throwOnFailure(r27)
            java.lang.Class<f50.y> r0 = f50.y.class
            i95.m r0 = i95.n0.c(r0)
            f50.y r0 = (f50.y) r0
            e50.z0 r0 = (e50.z0) r0
            pi0.q r12 = r0.Ui()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            dw5.p r3 = r9.f440599f
            byte[] r3 = r3.toByteArray()
            java.lang.String r4 = "toByteArray(...)"
            kotlin.jvm.internal.o.f(r3, r4)
            java.lang.String r4 = "poiInfo"
            r0.put(r4, r3)
            pi0.l1 r3 = new pi0.l1
            java.lang.String r13 = "biz"
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 28
            r18 = 0
            r11 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r9.f440597d = r3
            r9.f440598e = r2
            java.lang.String r2 = "poi_selector"
            java.lang.Object r0 = r3.o(r2, r0, r9)
            if (r0 != r10) goto L6b
            return r10
        L6b:
            r0 = r3
        L6c:
            lx.z5 r2 = new lx.z5
            r2.<init>()
            vw.b1 r3 = new vw.b1
            rv.j3 r4 = r9.f440602i
            r3.<init>(r4)
            r2.f322030d = r3
            java.util.List r2 = kz5.b0.c(r2)
            r0.a(r2)
            com.tencent.mm.flutter.ui.FlutterPageStyle r2 = new com.tencent.mm.flutter.ui.FlutterPageStyle
            r12 = 1
            r13 = -1
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 3556(0xde4, float:4.983E-42)
            r25 = 0
            r11 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            android.content.Context r3 = r9.f440600g
            java.lang.Class<com.tencent.mm.plugin.brandservice.ui.flutter.BizPortraitFlutterViewActivity> r4 = com.tencent.mm.plugin.brandservice.ui.flutter.BizPortraitFlutterViewActivity.class
            r5 = 0
            r6 = 0
            r7 = 24
            r8 = 0
            r11 = 0
            r9.f440597d = r11
            r9.f440598e = r1
            r1 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r26
            java.lang.Object r0 = pi0.l1.n(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r10) goto Lba
            return r10
        Lba:
            android.content.Intent r0 = (android.content.Intent) r0
            rv.i3 r1 = r9.f440601h
            if (r1 == 0) goto Lc3
            r1.a(r0)
        Lc3:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vw.c1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
