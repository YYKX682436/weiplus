package u20;

/* loaded from: classes9.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f423870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f423871e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u20.h f423872f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f423873g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f423874h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f423875i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelscan.ScanCodeInfo f423876m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f423877n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u20.i f423878o;

    public g(android.app.Activity activity, int i17, u20.h hVar, java.lang.String str, int i18, boolean z17, com.tencent.mm.modelscan.ScanCodeInfo scanCodeInfo, java.lang.String str2, u20.i iVar) {
        this.f423870d = activity;
        this.f423871e = i17;
        this.f423872f = hVar;
        this.f423873g = str;
        this.f423874h = i18;
        this.f423875i = z17;
        this.f423876m = scanCodeInfo;
        this.f423877n = str2;
        this.f423878o = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.modelscan.ScanCodeInfo scanCodeInfo;
        kd0.s2 s2Var;
        nf.g a17;
        android.app.Activity activity = this.f423870d;
        boolean z17 = activity instanceof nf.m;
        int i17 = this.f423871e;
        if (z17 && (a17 = nf.g.a(activity)) != null) {
            a17.f(new u20.f(this.f423872f, i17));
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str3 = this.f423873g;
        intent.putExtra("Retr_File_Name", str3);
        intent.putExtra("scene_from", 19);
        intent.putExtra("Retr_Compress_Type", this.f423874h);
        intent.putExtra("Retr_Msg_Type", 0);
        intent.putExtra("Retr_show_success_tips", false);
        if (this.f423875i && (scanCodeInfo = this.f423876m) != null && (s2Var = (kd0.s2) i95.n0.c(kd0.s2.class)) != null) {
            ((jd0.d2) s2Var).Bi(intent, scanCodeInfo);
        }
        java.lang.String str4 = "";
        java.lang.String str5 = this.f423877n;
        if (str5 == null) {
            str5 = "";
        }
        intent.putExtra("shareImageSrc", str5);
        u20.i iVar = this.f423878o;
        u20.d dVar = iVar.f423881d;
        if (dVar == null || (str = dVar.f423864e) == null) {
            str = "";
        }
        intent.putExtra("shareImageCurrentAppId", str);
        u20.d dVar2 = iVar.f423881d;
        if (dVar2 != null && (str2 = dVar2.f423863d) != null) {
            str4 = str2;
        }
        intent.putExtra("shareImageCurrentPath", str4);
        intent.putExtra("from_scene_forward_to_wework", 6);
        intent.putExtra("content_type_forward_to_wework", 2);
        intent.putExtra("Select_Data_Send_To_WeWork", new com.tencent.mm.sendtowework.ImgData(str3));
        j45.l.v(activity, ".ui.transmit.MsgRetransmitUI", intent, i17);
    }
}
