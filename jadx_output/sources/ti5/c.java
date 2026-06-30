package ti5;

/* loaded from: classes.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x006b, code lost:
    
        if (r0 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ri5.j a(androidx.appcompat.app.AppCompatActivity r17, java.lang.String r18, com.tencent.mm.storage.z3 r19, int r20, ti5.d r21) {
        /*
            r16 = this;
            r6 = r17
            r12 = r21
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.o.g(r6, r0)
            java.lang.String r0 = "id"
            r8 = r18
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.String r0 = "contact"
            r15 = r19
            kotlin.jvm.internal.o.g(r15, r0)
            java.lang.String r0 = "extension"
            kotlin.jvm.internal.o.g(r12, r0)
            si5.a r0 = si5.b.f408325a
            p13.r r2 = r12.f419665b
            p13.y r4 = r12.f419664a
            r5 = 0
            r1 = r17
            r3 = r19
            si5.e r0 = r0.b(r1, r2, r3, r4, r5)
            ri5.j r1 = new ri5.j
            java.lang.String r10 = r19.d1()
            java.lang.String r2 = "getUsername(...)"
            kotlin.jvm.internal.o.f(r10, r2)
            java.lang.CharSequence r2 = r0.f408329a
            java.lang.String r3 = ""
            if (r2 != 0) goto L3e
            r11 = r3
            goto L3f
        L3e:
            r11 = r2
        L3f:
            r13 = 0
            r14 = 32
            r2 = 0
            r7 = r1
            r8 = r18
            r9 = r20
            r12 = r21
            r15 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.CharSequence r0 = r0.f408330b
            r1.n(r0)
            java.lang.Class<j41.b0> r0 = j41.b0.class
            i95.m r0 = i95.n0.c(r0)
            j41.b0 r0 = (j41.b0) r0
            if (r0 == 0) goto L6e
            java.lang.String r2 = r19.Q0()
            java.lang.String r4 = r19.G0()
            l41.q2 r0 = (l41.q2) r0
            java.lang.String r0 = r0.fj(r2, r4)
            if (r0 == 0) goto L6e
            goto L6f
        L6e:
            r0 = r3
        L6f:
            r1.f396116m = r0
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.J0(r0)
            if (r0 != 0) goto L95
            java.lang.String r0 = "3552365301"
            java.lang.String r2 = r19.Q0()
            boolean r0 = kotlin.jvm.internal.o.b(r0, r2)
            if (r0 == 0) goto L95
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "@"
            r0.<init>(r2)
            java.lang.CharSequence r2 = r1.f396116m
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.f396116m = r0
        L95:
            boolean r0 = r6 instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity
            r2 = 0
            if (r0 == 0) goto Lcc
            r0 = r6
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity r0 = (com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) r0
            j75.f r0 = r0.getStateCenter()
            if (r0 == 0) goto Lcc
            j75.a r0 = r0.getState()
            wi5.n0 r0 = (wi5.n0) r0
            if (r0 == 0) goto Lcc
            boolean r4 = r0.e()
            r1.f396127x = r4
            java.lang.String r4 = r1.f396111f
            boolean r5 = r0.f(r4)
            r1.f396126w = r5
            boolean r5 = r0.d(r4)
            r1.f396125v = r5
            if (r5 != 0) goto Lc9
            boolean r0 = r0.e(r4)
            if (r0 == 0) goto Lc9
            r0 = 1
            goto Lca
        Lc9:
            r0 = r2
        Lca:
            r1.f396115l1 = r0
        Lcc:
            r1.f396118o = r2
            r1.f396119p = r3
            r1.f396120q = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ti5.c.a(androidx.appcompat.app.AppCompatActivity, java.lang.String, com.tencent.mm.storage.z3, int, ti5.d):ri5.j");
    }

    public final ri5.j b(androidx.appcompat.app.AppCompatActivity activity, java.lang.String id6, com.tencent.mm.storage.z3 contact, int i17, ti5.d extension) {
        j75.f stateCenter;
        wi5.n0 n0Var;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(contact, "contact");
        kotlin.jvm.internal.o.g(extension, "extension");
        si5.a aVar = si5.b.f408325a;
        si5.e b17 = aVar.b(activity, extension.f419665b, contact, extension.f419664a, null);
        java.lang.String d17 = contact.d1();
        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
        java.lang.CharSequence charSequence = b17.f408329a;
        java.lang.String str = "";
        ri5.j jVar = new ri5.j(id6, i17, d17, charSequence == null ? "" : charSequence, extension, 0, 32, null);
        jVar.n(b17.f408330b);
        j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
        if (b0Var != null) {
            java.lang.String fj6 = ((l41.q2) b0Var).fj(contact.Q0(), contact.G0());
            if (fj6 != null) {
                str = fj6;
            }
        }
        jVar.f396116m = str;
        if (!com.tencent.mm.sdk.platformtools.t8.J0(str) && kotlin.jvm.internal.o.b("3552365301", contact.Q0())) {
            jVar.f396116m = "@" + ((java.lang.Object) jVar.f396116m);
        }
        if ((activity instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) && (stateCenter = ((com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) activity).getStateCenter()) != null && (n0Var = (wi5.n0) stateCenter.getState()) != null) {
            jVar.f396127x = n0Var.e();
            java.lang.String str2 = jVar.f396111f;
            jVar.f396126w = n0Var.f(str2);
            boolean d18 = n0Var.d(str2);
            jVar.f396125v = d18;
            jVar.f396115l1 = !d18 && n0Var.e(str2);
        }
        si5.d c17 = aVar.c(extension.f419669f, contact, null);
        extension.f419669f = c17.f408326a;
        java.lang.String str3 = c17.f408327b;
        kotlin.jvm.internal.o.g(str3, "<set-?>");
        extension.f419670g = str3;
        jVar.o(c17.f408328c);
        return jVar;
    }
}
