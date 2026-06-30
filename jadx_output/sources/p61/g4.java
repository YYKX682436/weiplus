package p61;

/* loaded from: classes11.dex */
public class g4 {

    /* renamed from: a, reason: collision with root package name */
    public int f352265a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f352266b;

    /* renamed from: c, reason: collision with root package name */
    public int f352267c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f352268d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f352269e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f352270f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f352271g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f352272h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f352273i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.ProgressBar f352274j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p61.h4 f352275k;

    public g4(p61.h4 h4Var, android.view.View view) {
        this.f352275k = h4Var;
        this.f352268d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gel);
        this.f352271g = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.gek);
        this.f352269e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gem);
        this.f352270f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gep);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.gej);
        this.f352272h = findViewById;
        this.f352273i = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.geo);
        this.f352274j = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.gen);
        findViewById.setOnClickListener(new p61.f4(this, h4Var));
    }
}
