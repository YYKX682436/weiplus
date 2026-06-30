package p61;

/* loaded from: classes8.dex */
public class n3 {

    /* renamed from: a, reason: collision with root package name */
    public int f352321a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f352322b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f352323c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f352324d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f352325e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f352326f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ProgressBar f352327g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p61.o3 f352328h;

    public n3(p61.o3 o3Var, android.view.View view) {
        this.f352328h = o3Var;
        this.f352322b = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.gq6);
        this.f352323c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gq_);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.gqa);
        this.f352325e = findViewById;
        this.f352326f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gqb);
        this.f352327g = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.gq9);
        this.f352324d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gq7);
        findViewById.setOnClickListener(new p61.m3(this, o3Var));
    }
}
