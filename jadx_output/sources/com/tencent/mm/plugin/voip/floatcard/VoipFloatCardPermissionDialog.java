package com.tencent.mm.plugin.voip.floatcard;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/voip/floatcard/VoipFloatCardPermissionDialog;", "Lcom/tencent/mm/ui/MMBaseActivity;", "<init>", "()V", "jq4/d1", "plugin-voip_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class VoipFloatCardPermissionDialog extends com.tencent.mm.ui.MMBaseActivity {

    /* renamed from: e, reason: collision with root package name */
    public static final jq4.d1 f176287e = new jq4.d1(null);

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("VoipFloatCardPermission", "showDialog: ");
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(this)) {
            finish();
            com.tencent.mars.xlog.Log.i("VoipFloatCardPermission", "showDialog: has permission");
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("voip_float_card_config");
        if (M != null && M.getBoolean("has_showed_dialog", false)) {
            com.tencent.mars.xlog.Log.i("VoipFloatCardPermission", "showDialog: finish");
            finish();
            return;
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(this, 2, 1);
        z2Var.x(0);
        z2Var.y(fp.h.c(23) ? getText(com.tencent.mm.R.string.kbq) : getText(com.tencent.mm.R.string.kbr));
        z2Var.i(com.tencent.mm.R.layout.d4r);
        z2Var.l(new jq4.e1(this));
        z2Var.F = new jq4.f1(this, z2Var);
        z2Var.C();
        com.tencent.mars.xlog.Log.i("VoipFloatCardPermission", "showDialog: show");
        M.putBoolean("has_showed_dialog", true);
    }
}
