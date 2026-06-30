package db5;

/* loaded from: classes11.dex */
public class s6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMTagPanel f228506d;

    public s6(com.tencent.mm.ui.base.MMTagPanel mMTagPanel) {
        this.f228506d = mMTagPanel;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMTagPanel$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.tencent.mm.ui.base.MMTagPanel mMTagPanel = this.f228506d;
        if (intValue == 0) {
            mMTagPanel.u((android.widget.TextView) view, true, false);
            if (mMTagPanel.C != null) {
                view.post(new db5.p6(this, view));
            }
        } else if (!mMTagPanel.f197582n || mMTagPanel.f197584p) {
            mMTagPanel.u((android.widget.TextView) view, false, false);
            if (mMTagPanel.C != null) {
                view.post(new db5.q6(this, view));
            }
        } else {
            db5.b7 b7Var = mMTagPanel.f197594z;
            if (b7Var == null) {
                mMTagPanel.f197594z = com.tencent.mm.ui.base.MMTagPanel.b(mMTagPanel, ((android.widget.TextView) view).getText().toString());
                db5.b7 b7Var2 = mMTagPanel.f197594z;
                if (b7Var2 != null) {
                    mMTagPanel.u(b7Var2.f228296b, false, true);
                }
            } else if (b7Var.f228296b == view) {
                mMTagPanel.f197594z = null;
                mMTagPanel.u((android.widget.TextView) view, false, false);
                if (mMTagPanel.C != null) {
                    view.post(new db5.r6(this, view));
                }
            } else {
                mMTagPanel.h();
                mMTagPanel.f197594z = com.tencent.mm.ui.base.MMTagPanel.b(mMTagPanel, ((android.widget.TextView) view).getText().toString());
                db5.b7 b7Var3 = mMTagPanel.f197594z;
                if (b7Var3 != null) {
                    mMTagPanel.u(b7Var3.f228296b, false, true);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/MMTagPanel$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
