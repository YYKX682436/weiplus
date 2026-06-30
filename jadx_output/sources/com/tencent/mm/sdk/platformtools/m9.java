package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class m9 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.h9 f192867a = new com.tencent.mm.sdk.platformtools.i9(this);

    /* renamed from: b, reason: collision with root package name */
    public r.a f192868b = new com.tencent.mm.sdk.platformtools.j9(this);

    public static java.lang.Object a(java.lang.String str, com.tencent.mm.sdk.platformtools.h9 h9Var) {
        int i17;
        int indexOf = str.indexOf("${");
        if (indexOf < 0) {
            return str;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(5);
        while (true) {
            if (indexOf > 0) {
                arrayList.add(str.substring(0, indexOf));
                str = str.substring(indexOf);
                indexOf = str.indexOf("${");
            } else {
                if (indexOf < 0) {
                    arrayList.add(str);
                    return arrayList;
                }
                int indexOf2 = str.indexOf("}");
                if (indexOf2 < 0 || (i17 = indexOf + 2) >= str.length() - 1) {
                    break;
                }
                if (i17 == indexOf2) {
                    int i18 = indexOf2 + 1;
                    arrayList.add(str.substring(indexOf, i18));
                    str = str.substring(i18);
                    indexOf = str.indexOf("${");
                } else {
                    com.tencent.mm.sdk.platformtools.k9 k9Var = new com.tencent.mm.sdk.platformtools.k9(str.substring(i17, indexOf2));
                    k9Var.f192815b = h9Var;
                    arrayList.add(k9Var);
                    if (indexOf2 == str.length() - 1) {
                        return arrayList;
                    }
                    str = str.substring(indexOf2 + 1);
                    indexOf = str.indexOf("${");
                }
            }
        }
        arrayList.add(str);
        return arrayList;
    }
}
