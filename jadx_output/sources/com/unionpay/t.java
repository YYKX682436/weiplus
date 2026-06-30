package com.unionpay;

/* loaded from: classes13.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.unionpay.UPPayWapActivity f220726d;

    public t(com.unionpay.UPPayWapActivity uPPayWapActivity) {
        this.f220726d = uPPayWapActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17 = com.unionpay.UPPayWapActivity.f220665o;
        com.unionpay.UPPayWapActivity uPPayWapActivity = this.f220726d;
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(uPPayWapActivity);
        uPPayWapActivity.f220668f = builder.create();
        builder.setMessage(qy5.h.a().f367794a);
        builder.setTitle(qy5.h.a().f367797d);
        builder.setPositiveButton(qy5.h.a().f367795b, new com.unionpay.u(uPPayWapActivity));
        builder.setNegativeButton(qy5.h.a().f367796c, new com.unionpay.v(uPPayWapActivity));
        builder.create().show();
    }
}
