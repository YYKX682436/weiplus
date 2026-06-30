package nx1;

/* loaded from: classes12.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.PopupWindow f341292a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f341293b;

    /* renamed from: c, reason: collision with root package name */
    public final nx1.i f341294c;

    public j(android.content.Context context, android.view.View view, nx1.i iVar) {
        this.f341294c = iVar;
        this.f341293b = view;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a5l, (android.view.ViewGroup) null);
        inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(inflate, -2, -2, false);
        this.f341292a = popupWindow;
        popupWindow.setClippingEnabled(false);
        inflate.findViewById(com.tencent.mm.R.id.plc).setOnClickListener(new nx1.e(this));
        inflate.findViewById(com.tencent.mm.R.id.pl_).setOnClickListener(new nx1.f(this));
        inflate.findViewById(com.tencent.mm.R.id.plb).setOnClickListener(new nx1.g(this));
        inflate.findViewById(com.tencent.mm.R.id.plk).setOnClickListener(new nx1.h(this));
    }
}
