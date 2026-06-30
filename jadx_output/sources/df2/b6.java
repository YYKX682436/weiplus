package df2;

/* loaded from: classes3.dex */
public final class b6 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.d6 f229781a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMSwitchBtn f229782b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f229783c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f229784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerView f229785e;

    public b6(df2.d6 d6Var, com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn, android.content.Context context, java.util.ArrayList arrayList, com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView) {
        this.f229781a = d6Var;
        this.f229782b = mMSwitchBtn;
        this.f229783c = context;
        this.f229784d = arrayList;
        this.f229785e = wxRecyclerView;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.GestureEffectAnchorSettingController", "switchBtn click, " + z17);
        if (z17 != df2.d6.f229944n.c(this.f229781a.getStore().getLiveRoomData())) {
            this.f229782b.setEnabled(false);
            df2.d6 d6Var = this.f229781a;
            com.tencent.mm.plugin.finder.live.util.y.d(d6Var, null, null, new df2.a6(this.f229783c, d6Var, z17, this.f229782b, this.f229784d, this.f229785e, null), 3, null);
        }
    }
}
