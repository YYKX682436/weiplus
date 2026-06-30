package mq2;

/* loaded from: classes2.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC f330753d;

    public j(com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC nearbyPersonV1UIC) {
        this.f330753d = nearbyPersonV1UIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$getSayHiLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC nearbyPersonV1UIC = this.f330753d;
        android.widget.ListView listView = nearbyPersonV1UIC.f122093h;
        kotlin.jvm.internal.o.d(listView);
        listView.removeHeaderView(nearbyPersonV1UIC.f122094i);
        nearbyPersonV1UIC.f122094i = null;
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(nearbyPersonV1UIC.getActivity(), "com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI");
        intent.putExtra("k_say_hi_type", 2);
        intent.putExtra("show_clear_header", true);
        nearbyPersonV1UIC.getActivity().startActivityForResult(intent, com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_RESOLUTION);
        com.tencent.mm.plugin.finder.extension.reddot.ga gaVar = com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a;
        androidx.appcompat.app.AppCompatActivity activity = nearbyPersonV1UIC.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        gaVar.o(2, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("NearbyPeopleBubble");
        rq2.u.f398889a.b(12L);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$getSayHiLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
