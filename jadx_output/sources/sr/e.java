package sr;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f411390a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f411391b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.api.SmileyPanel f411392c;

    public e(android.content.Context context, android.view.ViewGroup parent, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f411390a = context;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f411391b = frameLayout;
        parent.addView(frameLayout, new android.view.ViewGroup.LayoutParams(-1, -1));
        frameLayout.setOnClickListener(new sr.c(this));
        com.tencent.mm.api.SmileyPanel c17 = qk.w9.c(context, z17);
        this.f411392c = c17;
        int i17 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
        c17.setEntranceScene(3);
        c17.setSearchSource(6);
        c17.setShowSmiley(false);
        c17.setShowClose(true);
        c17.i();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, qk.w9.a(context));
        layoutParams.gravity = 80;
        frameLayout.addView(c17, layoutParams);
        frameLayout.setVisibility(8);
        c17.setVisibility(8);
        c17.setTranslationY(layoutParams.height);
    }

    public abstract void a();
}
