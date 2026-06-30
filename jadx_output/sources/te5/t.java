package te5;

/* loaded from: classes9.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final te5.t f418749a = new te5.t();

    public static final void a(java.lang.String str, yb5.d context, com.tencent.mm.storage.f9 msgInfo, l15.c commonMsg) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(commonMsg, "commonMsg");
        ((ku5.t0) ku5.t0.f312615d).g(new te5.r(str, context, msgInfo, commonMsg));
    }

    public static final boolean b(com.tencent.mm.storage.f9 f9Var, android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (f9Var == null || !tg3.s1.a(f9Var)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemHelperKt", "unread media expired");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.container.MMCommonActivity.class);
        pf5.j0.a(intent, fo.d.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/utils/ChattingItemHelperKt", "checkUnreadMediaExpired", "(Lcom/tencent/mm/storage/MsgInfo;Landroid/content/Context;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/chatting/utils/ChattingItemHelperKt", "checkUnreadMediaExpired", "(Lcom/tencent/mm/storage/MsgInfo;Landroid/content/Context;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    public static final java.lang.String c(java.lang.String str) {
        java.lang.String Vi;
        if (str != null) {
            i95.m c17 = i95.n0.c(qk.k6.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            return ((rk4.a) ((qk.k6) c17)).Ni(0, null, str, null, null);
        }
        qk.g9 bj6 = ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).bj();
        if (bj6 == null || (Vi = ((rk4.z8) bj6).Vi(0)) == null) {
            return null;
        }
        return Vi;
    }

    public static final void e(ot0.q content, yb5.d ui6, android.view.View v17, com.tencent.mm.storage.f9 msg, com.tencent.mm.ui.chatting.viewitems.qq chattingItemWrapper) {
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(chattingItemWrapper, "chattingItemWrapper");
        com.tencent.mm.ui.tools.sd sdVar = com.tencent.mm.ui.tools.sd.f210742a;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceStateHolder", "open appBrand");
        sdVar.b(false);
        if (com.tencent.mm.sdk.platformtools.t8.K0(content.f348677k2) && com.tencent.mm.sdk.platformtools.t8.K0(content.f348673j2)) {
            java.lang.String wi6 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(content.f348674k, ui6.D() ? "groupmessage" : "singlemessage");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", wi6);
            intent.putExtra("webpageTitle", content.f348654f);
            intent.putExtra("shortUrl", content.f348674k);
            j45.l.j(ui6.g(), "webview", ".ui.tools.WebViewUI", intent, null);
        } else {
            java.lang.String x17 = ui6.x();
            java.lang.String a17 = chattingItemWrapper.a(ui6, msg);
            android.os.Bundle bundle = new android.os.Bundle();
            if (ui6.D()) {
                bundle.putInt("stat_scene", 2);
            } else {
                bundle.putInt("stat_scene", c01.e2.G(x17) ? 7 : 1);
            }
            bundle.putString("stat_msg_id", "msg_" + msg.I0());
            bundle.putString("stat_chat_talker_username", x17);
            bundle.putString("stat_send_msg_user", a17);
            bundle.putBoolean("stat_kf_guide", r01.a0.t0(msg));
            bundle.putInt("chat_type", k01.d.a(ui6.x()));
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Ri(ui6.g(), ui6.x(), chattingItemWrapper.a(ui6, msg), ui6.D(), content, bundle);
        }
        com.tencent.mm.ui.chatting.component.c0.f198856r.b(ui6, v17, msg);
    }

    public static final void f(yb5.d ui6, com.tencent.mm.storage.f9 f9Var) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        if (f9Var == null) {
            return;
        }
        hu.f fVar = new hu.f();
        fVar.w(f9Var.getMsgId());
        fVar.y(java.lang.Long.valueOf(f9Var.I0()));
        java.lang.String Q0 = f9Var.Q0();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (Q0 == null) {
            Q0 = "";
        }
        fVar.z(Q0);
        java.lang.String V1 = f9Var.V1();
        if (V1 == null) {
            V1 = f9Var.y0();
        }
        fVar.x(V1 != null ? V1 : "");
        fVar.u(0);
        android.content.Intent intent = new android.content.Intent(ui6.g(), (java.lang.Class<?>) com.tencent.mm.feature.appmsg.ui.RecordDetailUI.class);
        intent.putExtra("params", fVar.toJson().toString());
        android.app.Activity g17 = ui6.g();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/ui/chatting/utils/ChattingItemHelperKt", "handleRecordClickNew", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        g17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(g17, "com/tencent/mm/ui/chatting/utils/ChattingItemHelperKt", "handleRecordClickNew", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static final boolean g(com.tencent.mm.storage.f9 f9Var, ot0.q qVar, yb5.d ui6) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        if (f9Var == null || qVar == null) {
            return false;
        }
        if (!k01.i.a(qVar)) {
            if (!(qVar.f348666i == 44)) {
                return false;
            }
        }
        long c17 = c01.id.c() - f9Var.getCreateTime();
        java.lang.Long TODO_MAX_DAYS = rn.e.f397599e;
        kotlin.jvm.internal.o.f(TODO_MAX_DAYS, "TODO_MAX_DAYS");
        return c17 < TODO_MAX_DAYS.longValue() && c01.e2.Z(ui6.x());
    }

    public static final void i(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, int i17) {
        if (dVar == null || f9Var == null) {
            return;
        }
        com.tencent.mm.ui.chatting.manager.c cVar = dVar.f460708c;
        r01.r1.d(f9Var, ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) cVar.a(sb5.f.class))).f198751p, ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) cVar.a(sb5.f.class))).A0(), i17);
    }

    public static final void k(boolean z17, android.view.View todoContainerLl, android.widget.TextView todoDescTv, yb5.d ui6) {
        kotlin.jvm.internal.o.g(todoContainerLl, "todoContainerLl");
        kotlin.jvm.internal.o.g(todoDescTv, "todoDescTv");
        kotlin.jvm.internal.o.g(ui6, "ui");
        android.view.ViewGroup.LayoutParams layoutParams = todoContainerLl.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        com.tencent.mm.ui.chatting.manager.c cVar = ui6.f460708c;
        todoContainerLl.setBackgroundResource(((com.tencent.mm.ui.chatting.component.v2) ((sb5.e) cVar.a(sb5.e.class))).n0());
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = ((com.tencent.mm.ui.chatting.component.v2) ((sb5.e) cVar.a(sb5.e.class))).o0(i65.a.f(ui6.g(), com.tencent.mm.R.dimen.f479556yd));
        }
        if (marginLayoutParams != null) {
            todoContainerLl.setLayoutParams(marginLayoutParams);
        }
        com.tencent.mm.ui.bk.s0(todoDescTv.getPaint());
        if (z17) {
            todoDescTv.setTextColor(ui6.g().getResources().getColor(com.tencent.mm.R.color.Link_100));
            todoDescTv.setText(com.tencent.mm.R.string.ft_);
        } else {
            todoDescTv.setTextColor(ui6.g().getResources().getColor(com.tencent.mm.R.color.adg));
            todoDescTv.setText(com.tencent.mm.R.string.ftb);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0373 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0375 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(yb5.d r28, com.tencent.mm.storage.f9 r29) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: te5.t.d(yb5.d, com.tencent.mm.storage.f9):boolean");
    }

    public final void h(android.view.View v17, x05.k finderObject, java.lang.String msgContent) {
        mm2.e1 e1Var;
        r45.nw1 nw1Var;
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        kotlin.jvm.internal.o.g(msgContent, "msgContent");
        long Z = pm0.v.Z(finderObject.C());
        long Z2 = pm0.v.Z(finderObject.A());
        ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).getClass();
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        android.content.Context context = k0Var != null ? k0Var.getContext() : null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        boolean z17 = false;
        if (activity != null && !activity.isFinishing() && (e1Var = (mm2.e1) efVar.i(mm2.e1.class)) != null && (nw1Var = e1Var.f328988r) != null && nw1Var.getLong(0) == Z2) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemHelperKt", "isLiveActivityExist, liveId:".concat(pm0.v.u(Z2)));
            return;
        }
        kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(b17, kotlinx.coroutines.internal.b0.f310484a, null, new te5.s(finderObject, Z, v17, Z2, msgContent, null), 2, null);
    }

    public final void j(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (kotlin.jvm.internal.o.b(str, "-1")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemHelperKt", "showEmoji fail cause md5 is no valid");
            return;
        }
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(str);
        if (u17 == null || u17.k()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemHelperKt", "showEmoji fail cause md5 is no valid");
            return;
        }
        if (str == null) {
            str = "";
        }
        qk.u uVar = new qk.u(str, u17);
        if (str2 != null) {
            uVar.f364005g = str2;
        } else {
            java.lang.String str4 = u17.field_app_id;
            if (str4 == null) {
                str4 = "";
            }
            uVar.f364005g = str4;
        }
        if (str3 == null) {
            str3 = "";
        }
        uVar.f364006h = str3;
        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
        if (p6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemHelperKt", "emoticon liteapp service not found");
        } else {
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(context, uVar);
        }
    }

    public final void l(android.content.Context context, a11.c viewHolder, z01.e eVar) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        if (eVar == null) {
            return;
        }
        java.lang.String str2 = eVar.f468995a;
        int a17 = com.tencent.mm.storage.m2.a(eVar.f468996b);
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m i17 = com.tencent.mm.pluginsdk.model.app.w.i(str2, a17);
        if ((i17 != null ? i17.field_appName : null) != null) {
            java.lang.String field_appName = i17.field_appName;
            kotlin.jvm.internal.o.f(field_appName, "field_appName");
            if (!(r26.n0.u0(field_appName).toString().length() == 0)) {
                str = i17.field_appName;
                if ((str2 != null || str2.length() == 0) && ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).ij(str)) {
                    android.view.View view = viewHolder.f504a;
                    if (view != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(java.lang.Integer.valueOf(intValue));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/chatting/utils/ChattingItemHelperKt", "tryFillSourceForAppShare", "(Landroid/content/Context;Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;Lcom/tencent/mm/modelchatting/AppSourceViewParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/ui/chatting/utils/ChattingItemHelperKt", "tryFillSourceForAppShare", "(Landroid/content/Context;Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;Lcom/tencent/mm/modelchatting/AppSourceViewParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    java.lang.String Vi = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Vi(context, i17, str);
                    kotlin.jvm.internal.o.f(Vi, "getNameBasedOnLang(...)");
                    android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(str2, 2, i65.a.g(context));
                    if (Di == null || Di.isRecycled()) {
                        android.content.res.Resources resources = context.getResources();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList3.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.bku));
                        arrayList3.add(resources);
                        java.lang.Object obj = new java.lang.Object();
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(obj, arrayList3.toArray(), "com/tencent/mm/ui/chatting/utils/ChattingItemHelperKt", "tryFillSourceForAppShare", "(Landroid/content/Context;Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;Lcom/tencent/mm/modelchatting/AppSourceViewParams;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList3.get(0), ((java.lang.Integer) arrayList3.get(1)).intValue());
                        yj0.a.e(obj, decodeResource, "com/tencent/mm/ui/chatting/utils/ChattingItemHelperKt", "tryFillSourceForAppShare", "(Landroid/content/Context;Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;Lcom/tencent/mm/modelchatting/AppSourceViewParams;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                        kotlin.jvm.internal.o.d(decodeResource);
                        Di = decodeResource;
                    }
                    android.graphics.Bitmap s07 = com.tencent.mm.sdk.platformtools.x.s0(Di, false, eVar.f468998d);
                    kotlin.jvm.internal.o.f(s07, "getRoundedCornerBitmap(...)");
                    android.widget.TextView textView = viewHolder.f506c;
                    if (textView != null) {
                        textView.setText(Vi);
                    }
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    if (textView != null) {
                        textView.setCompoundDrawables(null, null, null, null);
                    }
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = viewHolder.f505b;
                    if (weImageView != null) {
                        weImageView.setVisibility(0);
                    }
                    android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(s07);
                    int dimension = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479930ja);
                    bitmapDrawable.setBounds(0, 0, dimension, dimension);
                    if (weImageView != null) {
                        weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.a9e));
                    }
                    if (weImageView != null) {
                        weImageView.setImageDrawable(bitmapDrawable);
                    }
                    if (weImageView != null) {
                        weImageView.setImageBitmap(s07);
                        return;
                    }
                    return;
                }
            }
        }
        str = eVar.f468997c;
        if (str2 != null || str2.length() == 0) {
        }
    }

    public final void m(android.content.Context context, a11.c viewHolder, z01.i iVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        if (iVar == null) {
            return;
        }
        java.lang.String str = iVar.f469053c;
        java.util.List list = com.tencent.mm.ui.chatting.viewitems.qg.f205362a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(iVar.f469051a) && iVar.f469052b >= 0) {
            android.view.View view = viewHolder.f504a;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/chatting/utils/ChattingItemHelperKt", "tryFillSourceForBiz", "(Landroid/content/Context;Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;Lcom/tencent/mm/modelchatting/BizSourceViewParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/utils/ChattingItemHelperKt", "tryFillSourceForBiz", "(Landroid/content/Context;Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;Lcom/tencent/mm/modelchatting/BizSourceViewParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.ui.chatting.viewitems.qg.d(context, iVar.f469053c, viewHolder.f505b, viewHolder.f506c);
        }
    }
}
