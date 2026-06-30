package ie;

/* loaded from: classes7.dex */
public final class b extends android.widget.FrameLayout implements com.tencent.mm.plugin.appbrand.widget.input.n3 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f290952d;

    public b(android.content.Context context) {
        super(context);
        ie.c cVar = ie.d.H;
        if (cVar != null) {
            ((la1.h) cVar).getClass();
            android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.d4w, (android.view.ViewGroup) this, true);
        } else {
            android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488032ex, (android.view.ViewGroup) this, true);
        }
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.f485115gl3)).setText(com.tencent.mm.R.string.a1b);
        setClickable(true);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.n3
    public void a(boolean z17) {
        setVisibility(z17 ? 8 : 0);
    }

    public android.view.View b() {
        if (this.f290952d == null) {
            this.f290952d = findViewById(com.tencent.mm.R.id.f485115gl3);
        }
        return this.f290952d;
    }
}
