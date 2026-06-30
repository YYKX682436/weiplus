package mm3;

/* loaded from: classes10.dex */
public final class w extends y9.i {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f329677n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f329678o;

    /* renamed from: p, reason: collision with root package name */
    public final yz5.p f329679p;

    /* renamed from: q, reason: collision with root package name */
    public final yz5.l f329680q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f329681r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f329682s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.content.Context context, java.lang.String str, java.util.List pagInfoList, yz5.p onPreview, yz5.l onSelected) {
        super(context, 0);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pagInfoList, "pagInfoList");
        kotlin.jvm.internal.o.g(onPreview, "onPreview");
        kotlin.jvm.internal.o.g(onSelected, "onSelected");
        this.f329677n = str;
        this.f329678o = pagInfoList;
        this.f329679p = onPreview;
        this.f329680q = onSelected;
        this.f329681r = str;
        this.f329682s = jz5.h.b(new mm3.v(this));
        setContentView(com.tencent.mm.R.layout.c4u);
    }

    public final void E(boolean z17) {
        android.view.View view = (android.view.View) ((jz5.n) this.f329682s).getValue();
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog", "setShowReplay", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog", "setShowReplay", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // y9.i, androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.d_4);
        kotlin.jvm.internal.o.d(findViewById);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 0, false));
        recyclerView.setAdapter(new mm3.q(this));
        setOnCancelListener(new mm3.r(this));
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.bz6);
        kotlin.jvm.internal.o.d(findViewById2);
        findViewById2.setOnClickListener(new mm3.s(this));
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.c_3);
        kotlin.jvm.internal.o.d(findViewById3);
        findViewById3.setOnClickListener(new mm3.t(this));
        jz5.g gVar = this.f329682s;
        android.view.View view = (android.view.View) ((jz5.n) gVar).getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.view.View) ((jz5.n) gVar).getValue()).setOnClickListener(new mm3.u(this));
    }
}
