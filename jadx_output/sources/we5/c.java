package we5;

/* loaded from: classes5.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f445310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f445311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.a9 f445312f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f445313g;

    public c(android.app.Activity activity, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.a9 a9Var, yb5.d dVar) {
        this.f445310d = activity;
        this.f445311e = f9Var;
        this.f445312f = a9Var;
        this.f445313g = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/asyncitem/ChattingItemText$ChattingItemTextFrom$Companion$initAutoTranslationTail$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((com.tencent.mm.ui.chatting.viewitems.un) this.f445312f).f205716e = go.d.f273696a.a(this.f445310d, this.f445311e);
        this.f445313g.J();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/asyncitem/ChattingItemText$ChattingItemTextFrom$Companion$initAutoTranslationTail$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
