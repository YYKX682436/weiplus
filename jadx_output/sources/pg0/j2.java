package pg0;

@j95.b(dependencies = {com.tencent.mm.plugin.zero.s0.class})
/* loaded from: classes9.dex */
public class j2 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public volatile at4.p1 f354010d;

    public j2() {
        if (at4.p1.f13925a == null) {
            at4.p1.f13925a = new at4.p1();
        }
        this.f354010d = at4.p1.f13925a;
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        this.f354010d.getClass();
        java.util.ArrayList arrayList = at4.p1.f13926b;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        fp.d0.o("tenpay_utils");
        com.tencent.mm.wallet_core.model.j.b().e(com.tencent.mm.sdk.platformtools.x2.f193071a);
        q25.b.b(new pg0.i2(), "//cleanpaycn");
    }
}
