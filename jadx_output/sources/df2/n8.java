package df2;

/* loaded from: classes3.dex */
public final class n8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f230839d;

    public n8(df2.s8 s8Var) {
        this.f230839d = s8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList list;
        r45.nz3 nz3Var;
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/GiftFundingCardController$sendGiftListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.s8 s8Var = this.f230839d;
        r45.e84 e84Var = s8Var.f231307s;
        if (e84Var != null && (list = e84Var.getList(2)) != null && (nz3Var = (r45.nz3) kz5.n0.Z(list)) != null) {
            if (nz3Var.getInteger(3) == 2) {
                com.tencent.mm.plugin.finder.live.plugin.hm hmVar = (com.tencent.mm.plugin.finder.live.plugin.hm) s8Var.R6(com.tencent.mm.plugin.finder.live.plugin.hm.class);
                if (hmVar != null) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    java.lang.String string = e84Var.getString(5);
                    bundle.putString("PARAM_FINDER_LIVE_SEND_GIFT_FUNDING_TASK_ID", string != null ? string : "");
                    hmVar.E1 = bundle;
                }
                mm2.s2 s2Var = (mm2.s2) s8Var.business(mm2.s2.class);
                if (s2Var != null && (liveMutableData = s2Var.f329404f) != null) {
                    liveMutableData.postValue(new mm2.q2(true, 0, 2, null));
                }
                s8Var.k7(2);
            } else {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("PARAM_FINDER_LIVE_GIFT_ID", nz3Var.getString(0));
                bundle2.putBoolean("PARAM_FINDER_LIVE_SHOW_SEND_BTN", false);
                java.lang.String string2 = e84Var.getString(5);
                bundle2.putString("PARAM_FINDER_LIVE_SEND_GIFT_FUNDING_TASK_ID", string2 != null ? string2 : "");
                s8Var.X6(qo0.b.Z1, bundle2);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/GiftFundingCardController$sendGiftListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
