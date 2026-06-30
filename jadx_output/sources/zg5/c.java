package zg5;

/* loaded from: classes4.dex */
public class c extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public long f472841b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f472842c;

    public c(android.view.View view) {
        super(view);
        this.f472841b = 3000L;
        this.f472842c = new zg5.b(this);
    }

    public static zg5.c a(android.content.Context context, java.lang.String str, long j17, boolean z17) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d1d, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487357oe3);
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        zg5.c cVar = new zg5.c(inflate);
        cVar.setFocusable(false);
        cVar.setContentView(inflate);
        cVar.setWidth(-1);
        if (z17) {
            cVar.setHeight(-1);
        } else {
            cVar.setHeight(-2);
        }
        cVar.setAnimationStyle(com.tencent.mm.R.style.f494613rn);
        cVar.f472841b = j17;
        return cVar;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View view, int i17, int i18) {
        super.showAsDropDown(view, i17, i18);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f472842c;
        n3Var.removeMessages(256);
        n3Var.sendEmptyMessageDelayed(256, this.f472841b);
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(android.view.View view, int i17, int i18, int i19) {
        super.showAtLocation(view, i17, i18, i19);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f472842c;
        n3Var.removeMessages(256);
        n3Var.sendEmptyMessageDelayed(256, this.f472841b);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View view) {
        super.showAsDropDown(view);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f472842c;
        n3Var.removeMessages(256);
        n3Var.sendEmptyMessageDelayed(256, this.f472841b);
    }
}
