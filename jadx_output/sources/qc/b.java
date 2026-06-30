package qc;

/* loaded from: classes14.dex */
public final class b extends android.app.Dialog {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f361342d;

    /* renamed from: e, reason: collision with root package name */
    public int f361343e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f361344f;

    public b(android.app.Activity activity) {
        super(activity, 0);
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(com.tencent.mm.R.layout.eq7, (android.view.ViewGroup) null);
        setContentView(inflate);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        this.f361342d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.vjw);
        findViewById(com.tencent.mm.R.id.vjm).setOnClickListener(new android.view.View.OnClickListener() { // from class: qc.b$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                qc.b bVar = qc.b.this;
                bVar.dismiss();
                pc.f.c(bVar.f361343e, bVar.f361344f);
            }
        });
        setCanceledOnTouchOutside(false);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
    }
}
