package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ji extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ri f118759d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(com.tencent.mm.plugin.finder.live.widget.ri riVar) {
        super(0);
        this.f118759d = riVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.ji jiVar;
        r45.qo qoVar;
        jz5.f0 f0Var;
        r45.eq1 eq1Var;
        mm2.n2 n2Var = (mm2.n2) dk2.ef.f233372a.i(mm2.n2.class);
        if (n2Var == null || (eq1Var = n2Var.f329279g) == null) {
            jiVar = this;
            qoVar = null;
        } else {
            qoVar = (r45.qo) eq1Var.getCustom(7);
            jiVar = this;
        }
        com.tencent.mm.plugin.finder.live.widget.ri riVar = jiVar.f118759d;
        riVar.getClass();
        android.content.Context context = riVar.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.live.widget.of ofVar = new com.tencent.mm.plugin.finder.live.widget.of(context);
        ofVar.f119301y = new com.tencent.mm.plugin.finder.live.widget.mi(riVar);
        ofVar.f119300x = qoVar;
        ofVar.w();
        android.content.Context context2 = ofVar.f118381d;
        com.tencent.mm.ui.MMActivity mMActivity = context2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context2 : null;
        if (mMActivity != null) {
            com.tencent.mm.plugin.finder.live.viewmodel.g4 g4Var = (com.tencent.mm.plugin.finder.live.viewmodel.g4) pf5.z.f353948a.a(mMActivity).a(com.tencent.mm.plugin.finder.live.viewmodel.g4.class);
            g4Var.getClass();
            java.util.ArrayList arrayList = g4Var.f117111d;
            if (!arrayList.contains(ofVar)) {
                arrayList.add(ofVar);
            }
        }
        r45.qo qoVar2 = ofVar.f119300x;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (qoVar2 != null) {
            com.tencent.mm.ui.widget.MMEditText mMEditText = ofVar.f119287h;
            if (mMEditText == null) {
                kotlin.jvm.internal.o.o("editView");
                throw null;
            }
            boolean z17 = true;
            mMEditText.setText(qoVar2.getString(1));
            ofVar.f119298v = qoVar2.getString(2);
            java.lang.String string = qoVar2.getString(2);
            if (string != null && string.length() != 0) {
                z17 = false;
            }
            if (z17) {
                android.view.View view = ofVar.f119288i;
                if (view == null) {
                    kotlin.jvm.internal.o.o("goSelectPhotoView");
                    throw null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = ofVar.f119289m;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("coverContainer");
                    throw null;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                mn2.g1 g1Var = mn2.g1.f329975a;
                vo0.d e17 = g1Var.e();
                mn2.q3 q3Var = new mn2.q3(qoVar2.getString(2), com.tencent.mm.plugin.finder.storage.y90.f128356f);
                android.widget.ImageView imageView = ofVar.f119290n;
                if (imageView == null) {
                    kotlin.jvm.internal.o.o("currentCoverView");
                    throw null;
                }
                e17.c(q3Var, imageView, g1Var.h(mn2.f1.f329965s));
                android.view.View view3 = ofVar.f119289m;
                if (view3 == null) {
                    kotlin.jvm.internal.o.o("coverContainer");
                    throw null;
                }
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = ofVar.f119288i;
                if (view4 == null) {
                    kotlin.jvm.internal.o.o("goSelectPhotoView");
                    throw null;
                }
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ofVar.f119296t = qoVar2.getInteger(3);
            ofVar.f119297u = qoVar2.getInteger(0);
            android.widget.TextView textView = ofVar.f119295s;
            if (textView == null) {
                kotlin.jvm.internal.o.o("visibilityDescTv");
                throw null;
            }
            textView.setText(ofVar.z(ofVar.f119296t));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mm.ui.widget.MMEditText mMEditText2 = ofVar.f119287h;
            if (mMEditText2 == null) {
                kotlin.jvm.internal.o.o("editView");
                throw null;
            }
            mMEditText2.setText("");
            android.view.View view5 = ofVar.f119289m;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("coverContainer");
                throw null;
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view5, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = ofVar.f119288i;
            if (view6 == null) {
                kotlin.jvm.internal.o.o("goSelectPhotoView");
                throw null;
            }
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view6, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView2 = ofVar.f119295s;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("visibilityDescTv");
                throw null;
            }
            textView2.setText(ofVar.z(ofVar.f119296t));
        }
        ofVar.B();
        return f0Var2;
    }
}
