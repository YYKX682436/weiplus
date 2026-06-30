package we5;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f445319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f445320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.a9 f445321f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f445322g;

    public d(android.app.Activity activity, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.a9 a9Var, yb5.d dVar) {
        this.f445319d = activity;
        this.f445320e = f9Var;
        this.f445321f = a9Var;
        this.f445322g = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/asyncitem/ChattingItemText$ChattingItemTextFrom$Companion$initAutoTranslationTail$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((com.tencent.mm.ui.chatting.viewitems.xb) this.f445321f).f205979e = go.d.f273696a.a(this.f445319d, this.f445320e);
        this.f445322g.J();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/asyncitem/ChattingItemText$ChattingItemTextFrom$Companion$initAutoTranslationTail$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
