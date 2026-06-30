package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes.dex */
public class r5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f142997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI f142998e;

    public r5(com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI iPCallUserProfileUI, android.widget.TextView textView) {
        this.f142998e = iPCallUserProfileUI;
        this.f142997d = textView;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (i17 == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12766, 4);
            com.tencent.mm.sdk.platformtools.b0.d(com.tencent.mm.sdk.platformtools.x2.f193071a, null, this.f142997d.getText().toString(), null);
            android.widget.Toast.makeText(this.f142998e, com.tencent.mm.R.string.f492340g43, 0).show();
        }
    }
}
