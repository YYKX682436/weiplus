package com.tencent.mm.plugin.forcenotify.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/forcenotify/ui/ForceNotifyAcceptUI;", "Lcom/tencent/mm/ui/MMBaseActivity;", "<init>", "()V", "k13/h", "plugin-force-notify_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ForceNotifyAcceptUI extends com.tencent.mm.ui.MMBaseActivity {

    /* renamed from: f, reason: collision with root package name */
    public static k13.h f137329f;

    /* renamed from: g, reason: collision with root package name */
    public static com.tencent.mm.ui.widget.dialog.z2 f137330g;

    /* renamed from: e, reason: collision with root package name */
    public final int f137331e = 1234;

    public final void O6() {
        android.os.Bundle extras;
        if (getIntent() == null || (extras = getIntent().getExtras()) == null) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(this, 1, 2, false);
        z2Var.q(extras.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, getString(com.tencent.mm.R.string.f492155ff4)));
        android.view.View inflate = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.bbh, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gcm);
        if (textView != null) {
            textView.setText(extras.getString("warning_content"));
        }
        z2Var.j(inflate);
        java.lang.String string = getString(fp.h.c(23) ? com.tencent.mm.R.string.feo : com.tencent.mm.R.string.fez);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        z2Var.m(getString(com.tencent.mm.R.string.fem), string);
        z2Var.o(0);
        k13.i iVar = new k13.i(this);
        k13.j jVar = new k13.j(this);
        z2Var.D = iVar;
        z2Var.E = jVar;
        f137330g = z2Var;
        z2Var.C();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        k13.h hVar = f137329f;
        if (hVar == null) {
            finish();
            return;
        }
        if (i17 == this.f137331e) {
            if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                k13.h hVar2 = f137329f;
                if (hVar2 != null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ForceNotifyPermissionUtil", "checkPermission permission granted");
                    finish();
                    ((m13.a) hVar2).f322860a.a(true);
                }
            } else {
                k13.h hVar3 = f137329f;
                if (hVar3 != null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ForceNotifyPermissionUtil", "checkPermission permission refused");
                    finish();
                    ((m13.a) hVar3).f322860a.a(false);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ForceNotifyPermissionUtil", "checkPermission permission refused");
            finish();
            ((m13.a) hVar).f322860a.a(false);
        }
        f137329f = null;
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setTheme(com.tencent.mm.R.style.f494400m2);
        O6();
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = f137330g;
        if (z2Var != null) {
            if (z2Var != null) {
                z2Var.B();
            }
            f137330g = null;
        }
        O6();
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
