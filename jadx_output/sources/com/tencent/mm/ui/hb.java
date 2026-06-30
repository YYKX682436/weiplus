package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class hb implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f208861d;

    public hb(android.app.Activity activity) {
        this.f208861d = activity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f208861d.onKeyDown(4, new android.view.KeyEvent(0, 4));
    }
}
