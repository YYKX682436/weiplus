package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ys extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.pt f136612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f136613e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys(com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(2);
        this.f136612d = ptVar;
        this.f136613e = appCompatActivity;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int ordinal;
        qd2.h0 lastOrientation = (qd2.h0) obj;
        qd2.h0 newOrientation = (qd2.h0) obj2;
        kotlin.jvm.internal.o.g(lastOrientation, "lastOrientation");
        kotlin.jvm.internal.o.g(newOrientation, "newOrientation");
        com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = this.f136612d;
        if (ptVar.getIsUserVisibleFocused()) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f136613e;
            if (!hc2.f0.j(appCompatActivity) && !hc2.f0.l(appCompatActivity)) {
                com.tencent.mars.xlog.Log.w("FinderVideoOrientationUIC", "onFourOrientationsChange return for isSupportAutoRotateActivity.");
            } else if (ptVar.f135621v && lastOrientation != newOrientation) {
                com.tencent.mm.plugin.finder.viewmodel.component.ps O6 = com.tencent.mm.plugin.finder.viewmodel.component.pt.O6(ptVar, ptVar.f135615p);
                int i17 = 0;
                boolean z17 = newOrientation == qd2.h0.f361770f || newOrientation == qd2.h0.f361772h || newOrientation == qd2.h0.f361769e;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFourOrientationsChange activity=");
                sb6.append(appCompatActivity.getClass().getSimpleName());
                sb6.append(", isLandscapeByClick=");
                sb6.append(ptVar.A);
                sb6.append(", isDrawerOpen=");
                sb6.append(O6.f135595a);
                sb6.append(" isLikeDrawerOpen=");
                sb6.append(O6.f135596b);
                sb6.append(" isAllLikeDrawerOpen=");
                sb6.append(O6.f135597c);
                sb6.append(" isProfileDrawerOpen=");
                sb6.append(O6.f135598d);
                sb6.append(" isBizProfileDrawerOpen=");
                sb6.append(O6.f135599e);
                sb6.append(" isShowBulletInputUI=");
                sb6.append(O6.f135600f);
                sb6.append(" newOrientation=");
                sb6.append(newOrientation);
                sb6.append(", isLongVideoEndLayoutShown=");
                sb6.append(O6.f135601g);
                sb6.append(", isRecommendDrawerShown=");
                sb6.append(O6.f135602h);
                sb6.append(", isProjectionPanelShown=");
                sb6.append(O6.f135603i);
                sb6.append(", isLandscapeVideo=");
                sb6.append(ptVar.f135615p != null);
                sb6.append(" isInScaleMode:");
                sb6.append(O6.f135604j);
                com.tencent.mars.xlog.Log.i("FinderVideoOrientationUIC", sb6.toString());
                if (O6.a(ptVar.A, ptVar.f135625z) && z17) {
                    if (ptVar.f135615p == null && ptVar.f135622w) {
                        ptVar.R6("OrientationEvent");
                    }
                    if (ptVar.f135615p == null || !ptVar.Y6() || (ordinal = newOrientation.ordinal()) == 1) {
                        i17 = 1;
                    } else if (ordinal != 2) {
                        i17 = ordinal != 4 ? 2 : 8;
                    }
                    if (i17 != ptVar.getContext().getRequestedOrientation()) {
                        ptVar.getContext().setRequestedOrientation(i17);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
