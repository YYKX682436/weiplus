package fh4;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final db5.d5 f262661a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f262662b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f262663c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f262664d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f262665e;

    public b(android.content.Context context) {
        new fh4.a(this);
        com.tencent.mm.sdk.platformtools.j.d(context, 180.0f);
        db5.d5 d5Var = new db5.d5(((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.tencent.mm.R.layout.d4k, (android.view.ViewGroup) null), -1, -2);
        this.f262661a = d5Var;
        this.f262662b = d5Var.getContentView().findViewById(com.tencent.mm.R.id.p6p);
        this.f262663c = d5Var.getContentView().findViewById(com.tencent.mm.R.id.p6s);
        this.f262664d = d5Var.getContentView().findViewById(com.tencent.mm.R.id.p6t);
        this.f262665e = d5Var.getContentView().findViewById(com.tencent.mm.R.id.p6u);
    }
}
