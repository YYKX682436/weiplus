package lj5;

/* loaded from: classes.dex */
public final class c implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f318991a;

    /* renamed from: b, reason: collision with root package name */
    public mj5.a f318992b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (this.f318991a == null) {
            this.f318991a = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489108dp2, (android.view.ViewGroup) null);
            c(null, this.f318992b);
        }
        android.view.View view = this.f318991a;
        kotlin.jvm.internal.o.d(view);
        return view;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        mj5.a aVar = (mj5.a) pVar;
        mj5.a aVar2 = this.f318992b;
        this.f318992b = aVar;
        c(aVar2, aVar);
    }

    public final void c(mj5.a aVar, mj5.a aVar2) {
        android.view.View view;
        if (aVar2 == null || (view = this.f318991a) == null) {
            return;
        }
        android.widget.Button button = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.oom);
        if (button != null) {
            button.setText(aVar2.f327086d);
            button.setOnClickListener(new lj5.a(aVar2));
        }
        android.widget.Button button2 = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.q0d);
        if (button2 != null) {
            button2.setText(aVar2.f327088f);
            button2.setOnClickListener(new lj5.b(aVar2));
        }
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f318992b;
    }
}
