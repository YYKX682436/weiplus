package os3;

/* loaded from: classes11.dex */
public class h1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f348093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348095f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348096g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ os3.j1 f348097h;

    public h1(os3.j1 j1Var, android.widget.EditText editText, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f348097h = j1Var;
        this.f348093d = editText;
        this.f348094e = str;
        this.f348095f = str2;
        this.f348096g = str3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.widget.EditText editText = this.f348093d;
        if (editText.getText() == null || com.tencent.mm.sdk.platformtools.t8.J0(editText.getText())) {
            return;
        }
        os3.j1.a(this.f348097h, this.f348094e, this.f348095f, this.f348096g, editText.getText().toString());
    }
}
