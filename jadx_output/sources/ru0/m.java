package ru0;

/* loaded from: classes5.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f399689a = jz5.h.b(ru0.i.f399677d);

    public static final com.tencent.mm.vfs.r6 a() {
        return (com.tencent.mm.vfs.r6) ((jz5.n) f399689a).getValue();
    }

    public static final com.tencent.mm.vfs.r6 b(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        if (!a().m()) {
            a().J();
        }
        byte[] bytes = str.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(a(), kk.k.g(bytes));
        if (!r6Var.m()) {
            r6Var.J();
        }
        return r6Var;
    }

    public static final java.util.List c(java.lang.String str, java.util.List list, java.lang.String str2, long j17, long j18, float f17) {
        if ((str == null || str.length() == 0) || j18 <= j17) {
            return null;
        }
        java.lang.String e17 = ru0.t.e(str, "");
        if (e17.length() <= ru0.t.c(str2)) {
            r45.le4 le4Var = new r45.le4();
            le4Var.f379379f = e17;
            le4Var.f379380g = str2;
            le4Var.f379377d = 0L;
            le4Var.f379378e = ((float) (j18 - j17)) / f17;
            return kz5.b0.c(le4Var);
        }
        if (list == null) {
            return null;
        }
        ru0.q qVar = new ru0.q(list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            bw5.qz qzVar = (bw5.qz) obj;
            java.lang.String text = qzVar.getText();
            long j19 = qzVar.f32333e;
            long j27 = qzVar.f32334f;
            kotlin.jvm.internal.o.d(text);
            ru0.n nVar = (!(text.length() > 0) || j27 < j19) ? null : ((java.lang.Boolean) qVar.invoke(java.lang.Integer.valueOf(i17))).booleanValue() ? new ru0.n(" ".concat(text), j19, j27) : new ru0.n(text, j19, j27);
            if (nVar != null) {
                arrayList.add(nVar);
            }
            i17 = i18;
        }
        java.util.List<ru0.f> b17 = ru0.t.b(arrayList, str2, e17.length());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(b17, 10));
        for (ru0.f fVar : b17) {
            r45.le4 le4Var2 = new r45.le4();
            le4Var2.f379379f = fVar.f399667a;
            le4Var2.f379380g = str2;
            le4Var2.f379377d = fVar.f399668b - j17;
            le4Var2.f379378e = ((float) (fVar.f399669c - r5)) / f17;
            arrayList2.add(le4Var2);
        }
        return arrayList2;
    }

    public static final java.util.List d(org.json.JSONObject jSONObject, java.lang.String str, long j17, long j18, float f17) {
        java.lang.String optString = jSONObject.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
        if ((optString == null || optString.length() == 0) || j18 <= j17) {
            return null;
        }
        kotlin.jvm.internal.o.d(optString);
        java.lang.String e17 = ru0.t.e(optString, "");
        if (e17.length() <= ru0.t.c(str)) {
            r45.le4 le4Var = new r45.le4();
            le4Var.f379379f = e17;
            le4Var.f379380g = str;
            le4Var.f379377d = 0L;
            le4Var.f379378e = ((float) (j18 - j17)) / f17;
            return kz5.b0.c(le4Var);
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("words");
        if (optJSONArray == null) {
            return null;
        }
        java.util.List<ru0.f> b17 = ru0.t.b(ru0.t.a(optJSONArray, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "ms_begin", "ms_end", false), str, e17.length());
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
        for (ru0.f fVar : b17) {
            r45.le4 le4Var2 = new r45.le4();
            le4Var2.f379379f = fVar.f399667a;
            le4Var2.f379380g = str;
            le4Var2.f379377d = fVar.f399668b - j17;
            le4Var2.f379378e = ((float) (fVar.f399669c - r1)) / f17;
            arrayList.add(le4Var2);
        }
        return arrayList;
    }
}
