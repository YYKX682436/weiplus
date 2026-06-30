package xe5;

/* loaded from: classes3.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe5.f f454013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f454014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454015f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f454016g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f454017h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f454018i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ xe5.i f454019m;

    public e(xe5.f fVar, yb5.d dVar, java.lang.String str, java.util.Map map, java.lang.String str2, long j17, long j18, xe5.i iVar) {
        this.f454013d = fVar;
        this.f454014e = dVar;
        this.f454015f = str;
        this.f454016g = map;
        this.f454017h = j17;
        this.f454018i = j18;
        this.f454019m = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveGameTeamUpNotifyTmpl$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f454014e.g(), 1, false);
        xe5.f fVar = this.f454013d;
        fVar.f454027a = k0Var;
        boolean z17 = xe5.g0.f454026g.getBoolean(this.f454015f + "_game_team", false);
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = fVar.f454027a;
        kotlin.jvm.internal.o.d(k0Var2);
        k0Var2.f211872n = new xe5.a(z17, fVar, this.f454016g, ".msg.appmsg.extinfo.notifymsg");
        com.tencent.mm.ui.widget.dialog.k0 k0Var3 = fVar.f454027a;
        kotlin.jvm.internal.o.d(k0Var3);
        xe5.f fVar2 = this.f454013d;
        k0Var3.f211881s = new xe5.d(fVar2, this.f454015f, this.f454017h, this.f454014e, this.f454018i, this.f454019m);
        com.tencent.mm.ui.widget.dialog.k0 k0Var4 = fVar2.f454027a;
        if (k0Var4 != null) {
            k0Var4.v();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveGameTeamUpNotifyTmpl$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
