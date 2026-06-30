package e43;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e43.e f249361a = new e43.e();

    public final java.util.List a(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "list");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        while (it.hasNext()) {
            w33.c cVar = (w33.c) it.next();
            java.lang.String str = cVar.f442710b.f442716b;
            if (!(str == null || str.length() == 0)) {
                int i28 = cVar.f442712d;
                if (i28 == 1) {
                    i17++;
                    i28 = i17;
                } else if (i28 == 101) {
                    i28 = i18 + 101;
                    i18++;
                } else if (i28 == 201) {
                    i28 = i19 + 201;
                    i19++;
                } else if (i28 == 701) {
                    i28 = i27 + 701;
                    i27++;
                }
                jz5.l topTip = cVar.f442709a;
                kotlin.jvm.internal.o.g(topTip, "topTip");
                w33.e user = cVar.f442710b;
                kotlin.jvm.internal.o.g(user, "user");
                arrayList.add(new w33.c(topTip, user, cVar.f442711c, i28));
            }
        }
        return arrayList;
    }
}
