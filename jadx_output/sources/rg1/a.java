package rg1;

/* loaded from: classes7.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sg1.e f395204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f395205e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sg1.e eVar, boolean z17) {
        super(0);
        this.f395204d = eVar;
        this.f395205e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WxaPkg path from OpenSdk accepted appId[");
        sg1.e eVar = this.f395204d;
        sb6.append(eVar.f388073d);
        sb6.append("] key[");
        sb6.append(eVar.f388074e);
        sb6.append("] type[");
        sb6.append(eVar.f388075f);
        sb6.append("] version[");
        sb6.append(eVar.f388076g);
        sb6.append("] zstd?[");
        sb6.append(this.f395205e);
        sb6.append(']');
        dp.a.makeText(context, sb6.toString(), 0).show();
        return jz5.f0.f302826a;
    }
}
