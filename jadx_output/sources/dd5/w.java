package dd5;

/* loaded from: classes9.dex */
public final class w extends uc5.b0 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.w f229322p = new dd5.w();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w() {
        super(dd5.z.f229348c);
        dd5.z.f229347b.getClass();
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.y yVar = (dd5.y) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (yVar == null) {
            return;
        }
        android.widget.TextView d17 = binding.d();
        kotlin.jvm.internal.o.f(d17, "getTitleTv(...)");
        z(d17, context, yVar.f229336a);
        android.widget.TextView b17 = binding.b();
        kotlin.jvm.internal.o.f(b17, "getDescTv(...)");
        z(b17, context, yVar.f229337b);
        binding.c().setImageResource(yVar.f229338c);
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.y yVar = (dd5.y) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (yVar == null) {
            return;
        }
        ((j00.k1) ((c00.e3) i95.n0.c(c00.e3.class))).uj(context, yVar.f229339d, null);
    }

    @Override // uc5.n
    public java.lang.Object w(android.content.Context context, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        w05.e eVar;
        java.lang.String x17;
        java.lang.String U1 = f9Var.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return null;
        }
        v05.b bVar = new v05.b();
        bVar.fromXml(U1);
        w05.d dVar = (w05.d) bVar.getCustom(bVar.f432315e + 66);
        if (dVar == null) {
            return null;
        }
        java.util.LinkedList s17 = dVar.s();
        if ((s17 == null || s17.isEmpty()) || (eVar = (w05.e) dVar.s().getFirst()) == null) {
            return null;
        }
        int integer = bVar.getInteger(bVar.f368365d + 6);
        long l17 = eVar.l();
        int i17 = h20.b.f278262a;
        int i18 = l17 == 0 ? com.tencent.mm.R.raw.blue_envelope_default_regular : com.tencent.mm.R.raw.blue_envelope_disable_regular;
        java.lang.String C = dVar.C();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(eVar.x())) {
            x17 = eVar.x();
        } else if (integer == 115) {
            x17 = context.getString(com.tencent.mm.R.string.f492168o45);
        } else if (integer != 124) {
            x17 = "";
        } else {
            int B = dVar.B();
            int i19 = h20.h.f278268a;
            x17 = B == 0 ? context.getString(com.tencent.mm.R.string.f492167o44) : B == 1 ? context.getString(com.tencent.mm.R.string.f492169o46) : context.getString(com.tencent.mm.R.string.f492168o45);
        }
        kotlin.jvm.internal.o.d(x17);
        return new dd5.y(C, x17, i18, f9Var);
    }
}
