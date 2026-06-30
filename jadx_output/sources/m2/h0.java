package m2;

/* loaded from: classes13.dex */
public abstract class h0 {
    /* JADX WARN: Code restructure failed: missing block: B:36:0x002f, code lost:
    
        if (r4 == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object[] a(java.lang.Class r10, int r11) {
        /*
            r0 = 0
            if (r10 == 0) goto L60
            java.lang.reflect.Constructor[] r10 = r10.getConstructors()     // Catch: xz5.b -> L58
            java.lang.String r1 = "parameterProviderClass.constructors"
            kotlin.jvm.internal.o.f(r10, r1)     // Catch: xz5.b -> L58
            int r1 = r10.length     // Catch: xz5.b -> L58
            r2 = 0
            r3 = r0
            r4 = r3
            r5 = r2
        L11:
            r6 = 1
            if (r3 >= r1) goto L2f
            r7 = r10[r3]     // Catch: xz5.b -> L58
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch: xz5.b -> L58
            java.lang.String r9 = "it.parameterTypes"
            kotlin.jvm.internal.o.f(r8, r9)     // Catch: xz5.b -> L58
            int r8 = r8.length     // Catch: xz5.b -> L58
            if (r8 != 0) goto L24
            r8 = r6
            goto L25
        L24:
            r8 = r0
        L25:
            if (r8 == 0) goto L2c
            if (r4 == 0) goto L2a
            goto L31
        L2a:
            r4 = r6
            r5 = r7
        L2c:
            int r3 = r3 + 1
            goto L11
        L2f:
            if (r4 != 0) goto L32
        L31:
            r5 = r2
        L32:
            java.lang.reflect.Constructor r5 = (java.lang.reflect.Constructor) r5     // Catch: xz5.b -> L58
            if (r5 == 0) goto L50
            r5.setAccessible(r6)     // Catch: xz5.b -> L58
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch: xz5.b -> L58
            java.lang.Object r10 = r5.newInstance(r10)     // Catch: xz5.b -> L58
            if (r10 == 0) goto L48
            android.support.v4.media.f.a(r10)     // Catch: xz5.b -> L58
            if (r11 >= 0) goto L47
            throw r2
        L47:
            throw r2
        L48:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch: xz5.b -> L58
            java.lang.String r11 = "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>"
            r10.<init>(r11)     // Catch: xz5.b -> L58
            throw r10     // Catch: xz5.b -> L58
        L50:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch: xz5.b -> L58
            java.lang.String r11 = "PreviewParameterProvider constructor can not have parameters"
            r10.<init>(r11)     // Catch: xz5.b -> L58
            throw r10     // Catch: xz5.b -> L58
        L58:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle."
            r10.<init>(r11)
            throw r10
        L60:
            java.lang.Object[] r10 = new java.lang.Object[r0]
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.h0.a(java.lang.Class, int):java.lang.Object[]");
    }
}
