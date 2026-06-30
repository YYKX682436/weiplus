package pk2;

/* loaded from: classes3.dex */
public final class p8 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.d9 f356168d;

    public p8(pk2.d9 d9Var) {
        this.f356168d = d9Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        kn0.g gVar;
        r45.ka4 ka4Var;
        g4Var.clear();
        pk2.d9 d9Var = this.f356168d;
        pk2.o9 o9Var = d9Var.f355680w;
        java.lang.String str = o9Var.f356072a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prepareAnchorZeroMenuItems: business(LiveCommonSlice::class.java).liveFinderObject.id:");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) o9Var.c(mm2.c1.class)).f328846n;
        java.lang.String str2 = null;
        sb6.append(finderObject != null ? java.lang.Long.valueOf(finderObject.getId()) : null);
        sb6.append(" hlsUrl:");
        kn0.i iVar = ((mm2.e1) o9Var.c(mm2.e1.class)).f328990t;
        if (iVar != null && (gVar = iVar.f309558b) != null && (ka4Var = gVar.f309548o) != null) {
            str2 = ka4Var.f378559z;
        }
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        java.util.Iterator it = ((java.util.ArrayList) d9Var.f355670m).iterator();
        while (it.hasNext()) {
            ((qk2.h) it.next()).w(g4Var);
        }
    }
}
