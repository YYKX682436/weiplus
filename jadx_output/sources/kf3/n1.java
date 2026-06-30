package kf3;

/* loaded from: classes5.dex */
public class n1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f307403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendMsgUI f307404e;

    public n1(com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI, android.content.Intent intent) {
        this.f307404e = massSendMsgUI;
        this.f307403d = intent;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.plugin.masssend.ui.MassSendMsgUI.f148539v;
        this.f307404e.Z6(this.f307403d);
    }
}
