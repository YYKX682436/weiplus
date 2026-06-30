package vx5;

/* loaded from: classes13.dex */
public class e0 extends com.tencent.xweb.internal.ProxyWebViewClientExtension {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vx5.i0 f441338a;

    public e0(vx5.i0 i0Var) {
        this.f441338a = i0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    @Override // com.tencent.xweb.internal.ProxyWebViewClientExtension
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onMiscCallBack(java.lang.String r7, android.os.Bundle r8) {
        /*
            r6 = this;
            vx5.i0 r0 = r6.f441338a
            com.tencent.xweb.h3 r1 = r0.f441366t
            r2 = 0
            if (r1 == 0) goto L77
            r1.getClass()
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            if (r3 != 0) goto L4f
            java.lang.String r3 = "onContentHeightChanged"
            boolean r3 = r7.equalsIgnoreCase(r3)
            if (r3 == 0) goto L4f
            java.lang.String r3 = "height"
            int r3 = r8.getInt(r3)
            int r4 = r1.f220296a
            if (r3 == r4) goto L4f
            r1.f220296a = r3
            tx5.f r1 = r1.f220297b
            if (r1 == 0) goto L4f
            com.tencent.xweb.g1 r4 = r1.getWebViewCallbackClient()
            if (r4 == 0) goto L4f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onContentHeightChanged, height:"
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "XWebWebViewClientExtensionInterceptor"
            by5.c4.f(r5, r4)
            com.tencent.xweb.g1 r1 = r1.getWebViewCallbackClient()
            r1.b(r3)
            com.tencent.xweb.g3 r1 = new com.tencent.xweb.g3
            r3 = 1
            r1.<init>(r3, r2)
            goto L55
        L4f:
            com.tencent.xweb.g3 r1 = new com.tencent.xweb.g3
            r3 = 0
            r1.<init>(r3, r2)
        L55:
            boolean r3 = r1.f220286a
            if (r3 == 0) goto L77
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "onMiscCallBack, method("
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = ") intercepted, result:"
            r8.append(r7)
            java.lang.Object r7 = r1.f220287b
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "PinusWebView"
            by5.c4.f(r0, r8)
            return r7
        L77:
            com.tencent.xweb.internal.ProxyWebViewClientExtension r0 = r0.f441365s
            if (r0 == 0) goto L80
            java.lang.Object r7 = r0.onMiscCallBack(r7, r8)
            return r7
        L80:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: vx5.e0.onMiscCallBack(java.lang.String, android.os.Bundle):java.lang.Object");
    }
}
