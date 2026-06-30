package mq2;

/* loaded from: classes15.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC f330729d;

    public e0(com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC nearbyPersonV1UIC) {
        this.f330729d = nearbyPersonV1UIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$showPermissionView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC nearbyPersonV1UIC = this.f330729d;
        if (nearbyPersonV1UIC.P6()) {
            if (!((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f227169t)) {
                com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC.O6(nearbyPersonV1UIC);
            }
        } else {
            nearbyPersonV1UIC.U6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$showPermissionView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
