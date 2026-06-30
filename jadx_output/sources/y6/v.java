package y6;

/* loaded from: classes13.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final q7.k f459613a = new q7.k(1000);

    /* renamed from: b, reason: collision with root package name */
    public final m3.e f459614b = r7.h.a(10, new y6.t(this));

    public java.lang.String a(t6.h hVar) {
        java.lang.Object obj;
        java.lang.String str;
        java.lang.String str2;
        synchronized (this.f459613a) {
            q7.k kVar = this.f459613a;
            synchronized (kVar) {
                obj = ((java.util.LinkedHashMap) kVar.f360302a).get(hVar);
            }
            str = (java.lang.String) obj;
        }
        if (str == null) {
            java.lang.Object a17 = ((r7.e) this.f459614b).a();
            q7.n.b(a17);
            y6.u uVar = (y6.u) a17;
            try {
                hVar.b(uVar.f459611d);
                byte[] digest = uVar.f459611d.digest();
                char[] cArr = q7.p.f360311b;
                synchronized (cArr) {
                    for (int i17 = 0; i17 < digest.length; i17++) {
                        int i18 = digest[i17] & 255;
                        int i19 = i17 * 2;
                        char[] cArr2 = q7.p.f360310a;
                        cArr[i19] = cArr2[i18 >>> 4];
                        cArr[i19 + 1] = cArr2[i18 & 15];
                    }
                    str2 = new java.lang.String(cArr);
                }
                ((r7.e) this.f459614b).b(uVar);
                str = str2;
            } catch (java.lang.Throwable th6) {
                ((r7.e) this.f459614b).b(uVar);
                throw th6;
            }
        }
        synchronized (this.f459613a) {
            this.f459613a.c(hVar, str);
        }
        return str;
    }
}
