package ey0;

/* loaded from: classes5.dex */
public class c implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f257296d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.mj_publisher.finder.widgets.picker.MJCustomDatePicker f257297e;

    public c(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.dfi, null);
        this.f257296d = inflate;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.cqo);
        this.f257297e = new com.tencent.mm.mj_publisher.finder.widgets.picker.MJCustomDatePicker(context);
        linearLayout.removeAllViews();
        linearLayout.setGravity(17);
        this.f257297e.getView().findViewById(com.tencent.mm.R.id.o8w).setBackgroundColor(0);
        linearLayout.addView(this.f257297e.getView(), new android.widget.LinearLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }
}
