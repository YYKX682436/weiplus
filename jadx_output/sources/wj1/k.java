package wj1;

/* loaded from: classes14.dex */
public class k implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f446601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wj1.c0 f446603f;

    public k(wj1.c0 c0Var, int i17, java.lang.String str) {
        this.f446603f = c0Var;
        this.f446601d = i17;
        this.f446602e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("intent_err_code", com.tencent.mm.sdk.platformtools.t8.o1(java.lang.Integer.valueOf(this.f446601d), 0));
        java.lang.String str = this.f446602e;
        if (str == null) {
            str = "";
        }
        intent.putExtra("intent_err_msg", str);
        wj1.c0 c0Var = this.f446603f;
        c0Var.f446576a.setResult(1, intent);
        c0Var.f446576a.finish();
    }
}
