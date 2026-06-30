package com.tencent.mm.ui.brandservice;

/* loaded from: classes4.dex */
public final class r extends y9.i {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f198063o = 0;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f198064n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011a, code lost:
    
        if (r4 == null) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.brandservice.r.<init>(android.content.Context):void");
    }

    @Override // android.app.Dialog
    public void show() {
        com.tencent.mars.xlog.Log.i("BrsTimelineAutoNotifyEducation", "show() called");
        super.show();
        com.tencent.mm.sdk.platformtools.o4.L().putBoolean("brs_timeline_auto_notify_education_has_shown", true);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            ((cy1.a) rVar).Bj("brs_timeline_auto_notify_education_view", "view_exp", kz5.b1.e(new jz5.l("view_name", "brs_timeline_auto_notify_education")), 12, false);
        }
        android.view.View view = this.f198064n;
        if (view == null || android.os.Build.VERSION.SDK_INT >= 30 || !com.tencent.mm.ui.bl.f(getContext())) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom() + com.tencent.mm.ui.bl.c(getContext()));
    }
}
