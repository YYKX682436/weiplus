package f93;

/* loaded from: classes10.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f260486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f93.w1 f260487e;

    public v1(f93.w1 w1Var, java.util.Set set) {
        this.f260487e = w1Var;
        this.f260486d = set;
    }

    @Override // java.lang.Runnable
    public void run() {
        f93.w1 w1Var = this.f260487e;
        java.lang.String string = w1Var.f260493d.getResources().getString(com.tencent.mm.R.string.g9b);
        android.content.Intent intent = new android.content.Intent(w1Var.f260493d, (java.lang.Class<?>) com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI.class);
        intent.putExtra("list_type", 1);
        intent.putExtra("filter_type", "@all.contact.android");
        intent.putExtra("only_show_contact", true);
        java.util.Set set = this.f260486d;
        if (set.size() > 0) {
            intent.putExtra("titile", string + "(" + set.size() + ")");
        } else {
            intent.putExtra("titile", string);
        }
        intent.putExtra("last_page_source_type", 1);
        intent.putExtra("key_label_click_source", w1Var.f260493d.getIntent().getIntExtra("key_label_click_source", 0));
        intent.putExtra("can_go_to_profile", true);
        intent.putExtra("list_type", 1);
        intent.putExtra("already_select_contact", (java.lang.String[]) set.toArray(new java.lang.String[0]));
        w1Var.f260493d.startActivityForResult(intent, com.tencent.liteav.TXLiteAVCode.WARNING_AUDIO_RECORDING_WRITE_FAIL);
    }
}
