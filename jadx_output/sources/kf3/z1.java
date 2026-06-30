package kf3;

/* loaded from: classes5.dex */
public class z1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf3.a2 f307469e;

    public z1(kf3.a2 a2Var, java.lang.String str) {
        this.f307469e = a2Var;
        this.f307468d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("CropImage_OutputPath", this.f307468d);
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI = this.f307469e.f307318d;
        int i18 = com.tencent.mm.plugin.masssend.ui.MassSendMsgUI.f148539v;
        massSendMsgUI.V6(intent);
    }
}
