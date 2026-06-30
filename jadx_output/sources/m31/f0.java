package m31;

/* loaded from: classes9.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m31.g0 f323140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.SubscribeMsgTmpItem f323141e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f323142f;

    public f0(m31.g0 g0Var, com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem, int i17) {
        this.f323140d = g0Var;
        this.f323141e = subscribeMsgTmpItem;
        this.f323142f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/msgsubscription/ui/SubscribeMsgListAdapter$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f323140d.f323145n.a(this.f323141e, this.f323142f);
        yj0.a.h(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgListAdapter$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
