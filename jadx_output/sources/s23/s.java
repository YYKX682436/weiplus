package s23;

/* loaded from: classes4.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s23.x f402329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.d2 f402330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.i2 f402331f;

    public s(s23.x xVar, r45.d2 d2Var, r45.i2 i2Var) {
        this.f402329d = xVar;
        this.f402330e = d2Var;
        this.f402331f = i2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.i2 i2Var;
        s23.x xVar;
        int i17;
        s23.x xVar2 = this.f402329d;
        androidx.appcompat.app.AppCompatActivity activity = xVar2.f402343d.getActivity();
        if (!((activity.isFinishing() || activity.isDestroyed()) ? false : true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateUI", "checkShowActivityTemplateTip: state failed");
            return;
        }
        r45.d2 d2Var = this.f402330e;
        s23.o oVar = xVar2.f402343d;
        androidx.appcompat.app.AppCompatActivity activity2 = oVar.getActivity();
        ((ez0.f) xVar2.a()).getClass();
        r45.e2 e2Var = new r45.e2();
        e2Var.f372920d = com.tencent.mm.R.layout.dm8;
        e2Var.f372921e = android.graphics.Color.parseColor("#C49600");
        e2Var.f372922f = android.graphics.Color.parseColor("#FBF2D1");
        e2Var.f372923g = e2Var.f372921e;
        r23.m mVar = new r23.m(activity2, d2Var, e2Var, 0, new s23.p(xVar2), new s23.q(xVar2), 8, null);
        mVar.f303862g = -i65.a.h(oVar.getActivity(), com.tencent.mm.R.dimen.f479672c9);
        mVar.f303861f = true;
        xVar2.f402357u = mVar;
        r45.i2 i2Var2 = this.f402331f;
        android.widget.LinearLayout linearLayout = xVar2.f402345f;
        if (linearLayout == null) {
            xVar = xVar2;
            i2Var = i2Var2;
        } else {
            mVar.getContentView().measure(0, 0);
            int measuredWidth = mVar.getContentView().getMeasuredWidth();
            int measuredHeight = mVar.getContentView().getMeasuredHeight();
            int[] iArr = new int[2];
            linearLayout.getLocationInWindow(iArr);
            android.graphics.Rect rect = mVar.f303860e;
            linearLayout.getGlobalVisibleRect(rect);
            int width = rect.width();
            int i18 = (iArr[1] - mVar.f303862g) - measuredHeight;
            int i19 = mVar.f303861f ? (iArr[0] + (width / 2)) - (measuredWidth / 2) : iArr[0];
            int h17 = com.tencent.mm.ui.bl.h(com.tencent.mm.sdk.platformtools.x2.f193071a);
            android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
            int c17 = com.tencent.mm.ui.bl.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
            i2Var = i2Var2;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showWithTop: [");
            sb6.append(i19);
            sb6.append(", ");
            sb6.append(i18);
            xVar = xVar2;
            sb6.append("], ");
            sb6.append(mVar.f303861f);
            sb6.append(", bottomMargin=");
            sb6.append(mVar.f303862g);
            sb6.append(", pop size=[");
            sb6.append(measuredWidth);
            sb6.append(", ");
            sb6.append(measuredHeight);
            sb6.append("], anchorWidth=");
            sb6.append(width);
            sb6.append(", loc=[");
            sb6.append(iArr[0]);
            sb6.append(',');
            sb6.append(iArr[1]);
            sb6.append("], rect=");
            sb6.append(rect);
            sb6.append(", screen=[");
            sb6.append(b17.x);
            sb6.append(',');
            sb6.append(b17.y);
            sb6.append("], statusBarHeight=");
            sb6.append(h17);
            sb6.append(", navHeight=");
            sb6.append(c17);
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasAlbumTipPopup", sb6.toString());
            mVar.setAnimationStyle(com.tencent.mm.R.style.f494611y3);
            mVar.f303864i = 200L;
            if (mVar.getBackground() == null) {
                i17 = 0;
                mVar.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
            } else {
                i17 = 0;
            }
            mVar.showAtLocation(linearLayout, i17, i19, i18);
            mVar.b();
        }
        long j17 = mVar.f303864i;
        long j18 = this.f402330e.f372004m;
        s23.x xVar3 = xVar;
        kotlinx.coroutines.y0 y0Var = xVar3.f402354r;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new s23.w(j17, xVar3, i2Var, j18, null), 2, null);
    }
}
