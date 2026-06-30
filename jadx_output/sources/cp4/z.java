package cp4;

/* loaded from: classes8.dex */
public final class z extends android.widget.LinearLayout implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public int f221096d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f221097e;

    /* renamed from: f, reason: collision with root package name */
    public final cp4.x f221098f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.tools.f5 f221099g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.p f221100h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f221101i;

    /* renamed from: m, reason: collision with root package name */
    public int f221102m;

    /* renamed from: n, reason: collision with root package name */
    public int f221103n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f221104o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        cp4.x xVar = new cp4.x(context);
        this.f221098f = xVar;
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5((android.app.Activity) context);
        this.f221099g = f5Var;
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a5a, (android.view.ViewGroup) this, true);
        setBackgroundResource(com.tencent.mm.R.drawable.f480905f8);
        setOrientation(1);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.b67);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        this.f221097e = recyclerView;
        findViewById(com.tencent.mm.R.id.f483542b60).setOnClickListener(new cp4.s(this));
        findViewById(com.tencent.mm.R.id.b6e).setOnClickListener(new cp4.t(this));
        recyclerView.setLayoutManager(new com.tencent.mm.plugin.vlog.ui.plugin.caption.EditorCaptionLayoutManager(context, 1));
        recyclerView.setAdapter(xVar);
        f5Var.f210400e = this;
        this.f221104o = new cp4.y(this, context);
    }

    public final yz5.a getCancelClickListener() {
        return this.f221101i;
    }

    public final yz5.p getSureClickListener() {
        return this.f221100h;
    }

    public final void setCancelClickListener(yz5.a aVar) {
        this.f221101i = aVar;
    }

    public final void setSureClickListener(yz5.p pVar) {
        this.f221100h = pVar;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        android.widget.FrameLayout.LayoutParams layoutParams;
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorEditCaptionView", "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17);
        if (getVisibility() != 0 || (layoutParams = (android.widget.FrameLayout.LayoutParams) getLayoutParams()) == null) {
            return;
        }
        layoutParams.bottomMargin = i17;
        setLayoutParams(layoutParams);
    }
}
