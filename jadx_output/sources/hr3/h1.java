package hr3;

/* loaded from: classes8.dex */
public class h1 implements com.tencent.mm.pluginsdk.ui.span.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactInfoUI f283602a;

    public h1(com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI) {
        this.f283602a = contactInfoUI;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    @Override // com.tencent.mm.pluginsdk.ui.span.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(r35.m3 r12) {
        /*
            r11 = this;
            java.lang.String r0 = ""
            int r1 = r12.f369195d
            r2 = 45
            if (r1 != r2) goto L98
            java.lang.String r6 = new java.lang.String
            java.lang.String r1 = r12.e()
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r1, r2)
            r6.<init>(r1)
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Object r12 = r12.b(r1)
            java.lang.String r12 = (java.lang.String) r12
            cl0.g r1 = new cl0.g     // Catch: cl0.f -> L47
            r1.<init>(r12)     // Catch: cl0.f -> L47
            java.lang.String r12 = "fullText"
            java.lang.String r12 = r1.optString(r12)     // Catch: cl0.f -> L47
            java.lang.String r3 = "linkText"
            java.lang.String r3 = r1.optString(r3)     // Catch: cl0.f -> L45
            java.lang.String r4 = new java.lang.String     // Catch: cl0.f -> L49
            java.lang.String r5 = "path"
            java.lang.String r1 = r1.optString(r5)     // Catch: cl0.f -> L49
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: cl0.f -> L49
            if (r1 != 0) goto L3c
            r1 = r0
        L3c:
            byte[] r1 = android.util.Base64.decode(r1, r2)     // Catch: cl0.f -> L49
            r4.<init>(r1)     // Catch: cl0.f -> L49
            r9 = r4
            goto L4a
        L45:
            r3 = r0
            goto L49
        L47:
            r12 = r0
            r3 = r12
        L49:
            r9 = r0
        L4a:
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r10 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject
            r10.<init>()
            r0 = 1082(0x43a, float:1.516E-42)
            r10.f87790f = r0
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r0 = r11.f283602a
            com.tencent.mm.storage.z3 r1 = r0.f153661n
            if (r1 == 0) goto L83
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.tencent.mm.storage.z3 r2 = r0.f153661n
            java.lang.String r2 = r2.d1()
            r1.append(r2)
            java.lang.String r2 = ":2:"
            r1.append(r2)
            r1.append(r12)
            java.lang.String r12 = ":"
            r1.append(r12)
            r1.append(r3)
            r1.append(r12)
            r1.append(r9)
            java.lang.String r12 = r1.toString()
            r10.f87791g = r12
        L83:
            java.lang.Class<com.tencent.mm.plugin.appbrand.service.h6> r12 = com.tencent.mm.plugin.appbrand.service.h6.class
            i95.m r12 = i95.n0.c(r12)
            com.tencent.mm.plugin.appbrand.service.h6 r12 = (com.tencent.mm.plugin.appbrand.service.h6) r12
            androidx.appcompat.app.AppCompatActivity r4 = r0.getContext()
            r5 = 0
            r7 = 0
            r8 = 0
            r3 = r12
            com.tencent.mm.plugin.appbrand.launching.xc r3 = (com.tencent.mm.plugin.appbrand.launching.xc) r3
            r3.aj(r4, r5, r6, r7, r8, r9, r10)
        L98:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: hr3.h1.a(r35.m3):java.lang.Object");
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z
    public java.lang.Object b(r35.m3 m3Var) {
        com.tencent.mm.storage.z3 z3Var;
        int i17 = m3Var.f369195d;
        if ((i17 == 1 || i17 == 25 || i17 == 30 || i17 == 31) && (z3Var = this.f283602a.f153661n) != null) {
            return z3Var.d1();
        }
        return null;
    }
}
