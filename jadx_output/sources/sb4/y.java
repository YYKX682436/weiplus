package sb4;

/* loaded from: classes4.dex */
public final class y extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f405588d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f405589e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.storage.s7 f405590f;

    public y(android.app.Activity context, java.lang.String userName, boolean z17) {
        com.tencent.mm.storage.s7 s7Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f405588d = context;
        this.f405589e = kz5.p0.f313996d;
        this.f405590f = com.tencent.mm.storage.s7.a();
        if (z17) {
            s7Var = com.tencent.mm.storage.s7.a();
        } else {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true);
            s7Var = (n17 == null || !n17.r2()) ? new com.tencent.mm.storage.s7("album_stranger") : new com.tencent.mm.storage.s7("album_friend");
        }
        this.f405590f = s7Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter");
        int size = this.f405589e.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter");
        return size;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) this.f405589e.get(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSlotAdapter", "onBindViewHolder >> position: " + i17 + ", feedId: " + snsInfo.getSnsId());
        holder.itemView.setOnClickListener(new sb4.x(this));
        if (snsInfo.getTimeLine().ContentObj != null) {
            java.util.LinkedList MediaObjList = snsInfo.getTimeLine().ContentObj.f369840h;
            kotlin.jvm.internal.o.f(MediaObjList, "MediaObjList");
            com.tencent.mm.storage.s7 s7Var = new com.tencent.mm.storage.s7(this.f405590f.f195312a);
            s7Var.f195313b = snsInfo.field_createTime;
            sb4.i0 i0Var = (sb4.i0) holder;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initViewHolder", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter");
            i0Var.k().setVisibility(8);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStarItemFl", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStarItemFl", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
            android.view.View view = i0Var.f405528g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsStarSlotAdapter", "initViewHolder", "(Lcom/tencent/mm/plugin/sns/ui/adapter/StarSlotItemViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/adapter/SnsStarSlotAdapter", "initViewHolder", "(Lcom/tencent/mm/plugin/sns/ui/adapter/StarSlotItemViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i0Var.j().setVisibility(8);
            i0Var.l().setVisibility(8);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRightBottomCorner", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRightBottomCorner", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
            android.view.View view2 = i0Var.f405530i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsStarSlotAdapter", "initViewHolder", "(Lcom/tencent/mm/plugin/sns/ui/adapter/StarSlotItemViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/adapter/SnsStarSlotAdapter", "initViewHolder", "(Lcom/tencent/mm/plugin/sns/ui/adapter/StarSlotItemViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initViewHolder", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter");
            int i18 = snsInfo.getTimeLine().ContentObj.f369837e;
            android.app.Activity activity = this.f405588d;
            if (i18 == 28 || snsInfo.getTimeLine().ContentObj.f369837e == 59) {
                r45.kv2 finderShareObject = snsInfo.getTimeLine().ContentObj.f369844o;
                kotlin.jvm.internal.o.f(finderShareObject, "finderShareObject");
                if (finderShareObject.getInteger(5) == 1) {
                    i0Var.j().setVisibility(0);
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    java.lang.String str2 = finderShareObject.getString(4) + "";
                    float textSize = i0Var.j().getTextSize();
                    ((ke0.e) xVar).getClass();
                    i0Var.j().setText(com.tencent.mm.pluginsdk.ui.span.c0.j(activity, str2, textSize));
                    i0Var.k().setVisibility(8);
                } else if (!com.tencent.mm.sdk.platformtools.t8.L0(finderShareObject.getList(7))) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    ya2.l.f460502a.h(((r45.iv2) finderShareObject.getList(7).get(0)).getString(2), i0Var.k(), mn2.f1.B);
                    i0Var.k().setVisibility(0);
                    if (finderShareObject.getInteger(5) == 4 || finderShareObject.getInteger(5) == 2) {
                        i0Var.l().setVisibility(0);
                    }
                }
            } else if (snsInfo.getTimeLine().ContentObj.f369837e == 36) {
                r45.ek4 megaVideoShareObject = snsInfo.getTimeLine().ContentObj.f369849t;
                kotlin.jvm.internal.o.f(megaVideoShareObject, "megaVideoShareObject");
                if (!com.tencent.mm.sdk.platformtools.t8.L0(megaVideoShareObject.getList(6))) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(((r45.dk4) megaVideoShareObject.getList(6).get(0)).getString(4))) {
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                        ya2.l.f460502a.h(((r45.dk4) megaVideoShareObject.getList(6).get(0)).getString(1), i0Var.k(), mn2.f1.B);
                    } else {
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                        ya2.l.f460502a.h(((r45.dk4) megaVideoShareObject.getList(6).get(0)).getString(4), i0Var.k(), mn2.f1.B);
                    }
                    i0Var.k().setVisibility(0);
                    i0Var.l().setVisibility(0);
                }
            } else if (snsInfo.getTimeLine().ContentObj.f369837e == 29 || snsInfo.getTimeLine().ContentObj.f369837e == 37) {
                if (snsInfo.getTimeLine().ContentObj.f369845p != null) {
                    r45.jj4 jj4Var = new r45.jj4();
                    jj4Var.f377858g = snsInfo.getTimeLine().ContentObj.f369845p.getString(2);
                    jj4Var.f377860i = snsInfo.getTimeLine().ContentObj.f369845p.getString(2);
                    jj4Var.f377856e = 2;
                    jj4Var.f377862m = 1;
                    r45.lj4 lj4Var = new r45.lj4();
                    jj4Var.f377865p = lj4Var;
                    jj4Var.f377859h = 1;
                    lj4Var.f379520d = 0.0f;
                    lj4Var.f379521e = 0.0f;
                    jj4Var.f377855d = snsInfo.getSnsId();
                    com.tencent.mm.plugin.sns.model.l4.hj().d0(jj4Var, i0Var.k(), activity.hashCode(), com.tencent.mm.plugin.sns.model.z1.IMG_SCENE_SNSUSER, s7Var);
                    i0Var.k().setVisibility(0);
                }
            } else if (snsInfo.getTimeLine().ContentObj.f369837e == 38) {
                if (snsInfo.getTimeLine().ContentObj.f369847r != null) {
                    r45.jj4 jj4Var2 = new r45.jj4();
                    java.lang.Object obj = snsInfo.getTimeLine().ContentObj.f369847r.getList(3).get(0);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    java.lang.Object obj2 = snsInfo.getTimeLine().ContentObj.f369847r.getList(4).get(0);
                    kotlin.jvm.internal.o.f(obj2, "get(...)");
                    java.lang.String concat = ((java.lang.String) obj).concat((java.lang.String) obj2);
                    jj4Var2.f377858g = concat;
                    jj4Var2.f377860i = concat;
                    jj4Var2.f377856e = 2;
                    jj4Var2.f377862m = 1;
                    r45.lj4 lj4Var2 = new r45.lj4();
                    jj4Var2.f377865p = lj4Var2;
                    jj4Var2.f377859h = 1;
                    lj4Var2.f379520d = 0.0f;
                    lj4Var2.f379521e = 0.0f;
                    jj4Var2.f377855d = snsInfo.getSnsId();
                    com.tencent.mm.plugin.sns.model.l4.hj().d0(jj4Var2, i0Var.k(), activity.hashCode(), com.tencent.mm.plugin.sns.model.z1.IMG_SCENE_SNSUSER, s7Var);
                    i0Var.k().setVisibility(0);
                }
            } else if (snsInfo.getTimeLine().ContentObj.f369837e == 53) {
                r45.hd2 hd2Var = snsInfo.getTimeLine().ContentObj.f369855z;
                if (hd2Var == null || com.tencent.mm.sdk.platformtools.t8.K0(hd2Var.getString(2))) {
                    com.tencent.mm.plugin.sns.model.l4.hj().S(i0Var.k(), -1, com.tencent.mm.R.raw.app_attach_file_icon_webpage, activity.hashCode());
                } else {
                    r45.jj4 jj4Var3 = new r45.jj4();
                    java.lang.String string = hd2Var.getString(2);
                    jj4Var3.f377858g = string;
                    jj4Var3.f377860i = string;
                    jj4Var3.f377856e = 2;
                    jj4Var3.f377862m = 1;
                    r45.lj4 lj4Var3 = new r45.lj4();
                    jj4Var3.f377865p = lj4Var3;
                    jj4Var3.f377859h = 1;
                    lj4Var3.f379520d = 0.0f;
                    lj4Var3.f379521e = 0.0f;
                    jj4Var3.f377855d = snsInfo.getSnsId();
                    com.tencent.mm.plugin.sns.model.l4.hj().d0(jj4Var3, i0Var.k(), activity.hashCode(), com.tencent.mm.plugin.sns.model.z1.IMG_SCENE_SNSUSER, s7Var);
                }
                i0Var.k().setVisibility(0);
            } else if (snsInfo.getTimeLine().ContentObj.f369837e == 33) {
                if (snsInfo.getTimeLine().ContentObj.f369846q != null) {
                    r45.jj4 jj4Var4 = new r45.jj4();
                    jj4Var4.f377858g = snsInfo.getTimeLine().ContentObj.f369846q.f373343h;
                    jj4Var4.f377860i = snsInfo.getTimeLine().ContentObj.f369846q.f373343h;
                    jj4Var4.f377856e = 2;
                    jj4Var4.f377862m = 1;
                    r45.lj4 lj4Var4 = new r45.lj4();
                    jj4Var4.f377865p = lj4Var4;
                    jj4Var4.f377859h = 1;
                    lj4Var4.f379520d = 0.0f;
                    lj4Var4.f379521e = 0.0f;
                    jj4Var4.f377855d = snsInfo.getSnsId();
                    com.tencent.mm.plugin.sns.model.l4.hj().d0(jj4Var4, i0Var.k(), activity.hashCode(), com.tencent.mm.plugin.sns.model.z1.IMG_SCENE_SNSUSER, s7Var);
                    i0Var.k().setVisibility(0);
                }
            } else if (snsInfo.getTimeLine().ContentObj.f369837e == 34 || snsInfo.getTimeLine().ContentObj.f369837e == 45 || snsInfo.getTimeLine().ContentObj.f369837e == 43) {
                if (snsInfo.getTimeLine().ContentObj.f369848s != null) {
                    r45.jj4 jj4Var5 = new r45.jj4();
                    jj4Var5.f377858g = snsInfo.getTimeLine().ContentObj.f369848s.getString(5);
                    jj4Var5.f377860i = snsInfo.getTimeLine().ContentObj.f369848s.getString(5);
                    jj4Var5.f377856e = 2;
                    jj4Var5.f377862m = 1;
                    r45.lj4 lj4Var5 = new r45.lj4();
                    jj4Var5.f377865p = lj4Var5;
                    jj4Var5.f377859h = 1;
                    lj4Var5.f379520d = snsInfo.getTimeLine().ContentObj.f369848s.getFloat(6);
                    jj4Var5.f377865p.f379521e = snsInfo.getTimeLine().ContentObj.f369848s.getFloat(7);
                    jj4Var5.f377855d = snsInfo.getSnsId();
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    ya2.l.f460502a.h(snsInfo.getTimeLine().ContentObj.f369848s.getString(5), i0Var.k(), mn2.f1.B);
                }
                i0Var.k().setVisibility(0);
            } else if (snsInfo.getTimeLine().ContentObj.f369837e == 39) {
                int i19 = snsInfo.getTimeLine().ContentObj.f369850u;
                if (i19 != 3) {
                    if (i19 == 100000000 && snsInfo.getTimeLine().ContentObj.f369845p != null) {
                        r45.jj4 jj4Var6 = new r45.jj4();
                        jj4Var6.f377858g = snsInfo.getTimeLine().ContentObj.f369845p.getString(2);
                        jj4Var6.f377860i = snsInfo.getTimeLine().ContentObj.f369845p.getString(2);
                        jj4Var6.f377856e = 2;
                        jj4Var6.f377862m = 1;
                        r45.lj4 lj4Var6 = new r45.lj4();
                        jj4Var6.f377865p = lj4Var6;
                        jj4Var6.f377859h = 1;
                        lj4Var6.f379520d = 0.0f;
                        lj4Var6.f379521e = 0.0f;
                        jj4Var6.f377855d = snsInfo.getSnsId();
                        com.tencent.mm.plugin.sns.model.l4.hj().d0(jj4Var6, i0Var.k(), activity.hashCode(), com.tencent.mm.plugin.sns.model.z1.IMG_SCENE_SNSUSER, s7Var);
                        i0Var.k().setVisibility(0);
                    }
                } else if (snsInfo.getTimeLine().ContentObj.f369851v != null) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(snsInfo.getTimeLine().ContentObj.f369851v.getString(2))) {
                        com.tencent.mm.plugin.sns.model.l4.hj().S(i0Var.k(), -1, com.tencent.mm.R.raw.icon_filled_activity, activity.hashCode());
                    } else {
                        r45.jj4 jj4Var7 = new r45.jj4();
                        jj4Var7.f377858g = snsInfo.getTimeLine().ContentObj.f369851v.getString(2);
                        jj4Var7.f377860i = snsInfo.getTimeLine().ContentObj.f369851v.getString(2);
                        jj4Var7.f377856e = 2;
                        jj4Var7.f377862m = 1;
                        r45.lj4 lj4Var7 = new r45.lj4();
                        jj4Var7.f377865p = lj4Var7;
                        jj4Var7.f377859h = 1;
                        lj4Var7.f379520d = 0.0f;
                        lj4Var7.f379521e = 0.0f;
                        jj4Var7.f377855d = snsInfo.getSnsId();
                        com.tencent.mm.plugin.sns.model.l4.hj().d0(jj4Var7, i0Var.k(), activity.hashCode(), com.tencent.mm.plugin.sns.model.z1.IMG_SCENE_SNSUSER, s7Var);
                    }
                    i0Var.k().setVisibility(0);
                }
            } else if (snsInfo.getTimeLine().ContentObj.f369837e == 46 || snsInfo.getTimeLine().ContentObj.f369837e == 51) {
                if (snsInfo.getTimeLine().ContentObj.f369854y != null) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(snsInfo.getTimeLine().ContentObj.f369854y.getString(2))) {
                        r45.jj4 jj4Var8 = new r45.jj4();
                        jj4Var8.f377858g = snsInfo.getTimeLine().ContentObj.f369854y.getString(2);
                        jj4Var8.f377860i = snsInfo.getTimeLine().ContentObj.f369854y.getString(2);
                        jj4Var8.f377856e = 2;
                        jj4Var8.f377862m = 1;
                        r45.lj4 lj4Var8 = new r45.lj4();
                        jj4Var8.f377865p = lj4Var8;
                        jj4Var8.f377859h = 1;
                        lj4Var8.f379520d = 0.0f;
                        lj4Var8.f379521e = 0.0f;
                        jj4Var8.f377855d = snsInfo.getSnsId();
                        com.tencent.mm.plugin.sns.model.l4.hj().d0(jj4Var8, i0Var.k(), activity.hashCode(), com.tencent.mm.plugin.sns.model.z1.IMG_SCENE_SNSUSER, s7Var);
                    }
                    i0Var.k().setVisibility(0);
                } else {
                    com.tencent.mm.plugin.sns.model.l4.hj().S(i0Var.k(), -1, com.tencent.mm.R.drawable.aqs, hashCode());
                }
            } else if (snsInfo.getTimeLine().ContentObj.f369837e == 52) {
                if (snsInfo.getTimeLine().ContentObj.C != null) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(snsInfo.getTimeLine().ContentObj.C.getString(2))) {
                        r45.jj4 jj4Var9 = new r45.jj4();
                        jj4Var9.f377858g = snsInfo.getTimeLine().ContentObj.C.getString(2);
                        jj4Var9.f377860i = snsInfo.getTimeLine().ContentObj.C.getString(2);
                        jj4Var9.f377856e = 2;
                        jj4Var9.f377862m = 1;
                        r45.lj4 lj4Var9 = new r45.lj4();
                        jj4Var9.f377865p = lj4Var9;
                        jj4Var9.f377859h = 1;
                        lj4Var9.f379520d = 0.0f;
                        lj4Var9.f379521e = 0.0f;
                        jj4Var9.f377855d = snsInfo.getSnsId();
                        com.tencent.mm.plugin.sns.model.l4.hj().d0(jj4Var9, i0Var.k(), activity.hashCode(), com.tencent.mm.plugin.sns.model.z1.IMG_SCENE_SNSUSER, s7Var);
                    }
                    i0Var.k().setVisibility(0);
                } else {
                    com.tencent.mm.plugin.sns.model.l4.hj().S(i0Var.k(), -1, com.tencent.mm.R.drawable.aqs, hashCode());
                }
            } else if (snsInfo.getTimeLine().ContentObj.f369837e == 44) {
                if (snsInfo.getTimeLine().ContentObj.f369853x != null) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(snsInfo.getTimeLine().ContentObj.f369853x.getString(5))) {
                        com.tencent.mm.plugin.sns.model.l4.hj().S(i0Var.k(), -1, com.tencent.mm.R.raw.icons_outlined_location, activity.hashCode());
                    } else {
                        r45.jj4 jj4Var10 = new r45.jj4();
                        jj4Var10.f377858g = snsInfo.getTimeLine().ContentObj.f369853x.getString(5);
                        jj4Var10.f377860i = snsInfo.getTimeLine().ContentObj.f369853x.getString(5);
                        jj4Var10.f377856e = 2;
                        jj4Var10.f377862m = 1;
                        r45.lj4 lj4Var10 = new r45.lj4();
                        jj4Var10.f377865p = lj4Var10;
                        jj4Var10.f377859h = 1;
                        lj4Var10.f379520d = 0.0f;
                        lj4Var10.f379521e = 0.0f;
                        jj4Var10.f377855d = snsInfo.getSnsId();
                        com.tencent.mm.plugin.sns.model.l4.hj().d0(jj4Var10, i0Var.k(), activity.hashCode(), com.tencent.mm.plugin.sns.model.z1.IMG_SCENE_SNSUSER, s7Var);
                    }
                    i0Var.k().setVisibility(0);
                }
            } else if (snsInfo.getTimeLine().ContentObj.f369837e == 55 || snsInfo.getTimeLine().ContentObj.f369837e == 56) {
                if (snsInfo.getTimeLine().ContentObj.E != null) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(snsInfo.getTimeLine().ContentObj.E.getString(3))) {
                        com.tencent.mm.plugin.sns.model.l4.hj().S(i0Var.k(), -1, com.tencent.mm.R.raw.app_attach_file_icon_webpage, activity.hashCode());
                    } else {
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                        ya2.l.f460502a.h(snsInfo.getTimeLine().ContentObj.E.getString(3), i0Var.k(), mn2.f1.B);
                        i0Var.k().setVisibility(0);
                    }
                }
            } else if (snsInfo.getTypeFlag() == 2) {
                i0Var.j().setVisibility(0);
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str3 = snsInfo.getTimeLine().ContentDesc + "";
                float textSize2 = i0Var.j().getTextSize();
                ((ke0.e) xVar2).getClass();
                i0Var.j().setText(com.tencent.mm.pluginsdk.ui.span.c0.j(activity, str3, textSize2));
            } else if (snsInfo.getTypeFlag() == 26) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStarItemFlIv", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStarItemFlIv", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
                i0Var.f405529h.setImageResource(com.tencent.mm.R.raw.icons_filled_note);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStarItemFl", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStarItemFl", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
                android.view.View view3 = i0Var.f405528g;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsStarSlotAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/adapter/SnsStarSlotAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                if (!MediaObjList.isEmpty()) {
                    md4.e eVar = md4.e.f325877a;
                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
                    kotlin.jvm.internal.o.f(timeLine, "getTimeLine(...)");
                    com.tencent.mm.plugin.sns.model.l4.hj().g0(snsInfo.getSnsId(), eVar.d(timeLine), i0Var.k(), activity.hashCode(), com.tencent.mm.plugin.sns.model.z1.IMG_SCENE_SNSUSER, s7Var);
                    if (snsInfo.field_type == 15) {
                        i0Var.l().setVisibility(0);
                    }
                }
                i0Var.k().setVisibility(0);
            }
            str = "onBindViewHolder";
        } else {
            str = "onBindViewHolder";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter");
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bmh, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        sb4.i0 i0Var = new sb4.i0(inflate);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter");
        return i0Var;
    }

    public final void x(java.util.List infoList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStarSlotDataList", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter");
        kotlin.jvm.internal.o.g(infoList, "infoList");
        this.f405589e = infoList;
        notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStarSlotDataList", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter");
    }
}
