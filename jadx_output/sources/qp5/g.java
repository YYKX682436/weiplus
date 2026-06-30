package qp5;

/* loaded from: classes9.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f365841d;

    public g(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f365841d = mMActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qp5.y.b(this.f365841d, com.tencent.mm.R.layout.d7w, com.tencent.mm.R.string.kix);
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
