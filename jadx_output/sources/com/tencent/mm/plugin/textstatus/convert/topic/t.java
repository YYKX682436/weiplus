package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f173367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.d f173368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f173369f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.u f173370g;

    public t(in5.s0 s0Var, com.tencent.mm.plugin.textstatus.convert.topic.d dVar, android.view.View view, com.tencent.mm.plugin.textstatus.convert.topic.u uVar) {
        this.f173367d = s0Var;
        this.f173368e = dVar;
        this.f173369f = view;
        this.f173370g = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        int i18;
        android.app.Activity activity;
        android.view.View view2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/SquareSameTopicFriendItemConvert$onBindViewHolder$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.ui.h4 h4Var = com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173478o;
        android.content.Context context = this.f173367d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.textstatus.convert.topic.d dVar = this.f173368e;
        java.lang.String str = dVar.f173265e;
        com.tencent.mm.plugin.textstatus.convert.topic.u uVar = this.f173370g;
        android.content.Context context2 = uVar.f173380n;
        kotlin.jvm.internal.o.g(context2, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.textstatus.ui.kd kdVar = (com.tencent.mm.plugin.textstatus.ui.kd) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.textstatus.ui.kd.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getLikeList] likeList = ");
        java.util.ArrayList arrayList2 = kdVar.f174037d;
        sb6.append(arrayList2);
        java.lang.String sb7 = sb6.toString();
        int i19 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusLikeUIC", sb7, null);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add((java.lang.String) it.next());
        }
        synchronized (com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173479p) {
            com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173478o.a(context, str);
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.class);
        intent.putExtra("KEY_USER_NAME", str);
        intent.putExtra("KEY_FROM_SCENE", "SCENE_DEFAULT");
        if (!bi4.v1.k() || (view2 = this.f173369f) == null) {
            i17 = -1;
            i18 = -1;
        } else {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            i17 = iArr[0];
            i18 = iArr[1];
        }
        intent.putExtra("KEY_START_CARD_ANIM_X_OFFSET", i17);
        intent.putExtra("KEY_START_CARD_ANIM_Y_OFFSET", i18);
        intent.putExtra("KEY_LIKE_LIST_STATUS_ID", arrayList3);
        intent.putExtra("KEY_EXIT_CARD_ANIM_STYLE", "VALUE_EXIT_CARD_ANIM_CARD_STYLE");
        boolean z17 = context instanceof android.app.Activity;
        android.app.Activity activity2 = z17 ? (android.app.Activity) context : null;
        if (activity2 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList4.add(1002);
            arrayList4.add(intent);
            java.util.Collections.reverse(arrayList4);
            yj0.a.k(activity2, arrayList4.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity$Companion", "startForResult", "(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Landroid/view/View;Ljava/lang/String;Ljava/util/ArrayList;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
        if (i17 == -1 || i18 == -1) {
            activity = z17 ? (android.app.Activity) context : null;
            if (activity != null) {
                activity.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
            }
        } else {
            activity = z17 ? (android.app.Activity) context : null;
            if (activity != null) {
                activity.overridePendingTransition(0, 0);
            }
        }
        qj4.s.m(qj4.s.f363958a, uVar.f173380n, 30L, null, dVar.f173267g, 0L, 0L, 0L, 0L, null, null, 12L, 1012, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/topic/SquareSameTopicFriendItemConvert$onBindViewHolder$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
