package uh1;

/* loaded from: classes7.dex */
public class i0 implements javax.net.ssl.HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ javax.net.ssl.HostnameVerifier f427800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f427801b;

    public i0(javax.net.ssl.HostnameVerifier hostnameVerifier, java.util.ArrayList arrayList) {
        this.f427800a = hostnameVerifier;
        this.f427801b = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // javax.net.ssl.HostnameVerifier
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean verify(java.lang.String r4, javax.net.ssl.SSLSession r5) {
        /*
            r3 = this;
            javax.net.ssl.HostnameVerifier r0 = r3.f427800a
            boolean r5 = r0.verify(r4, r5)
            r0 = 1
            if (r5 != 0) goto L2f
            r5 = 0
            java.util.ArrayList r1 = r3.f427801b
            if (r1 == 0) goto L2a
            if (r4 != 0) goto L11
            goto L2a
        L11:
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L15
            goto L2a
        L28:
            r4 = r5
            goto L2b
        L2a:
            r4 = r0
        L2b:
            if (r4 == 0) goto L2e
            goto L2f
        L2e:
            r0 = r5
        L2f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uh1.i0.verify(java.lang.String, javax.net.ssl.SSLSession):boolean");
    }
}
