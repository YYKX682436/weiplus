package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class wf0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ag0 f114927d;

    public wf0(com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var) {
        this.f114927d = ag0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        boolean z17;
        int i17;
        int i18;
        mm2.j0 j0Var = (mm2.j0) obj;
        java.lang.Object[] objArr = j0Var != null && j0Var.f329152b;
        com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = this.f114927d;
        if (objArr == true) {
            ((mm2.c1) ag0Var.P0(mm2.c1.class)).E3.f329472e = 2;
            java.util.LinkedList list = j0Var.f329151a.getList(0);
            r45.nn1 nn1Var = j0Var.f329151a;
            ag0Var.M1(new mm2.i0(list, nn1Var.getString(1), nn1Var.getBoolean(2) ? 1 : 0));
        } else {
            ((mm2.c1) ag0Var.P0(mm2.c1.class)).E3.f329472e = 0;
            ag0Var.M1(((mm2.l0) ag0Var.P0(mm2.l0.class)).f329215q);
        }
        com.tencent.mm.plugin.finder.live.widget.e30 e30Var = ag0Var.B;
        e30Var.getClass();
        java.lang.String str = e30Var.f118213r;
        com.tencent.mars.xlog.Log.i(str, "showCheerAnimation data: " + j0Var);
        jz5.f0 f0Var = null;
        if (j0Var != null) {
            if (j0Var.f329152b) {
                r45.nn1 nn1Var2 = j0Var.f329151a;
                java.util.LinkedList<java.lang.String> list2 = nn1Var2.getList(5);
                kotlin.jvm.internal.o.f(list2, "getColor(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
                for (java.lang.String str2 : list2) {
                    try {
                        i18 = android.graphics.Color.parseColor(str2);
                    } catch (java.lang.Throwable unused) {
                        com.tencent.mars.xlog.Log.e(str, "changeCheerLikeBg exception: " + str2);
                        i18 = 0;
                    }
                    arrayList.add(java.lang.Integer.valueOf(i18));
                }
                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BR_TL, kz5.n0.R0(arrayList));
                gradientDrawable.setGradientType(0);
                gradientDrawable.setShape(1);
                android.widget.ImageView imageView = e30Var.f118221z;
                imageView.setImageDrawable(gradientDrawable);
                com.tencent.mm.plugin.finder.live.cheer.CheerCountDownView cheerCountDownView = e30Var.f118220y;
                java.lang.Object[] objArr2 = cheerCountDownView.getVisibility() == 8;
                kotlinx.coroutines.r2 r2Var = cheerCountDownView.f111524h;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                cheerCountDownView.f111526m = 360.0f;
                java.util.LinkedList<java.lang.String> list3 = nn1Var2.getList(5);
                kotlin.jvm.internal.o.d(list3);
                java.util.Collections.reverse(list3);
                cheerCountDownView.f111527n = 3.0f;
                cheerCountDownView.a();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list3, 10));
                for (java.lang.String str3 : list3) {
                    try {
                        i17 = android.graphics.Color.parseColor(str3);
                    } catch (java.lang.Throwable unused2) {
                        com.tencent.mars.xlog.Log.e("CheerCountDownView", "setCheerCountDown exception: " + str3);
                        i17 = 0;
                    }
                    arrayList2.add(java.lang.Integer.valueOf(i17));
                }
                cheerCountDownView.f111522f = kz5.n0.R0(arrayList2);
                cheerCountDownView.requestLayout();
                long j17 = nn1Var2.getLong(7) * 1000;
                com.tencent.mm.plugin.finder.live.widget.u20 u20Var = new com.tencent.mm.plugin.finder.live.widget.u20(e30Var);
                com.tencent.mars.xlog.Log.e("CheerCountDownView", "startCountDown duration: " + j17 + " lineWidth: " + cheerCountDownView.f111527n);
                if (j17 > 0) {
                    cheerCountDownView.f111526m = 360.0f;
                    cheerCountDownView.f111524h = kotlinx.coroutines.l.d(cheerCountDownView.f111523g, null, null, new pe2.a(j17, cheerCountDownView, u20Var, null), 3, null);
                }
                if (((mm2.w) e30Var.f118212q.P0(mm2.w.class)).O6()) {
                    imageView.setAlpha(0.0f);
                    cheerCountDownView.setAlpha(0.0f);
                } else if (objArr2 == true) {
                    imageView.setAlpha(0.0f);
                    cheerCountDownView.setAlpha(0.0f);
                    imageView.animate().alpha(1.0f).setDuration(1000L).setListener(null).start();
                    cheerCountDownView.animate().alpha(1.0f).setDuration(1000L).setListener(null).start();
                } else {
                    cheerCountDownView.setAlpha(1.0f);
                    imageView.setAlpha(1.0f);
                }
                cheerCountDownView.setVisibility(0);
                imageView.setVisibility(0);
                z17 = true;
            } else {
                z17 = true;
                e30Var.x1(true);
            }
            f0Var = jz5.f0.f302826a;
        } else {
            z17 = true;
        }
        if (f0Var == null) {
            e30Var.x1(z17);
        }
    }
}
