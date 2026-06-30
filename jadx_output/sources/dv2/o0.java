package dv2;

/* loaded from: classes10.dex */
public final class o0 extends com.tencent.mm.ui.component.UIComponent implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f243913d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f243914e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f243915f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f243916g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r3 == true) goto L21;
     */
    @Override // dn.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int r4(java.lang.String r3, int r4, dn.g r5, dn.h r6, boolean r7) {
        /*
            r2 = this;
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "mediaId:"
            r5.<init>(r7)
            r5.append(r3)
            java.lang.String r7 = " startRet:"
            r5.append(r7)
            r5.append(r4)
            java.lang.String r7 = " sceneResult:"
            r5.append(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "FinderPostAudioUIC"
            com.tencent.mars.xlog.Log.i(r7, r5)
            r5 = 0
            if (r6 == 0) goto L29
            int r7 = r6.field_retCode
            goto L2a
        L29:
            r7 = r5
        L2a:
            java.lang.String r0 = ""
            if (r4 == 0) goto L32
            r1 = -21005(0xffffffffffffadf3, float:NaN)
            if (r4 != r1) goto L34
        L32:
            if (r7 == 0) goto L3c
        L34:
            yz5.l r3 = r2.f243916g
            if (r3 == 0) goto L3b
            r3.invoke(r0)
        L3b:
            return r5
        L3c:
            java.lang.String r4 = r2.f243915f
            if (r4 == 0) goto L48
            boolean r3 = r4.equals(r3)
            r4 = 1
            if (r3 != r4) goto L48
            goto L49
        L48:
            r4 = r5
        L49:
            if (r4 == 0) goto L5a
            if (r6 == 0) goto L5a
            java.lang.String r3 = r6.field_fileUrl
            if (r3 != 0) goto L52
            goto L53
        L52:
            r0 = r3
        L53:
            yz5.l r3 = r2.f243916g
            if (r3 == 0) goto L5a
            r3.invoke(r0)
        L5a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dv2.o0.r4(java.lang.String, int, dn.g, dn.h, boolean):int");
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
