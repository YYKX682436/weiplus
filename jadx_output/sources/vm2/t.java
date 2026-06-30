package vm2;

/* loaded from: classes3.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vm2.v f438116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f62 f438117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.rk6 f438118f;

    public t(vm2.v vVar, r45.f62 f62Var, r45.rk6 rk6Var) {
        this.f438116d = vVar;
        this.f438117e = f62Var;
        this.f438118f = rk6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.live.widget.rx rxVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskCardAdapter$onBindViewHolder$7$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.dd ddVar = df2.od.f230952w;
        vm2.v vVar = this.f438116d;
        gk2.e liveRoomData = vVar.f438120d.getLiveRoomData();
        r45.f62 f62Var = this.f438117e;
        java.lang.String string = f62Var.getString(0);
        r45.rk6 rk6Var = this.f438118f;
        ddVar.a(liveRoomData, 2, 5, string, java.lang.Integer.valueOf(rk6Var.getInteger(1)));
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = (com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData) ((jz5.n) vVar.f438121e).getValue();
        if (liveMutableData != null) {
            java.lang.String string2 = f62Var.getString(0);
            if (string2 == null) {
                string2 = "";
            }
            liveMutableData.postValue(new jz5.l(rk6Var, string2));
        }
        df2.od odVar = (df2.od) vVar.f438120d.controller(df2.od.class);
        if (odVar != null && (rxVar = odVar.f230954n) != null) {
            com.tencent.mm.plugin.finder.live.widget.e0.t(rxVar, false, 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveTaskCardAdapter$onBindViewHolder$7$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
