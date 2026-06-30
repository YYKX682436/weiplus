package oc1;

/* loaded from: classes.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f344141d;

    public b(android.content.Context context) {
        this.f344141d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f344141d;
        android.widget.Toast makeText = dp.a.makeText(context, "", 3000);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488379rq, null);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.f487356oe2)).setImageResource(com.tencent.mm.R.raw.icons_outlined_colorful_handoff_success);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487357oe3);
        textView.setText(context.getString(com.tencent.mm.R.string.a2c));
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new oc1.a(this, textView));
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
    }
}
