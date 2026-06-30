package pi2;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi2.n f354776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f354777e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(pi2.n nVar, long j17) {
        super(0);
        this.f354776d = nVar;
        this.f354777e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pi2.n nVar = this.f354776d;
        fg2.u0 u0Var = nVar.R;
        if (u0Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        u0Var.f262348f.setVisibility(0);
        fg2.u0 u0Var2 = nVar.R;
        if (u0Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        long j17 = this.f354777e;
        u0Var2.f262345c.setText(java.lang.String.valueOf(j17));
        fg2.u0 u0Var3 = nVar.R;
        if (u0Var3 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        u0Var3.f262352j.setVisibility(8);
        ((mm2.c1) nVar.H.a(mm2.c1.class)).w8(j17);
        nVar.f0();
        oi2.a aVar = nVar.K;
        long j18 = aVar != null ? aVar.f345613d : 0;
        android.content.Context context = nVar.f118183e;
        if (j17 >= j18) {
            fg2.u0 u0Var4 = nVar.R;
            if (u0Var4 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            u0Var4.f262350h.setText(context.getResources().getString(com.tencent.mm.R.string.mmx));
            fg2.u0 u0Var5 = nVar.R;
            if (u0Var5 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            u0Var5.f262349g.setVisibility(0);
            fg2.u0 u0Var6 = nVar.R;
            if (u0Var6 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            u0Var6.f262353k.setVisibility(8);
        } else {
            fg2.u0 u0Var7 = nVar.R;
            if (u0Var7 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            u0Var7.f262350h.setText(context.getResources().getString(com.tencent.mm.R.string.mmo));
            fg2.u0 u0Var8 = nVar.R;
            if (u0Var8 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            u0Var8.f262349g.setVisibility(8);
            fg2.u0 u0Var9 = nVar.R;
            if (u0Var9 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            u0Var9.f262353k.setVisibility(0);
        }
        return jz5.f0.f302826a;
    }
}
