package vy3;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f441485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f441486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f441487f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.util.HashMap hashMap, nw4.k kVar, nw4.y2 y2Var) {
        super(0);
        this.f441485d = hashMap;
        this.f441486e = kVar;
        this.f441487f = y2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f441485d.put("retCode", 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowAddressPickerView", "showAddressPickerView user cancel");
        this.f441486e.f340863d.e(this.f441487f.f341013c, "showAddressPickerView:cancel", null);
        return jz5.f0.f302826a;
    }
}
