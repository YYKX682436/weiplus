package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes7.dex */
public final class e6 extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f203844s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if ((view != null ? view.getTag() : null) != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488451e10);
        com.tencent.mm.ui.chatting.viewitems.d6 d6Var = new com.tencent.mm.ui.chatting.viewitems.d6();
        d6Var.a(xgVar);
        xgVar.setTag(d6Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        java.lang.Object tag = v17.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) tag).d();
        if (f9Var == null) {
            return false;
        }
        yb5.d dVar = this.f203844s;
        kotlin.jvm.internal.o.d(dVar);
        menu.c(d17, 100, 0, dVar.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a componentProvider) {
        kotlin.jvm.internal.o.g(componentProvider, "componentProvider");
        return new com.tencent.mm.ui.chatting.viewitems.f6(f9Var);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 holder, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        this.f203844s = ui6;
        com.tencent.mm.ui.chatting.viewitems.d6 d6Var = (com.tencent.mm.ui.chatting.viewitems.d6) holder;
        ot0.q v17 = ot0.q.v(f9Var != null ? f9Var.U1() : null);
        if (v17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgEcsKFDynamicCardViewHolder", "content is null");
        } else {
            com.tencent.mm.pluginsdk.ui.tools.f0 f0Var = (com.tencent.mm.pluginsdk.ui.tools.f0) v17.y(com.tencent.mm.pluginsdk.ui.tools.f0.class);
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgEcsKFDynamicCardViewHolder", "AppContentEcsKFCardPiece is null");
            } else {
                java.lang.String str3 = f0Var.f191618c;
                java.lang.String str4 = f0Var.f191617b;
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = d6Var.f203772b;
                if (constraintLayout != null) {
                    if (!(constraintLayout.getChildCount() > 0 && !kotlin.jvm.internal.o.b(constraintLayout.getTag(), str3))) {
                        constraintLayout = null;
                    }
                    if (constraintLayout != null) {
                        constraintLayout.removeAllViews();
                    }
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgEcsKFDynamicCardViewHolder", "AppContentEcsKFCardPiece.frameSetName is null");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgEcsKFDynamicCardViewHolder", "framesetname : " + str3 + ", framesetData : " + str4);
                    if (((a12.s) ((a12.k) i95.n0.c(a12.k.class))).wi(java.lang.Integer.valueOf(f0Var.f191619d))) {
                        if (f0Var.f191620e) {
                            android.view.View view = d6Var.f203773c;
                            if (view != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                arrayList.add(0);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgEcsKFDynamicCard$AppMsgEcsKFDynamicCardViewHolder", "parseMsgInfo", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgEcsKFDynamicCard$AppMsgEcsKFDynamicCardViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                                yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgEcsKFDynamicCard$AppMsgEcsKFDynamicCardViewHolder", "parseMsgInfo", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgEcsKFDynamicCard$AppMsgEcsKFDynamicCardViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = d6Var.f203772b;
                            if (constraintLayout2 != null) {
                                constraintLayout2.setMaxWidth((int) constraintLayout2.getResources().getDimension(com.tencent.mm.R.dimen.f480222rt));
                                constraintLayout2.setPadding((int) constraintLayout2.getResources().getDimension(com.tencent.mm.R.dimen.afe), 0, 0, 0);
                                int dimension = (int) constraintLayout2.getResources().getDimension(com.tencent.mm.R.dimen.f479877hq);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLayout_marginTop", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
                                android.view.ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
                                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                                if (marginLayoutParams2 != null) {
                                    marginLayoutParams2.topMargin = dimension;
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLayout_marginTop", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
                                int dimension2 = (int) constraintLayout2.getResources().getDimension(com.tencent.mm.R.dimen.f479877hq);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLayout_marginBottom", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
                                android.view.ViewGroup.LayoutParams layoutParams2 = constraintLayout2.getLayoutParams();
                                marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                                if (marginLayoutParams != null) {
                                    marginLayoutParams.bottomMargin = dimension2;
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLayout_marginBottom", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
                            }
                        } else {
                            android.view.View view2 = d6Var.f203773c;
                            if (view2 != null) {
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                                arrayList2.add(8);
                                java.util.Collections.reverse(arrayList2);
                                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgEcsKFDynamicCard$AppMsgEcsKFDynamicCardViewHolder", "parseMsgInfo", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgEcsKFDynamicCard$AppMsgEcsKFDynamicCardViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                                yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgEcsKFDynamicCard$AppMsgEcsKFDynamicCardViewHolder", "parseMsgInfo", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgEcsKFDynamicCard$AppMsgEcsKFDynamicCardViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = d6Var.f203772b;
                            if (constraintLayout3 != null) {
                                int dimension3 = (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f479877hq);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLayout_marginLeft", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
                                android.view.ViewGroup.LayoutParams layoutParams3 = constraintLayout3.getLayoutParams();
                                marginLayoutParams = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
                                if (marginLayoutParams != null) {
                                    marginLayoutParams.leftMargin = dimension3;
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLayout_marginLeft", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
                            }
                        }
                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout4 = d6Var.f203772b;
                        if (constraintLayout4 != null) {
                            a12.k kVar = (a12.k) i95.n0.c(a12.k.class);
                            kotlin.jvm.internal.o.d(str3);
                            kotlin.jvm.internal.o.d(str4);
                            a12.s sVar = (a12.s) kVar;
                            sVar.getClass();
                            com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsKFDynamicCardService", "setFrameSetView bizHandle:" + sVar.f527h);
                            iq0.c Bi = sVar.Bi();
                            if (Bi != null) {
                                i95.m c17 = i95.n0.c(gq0.t.class);
                                kotlin.jvm.internal.o.f(c17, "getService(...)");
                                gq0.t.Ve((gq0.t) c17, Bi, null, constraintLayout4, str3, str4, 0, new a12.r(str3, sVar), 34, null);
                                str2 = str3;
                            } else {
                                str2 = str3;
                            }
                            constraintLayout4.setTag(str2);
                        } else {
                            str2 = str3;
                        }
                        kotlin.jvm.internal.o.d(str2);
                        sb5.n0 n0Var = (sb5.n0) ui6.f460708c.a(sb5.n0.class);
                        if (n0Var != null) {
                            java.util.HashMap hashMap = ((com.tencent.mm.ui.chatting.component.w9) n0Var).f200161e;
                            hashMap.put(str2, d6Var);
                            com.tencent.mars.xlog.Log.i("MicroMsg.EcsKFComponent", "frameSetNameholdermap size:" + hashMap.size());
                        }
                        a12.k kVar2 = (a12.k) i95.n0.c(a12.k.class);
                        com.tencent.mm.ui.chatting.viewitems.c6 c6Var = new com.tencent.mm.ui.chatting.viewitems.c6(ui6, f9Var, str);
                        a12.s sVar2 = (a12.s) kVar2;
                        sVar2.getClass();
                        sVar2.f529m = new java.lang.ref.WeakReference(c6Var);
                    }
                }
            }
        }
        android.view.View view3 = holder.convertView;
        if (view3 != null) {
            ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).a(view3, f9Var, "ecs_kf_card_dynamic", -1);
        }
    }
}
