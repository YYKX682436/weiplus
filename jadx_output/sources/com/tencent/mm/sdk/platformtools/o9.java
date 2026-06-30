package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class o9 implements r.a {
    @Override // r.a
    public java.lang.Object apply(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = null;
        for (int i17 = 0; i17 < list.size(); i17++) {
            java.lang.Object obj2 = list.get(i17);
            java.lang.String obj3 = obj2.toString();
            if (!android.text.TextUtils.isEmpty(obj3)) {
                if ((obj2 instanceof com.tencent.mm.sdk.platformtools.k9) && com.tencent.mm.sdk.platformtools.p9.f192936b && !((com.tencent.mm.sdk.platformtools.k9) obj2).f192816c) {
                    if (!android.text.TextUtils.isEmpty(str) && com.tencent.mm.sdk.platformtools.p9.a(str, obj3)) {
                        sb6.append(' ');
                    }
                    sb6.append(obj3);
                    if (i17 < list.size() - 1 && com.tencent.mm.sdk.platformtools.p9.a(obj3, list.get(i17 + 1).toString())) {
                        sb6.append(' ');
                    }
                    str = null;
                } else {
                    sb6.append(obj3);
                    str = obj3;
                }
            }
        }
        return sb6.toString();
    }
}
