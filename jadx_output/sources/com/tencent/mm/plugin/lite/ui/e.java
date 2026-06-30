package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes5.dex */
public class e extends androidx.appcompat.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.ui.d f144395f;

    public e(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494143fd);
        C(1);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        com.tencent.mm.plugin.lite.ui.d dVar = this.f144395f;
        if (dVar != null) {
            ((ra3.g) dVar).f393499a[0].dismiss();
        }
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setGravity(80);
        android.view.Display defaultDisplay = getWindow().getWindowManager().getDefaultDisplay();
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = defaultDisplay.getWidth();
        getWindow().setAttributes(attributes);
    }
}
