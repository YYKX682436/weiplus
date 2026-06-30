package s50;

/* loaded from: classes12.dex */
public final class k1 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s50.l1 f403071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f403072b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f403073c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f403074d;

    public k1(s50.l1 l1Var, int i17, float f17, boolean z17) {
        this.f403071a = l1Var;
        this.f403072b = i17;
        this.f403073c = f17;
        this.f403074d = z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if ((r14.length == 0) == false) goto L21;
     */
    @Override // j35.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onRequestPermissionsResult(int r12, java.lang.String[] r13, int[] r14) {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onRequestPermissionsResult, requestCode: "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r1 = ", permissions: "
            r0.append(r1)
            java.lang.String r1 = "toString(...)"
            r2 = 0
            if (r13 == 0) goto L1e
            java.lang.String r13 = java.util.Arrays.toString(r13)
            kotlin.jvm.internal.o.f(r13, r1)
            goto L1f
        L1e:
            r13 = r2
        L1f:
            r0.append(r13)
            java.lang.String r13 = ", grantResults: "
            r0.append(r13)
            if (r14 == 0) goto L31
            java.lang.String r13 = java.util.Arrays.toString(r14)
            kotlin.jvm.internal.o.f(r13, r1)
            goto L32
        L31:
            r13 = r2
        L32:
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            java.lang.String r0 = "MicroMsg.WebSearch.VoiceSearchService"
            com.tencent.mars.xlog.Log.i(r0, r13)
            r13 = 80
            if (r12 != r13) goto Laf
            r12 = 0
            if (r14 == 0) goto L4f
            int r13 = r14.length
            r1 = 1
            if (r13 != 0) goto L4b
            r13 = r1
            goto L4c
        L4b:
            r13 = r12
        L4c:
            if (r13 != 0) goto L4f
            goto L50
        L4f:
            r1 = r12
        L50:
            if (r1 != 0) goto L53
            goto Laf
        L53:
            r12 = r14[r12]
            if (r12 != 0) goto L63
            s50.l1 r12 = r11.f403071a
            int r13 = r11.f403072b
            float r14 = r11.f403073c
            boolean r0 = r11.f403074d
            r12.Di(r13, r14, r0)
            goto Laf
        L63:
            java.lang.String r12 = "onRequestPermissionsResult: permission denied"
            com.tencent.mars.xlog.Log.i(r0, r12)
            s50.l1 r12 = r11.f403071a
            java.lang.ref.WeakReference r13 = r12.f403081e
            s50.w0 r14 = s50.w0.f403130f
            java.lang.String r0 = "MICROPHONE PERMISSION DENIED"
            r12.Zi(r13, r14, r0)
            android.content.res.Resources r12 = com.tencent.mm.sdk.platformtools.x2.f193075e
            s50.l1 r13 = r11.f403071a
            java.lang.ref.WeakReference r13 = r13.f403081e
            if (r13 == 0) goto L83
            java.lang.Object r13 = r13.get()
            com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView r13 = (com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView) r13
            goto L84
        L83:
            r13 = r2
        L84:
            if (r13 == 0) goto L8a
            android.content.Context r2 = r13.getContext()
        L8a:
            r3 = r2
            r13 = 2131772975(0x7f10462f, float:1.9177325E38)
            java.lang.String r4 = r12.getString(r13)
            r13 = 2131772991(0x7f10463f, float:1.9177357E38)
            java.lang.String r5 = r12.getString(r13)
            r13 = 2131770054(0x7f103ac6, float:1.91714E38)
            java.lang.String r6 = r12.getString(r13)
            r13 = 2131757758(0x7f100abe, float:1.914646E38)
            java.lang.String r7 = r12.getString(r13)
            r8 = 0
            s50.i1 r9 = s50.i1.f403064d
            s50.j1 r10 = s50.j1.f403069d
            db5.e1.C(r3, r4, r5, r6, r7, r8, r9, r10)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s50.k1.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }
}
