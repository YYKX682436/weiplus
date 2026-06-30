package db5;

/* loaded from: classes11.dex */
public class o6 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.z6 f228457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMTagPanel f228458e;

    public o6(com.tencent.mm.ui.base.MMTagPanel mMTagPanel, db5.z6 z6Var) {
        this.f228458e = mMTagPanel;
        this.f228457d = z6Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMTagPanel$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.ui.base.MMTagPanel mMTagPanel = this.f228458e;
        if (mMTagPanel.f197585q) {
            java.lang.String editText = mMTagPanel.getEditText();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(editText)) {
                db5.z6 z6Var = this.f228457d;
                if (z6Var != null) {
                    int f17 = com.tencent.mm.ui.tools.v4.f(editText);
                    z6Var.getClass();
                    if (f17 > 36) {
                        z6Var.getClass();
                        int a17 = 36 - com.tencent.mm.ui.tools.v4.a(editText);
                        if (a17 < editText.length()) {
                            editText = editText.substring(0, a17);
                        }
                    }
                }
                mMTagPanel.d(editText, true);
                db5.t6 t6Var = mMTagPanel.C;
                if (t6Var != null) {
                    t6Var.d(editText);
                }
                mMTagPanel.g();
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/base/MMTagPanel$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
