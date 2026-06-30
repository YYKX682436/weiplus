package mq2;

/* loaded from: classes15.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC f330730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.b64 f330731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mq2.h f330732f;

    public f(com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC nearbyPersonV1UIC, r45.b64 b64Var, mq2.h hVar) {
        this.f330730d = nearbyPersonV1UIC;
        this.f330731e = b64Var;
        this.f330732f = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$NearbyFriendAdapter$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC nearbyPersonV1UIC = this.f330730d;
        mq2.a aVar = (mq2.a) ((java.util.HashMap) nearbyPersonV1UIC.f330724f).get(this.f330731e.f370550d);
        if (aVar != null) {
            aVar.f330713j++;
            aVar.f330716m = true;
            aVar.f330715l |= 2;
        }
        nearbyPersonV1UIC.T6();
        this.f330732f.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$NearbyFriendAdapter$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
