package kf3;

/* loaded from: classes5.dex */
public class k implements com.tencent.mm.modelbase.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kf3.u f307375a;

    public k(kf3.u uVar) {
        this.f307375a = uVar;
    }

    @Override // com.tencent.mm.modelbase.e1
    public void a() {
        kf3.u uVar = this.f307375a;
        uVar.f307438c.reset();
        uVar.f307445j.d();
        uVar.f307449n.d();
        com.tencent.mm.sdk.platformtools.c3.b("keep_app_silent");
        uVar.f307437b.d1(com.tencent.mm.pluginsdk.ui.chat.f5.Error);
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI = uVar.f307436a;
        dp.a.makeText(massSendMsgUI, massSendMsgUI.getString(com.tencent.mm.R.string.b5c), 0).show();
    }
}
