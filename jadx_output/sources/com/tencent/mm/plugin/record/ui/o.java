package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f155458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.FavRecordDetailUI f155459e;

    public o(com.tencent.mm.plugin.record.ui.FavRecordDetailUI favRecordDetailUI, android.app.Dialog dialog) {
        this.f155459e = favRecordDetailUI;
        this.f155458d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f155458d.dismiss();
        com.tencent.mm.plugin.record.ui.FavRecordDetailUI favRecordDetailUI = this.f155459e;
        com.tencent.mm.ui.widget.snackbar.j.c(favRecordDetailUI.getString(com.tencent.mm.R.string.f_p), null, favRecordDetailUI, null, null);
    }
}
