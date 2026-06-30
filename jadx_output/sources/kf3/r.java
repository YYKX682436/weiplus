package kf3;

/* loaded from: classes5.dex */
public class r implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f307420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kf3.u f307421b;

    public r(kf3.u uVar, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        this.f307421b = uVar;
        this.f307420a = iEmojiInfo;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f307420a;
        kf3.u uVar = this.f307421b;
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI = uVar.f307436a;
        try {
            r45.cj0 cj0Var = new r45.cj0();
            cj0Var.f371580d = iEmojiInfo.getMd5();
            cj0Var.f371582f = iEmojiInfo.getSize();
            cj0Var.f371584h = iEmojiInfo.getType();
            cj0Var.f371586m = iEmojiInfo.j();
            cj0Var.f371581e = 0;
            cj0Var.f371590q = 0;
            cj0Var.f371583g = new r45.cu5();
            if3.y yVar = new if3.y();
            yVar.f291215h = iEmojiInfo.getMd5();
            yVar.f291217m = uVar.f307442g;
            yVar.f291218n = uVar.f307443h.size();
            byte[] byteArray = cj0Var.toByteArray();
            yVar.f291229y = byteArray;
            if (byteArray == null) {
                byteArray = new byte[0];
            }
            yVar.f291222r = byteArray.length;
            yVar.f291219o = 47;
            if3.g0 g0Var = new if3.g0(yVar, uVar.f307444i, 0);
            c01.d9.e().g(g0Var);
            com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI2 = uVar.f307436a;
            uVar.f307441f = db5.e1.Q(massSendMsgUI2, massSendMsgUI2.getString(com.tencent.mm.R.string.f490573yv), massSendMsgUI.getString(com.tencent.mm.R.string.iin), true, true, new kf3.s(uVar, g0Var));
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MassSendFooterEventImpl", e17, "", new java.lang.Object[0]);
            dp.a.makeText(massSendMsgUI, massSendMsgUI.getString(com.tencent.mm.R.string.dbd), 0).show();
        }
    }
}
