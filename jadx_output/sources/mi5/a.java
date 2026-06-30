package mi5;

/* loaded from: classes9.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi5.b f326789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f326790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x05.c f326791f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fc5.g f326792g;

    public a(mi5.b bVar, android.content.Context context, x05.c cVar, fc5.g gVar) {
        this.f326789d = bVar;
        this.f326790e = context;
        this.f326791f = cVar;
        this.f326792g = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingAppMsgFinderNameCardView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f326790e;
        kotlin.jvm.internal.o.f(context, "$context");
        this.f326789d.getClass();
        android.content.Intent intent = new android.content.Intent();
        fc5.g gVar = this.f326792g;
        java.lang.String string = gVar.getString(gVar.f43702d + 1);
        pt0.e0 e0Var = pt0.f0.f358209b1;
        int i17 = gVar.f43702d;
        com.tencent.mm.storage.f9 k17 = e0Var.k(gVar.getString(i17 + 1), gVar.getLong(i17 + 0));
        if (com.tencent.mm.storage.z3.R4(string)) {
            intent.putExtra("key_finder_teen_mode_scene", 2);
            intent.putExtra("report_scene", 2);
        } else {
            intent.putExtra("key_finder_teen_mode_scene", 1);
            intent.putExtra("report_scene", 1);
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(com.tencent.mm.storage.z3.R4(string) ? 3 : 2, 3, 32, intent);
        intent.putExtra("key_enter_profile_type", 4);
        intent.putExtra("key_entrance_type", 0);
        intent.putExtra("key_from_comment_scene", 11);
        intent.putExtra("from_user", string);
        x05.c cVar = this.f326791f;
        intent.putExtra("key_ec_source", cVar.n());
        intent.putExtra("finder_username", cVar.getUsername());
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_finder_teen_mode_user_name", cVar.getNickname());
        intent.putExtra("key_finder_teen_mode_user_id", cVar.getUsername());
        if (k17 != null) {
            intent.putExtra("key_from_user_name", ki0.a.a(k17));
            intent.putExtra("key_to_user_name", ki0.a.b(k17));
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Bj(intent, k17, new r45.md5());
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f460472a.w(context, intent);
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingAppMsgFinderNameCardView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
