package rl0;

/* loaded from: classes4.dex */
public class a implements ka4.f {
    public java.util.ArrayList a(java.util.ArrayList arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (arrayList != null && arrayList.size() > 0) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new com.tencent.mm.kara.feature.feature.business.SnsVideoClickFeatureGroup((com.tencent.mm.plugin.sns.storage.SnsInfo) it.next()));
            }
        }
        return arrayList2;
    }
}
