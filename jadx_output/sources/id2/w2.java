package id2;

/* loaded from: classes2.dex */
public final class w2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl0.g f290866d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(cl0.g gVar) {
        super(1);
        this.f290866d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.d03 d03Var;
        com.tencent.mm.protobuf.g gVar;
        com.tencent.mm.plugin.finder.extension.reddot.a it = (com.tencent.mm.plugin.finder.extension.reddot.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (it.f105327a) {
            r45.f03 f03Var = it.f105328b;
            if (f03Var != null && f03Var.f373894n == 9) {
                byte[] g17 = (f03Var == null || (gVar = f03Var.f373895o) == null) ? null : gVar.g();
                if (g17 != null) {
                    d03Var = new r45.d03();
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        kotlin.Result.m521constructorimpl(d03Var.parseFrom(g17));
                    } catch (java.lang.Throwable th6) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                    }
                } else {
                    d03Var = new r45.d03();
                }
                java.lang.String r07 = com.tencent.mm.sdk.platformtools.t8.r0(d03Var.getLong(0));
                if (r07 == null) {
                    r07 = "";
                }
                cl0.g gVar2 = this.f290866d;
                gVar2.h("objectId", r07);
                java.lang.String string = d03Var.getString(1);
                gVar2.h("exportId", string != null ? string : "");
            }
        }
        return jz5.f0.f302826a;
    }
}
