package k13;

/* loaded from: classes5.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld f303252e;

    public n(java.lang.String str, com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld forceNotifyAcceptUIOld) {
        this.f303251d = str;
        this.f303252e = forceNotifyAcceptUIOld;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new i13.e(this.f303251d).l().h(new k13.m(this.f303252e));
    }
}
