package df2;

/* loaded from: classes3.dex */
public final class iu extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.ju f230429b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu(df2.ju juVar, java.lang.Class cls) {
        super(cls);
        this.f230429b = juVar;
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.da4 da4Var;
        r45.lu1 result = (r45.lu1) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        java.util.LinkedList<r45.yd5> list = result.getList(0);
        if (list != null) {
            for (r45.yd5 yd5Var : list) {
                if (yd5Var.getLong(0) == 1) {
                    r45.w30 w30Var = (r45.w30) yd5Var.getCustom(4);
                    if (w30Var != null && w30Var.getLong(0) == 1) {
                        r45.w30 w30Var2 = (r45.w30) yd5Var.getCustom(4);
                        boolean z17 = (w30Var2 == null || (da4Var = (r45.da4) w30Var2.getCustom(1)) == null || da4Var.getLong(0) != 1) ? false : true;
                        com.tencent.mars.xlog.Log.i("FinderLiveSharePromptTipsController", "#startPolling wording=" + yd5Var.getString(1) + " duration=" + yd5Var.getInteger(3) + ", needRedDot=" + z17);
                        pm0.v.X(new df2.hu(this.f230429b, z17, yd5Var));
                    }
                }
            }
        }
    }
}
