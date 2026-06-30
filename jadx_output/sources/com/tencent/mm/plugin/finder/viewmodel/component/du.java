package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class du extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f134164d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f134165e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f134166f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f134167g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f134168h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f134169i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134164d = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.zt(this));
        this.f134165e = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.wt(this));
        this.f134166f = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.au(this));
        this.f134167g = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.cu(this));
        this.f134168h = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.vt(this));
        this.f134169i = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.bu(this));
    }

    public static final com.tencent.mm.plugin.finder.feed.ui.FinderPoiRelateListUI O6(com.tencent.mm.plugin.finder.viewmodel.component.du duVar) {
        return (com.tencent.mm.plugin.finder.feed.ui.FinderPoiRelateListUI) ((jz5.n) duVar.f134164d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b5_;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 16666) {
            if (i18 != -1) {
                com.tencent.mars.xlog.Log.i("Finder.FinderPoiRelativeListUIC", "map search result : cancel");
                return;
            }
            android.os.Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("KLocationIntent") : null;
            kotlin.jvm.internal.o.e(parcelableExtra, "null cannot be cast to non-null type com.tencent.mm.pluginsdk.location.LocationIntent");
            com.tencent.mm.pluginsdk.location.LocationIntent locationIntent = (com.tencent.mm.pluginsdk.location.LocationIntent) parcelableExtra;
            com.tencent.mars.xlog.Log.i("Finder.FinderPoiRelativeListUIC", "locationIntent: " + locationIntent.a());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(locationIntent.f188746p);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("extra_poi_list", arrayList);
            if (((java.lang.Boolean) ((jz5.n) this.f134165e).getValue()).booleanValue()) {
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Vk(getContext(), intent2);
            } else {
                getContext().setResult(-1, intent2);
            }
            getContext().finish();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        jz5.g gVar = this.f134167g;
        com.tencent.mm.plugin.finder.feed.co coVar = (com.tencent.mm.plugin.finder.feed.co) ((jz5.n) gVar).getValue();
        jz5.g gVar2 = this.f134166f;
        coVar.T((com.tencent.mm.plugin.finder.feed.tn) ((jz5.n) gVar2).getValue());
        ((com.tencent.mm.plugin.finder.feed.tn) ((jz5.n) gVar2).getValue()).m((com.tencent.mm.plugin.finder.feed.co) ((jz5.n) gVar).getValue());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((com.tencent.mm.plugin.finder.feed.tn) ((jz5.n) this.f134166f).getValue()).onDetach();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        if (grantResults.length == 0) {
            com.tencent.mars.xlog.Log.i("Finder.FinderPoiRelativeListUIC", "onRequestPermissionsResult grantResults length 0");
        } else if (i17 == 64) {
            if (grantResults[0] == 0) {
                ((com.tencent.mm.plugin.finder.feed.co) ((jz5.n) this.f134167g).getValue()).X();
            } else {
                db5.e1.C(getActivity(), getString(com.tencent.mm.R.string.hhm), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.apj), false, new com.tencent.mm.plugin.finder.viewmodel.component.xt(this), com.tencent.mm.plugin.finder.viewmodel.component.yt.f136614d);
            }
        }
    }
}
