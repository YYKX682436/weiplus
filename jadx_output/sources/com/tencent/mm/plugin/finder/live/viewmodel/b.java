package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class b extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f116910d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f116911e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f116912f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f116913g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f116914h;

    /* renamed from: i, reason: collision with root package name */
    public r45.xl6 f116915i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f116910d = "Finder.FinderGameFinishUIC";
        this.f116911e = true;
        this.f116912f = "";
        this.f116913g = "";
    }

    public final void O6() {
        android.view.View h17 = h();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(h17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameFinishUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        h17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(h17, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameFinishUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void P6(boolean z17, java.lang.String title, java.lang.String desc) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        this.f116911e = z17;
        this.f116912f = title;
        this.f116913g = desc;
    }

    public final void Q6() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) h().findViewById(com.tencent.mm.R.id.g6b);
        if (this.f116911e) {
            weImageView.setImageResource(com.tencent.mm.R.raw.finder_live_icon);
            weImageView.setIconColor(getResources().getColor(com.tencent.mm.R.color.f479063oq));
        } else {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_error);
            weImageView.setIconColor(getResources().getColor(com.tencent.mm.R.color.f479063oq));
        }
        ((android.widget.TextView) h().findViewById(com.tencent.mm.R.id.g6g)).setText(this.f116912f);
        ((android.widget.TextView) h().findViewById(com.tencent.mm.R.id.g6a)).setText(this.f116913g);
        h().findViewById(com.tencent.mm.R.id.g68).setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.a(this));
        android.view.View h17 = h();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(h17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameFinishUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        h17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(h17, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameFinishUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final android.view.View h() {
        android.view.View view = this.f116914h;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("root");
        throw null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.g67);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f116914h = findViewById;
        r45.xl6 xl6Var = new r45.xl6();
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("KEY_FROM_THIRD_PARTY_SHARE");
        if (byteArrayExtra != null) {
            try {
                xl6Var.parseFrom(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
            this.f116915i = xl6Var;
        }
        xl6Var = null;
        this.f116915i = xl6Var;
    }
}
