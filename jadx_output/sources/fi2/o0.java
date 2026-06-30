package fi2;

/* loaded from: classes10.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi2.x0 f262891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262892e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f262893f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(fi2.x0 x0Var, java.lang.String str, boolean z17) {
        super(0);
        this.f262891d = x0Var;
        this.f262892e = str;
        this.f262893f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fi2.x0 x0Var = this.f262891d;
        int childCount = x0Var.f262929g.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = x0Var.f262929g.getChildAt(i17);
            if (childAt != null && (childAt instanceof wj2.c0)) {
                wj2.c0 c0Var = (wj2.c0) childAt;
                km2.q curBindLinkMicUser = c0Var.getCurBindLinkMicUser();
                if (kotlin.jvm.internal.o.b(curBindLinkMicUser != null ? curBindLinkMicUser.f309170a : null, this.f262892e)) {
                    c0Var.d0(this.f262893f);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
