package dz4;

/* loaded from: classes12.dex */
public final class i2 extends dz4.d2 {
    @Override // dz4.z1
    public void b(dz4.g2 context) {
        kotlin.jvm.internal.o.g(context, "context");
        f(context);
    }

    @Override // dz4.z1
    public boolean c(dz4.g2 context) {
        kotlin.jvm.internal.o.g(context, "context");
        return context.f245256c.f245290a == 5;
    }

    @Override // dz4.d2
    public dc5.a d(java.lang.String msgXml, dz4.a2 forwardData, dz4.g2 context) {
        kotlin.jvm.internal.o.g(msgXml, "msgXml");
        kotlin.jvm.internal.o.g(forwardData, "forwardData");
        kotlin.jvm.internal.o.g(context, "context");
        dc5.a d17 = super.d(msgXml, forwardData, context);
        int i17 = d17.f43702d;
        dz4.i iVar = context.f245256c;
        dz4.f fVar = iVar instanceof dz4.f ? (dz4.f) iVar : null;
        if (fVar != null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                d17.set(i17 + 0, java.lang.Long.valueOf(java.lang.Long.parseLong(fVar.f245232m)));
                kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            d17.set(i17 + 1, fVar.f245233n);
        }
        return d17;
    }
}
