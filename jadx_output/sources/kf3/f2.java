package kf3;

/* loaded from: classes5.dex */
public class f2 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f307344a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f307345b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendMsgUI f307346c;

    public f2(com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI, int i17, android.content.Intent intent) {
        this.f307346c = massSendMsgUI;
        this.f307344a = i17;
        this.f307345b = intent;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        int i17 = com.tencent.mm.plugin.masssend.ui.MassSendMsgUI.f148539v;
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI = this.f307346c;
        massSendMsgUI.getClass();
        int i18 = this.f307344a;
        android.content.Intent intent = this.f307345b;
        switch (i18) {
            case 1:
                if (intent == null) {
                    return;
                }
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_select_video_list");
                if (stringArrayListExtra != null && stringArrayListExtra.size() == 1) {
                    java.lang.String str = stringArrayListExtra.get(0);
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.setData(android.net.Uri.parse("file://" + str));
                    massSendMsgUI.b7(intent2);
                    return;
                }
                java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("CropImage_OutputPath_List");
                if (stringArrayListExtra2 == null || stringArrayListExtra2.size() < 1) {
                    return;
                }
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("CropImage_OutputPath", stringArrayListExtra2.get(0));
                intent3.putExtra("CropImage_Compress_Img", intent.getBooleanExtra("CropImage_Compress_Img", true));
                massSendMsgUI.V6(intent3);
                return;
            case 2:
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                android.content.Context applicationContext = massSendMsgUI.getApplicationContext();
                java.lang.String a17 = if3.f0.a();
                ((ub0.r) oVar).getClass();
                java.lang.String b17 = com.tencent.mm.pluginsdk.ui.tools.l7.b(applicationContext, intent, a17);
                massSendMsgUI.f148545i = b17;
                if (b17 == null) {
                    return;
                }
                android.content.Intent intent4 = new android.content.Intent();
                intent4.putExtra("CropImageMode", 4);
                intent4.putExtra("CropImage_Filter", true);
                intent4.putExtra("CropImage_ImgPath", massSendMsgUI.f148545i);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.p(massSendMsgUI.getContext(), intent4, 4);
                return;
            case 3:
            default:
                com.tencent.mars.xlog.Log.e("MicroMsg.MassSendMsgUI", "onActivityResult: not found this requestCode");
                return;
            case 4:
                massSendMsgUI.V6(intent);
                return;
            case 5:
                massSendMsgUI.W6(intent);
                return;
            case 6:
                massSendMsgUI.b7(intent);
                return;
            case 7:
                if (intent != null) {
                    if (intent.getBooleanExtra("from_record", false)) {
                        massSendMsgUI.W6(intent);
                        return;
                    } else {
                        massSendMsgUI.b7(intent);
                        return;
                    }
                }
                return;
            case 8:
                com.tencent.mm.plugin.mmsight.SightCaptureResult sightCaptureResult = (com.tencent.mm.plugin.mmsight.SightCaptureResult) intent.getParcelableExtra("key_req_result");
                if (sightCaptureResult == null) {
                    return;
                }
                if (!sightCaptureResult.f148807e) {
                    java.lang.String str2 = sightCaptureResult.f148810h;
                    java.lang.String str3 = sightCaptureResult.f148809g;
                    com.tencent.mars.xlog.Log.i("MicroMsg.MassSendMsgUI", "video path %s thumb path ", str3, str2);
                    java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22571s, sightCaptureResult.f148811i, true);
                    if (!str3.equals(rj6)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MassSendMsgUI", "filepath not videopath and move it %s %s", str3, rj6);
                        com.tencent.mm.vfs.w6.w(str3, rj6);
                    }
                    massSendMsgUI.a7(sightCaptureResult.f148811i, sightCaptureResult.f148813n);
                    return;
                }
                java.lang.String str4 = sightCaptureResult.f148815p;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                    return;
                }
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MassSendMsgUI", "doSendChattingImage, path: %s", str4);
                    if3.y m07 = if3.k0.Ai().m0(str4, massSendMsgUI.f148541e, ((java.util.ArrayList) massSendMsgUI.f148540d).size(), 0);
                    if (m07 == null) {
                        return;
                    }
                    if3.g0 g0Var = new if3.g0(m07, massSendMsgUI.f148551r, 0);
                    c01.d9.e().g(g0Var);
                    massSendMsgUI.f148549p = db5.e1.Q(massSendMsgUI.getContext(), massSendMsgUI.getString(com.tencent.mm.R.string.f490573yv), massSendMsgUI.getString(com.tencent.mm.R.string.iin), true, true, new kf3.h1(massSendMsgUI, g0Var));
                    return;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MassSendMsgUI", "doSendChattingImage error: %s", e17.getMessage());
                    return;
                }
            case 9:
                com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = (com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel) intent.getParcelableExtra("KSEGMENTMEDIAINFO");
                intent.putExtra("K_SEGMENTVIDEOPATH", captureDataManager$CaptureVideoNormalModel.f155661e);
                intent.putExtra("KSEGMENTVIDEOTHUMBPATH", captureDataManager$CaptureVideoNormalModel.f155662f);
                if (!captureDataManager$CaptureVideoNormalModel.f155664h.booleanValue()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MassSendMsgUI", "video path %s thumb path ", captureDataManager$CaptureVideoNormalModel.f155661e, captureDataManager$CaptureVideoNormalModel.f155662f);
                    java.lang.String q17 = com.tencent.mm.vfs.w6.q(captureDataManager$CaptureVideoNormalModel.f155661e);
                    java.lang.String rj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22571s, q17, true);
                    if (!captureDataManager$CaptureVideoNormalModel.f155661e.equals(rj7)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MassSendMsgUI", "filepath not videopath and move it %s %s", captureDataManager$CaptureVideoNormalModel.f155661e, rj7);
                        com.tencent.mm.vfs.w6.w(captureDataManager$CaptureVideoNormalModel.f155661e, rj7);
                    }
                    massSendMsgUI.a7(q17, (int) (captureDataManager$CaptureVideoNormalModel.f155663g.longValue() / 1000));
                    return;
                }
                java.lang.String str5 = captureDataManager$CaptureVideoNormalModel.f155662f;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                    return;
                }
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MassSendMsgUI", "doSendChattingImage, path: %s", str5);
                    if3.y m08 = if3.k0.Ai().m0(str5, massSendMsgUI.f148541e, ((java.util.ArrayList) massSendMsgUI.f148540d).size(), 0);
                    if (m08 == null) {
                        return;
                    }
                    if3.g0 g0Var2 = new if3.g0(m08, massSendMsgUI.f148551r, 0);
                    c01.d9.e().g(g0Var2);
                    massSendMsgUI.f148549p = db5.e1.Q(massSendMsgUI.getContext(), massSendMsgUI.getString(com.tencent.mm.R.string.f490573yv), massSendMsgUI.getString(com.tencent.mm.R.string.iin), true, true, new kf3.g1(massSendMsgUI, g0Var2));
                    return;
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MassSendMsgUI", "doSendChattingImage error: %s", e18.getMessage());
                    return;
                }
            case 10:
                byte[] byteArrayExtra = intent.getByteArrayExtra("SELECT_OBJECT");
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
                try {
                    finderObject.parseFrom(byteArrayExtra);
                    kf3.u uVar = massSendMsgUI.f148553t;
                    uVar.getClass();
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    java.lang.String u17 = ot0.q.u(((b92.s2) ((zy2.db) i95.n0.c(zy2.db.class))).wi(com.tencent.mm.plugin.finder.assist.n7.j(com.tencent.mm.plugin.finder.assist.n7.f102406a, com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, finderObject.getObjectType()), false, null, 4, null)), null, null);
                    if3.y yVar = new if3.y();
                    yVar.f291217m = uVar.f307442g;
                    yVar.f291218n = uVar.f307443h.size();
                    yVar.f291215h = u17;
                    yVar.f291219o = 49;
                    yVar.f291222r = u17.getBytes().length;
                    if3.g0 g0Var3 = new if3.g0(yVar, uVar.f307444i, 0);
                    c01.d9.e().g(g0Var3);
                    com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI2 = uVar.f307436a;
                    uVar.f307441f = db5.e1.Q(massSendMsgUI2, massSendMsgUI2.getString(com.tencent.mm.R.string.f490573yv), massSendMsgUI2.getString(com.tencent.mm.R.string.iin), true, true, new kf3.i(uVar, g0Var3));
                    return;
                } catch (java.io.IOException e19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MassSendMsgUI", e19, "", new java.lang.Object[0]);
                    return;
                }
        }
    }
}
