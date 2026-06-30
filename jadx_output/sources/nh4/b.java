package nh4;

/* loaded from: classes8.dex */
public final class b extends ph4.j {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f337122b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ph4.f callback) {
        super(callback);
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f337122b = "TaskBarSectionOtherViewLiveHelper";
    }

    @Override // ph4.j
    public int a(com.tencent.mm.plugin.multitask.model.MultiTaskInfo data) {
        kotlin.jvm.internal.o.g(data, "data");
        return com.tencent.mm.R.drawable.cfy;
    }

    @Override // ph4.j
    public java.lang.String b(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        java.lang.String r17 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f490319ro);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        return r17;
    }

    @Override // ph4.j
    public void d(int i17, ph4.b viewHolder, lh4.n viewModel) {
        java.lang.String str;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        java.lang.String str2 = this.f337122b;
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        super.d(i17, viewHolder, viewModel);
        r45.b22 b22Var = new r45.b22();
        try {
            b22Var.parseFrom(((com.tencent.mm.plugin.multitask.model.MultiTaskInfo) ((java.util.ArrayList) viewModel.f318724d).get(i17)).field_data);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(str2, "FinderLiveMultiTaskData parse fail", th6);
        }
        if (((com.tencent.mm.protocal.protobuf.FinderObject) b22Var.getCustom(7)) == null) {
            return;
        }
        android.content.Context context = viewHolder.itemView.getContext();
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) b22Var.getCustom(7);
        kotlin.jvm.internal.o.d(finderObject);
        com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
        java.lang.CharSequence nickname = contact != null ? contact.getNickname() : null;
        if (nickname == null) {
            nickname = "";
        }
        if (nickname.length() > 0) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str3 = ((java.lang.Object) nickname) + i65.a.r(context, com.tencent.mm.R.string.f490320rp);
            ((ke0.e) xVar).getClass();
            nickname = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str3);
        }
        viewHolder.f354463f.setText(nickname);
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = (objectDesc == null || (media = objectDesc.getMedia()) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media);
        java.lang.String coverUrl = finderMedia != null ? finderMedia.getCoverUrl() : null;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (coverUrl == null) {
            coverUrl = "";
        }
        java.lang.String cover_url_token = finderMedia != null ? finderMedia.getCover_url_token() : null;
        if (cover_url_token == null) {
            cover_url_token = "";
        }
        java.lang.String concat = coverUrl.concat(cover_url_token);
        java.lang.String thumbUrl = finderMedia != null ? finderMedia.getThumbUrl() : null;
        if (thumbUrl == null) {
            thumbUrl = "";
        }
        java.lang.String thumb_url_token = finderMedia != null ? finderMedia.getThumb_url_token() : null;
        if (thumb_url_token == null) {
            thumb_url_token = "";
        }
        java.lang.String concat2 = thumbUrl.concat(thumb_url_token);
        if (com.tencent.mm.sdk.platformtools.t8.K0(concat)) {
            concat = concat2;
        }
        android.widget.ImageView imageView = viewHolder.f354462e;
        imageView.setImageBitmap(null);
        mn2.g1 g1Var = mn2.g1.f329975a;
        wo0.c a17 = g1Var.e().a(((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ai(concat, com.tencent.mm.plugin.finder.storage.y90.f128355e));
        a17.f447874e = new ap0.g(null, null, 3, null);
        a17.g(g1Var.h(mn2.f1.f329953d));
        kotlin.jvm.internal.o.f(imageView, "<get-image>(...)");
        a17.c(imageView);
        r45.nw1 liveInfo = finderObject.getLiveInfo();
        int integer = liveInfo != null ? liveInfo.getInteger(2) : 2;
        com.tencent.mars.xlog.Log.i(str2, "onBind live " + integer + ' ' + ((java.lang.Object) nickname));
        if (integer == 1) {
            android.view.View view = viewHolder.f354466i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = viewHolder.f354467m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = viewHolder.f354466i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = viewHolder.f354467m;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            vd2.t3 t3Var = vd2.t3.f435921a;
            if (imageView != null && concat != null) {
                ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).tj(imageView, concat, 25);
            }
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view5 = viewHolder.itemView;
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(finderObject.getId()));
        lVarArr[1] = new jz5.l("live_id", pm0.v.u(b22Var.getLong(1)));
        ((v80.n) ((w80.j) i95.n0.c(w80.j.class))).getClass();
        ml2.q1 q1Var = ml2.q1.f327812e;
        lVarArr[2] = new jz5.l("comment_scene", "temp_15");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) b22Var.getCustom(7);
        if (finderObject2 == null || (str = finderObject2.getUsername()) == null) {
            str = "";
        }
        lVarArr[3] = new jz5.l("finder_username", str);
        java.lang.String string = b22Var.getString(6);
        lVarArr[4] = new jz5.l("session_buffer", string != null ? string : "");
        ((cy1.a) rVar).gk(view5, kz5.c1.k(lVarArr));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(viewHolder.itemView, new nh4.a(finderObject));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(viewHolder.itemView, "live_room_card_wamain");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(viewHolder.itemView, 40, 26236);
    }
}
