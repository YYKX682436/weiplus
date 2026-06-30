package q52;

/* loaded from: classes15.dex */
public final class a implements gy1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.mmdata.rpt.FinderUITimeStruct f360161a;

    public a(java.lang.String str, com.tencent.mm.autogen.mmdata.rpt.FinderUITimeStruct finderUITimeStruct) {
        this.f360161a = finderUITimeStruct;
    }

    @Override // gy1.d
    public final void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellFinderReport", "FinderHomeAffinityUI, EnterMethod : " + obj);
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderUITimeStruct finderUITimeStruct = this.f360161a;
        finderUITimeStruct.f57951r = finderUITimeStruct.b("sdkEnterMethod", str, true);
        q52.c.a(q52.d.f360163a, finderUITimeStruct);
    }
}
