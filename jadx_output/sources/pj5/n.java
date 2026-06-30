package pj5;

/* loaded from: classes9.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f355392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.lo5 f355393e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pj5.l f355394f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f355395g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z01.d0 f355396h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingScheduleMsgMvvmView f355397i;

    public n(com.tencent.mm.storage.f9 f9Var, r45.lo5 lo5Var, pj5.l lVar, in5.s0 s0Var, z01.d0 d0Var, com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingScheduleMsgMvvmView chattingScheduleMsgMvvmView) {
        this.f355392d = f9Var;
        this.f355393e = lo5Var;
        this.f355394f = lVar;
        this.f355395g = s0Var;
        this.f355396h = d0Var;
        this.f355397i = chattingScheduleMsgMvvmView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/schedulemsg/ScheduleMsgItemConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pj5.k kVar = pj5.k.f355386a;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        kVar.e(context, this.f355392d, 3, this.f355393e.f379675d, new pj5.m(this.f355394f, this.f355395g, this.f355396h, this.f355397i));
        yj0.a.h(this, "com/tencent/mm/ui/schedulemsg/ScheduleMsgItemConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
