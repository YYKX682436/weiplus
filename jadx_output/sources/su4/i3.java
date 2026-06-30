package su4;

/* loaded from: classes8.dex */
public class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f412935d;

    public i3(int i17) {
        this.f412935d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        final int[] iArr = {1, 0, 5, 6, 3, 9};
        int i17 = this.f412935d;
        if (i17 == -1) {
            ((i04.i) ((j04.e) i95.n0.c(j04.e.class))).Ri("reportWebSearchTemplate", 24, new j04.f() { // from class: su4.i3$$a
                @Override // j04.f
                public final void a(java.lang.String str, long j17, long j18) {
                    int i18 = 0;
                    while (true) {
                        if (i18 >= iArr.length) {
                            return;
                        }
                        com.tencent.mm.autogen.mmdata.rpt.WebSearchTemplateStruct webSearchTemplateStruct = new com.tencent.mm.autogen.mmdata.rpt.WebSearchTemplateStruct();
                        int i19 = i18 + 1;
                        webSearchTemplateStruct.f62940d = i19;
                        webSearchTemplateStruct.f62941e = com.tencent.mm.plugin.websearch.l2.a(r4[i18]);
                        webSearchTemplateStruct.k();
                        su4.k3.m(webSearchTemplateStruct);
                        i18 = i19;
                    }
                }
            }, true, false);
            return;
        }
        for (int i18 = 0; i18 < 6; i18++) {
            if (iArr[i18] == i17) {
                com.tencent.mm.autogen.mmdata.rpt.WebSearchTemplateStruct webSearchTemplateStruct = new com.tencent.mm.autogen.mmdata.rpt.WebSearchTemplateStruct();
                webSearchTemplateStruct.f62940d = i18 + 1;
                webSearchTemplateStruct.f62941e = com.tencent.mm.plugin.websearch.l2.a(iArr[i18]);
                webSearchTemplateStruct.k();
                su4.k3.m(webSearchTemplateStruct);
                return;
            }
        }
    }
}
