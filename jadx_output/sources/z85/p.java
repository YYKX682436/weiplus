package z85;

/* loaded from: classes4.dex */
public class p extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f470815e = {l75.n0.getCreateSQLs(z85.o.f470814p, "EmojiSuggestDescInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f470816d;

    public p(l75.k0 k0Var) {
        super(k0Var, z85.o.f470814p, "EmojiSuggestDescInfo", null);
        this.f470816d = k0Var;
    }

    public boolean y0(java.util.ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiDescMapStorage", "group list is null.");
            return false;
        }
        l75.k0 k0Var = this.f470816d;
        long F = k0Var != null ? k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId())) : -1L;
        k0Var.delete("EmojiSuggestDescInfo", "", null);
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) it.next();
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    java.lang.String str = (java.lang.String) it6.next();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(i17);
                        sb6.append("");
                        insert(new z85.o(i17 + "", str));
                    }
                }
                i17++;
            }
        }
        if (k0Var != null) {
            k0Var.w(java.lang.Long.valueOf(F));
        }
        return false;
    }
}
