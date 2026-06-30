package gg2;

/* loaded from: classes2.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg2.t f271714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.pl5 f271715e;

    public s(gg2.t tVar, r45.pl5 pl5Var) {
        this.f271714d = tVar;
        this.f271715e = pl5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        android.view.View view2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        kotlinx.coroutines.flow.j2 j2Var;
        r45.bc2 bc2Var;
        r45.iq iqVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/exp/LiveExpTwentyFiveItem$onPollingResult$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        gg2.t tVar = this.f271714d;
        bg2.h4 h4Var = (bg2.h4) tVar.f271664a.a(bg2.h4.class);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (h4Var == null || (j2Var = h4Var.f20139i) == null || (bc2Var = (r45.bc2) ((kotlinx.coroutines.flow.h3) j2Var).getValue()) == null || (iqVar = (r45.iq) bc2Var.getCustom(2)) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderJumpInfo) iqVar.getCustom(0);
        if (finderJumpInfo != null) {
            intent.putExtra("KEY_PARAMS_DO_ACTION", 19);
            intent.putExtra("KEY_PARAMS_AUTO_OPEN_JUMP_INFO", finderJumpInfo.getData());
        }
        tVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = tVar.f271664a.f417148h;
        if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null || (str = java.lang.Long.valueOf(liveInfo.getLong(0)).toString()) == null) {
            str = "";
        }
        hashMap.put("liveid", str);
        hashMap.put("guide_bar_type", "4");
        java.lang.String string = this.f271715e.getString(1);
        hashMap.put("guide_bar_txt", string != null ? string : "");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.S2, hashMap, null, null, null, null, false, 124, null);
        tc2.g gVar = tVar.f271664a;
        in5.s0 s0Var = gVar.f417149i;
        if (s0Var == null || (view2 = s0Var.itemView) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/exp/LiveExpTwentyFiveItem$onPollingResult$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        uc2.i iVar = (uc2.i) gVar.b(uc2.i.class);
        if (iVar != null) {
            ((sb2.o) iVar).Y6(view2, intent);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/exp/LiveExpTwentyFiveItem$onPollingResult$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
