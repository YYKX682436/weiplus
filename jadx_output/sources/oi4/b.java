package oi4;

/* loaded from: classes11.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj4.a f345623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f345624e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345625f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oi4.c f345626g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f345627h;

    public b(kj4.a aVar, kotlin.jvm.internal.h0 h0Var, java.lang.String str, oi4.c cVar, android.content.Context context) {
        this.f345623d = aVar;
        this.f345624e = h0Var;
        this.f345625f = str;
        this.f345626g = cVar;
        this.f345627h = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/like/CommentHistoryItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kj4.a aVar = this.f345623d;
        mj4.e eVar = aVar.f308451d;
        int i17 = eVar.field_HasBeenDeleted;
        kotlin.jvm.internal.h0 h0Var = this.f345624e;
        if (i17 == 1) {
            h0Var.f310123d = "";
        }
        java.lang.String str = eVar.field_TextStatusOwnerUserName;
        boolean b17 = str == null ? false : kotlin.jvm.internal.o.b(str, en1.a.a());
        oi4.c cVar = this.f345626g;
        java.lang.String statusId = this.f345625f;
        if (b17) {
            si4.a G = ai4.m0.f5173a.G();
            kotlin.jvm.internal.o.f(statusId, "$statusId");
            mj4.h t17 = G.t(statusId);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("item onClick self, ");
            sb6.append(statusId);
            sb6.append(", exist=");
            sb6.append(t17 != null);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.CommentHistoryItemConvert", sb6.toString());
            if (t17 != null) {
                java.lang.String field_TextStatusOwnerUserName = aVar.f308451d.field_TextStatusOwnerUserName;
                kotlin.jvm.internal.o.f(field_TextStatusOwnerUserName, "field_TextStatusOwnerUserName");
                cVar.n(field_TextStatusOwnerUserName, t17, (java.lang.String) h0Var.f310123d);
            } else {
                android.content.Context context = this.f345627h;
                kotlin.jvm.internal.o.f(context, "$context");
                java.lang.String field_TextStatusId = aVar.f308451d.field_TextStatusId;
                kotlin.jvm.internal.o.f(field_TextStatusId, "field_TextStatusId");
                cVar.p(context, field_TextStatusId, (java.lang.String) h0Var.f310123d);
            }
        } else {
            si4.a G2 = ai4.m0.f5173a.G();
            kotlin.jvm.internal.o.f(statusId, "$statusId");
            mj4.h t18 = G2.t(statusId);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("item onClick owner=");
            sb7.append(aVar.f308451d.field_TextStatusOwnerUserName);
            sb7.append(", ");
            sb7.append(statusId);
            sb7.append(", exist=");
            sb7.append(t18 != null);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.CommentHistoryItemConvert", sb7.toString());
            if (t18 == null) {
                cVar.o(cVar.f345646f);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("textstatus_expire_cannot_view_toast", "view_exp", new java.util.HashMap(), 28809);
            } else {
                java.lang.String field_TextStatusOwnerUserName2 = aVar.f308451d.field_TextStatusOwnerUserName;
                kotlin.jvm.internal.o.f(field_TextStatusOwnerUserName2, "field_TextStatusOwnerUserName");
                cVar.n(field_TextStatusOwnerUserName2, t18, (java.lang.String) h0Var.f310123d);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.CommentHistoryItemConvert", "onBindViewHolder: refCommentId:" + ((java.lang.String) h0Var.f310123d) + ' ');
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/like/CommentHistoryItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
