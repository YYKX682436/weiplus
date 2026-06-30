package eb2;

/* loaded from: classes2.dex */
public final class z implements db2.u3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eb2.b0 f250869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eb2.a0 f250870e;

    public z(eb2.b0 b0Var, eb2.a0 a0Var) {
        this.f250869d = b0Var;
        this.f250870e = a0Var;
    }

    @Override // db2.u3
    public void a(com.tencent.mm.plugin.finder.feed.model.d info, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f250869d.f250719n = info.f107769g > 0;
        this.f250869d.f250721p = info.f107769g == 1;
        boolean z17 = info.f107772j;
        boolean z18 = info.f107771i;
        com.tencent.mars.xlog.Log.i("Finder.FinderLbsFeedFetcher", "[getStream] tabType=" + this.f250869d.f250715g + " isGetHistory=" + this.f250869d.f250719n + " isShowHistoryTip=" + this.f250869d.f250721p + " ret_flag=" + info.f107769g + " pullType=" + i17 + " isNeedClear=" + z18 + " isFetchHistoryNow=" + info.f107772j + " size=" + info.f107767e.size() + " errorType=" + info.f107763a + " errorCode=" + info.f107764b);
        eb2.b0 b0Var = this.f250869d;
        boolean z19 = info.f107771i;
        int size = info.f107767e.size();
        int i18 = info.f107769g;
        b0Var.getClass();
        if (z19 && size <= 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLbsFeedFetcher", "isNeedClear && incrementSize <= 0 && retFlag == 0");
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        } else if (!z19 && size > 0 && i17 != 2) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLbsFeedFetcher", "!isNeedClear && incrementSize > 0 pullType=" + i17);
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        if (info.f107763a == 0 && info.f107764b == 0 && this.f250869d.f250719n && z17) {
            eb2.b0 b0Var2 = this.f250869d;
            b0Var2.f250720o = true;
            b0Var2.f250717i.f250857a = 3;
            eb2.b0.E0(b0Var2, this.f250870e, true, i17, info.f107768f, z18, b0Var2.f250721p, null, 64, null);
            com.tencent.mars.xlog.Log.i("Finder.FinderLbsFeedFetcher", "get history to fill... tabType=" + this.f250869d.f250715g + " pullType=" + i17 + " isHistoryFirstPage=" + this.f250869d.f250720o);
            this.f250869d.f250720o = false;
            return;
        }
        if (info.f107763a == 0 && info.f107764b == 0) {
            jx3.f.INSTANCE.idkeyStat(1279L, 1L, 1L, false);
            if (info.f107767e.isEmpty() && !this.f250869d.f250719n) {
                info.f107770h = 1;
                eb2.b0 b0Var3 = this.f250869d;
                java.lang.String str3 = "[finderstream]tabType=" + this.f250869d.f250715g + " server error[list=0:ret_flag=0]";
                b0Var3.getClass();
                com.tencent.mars.xlog.Log.e("Finder.FinderLbsFeedFetcher", str3);
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            } else if (!info.f107767e.isEmpty()) {
                info.f107770h = 1;
            } else {
                info.f107770h = 1;
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLbsFeedFetcher", "tabType=" + this.f250869d.f250715g + " this time get finderstream return list=" + info.f107767e.size() + " continue_flag=" + info.f107770h + " pullType=" + i17);
        } else {
            jx3.f.INSTANCE.idkeyStat(1279L, 2L, 1L, false);
            info.f107770h = 1;
        }
        this.f250870e.a(info, i17);
    }
}
