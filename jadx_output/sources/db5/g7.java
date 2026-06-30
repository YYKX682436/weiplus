package db5;

/* loaded from: classes14.dex */
public class g7 {

    /* renamed from: a, reason: collision with root package name */
    public db5.h7 f228350a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f228351b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.vj f228352c = new com.tencent.mm.ui.vj();

    public g7(android.content.Context context) {
        this.f228351b = context;
    }

    public db5.h7 a() {
        android.widget.ImageView imageView;
        android.content.Context context = this.f228351b;
        com.tencent.mm.ui.vj vjVar = this.f228352c;
        db5.h7 h7Var = new db5.h7(context, vjVar.f211162a, vjVar.f211163b);
        java.lang.CharSequence charSequence = vjVar.f211164c;
        if (charSequence != null && charSequence.length() > 0) {
            h7Var.f228384d.setText(vjVar.f211164c);
        }
        android.graphics.drawable.Drawable drawable = vjVar.f211165d;
        if (drawable != null && (imageView = h7Var.f228385e) != null) {
            imageView.setImageDrawable(drawable);
        }
        h7Var.setCanceledOnTouchOutside(vjVar.f211166e);
        android.content.DialogInterface.OnDismissListener onDismissListener = vjVar.f211167f;
        if (onDismissListener != null) {
            h7Var.setOnDismissListener(onDismissListener);
        }
        android.content.DialogInterface.OnCancelListener onCancelListener = vjVar.f211168g;
        if (onCancelListener != null) {
            h7Var.setOnCancelListener(onCancelListener);
        }
        return h7Var;
    }
}
