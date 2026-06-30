package zh1;

/* loaded from: classes8.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zh1.n f472898d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(zh1.n nVar) {
        super(0);
        this.f472898d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View decorView;
        android.view.Window window;
        zh1.n nVar = this.f472898d;
        ei1.b bVar = nVar.f472917i;
        ei1.b bVar2 = bVar;
        if (bVar == null) {
            zh1.f fVar = new zh1.f(nVar);
            android.content.Context context = nVar.f472912d;
            fi1.d dVar = new fi1.d(context, fVar);
            zh1.g gVar = new zh1.g(nVar);
            fi1.g gVar2 = dVar.f262775f;
            gVar2.f262784g = gVar;
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c8m, (android.view.ViewGroup) null);
            android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.hkr);
            if (imageView != null) {
                imageView.setImageResource(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.drawable.buc : com.tencent.mm.R.drawable.bu9);
                imageView.setOnClickListener(new zh1.h(nVar));
                com.tencent.mm.ui.tools.d8.a(imageView);
            }
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.oqh);
            if (textView != null) {
                textView.setText(com.tencent.mm.R.string.f490210o1);
            }
            gVar2.f262783f.setTitleView(inflate);
            dVar.f262774e = inflate;
            gVar2.setOnDismissListener(new zh1.k(nVar));
            nVar.f472917i = dVar;
            bVar2 = dVar;
        }
        fi1.d dVar2 = (fi1.d) bVar2;
        fi1.g gVar3 = dVar2.f262775f;
        android.view.Window window2 = gVar3.getWindow();
        if (window2 != null) {
            window2.addFlags(Integer.MIN_VALUE);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = nVar.f472913e;
        if ((k0Var != null && true == k0Var.T1) && (window = gVar3.getWindow()) != null) {
            window.addFlags(1024);
        }
        if (k0Var != null && true == k0Var.X1) {
            android.view.Window window3 = gVar3.getWindow();
            if (window3 != null) {
                window3.setFlags(8, 8);
            }
            android.view.Window window4 = gVar3.getWindow();
            if (window4 != null) {
                window4.addFlags(131200);
            }
            android.view.Window window5 = gVar3.getWindow();
            decorView = window5 != null ? window5.getDecorView() : null;
            if (decorView != null) {
                decorView.setSystemUiVisibility(6);
            }
        } else {
            android.view.Window window6 = gVar3.getWindow();
            if (window6 != null) {
                window6.clearFlags(8);
            }
            android.view.Window window7 = gVar3.getWindow();
            if (window7 != null) {
                window7.clearFlags(131072);
            }
            android.view.Window window8 = gVar3.getWindow();
            if (window8 != null) {
                window8.clearFlags(128);
            }
            android.view.Window window9 = gVar3.getWindow();
            decorView = window9 != null ? window9.getDecorView() : null;
            if (decorView != null) {
                decorView.setSystemUiVisibility(0);
            }
        }
        android.content.Context context2 = dVar2.f262773d;
        dVar2.f262778i = 2 == context2.getResources().getConfiguration().orientation;
        dVar2.f262779m = context2 instanceof android.app.Activity ? ((android.app.Activity) context2).getWindowManager().getDefaultDisplay().getRotation() : 0;
        android.view.View view = (android.view.View) dVar2.f262776g.getValue();
        if (view != null) {
            boolean z17 = dVar2.f262777h == null;
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            dVar2.f262777h = viewTreeObserver;
            if (z17 && viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(dVar2);
            }
        }
        if (context2 instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context2;
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                gVar3.show();
                return jz5.f0.f302826a;
            }
        }
        gVar3.show();
        return jz5.f0.f302826a;
    }
}
