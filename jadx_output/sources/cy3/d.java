package cy3;

/* loaded from: classes10.dex */
public final class d implements cy3.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f224759a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f224760b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.gif.MMAnimateView f224761c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f224762d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f224763e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.ringtone.widget.RingtoneAuthorLayout f224764f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f224765g;

    /* renamed from: h, reason: collision with root package name */
    public vx3.i f224766h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.lifecycle.j0 f224767i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.View f224768j;

    /* renamed from: k, reason: collision with root package name */
    public final android.view.View f224769k;

    public d(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f224759a = rootView;
        android.content.Context context = rootView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f224765g = context;
        this.f224767i = new androidx.lifecycle.j0();
        this.f224760b = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.c8n);
        this.f224761c = (com.tencent.mm.plugin.gif.MMAnimateView) rootView.findViewById(com.tencent.mm.R.id.m4s);
        this.f224762d = (android.widget.ImageView) rootView.findViewById(com.tencent.mm.R.id.m4p);
        this.f224763e = rootView.findViewById(com.tencent.mm.R.id.m4q);
        this.f224764f = (com.tencent.mm.plugin.ringtone.widget.RingtoneAuthorLayout) rootView.findViewById(com.tencent.mm.R.id.m4x);
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.m5p);
        this.f224768j = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new cy3.a(this));
        }
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.m5q);
        this.f224769k = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new cy3.b(this));
        }
    }

    public final void b(boolean z17) {
        vx3.i iVar = this.f224766h;
        if (iVar != null && iVar.f441297n) {
            return;
        }
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = this.f224761c;
        if (z17) {
            if (!(mMAnimateView != null && mMAnimateView.r())) {
                if (mMAnimateView != null) {
                    mMAnimateView.setImageFilePath(mx3.f0.f(true));
                }
                if (mMAnimateView != null) {
                    mMAnimateView.x();
                }
            }
        } else if (mMAnimateView != null) {
            android.content.Context context = this.f224765g;
            kotlin.jvm.internal.o.g(context, "context");
            int d17 = i65.a.d(context, com.tencent.mm.R.color.f478553an);
            android.graphics.drawable.Drawable mutate = i65.a.i(context, com.tencent.mm.R.raw.icons_outlined_play2).mutate();
            kotlin.jvm.internal.o.f(mutate, "mutate(...)");
            mutate.setColorFilter(new android.graphics.PorterDuffColorFilter(android.graphics.Color.argb(android.graphics.Color.alpha(d17), android.graphics.Color.red(d17), android.graphics.Color.green(d17), android.graphics.Color.blue(d17)), android.graphics.PorterDuff.Mode.SRC_ATOP));
            mutate.setAlpha(android.graphics.Color.alpha(d17));
            mMAnimateView.setImageDrawable(mutate);
        }
        android.view.View view = this.f224763e;
        if (view == null) {
            return;
        }
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout", "responseRingtonePlay", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout", "responseRingtonePlay", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
