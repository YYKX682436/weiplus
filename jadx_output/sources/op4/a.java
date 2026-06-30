package op4;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final op4.a f347260a = new op4.a();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f347261b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f347262c = "";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f347263d = "";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f347264e = "";

    public final void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveFinderRecordTemplateReporter", "report >> " + i17 + "  " + f347261b + ' ' + f347262c + " 0 0 " + f347263d + ' ' + f347264e);
        com.tencent.mm.autogen.mmdata.rpt.ImproveTemplateRecordLogStruct improveTemplateRecordLogStruct = new com.tencent.mm.autogen.mmdata.rpt.ImproveTemplateRecordLogStruct();
        improveTemplateRecordLogStruct.f58492e = 0;
        improveTemplateRecordLogStruct.f58494g = improveTemplateRecordLogStruct.b("FollowTemplateId", f347261b, true);
        improveTemplateRecordLogStruct.f58496i = improveTemplateRecordLogStruct.b("FollowMusicId", f347262c, true);
        improveTemplateRecordLogStruct.f58497j = 0;
        improveTemplateRecordLogStruct.f58493f = improveTemplateRecordLogStruct.b("TemplateId", f347263d, true);
        improveTemplateRecordLogStruct.f58495h = improveTemplateRecordLogStruct.b("MusicId", f347264e, true);
        improveTemplateRecordLogStruct.f58491d = i17;
        improveTemplateRecordLogStruct.k();
        if (i17 == 3) {
            f347261b = "";
            f347262c = "";
            f347263d = "";
            f347264e = "";
        }
    }
}
