package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class f0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public int f141548d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f141549e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView f141550f;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r3 = new com.tencent.mm.plugin.game.model.e1();
        r3.convertFrom(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r3.field_quickResponseContentId.length() <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        r2.f141503p2.add(r3.field_quickResponseContentId);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r1.f141549e.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r4.moveToNext() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if (r4.moveToFirst() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f0(com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView r2, android.content.Context r3, android.database.Cursor r4, int r5) {
        /*
            r1 = this;
            r1.f141550f = r2
            r1.<init>()
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r1.f141549e = r3
            r1.f141548d = r5
            if (r4 != 0) goto L11
            return
        L11:
            int r3 = r4.getCount()
            r5 = 15
            if (r3 >= r5) goto L1c
            r3 = 1
            r2.f141501n2 = r3
        L1c:
            boolean r3 = r4.moveToFirst()
            if (r3 == 0) goto L44
        L22:
            com.tencent.mm.plugin.game.model.e1 r3 = new com.tencent.mm.plugin.game.model.e1
            r3.<init>()
            r3.convertFrom(r4)
            java.lang.String r5 = r3.field_quickResponseContentId
            int r5 = r5.length()
            if (r5 <= 0) goto L39
            java.util.LinkedList r5 = r2.f141503p2
            java.lang.String r0 = r3.field_quickResponseContentId
            r5.add(r0)
        L39:
            java.util.List r5 = r1.f141549e
            r5.add(r3)
            boolean r3 = r4.moveToNext()
            if (r3 != 0) goto L22
        L44:
            r4.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.ui.message.f0.<init>(com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView, android.content.Context, android.database.Cursor, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.LinkedList) this.f141549e).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return super.getItemViewType(i17);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView;
        char c17;
        java.lang.String str;
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout;
        com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView2;
        com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView3;
        int i18;
        android.view.View view;
        android.content.Context context;
        android.content.Context context2;
        android.content.Context context3;
        int i19;
        char c18;
        char c19;
        boolean z17;
        com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView4;
        android.content.Context context4;
        android.content.Context context5;
        android.content.Context context6;
        android.content.Context context7;
        android.content.Context context8;
        android.content.Context context9;
        android.content.Context context10;
        android.content.Context context11;
        android.content.Context context12;
        com.tencent.mm.plugin.game.ui.message.o0 o0Var = (com.tencent.mm.plugin.game.ui.message.o0) k3Var;
        com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView5 = this.f141550f;
        char c27 = (interactiveMsgMRecycleView5.f141501n2 && i17 + 1 == getItemCount()) ? (char) 3 : i17 + 1 == this.f141548d ? (char) 2 : (char) 1;
        com.tencent.mm.plugin.game.model.e1 e1Var = (com.tencent.mm.plugin.game.model.e1) ((java.util.LinkedList) this.f141549e).get(i17);
        o0Var.getClass();
        if (e1Var == null) {
            interactiveMsgMRecycleView4 = interactiveMsgMRecycleView5;
        } else {
            e1Var.t0();
            java.util.HashMap hashMap = e1Var.f140282g2;
            com.tencent.mm.plugin.game.model.z0 z0Var = e1Var.K2;
            com.tencent.mm.plugin.game.ui.message.h1 h1Var = new com.tencent.mm.plugin.game.ui.message.h1(e1Var, (com.tencent.mm.plugin.game.model.r0) hashMap.get(z0Var.f140543a), 4);
            android.view.ViewGroup viewGroup = o0Var.f141594d;
            viewGroup.setTag(h1Var);
            java.lang.String str2 = z0Var.f140546d;
            com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView6 = o0Var.D;
            android.widget.ImageView imageView = o0Var.f141596f;
            com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView.m1(interactiveMsgMRecycleView6, imageView, str2, 0.083333336f);
            if (interactiveMsgMRecycleView6.f141499l2.equals(e1Var.field_gameMsgId)) {
                android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
                interactiveMsgMRecycleView6.f141502o2 = handler;
                com.tencent.mm.plugin.game.ui.message.g0 g0Var = new com.tencent.mm.plugin.game.ui.message.g0(o0Var);
                interactiveMsgMRecycleView6.f141500m2 = g0Var;
                handler.postDelayed(g0Var, 3000L);
                viewGroup.setBackgroundResource(com.tencent.mm.R.drawable.ahn);
                interactiveMsgMRecycleView6.f141499l2 = "";
            } else {
                viewGroup.setBackgroundResource(com.tencent.mm.R.drawable.azm);
            }
            imageView.setTag(new com.tencent.mm.plugin.game.ui.message.h1(e1Var, (com.tencent.mm.plugin.game.model.r0) hashMap.get(z0Var.f140548f), 2));
            com.tencent.mm.plugin.game.ui.message.h0 h0Var = new com.tencent.mm.plugin.game.ui.message.h0(o0Var, e1Var);
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout2 = o0Var.f141595e;
            roundCornerRelativeLayout2.setOnClickListener(h0Var);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context13 = interactiveMsgMRecycleView6.f141493f2;
            java.lang.String str3 = z0Var.f140547e;
            android.widget.TextView textView = o0Var.f141597g;
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context13, str3, textSize));
            textView.setTag(new com.tencent.mm.plugin.game.ui.message.h1(e1Var, (com.tencent.mm.plugin.game.model.r0) hashMap.get(z0Var.f140548f), 1));
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(z0Var.f140549g);
            android.widget.TextView textView2 = o0Var.f141599i;
            android.widget.TextView textView3 = o0Var.f141598h;
            if (K0) {
                textView3.setVisibility(8);
                textView2.setVisibility(8);
                interactiveMsgMRecycleView = interactiveMsgMRecycleView5;
                roundCornerRelativeLayout = roundCornerRelativeLayout2;
                c17 = c27;
                str = "";
                interactiveMsgMRecycleView2 = interactiveMsgMRecycleView6;
            } else {
                com.tencent.mm.plugin.game.model.b1 b1Var = z0Var.f140550h;
                int i27 = b1Var.f140227a;
                interactiveMsgMRecycleView = interactiveMsgMRecycleView5;
                c17 = c27;
                str = "";
                roundCornerRelativeLayout = roundCornerRelativeLayout2;
                if (i27 == 1) {
                    textView2.setVisibility(0);
                    textView3.setVisibility(8);
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    android.content.Context context14 = interactiveMsgMRecycleView6.f141493f2;
                    java.lang.String str4 = z0Var.f140549g;
                    interactiveMsgMRecycleView2 = interactiveMsgMRecycleView6;
                    float textSize2 = textView2.getTextSize();
                    ((ke0.e) xVar2).getClass();
                    textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context14, str4, textSize2));
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(b1Var.f140228b)) {
                        java.lang.String[] split = b1Var.f140228b.split(",");
                        try {
                            if (split.length < 2) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.InteractiveMsgMRecycleView", "number of colors < 2");
                            } else if (com.tencent.mm.ui.bk.C()) {
                                textView2.setTextColor(android.graphics.Color.parseColor(split[1]));
                            } else {
                                textView2.setTextColor(android.graphics.Color.parseColor(split[0]));
                            }
                        } catch (java.lang.IllegalArgumentException e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.InteractiveMsgMRecycleView", e17.getMessage());
                        }
                    }
                    textView.setTag(new com.tencent.mm.plugin.game.ui.message.h1(e1Var, (com.tencent.mm.plugin.game.model.r0) hashMap.get(z0Var.f140548f), 1));
                } else {
                    interactiveMsgMRecycleView2 = interactiveMsgMRecycleView6;
                    if (i27 == 2) {
                        textView3.setVisibility(0);
                        textView2.setVisibility(8);
                        textView3.setText(z0Var.f140549g);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(b1Var.f140228b)) {
                            java.lang.String[] split2 = b1Var.f140228b.split(",");
                            try {
                                if (split2.length < 2) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.InteractiveMsgMRecycleView", "number of colors < 2");
                                } else if (com.tencent.mm.ui.bk.C()) {
                                    textView3.setTextColor(android.graphics.Color.parseColor(split2[1]));
                                } else {
                                    textView3.setTextColor(android.graphics.Color.parseColor(split2[0]));
                                }
                            } catch (java.lang.IllegalArgumentException e18) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.InteractiveMsgMRecycleView", e18.getMessage());
                            }
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(b1Var.f140229c)) {
                            java.lang.String[] split3 = b1Var.f140229c.split(",");
                            try {
                                android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) textView3.getBackground();
                                if (split3.length < 2) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.InteractiveMsgMRecycleView", "number of colors < 2");
                                } else if (com.tencent.mm.ui.bk.C()) {
                                    gradientDrawable.setColor(android.graphics.Color.parseColor(split3[1]));
                                } else {
                                    gradientDrawable.setColor(android.graphics.Color.parseColor(split3[0]));
                                }
                            } catch (java.lang.IllegalArgumentException e19) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.InteractiveMsgMRecycleView", e19.getMessage());
                            }
                        }
                    }
                }
            }
            int i28 = e1Var.field_hasMergedCount;
            android.widget.TextView textView4 = o0Var.f141600m;
            if (i28 <= 1 || i28 < z0Var.f140555m) {
                interactiveMsgMRecycleView3 = interactiveMsgMRecycleView2;
                android.view.View view2 = o0Var.f141604q;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView4.setVisibility(8);
                android.view.View view3 = o0Var.f141613z;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i18 = 0;
                imageView.setVisibility(0);
                roundCornerRelativeLayout.setVisibility(8);
                interactiveMsgMRecycleView3.f141498k2 = false;
            } else {
                int[] iArr = {com.tencent.mm.R.id.h6z, com.tencent.mm.R.id.f485294h70, com.tencent.mm.R.id.f485295h71, com.tencent.mm.R.id.f485296h72};
                imageView.setVisibility(8);
                com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout3 = roundCornerRelativeLayout;
                roundCornerRelativeLayout3.setVisibility(0);
                roundCornerRelativeLayout3.setRadius(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8));
                java.lang.String[] split4 = e1Var.field_mergeSenderIcon.split(";");
                for (int i29 = 0; i29 < split4.length; i29++) {
                    com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView.n1(interactiveMsgMRecycleView2, (android.widget.ImageView) roundCornerRelativeLayout3.findViewById(iArr[i29]), split4[i29]);
                }
                interactiveMsgMRecycleView3 = interactiveMsgMRecycleView2;
                textView4.setVisibility(0);
                textView4.setText(com.tencent.mm.sdk.platformtools.x2.h(com.tencent.mm.R.string.fo8, java.lang.Integer.valueOf(e1Var.field_hasMergedCount)));
                android.view.View view4 = o0Var.f141604q;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view5 = o0Var.f141613z;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView3.setVisibility(8);
                textView2.setVisibility(8);
                interactiveMsgMRecycleView3.f141498k2 = true;
                i18 = 0;
            }
            boolean K02 = com.tencent.mm.sdk.platformtools.t8.K0(z0Var.f140558p);
            android.widget.ImageView imageView2 = o0Var.f141601n;
            if (K02) {
                imageView2.setVisibility(8);
            } else {
                com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView.n1(interactiveMsgMRecycleView3, imageView2, z0Var.f140558p);
                imageView2.setVisibility(i18);
            }
            o0Var.f141606s.setText(r53.e.a(interactiveMsgMRecycleView3.f141493f2, e1Var.field_createTime * 1000));
            android.view.View view6 = o0Var.f141612y;
            android.widget.TextView textView5 = (android.widget.TextView) view6.findViewById(com.tencent.mm.R.id.f485544i20);
            android.view.View view7 = o0Var.f141604q;
            android.widget.ImageView imageView3 = (android.widget.ImageView) view7.findViewById(com.tencent.mm.R.id.i1p);
            java.lang.String str5 = str;
            boolean equals = z0Var.f140562t.equals(str5);
            android.widget.TextView textView6 = o0Var.f141608u;
            android.widget.TextView textView7 = o0Var.f141605r;
            android.widget.TextView textView8 = o0Var.f141603p;
            if (equals) {
                java.lang.String str6 = z0Var.f140556n;
                int indexOf = str6.indexOf("<em class=\"prefix\">");
                view = view7;
                int indexOf2 = str6.indexOf("</em>") - 19;
                java.lang.String replaceAll = str6.replaceAll("<em class=\"prefix\">", str5).replaceAll("</em>", str5);
                if (indexOf < indexOf2) {
                    textView7.setText(replaceAll.substring(indexOf, indexOf2 - 1));
                    context2 = interactiveMsgMRecycleView3.f141493f2;
                    textView8.setText(pg5.d.a(context2, replaceAll.substring(indexOf2)));
                    textView8.setVisibility(0);
                }
                if (z0Var.f140557o.equals(str5)) {
                    android.view.View view8 = o0Var.f141609v;
                    zj0.a aVar = new zj0.a();
                    zj0.c.c(8, aVar);
                    yj0.a.d(view8, aVar.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((java.lang.Integer) aVar.a(0)).intValue());
                    yj0.a.f(view8, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    context = interactiveMsgMRecycleView3.f141493f2;
                    textView6.setText(pg5.d.a(context, z0Var.f140557o));
                    android.view.View view9 = o0Var.f141609v;
                    zj0.a aVar2 = new zj0.a();
                    zj0.c.c(0, aVar2);
                    yj0.a.d(view9, aVar2.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((java.lang.Integer) aVar2.a(0)).intValue());
                    yj0.a.f(view9, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                textView7.setText(z0Var.f140562t);
                if (z0Var.f140563u.equals(str5)) {
                    textView8.setVisibility(8);
                } else {
                    context12 = interactiveMsgMRecycleView3.f141493f2;
                    textView8.setText(pg5.d.a(context12, z0Var.f140563u));
                    textView8.setVisibility(0);
                }
                if (e1Var.field_isGreet) {
                    textView5.setText(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fmm));
                    context11 = interactiveMsgMRecycleView3.f141493f2;
                    textView5.setTextColor(context11.getResources().getColor(com.tencent.mm.R.color.f479173rx));
                    imageView3.setImageResource(com.tencent.mm.R.raw.game_comment_liked);
                } else {
                    textView5.setText(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fml));
                    context9 = interactiveMsgMRecycleView3.f141493f2;
                    textView5.setTextColor(context9.getResources().getColor(com.tencent.mm.R.color.FG_0));
                    if (com.tencent.mm.ui.bk.C()) {
                        imageView3.setImageResource(com.tencent.mm.R.raw.game_comment_like_dark);
                    } else {
                        imageView3.setImageResource(com.tencent.mm.R.raw.game_comment_like);
                    }
                }
                if (z0Var.f140564v.equals(str5)) {
                    android.view.View view10 = o0Var.f141609v;
                    zj0.a aVar3 = new zj0.a();
                    zj0.c.c(8, aVar3);
                    yj0.a.d(view10, aVar3.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view10.setVisibility(((java.lang.Integer) aVar3.a(0)).intValue());
                    yj0.a.f(view10, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    context10 = interactiveMsgMRecycleView3.f141493f2;
                    textView6.setText(pg5.d.a(context10, z0Var.f140564v));
                    android.view.View view11 = o0Var.f141609v;
                    zj0.a aVar4 = new zj0.a();
                    zj0.c.c(0, aVar4);
                    yj0.a.d(view11, aVar4.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view11.setVisibility(((java.lang.Integer) aVar4.a(0)).intValue());
                    yj0.a.f(view11, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                view = view7;
            }
            view6.setOnClickListener(new com.tencent.mm.plugin.game.ui.message.i0(o0Var, textView5, e1Var, imageView3));
            int i37 = z0Var.f140566x;
            android.widget.Button button = o0Var.f141602o;
            if (i37 == 1) {
                android.view.View view12 = o0Var.f141604q;
                zj0.a aVar5 = new zj0.a();
                zj0.c.c(0, aVar5);
                yj0.a.d(view12, aVar5.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view12.setVisibility(((java.lang.Integer) aVar5.a(0)).intValue());
                yj0.a.f(view12, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view13 = o0Var.f141611x;
                zj0.a aVar6 = new zj0.a();
                zj0.c.c(8, aVar6);
                yj0.a.d(view13, aVar6.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((java.lang.Integer) aVar6.a(0)).intValue());
                yj0.a.f(view13, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view14 = o0Var.f141612y;
                zj0.a aVar7 = new zj0.a();
                zj0.c.c(0, aVar7);
                yj0.a.d(view14, aVar7.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view14.setVisibility(((java.lang.Integer) aVar7.a(0)).intValue());
                yj0.a.f(view14, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                button.setVisibility(8);
            } else if (i37 == 2) {
                android.view.View view15 = o0Var.f141604q;
                zj0.a aVar8 = new zj0.a();
                zj0.c.c(0, aVar8);
                yj0.a.d(view15, aVar8.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view15.setVisibility(((java.lang.Integer) aVar8.a(0)).intValue());
                yj0.a.f(view15, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view16 = o0Var.f141611x;
                zj0.a aVar9 = new zj0.a();
                zj0.c.c(0, aVar9);
                yj0.a.d(view16, aVar9.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view16.setVisibility(((java.lang.Integer) aVar9.a(0)).intValue());
                yj0.a.f(view16, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                button.setVisibility(8);
                android.view.View view17 = o0Var.f141612y;
                zj0.a aVar10 = new zj0.a();
                zj0.c.c(8, aVar10);
                yj0.a.d(view17, aVar10.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view17.setVisibility(((java.lang.Integer) aVar10.a(0)).intValue());
                yj0.a.f(view17, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i37 == 3) {
                android.view.View view18 = o0Var.f141604q;
                zj0.a aVar11 = new zj0.a();
                zj0.c.c(0, aVar11);
                yj0.a.d(view18, aVar11.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view18.setVisibility(((java.lang.Integer) aVar11.a(0)).intValue());
                yj0.a.f(view18, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view19 = o0Var.f141611x;
                zj0.a aVar12 = new zj0.a();
                zj0.c.c(0, aVar12);
                yj0.a.d(view19, aVar12.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view19.setVisibility(((java.lang.Integer) aVar12.a(0)).intValue());
                yj0.a.f(view19, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                button.setVisibility(8);
                android.view.View view20 = o0Var.f141612y;
                zj0.a aVar13 = new zj0.a();
                zj0.c.c(0, aVar13);
                yj0.a.d(view20, aVar13.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view20.setVisibility(((java.lang.Integer) aVar13.a(0)).intValue());
                yj0.a.f(view20, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i37 != 4) {
                android.view.View view21 = o0Var.f141611x;
                zj0.a aVar14 = new zj0.a();
                zj0.c.c(8, aVar14);
                yj0.a.d(view21, aVar14.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view21.setVisibility(((java.lang.Integer) aVar14.a(0)).intValue());
                yj0.a.f(view21, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view22 = o0Var.f141612y;
                zj0.a aVar15 = new zj0.a();
                zj0.c.c(8, aVar15);
                yj0.a.d(view22, aVar15.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view22.setVisibility(((java.lang.Integer) aVar15.a(0)).intValue());
                yj0.a.f(view22, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                button.setVisibility(8);
            } else {
                android.view.ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
                context4 = interactiveMsgMRecycleView3.f141493f2;
                layoutParams.width = i65.a.b(context4, 66);
                context5 = interactiveMsgMRecycleView3.f141493f2;
                button.setTextColor(context5.getResources().getColor(com.tencent.mm.R.color.BW_100));
                int i38 = e1Var.field_relationType;
                if (i38 == 0) {
                    button.setBackgroundResource(com.tencent.mm.R.drawable.aew);
                    o0Var.C = (android.graphics.drawable.GradientDrawable) button.getBackground();
                    if (com.tencent.mm.ui.bk.C()) {
                        o0Var.C.setColor(interactiveMsgMRecycleView3.getResources().getColor(com.tencent.mm.R.color.f479184s8));
                    }
                    button.setText(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fmi));
                } else if (i38 == 1) {
                    button.setBackgroundResource(com.tencent.mm.R.drawable.aev);
                    button.setText(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fmk));
                    context6 = interactiveMsgMRecycleView3.f141493f2;
                    button.setTextColor(context6.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
                } else if (i38 != 3) {
                    button.setBackgroundResource(com.tencent.mm.R.drawable.aew);
                    o0Var.C = (android.graphics.drawable.GradientDrawable) button.getBackground();
                    if (com.tencent.mm.ui.bk.C()) {
                        o0Var.C.setColor(interactiveMsgMRecycleView3.getResources().getColor(com.tencent.mm.R.color.f479184s8));
                    }
                    button.setText(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fmj));
                } else {
                    button.setBackgroundResource(com.tencent.mm.R.drawable.aev);
                    o0Var.C = (android.graphics.drawable.GradientDrawable) button.getBackground();
                    context7 = interactiveMsgMRecycleView3.f141493f2;
                    layoutParams.width = i65.a.b(context7, 80);
                    context8 = interactiveMsgMRecycleView3.f141493f2;
                    button.setTextColor(context8.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
                    button.setText(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fme));
                }
                button.setLayoutParams(layoutParams);
                android.view.View view23 = o0Var.f141604q;
                zj0.a aVar16 = new zj0.a();
                zj0.c.c(8, aVar16);
                yj0.a.d(view23, aVar16.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view23.setVisibility(((java.lang.Integer) aVar16.a(0)).intValue());
                yj0.a.f(view23, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                button.setVisibility(0);
            }
            context3 = interactiveMsgMRecycleView3.f141493f2;
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context3);
            u1Var.g(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fmg));
            u1Var.n(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fmh));
            u1Var.j(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fmf));
            button.setOnClickListener(new com.tencent.mm.plugin.game.ui.message.l0(o0Var, e1Var, u1Var));
            o0Var.f141613z.setOnClickListener(new com.tencent.mm.plugin.game.ui.message.m0(o0Var, e1Var));
            o0Var.f141611x.setOnClickListener(new com.tencent.mm.plugin.game.ui.message.n0(o0Var, e1Var));
            z0Var.f140560r = str5;
            boolean K03 = com.tencent.mm.sdk.platformtools.t8.K0(str5);
            android.widget.TextView textView9 = o0Var.f141607t;
            if (K03) {
                i19 = 8;
                textView9.setVisibility(8);
                c18 = c17;
                c19 = 1;
            } else {
                textView9.setVisibility(0);
                textView9.setText(z0Var.f140560r);
                c18 = c17;
                c19 = 1;
                i19 = 8;
            }
            if (c18 == c19) {
                android.view.View view24 = o0Var.f141610w;
                zj0.a aVar17 = new zj0.a();
                zj0.c.c(0, aVar17);
                yj0.a.d(view24, aVar17.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view24.setVisibility(((java.lang.Integer) aVar17.a(0)).intValue());
                yj0.a.f(view24, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view25 = o0Var.A;
                zj0.a aVar18 = new zj0.a();
                zj0.c.c(8, aVar18);
                yj0.a.d(view25, aVar18.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view25.setVisibility(((java.lang.Integer) aVar18.a(0)).intValue());
                yj0.a.f(view25, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view26 = o0Var.B;
                zj0.a aVar19 = new zj0.a();
                zj0.c.c(8, aVar19);
                yj0.a.d(view26, aVar19.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view26.setVisibility(((java.lang.Integer) aVar19.a(0)).intValue());
                yj0.a.f(view26, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (c18 == 2) {
                android.view.View view27 = o0Var.f141610w;
                zj0.a aVar20 = new zj0.a();
                zj0.c.c(8, aVar20);
                yj0.a.d(view27, aVar20.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view27.setVisibility(((java.lang.Integer) aVar20.a(0)).intValue());
                yj0.a.f(view27, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view28 = o0Var.A;
                zj0.a aVar21 = new zj0.a();
                zj0.c.c(0, aVar21);
                yj0.a.d(view28, aVar21.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view28.setVisibility(((java.lang.Integer) aVar21.a(0)).intValue());
                yj0.a.f(view28, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view29 = o0Var.B;
                zj0.a aVar22 = new zj0.a();
                zj0.c.c(8, aVar22);
                yj0.a.d(view29, aVar22.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view29.setVisibility(((java.lang.Integer) aVar22.a(0)).intValue());
                yj0.a.f(view29, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (c18 == 3) {
                android.view.View view30 = o0Var.f141610w;
                zj0.a aVar23 = new zj0.a();
                zj0.c.c(i19, aVar23);
                yj0.a.d(view30, aVar23.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view30.setVisibility(((java.lang.Integer) aVar23.a(0)).intValue());
                yj0.a.f(view30, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view31 = o0Var.A;
                zj0.a aVar24 = new zj0.a();
                zj0.c.c(8, aVar24);
                yj0.a.d(view31, aVar24.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view31.setVisibility(((java.lang.Integer) aVar24.a(0)).intValue());
                yj0.a.f(view31, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view32 = o0Var.B;
                zj0.a aVar25 = new zj0.a();
                zj0.c.c(0, aVar25);
                yj0.a.d(view32, aVar25.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view32.setVisibility(((java.lang.Integer) aVar25.a(0)).intValue());
                yj0.a.f(view32, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view33 = view;
            android.widget.ImageView imageView4 = (android.widget.ImageView) view33.findViewById(com.tencent.mm.R.id.goi);
            android.widget.ImageView imageView5 = (android.widget.ImageView) o0Var.f141609v.findViewById(com.tencent.mm.R.id.gnh);
            android.widget.ImageView imageView6 = (android.widget.ImageView) view33.findViewById(com.tencent.mm.R.id.gm9);
            if (com.tencent.mm.ui.bk.C()) {
                imageView4.setImageResource(com.tencent.mm.R.raw.game_comment_reply_dark);
                imageView5.setImageResource(com.tencent.mm.R.raw.game_comment_rectangle_dark);
                imageView6.setImageResource(com.tencent.mm.R.raw.game_comment_more_user_dark);
            } else {
                imageView4.setImageResource(com.tencent.mm.R.raw.game_comment_reply);
                imageView5.setImageResource(com.tencent.mm.R.raw.game_comment_rectangle);
                imageView6.setImageResource(com.tencent.mm.R.raw.game_comment_more_user);
            }
            z17 = interactiveMsgMRecycleView3.f141498k2;
            if (z17) {
                android.view.View view34 = o0Var.f141604q;
                zj0.a aVar26 = new zj0.a();
                zj0.c.c(0, aVar26);
                yj0.a.d(view34, aVar26.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view34.setVisibility(((java.lang.Integer) aVar26.a(0)).intValue());
                yj0.a.f(view34, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                button.setVisibility(8);
                android.view.View view35 = o0Var.f141611x;
                zj0.a aVar27 = new zj0.a();
                zj0.c.c(8, aVar27);
                yj0.a.d(view35, aVar27.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view35.setVisibility(((java.lang.Integer) aVar27.a(0)).intValue());
                yj0.a.f(view35, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view36 = o0Var.f141612y;
                zj0.a aVar28 = new zj0.a();
                zj0.c.c(8, aVar28);
                yj0.a.d(view36, aVar28.b(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view36.setVisibility(((java.lang.Integer) aVar28.a(0)).intValue());
                yj0.a.f(view36, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            interactiveMsgMRecycleView4 = interactiveMsgMRecycleView;
        }
        java.util.HashSet hashSet = (java.util.HashSet) interactiveMsgMRecycleView4.f141504q2;
        if (hashSet.contains(java.lang.Integer.valueOf(i17))) {
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("tab", "1");
        hashMap2.put("isnew", i17 >= this.f141548d ? "2" : "1");
        hashMap2.put("fold", java.lang.String.valueOf(e1Var.field_hasMergedCount));
        hashMap2.put("ext_data", e1Var.U2);
        com.tencent.mm.game.report.l.d(interactiveMsgMRecycleView4.getContext(), 13, 1300, i17 + 1, 1, 0, e1Var.field_appId, interactiveMsgMRecycleView4.f141494g2, e1Var.S2, e1Var.field_gameMsgId, e1Var.T2, com.tencent.mm.game.report.l.b(hashMap2));
        hashSet.add(java.lang.Integer.valueOf(i17));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView = this.f141550f;
        return new com.tencent.mm.plugin.game.ui.message.o0(interactiveMsgMRecycleView, android.view.LayoutInflater.from(interactiveMsgMRecycleView.f141493f2).inflate(com.tencent.mm.R.layout.bgi, viewGroup, false));
    }
}
