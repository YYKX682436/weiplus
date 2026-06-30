package pk2;

/* loaded from: classes3.dex */
public final class t8 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.d9 f356268d;

    public t8(pk2.d9 d9Var) {
        this.f356268d = d9Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        kn0.g gVar;
        r45.ka4 ka4Var;
        pk2.d9 d9Var = this.f356268d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = d9Var.f355660c;
        java.lang.String str = null;
        if (k0Var != null) {
            k0Var.o(null);
        }
        g4Var.clear();
        pk2.o9 o9Var = d9Var.f355680w;
        java.lang.String str2 = o9Var.f356072a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prepareVisitorMenuItems: objectId:");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) o9Var.c(mm2.c1.class)).f328846n;
        sb6.append(finderObject != null ? java.lang.Long.valueOf(finderObject.getId()) : null);
        sb6.append(", haveJoinLive:");
        sb6.append(((mm2.c1) o9Var.c(mm2.c1.class)).S);
        sb6.append(", hlsUrl:");
        kn0.i iVar = ((mm2.e1) o9Var.c(mm2.e1.class)).f328990t;
        if (iVar != null && (gVar = iVar.f309558b) != null && (ka4Var = gVar.f309548o) != null) {
            str = ka4Var.f378559z;
        }
        sb6.append(str);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        java.util.Iterator it = ((java.util.ArrayList) d9Var.f355671n).iterator();
        while (it.hasNext()) {
            ((qk2.h) it.next()).w(g4Var);
        }
    }
}
