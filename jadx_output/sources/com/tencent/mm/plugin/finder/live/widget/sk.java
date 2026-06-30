package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes2.dex */
public final class sk extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f119789d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f119790e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f119791f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f119792g;

    /* renamed from: h, reason: collision with root package name */
    public int f119793h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f119794i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f119795m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f119796n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk(java.util.LinkedList linkedList, long j17, java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f119794i = linkedList;
        this.f119795m = j17;
        this.f119796n = obj;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.sk(this.f119794i, this.f119795m, this.f119796n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.sk) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004f -> B:5:0x0073). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0070 -> B:5:0x0073). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r12.f119793h
            java.lang.String r2 = "FinderLiveGiftPlayPagWidget"
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 != r3) goto L1c
            long r4 = r12.f119789d
            java.lang.Object r1 = r12.f119792g
            r45.zy6 r1 = (r45.zy6) r1
            java.lang.Object r6 = r12.f119791f
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r12.f119790e
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r12
            goto L73
        L1c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L24:
            kotlin.ResultKt.throwOnFailure(r13)
            java.util.LinkedList r13 = r12.f119794i
            java.util.Iterator r13 = r13.iterator()
            long r4 = r12.f119795m
            java.lang.Object r1 = r12.f119796n
            r6 = r13
            r7 = r1
            r13 = r12
        L34:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto La5
            java.lang.Object r1 = r6.next()
            r45.zy6 r1 = (r45.zy6) r1
            r8 = 0
            long r8 = r1.getLong(r8)
            long r10 = c01.id.c()
            long r10 = r10 - r4
            long r8 = r8 - r10
            r10 = 0
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 <= 0) goto L73
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "doVibrate delay:"
            r10.<init>(r11)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            com.tencent.mars.xlog.Log.i(r2, r10)
            r13.f119790e = r7
            r13.f119791f = r6
            r13.f119792g = r1
            r13.f119789d = r4
            r13.f119793h = r3
            java.lang.Object r8 = kotlinx.coroutines.k1.b(r8, r13)
            if (r8 != r0) goto L73
            return r0
        L73:
            long r8 = r1.getLong(r3)
            r10 = 10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L7e
            goto L82
        L7e:
            long r10 = r1.getLong(r3)
        L82:
            boolean r1 = r7 instanceof android.os.Vibrator
            if (r1 == 0) goto L34
            java.lang.String r1 = "doVibrate"
            com.tencent.mars.xlog.Log.i(r2, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r8 = 26
            if (r1 < r8) goto L9e
            r1 = r7
            android.os.Vibrator r1 = (android.os.Vibrator) r1
            r8 = 255(0xff, float:3.57E-43)
            android.os.VibrationEffect r8 = android.os.VibrationEffect.createOneShot(r10, r8)
            r1.vibrate(r8)
            goto L34
        L9e:
            r1 = r7
            android.os.Vibrator r1 = (android.os.Vibrator) r1
            r1.vibrate(r10)
            goto L34
        La5:
            jz5.f0 r13 = jz5.f0.f302826a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.sk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
