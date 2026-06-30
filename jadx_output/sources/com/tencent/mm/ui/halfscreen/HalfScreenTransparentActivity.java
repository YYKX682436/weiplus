package com.tencent.mm.ui.halfscreen;

@db5.a(4131)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/halfscreen/HalfScreenTransparentActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes8.dex */
public class HalfScreenTransparentActivity extends com.tencent.mm.ui.MMActivity {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f208799g;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment f208800d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f208801e = jz5.h.b(new bh5.h(this));

    /* renamed from: f, reason: collision with root package name */
    public boolean f208802f;

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mars.xlog.Log.i("MMHalfScreen.TransparentActivity", "finish() called hasCalledFinished:" + this.f208802f);
        com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment mMHalfScreenDialogFragment = this.f208800d;
        if (mMHalfScreenDialogFragment != null) {
            android.app.Dialog dialog = mMHalfScreenDialogFragment.getDialog();
            com.tencent.mars.xlog.Log.i("MMHalfScreen.TransparentActivity", "finish() called isDialogShowing:%s", java.lang.Boolean.valueOf(dialog != null ? dialog.isShowing() : false));
            android.app.Dialog dialog2 = mMHalfScreenDialogFragment.getDialog();
            if (dialog2 != null ? dialog2.isShowing() : false) {
                mMHalfScreenDialogFragment.dismiss();
                return;
            }
        }
        if (this.f208800d == null || this.f208802f) {
            return;
        }
        this.f208802f = true;
        f208799g = false;
        jz5.o oVar = null;
        if (vk5.a.f437774d) {
            jz5.o oVar2 = new jz5.o(java.lang.Integer.valueOf(vk5.a.f437771a), vk5.a.f437772b, java.lang.Integer.valueOf(vk5.a.f437773c));
            vk5.a.f437771a = 0;
            vk5.a.f437772b = null;
            vk5.a.f437773c = -1;
            vk5.a.f437774d = false;
            oVar = oVar2;
        }
        if (oVar != null) {
            setResult(((java.lang.Number) oVar.f302841d).intValue(), (android.content.Intent) oVar.f302842e);
        }
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        try {
            return ((dh5.a) ((jz5.n) this.f208801e).getValue()).l();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MMHalfScreen.TransparentActivity", th6, "getForceOrientation err", new java.lang.Object[0]);
            return -1;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        setActionbarColor(0);
        setMMTitle("");
        hideActionbarLine();
        hideActionBarOperationArea();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        jz5.g gVar = this.f208801e;
        if (((dh5.a) ((jz5.n) gVar).getValue()).o()) {
            android.view.View decorView = getWindow().getDecorView();
            kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
            decorView.setSystemUiVisibility(1792);
            getWindow().setNavigationBarColor(0);
        }
        if (((dh5.a) ((jz5.n) gVar).getValue()).n()) {
            android.view.View decorView2 = getWindow().getDecorView();
            kotlin.jvm.internal.o.f(decorView2, "getDecorView(...)");
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 2 | 4);
        }
        getContentView().post(new bh5.i(this));
        f208799g = true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        f208799g = false;
        super.onDestroy();
    }
}
