package uf5;

/* loaded from: classes10.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf5.n1 f427273d;

    public m1(uf5.n1 n1Var) {
        this.f427273d = n1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        uf5.n1 n1Var = this.f427273d;
        com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI.w7(n1Var.f427276d);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Contact", com.tencent.mm.sdk.platformtools.t8.c1(n1Var.f427276d.C.f427289r, ","));
        n1Var.f427276d.setResult(-1, intent);
        n1Var.f427276d.finish();
    }
}
