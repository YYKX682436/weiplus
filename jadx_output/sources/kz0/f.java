package kz0;

/* loaded from: classes14.dex */
public final class f implements b0.q1 {

    /* renamed from: a, reason: collision with root package name */
    public final z.d0 f313693a;

    /* renamed from: b, reason: collision with root package name */
    public final float f313694b;

    public f(z.d0 flingDecay, float f17) {
        kotlin.jvm.internal.o.g(flingDecay, "flingDecay");
        this.f313693a = flingDecay;
        this.f313694b = f17;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // b0.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(b0.p2 r19, float r20, kotlin.coroutines.Continuation r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            boolean r3 = r2 instanceof kz0.d
            if (r3 == 0) goto L19
            r3 = r2
            kz0.d r3 = (kz0.d) r3
            int r4 = r3.f313675g
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f313675g = r4
            goto L1e
        L19:
            kz0.d r3 = new kz0.d
            r3.<init>(r0, r2)
        L1e:
            r8 = r3
            java.lang.Object r2 = r8.f313673e
            pz5.a r3 = pz5.a.f359186d
            int r4 = r8.f313675g
            r5 = 1
            if (r4 == 0) goto L3a
            if (r4 != r5) goto L32
            java.lang.Object r1 = r8.f313672d
            kotlin.jvm.internal.e0 r1 = (kotlin.jvm.internal.e0) r1
            kotlin.ResultKt.throwOnFailure(r2)
            goto L8e
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            kotlin.ResultKt.throwOnFailure(r2)
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            float r4 = r0.f313694b
            if (r2 <= 0) goto L49
            float r1 = java.lang.Math.min(r1, r4)
            goto L4e
        L49:
            float r2 = -r4
            float r1 = java.lang.Math.max(r1, r2)
        L4e:
            r10 = r1
            float r1 = java.lang.Math.abs(r10)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L90
            kotlin.jvm.internal.e0 r1 = new kotlin.jvm.internal.e0
            r1.<init>()
            r1.f310115d = r10
            kotlin.jvm.internal.e0 r2 = new kotlin.jvm.internal.e0
            r2.<init>()
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 28
            r17 = 0
            z.r r4 = z.s.a(r9, r10, r11, r13, r15, r16, r17)
            z.d0 r6 = r0.f313693a
            r7 = 0
            kz0.e r9 = new kz0.e
            r10 = r19
            r9.<init>(r2, r10, r1)
            r2 = 2
            r10 = 0
            r8.f313672d = r1
            r8.f313675g = r5
            r5 = r6
            r6 = r7
            r7 = r9
            r9 = r2
            java.lang.Object r2 = z.z1.b(r4, r5, r6, r7, r8, r9, r10)
            if (r2 != r3) goto L8e
            return r3
        L8e:
            float r10 = r1.f310115d
        L90:
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kz0.f.a(b0.p2, float, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
