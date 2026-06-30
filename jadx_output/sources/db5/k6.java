package db5;

/* loaded from: classes11.dex */
public class k6 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMTagPanel f228421d;

    public k6(com.tencent.mm.ui.base.MMTagPanel mMTagPanel) {
        this.f228421d = mMTagPanel;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        db5.t6 t6Var;
        if (!z17 || (t6Var = this.f228421d.C) == null) {
            return;
        }
        t6Var.c();
    }
}
