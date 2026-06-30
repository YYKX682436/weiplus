package ij2;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f291691a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f291692b;

    /* renamed from: c, reason: collision with root package name */
    public ij2.b f291693c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f291694d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f291695e;

    /* renamed from: f, reason: collision with root package name */
    public xh2.a f291696f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f291697g;

    public c(android.view.View root, yz5.p onClickInvoke) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(onClickInvoke, "onClickInvoke");
        this.f291691a = root;
        this.f291692b = onClickInvoke;
        this.f291693c = ij2.b.f291688d;
        this.f291694d = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.a_1);
        this.f291695e = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.kb_);
        this.f291697g = root.findViewById(com.tencent.mm.R.id.dfl);
        c();
        root.setOnClickListener(new ij2.a(this));
    }

    public final void a(xh2.a aVar) {
        km2.q qVar;
        this.f291696f = aVar;
        jz5.f0 f0Var = null;
        if (aVar != null && (qVar = aVar.f454520a) != null) {
            android.view.View view = this.f291697g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/voiceroom/view/FinderLiveVoiceRoomEditItem", "bindMicUserData", "(Lcom/tencent/mm/plugin/finder/live/mic/FinderLiveMicCoverData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/voiceroom/view/FinderLiveVoiceRoomEditItem", "bindMicUserData", "(Lcom/tencent/mm/plugin/finder/live/mic/FinderLiveMicCoverData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView avatarIconView = this.f291694d;
            avatarIconView.setVisibility(0);
            boolean S3 = com.tencent.mm.storage.z3.S3(qVar.f309172c);
            mn2.g1 g1Var = mn2.g1.f329975a;
            if (S3) {
                vo0.d a17 = g1Var.a();
                mn2.n nVar = new mn2.n(qVar.f309171b, null, 2, null);
                kotlin.jvm.internal.o.f(avatarIconView, "avatarIconView");
                a17.c(nVar, avatarIconView, g1Var.h(mn2.f1.f329957h));
            } else {
                vo0.d l17 = g1Var.l();
                mn2.n nVar2 = new mn2.n(qVar.f309171b, null, 2, null);
                kotlin.jvm.internal.o.f(avatarIconView, "avatarIconView");
                l17.c(nVar2, avatarIconView, g1Var.h(mn2.f1.f329961o));
            }
            java.lang.String D0 = zl2.r4.D0(zl2.r4.f473950a, qVar.f309172c, qVar.f309173d, false, 4, null);
            android.widget.TextView textView = this.f291695e;
            textView.setText(D0);
            textView.setTextColor(this.f291691a.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            c();
        }
    }

    public final void b(boolean z17) {
        android.view.View view = this.f291691a;
        if (z17) {
            xh2.a aVar = this.f291696f;
            if ((aVar != null ? aVar.f454520a : null) != null) {
                this.f291693c = ij2.b.f291689e;
                view.setSelected(true);
                return;
            }
        }
        this.f291693c = ij2.b.f291688d;
        view.setSelected(false);
    }

    public final void c() {
        android.view.View view = this.f291697g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/voiceroom/view/FinderLiveVoiceRoomEditItem", "showEmptyItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/voiceroom/view/FinderLiveVoiceRoomEditItem", "showEmptyItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f291694d.setVisibility(8);
        android.view.View view2 = this.f291691a;
        java.lang.String string = view2.getContext().getResources().getString(com.tencent.mm.R.string.m0t);
        android.widget.TextView textView = this.f291695e;
        textView.setText(string);
        textView.setTextColor(view2.getContext().getResources().getColor(com.tencent.mm.R.color.FG_2));
    }
}
