package mh2;

/* loaded from: classes10.dex */
public final class r1 extends mh2.a {

    /* renamed from: c, reason: collision with root package name */
    public final ah2.f f326447c;

    /* renamed from: d, reason: collision with root package name */
    public final lj2.v0 f326448d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f326449e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(android.content.Context context, android.view.ViewGroup root, ah2.f contentService, lj2.v0 pluginAbility) {
        super(context, root);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(contentService, "contentService");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        this.f326447c = contentService;
        this.f326448d = pluginAbility;
        this.f326449e = (android.widget.TextView) this.f326292b.findViewById(com.tencent.mm.R.id.f486314s01);
    }

    @Override // mh2.a
    public int a() {
        return com.tencent.mm.R.layout.drg;
    }

    @Override // mh2.a
    public void c(om2.d0 singState) {
        kotlin.jvm.internal.o.g(singState, "singState");
        lj2.v0 v0Var = this.f326448d;
        lj2.w0 f17 = v0Var.f();
        boolean z17 = false;
        int i17 = (f17 == lj2.w0.f318958d || f17 == lj2.w0.f318960f) ? 0 : 4;
        android.widget.TextView textView = this.f326449e;
        textView.setVisibility(i17);
        tn0.w0 h17 = v0Var.h();
        if (h17 != null && h17.X()) {
            z17 = true;
        }
        android.content.Context context = this.f326291a;
        textView.setText((z17 || zl2.r4.f473950a.x1()) ? context.getResources().getString(com.tencent.mm.R.string.dko) : context.getResources().getString(com.tencent.mm.R.string.dkp));
        textView.setOnClickListener(new mh2.n1(this));
        this.f326447c.b(new mh2.o1(this));
        lj2.w0 f18 = v0Var.f();
        lj2.w0 w0Var = lj2.w0.f318959e;
        android.view.View view = this.f326292b;
        if (f18 == w0Var) {
            view.setTranslationY(i65.a.b(view.getContext(), 60));
        } else {
            view.setTranslationY(0.0f);
        }
        com.tencent.mm.plugin.finder.live.ktv.view.AttachLinearLayout attachLinearLayout = view instanceof com.tencent.mm.plugin.finder.live.ktv.view.AttachLinearLayout ? (com.tencent.mm.plugin.finder.live.ktv.view.AttachLinearLayout) view : null;
        if (attachLinearLayout == null) {
            return;
        }
        attachLinearLayout.setAttachBlock(new mh2.q1(this));
    }
}
