package qp5;

/* loaded from: classes9.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f365843d;

    public k(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f365843d = mMActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.MMActivity mMActivity = this.f365843d;
        java.lang.String string = mMActivity.getString(com.tencent.mm.R.string.kir);
        com.tencent.mm.ui.MMActivity mMActivity2 = this.f365843d;
        db5.e1.A(mMActivity, string, mMActivity2.getString(com.tencent.mm.R.string.kio), mMActivity2.getString(com.tencent.mm.R.string.kiq), mMActivity2.getString(com.tencent.mm.R.string.kis), new qp5.i(this), new qp5.j(this));
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
