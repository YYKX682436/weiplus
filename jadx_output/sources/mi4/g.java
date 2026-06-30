package mi4;

/* loaded from: classes9.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f326784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mj4.w f326785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f326786f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hi4.e f326787g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mi4.h f326788h;

    public g(boolean z17, mj4.w wVar, android.content.Context context, hi4.e eVar, mi4.h hVar) {
        this.f326784d = z17;
        this.f326785e = wVar;
        this.f326786f = context;
        this.f326787g = eVar;
        this.f326788h = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/conversation/ui/TextStatusProfileBottomDialog$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f326784d;
        mj4.w wVar = this.f326785e;
        mi4.h hVar = this.f326788h;
        android.content.Context context = this.f326786f;
        if (z17) {
            ((ki4.x) i95.n0.c(ki4.x.class)).Di(wVar.field_sessionId, wVar.field_userName, context);
        } else {
            hi4.k kVar = hi4.m.f281555f;
            fi4.c cVar = null;
            hi4.e eVar = this.f326787g;
            java.lang.String str = eVar != null ? eVar.field_session_id : null;
            if (str == null) {
                str = "";
            }
            kVar.d(str, 105);
            if (eVar != null) {
                ki4.x xVar = (ki4.x) i95.n0.c(ki4.x.class);
                androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
                mi4.f fVar = new mi4.f(hVar, wVar, context);
                xVar.getClass();
                if (eVar != null) {
                    pj4.n0 n0Var = new pj4.n0();
                    n0Var.f355194e = eVar.field_tag;
                    n0Var.f355195f = eVar.field_source_id;
                    n0Var.f355197h = eVar.field_status_id;
                    n0Var.f355198i = eVar.field_modify_count;
                    n0Var.f355196g = eVar.field_card_key;
                    n0Var.f355193d = 1;
                    cVar = new fi4.c(eVar);
                    com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
                    kotlin.jvm.internal.o.f(d17, "getNetSceneQueue(...)");
                    ii4.a.a(d17, cVar, yVar, new ki4.w(cVar, fVar));
                }
                android.content.Context context2 = this.f326786f;
                hVar.L = db5.e1.Q(context2, context2.getString(com.tencent.mm.R.string.jw7), context.getString(com.tencent.mm.R.string.jw7), false, true, new mi4.d(cVar));
            }
        }
        hVar.B();
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/conversation/ui/TextStatusProfileBottomDialog$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
