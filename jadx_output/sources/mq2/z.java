package mq2;

/* loaded from: classes2.dex */
public final class z implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public static final mq2.z f330769d = new mq2.z();

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            g4Var.a(1, com.tencent.mm.R.string.f492628h74);
            g4Var.a(2, com.tencent.mm.R.string.f492629h75);
            g4Var.a(3, com.tencent.mm.R.string.f492626h72);
            g4Var.a(4, com.tencent.mm.R.string.h76);
            g4Var.a(5, com.tencent.mm.R.string.f492627h73);
        }
        com.tencent.mars.xlog.Log.i("NearbyPersonUIC", "showLiveBottomSheet create menu.");
    }
}
