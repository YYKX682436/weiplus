package zs1;

/* loaded from: classes7.dex */
public abstract class g {
    public static final void a(java.util.List resUrlList, java.lang.String host, java.lang.String documentUrl) {
        kotlin.jvm.internal.o.g(resUrlList, "resUrlList");
        kotlin.jvm.internal.o.g(host, "host");
        kotlin.jvm.internal.o.g(documentUrl, "documentUrl");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(resUrlList, 10));
        java.util.Iterator it = resUrlList.iterator();
        while (it.hasNext()) {
            arrayList.add(new zs1.d((java.lang.String) it.next()));
        }
        b(arrayList, host, documentUrl);
    }

    public static final void b(java.util.List list, java.lang.String str, java.lang.String str2) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            zs1.d dVar = (zs1.d) it.next();
            java.lang.String o17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.o(str, dVar.f475236a);
            nu4.k kVar = nu4.b0.f340241J;
            if (!nu4.b0.Q.O(o17)) {
                ((ku5.t0) ku5.t0.f312615d).g(new zs1.f(dVar, o17, str, str2));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0321  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean c(boolean r40, boolean r41, com.tencent.mm.vfs.r6 r42, ts1.o r43, ts1.o r44, java.lang.String r45, java.util.HashMap r46) {
        /*
            Method dump skipped, instructions count: 1262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zs1.g.c(boolean, boolean, com.tencent.mm.vfs.r6, ts1.o, ts1.o, java.lang.String, java.util.HashMap):boolean");
    }
}
