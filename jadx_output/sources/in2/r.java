package in2;

/* loaded from: classes10.dex */
public final class r implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.s f292883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.yg f292884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f292885f;

    public r(in2.s sVar, dk2.yg ygVar, int i17) {
        this.f292883d = sVar;
        this.f292884e = ygVar;
        this.f292885f = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        in2.s sVar = this.f292883d;
        if (itemId == sVar.K) {
            sVar.B1.a();
            sf2.x xVar = sVar.I;
            int i18 = this.f292885f;
            xVar.getClass();
            dk2.yg musicItem = this.f292884e;
            kotlin.jvm.internal.o.g(musicItem, "musicItem");
            dk2.yg c17 = ((mm2.m6) xVar.business(mm2.m6.class)).f329241f.c();
            java.lang.String str = c17 != null ? c17.f234393a : null;
            java.lang.Integer num = (java.lang.Integer) ((mm2.m6) xVar.business(mm2.m6.class)).f329241f.f234052a.getValue();
            java.lang.String str2 = musicItem.f234393a;
            gn2.a aVar = xVar.f407347p;
            if (aVar != null) {
                java.lang.Object O6 = xVar.O6();
                java.util.ArrayList songName = aVar.p(musicItem.f234393a);
                long j17 = ((mm2.e1) xVar.business(mm2.e1.class)).f328983m;
                long j18 = ((mm2.e1) xVar.business(mm2.e1.class)).f328988r.getLong(0);
                java.lang.String userName = ((mm2.c1) xVar.business(mm2.c1.class)).f328852o;
                sf2.c cVar = new sf2.c(aVar, i18, str, str2, num, xVar, musicItem);
                kotlin.jvm.internal.o.g(songName, "songName");
                kotlin.jvm.internal.o.g(userName, "userName");
                pq5.g l17 = new ek2.b3(songName, java.lang.System.currentTimeMillis(), j17, j18, userName, null, 32, null).l();
                l17.K(new xl2.b(cVar));
                if (O6 instanceof com.tencent.mm.ui.MMActivity) {
                    l17.f((im5.b) O6);
                }
            }
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicSingSongController", "deleteMusic bgMusicId:" + str + ", songPlayId:" + str2);
        }
    }
}
