package kotlinx.coroutines.flow;

/* loaded from: classes16.dex */
public final class p implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f310356d;

    public p(java.lang.Object[] objArr) {
        this.f310356d = objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005b -> B:10:0x005e). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlinx.coroutines.flow.k r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.o
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.o r0 = (kotlinx.coroutines.flow.o) r0
            int r1 = r0.f310341e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310341e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.o r0 = new kotlinx.coroutines.flow.o
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f310340d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310341e
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            int r8 = r0.f310346m
            int r2 = r0.f310345i
            java.lang.Object r4 = r0.f310344h
            kotlinx.coroutines.flow.k r4 = (kotlinx.coroutines.flow.k) r4
            java.lang.Object r5 = r0.f310343g
            kotlinx.coroutines.flow.p r5 = (kotlinx.coroutines.flow.p) r5
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r4
            goto L5e
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object[] r9 = r7.f310356d
            int r9 = r9.length
            r2 = 0
            r5 = r7
            r6 = r9
            r9 = r8
            r8 = r6
        L47:
            if (r2 >= r8) goto L60
            java.lang.Object[] r4 = r5.f310356d
            r4 = r4[r2]
            r0.f310343g = r5
            r0.f310344h = r9
            r0.f310345i = r2
            r0.f310346m = r8
            r0.f310341e = r3
            java.lang.Object r4 = r9.emit(r4, r0)
            if (r4 != r1) goto L5e
            return r1
        L5e:
            int r2 = r2 + r3
            goto L47
        L60:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.p.a(kotlinx.coroutines.flow.k, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
