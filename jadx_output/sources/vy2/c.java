package vy2;

/* loaded from: classes2.dex */
public final class c extends zx2.d {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment, com.tencent.mm.plugin.finder.wxmessage.FinderWxNotifyTabUIC$FinderWxMessageFragment] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment, com.tencent.mm.plugin.finder.wxmessage.FinderWxNotifyTabUIC$FinderWxMessageFragment] */
    public c(vy2.e eVar) {
        ?? r07 = new com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment() { // from class: com.tencent.mm.plugin.finder.wxmessage.FinderWxNotifyTabUIC$FinderWxMessageFragment
            @Override // com.tencent.mm.ui.component.UIComponentFragment
            /* renamed from: l0 */
            public java.util.Set getF123295n() {
                return kz5.o1.c(vy2.a.class);
            }

            @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
            public void onCreate(android.os.Bundle bundle) {
                super.onCreate(bundle);
                com.tencent.mars.xlog.Log.i("FinderWxMessageFragment", "index:" + this.f129265p);
                ((vy2.a) pf5.z.f353948a.b(this).a(vy2.a.class)).f441455d = this.f129265p;
            }
        };
        r07.f129265p = 0;
        ?? r27 = new com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment() { // from class: com.tencent.mm.plugin.finder.wxmessage.FinderWxNotifyTabUIC$FinderWxMessageFragment
            @Override // com.tencent.mm.ui.component.UIComponentFragment
            /* renamed from: l0 */
            public java.util.Set getF123295n() {
                return kz5.o1.c(vy2.a.class);
            }

            @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
            public void onCreate(android.os.Bundle bundle) {
                super.onCreate(bundle);
                com.tencent.mars.xlog.Log.i("FinderWxMessageFragment", "index:" + this.f129265p);
                ((vy2.a) pf5.z.f353948a.b(this).a(vy2.a.class)).f441455d = this.f129265p;
            }
        };
        r27.f129265p = 1;
        setFragments(kz5.c0.d(r07, r27));
        setTabContainer(new gy2.c());
        vy2.b bVar = new vy2.b(com.tencent.mm.R.string.ery);
        java.lang.String string = eVar.getString(com.tencent.mm.R.string.erx);
        kotlin.jvm.internal.o.g(string, "<set-?>");
        bVar.f477050h = string;
        setTabs(kz5.c0.d(bVar, new vy2.b(com.tencent.mm.R.string.erv)));
        setTabViewAction(eVar.f441462x);
        this.f477034a = new zx2.a(false, 0, 3, null);
    }
}
