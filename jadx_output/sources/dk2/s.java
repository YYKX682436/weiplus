package dk2;

/* loaded from: classes10.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final dk2.r f234051c = new dk2.r(null);

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.j0 f234052a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f234053b;

    public s() {
        ae2.in inVar = ae2.in.f3688a;
        ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.R0).getValue()).r()).intValue();
        this.f234052a = new androidx.lifecycle.j0(-1);
        this.f234053b = new java.util.ArrayList();
    }

    public final java.util.List a() {
        java.util.ArrayList arrayList = this.f234053b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (!(((dk2.yg) obj).f234401i == 2)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final java.util.List b() {
        java.util.ArrayList arrayList = this.f234053b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (((dk2.yg) obj).a()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final dk2.yg c() {
        java.lang.Integer num = (java.lang.Integer) this.f234052a.getValue();
        if (num == null) {
            num = -1;
        }
        int intValue = num.intValue();
        if (intValue < 0) {
            return null;
        }
        java.util.ArrayList arrayList = this.f234053b;
        if (intValue < arrayList.size()) {
            return (dk2.yg) arrayList.get(intValue);
        }
        return null;
    }

    public final java.lang.String d(int i17, java.util.LinkedList nameList) {
        kotlin.jvm.internal.o.g(nameList, "nameList");
        java.lang.String str = "";
        int i18 = 0;
        for (java.lang.Object obj : nameList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            str = str + ((java.lang.String) obj);
            if (i18 < nameList.size() - 1) {
                str = str + (char) 12289;
            }
            i18 = i19;
        }
        if (str.length() == 0) {
            return str;
        }
        if (i17 <= 3) {
            return str + " 想听";
        }
        return str + "…等" + i17 + "人想听";
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.util.List r35, java.lang.String r36, yz5.l r37) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.s.e(java.util.List, java.lang.String, yz5.l):void");
    }

    public final void f(r45.f81 resp, android.content.Context context) {
        java.util.ArrayList<dk2.yg> arrayList;
        kotlin.jvm.internal.o.g(resp, "resp");
        kotlin.jvm.internal.o.g(context, "context");
        int i17 = 1;
        try {
            java.util.LinkedList<r45.cc6> list = resp.getList(1);
            int i18 = 0;
            if (list != null) {
                arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                for (r45.cc6 cc6Var : list) {
                    java.lang.String string = cc6Var.getString(i18);
                    if (string == null) {
                        string = "";
                    }
                    java.lang.String str = string;
                    long j17 = cc6Var.getLong(i17);
                    int integer = cc6Var.getInteger(3);
                    java.util.LinkedList list2 = cc6Var.getList(2);
                    kotlin.jvm.internal.o.f(list2, "getRequest_member_names(...)");
                    arrayList.add(new dk2.yg(str, j17, 3, false, false, false, false, d(integer, list2), cc6Var.getInteger(4), 120, null));
                    i17 = 1;
                    i18 = 0;
                }
            } else {
                arrayList = null;
            }
            java.lang.String string2 = resp.getString(2);
            java.util.ArrayList arrayList2 = this.f234053b;
            arrayList2.clear();
            androidx.lifecycle.j0 j0Var = this.f234052a;
            if (arrayList != null) {
                for (dk2.yg ygVar : arrayList) {
                    if (kotlin.jvm.internal.o.b(ygVar.f234393a, string2)) {
                        if (ygVar.f234393a.length() > 0) {
                            ygVar.f234395c = 4;
                        }
                    }
                }
                arrayList2.addAll(arrayList);
                int i19 = 0;
                for (java.lang.Object obj : arrayList2) {
                    int i27 = i19 + 1;
                    if (i19 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    if (kotlin.jvm.internal.o.b(((dk2.yg) obj).f234393a, string2)) {
                        j0Var.postValue(java.lang.Integer.valueOf(i19));
                    }
                    i19 = i27;
                }
            }
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicData", "updateMusicInfo curSong:" + string2 + ", curPlayPos:" + j0Var.getValue() + ", size:" + arrayList2.size());
            f234051c.a(arrayList2, "updateMusicInfo", true);
        } catch (java.lang.Exception e17) {
            pm0.z.b(xy2.b.f458155b, "updateMusicInfo", false, null, null, false, false, null, 124, null);
            hc2.c.a(e17, "FinderLiveAnchorMusicData updateMusicInfo");
        }
    }
}
