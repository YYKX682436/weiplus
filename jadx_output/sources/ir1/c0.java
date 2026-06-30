package ir1;

/* loaded from: classes11.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.u f293944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir1.e0 f293945e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f293946f;

    public c0(ir1.u uVar, ir1.e0 e0Var, android.view.View view) {
        this.f293944d = uVar;
        this.f293945e = e0Var;
        this.f293946f = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/ui/BizFansConversationAdapter$onCreateViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hr1.e eVar = (hr1.e) this.f293944d.f293125i;
        ir1.v vVar = this.f293945e.f293966p;
        if (vVar != null) {
            android.content.Context context = this.f293946f.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            kotlin.jvm.internal.o.d(eVar);
            ir1.r rVar = (ir1.r) vVar;
            boolean b17 = kotlin.jvm.internal.o.b(eVar.field_sessionId, "bizfansnofiticationholder@bizfansmsg");
            int i17 = rVar.f294039a;
            boolean z17 = false;
            if (b17) {
                yq1.u0.Di().m("bizfansnofiticationholder@bizfansmsg", false);
                ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).getClass();
                kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new vw.d2(i17, context, null), 3, null);
            } else if (kotlin.jvm.internal.o.b(eVar.field_sessionId, "bizphotofansnofiticationholder@picfansmsg")) {
                yq1.u0.Vi().m("bizphotofansnofiticationholder@picfansmsg", false);
                ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).getClass();
                kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new vw.d2(i17, context, null), 3, null);
            } else {
                java.lang.String str = eVar.field_sessionId;
                if (!(str == null || str.length() == 0) && (kotlin.jvm.internal.o.b(str, "bizfansgreetholder@bizfansmsg") || kotlin.jvm.internal.o.b(str, "bizphotofansgreetholder@picfansmsg"))) {
                    z17 = true;
                }
                if (z17) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("serviceType", i17);
                    j45.l.j(context, "brandservice", ".conversation.ui.BizFansGreetBoxUI", intent, null);
                } else {
                    wn.t tVar = rVar.f294040b;
                    if (tVar != null) {
                        java.lang.String str2 = eVar.field_sessionId;
                        java.lang.String str3 = eVar.field_selfBiz;
                        rb5.l lVar = (rb5.l) tVar;
                        lVar.f393899z = com.tencent.mm.plugin.brandservice.ui.chatting.component.ChattingBizFansComponent.class;
                        lVar.l(str2, str3, null, null);
                    }
                    yz5.l lVar2 = rVar.f294041c;
                    if (lVar2 != null) {
                        lVar2.invoke(eVar);
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansConversationAdapter$onCreateViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
