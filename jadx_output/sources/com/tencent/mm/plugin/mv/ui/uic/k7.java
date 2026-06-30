package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class k7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.q7 f151255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm3.u f151256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f151257f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.n0 f151258g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f151259h;

    public k7(com.tencent.mm.plugin.mv.ui.uic.q7 q7Var, fm3.u uVar, int i17, com.tencent.mm.plugin.mv.ui.uic.n0 n0Var, in5.s0 s0Var) {
        this.f151255d = q7Var;
        this.f151256e = uVar;
        this.f151257f = i17;
        this.f151258g = n0Var;
        this.f151259h = s0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        r45.ef2 mvInfo;
        java.util.LinkedList list;
        int i18;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2;
        java.lang.String str;
        java.lang.StringBuilder sb6;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        com.tencent.mm.plugin.mv.ui.uic.q7 q7Var = this.f151255d;
        q7Var.f151389e = true;
        com.tencent.mm.plugin.mv.ui.uic.g8 g8Var = q7Var.f151388d;
        if (g8Var != null) {
            g8Var.a(java.lang.System.currentTimeMillis(), 4, "2", 10, null);
        }
        int itemId = menuItem.getItemId();
        int i19 = 3;
        int i27 = 2;
        fm3.u musicMv = this.f151256e;
        switch (itemId) {
            case 201:
                java.lang.Object obj = null;
                kotlin.jvm.internal.o.g(musicMv, "musicMv");
                android.content.Intent intent = new android.content.Intent();
                android.app.Activity context = q7Var.getContext();
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.mv.ui.uic.n0.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                com.tencent.mm.plugin.mv.ui.uic.n0 n0Var = (com.tencent.mm.plugin.mv.ui.uic.n0) a17;
                r45.ss4 ss4Var = new r45.ss4();
                com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = new com.tencent.mm.protocal.protobuf.FinderObject();
                java.lang.Long l17 = musicMv.f264123c;
                finderObject2.setId(l17 != null ? l17.longValue() : 0L);
                finderObject2.setObjectNonceId(musicMv.f264124d);
                com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc = new com.tencent.mm.protocal.protobuf.FinderObjectDesc();
                r45.ef2 ef2Var = new r45.ef2();
                ef2Var.set(1, n0Var.f151310i);
                r45.gf2 gf2Var = new r45.gf2();
                gf2Var.set(0, java.lang.Float.valueOf(0.0f));
                gf2Var.set(1, java.lang.Float.valueOf(0.0f));
                ef2Var.set(2, gf2Var);
                int i28 = musicMv.f264136p;
                if (i28 == 1) {
                    ef2Var.set(0, musicMv.f264127g);
                } else if (i28 == 4 && (finderObject = musicMv.f264140t) != null && (objectDesc = finderObject.getObjectDesc()) != null && (mvInfo = objectDesc.getMvInfo()) != null && (list = mvInfo.getList(0)) != null) {
                    ef2Var.set(0, list);
                }
                ef2Var.set(6, 1);
                finderObjectDesc.setMvInfo(ef2Var);
                finderObject2.setObjectDesc(finderObjectDesc);
                ss4Var.set(0, finderObject2);
                int i29 = musicMv.f264136p;
                if (i29 == 1) {
                    ss4Var.set(1, musicMv.f264135o);
                    i18 = 4;
                } else {
                    i18 = 4;
                    if (i29 == 4) {
                        ss4Var.set(1, musicMv.f264141u);
                    }
                }
                ss4Var.set(6, java.lang.Integer.valueOf(n0Var.f151319u));
                com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) ss4Var.getCustom(0);
                if (finderObject3 != null && (objectDesc2 = finderObject3.getObjectDesc()) != null) {
                    obj = objectDesc2.getMvInfo();
                }
                ss4Var.set(5, obj);
                ss4Var.set(2, q7Var.P6(musicMv));
                intent.putExtra("key_track_data", ss4Var.toByteArray());
                intent.putExtra("key_mv_music_duration", n0Var.f151310i.getInteger(14));
                if (this.f151257f != 3) {
                    i18 = 3;
                }
                intent.putExtra("key_mv_enter_maker_ui_from_scene", i18);
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Qk(q7Var.getActivity(), intent);
                r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(q7Var.getContext(), 7, r45.bt4.class);
                if (bt4Var == null) {
                    return;
                }
                bt4Var.f371040h = 1;
                return;
            case 202:
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(q7Var.getContext());
                u1Var.g(q7Var.getContext().getString(com.tencent.mm.R.string.h3x));
                u1Var.m(com.tencent.mm.R.string.f490367t0);
                u1Var.k(q7Var.getContext().getResources().getColor(com.tencent.mm.R.color.f479482a31));
                u1Var.j(q7Var.getContext().getString(com.tencent.mm.R.string.f490347sg));
                u1Var.f211996a.f211821b.V = q7Var.getContext().getResources().getColor(com.tencent.mm.R.color.a0c);
                u1Var.b(new com.tencent.mm.plugin.mv.ui.uic.j7(q7Var, musicMv));
                u1Var.q(false);
                return;
            case 203:
                java.lang.Long l18 = musicMv.f264123c;
                if (l18 != null) {
                    long longValue = l18.longValue();
                    ka0.r0 r0Var = (ka0.r0) i95.n0.c(ka0.r0.class);
                    android.app.Activity context2 = q7Var.getContext();
                    java.lang.String u17 = pm0.v.u(longValue);
                    ((ja0.o0) r0Var).getClass();
                    int i37 = ll3.j2.f319185a;
                    java.lang.String format = java.lang.String.format("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fys) + "/security/readtemplate?t=weixin_report/w_type&scene=%d&content_ID=%s", 69, u17);
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("rawUrl", format);
                    j45.l.j(context2, "webview", ".ui.tools.WebViewUI", intent2, null);
                    return;
                }
                return;
            case 204:
                this.f151258g.f151318t = true;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.id.gbk);
                java.util.Set D0 = kz5.z.D0(new java.lang.Integer[]{java.lang.Integer.valueOf(com.tencent.mm.R.id.ndq), java.lang.Integer.valueOf(com.tencent.mm.R.id.bzk), valueOf, java.lang.Integer.valueOf(com.tencent.mm.R.id.gcd)});
                androidx.appcompat.app.AppCompatActivity activity = q7Var.getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                pf5.z zVar2 = pf5.z.f353948a;
                boolean z17 = ((com.tencent.mm.plugin.mv.ui.uic.n0) zVar2.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.n0.class)).f151318t;
                in5.s0 s0Var = this.f151259h;
                com.tencent.mm.plugin.mv.ui.uic.m8 m8Var = q7Var.f151392h;
                if (z17) {
                    m8Var.a(s0Var.itemView);
                    m8Var.b(D0);
                    m8Var.f151303b.clear();
                } else {
                    kz5.q1.h(D0, valueOf);
                    m8Var.a(s0Var.itemView);
                    m8Var.c(D0);
                    m8Var.f151303b.clear();
                }
                androidx.appcompat.app.AppCompatActivity activity2 = q7Var.getActivity();
                kotlin.jvm.internal.o.g(activity2, "activity");
                if (((com.tencent.mm.plugin.mv.ui.uic.n0) zVar2.a(activity2).a(com.tencent.mm.plugin.mv.ui.uic.n0.class)).f151318t) {
                    android.view.View findViewById = s0Var.itemView.findViewById(com.tencent.mm.R.id.im7);
                    if (findViewById != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById2 = s0Var.itemView.findViewById(com.tencent.mm.R.id.f485682im3);
                    if (findViewById2 == null) {
                        return;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                int i38 = musicMv.f264136p;
                if (i38 == 1) {
                    android.view.View findViewById3 = s0Var.itemView.findViewById(com.tencent.mm.R.id.im7);
                    if (findViewById3 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(findViewById3, "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById4 = s0Var.itemView.findViewById(com.tencent.mm.R.id.f485682im3);
                    if (findViewById4 == null) {
                        return;
                    }
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(findViewById4, "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                if (i38 == 2) {
                    android.view.View findViewById5 = s0Var.itemView.findViewById(com.tencent.mm.R.id.im7);
                    if (findViewById5 != null) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                        arrayList5.add(0);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(findViewById5, "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById6 = s0Var.itemView.findViewById(com.tencent.mm.R.id.f485682im3);
                    if (findViewById6 == null) {
                        return;
                    }
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(findViewById6, arrayList6.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(findViewById6, "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                if (i38 != 3) {
                    if (i38 != 4) {
                        return;
                    }
                    android.view.View findViewById7 = s0Var.itemView.findViewById(com.tencent.mm.R.id.im7);
                    if (findViewById7 != null) {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                        arrayList7.add(8);
                        java.util.Collections.reverse(arrayList7);
                        yj0.a.d(findViewById7, arrayList7.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                        yj0.a.f(findViewById7, "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById8 = s0Var.itemView.findViewById(com.tencent.mm.R.id.f485682im3);
                    if (findViewById8 == null) {
                        return;
                    }
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
                    arrayList8.add(8);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(findViewById8, arrayList8.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(findViewById8, "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                android.view.View findViewById9 = s0Var.itemView.findViewById(com.tencent.mm.R.id.im7);
                if (findViewById9 != null) {
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal9 = zj0.c.f473285a;
                    arrayList9.add(0);
                    java.util.Collections.reverse(arrayList9);
                    yj0.a.d(findViewById9, arrayList9.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                    yj0.a.f(findViewById9, "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById10 = s0Var.itemView.findViewById(com.tencent.mm.R.id.f485682im3);
                if (findViewById10 != null) {
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal10 = zj0.c.f473285a;
                    arrayList10.add(0);
                    java.util.Collections.reverse(arrayList10);
                    yj0.a.d(findViewById10, arrayList10.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                    yj0.a.f(findViewById10, "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById11 = s0Var.itemView.findViewById(com.tencent.mm.R.id.f485682im3);
                if (findViewById11 != null) {
                    findViewById11.setOnClickListener(new com.tencent.mm.plugin.mv.ui.uic.p7(musicMv));
                    return;
                }
                return;
            case 205:
                android.app.Activity context3 = q7Var.getContext();
                kotlin.jvm.internal.o.g(context3, "context");
                pf5.z zVar3 = pf5.z.f353948a;
                if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.tencent.mm.plugin.mv.ui.uic.t0 t0Var = (com.tencent.mm.plugin.mv.ui.uic.t0) zVar3.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.mv.ui.uic.t0.class);
                t0Var.getClass();
                kotlin.jvm.internal.o.g(musicMv, "musicMv");
                int i39 = com.tencent.mm.sdk.platformtools.z.f193112h;
                if ((i39 == 788529167 || i39 == 788529166) || z65.c.a()) {
                    androidx.appcompat.app.AppCompatActivity activity3 = t0Var.getActivity();
                    kotlin.jvm.internal.o.g(activity3, "activity");
                    r45.hf2 hf2Var = ((com.tencent.mm.plugin.mv.ui.uic.n0) zVar3.a(activity3).a(com.tencent.mm.plugin.mv.ui.uic.n0.class)).f151310i;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("songId", hf2Var.getString(5));
                    jSONObject.put("songName", hf2Var.getString(0));
                    jSONObject.put("singer", hf2Var.getString(1));
                    jSONObject.put("albumName", hf2Var.getString(7));
                    jSONObject.put("albumUrl", hf2Var.getString(8));
                    jSONObject.put("musicWebUrl", hf2Var.getString(4));
                    jSONObject.put("musicDataUrl", hf2Var.getString(2));
                    jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_GENRE, hf2Var.getString(9));
                    jSONObject.put("publicTime", hf2Var.getString(10));
                    jSONObject.put("musicAppId", hf2Var.getString(3));
                    jSONObject.put("publicTimeS", hf2Var.getLong(11));
                    jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, hf2Var.getString(12));
                    jSONObject.put("identification", hf2Var.getString(13));
                    r45.if2 if2Var = (r45.if2) hf2Var.getCustom(17);
                    if (if2Var == null || (str = if2Var.getString(0)) == null) {
                        str = "";
                    }
                    jSONObject.put("operationUrl", str);
                    com.tencent.mm.plugin.music.player.base.l a18 = kl3.t.g().a();
                    jSONObject.put("duration", a18 != null ? java.lang.Integer.valueOf(a18.getDuration()) : null);
                    jSONObject.put("musicDuration", hf2Var.getInteger(14));
                    com.tencent.mm.plugin.music.player.base.l a19 = kl3.t.g().a();
                    jSONObject.put("currentPosition", a19 != null ? java.lang.Integer.valueOf(a19.a()) : null);
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put(dm.i4.COL_LOCALID, musicMv.f264121a);
                    jSONObject2.put("localCoverPath", musicMv.f264122b);
                    jSONObject2.put("mvObjectId", musicMv.f264123c);
                    java.lang.Long l19 = musicMv.f264123c;
                    jSONObject2.put("unsignedMvObjectId", pm0.v.u(l19 != null ? l19.longValue() : 0L));
                    jSONObject2.put("mvObjectNonceId", musicMv.f264124d);
                    jSONObject2.put("mvMakerNickName", musicMv.f264126f);
                    com.tencent.mm.protocal.protobuf.FinderContact finderContact = musicMv.f264130j;
                    jSONObject2.put("mvMakerUsername", finderContact != null ? finderContact.getUsername() : null);
                    jSONObject2.put("coverUrl", musicMv.f264125e);
                    jSONObject2.put("likeCount", musicMv.f264131k);
                    jSONObject2.put("forwardCount", musicMv.f264132l);
                    jSONObject2.put("commentCount", musicMv.f264133m);
                    jSONObject2.put("mvPostStatus", musicMv.f264136p);
                    jSONObject2.put("isDelete", musicMv.f264138r);
                    r45.gf2 gf2Var2 = musicMv.f264129i;
                    jSONObject2.put("originality", gf2Var2 != null ? java.lang.Float.valueOf(gf2Var2.getFloat(0)) : null);
                    r45.gf2 gf2Var3 = musicMv.f264129i;
                    jSONObject2.put("completion", gf2Var3 != null ? java.lang.Float.valueOf(gf2Var3.getFloat(1)) : null);
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    int i47 = 0;
                    for (java.lang.Object obj2 : musicMv.f264127g) {
                        int i48 = i47 + 1;
                        if (i47 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        r45.jf2 jf2Var = (r45.jf2) obj2;
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put(ya.b.INDEX, i47);
                        jSONObject3.put("refObjectId", jf2Var.getLong(i27));
                        jSONObject3.put("unsignedRefObjectId", pm0.v.u(jf2Var.getLong(i27)));
                        jSONObject3.put("refNonceId", jf2Var.getString(i19));
                        jSONObject3.put("timeOffsetInMvMs", jf2Var.getLong(0));
                        jSONObject3.put("timeLengthInMvMs", jf2Var.getInteger(1));
                        jSONObject3.put("timeOffsetInClipMs", jf2Var.getLong(4));
                        jSONObject3.put("isFirstUpload", jf2Var.getInteger(6));
                        jSONArray.put(jSONObject3);
                        jSONObject2 = jSONObject2;
                        i47 = i48;
                        i19 = 3;
                        i27 = 2;
                    }
                    org.json.JSONObject jSONObject4 = jSONObject2;
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    int i49 = 0;
                    for (java.lang.Object obj3 : musicMv.f264135o) {
                        int i57 = i49 + 1;
                        if (i49 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        com.tencent.mm.protocal.protobuf.FinderObject finderObject4 = (com.tencent.mm.protocal.protobuf.FinderObject) obj3;
                        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                        jSONObject5.put(ya.b.INDEX, i49);
                        org.json.JSONObject jSONObject6 = jSONObject4;
                        jSONObject5.put(dm.i4.COL_ID, finderObject4.getId());
                        jSONObject5.put("unsignedId", pm0.v.u(finderObject4.getId()));
                        jSONObject5.put("objectNonceId", finderObject4.getObjectNonceId());
                        com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject4.getContact();
                        jSONObject5.put(dm.i4.COL_USERNAME, contact != null ? contact.getUsername() : null);
                        com.tencent.mm.protocal.protobuf.FinderContact contact2 = finderObject4.getContact();
                        jSONObject5.put("nickname", contact2 != null ? contact2.getNickname() : null);
                        if (finderObject4.getId() != 0) {
                            sb6 = new java.lang.StringBuilder("video_");
                            sb6.append(finderObject4.getId());
                        } else {
                            sb6 = new java.lang.StringBuilder("video_");
                            sb6.append(finderObject4.getObjectNonceId());
                        }
                        java.lang.String mediaId = sb6.toString();
                        jSONObject5.put("mediaId", mediaId);
                        kotlin.jvm.internal.o.g(mediaId, "mediaId");
                        java.lang.String o17 = new com.tencent.mm.vfs.r6(ll3.i1.f319182a.c(mediaId)).o();
                        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                        jSONObject5.put("videoPath", o17);
                        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3 = finderObject4.getObjectDesc();
                        if (objectDesc3 != null && (media = objectDesc3.getMedia()) != null && (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) != null) {
                            jSONObject5.put("video_url", finderMedia.getUrl() + finderMedia.getUrl_token());
                            jSONObject5.put("decodeKey", finderMedia.getDecodeKey());
                            jSONObject5.put("fileSize", finderMedia.getFileSize());
                            jSONObject5.put("width", java.lang.Float.valueOf(finderMedia.getWidth()));
                            jSONObject5.put("height", java.lang.Float.valueOf(finderMedia.getHeight()));
                            jSONObject5.put("videoDuration", finderMedia.getVideoDuration());
                            jSONObject5.put("mediaType", finderMedia.getMediaType());
                            jSONObject5.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, finderMedia.getBitrate());
                            jSONObject5.put("coverUrl", finderMedia.getCoverUrl());
                        }
                        jSONArray2.put(jSONObject5);
                        i49 = i57;
                        jSONObject4 = jSONObject6;
                    }
                    org.json.JSONObject jSONObject7 = jSONObject4;
                    java.util.Map k17 = kz5.c1.k(new jz5.l(5286, "NetSceneMusicMvCheckPermission"), new jz5.l(3710, "NetSceneMusicMvFinderLike"), new jz5.l(5904, "NetSceneMusicMvGetBeatTrack"), new jz5.l(6860, "NetSceneMusicMvGetRecommendList"), new jz5.l(3966, "NetSceneMusicMvGetFinderFavFeed"), new jz5.l(3763, "NetSceneMusicMvGetFinderFeedDetail"), new jz5.l(3965, "NetSceneMusicMvGetFinderLikeFeed"), new jz5.l(5292, "NetSceneMusicMvGetSongStatus"), new jz5.l(6820, "NetSceneMusicMvHeartbeat"), new jz5.l(6893, "NetSceneMusicMvJoin"), new jz5.l(6672, "NetSceneMusicMvPostLiveMsg"));
                    org.json.JSONObject jSONObject8 = new org.json.JSONObject();
                    for (java.util.Map.Entry entry : hm3.a.f282221h.entrySet()) {
                        java.lang.String str2 = (java.lang.String) k17.get(entry.getKey());
                        if (str2 == null) {
                            str2 = java.lang.String.valueOf(((java.lang.Number) entry.getKey()).intValue());
                        }
                        jSONObject8.put(str2, ((hm3.b) entry.getValue()).toString());
                    }
                    com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) t0Var.getActivity(), 0, false);
                    k0Var.f211872n = new com.tencent.mm.plugin.mv.ui.uic.o0(t0Var);
                    k0Var.f211874o = new com.tencent.mm.plugin.mv.ui.uic.p0(t0Var);
                    k0Var.f211881s = new com.tencent.mm.plugin.mv.ui.uic.q0(jSONObject, t0Var, jSONObject7, jSONArray, jSONArray2, jSONObject8);
                    k0Var.f211884v = new com.tencent.mm.plugin.mv.ui.uic.r0(t0Var, jSONObject, jSONObject7, jSONArray, jSONArray2, jSONObject8);
                    k0Var.f211854d = com.tencent.mm.plugin.mv.ui.uic.s0.f151412d;
                    k0Var.v();
                    java.lang.String str3 = t0Var.f151450d;
                    com.tencent.mars.xlog.Log.e(str3, "MV START####################################################START");
                    com.tencent.mars.xlog.Log.e(str3, "songInfoText: " + jSONObject);
                    com.tencent.mars.xlog.Log.e(str3, "mvHeadInfoText: " + jSONObject7);
                    com.tencent.mars.xlog.Log.e(str3, "mvTrackInfoText: " + jSONArray);
                    com.tencent.mars.xlog.Log.e(str3, "mvRefObjInfoText: " + jSONArray2);
                    com.tencent.mars.xlog.Log.e(str3, "cgiInfo: " + jSONArray2);
                    com.tencent.mars.xlog.Log.e(str3, "MV END  ####################################################  END");
                }
                return;
            default:
                return;
        }
    }
}
