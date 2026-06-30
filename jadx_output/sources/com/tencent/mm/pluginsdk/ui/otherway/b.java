package com.tencent.mm.pluginsdk.ui.otherway;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/otherway/b;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "<init>", "()V", "ui-appchooser_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.util.ArrayList<java.lang.String> stringArrayList = bundle != null ? bundle.getStringArrayList("name_list") : null;
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        if (stringArrayList != null) {
            for (java.lang.String str : stringArrayList) {
                java.lang.String wi6 = ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).wi(str);
                if (wi6 != null) {
                    str = wi6;
                }
                arrayList.add(str);
            }
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putStringArrayList("pin_yin_list", arrayList);
        return bundle2;
    }
}
