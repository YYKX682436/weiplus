package db5;

/* loaded from: classes14.dex */
public class h7 extends com.tencent.mm.ui.widget.dialog.k2 implements android.content.DialogInterface {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f228384d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f228385e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f228386f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f228387g;

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Handler f228388h;

    public h7(android.content.Context context, int i17, int i18) {
        super(context, i17);
        int i19;
        this.f228388h = new db5.f7(this, android.os.Looper.getMainLooper());
        this.f228386f = context;
        if (i18 != 0) {
            if (i18 == 1) {
                i19 = com.tencent.mm.R.layout.c1n;
            } else if (i18 == 2) {
                i19 = com.tencent.mm.R.layout.c1g;
            }
            android.view.View inflate = android.view.View.inflate(context, i19, null);
            this.f228387g = inflate;
            this.f228384d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jsu);
            this.f228385e = (android.widget.ImageView) this.f228387g.findViewById(com.tencent.mm.R.id.h5n);
            setCanceledOnTouchOutside(true);
        }
        i19 = com.tencent.mm.R.layout.c1m;
        android.view.View inflate2 = android.view.View.inflate(context, i19, null);
        this.f228387g = inflate2;
        this.f228384d = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.jsu);
        this.f228385e = (android.widget.ImageView) this.f228387g.findViewById(com.tencent.mm.R.id.h5n);
        setCanceledOnTouchOutside(true);
    }

    public static db5.h7 c(android.graphics.drawable.Drawable drawable, java.lang.CharSequence charSequence, android.content.Context context, int i17, android.content.DialogInterface.OnDismissListener onDismissListener) {
        int i18 = com.tencent.mm.R.style.f494796wi;
        if (i17 != 0 && i17 == 1) {
            i18 = com.tencent.mm.R.style.f494791wd;
        }
        db5.g7 g7Var = new db5.g7(context);
        com.tencent.mm.ui.vj vjVar = g7Var.f228352c;
        vjVar.f211162a = i18;
        vjVar.f211163b = i17;
        vjVar.f211164c = charSequence;
        vjVar.f211165d = drawable;
        vjVar.f211166e = true;
        vjVar.f211167f = onDismissListener;
        if (g7Var.f228351b instanceof android.app.Activity) {
            if (g7Var.f228350a == null) {
                g7Var.f228350a = g7Var.a();
            }
            g7Var.f228350a.show();
        } else {
            com.tencent.mm.ui.AlertActivity.f196557n = g7Var;
            android.content.Intent intent = new android.content.Intent(g7Var.f228351b, (java.lang.Class<?>) com.tencent.mm.ui.AlertActivity.class);
            intent.setFlags(335544320);
            intent.putExtra("dialog_scene", 2);
            android.content.Context context2 = g7Var.f228351b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/ui/base/MMTipsDialog$Builder", "show", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/ui/base/MMTipsDialog$Builder", "show", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return g7Var.f228350a;
    }

    @Override // com.tencent.mm.ui.widget.dialog.k2, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f228387g, new android.widget.LinearLayout.LayoutParams(-1, -1));
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        onWindowAttributesChanged(attributes);
    }

    @Override // com.tencent.mm.ui.widget.dialog.k2, android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (java.lang.Exception e17) {
            com.tencent.mm.ui.yk.d("MicroMsg.MMTipsDialog", e17, "", new java.lang.Object[0]);
        }
        this.f228388h.sendEmptyMessageDelayed(0, 1000L);
    }
}
