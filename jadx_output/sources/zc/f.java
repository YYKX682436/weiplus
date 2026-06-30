package zc;

/* loaded from: classes11.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f471344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.WxaLiteAppWidgetAdapter f471345e;

    public f(android.content.Intent intent, com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter) {
        this.f471344d = intent;
        this.f471345e = wxaLiteAppWidgetAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Intent intent = this.f471344d;
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("animated", true) : true;
        com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter = this.f471345e;
        wxaLiteAppWidgetAdapter.f45974p.closeWindow(new com.tencent.pigeon.liteapp.WxaLiteAppWidgetCloseWindowMessage(wxaLiteAppWidgetAdapter.f45965d, booleanExtra), new zc.e(wxaLiteAppWidgetAdapter, intent));
    }
}
