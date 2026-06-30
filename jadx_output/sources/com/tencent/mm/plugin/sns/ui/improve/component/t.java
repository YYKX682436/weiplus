package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class t extends com.tencent.mm.ui.component.UIComponent implements bd4.v0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.improve.component.k f168991d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f168992e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f168993f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f168994g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f168995h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f168996i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f168992e = jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.o(activity, this));
        this.f168993f = jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.n(this));
        this.f168994g = jz5.h.b(com.tencent.mm.plugin.sns.ui.improve.component.s.f168987d);
        this.f168995h = new java.util.LinkedList();
        this.f168996i = "";
    }

    public static final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentFooter O6(com.tencent.mm.plugin.sns.ui.improve.component.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCommentFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter P6 = tVar.P6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCommentFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        return P6;
    }

    @Override // bd4.v0
    public boolean K1(android.view.MotionEvent ev6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleDownEvent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        kotlin.jvm.internal.o.g(ev6, "ev");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commentFooterIsVisible", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        boolean z17 = P6().getVisibility() == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commentFooterIsVisible", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter P6 = P6();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTouchPointInView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
            int rawX = (int) ev6.getRawX();
            int rawY = (int) ev6.getRawY();
            int[] iArr = new int[2];
            P6.getLocationOnScreen(iArr);
            int i17 = iArr[0];
            int i18 = iArr[1];
            boolean z18 = (i18 <= rawY && rawY <= P6.getMeasuredHeight() + i18) && rawX >= i17 && rawX <= P6.getMeasuredWidth() + i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTouchPointInView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
            if (!z18) {
                R6();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleDownEvent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleDownEvent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        return false;
    }

    public final com.tencent.mm.plugin.sns.ui.SnsCommentFooter P6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        java.lang.Object value = ((jz5.n) this.f168993f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = (com.tencent.mm.plugin.sns.ui.SnsCommentFooter) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        return snsCommentFooter;
    }

    public final gc4.b Q6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentKeyBoardStateDelegate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        gc4.b bVar = (gc4.b) ((jz5.n) this.f168992e).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentKeyBoardStateDelegate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        return bVar;
    }

    public final void R6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        pm0.v.X(new com.tencent.mm.plugin.sns.ui.improve.component.p(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        super.onActivityResult(i17, i18, intent);
        if (i17 != 26) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        } else {
            P6().K(i18, intent);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        R6();
        boolean onBackPressed = super.onBackPressed();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        return onBackPressed;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        super.onPause();
        Q6().a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        Q6().c();
        P6().B();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onWindowFocusChanged(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        super.onWindowFocusChanged(z17);
        if (z17) {
            Q6().c();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
    }
}
