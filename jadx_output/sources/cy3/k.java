package cy3;

/* loaded from: classes10.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gif.MMAnimateView f224785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.y1 f224786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f224787f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f224788g;

    public k(com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView, com.tencent.mm.plugin.ringtone.uic.y1 y1Var, kotlin.jvm.internal.h0 h0Var, yz5.p pVar) {
        this.f224785d = mMAnimateView;
        this.f224786e = y1Var;
        this.f224787f = h0Var;
        this.f224788g = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = this.f224785d;
        mMAnimateView.y();
        mMAnimateView.t();
        com.tencent.mm.plugin.ringtone.uic.y1 y1Var = this.f224786e;
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
        ((com.tencent.mm.ui.widget.dialog.z2) this.f224787f.f310123d).B();
        yz5.p pVar = this.f224788g;
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.FALSE, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
