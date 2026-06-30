package fk2;

/* loaded from: classes3.dex */
public final class i1 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.j1 f263404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263406f;

    public i1(fk2.j1 j1Var, java.lang.String str, android.content.Context context) {
        this.f263404d = j1Var;
        this.f263405e = str;
        this.f263406f = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        android.content.Context context;
        mm2.e1 e1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemKTVSong$createSongSpanItem$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        fk2.j1 j1Var = this.f263404d;
        com.tencent.mm.plugin.finder.live.view.k0 p17 = j1Var.f445240a.p();
        if ((p17 == null || (e1Var = (mm2.e1) p17.business(mm2.e1.class)) == null) ? false : e1Var.b7()) {
            java.lang.String str = this.f263405e;
            j1Var.q(2, str);
            j1Var.f445240a.s(str);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemKTVSong$createSongSpanItem$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (p17 != null && (context = p17.getContext()) != null) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            android.content.res.Resources resources = context.getResources();
            e4Var.f211776c = resources != null ? resources.getString(com.tencent.mm.R.string.nva) : null;
            e4Var.c();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemKTVSong$createSongSpanItem$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f263406f.getResources().getColor(com.tencent.mm.R.color.f479049ak4));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
