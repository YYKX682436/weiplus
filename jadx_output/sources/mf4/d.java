package mf4;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final mf4.d f326160a = new mf4.d();

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.autogen.mmdata.rpt.StoryPageExposeStruct f326161b = new com.tencent.mm.autogen.mmdata.rpt.StoryPageExposeStruct();

    /* renamed from: c, reason: collision with root package name */
    public static int f326162c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct f326163d = new com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct();

    /* renamed from: e, reason: collision with root package name */
    public static mf4.a f326164e = new mf4.a();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f326165f = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Set f326166g = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* renamed from: h, reason: collision with root package name */
    public static boolean f326167h = true;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f326168i = true;

    /* renamed from: j, reason: collision with root package name */
    public static final com.tencent.mm.autogen.mmdata.rpt.StoryChatTopBarEntranceExposeStruct f326169j = new com.tencent.mm.autogen.mmdata.rpt.StoryChatTopBarEntranceExposeStruct();

    /* renamed from: k, reason: collision with root package name */
    public static final com.tencent.mm.autogen.mmdata.rpt.StoryDoubleTapHeadViewStruct f326170k = new com.tencent.mm.autogen.mmdata.rpt.StoryDoubleTapHeadViewStruct();

    /* renamed from: l, reason: collision with root package name */
    public static com.tencent.mm.autogen.mmdata.rpt.StoryDownloadReportStruct f326171l;

    /* renamed from: m, reason: collision with root package name */
    public static com.tencent.mm.autogen.mmdata.rpt.StorySinglePreviewReportStruct f326172m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.mm.autogen.mmdata.rpt.StoryProfileTabExposeStruct f326173n;

    /* renamed from: o, reason: collision with root package name */
    public static long f326174o;

    /* renamed from: p, reason: collision with root package name */
    public static long f326175p;

    /* renamed from: q, reason: collision with root package name */
    public static com.tencent.mm.autogen.mmdata.rpt.StoryStatusChangeStruct f326176q;

    static {
        new com.tencent.mm.autogen.mmdata.rpt.StoryComposeReportStruct();
        new com.tencent.mm.autogen.mmdata.rpt.StoryImageVideoRemuxStruct();
        new com.tencent.mm.autogen.mmdata.rpt.StoryImageVideoZipStruct();
        f326171l = new com.tencent.mm.autogen.mmdata.rpt.StoryDownloadReportStruct();
        new java.util.HashMap();
        f326172m = new com.tencent.mm.autogen.mmdata.rpt.StorySinglePreviewReportStruct();
        f326173n = new com.tencent.mm.autogen.mmdata.rpt.StoryProfileTabExposeStruct();
        new com.tencent.mm.autogen.mmdata.rpt.StoryEntranceExposeReportStruct();
        f326176q = new com.tencent.mm.autogen.mmdata.rpt.StoryStatusChangeStruct();
    }

    public static void f(mf4.d dVar, long j17, java.lang.String storyId, long j18, long j19, long j27, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            j18 = f326163d.f60919e;
        }
        if ((i17 & 8) != 0) {
            j19 = f326163d.f60920f;
        }
        if ((i17 & 16) != 0) {
            j27 = 0;
        }
        dVar.getClass();
        kotlin.jvm.internal.o.g(storyId, "storyId");
        com.tencent.mm.autogen.mmdata.rpt.StoryStatusChangeStruct storyStatusChangeStruct = f326176q;
        storyStatusChangeStruct.f60980d = storyStatusChangeStruct.b("StoryId", storyId, true);
        com.tencent.mm.autogen.mmdata.rpt.StoryStatusChangeStruct storyStatusChangeStruct2 = f326176q;
        storyStatusChangeStruct2.f60981e = j17;
        storyStatusChangeStruct2.f60984h = j27;
        storyStatusChangeStruct2.f60982f = j18;
        storyStatusChangeStruct2.f60983g = j19;
        storyStatusChangeStruct2.k();
        f326176q = new com.tencent.mm.autogen.mmdata.rpt.StoryStatusChangeStruct();
    }

    public final void a(int i17) {
        int i18 = f326162c;
        if (i18 == -1 && i17 == 4) {
            f326162c = i17;
            return;
        }
        if (i18 == 10 && i17 == 11) {
            f326162c = i17;
            return;
        }
        f326162c = i17;
        mf4.a aVar = f326164e;
        aVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("aid", i17);
        jSONObject.put("td", aVar.f326140a.length() + 1);
        if (aVar.f326140a.toString().length() + jSONObject.toString().length() <= 1000) {
            synchronized (aVar.f326141b) {
                aVar.f326140a.put(jSONObject);
            }
        }
    }

    public final void b() {
        f326161b.k();
        f326161b = new com.tencent.mm.autogen.mmdata.rpt.StoryPageExposeStruct();
    }

    public final void c() {
        java.lang.String t17;
        com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct storyPreviewReportStruct = f326163d;
        if (0 == storyPreviewReportStruct.f60928n) {
            g();
            return;
        }
        mf4.a aVar = f326164e;
        synchronized (aVar.f326141b) {
            java.lang.String jSONArray = aVar.f326140a.toString();
            kotlin.jvm.internal.o.f(jSONArray, "toString(...)");
            t17 = r26.i0.t(jSONArray, ",", ";", false);
            aVar.f326140a = new org.json.JSONArray();
        }
        storyPreviewReportStruct.f60932r = storyPreviewReportStruct.b("ActionTrace", t17, true);
        com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct storyPreviewReportStruct2 = f326163d;
        storyPreviewReportStruct2.f60933s += storyPreviewReportStruct2.f60930p;
        storyPreviewReportStruct2.k();
        com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct storyPreviewReportStruct3 = f326163d;
        storyPreviewReportStruct3.f60926l = 0L;
        storyPreviewReportStruct3.f60930p = 0L;
        storyPreviewReportStruct3.f60929o = 0L;
        storyPreviewReportStruct3.f60927m = 0L;
        storyPreviewReportStruct3.f60931q = 0L;
        storyPreviewReportStruct3.f60923i = 0L;
        storyPreviewReportStruct3.f60933s = 0L;
        storyPreviewReportStruct3.f60936v = 0L;
        storyPreviewReportStruct3.f60934t = storyPreviewReportStruct3.b("SessionId", "", true);
        g();
    }

    public final void d() {
        com.tencent.mm.autogen.mmdata.rpt.StoryProfileTabExposeStruct storyProfileTabExposeStruct = f326173n;
        if (storyProfileTabExposeStruct.f60942i != 0) {
            storyProfileTabExposeStruct.k();
            storyProfileTabExposeStruct.f60942i = 0L;
            storyProfileTabExposeStruct.f60938e = 0L;
            storyProfileTabExposeStruct.f60937d = 0L;
            storyProfileTabExposeStruct.f60939f = 0L;
            storyProfileTabExposeStruct.f60940g = f326174o;
            storyProfileTabExposeStruct.f60941h = 0L;
            storyProfileTabExposeStruct.f60943j = f326175p;
        }
    }

    public final void e() {
        com.tencent.mm.autogen.mmdata.rpt.StorySinglePreviewReportStruct storySinglePreviewReportStruct = f326172m;
        if (storySinglePreviewReportStruct.f60964f == 0) {
            f326172m = new com.tencent.mm.autogen.mmdata.rpt.StorySinglePreviewReportStruct();
        } else {
            storySinglePreviewReportStruct.k();
            f326172m = new com.tencent.mm.autogen.mmdata.rpt.StorySinglePreviewReportStruct();
        }
    }

    public final void g() {
        f326164e = new mf4.a();
        f326162c = -1;
        f326165f.clear();
        f326166g.clear();
    }
}
