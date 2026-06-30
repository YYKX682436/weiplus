package com.tencent.mm.pluginsdk.permission;

/* loaded from: classes14.dex */
public class RequestFloatWindowPermissionDialog extends com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog {

    /* renamed from: g, reason: collision with root package name */
    public static j35.f0 f189525g;

    /* renamed from: h, reason: collision with root package name */
    public static qp1.l0 f189526h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f189527i = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f189528e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f189529f = false;

    public static void O6(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        java.util.Iterator it = f189527i.iterator();
        while (it.hasNext()) {
            ((j35.a) it.next()).a(absRequestFloatWindowPermissionDialog);
        }
    }

    public static void Q6(android.content.Context context, int i17, java.lang.String str, j35.a aVar, qp1.l0 l0Var, boolean z17, boolean z18, java.lang.String str2) {
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return;
        }
        f189525g = new j35.f0(aVar);
        f189526h = l0Var;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.class);
        intent.putExtra("warning_content", str);
        if (z17) {
            intent.addFlags(805306368);
        }
        bm5.e.a(context, intent, str, com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.class.getCanonicalName(), z18, str2, false);
    }

    public static void R6(android.content.Context context, int i17, java.lang.String str, j35.a aVar, boolean z17, boolean z18, java.lang.String str2) {
        Q6(context, i17, str, aVar, null, z17, z18, str2);
    }

    public static void S6(android.content.Context context, java.lang.String str, j35.a aVar, boolean z17, java.lang.String str2) {
        R6(context, -1, str, new j35.f0(new j35.f0(aVar)), z17, false, str2);
    }

    public final void P6() {
        if (getIntent() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RequestFloatWindowPermissionDialog", "Intent is null");
            return;
        }
        android.os.Bundle extras = getIntent().getExtras();
        if (extras == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RequestFloatWindowPermissionDialog", "invalid params");
            return;
        }
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(this);
        i0Var.g(com.tencent.mm.R.string.fb9);
        java.lang.String string = extras.getString("warning_content");
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        aVar.f211729s = string;
        i0Var.e(com.tencent.mm.R.string.fb6);
        aVar.F = new j35.c0(this);
        aVar.H = new j35.d0(this);
        i0Var.f(fp.h.c(23) ? com.tencent.mm.R.string.fb8 : com.tencent.mm.R.string.fb7);
        i0Var.f211821b.E = new j35.e0(this);
        com.tencent.mm.ui.widget.dialog.j0 a17 = i0Var.a();
        this.f189528e = a17;
        a17.setCanceledOnTouchOutside(false);
        this.f189528e.show();
        qp1.l0 l0Var = f189526h;
        if (l0Var != null) {
            l0Var.a();
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_PERMISSION_DIALOG_SHOWTIME_LONG_SYNC, java.lang.Long.valueOf(c01.id.c()));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        j35.f0 f0Var = f189525g;
        if (f0Var == null) {
            finish();
            return;
        }
        if (i17 == 1234) {
            if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                f189525g.a(this);
            } else {
                f189525g.c(this);
            }
        } else {
            f0Var.c(this);
        }
        f189525g.d();
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        P6();
        com.tencent.mm.autogen.events.PageActivityEvent pageActivityEvent = new com.tencent.mm.autogen.events.PageActivityEvent();
        pageActivityEvent.f54604g.getClass();
        hashCode();
        pageActivityEvent.e();
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        j35.f0 f0Var = f189525g;
        if (f0Var != null && f0Var.f297506a != null) {
            if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RequestFloatWindowPermissionDialog", "checkCallback allow");
                f189525g.a(this);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.RequestFloatWindowPermissionDialog", "checkCallback cancel");
                f189525g.b(this);
            }
            f189525g.d();
        }
        super.onDestroy();
        com.tencent.mm.autogen.events.PageActivityEvent pageActivityEvent = new com.tencent.mm.autogen.events.PageActivityEvent();
        pageActivityEvent.f54604g.getClass();
        hashCode();
        pageActivityEvent.e();
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f189528e;
        if (j0Var != null) {
            j0Var.dismiss();
            this.f189528e = null;
        }
        P6();
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        db5.m9.a(false, null);
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        db5.m9.a(true, null);
    }
}
