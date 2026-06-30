package h41;

/* loaded from: classes11.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.y0 f278887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f278888e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f278889f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(h41.y0 y0Var, java.util.ArrayList arrayList, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f278887d = y0Var;
        this.f278888e = arrayList;
        this.f278889f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h41.x0(this.f278887d, this.f278888e, this.f278889f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((h41.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        h41.y0 y0Var = this.f278887d;
        boolean z17 = y0Var.f278901j;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCSelectContactUI", "updateContacts: skip after released");
            return f0Var;
        }
        com.tencent.mm.open_voice_control.card.SelectContactCard selectContactCard = y0Var.f278895b;
        if (selectContactCard != null) {
            java.lang.String[] usernames = (java.lang.String[]) this.f278888e.toArray(new java.lang.String[0]);
            f41.n a17 = h41.y0.a(y0Var, this.f278889f);
            kotlin.jvm.internal.o.g(usernames, "usernames");
            com.tencent.mars.xlog.Log.i("MicroMsg.OVC.SelectContactCard", "updateContacts " + kz5.z.d0(usernames, ",", null, null, 0, null, null, 62, null) + ", scene=" + a17);
            android.os.Bundle arguments = selectContactCard.getArguments();
            if (arguments != null) {
                arguments.putStringArray("usernames", usernames);
            }
            android.os.Bundle arguments2 = selectContactCard.getArguments();
            if (arguments2 != null) {
                arguments2.putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, a17.ordinal());
            }
            int ordinal = a17.ordinal();
            if (ordinal == 0) {
                i17 = com.tencent.mm.R.string.pgg;
            } else if (ordinal == 1) {
                i17 = com.tencent.mm.R.string.pgd;
            } else {
                if (ordinal != 2) {
                    throw new jz5.j();
                }
                i17 = com.tencent.mm.R.string.pge;
            }
            ((android.widget.TextView) ((jz5.n) selectContactCard.f72240m).getValue()).setText(i17);
            androidx.recyclerview.widget.f2 adapter = ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) selectContactCard.f72241n).getValue()).getAdapter();
            kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.open_voice_control.card.SlotContactItem>");
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter;
            java.util.ArrayList arrayList = new java.util.ArrayList(usernames.length);
            for (java.lang.String str : usernames) {
                arrayList.add(new f41.r0(str));
            }
            wxRecyclerAdapter.E0(new java.util.ArrayList(arrayList));
            wxRecyclerAdapter.notifyDataSetChanged();
            selectContactCard.c().requestLayout();
        }
        return f0Var;
    }
}
