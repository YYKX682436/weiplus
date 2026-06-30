package gv2;

/* loaded from: classes8.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f276065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f276066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gv2.w f276067f;

    public r(in5.s0 s0Var, java.lang.String str, gv2.w wVar) {
        this.f276065d = s0Var;
        this.f276066e = str;
        this.f276067f = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f276065d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        iv2.a aVar = ((com.tencent.mm.plugin.finder.uniComments.o0) this.f276067f.f276087e).f130328m;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        java.lang.String userName = this.f276066e;
        kotlin.jvm.internal.o.g(userName, "userName");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", userName);
        java.lang.String str = aVar.f295118a;
        if (str == null) {
            str = "";
        }
        intent.putExtra("key_text_status_comment_id", str);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 60);
        j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
