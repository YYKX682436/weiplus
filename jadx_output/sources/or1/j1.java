package or1;

/* loaded from: classes9.dex */
public class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f347510a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f347511b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.tools.w6 f347512c;

    public j1(android.app.Activity activity, java.lang.String str) {
        this.f347510a = activity;
        this.f347511b = str;
    }

    public boolean a(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            return false;
        }
        if (i18 == -1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("be_send_card_name");
            java.lang.String stringExtra2 = intent.getStringExtra("received_card_name");
            boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
            java.lang.String stringExtra3 = intent.getStringExtra("custom_send_text");
            ((dk5.s5) tg3.t1.a()).Di(stringExtra, stringExtra2, booleanExtra, null);
            ((dk5.s5) tg3.t1.a()).Ui(stringExtra3, stringExtra2);
            android.app.Activity activity = this.f347510a;
            com.tencent.mm.ui.widget.snackbar.j.c(activity.getString(com.tencent.mm.R.string.fw6), null, activity, null, null);
        }
        return true;
    }
}
