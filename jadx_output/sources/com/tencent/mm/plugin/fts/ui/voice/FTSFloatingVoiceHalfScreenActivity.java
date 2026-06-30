package com.tencent.mm.plugin.fts.ui.voice;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/fts/ui/voice/FTSFloatingVoiceHalfScreenActivity;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "k23/z", "ui-fts_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class FTSFloatingVoiceHalfScreenActivity extends com.tencent.mm.ui.vas.VASActivity {

    /* renamed from: g, reason: collision with root package name */
    public static k23.v2 f138205g = null;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.ref.WeakReference f138206h = null;

    /* renamed from: i, reason: collision with root package name */
    public static int f138207i = 3;

    /* renamed from: m, reason: collision with root package name */
    public static int f138208m = 6;

    /* renamed from: d, reason: collision with root package name */
    public final k23.v0 f138212d = new k23.v0(this);

    /* renamed from: e, reason: collision with root package name */
    public android.widget.RelativeLayout f138213e;

    /* renamed from: f, reason: collision with root package name */
    public static final k23.z f138204f = new k23.z(null);

    /* renamed from: n, reason: collision with root package name */
    public static k23.w0 f138209n = k23.w0.f303739i;

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.String f138210o = "";

    /* renamed from: p, reason: collision with root package name */
    public static k23.u2 f138211p = k23.u2.f303701d;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ef8;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean noActionBar() {
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getController().G.o();
        setBounceEnabled(false);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.cg7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f138213e = (android.widget.RelativeLayout) findViewById;
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.u2n)).setHint((java.lang.String) ((jz5.n) new k23.c(this).f303535c).getValue());
        android.widget.RelativeLayout relativeLayout = this.f138213e;
        if (relativeLayout == null) {
            kotlin.jvm.internal.o.o("container");
            throw null;
        }
        k23.d0 d0Var = new k23.d0(relativeLayout, new android.view.ViewGroup.LayoutParams(-1, -1), f138205g, null, f138209n, f138208m, f138207i, f138210o, f138211p, null, null, com.tencent.mm.plugin.appbrand.jsapi.mc.CTRL_INDEX, null);
        k23.v0 v0Var = this.f138212d;
        v0Var.t(d0Var);
        k23.i1 q17 = v0Var.q();
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        android.widget.RelativeLayout relativeLayout2 = this.f138213e;
        if (relativeLayout2 == null) {
            kotlin.jvm.internal.o.o("container");
            throw null;
        }
        relativeLayout2.addView(q17, layoutParams);
        f138206h = new java.lang.ref.WeakReference(this);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        f138205g = null;
        java.lang.ref.WeakReference weakReference = f138206h;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f138212d.v();
    }
}
