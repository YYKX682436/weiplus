package f92;

/* loaded from: classes8.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final f92.e f260241d = new f92.e();

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        boolean z18 = false;
        try {
            java.util.LinkedList y07 = ((c61.l7) i95.n0.c(c61.l7.class)).Vj().y0();
            com.tencent.mars.xlog.Log.i("Finder.AccountLogicHandler", "checkAccountDeletingTask size:" + y07.size());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : y07) {
                if (((so2.i4) obj).systemRowid != -1) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                so2.i4 i4Var = (so2.i4) it.next();
                com.tencent.mars.xlog.Log.i("Finder.AccountLogicHandler", "checkAccountDeletingTask del username = " + i4Var.field_username + ", type:" + i4Var.field_type);
                int i17 = i4Var.field_type;
                if (i17 == 1) {
                    g92.b bVar = g92.b.f269769e;
                    java.lang.String field_username = i4Var.field_username;
                    kotlin.jvm.internal.o.f(field_username, "field_username");
                    bVar.V4(field_username, m92.j.f325007y);
                } else if (i17 != 2) {
                    com.tencent.mars.xlog.Log.i("Finder.AccountLogicHandler", "checkAccountDeletingTask unknown type:" + i4Var.field_type);
                } else {
                    c61.l7 l7Var = (c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class));
                    l7Var.getClass();
                    ((ku5.t0) ku5.t0.f312615d).q(new c61.j4(i4Var, "checkAccountDeletingTask", l7Var));
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("Finder.AccountLogicHandler", "checkAccountDeletingTask Exception:" + e17.getMessage());
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar2 = kb2.b.f306225a;
            }
            if (z18) {
                throw e17;
            }
        }
    }
}
