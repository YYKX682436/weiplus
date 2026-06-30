package ti2;

/* loaded from: classes10.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ti2.l f419559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f419560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vi2.h f419561f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f419562g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f419563h;

    public k(ti2.l lVar, android.widget.TextView textView, vi2.h hVar, int i17, r45.xn1 xn1Var) {
        this.f419559d = lVar;
        this.f419560e = textView;
        this.f419561f = hVar;
        this.f419562g = i17;
        this.f419563h = xn1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorInviteUserConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ti2.l lVar = this.f419559d;
        if (((mm2.o4) lVar.f419564e.a(mm2.o4.class)).p7() >= 8) {
            android.widget.TextView textView = this.f419560e;
            db5.t7.makeText(textView.getContext(), textView.getContext().getResources().getString(com.tencent.mm.R.string.m37), 0).show();
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorInviteUserConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            vi2.g gVar = vi2.g.f437547e;
            vi2.h hVar = this.f419561f;
            hVar.getClass();
            hVar.f437550d = gVar;
            lVar.f419565f.a(this.f419562g, this.f419563h);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorInviteUserConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
