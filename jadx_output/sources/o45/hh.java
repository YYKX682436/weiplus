package o45;

/* loaded from: classes11.dex */
public final class hh {

    /* renamed from: a, reason: collision with root package name */
    public int f342943a;

    /* renamed from: b, reason: collision with root package name */
    public int f342944b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f342945c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f342946d;

    public hh() {
        this.f342943a = 0;
        this.f342944b = 80;
        this.f342945c = "";
        this.f342946d = "";
    }

    public static o45.hh a(java.lang.String str) {
        java.lang.String[] split = str.split(",");
        if (split.length < 4) {
            return null;
        }
        o45.hh hhVar = new o45.hh();
        try {
            hhVar.f342943a = com.tencent.mm.sdk.platformtools.t8.P(split[0], 0);
            java.lang.String str2 = split[1];
            java.lang.String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            hhVar.f342945c = str2;
            hhVar.f342944b = com.tencent.mm.sdk.platformtools.t8.P(split[2], 0);
            java.lang.String str4 = split[3];
            if (str4 != null) {
                str3 = str4;
            }
            hhVar.f342946d = str3;
            return hhVar;
        } catch (java.lang.NumberFormatException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MMBuiltInIP", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }

    public static o45.gh b(java.lang.String str) {
        int[] iArr;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            iArr = null;
        } else {
            java.lang.String[] split = str.split(":");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str2 : split) {
                if (str2 != null && str2.length() > 0) {
                    try {
                        arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.valueOf(str2).intValue()));
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Util", e17, "", new java.lang.Object[0]);
                        com.tencent.mars.xlog.Log.e("MicroMsg.Util", "invalid port num, ignore");
                    }
                }
            }
            int size = arrayList.size();
            iArr = new int[size];
            for (int i17 = 0; i17 < size; i17++) {
                iArr[i17] = ((java.lang.Integer) arrayList.get(i17)).intValue();
            }
        }
        return new o45.gh(null, iArr);
    }

    public static java.lang.String c(java.util.List list) {
        java.util.Iterator it = list.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            str = str + ((o45.hh) it.next()).toString() + "|";
        }
        return str;
    }

    public static java.util.List d(java.lang.String str) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return linkedList;
        }
        try {
            for (java.lang.String str2 : str.split("\\|")) {
                o45.hh a17 = a(str2);
                if (a17 != null) {
                    linkedList.add(a17);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMBuiltInIP", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
        return linkedList;
    }

    public java.lang.String toString() {
        return this.f342943a + "," + this.f342945c + "," + this.f342944b + "," + this.f342946d;
    }

    public hh(int i17, java.lang.String str, int i18, java.lang.String str2) {
        this.f342943a = i17;
        this.f342945c = str;
        this.f342944b = i18;
        this.f342946d = str2;
    }
}
