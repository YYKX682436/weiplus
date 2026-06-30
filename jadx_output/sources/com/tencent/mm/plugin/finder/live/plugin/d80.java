package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class d80 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.i80 f112238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cm2.f0 f112239b;

    public d80(com.tencent.mm.plugin.finder.live.plugin.i80 i80Var, cm2.f0 f0Var) {
        this.f112238a = i80Var;
        this.f112239b = f0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.live.plugin.i80 i80Var = this.f112238a;
        kotlinx.coroutines.r2 r2Var = i80Var.f112945o;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = i80Var.f112944n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        int i17 = fVar.f70615a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0 && fVar.f70616b == 0) {
            com.tencent.mm.protobuf.g byteString = ((r45.zs1) fVar.f70618d).getByteString(1);
            if (byteString == null) {
                return null;
            }
            r45.e52 e52Var = new r45.e52();
            e52Var.parseFrom(byteString.g());
            cm2.f0 f0Var2 = this.f112239b;
            f0Var2.getClass();
            f0Var2.f43342v = e52Var;
            ((mm2.f6) i80Var.f112938e.a(mm2.f6.class)).c7(f0Var2);
            java.util.LinkedList list = e52Var.getList(0);
            kotlin.jvm.internal.o.f(list, "getInfos(...)");
            r45.wd5 wd5Var = (r45.wd5) kz5.n0.Z(list);
            if (wd5Var == null) {
                return null;
            }
            i80Var.b(wd5Var.getString(4));
        } else {
            android.content.Context context = i80Var.f112937d;
            db5.t7.g(context, context.getString(com.tencent.mm.R.string.e9p));
        }
        return f0Var;
    }
}
