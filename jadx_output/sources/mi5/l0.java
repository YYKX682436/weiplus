package mi5;

/* loaded from: classes9.dex */
public final class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dc5.a f326874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f326875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l15.c f326876f;

    public l0(dc5.a aVar, android.content.Context context, l15.c cVar) {
        this.f326874d = aVar;
        this.f326875e = context;
        this.f326876f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingNoteView$onUpdateViewModel$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dc5.a aVar = this.f326874d;
        long j17 = aVar.getLong(aVar.f43702d + 0);
        android.content.Context context = this.f326875e;
        if (j17 > 0) {
            com.tencent.mm.autogen.events.OpenNoteFromSessionEvent openNoteFromSessionEvent = new com.tencent.mm.autogen.events.OpenNoteFromSessionEvent();
            am.sn snVar = openNoteFromSessionEvent.f54599g;
            snVar.f7906c = context;
            snVar.f7904a = aVar.getLong(aVar.f43702d + 0);
            openNoteFromSessionEvent.f54599g.f7909f = aVar.getString(aVar.f43702d + 1);
            am.sn snVar2 = openNoteFromSessionEvent.f54599g;
            snVar2.f7907d = false;
            v05.b k17 = this.f326876f.k();
            snVar2.f7905b = k17 != null ? k17.getString(k17.f432315e + 44) : null;
            openNoteFromSessionEvent.f54599g.f7910g = 6;
            openNoteFromSessionEvent.e();
        } else if (aVar.j() > 0) {
            o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(aVar.j());
            o72.l4 l4Var = (o72.l4) i95.n0.c(o72.l4.class);
            r45.dq0 dq0Var = new r45.dq0();
            ((x82.i) l4Var).getClass();
            x82.k0.d(context, F, true, 1, dq0Var);
        }
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingNoteView$onUpdateViewModel$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
