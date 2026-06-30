package yt3;

/* loaded from: classes4.dex */
public final class j implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f465499d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f465500e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.RelativeLayout f465501f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f465502g;

    /* renamed from: h, reason: collision with root package name */
    public r45.tl5 f465503h;

    public j(android.view.ViewGroup parent, ju3.d0 status) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f465499d = parent;
        this.f465500e = status;
        android.view.View findViewById = parent.findViewById(com.tencent.mm.R.id.d7l);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
        this.f465501f = relativeLayout;
        android.view.View findViewById2 = parent.findViewById(com.tencent.mm.R.id.d7j);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = parent.findViewById(com.tencent.mm.R.id.d7k);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById3;
        this.f465502g = imageView;
        this.f465503h = new r45.tl5();
        ((android.widget.ImageView) findViewById2).setImageDrawable(com.tencent.mm.ui.uk.e(parent.getContext(), com.tencent.mm.R.raw.icons_filled_location, -1));
        imageView.setImageDrawable(parent.getContext().getResources().getDrawable(com.tencent.mm.R.raw.popvideo_post_selected));
        relativeLayout.setOnClickListener(this);
        com.tencent.mm.ui.bl.b(parent.getContext());
    }

    public final void a() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("get_poi_classify_id", this.f465503h.f386557i);
        intent.putExtra("get_poi_from_scene", "story");
        intent.putExtra("get_city", this.f465503h.f386554f);
        intent.putExtra("poi_show_none", true);
        intent.putExtra("select_radio_icon_color", "#0E9CE6");
        j45.l.n(this.f465499d.getContext(), "nearlife", "com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI", intent, 2);
        com.tencent.mm.plugin.report.service.b1.f(22, 10);
    }

    @Override // yt3.r2
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (2 == i17 && i18 == -1 && intent != null) {
            r45.tl5 tl5Var = this.f465503h;
            java.lang.String stringExtra = intent.getStringExtra("get_poi_name");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (stringExtra == null) {
                stringExtra = "";
            }
            tl5Var.f386555g = stringExtra;
            r45.tl5 tl5Var2 = this.f465503h;
            java.lang.String stringExtra2 = intent.getStringExtra("get_city");
            tl5Var2.f386554f = stringExtra2 != null ? stringExtra2 : "";
            this.f465503h.f386553e = intent.getFloatExtra("get_lat", -1000.0f);
            this.f465503h.f386552d = intent.getFloatExtra("get_lng", -1000.0f);
            this.f465503h.f386557i = intent.getStringExtra("get_poi_classify_id");
            boolean z18 = (com.tencent.mm.sdk.platformtools.t8.K0(this.f465503h.f386555g) && com.tencent.mm.sdk.platformtools.t8.K0(this.f465503h.f386554f)) ? false : true;
            android.widget.ImageView imageView = this.f465502g;
            if (z18) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByteArray("PARAM_EDIT_POI_INFO", this.f465503h.toByteArray());
            this.f465500e.w(ju3.c0.N, bundle);
        }
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditAddPoiPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!com.tencent.mm.sdk.platformtools.f9.SessionLocation.k(view != null ? view.getContext() : null, null)) {
            yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditAddPoiPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        a();
        nu3.i.f340218a.d(10);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditAddPoiPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void reset() {
        this.f465503h = new r45.tl5();
        this.f465502g.setVisibility(8);
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f465501f.setVisibility(i17);
    }
}
