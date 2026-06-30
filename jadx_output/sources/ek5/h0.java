package ek5;

/* loaded from: classes.dex */
public final class h0 extends ek5.c {
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    @Override // ek5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.Intent c(android.content.Context r8, int r9, java.lang.String r10, android.content.Intent r11) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.o.g(r10, r0)
            java.lang.String r0 = "retransmitIntent"
            kotlin.jvm.internal.o.g(r11, r0)
            java.lang.String r0 = "Select_Conv_Type"
            r1 = -1
            int r0 = r11.getIntExtra(r0, r1)
            java.lang.String r2 = "Select_block_List"
            java.lang.String r2 = r11.getStringExtra(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L32
            int r6 = r2.length()
            if (r6 <= 0) goto L2d
            r6 = r4
            goto L2e
        L2d:
            r6 = r5
        L2e:
            if (r6 != r4) goto L32
            r6 = r4
            goto L33
        L32:
            r6 = r5
        L33:
            if (r6 == 0) goto L51
            r26.t r3 = new r26.t
            java.lang.String r6 = ","
            r3.<init>(r6)
            java.util.List r2 = r3.g(r2, r5)
            java.lang.String[] r3 = new java.lang.String[r5]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.util.ArrayList r3 = com.tencent.mm.sdk.platformtools.t8.P1(r2)
            java.lang.String r2 = "stringsToList(...)"
            kotlin.jvm.internal.o.f(r3, r2)
        L51:
            if (r0 != r1) goto L60
            boolean r2 = r3.isEmpty()
            r2 = r2 ^ r4
            if (r2 == 0) goto L5b
            goto L60
        L5b:
            android.content.Intent r8 = super.c(r8, r9, r10, r11)
            return r8
        L60:
            if (r0 == r1) goto L68
            r9 = r0 & 4
            if (r9 == 0) goto L68
            r9 = r4
            goto L69
        L68:
            r9 = r5
        L69:
            java.lang.String r10 = "wework"
            boolean r10 = r3.contains(r10)
            r10 = r10 ^ r4
            java.lang.String r0 = "Multi_Retr"
            boolean r11 = r11.getBooleanExtra(r0, r5)
            java.lang.Class<rd0.e1> r0 = rd0.e1.class
            i95.m r0 = i95.n0.c(r0)
            rd0.e1 r0 = (rd0.e1) r0
            qd0.q0 r0 = (qd0.q0) r0
            android.content.Intent r8 = r0.Ui(r8, r11, r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ek5.h0.c(android.content.Context, int, java.lang.String, android.content.Intent):android.content.Intent");
    }

    @Override // ek5.b
    public co.a d(android.content.Intent intent, n50.i param) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(param, "param");
        oe5.d dVar = new oe5.d();
        param.a(dVar);
        if (param.d().length() > 0) {
            l15.c cVar = new l15.c();
            cVar.fromXml(param.d());
            dVar.k(cVar);
        }
        return dVar;
    }

    @Override // ek5.b
    public java.lang.Class e() {
        return gk5.z0.class;
    }

    @Override // ek5.b
    public java.lang.Class f() {
        return hk5.f0.class;
    }

    @Override // ek5.b
    public int g() {
        return 49;
    }

    @Override // ek5.b
    public java.lang.Class h() {
        return oe5.d.class;
    }

    @Override // ek5.b
    public java.util.List i() {
        return kz5.b0.c(133);
    }
}
