package iy;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f295679d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context) {
        super(0);
        this.f295679d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.MMActivity b17 = ly.g.b(this.f295679d);
        if (b17 != null) {
            b17.finish();
        }
        return jz5.f0.f302826a;
    }
}
