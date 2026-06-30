package za3;

/* loaded from: classes5.dex */
public class h implements za3.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f470921d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470922e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f470923f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f470924g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageButton f470925h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f470926i;

    public h(ab3.h hVar, android.content.Context context) {
        android.view.View findViewById = ((android.app.Activity) context).findViewById(com.tencent.mm.R.id.in_);
        this.f470923f = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.in8);
        this.f470924g = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.in9);
        this.f470925h = (android.widget.ImageButton) findViewById.findViewById(com.tencent.mm.R.id.inh);
        this.f470926i = (android.view.ViewGroup) findViewById.findViewById(com.tencent.mm.R.id.ini);
        this.f470921d = findViewById;
    }

    @Override // za3.c
    public java.lang.String getPreText() {
        return "";
    }

    @Override // za3.c
    public void setText(java.lang.String str) {
        android.view.View view = this.f470921d;
        view.getWidth();
        view.getHeight();
        if (str != null && !str.equals("")) {
            this.f470924g.setText(str);
        }
        java.lang.String str2 = this.f470922e;
        android.widget.TextView textView = this.f470923f;
        if (str2 == null || str2.equals("")) {
            textView.setText(com.tencent.mm.R.string.ggg);
        } else {
            textView.setText(this.f470922e);
        }
        android.view.View view2 = this.f470921d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/NewItemOverlay", "initInfo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/location/ui/NewItemOverlay", "initInfo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.invalidate();
    }
}
