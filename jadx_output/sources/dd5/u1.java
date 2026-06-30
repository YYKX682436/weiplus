package dd5;

/* loaded from: classes9.dex */
public abstract class u1 extends uc5.b0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(ad5.l0[] availableOperation) {
        super(availableOperation);
        kotlin.jvm.internal.o.g(availableOperation, "availableOperation");
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.v1 v1Var = (dd5.v1) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (v1Var == null) {
            return;
        }
        android.widget.TextView d17 = binding.d();
        kotlin.jvm.internal.o.f(d17, "getTitleTv(...)");
        z(d17, context, v1Var.f229310a);
        android.widget.TextView b17 = binding.b();
        kotlin.jvm.internal.o.f(b17, "getDescTv(...)");
        z(b17, context, v1Var.f229311b);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.l0 Di = m11.b1.Di();
        float g17 = i65.a.g(context);
        com.tencent.mm.storage.f9 f9Var = v1Var.f229315f;
        java.lang.String str = v1Var.f229312c;
        android.graphics.Bitmap m07 = Di.m0(f9Var, str, g17, false);
        if (m07 != null && !m07.isRecycled()) {
            binding.c().setImageBitmap(m07);
            return;
        }
        android.graphics.Bitmap Di2 = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(v1Var.f229313d, 1, i65.a.g(context));
        if (Di2 != null && !Di2.isRecycled()) {
            binding.c().setImageBitmap(Di2);
            return;
        }
        java.lang.String b18 = qk.c.b(str, 4, v1Var.f229314e);
        if (b18 == null || r26.n0.N(b18)) {
            A(context, binding, com.tencent.mm.R.raw.link_regular);
            return;
        }
        int b19 = i65.a.b(context, 50);
        gk0.k kVar = new gk0.k(b19, b19);
        kVar.f272434e = com.tencent.mm.R.color.f478490b;
        gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
        com.tencent.mm.ui.chatting.history.widgets.MsgHistoryGalleryIconImageView c17 = binding.c();
        kotlin.jvm.internal.o.f(c17, "getIconIv(...)");
        kotlin.jvm.internal.o.d(b18);
        ((h83.g) n0Var).wi(c17, b18, kVar);
    }

    @Override // uc5.n
    public java.lang.Object w(android.content.Context context, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        java.lang.String U1 = f9Var.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return null;
        }
        v05.b bVar = new v05.b();
        bVar.fromXml(U1);
        int i17 = bVar.f432315e;
        int i18 = i17 + 11;
        java.lang.String v17 = o72.x1.v(context, bVar.getString(i18));
        if (!(!(v17 == null || r26.n0.N(v17)))) {
            v17 = null;
        }
        int i19 = bVar.f368365d;
        if (v17 == null) {
            v17 = bVar.getString(i19 + 3);
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(bVar.getString(i18), true);
        if (n17 == null || !kotlin.jvm.internal.o.b(n17.d1(), bVar.getString(i18))) {
            ((c01.k7) c01.n8.a()).b(bVar.getString(i18), 14, null);
        } else {
            v17 = n17.g2();
            kotlin.jvm.internal.o.f(v17, "getDisplayRemark(...)");
        }
        java.lang.String str = v17;
        r05.g gVar = (r05.g) bVar.getCustom(i17 + 25);
        boolean z17 = gVar != null && bVar.getInteger(i19 + 6) == 5 && gVar.p() == 1 && gVar.o() == 5;
        java.lang.String string = bVar.getString(i19 + 2);
        java.lang.String z07 = f9Var.z0();
        java.lang.String str2 = true ^ (z07 == null || r26.n0.N(z07)) ? z07 : null;
        return new dd5.v1(string, str, str2 == null ? bVar.getString(i17 + 14) : str2, bVar.getString(i19 + 0), z17, f9Var);
    }
}
