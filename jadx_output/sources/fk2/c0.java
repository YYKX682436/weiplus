package fk2;

/* loaded from: classes3.dex */
public final class c0 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.g0 f263326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263327e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263328f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f263329g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263330h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263331i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263332m;

    public c0(fk2.g0 g0Var, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, android.content.Context context) {
        this.f263326d = g0Var;
        this.f263327e = str;
        this.f263328f = str2;
        this.f263329g = i17;
        this.f263330h = str3;
        this.f263331i = str4;
        this.f263332m = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemComboLiveReward$configContentPrefixSongStyleSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        fk2.x xVar = fk2.g0.f263390m;
        fk2.g0 g0Var = this.f263326d;
        xVar.a(g0Var.f445240a.t(), this.f263327e, this.f263328f, this.f263329g, g0Var.f445240a.q());
        g0Var.f445240a.g(this.f263330h, this.f263331i);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemComboLiveReward$configContentPrefixSongStyleSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f263332m.getResources().getColor(com.tencent.mm.R.color.f479049ak4));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
