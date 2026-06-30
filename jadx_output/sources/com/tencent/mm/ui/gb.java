package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class gb implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f208686d;

    public gb(android.app.Activity activity) {
        this.f208686d = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mm.ui.vb.d(this.f208686d, true, 3);
    }
}
