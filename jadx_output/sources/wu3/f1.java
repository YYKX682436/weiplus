package wu3;

/* loaded from: classes4.dex */
public final class f1 extends y9.i {

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f449736n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f449737o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f449738p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f449739q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f449740r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.a f449741s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f449742t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(android.content.Context context) {
        super(context, 0);
        kotlin.jvm.internal.o.g(context, "context");
        this.f449742t = true;
        setContentView(com.tencent.mm.R.layout.cwh);
    }

    @Override // y9.i, androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(134218752);
            window.clearFlags(2);
        }
        this.f449739q = findViewById(com.tencent.mm.R.id.nmv);
        this.f449736n = findViewById(com.tencent.mm.R.id.nmy);
        this.f449737o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487134nn0);
        this.f449738p = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.nmz);
        this.f449740r = findViewById(com.tencent.mm.R.id.f487135nn1);
        if (((tt3.a) tt3.b.f422037b.a()).f422032e) {
            android.view.View view = this.f449736n;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initNotifySnsBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initNotifySnsBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = this.f449736n;
            if (view2 != null) {
                view2.setOnClickListener(new wu3.e1(this));
            }
            if (this.f449742t) {
                android.widget.TextView textView = this.f449737o;
                if (textView != null) {
                    textView.setText(getContext().getResources().getString(com.tencent.mm.R.string.jmf));
                }
                android.widget.ImageView imageView = this.f449738p;
                if (imageView != null) {
                    imageView.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_outlined_moment_off, getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9)));
                }
            } else {
                android.widget.TextView textView2 = this.f449737o;
                if (textView2 != null) {
                    textView2.setText(getContext().getResources().getString(com.tencent.mm.R.string.jmg));
                }
                android.widget.ImageView imageView2 = this.f449738p;
                if (imageView2 != null) {
                    imageView2.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_outlined_moment, getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9)));
                }
            }
        } else {
            android.view.View view3 = this.f449736n;
            if (view3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initNotifySnsBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initNotifySnsBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.view.View view4 = this.f449739q;
        if (view4 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initFavoriteBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initFavoriteBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view5 = this.f449740r;
        if (view5 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initRangeBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initRangeBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f484059cv0);
        if (findViewById != null) {
            findViewById.setBackgroundResource(com.tencent.mm.R.color.a9e);
        }
    }
}
