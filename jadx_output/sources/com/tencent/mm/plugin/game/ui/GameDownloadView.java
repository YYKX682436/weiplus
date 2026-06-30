package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameDownloadView extends android.widget.FrameLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f140761i = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f140762d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.widget.TextProgressBar f140763e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.s f140764f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.c0 f140765g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.model.z f140766h;

    public GameDownloadView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f140766h = new com.tencent.mm.plugin.game.ui.f3(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mm.plugin.game.model.z zVar = this.f140766h;
        java.util.Set set = com.tencent.mm.plugin.game.model.b0.f140225b;
        synchronized (set) {
            set.add(zVar);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameDownloadView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f140765g.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mm.plugin.game.ui.s sVar = this.f140764f;
        com.tencent.mm.plugin.game.model.c0 c0Var = this.f140765g;
        sVar.a(c0Var.f140241a, c0Var);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameDownloadView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mm.plugin.game.model.z zVar = this.f140766h;
        java.util.Set set = com.tencent.mm.plugin.game.model.b0.f140225b;
        synchronized (set) {
            set.remove(zVar);
            set.size();
        }
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bfp, (android.view.ViewGroup) this, true);
        this.f140762d = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.gkz);
        com.tencent.mm.plugin.game.widget.TextProgressBar textProgressBar = (com.tencent.mm.plugin.game.widget.TextProgressBar) inflate.findViewById(com.tencent.mm.R.id.f485113gl1);
        this.f140763e = textProgressBar;
        textProgressBar.setTextSize(14);
        this.f140762d.setOnClickListener(this);
        this.f140763e.setOnClickListener(this);
        com.tencent.mm.plugin.game.ui.s sVar = new com.tencent.mm.plugin.game.ui.s(getContext());
        this.f140764f = sVar;
        sVar.f141745f = new com.tencent.mm.plugin.game.ui.c3(this);
    }

    public void setDownloadInfo(com.tencent.mm.plugin.game.model.c0 c0Var) {
        this.f140765g = c0Var;
        r53.f.l().postToWorker(new com.tencent.mm.plugin.game.ui.d3(this));
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.game.ui.e3(this));
    }
}
