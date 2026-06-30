package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class sb implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f209780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f209781e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f209782f;

    public sb(android.content.SharedPreferences sharedPreferences, android.app.Activity activity, android.content.DialogInterface.OnClickListener onClickListener) {
        this.f209780d = sharedPreferences;
        this.f209781e = activity;
        this.f209782f = onClickListener;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.SharedPreferences.Editor edit = this.f209780d.edit();
        edit.putBoolean("gprs_alert", false);
        edit.commit();
        com.tencent.mm.sdk.platformtools.a0.f192446i = false;
        dialogInterface.dismiss();
        com.tencent.mm.ui.vb.b(this.f209781e);
        android.content.DialogInterface.OnClickListener onClickListener = this.f209782f;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i17);
        }
    }
}
