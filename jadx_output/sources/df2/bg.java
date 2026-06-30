package df2;

/* loaded from: classes3.dex */
public final class bg extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ug f229799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f229800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f229801f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xs2.p0 f229802g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f229803h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(df2.ug ugVar, dk2.zf zfVar, android.view.View view, xs2.p0 p0Var, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore) {
        super(1);
        this.f229799d = ugVar;
        this.f229800e = zfVar;
        this.f229801f = view;
        this.f229802g = p0Var;
        this.f229803h = liveRoomControllerStore;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        df2.ug ugVar = this.f229799d;
        com.tencent.mars.xlog.Log.i(ugVar.f231522m, "choose popupType:" + intValue + '!');
        if (intValue == 165 || intValue == 166) {
            df2.dg.a(ugVar, this.f229803h, this.f229800e, this.f229801f, this.f229802g);
        }
        return jz5.f0.f302826a;
    }
}
