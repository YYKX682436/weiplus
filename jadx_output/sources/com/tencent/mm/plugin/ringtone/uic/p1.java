package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class p1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.x1 f158456d;

    public p1(com.tencent.mm.plugin.ringtone.uic.x1 x1Var) {
        this.f158456d = x1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2;
        vx3.i iVar = (vx3.i) obj;
        long j17 = iVar.f441298o;
        if (j17 > 0) {
            qx3.d.c(j17, iVar);
        }
        cy3.d dVar = this.f158456d.f158541d;
        if (dVar != null) {
            boolean z17 = iVar.f441297n;
            android.widget.TextView textView = dVar.f224760b;
            com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = dVar.f224761c;
            android.content.Context context = dVar.f224765g;
            if (z17) {
                if (textView != null) {
                    textView.setText(context.getString(com.tencent.mm.R.string.i3f));
                }
                if (textView != null) {
                    textView.setTextColor(i65.a.d(context, com.tencent.mm.R.color.FG_4));
                }
                if (mMAnimateView != null) {
                    kotlin.jvm.internal.o.g(context, "context");
                    int d17 = i65.a.d(context, com.tencent.mm.R.color.a38);
                    android.graphics.drawable.Drawable mutate = i65.a.i(context, com.tencent.mm.R.raw.icons_filled_error).mutate();
                    kotlin.jvm.internal.o.f(mutate, "mutate(...)");
                    mutate.setColorFilter(new android.graphics.PorterDuffColorFilter(android.graphics.Color.argb(android.graphics.Color.alpha(d17), android.graphics.Color.red(d17), android.graphics.Color.green(d17), android.graphics.Color.blue(d17)), android.graphics.PorterDuff.Mode.SRC_ATOP));
                    mutate.setAlpha(android.graphics.Color.alpha(d17));
                    mMAnimateView.setImageDrawable(mutate);
                }
            } else {
                vx3.i iVar2 = dVar.f224766h;
                if (kotlin.jvm.internal.o.b(iVar2 != null ? iVar2.e() : null, iVar.e())) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CommonRingtoneLayout", "hashCode is same:" + iVar.e() + ", skip bind!");
                    return;
                }
                if (textView != null) {
                    textView.setText(iVar.f441292i);
                }
                com.tencent.mm.plugin.ringtone.widget.RingtoneAuthorLayout ringtoneAuthorLayout = dVar.f224764f;
                if (ringtoneAuthorLayout != null) {
                    ((dd0.i0) ((ed0.p0) i95.n0.c(ed0.p0.class))).wi(ringtoneAuthorLayout, iVar);
                }
                int b17 = i65.a.b(context, iVar.j() ? 202 : 80);
                int b18 = i65.a.b(context, iVar.j() ? 266 : 80);
                android.widget.ImageView imageView = dVar.f224762d;
                if (imageView != null && (layoutParams2 = imageView.getLayoutParams()) != null) {
                    layoutParams2.width = b17;
                    layoutParams2.height = b18;
                    imageView.setLayoutParams(layoutParams2);
                }
                int i17 = iVar.j() ? com.tencent.mm.R.dimen.f479723df : com.tencent.mm.R.dimen.f479714d7;
                if (mMAnimateView != null && (layoutParams = mMAnimateView.getLayoutParams()) != null) {
                    layoutParams.width = i65.a.h(context, i17);
                    layoutParams.height = i65.a.h(context, i17);
                    mMAnimateView.setLayoutParams(layoutParams);
                }
                if (mMAnimateView != null) {
                    kotlin.jvm.internal.o.g(context, "context");
                    int d18 = i65.a.d(context, com.tencent.mm.R.color.aaw);
                    android.graphics.drawable.Drawable mutate2 = i65.a.i(context, com.tencent.mm.R.raw.icons_outlined_play2).mutate();
                    kotlin.jvm.internal.o.f(mutate2, "mutate(...)");
                    mutate2.setColorFilter(new android.graphics.PorterDuffColorFilter(android.graphics.Color.argb(android.graphics.Color.alpha(d18), android.graphics.Color.red(d18), android.graphics.Color.green(d18), android.graphics.Color.blue(d18)), android.graphics.PorterDuff.Mode.SRC_ATOP));
                    mutate2.setAlpha(android.graphics.Color.alpha(d18));
                    mMAnimateView.setImageDrawable(mutate2);
                }
                if (iVar.f441294k.length() > 0) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    ya2.l.f460502a.k(iVar.f441294k, imageView, iVar.e());
                } else if (imageView != null) {
                    imageView.setImageResource(com.tencent.mm.R.drawable.axm);
                }
                dVar.f224759a.setOnClickListener(new cy3.c(dVar, iVar));
            }
            boolean b19 = kotlin.jvm.internal.o.b(iVar.g(), "voip_default_sound");
            android.view.View view = dVar.f224769k;
            if (b19) {
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout", "refreshCommonRingBackInfo", "(Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout", "refreshCommonRingBackInfo", "(Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (view != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout", "refreshCommonRingBackInfo", "(Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout", "refreshCommonRingBackInfo", "(Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            dVar.f224766h = iVar;
        }
    }
}
