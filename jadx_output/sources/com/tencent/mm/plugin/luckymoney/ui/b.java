package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class b extends androidx.appcompat.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.a f146732f;

    public b(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494143fd);
        C(1);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        com.tencent.mm.plugin.luckymoney.ui.a aVar = this.f146732f;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setGravity(80);
        getWindow().setSoftInputMode(48);
        android.view.Display defaultDisplay = getWindow().getWindowManager().getDefaultDisplay();
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = defaultDisplay.getWidth();
        attributes.height = defaultDisplay.getHeight();
        getWindow().setAttributes(attributes);
    }
}
