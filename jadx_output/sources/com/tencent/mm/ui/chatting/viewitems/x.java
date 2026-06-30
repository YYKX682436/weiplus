package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes10.dex */
public final class x {
    public x(kotlin.jvm.internal.i iVar) {
    }

    public static final java.lang.String a(com.tencent.mm.ui.chatting.viewitems.x xVar, com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder) {
        com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget finderLiveOnliveWidget;
        java.lang.String f131216x;
        java.lang.String f131216x2;
        java.lang.String f131216x3;
        xVar.getClass();
        android.view.View liveTag = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveTag();
        if (liveTag != null && liveTag.getVisibility() == 0) {
            android.view.View liveTag2 = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveTag();
            finderLiveOnliveWidget = liveTag2 instanceof com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget ? (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) liveTag2 : null;
            if (finderLiveOnliveWidget != null && (f131216x3 = finderLiveOnliveWidget.getF131216x()) != null) {
                return f131216x3;
            }
        } else {
            android.view.View liveEndNewTag = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveEndNewTag();
            if (liveEndNewTag != null && liveEndNewTag.getVisibility() == 0) {
                android.view.View liveEndNewTag2 = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveEndNewTag();
                finderLiveOnliveWidget = liveEndNewTag2 instanceof com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget ? (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) liveEndNewTag2 : null;
                if (finderLiveOnliveWidget != null && (f131216x2 = finderLiveOnliveWidget.getF131216x()) != null) {
                    return f131216x2;
                }
            } else {
                android.view.View liveEndTagV3 = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveEndTagV3();
                if (liveEndTagV3 != null && liveEndTagV3.getVisibility() == 0) {
                    android.view.View liveEndTagV32 = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveEndTagV3();
                    finderLiveOnliveWidget = liveEndTagV32 instanceof com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget ? (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) liveEndTagV32 : null;
                    if (finderLiveOnliveWidget != null && (f131216x = finderLiveOnliveWidget.getF131216x()) != null) {
                        return f131216x;
                    }
                }
            }
        }
        return "";
    }

