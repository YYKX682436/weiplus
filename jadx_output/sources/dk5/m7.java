package dk5;

/* loaded from: classes9.dex */
public class m7 extends android.app.Dialog implements android.content.DialogInterface {

    /* renamed from: d, reason: collision with root package name */
    public dk5.l7 f234739d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f234740e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f234741f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f234742g;

    public m7(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494791wd);
        this.f234739d = null;
        this.f234740e = context;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.View.inflate(context, com.tencent.mm.R.layout.d1f, null);
        this.f234741f = linearLayout;
        this.f234742g = (android.widget.Button) linearLayout.findViewById(com.tencent.mm.R.id.oef);
        android.widget.ImageView imageView = (android.widget.ImageView) this.f234741f.findViewById(com.tencent.mm.R.id.oe_);
        if (com.tencent.mm.sdk.platformtools.m2.j()) {
            imageView.setImageResource(com.tencent.mm.R.drawable.cgl);
        } else {
            imageView.setImageResource(com.tencent.mm.R.drawable.cgm);
        }
        this.f234742g.setOnClickListener(new dk5.j7(this));
    }

    public static void b(android.content.Context context, dk5.l7 l7Var) {
        dk5.m7 m7Var = new dk5.m7(context);
        m7Var.f234739d = l7Var;
        m7Var.setCancelable(false);
        m7Var.show();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new dk5.k7(this));
            com.tencent.mars.xlog.Log.e("MicroMsg.grouptodo.TodoIntroduceView", "dialog dismiss error!");
            return;
        }
        try {
            android.content.Context context = this.f234740e;
            if (context == null || !(context instanceof android.app.Activity)) {
                super.dismiss();
            } else if (!((android.app.Activity) context).isFinishing()) {
                super.dismiss();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.grouptodo.TodoIntroduceView", "dismiss exception, e = " + e17.getMessage());
        }
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f234741f);
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.grouptodo.TodoIntroduceView", "%s:%s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }
}
