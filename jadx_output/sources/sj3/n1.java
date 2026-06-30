package sj3;

/* loaded from: classes3.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f408647a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f408648b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f408649c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f408650d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f408651e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f408652f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f408653g;

    public n1(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f408647a = rootView;
        android.content.Context context = rootView.getContext();
        this.f408651e = context;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) rootView.findViewById(com.tencent.mm.R.id.f486028jx4);
        this.f408649c = weImageView;
        if (weImageView != null) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_video_call);
        }
        if (weImageView != null) {
            weImageView.setIconColor(android.graphics.Color.parseColor("#07C160"));
        }
        if (weImageView != null) {
            weImageView.setVisibility(8);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) rootView.findViewById(com.tencent.mm.R.id.f486029jx5);
        this.f408650d = weImageView2;
        if (weImageView2 != null) {
            weImageView2.setImageResource(com.tencent.mm.R.raw.icons_filled_mike);
        }
        if (weImageView2 != null) {
            kotlin.jvm.internal.o.d(context);
            weImageView2.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f478502m));
        }
        if (weImageView2 != null) {
            weImageView2.setVisibility(8);
        }
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.h69);
        this.f408648b = findViewById;
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniStatusLayout", "<init>", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniStatusLayout", "<init>", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void a(boolean z17, boolean z18) {
        android.view.View view = this.f408648b;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniStatusLayout", "setDoubleIcon", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniStatusLayout", "setDoubleIcon", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f408650d;
        if (weImageView != null) {
            weImageView.setVisibility(0);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f408649c;
        if (weImageView2 != null) {
            weImageView2.setVisibility(0);
        }
        android.content.Context context = this.f408651e;
        if (z17) {
            if (weImageView != null) {
                weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_mike);
            }
            if (weImageView != null) {
                kotlin.jvm.internal.o.d(context);
                weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.FG_2));
            }
        } else {
            if (weImageView != null) {
                weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_mike);
            }
            if (weImageView != null) {
                kotlin.jvm.internal.o.d(context);
                weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f478502m));
            }
        }
        if (z18) {
            if (weImageView2 != null) {
                weImageView2.setImageResource(com.tencent.mm.R.raw.icons_filled_video_call);
            }
            if (weImageView2 != null) {
                kotlin.jvm.internal.o.d(context);
                weImageView2.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f478502m));
                return;
            }
            return;
        }
        if (weImageView2 != null) {
            weImageView2.setImageResource(com.tencent.mm.R.raw.icons_filled_video_call);
        }
        if (weImageView2 != null) {
            kotlin.jvm.internal.o.d(context);
            weImageView2.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.FG_2));
        }
    }
}
