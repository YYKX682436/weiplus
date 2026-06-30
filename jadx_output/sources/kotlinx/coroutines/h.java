package kotlinx.coroutines;

/* loaded from: classes14.dex */
public abstract class h {
    public static final java.lang.Object a(java.util.Collection collection, kotlin.coroutines.Continuation continuation) {
        if (collection.isEmpty()) {
            return kz5.p0.f313996d;
        }
        java.lang.Object[] array = collection.toArray(new kotlinx.coroutines.f1[0]);
        if (array != null) {
            return new kotlinx.coroutines.e((kotlinx.coroutines.f1[]) array).a(continuation);
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final java.lang.Object b(kotlinx.coroutines.f1[] f1VarArr, kotlin.coroutines.Continuation continuation) {
        return f1VarArr.length == 0 ? kz5.p0.f313996d : new kotlinx.coroutines.e(f1VarArr).a(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(java.util.Collection r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.g
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.g r0 = (kotlinx.coroutines.g) r0
            int r1 = r0.f310475f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310475f = r1
            goto L18
        L13:
            kotlinx.coroutines.g r0 = new kotlinx.coroutines.g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f310474e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310475f
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f310473d
            java.util.Iterator r4 = (java.util.Iterator) r4
            kotlin.ResultKt.throwOnFailure(r5)
            goto L3c
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.next()
            kotlinx.coroutines.r2 r5 = (kotlinx.coroutines.r2) r5
            r0.f310473d = r4
            r0.f310475f = r3
            java.lang.Object r5 = r5.C(r0)
            if (r5 != r1) goto L3c
            return r1
        L53:
            jz5.f0 r4 = jz5.f0.f302826a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.h.c(java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:10:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(kotlinx.coroutines.r2[] r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.f
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.f r0 = (kotlinx.coroutines.f) r0
            int r1 = r0.f310179h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310179h = r1
            goto L18
        L13:
            kotlinx.coroutines.f r0 = new kotlinx.coroutines.f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f310178g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310179h
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r6 = r0.f310177f
            int r2 = r0.f310176e
            java.lang.Object r4 = r0.f310175d
            kotlinx.coroutines.r2[] r4 = (kotlinx.coroutines.r2[]) r4
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r4
            goto L53
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.ResultKt.throwOnFailure(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L40:
            if (r2 >= r6) goto L55
            r4 = r7[r2]
            r0.f310175d = r7
            r0.f310176e = r2
            r0.f310177f = r6
            r0.f310179h = r3
            java.lang.Object r4 = r4.C(r0)
            if (r4 != r1) goto L53
            return r1
        L53:
            int r2 = r2 + r3
            goto L40
        L55:
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.h.d(kotlinx.coroutines.r2[], kotlin.coroutines.Continuation):java.lang.Object");
    }
}
