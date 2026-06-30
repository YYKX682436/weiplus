package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class h4 {
    public h4(kotlin.jvm.internal.i iVar) {
    }

    public static void b(com.tencent.mm.plugin.textstatus.ui.h4 h4Var, android.content.Context context, java.lang.String str, int i17, java.lang.String str2, java.lang.Integer num, android.view.View view, java.lang.String str3, java.lang.String str4, int i18, java.lang.Object obj) {
        int i19;
        int i27;
        android.app.Activity activity;
        java.lang.String str5 = (i18 & 2) != 0 ? "" : str;
        java.lang.String scene = (i18 & 8) != 0 ? "SCENE_DEFAULT" : str2;
        java.lang.Integer num2 = (i18 & 16) != 0 ? null : num;
        android.view.View view2 = (i18 & 32) != 0 ? null : view;
        java.lang.String exitAnimStyle = (i18 & 64) != 0 ? "VALUE_EXIT_CARD_ANIM_AVATAR_STYLE" : str3;
        java.lang.String str6 = (i18 & 128) == 0 ? str4 : "";
        h4Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(exitAnimStyle, "exitAnimStyle");
        synchronized (com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173479p) {
            com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173478o.a(context, str5);
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.class);
        intent.putExtra("KEY_USER_NAME", str5);
        intent.putExtra("KEY_FROM_SCENE", scene);
        boolean z17 = true;
        if (!bi4.v1.k() || view2 == null) {
            i19 = -1;
            i27 = -1;
        } else {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            i27 = iArr[0];
            i19 = iArr[1];
        }
        intent.putExtra("KEY_START_CARD_ANIM_X_OFFSET", i27);
        intent.putExtra("KEY_START_CARD_ANIM_Y_OFFSET", i19);
        intent.putExtra("KEY_EXIT_CARD_ANIM_STYLE", exitAnimStyle);
        if (num2 != null) {
            num2.intValue();
            intent.putExtra("KEY_SCROLL_INDEX", num2.intValue());
        }
        if (str6 != null && str6.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            intent.putExtra("KEY_SCROLL_STATUS_ID", str6);
        }
        boolean z18 = context instanceof android.app.Activity;
        android.app.Activity activity2 = z18 ? (android.app.Activity) context : null;
        if (activity2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity2, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity$Companion", "startForResult", "(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "startForResult context=" + context + ", userName=" + str5 + ", requestCode=" + i17 + ", scene=" + scene + ", scrollIndex=" + num2 + ", scrollStatusId=" + str6 + ", archorView=" + view2);
        if (i27 == -1 || i19 == -1) {
            activity = z18 ? (android.app.Activity) context : null;
            if (activity != null) {
                activity.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
                return;
            }
            return;
        }
        activity = z18 ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.overridePendingTransition(0, 0);
        }
    }

    public final void a(android.content.Context context, java.lang.String str) {
        int intValue;
        com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173479p.clear();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.textstatus.ui.ac.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.textstatus.ui.ac acVar = (com.tencent.mm.plugin.textstatus.ui.ac) a17;
        acVar.f173729g = str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = acVar.f173727e;
        arrayList.addAll(arrayList2);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : arrayList) {
            if (obj instanceof mj4.h) {
                mj4.k kVar = (mj4.k) ((mj4.h) obj);
                if (!linkedHashMap.containsKey(kVar.o())) {
                    java.lang.String o17 = kVar.o();
                    com.tencent.mm.plugin.textstatus.ui.h4 h4Var = com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173478o;
                    java.util.LinkedList linkedList = com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173479p;
                    linkedHashMap.put(o17, java.lang.Integer.valueOf(linkedList.size()));
                    linkedList.add(new java.util.LinkedList());
                }
                java.lang.Integer num = (java.lang.Integer) linkedHashMap.get(kVar.o());
                intValue = num != null ? num.intValue() : 0;
                com.tencent.mm.plugin.textstatus.ui.h4 h4Var2 = com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173478o;
                java.util.LinkedList linkedList2 = (java.util.LinkedList) kz5.n0.a0(com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173479p, intValue);
                if (linkedList2 != null) {
                    linkedList2.add(obj);
                }
            } else if (obj instanceof nj4.e) {
                for (mj4.h hVar : ((nj4.e) obj).f337936d.f5135b) {
                    java.util.LinkedList linkedList3 = new java.util.LinkedList();
                    linkedList3.add(hVar);
                    com.tencent.mm.plugin.textstatus.ui.h4 h4Var3 = com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173478o;
                    com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173479p.add(linkedList3);
                }
            } else if (obj instanceof pj4.n1) {
                mj4.h a18 = fj4.b.a((pj4.n1) obj);
                bk4.d2 d2Var = bk4.d2.f21456a;
                java.lang.String c17 = bk4.d2.c(d2Var, d2Var.a(((mj4.k) a18).f327067b.field_CreateTime * 1000), null, 2, null);
                if (!linkedHashMap.containsKey(c17)) {
                    com.tencent.mm.plugin.textstatus.ui.h4 h4Var4 = com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173478o;
                    java.util.LinkedList linkedList4 = com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173479p;
                    linkedHashMap.put(c17, java.lang.Integer.valueOf(linkedList4.size()));
                    linkedList4.add(new java.util.LinkedList());
                }
                java.lang.Integer num2 = (java.lang.Integer) linkedHashMap.get(c17);
                intValue = num2 != null ? num2.intValue() : 0;
                com.tencent.mm.plugin.textstatus.ui.h4 h4Var5 = com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173478o;
                java.util.LinkedList linkedList5 = (java.util.LinkedList) kz5.n0.a0(com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173479p, intValue);
                if (linkedList5 != null) {
                    linkedList5.add(a18);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "prepareStart, " + str + ", dataSize=" + arrayList2.size() + ", itemsSnapShot Size=" + com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173479p.size());
    }
}
