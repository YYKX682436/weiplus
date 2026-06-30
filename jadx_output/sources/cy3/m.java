package cy3;

/* loaded from: classes10.dex */
public final class m implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f224806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gif.MMAnimateView f224807b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.y1 f224808c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f224809d;

    public m(android.view.View view, com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView, com.tencent.mm.plugin.ringtone.uic.y1 y1Var, yz5.p pVar) {
        this.f224806a = view;
        this.f224807b = mMAnimateView;
        this.f224808c = y1Var;
        this.f224809d = pVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        android.view.View view = this.f224806a;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$8", "dismiss", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$8", "dismiss", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = this.f224807b;
        mMAnimateView.y();
        mMAnimateView.t();
        com.tencent.mm.plugin.ringtone.uic.y1 y1Var = this.f224808c;
        if (y1Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RingtonePlayUIC", "release");
            qx3.o oVar = y1Var.f158549b;
            oVar.Q6();
            ((kotlinx.coroutines.flow.h3) oVar.f367377g).k(new qx3.f(0L, null, 3));
            oVar.N6();
            kotlinx.coroutines.r2 r2Var = oVar.f367383p;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            kotlinx.coroutines.z0.e(y1Var.f158548a, null, 1, null);
        }
        yz5.p pVar = this.f224809d;
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.FALSE, 0);
        }
    }
}
