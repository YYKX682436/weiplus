package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class zh implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f212634d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f212635e;

    public zh(android.app.Activity activity, java.lang.String str) {
        this.f212634d = new java.lang.ref.WeakReference(activity);
        this.f212635e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity;
        com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult = (com.tencent.mm.msgsubscription.SubscribeMsgRequestResult) obj;
        if (subscribeMsgRequestResult != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.yh(this, subscribeMsgRequestResult));
            return null;
        }
        java.lang.ref.WeakReference weakReference = this.f212634d;
        if (weakReference.get() == null || (activity = (android.app.Activity) weakReference.get()) == null || activity.isFinishing() || activity.isDestroyed()) {
            return null;
        }
        db5.t7.makeText(activity, activity.getString(com.tencent.mm.R.string.f490500wu), 1).show();
        return null;
    }
}
