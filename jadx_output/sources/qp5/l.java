package qp5;

/* loaded from: classes9.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f365844d;

    public l(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f365844d = mMActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qp5.y.b(this.f365844d, com.tencent.mm.R.layout.d77, com.tencent.mm.R.string.kio);
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
