package ey0;

/* loaded from: classes5.dex */
public class d implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f257298d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.mj_publisher.finder.widgets.picker.MJCustomTimePicker f257299e;

    public d(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.dfi, null);
        this.f257298d = inflate;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.cqo);
        this.f257299e = new com.tencent.mm.mj_publisher.finder.widgets.picker.MJCustomTimePicker(context);
        linearLayout.removeAllViews();
        linearLayout.setGravity(17);
        this.f257299e.getView().findViewById(com.tencent.mm.R.id.o8w).setBackgroundColor(0);
        linearLayout.addView(this.f257299e.getView(), new android.widget.LinearLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }
}
