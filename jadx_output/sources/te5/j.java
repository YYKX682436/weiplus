package te5;

/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final te5.j f418686a = new te5.j();

    /* JADX WARN: Removed duplicated region for block: B:38:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final te5.i a(com.tencent.mm.storage.f9 r17, java.lang.String r18, android.content.Context r19) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: te5.j.a(com.tencent.mm.storage.f9, java.lang.String, android.content.Context):te5.i");
    }

    public final int b(java.lang.String str) {
        pt.m0 m0Var = (pt.m0) i95.n0.c(pt.m0.class);
        if (str == null) {
            str = "";
        }
        ((ot.g) m0Var).getClass();
        ut.d.f430602f.a();
        if (!com.tencent.mm.ui.bk.C()) {
            yu.h a17 = yu.h.f465762a.a(str);
            if (!(kotlin.jvm.internal.o.b(a17, yu.d.f465758b) ? true : kotlin.jvm.internal.o.b(a17, yu.g.f465761b) ? true : kotlin.jvm.internal.o.b(a17, yu.b.f465757b) ? true : kotlin.jvm.internal.o.b(a17, yu.e.f465759b))) {
                if (!kotlin.jvm.internal.o.b(a17, yu.f.f465760b)) {
                    throw new jz5.j();
                }
                ((ht.s) ((jt.a0) i95.n0.c(jt.a0.class))).getClass();
                java.lang.String p17 = com.tencent.mm.pluginsdk.model.t3.p(str);
                int i17 = 0;
                while (true) {
                    if (i17 >= 12) {
                        i17 = -1;
                        break;
                    }
                    if (com.tencent.mm.pluginsdk.model.t3.f189442a[i17].equals(p17)) {
                        break;
                    }
                    i17++;
                }
                if (i17 == -1 || p17.equals("text/plain")) {
                }
            }
            return com.tencent.mm.R.color.Link_120;
        }
        return com.tencent.mm.R.color.f478553an;
    }
}
