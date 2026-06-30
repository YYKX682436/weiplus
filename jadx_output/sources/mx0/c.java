package mx0;

/* loaded from: classes5.dex */
public final class c extends mx0.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.ui.widget.imageview.WeImageView view, mx0.z controller) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(controller, "controller");
        view.setOnClickListener(new mx0.b(controller));
        view.setEnableColorFilter(false);
        b(com.tencent.mm.R.drawable.ckw);
    }

    public final void b(int i17) {
        android.view.View view = this.f331814d;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        ((com.tencent.mm.ui.widget.imageview.WeImageView) view).setImageResource(i17);
    }
}
