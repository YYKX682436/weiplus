package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f158388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f158389e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.util.ArrayList arrayList, android.view.View view) {
        super(2);
        this.f158388d = arrayList;
        this.f158389e = view;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        int intValue = ((java.lang.Number) obj).intValue();
        ox3.g item = (ox3.g) obj2;
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick position:");
        sb6.append(intValue);
        sb6.append(", checked:");
        sb6.append(item.f349753h);
        sb6.append(", total:");
        java.util.ArrayList arrayList = this.f158388d;
        sb6.append(arrayList.size());
        sb6.append(", total checked:");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj3 : arrayList) {
            if (((ox3.g) obj3).f349753h) {
                arrayList2.add(obj3);
            }
        }
        sb6.append(arrayList2.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneAddTingUIC", sb6.toString());
        if (!arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((ox3.g) it.next()).f349753h) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        android.view.View view = this.f158389e;
        if (z17) {
            view.setEnabled(false);
            com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneAddTingUIC", "set add tv disable");
        } else {
            view.setEnabled(true);
            com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneAddTingUIC", "set add tv enable");
        }
        return jz5.f0.f302826a;
    }
}
