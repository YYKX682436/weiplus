package os3;

/* loaded from: classes11.dex */
public class j3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f348123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348124e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348125f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348126g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI f348127h;

    public j3(com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI prepareBindXMailUI, android.widget.EditText editText, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f348127h = prepareBindXMailUI;
        this.f348123d = editText;
        this.f348124e = str;
        this.f348125f = str2;
        this.f348126g = str3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.widget.EditText editText = this.f348123d;
        if (editText.getText() == null || com.tencent.mm.sdk.platformtools.t8.J0(editText.getText())) {
            return;
        }
        java.lang.String obj = editText.getText().toString();
        int i18 = com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI.f154914p;
        this.f348127h.U6(this.f348124e, this.f348125f, this.f348126g, obj);
    }
}