    public static final void b(com.tencent.mm.ui.chatting.viewitems.x xVar, com.tencent.mm.storage.f9 f9Var, yb5.d dVar, r45.g92 g92Var, java.lang.String str) {
        java.lang.String str2;
        java.lang.String c17;
        xVar.getClass();
        int i17 = dVar.D() ? 2 : 1;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String string = g92Var.getString(0);
        java.lang.String str3 = "";
        if (string == null) {
            string = "";
        }
        hashMap.put("liveid", string);
        hashMap.put("share_type", java.lang.String.valueOf(i17));
        if (f9Var == null || (str2 = g95.e0.d(f9Var)) == null) {
            str2 = "";
        }
        hashMap.put("share_wxusername", str2);
        if (f9Var != null && (c17 = g95.e0.c(f9Var)) != null) {
            str3 = c17;
        }
        hashMap.put("share_chat_wxusername", str3);
        hashMap.put("button_txt", str);
        com.tencent.mars.xlog.Log.i("ChatingItemAppMsgFinderLiveFeed", "report exposed with params " + hashMap);
        i95.m c18 = i95.n0.c(s40.p0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Tj("liveid_share_end_more", hashMap, null, "temp_6", null, null);
    }

    public static final com.tencent.mm.ui.chatting.viewitems.w r(r45.l71 l71Var, r45.g92 g92Var) {
        r45.lw1 lw1Var;
        java.lang.String string;
        java.util.LinkedList list;
        java.lang.Object obj;
        r45.d84 d84Var = l71Var != null ? (r45.d84) l71Var.getCustom(9) : null;
        boolean z17 = true;
        if (l71Var == null || (list = l71Var.getList(15)) == null) {
            lw1Var = null;
        } else {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.lw1) obj).getInteger(5) == 2) {
                    break;
                }
            }
            lw1Var = (r45.lw1) obj;
        }
        com.tencent.mm.ui.chatting.viewitems.w wVar = new com.tencent.mm.ui.chatting.viewitems.w();
        java.lang.String string2 = lw1Var != null ? lw1Var.getString(0) : null;
        if (string2 == null || string2.length() == 0) {
            java.lang.String string3 = d84Var != null ? d84Var.getString(0) : null;
            if (string3 == null || string3.length() == 0) {
                java.lang.String string4 = g92Var.getString(5);
                if (string4 == null || string4.length() == 0) {
                    java.lang.String string5 = g92Var.getString(11);
                    if (string5 != null && string5.length() != 0) {
                        z17 = false;
                    }
                    if (!z17) {
                        java.lang.String string6 = g92Var.getString(11);
                        java.lang.String str = string6 != null ? string6 : "";
                        wVar.f205893a = str;
                        wVar.f205894b = str;
                    }
                } else {
                    java.lang.String string7 = g92Var.getString(5);
                    if (string7 == null) {
                        string7 = "";
                    }
                    wVar.f205893a = string7;
                    java.util.regex.Pattern compile = java.util.regex.Pattern.compile("&?token=[^&]*");
                    kotlin.jvm.internal.o.f(compile, "compile(...)");
                    java.lang.String replaceAll = compile.matcher(string7).replaceAll("");
                    kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
                    wVar.f205894b = replaceAll;
                }
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(d84Var != null ? d84Var.getString(0) : null);
                java.lang.String string8 = d84Var != null ? d84Var.getString(1) : null;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (string8 == null) {
                    string8 = "";
                }
                sb6.append(string8);
                java.lang.String sb7 = sb6.toString();
                kotlin.jvm.internal.o.g(sb7, "<set-?>");
                wVar.f205893a = sb7;
                string = d84Var != null ? d84Var.getString(0) : null;
                wVar.f205894b = string != null ? string : "";
            }
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(lw1Var != null ? lw1Var.getString(0) : null);
            java.lang.String string9 = lw1Var != null ? lw1Var.getString(1) : null;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (string9 == null) {
                string9 = "";
            }
            sb8.append(string9);
            java.lang.String sb9 = sb8.toString();
            kotlin.jvm.internal.o.g(sb9, "<set-?>");
            wVar.f205893a = sb9;
            string = lw1Var != null ? lw1Var.getString(0) : null;
            wVar.f205894b = string != null ? string : "";
        }
        return wVar;
    }

    public static final void s(r45.g92 g92Var, r45.nw1 nw1Var, r45.l71 l71Var, com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder, qs5.n nVar) {
        int i17;
        java.lang.String str;
        r45.co1 co1Var;
        r45.co1 co1Var2;
        android.view.View liveTag = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveTag();
        if (liveTag == null) {
            i17 = 0;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(liveTag, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            liveTag.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            i17 = 0;
            yj0.a.f(liveTag, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View liveTag2 = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveTag();
        com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget finderLiveOnliveWidget = liveTag2 instanceof com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget ? (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) liveTag2 : null;
        if (finderLiveOnliveWidget != null) {
            android.graphics.drawable.Drawable drawable = finderLiveOnliveWidget.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a4y, null);
            finderLiveOnliveWidget.f131201f = drawable;
            finderLiveOnliveWidget.f131200e = 1;
            finderLiveOnliveWidget.setBackground(drawable);
        }
        android.view.View liveEndTag = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveEndTag();
        if (liveEndTag != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(liveEndTag, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            liveEndTag.setVisibility(((java.lang.Integer) arrayList2.get(i17)).intValue());
            yj0.a.f(liveEndTag, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View liveEndNewTag = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveEndNewTag();
        if (liveEndNewTag != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(liveEndNewTag, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            liveEndNewTag.setVisibility(((java.lang.Integer) arrayList3.get(i17)).intValue());
            yj0.a.f(liveEndNewTag, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View liveEndTagV3 = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveEndTagV3();
        if (liveEndTagV3 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(liveEndTagV3, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            liveEndTagV3.setVisibility(((java.lang.Integer) arrayList4.get(i17)).intValue());
            yj0.a.f(liveEndTagV3, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0.O1((s40.w0) c17, chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveTag(), nVar, false, g92Var, 4, null);
        android.widget.TextView finderDesc = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getFinderDesc();
        if (finderDesc != null) {
            com.tencent.mm.ui.chatting.viewitems.z.f206107a.f(true, finderDesc, g92Var);
        }
        if (((nw1Var == null || (co1Var2 = (r45.co1) nw1Var.getCustom(43)) == null || co1Var2.getInteger(i17) != 1) ? i17 : 1) == 0) {
            com.tencent.mm.ui.chatting.viewitems.w r17 = r(l71Var, g92Var);
            ((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Di(r17.f205893a, chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getFinderThumb(), r17.f205894b, mn2.f1.D);
            android.widget.TextView finderBansTv = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getFinderBansTv();
            if (finderBansTv == null) {
                return;
            }
            finderBansTv.setVisibility(8);
            return;
        }
        com.tencent.mm.ui.chatting.viewitems.w r18 = r(l71Var, g92Var);
        i95.m c18 = i95.n0.c(vd2.i5.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        vd2.i5.Fb((vd2.i5) c18, r18.f205893a, chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getFinderThumb(), r18.f205894b, null, 8, null);
        android.widget.TextView finderBansTv2 = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getFinderBansTv();
        if (finderBansTv2 != null) {
            if (nw1Var == null || (co1Var = (r45.co1) nw1Var.getCustom(43)) == null || (str = co1Var.getString(1)) == null) {
                str = "";
            }
            finderBansTv2.setText(str);
        }
        android.widget.TextView finderBansTv3 = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getFinderBansTv();
        if (finderBansTv3 == null) {
            return;
        }
        finderBansTv3.setVisibility(i17);
    }

    public final void c(com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder holder, float f17, float f18, android.content.Context context) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(context);
        int min = java.lang.Math.min(a17.f197135a, a17.f197136b) / 8;
        int i17 = min * 3;
        int i18 = min * 4;
        android.widget.ImageView finderThumb = holder.getFinderThumb();
        android.view.ViewGroup.LayoutParams layoutParams = finderThumb != null ? finderThumb.getLayoutParams() : null;
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.width = i17;
        layoutParams2.height = i18;
        android.widget.ImageView finderThumb2 = holder.getFinderThumb();
        if (finderThumb2 != null) {
            finderThumb2.setLayoutParams(layoutParams2);
        }
        android.view.View finderOlympicView = holder.getFinderOlympicView();
        if (finderOlympicView != null) {
            finderOlympicView.setLayoutParams(layoutParams2);
        }
        android.view.View finderThumbSpace = holder.getFinderThumbSpace();
        if (finderThumbSpace != null) {
            finderThumbSpace.setLayoutParams(layoutParams2);
        }
        android.view.View view = holder.clickArea;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.width = i17;
                view.setLayoutParams(layoutParams4);
                holder.setWidth(i17);
            }
        }
        com.tencent.mars.xlog.Log.i("ChatingItemAppMsgFinderLiveFeed", "New layout enabled: mediaWidth=" + i17 + ", targetHeight=" + i18 + ", unitX=" + min + ", holder.width=" + holder.getWidth() + ", clickArea adjusted");
    }

    public final boolean d(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null || com.tencent.mm.sdk.platformtools.t8.K0(f9Var.j()) || ot0.q.v(f9Var.j()) == null) {
            return true;
        }
        r45.g92 g92Var = ((zy2.c) ot0.q.v(f9Var.j()).y(zy2.c.class)).f477359b;
        s40.b1 b1Var = (s40.b1) i95.n0.c(s40.b1.class);
        r45.nw1 nw1Var = (r45.nw1) g92Var.getCustom(24);
        int integer = nw1Var != null ? nw1Var.getInteger(54) : 0;
        ((com.tencent.mm.feature.finder.live.t6) b1Var).getClass();
        return zl2.r4.f473950a.n(integer);
    }

    public final void e(com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder holder, r45.g92 shareObject, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity;
        java.lang.Long j17;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(shareObject, "shareObject");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String string = shareObject.getString(0);
        long longValue = (string == null || (j17 = r26.h0.j(string)) == null) ? 0L : j17.longValue();
        com.tencent.mm.ui.chatting.viewitems.o oVar = new com.tencent.mm.ui.chatting.viewitems.o(holder, shareObject, longValue, ui6, msg);
        if (ui6.g() instanceof com.tencent.mm.ui.MMFragmentActivity) {
            android.app.Activity g17 = ui6.g();
            kotlin.jvm.internal.o.e(g17, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            mMFragmentActivity = (com.tencent.mm.ui.MMFragmentActivity) g17;
        } else {
            mMFragmentActivity = null;
        }
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        qs5.d dVar = qs5.d.f366426e;
        s40.w0.u9((s40.w0) c17, longValue, false, mMFragmentActivity, oVar, 1, null, null, null, 224, null);
    }

    public final void f(boolean z17, android.widget.TextView descTv, r45.g92 shareObject) {
        kotlin.jvm.internal.o.g(descTv, "descTv");
        kotlin.jvm.internal.o.g(shareObject, "shareObject");
        if (z17) {
            java.lang.String string = shareObject.getString(4);
            if (!(string == null || string.length() == 0) && ((r40.i) ((tc.e) i95.n0.c(tc.e.class))).wi()) {
                descTv.setVisibility(0);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = descTv.getContext();
                java.lang.String string2 = shareObject.getString(4);
                ((ke0.e) xVar).getClass();
                descTv.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string2));
                return;
            }
        }
        descTv.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0419  */
    /* JADX WARN: Type inference failed for: r1v20, types: [kz5.p0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(long r44, long r46, android.view.View r48, zy2.c r49, yb5.d r50, com.tencent.mm.storage.f9 r51, boolean r52, long r53, java.lang.String r55, r45.k30 r56, android.content.Intent r57) {
        /*
            Method dump skipped, instructions count: 1321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.x.g(long, long, android.view.View, zy2.c, yb5.d, com.tencent.mm.storage.f9, boolean, long, java.lang.String, r45.k30, android.content.Intent):void");
    }

    public final void h(android.view.View view, r45.g92 finderObject, yb5.d ui6, java.lang.String userName, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(userName, "userName");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(view);
        try {
            java.lang.String string = finderObject.getString(0);
            long parseLong = string != null ? java.lang.Long.parseLong(string) : -1L;
            try {
                if (k(finderObject, (r45.nw1) finderObject.getCustom(24))) {
                    return;
                }
                kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
                f0Var.f310116d = -1;
                f0Var.f310116d = ui6.D() ? 1 : 0;
                cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                aVar.pk(view, "live_room_card");
                jz5.l[] lVarArr = new jz5.l[5];
                java.lang.String string2 = finderObject.getString(2);
                if (string2 == null) {
                    string2 = "";
                }
                lVarArr[0] = new jz5.l("feed_id", string2);
                java.lang.String string3 = finderObject.getString(0);
                if (string3 == null) {
                    string3 = "";
                }
                lVarArr[1] = new jz5.l("live_id", string3);
                ((v80.n) ((w80.j) i95.n0.c(w80.j.class))).getClass();
                ml2.q1 q1Var = ml2.q1.f327812e;
                lVarArr[2] = new jz5.l("comment_scene", "temp_6");
                java.lang.String string4 = finderObject.getString(1);
                if (string4 == null) {
                    string4 = "";
                }
                lVarArr[3] = new jz5.l("finder_username", string4);
                lVarArr[4] = new jz5.l("session_buffer", "");
                aVar.gk(view, kz5.c1.k(lVarArr));
                aVar.Ai(view, new com.tencent.mm.ui.chatting.viewitems.p(finderObject, f0Var, userName));
                if (z17) {
                    p52.h.f352016a.e(java.lang.String.valueOf(finderObject.getString(0)), null);
                }
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Vj(view, 40, new com.tencent.mm.ui.chatting.viewitems.q(finderObject, view, parseLong));
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Exception unused2) {
        }
    }

    public final android.view.View i(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return view.findViewById(com.tencent.mm.R.id.f7y);
    }

    public final boolean j(java.lang.String str, r45.nw1 nw1Var, android.view.View view, long j17) {
        kotlin.jvm.internal.o.g(view, "view");
        return ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Zi(str, view.findViewById(com.tencent.mm.R.id.f4x), i(view), j17);
    }

    public final boolean k(r45.g92 shareObject, r45.nw1 nw1Var) {
        kotlin.jvm.internal.o.g(shareObject, "shareObject");
        if (nw1Var == null) {
            return ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ni(shareObject);
        }
        return ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).bj(shareObject.getString(1), nw1Var);
    }

    public final boolean l(com.tencent.mm.ui.chatting.viewitems.a0 a0Var, android.view.View v17, yb5.d ui6, com.tencent.mm.storage.f9 msg, java.lang.String str) {
        zy2.c cVar;
        kotlinx.coroutines.y0 b17;
        com.tencent.mm.ui.chatting.adapter.q qVar;
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        ot0.q v18 = ot0.q.v(msg.U1());
        h0Var.f310123d = v18;
        if (v18 == null || (cVar = (zy2.c) v18.y(zy2.c.class)) == null) {
            return false;
        }
        long Z = pm0.v.Z(cVar.f477359b.getString(2));
        long Z2 = pm0.v.Z(cVar.f477359b.getString(0));
        java.lang.Object tag = v17.getTag();
        com.tencent.mm.ui.chatting.viewitems.er erVar = tag instanceof com.tencent.mm.ui.chatting.viewitems.er ? (com.tencent.mm.ui.chatting.viewitems.er) tag : null;
        if (erVar == null || (qVar = erVar.f203908d) == null || (b17 = qVar.getViewHolderScope()) == null) {
            b17 = kotlinx.coroutines.z0.b();
        }
        kotlinx.coroutines.y0 y0Var = b17;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.ui.chatting.viewitems.u(cVar, a0Var, Z, v17, str, ui6, Z2, msg, h0Var, elapsedRealtime, null), 2, null);
        return false;
    }

    public final void m(r45.g92 shareObject, boolean z17) {
        kotlin.jvm.internal.o.g(shareObject, "shareObject");
        long Z = pm0.v.Z(shareObject.getString(2));
        int i17 = qs5.g.f366432a;
        int integer = shareObject.getInteger(22);
        ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Vi(true, Z, ya.a.SHARE, ((integer == 2 || integer == 8 || integer == 16) || shareObject.getInteger(22) == 6) ? 1 : 2, z17 ? 2 : 1);
    }

    public final void n(com.tencent.mm.storage.f9 f9Var) {
        r45.g92 g92Var = null;
        g92Var = null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f9Var != null ? f9Var.j() : null)) {
            ot0.q v17 = ot0.q.v(f9Var != null ? f9Var.U1() : null);
            if (v17 != null) {
                boolean R4 = com.tencent.mm.storage.z3.R4(f9Var != null ? f9Var.Q0() : null);
                g92Var = ((zy2.c) v17.y(zy2.c.class)).f477359b;
                g92Var.set(44, java.lang.Integer.valueOf(R4 ? 4 : 3));
            }
        }
        if (g92Var != null) {
            m40.i0 i0Var = (m40.i0) i95.n0.c(m40.i0.class);
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("share_scene", java.lang.String.valueOf(g92Var.getInteger(44)));
            lVarArr[1] = new jz5.l("liveid", java.lang.String.valueOf(g92Var.getString(0)));
            java.lang.String string = g92Var.getString(2);
            if (string == null) {
                string = "";
            }
            lVarArr[2] = new jz5.l("feedid", string);
            ((b92.y0) i0Var).wi(true, kz5.c1.i(lVarArr));
        }
    }

    public final void o(yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        ot0.q v17;
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (com.tencent.mm.sdk.platformtools.t8.K0(msg.j()) || (v17 = ot0.q.v(msg.U1())) == null) {
            return;
        }
        boolean R4 = com.tencent.mm.storage.z3.R4(msg.Q0());
        r45.g92 g92Var = ((zy2.c) v17.y(zy2.c.class)).f477359b;
        g92Var.set(44, java.lang.Integer.valueOf(R4 ? 4 : 3));
        android.content.Intent intent = new android.content.Intent(ui6.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
        intent.putExtra("Retr_Msg_Id", msg.getMsgId());
        intent.putExtra("Retr_MsgTalker", msg.Q0());
        int i17 = v17.f348666i;
        if (i17 == 63) {
            intent.putExtra("Retr_Msg_Type", 23);
        } else if (i17 == 88) {
            intent.putExtra("Retr_Msg_Type", 31);
        }
        intent.putExtra("scene_from", 17);
        m40.i0 i0Var = (m40.i0) i95.n0.c(m40.i0.class);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("share_scene", java.lang.String.valueOf(g92Var.getInteger(44)));
        lVarArr[1] = new jz5.l("liveid", java.lang.String.valueOf(g92Var.getString(0)));
        java.lang.String string = g92Var.getString(2);
        if (string == null) {
            string = "";
        }
        lVarArr[2] = new jz5.l("feedid", string);
        ((b92.y0) i0Var).wi(false, kz5.c1.i(lVarArr));
        com.tencent.mars.xlog.Log.i("ChatingItemAppMsgFinderLiveFeed", "retransmit content.type:" + v17.f348666i);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", ot0.q.u(v17, null, null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        ((zy2.db) i95.n0.c(zy2.db.class)).getClass();
        j45.l.q(ui6.f460709d, intent, 1001, new com.tencent.mm.ui.chatting.viewitems.v(R4, g92Var));
    }

    public final void p(com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder holder, r45.g92 shareObject) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(shareObject, "shareObject");
        r45.xz3 xz3Var = (r45.xz3) shareObject.getCustom(43);
        if (xz3Var == null || (str = xz3Var.getString(1)) == null) {
            str = "";
        }
        android.widget.ImageView instantDiscountMask = holder.getInstantDiscountMask();
        if (instantDiscountMask != null) {
            if (!(str.length() > 0)) {
                instantDiscountMask.setVisibility(8);
            } else {
                instantDiscountMask.setVisibility(0);
                new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ai(str, com.tencent.mm.plugin.finder.storage.y90.f128356f)).c(instantDiscountMask);
            }
        }
    }

    public final boolean q(yb5.d ui6, com.tencent.mm.ui.chatting.viewitems.g0 tag, r45.g92 shareObject, r45.nw1 nw1Var, r45.l71 l71Var, com.tencent.mm.storage.f9 f9Var) {
        r45.nw1 nw1Var2;
        java.lang.String str;
        r45.co1 co1Var;
        r45.co1 co1Var2;
        java.lang.String str2;
        java.lang.String str3;
        r45.co1 co1Var3;
        r45.co1 co1Var4;
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(shareObject, "shareObject");
        com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder = (com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder) tag;
        qs5.n Wj = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Wj(shareObject, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveCardState:");
        sb6.append(Wj);
        sb6.append(", liveFlag, ");
        sb6.append(nw1Var != null ? java.lang.Integer.valueOf(nw1Var.getInteger(37)) : null);
        com.tencent.mars.xlog.Log.i("ChatingItemAppMsgFinderLiveFeed", sb6.toString());
        jz5.l Ij = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Ij(nw1Var != null ? nw1Var.getLong(0) : 0L);
        java.lang.Integer num = Ij != null ? (java.lang.Integer) Ij.f302833d : null;
        int ordinal = Wj.ordinal();
        if (ordinal != 0) {
            com.tencent.mm.ui.chatting.viewitems.x xVar = com.tencent.mm.ui.chatting.viewitems.z.f206107a;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                s(shareObject, nw1Var, l71Var, chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder, Wj);
                            }
                            return true;
                        }
                    }
                }
                android.view.View liveTag = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveTag();
                if (liveTag != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(liveTag, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    liveTag.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(liveTag, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View liveEndTag = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveEndTag();
                if (liveEndTag != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(liveEndTag, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    liveEndTag.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(liveEndTag, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View finderOlympicView = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getFinderOlympicView();
                if (finderOlympicView != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(finderOlympicView, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    finderOlympicView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(finderOlympicView, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.ImageView activityInfoIcon = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getActivityInfoIcon();
                if (activityInfoIcon != null) {
                    activityInfoIcon.setVisibility(8);
                }
                android.widget.TextView reasonTv = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getReasonTv();
                if (reasonTv != null) {
                    reasonTv.setVisibility(8);
                }
                android.widget.TextView finderBansTv = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getFinderBansTv();
                if (finderBansTv != null) {
                    finderBansTv.setVisibility(8);
                }
                android.widget.TextView finderDesc = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getFinderDesc();
                if (finderDesc != null) {
                    xVar.f(false, finderDesc, shareObject);
                }
                jz5.l Ij2 = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Ij(nw1Var != null ? nw1Var.getLong(0) : 0L);
                java.lang.Integer num2 = Ij2 != null ? (java.lang.Integer) Ij2.f302833d : null;
                if (pm0.v.z(num2 != null ? num2.intValue() : 0, 4)) {
                    android.view.View liveEndNewTag = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveEndNewTag();
                    if (liveEndNewTag != null) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(liveEndNewTag, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        liveEndNewTag.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(liveEndNewTag, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View liveEndTagV3 = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveEndTagV3();
                    if (liveEndTagV3 != null) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                        arrayList5.add(0);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(liveEndTagV3, arrayList5.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        liveEndTagV3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(liveEndTagV3, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    i95.m c17 = i95.n0.c(s40.w0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    str2 = "getService(...)";
                    s40.w0.g6((s40.w0) c17, chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveEndTagV3(), Wj, false, shareObject, 4, null);
                } else {
                    str2 = "getService(...)";
                    android.view.View liveEndNewTag2 = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveEndNewTag();
                    if (liveEndNewTag2 != null) {
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                        arrayList6.add(0);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(liveEndNewTag2, arrayList6.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        liveEndNewTag2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                        yj0.a.f(liveEndNewTag2, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View liveEndTagV32 = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveEndTagV3();
                    if (liveEndTagV32 != null) {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                        arrayList7.add(8);
                        java.util.Collections.reverse(arrayList7);
                        yj0.a.d(liveEndTagV32, arrayList7.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        liveEndTagV32.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                        yj0.a.f(liveEndTagV32, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    i95.m c18 = i95.n0.c(s40.w0.class);
                    kotlin.jvm.internal.o.f(c18, str2);
                    s40.w0.g6((s40.w0) c18, chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveEndNewTag(), Wj, false, shareObject, 4, null);
                }
                if ((nw1Var == null || (co1Var4 = (r45.co1) nw1Var.getCustom(43)) == null || co1Var4.getInteger(0) != 1) ? false : true) {
                    com.tencent.mm.ui.chatting.viewitems.w r17 = r(l71Var, shareObject);
                    i95.m c19 = i95.n0.c(vd2.i5.class);
                    kotlin.jvm.internal.o.f(c19, str2);
                    vd2.i5.Fb((vd2.i5) c19, r17.f205893a, chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getFinderThumb(), r17.f205894b, null, 8, null);
                    android.widget.TextView finderBansTv2 = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getFinderBansTv();
                    if (finderBansTv2 != null) {
                        if (nw1Var == null || (co1Var3 = (r45.co1) nw1Var.getCustom(43)) == null || (str3 = co1Var3.getString(1)) == null) {
                            str3 = "";
                        }
                        finderBansTv2.setText(str3);
                    }
                    android.widget.TextView finderBansTv3 = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getFinderBansTv();
                    if (finderBansTv3 != null) {
                        finderBansTv3.setVisibility(0);
                    }
                } else {
                    com.tencent.mm.ui.chatting.viewitems.w r18 = r(l71Var, shareObject);
                    ((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Di(r18.f205893a, chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getFinderThumb(), r18.f205894b, mn2.f1.D);
                    android.widget.TextView finderBansTv4 = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getFinderBansTv();
                    if (finderBansTv4 != null) {
                        finderBansTv4.setVisibility(8);
                    }
                }
            } else if (((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).vk(nw1Var, "chat")) {
                if (pm0.v.z(num != null ? num.intValue() : 0, 2)) {
                    s(shareObject, nw1Var, l71Var, chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder, Wj);
                    nw1Var2 = null;
                } else {
                    android.view.View liveTag2 = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveTag();
                    if (liveTag2 != null) {
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
                        arrayList8.add(0);
                        java.util.Collections.reverse(arrayList8);
                        yj0.a.d(liveTag2, arrayList8.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        liveTag2.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                        yj0.a.f(liveTag2, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View liveTag3 = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveTag();
                    com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget finderLiveOnliveWidget = liveTag3 instanceof com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget ? (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) liveTag3 : null;
                    if (finderLiveOnliveWidget != null) {
                        nw1Var2 = null;
                        android.graphics.drawable.Drawable drawable = finderLiveOnliveWidget.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a4z, null);
                        finderLiveOnliveWidget.f131201f = drawable;
                        finderLiveOnliveWidget.f131200e = 6;
                        finderLiveOnliveWidget.setBackground(drawable);
                    } else {
                        nw1Var2 = null;
                    }
                    android.view.View liveEndTag2 = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveEndTag();
                    if (liveEndTag2 != null) {
                        java.util.ArrayList arrayList9 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal9 = zj0.c.f473285a;
                        arrayList9.add(8);
                        java.util.Collections.reverse(arrayList9);
                        yj0.a.d(liveEndTag2, arrayList9.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        liveEndTag2.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                        yj0.a.f(liveEndTag2, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View liveEndNewTag3 = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveEndNewTag();
                    if (liveEndNewTag3 != null) {
                        java.util.ArrayList arrayList10 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal10 = zj0.c.f473285a;
                        arrayList10.add(8);
                        java.util.Collections.reverse(arrayList10);
                        yj0.a.d(liveEndNewTag3, arrayList10.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        liveEndNewTag3.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                        yj0.a.f(liveEndNewTag3, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View liveEndTagV33 = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveEndTagV3();
                    if (liveEndTagV33 != null) {
                        java.util.ArrayList arrayList11 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal11 = zj0.c.f473285a;
                        arrayList11.add(8);
                        java.util.Collections.reverse(arrayList11);
                        yj0.a.d(liveEndTagV33, arrayList11.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        liveEndTagV33.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                        yj0.a.f(liveEndTagV33, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    i95.m c27 = i95.n0.c(s40.w0.class);
                    kotlin.jvm.internal.o.f(c27, "getService(...)");
                    s40.w0.g6((s40.w0) c27, chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveTag(), Wj, false, shareObject, 4, null);
                    android.widget.TextView finderDesc2 = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getFinderDesc();
                    if (finderDesc2 != null) {
                        xVar.f(true, finderDesc2, shareObject);
                    }
                    if ((nw1Var == null || (co1Var2 = (r45.co1) nw1Var.getCustom(43)) == null || co1Var2.getInteger(0) != 1) ? false : true) {
                        com.tencent.mm.ui.chatting.viewitems.w r19 = r(l71Var, shareObject);
                        i95.m c28 = i95.n0.c(vd2.i5.class);
                        kotlin.jvm.internal.o.f(c28, "getService(...)");
                        vd2.i5.Fb((vd2.i5) c28, r19.f205893a, chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getFinderThumb(), r19.f205894b, null, 8, null);
                        android.widget.TextView finderBansTv5 = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getFinderBansTv();
                        if (finderBansTv5 != null) {
                            if (nw1Var == null || (co1Var = (r45.co1) nw1Var.getCustom(43)) == null || (str = co1Var.getString(1)) == null) {
                                str = "";
                            }
                            finderBansTv5.setText(str);
                        }
                        android.widget.TextView finderBansTv6 = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getFinderBansTv();
                        if (finderBansTv6 != null) {
                            finderBansTv6.setVisibility(0);
                        }
                    } else {
                        com.tencent.mm.ui.chatting.viewitems.w r27 = r(l71Var, shareObject);
                        ((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Di(r27.f205893a, chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getFinderThumb(), r27.f205894b, mn2.f1.D);
                        android.widget.TextView finderBansTv7 = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getFinderBansTv();
                        if (finderBansTv7 != null) {
                            finderBansTv7.setVisibility(8);
                        }
                    }
                }
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                if (l71Var != null) {
                    nw1Var2 = (r45.nw1) l71Var.getCustom(1);
                }
                ((c61.l7) b6Var).cj(nw1Var2, 4);
            } else {
                s(shareObject, nw1Var, l71Var, chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder, Wj);
            }
            return true;
        }
        s(shareObject, nw1Var, l71Var, chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder, Wj);
        return true;
    }
}
