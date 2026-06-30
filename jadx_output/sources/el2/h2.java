package el2;

/* loaded from: classes3.dex */
public final class h2 extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ el2.i2 f253807b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(el2.i2 i2Var, java.lang.Class cls) {
        super(cls);
        this.f253807b = i2Var;
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.f52 f52Var;
        r45.rc2 result = (r45.rc2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        el2.i2 i2Var = this.f253807b;
        com.tencent.mars.xlog.Log.i(i2Var.f253829m, "[startPollingPromoteInfo] resp = " + pm0.b0.g(result));
        ((mm2.f6) i2Var.business(mm2.f6.class)).N = result.getByteString(6);
        int integer = result.getInteger(0);
        java.lang.String str = i2Var.f253829m;
        if (integer == 1) {
            com.tencent.mars.xlog.Log.i(str, "[startPollingPromoteInfo] return sync no op");
            return;
        }
        if (result.getBoolean(7)) {
            pm0.v.X(new el2.g2(result, i2Var));
        }
        if (result.getInteger(1) == 0) {
            so2.j5 j5Var = ((mm2.f6) i2Var.business(mm2.f6.class)).f329049w;
            cm2.t tVar = j5Var instanceof cm2.t ? (cm2.t) j5Var : null;
            if (tVar != null) {
                com.tencent.mars.xlog.Log.i(str, "[startPollingPromoteInfo] notify to del, currentInfo:" + pm0.b0.g(tVar.b()));
                if (result.getLong(4) == 0 || result.getLong(4) != tVar.f43385d) {
                    com.tencent.mars.xlog.Log.i(str, "[startPollingPromoteInfo] notify to del but return, currentInfo:" + pm0.b0.g(tVar.b()) + ",svrCurrentPromoteId:" + result.getLong(4));
                    return;
                }
                mm2.f6 f6Var = (mm2.f6) i2Var.business(mm2.f6.class);
                r45.f52 f52Var2 = (r45.f52) result.getCustom(3);
                f6Var.M = f52Var2 != null ? f52Var2.getByteString(6) : null;
                qo0.b bVar = qo0.b.O2;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("PARAM_FINDER_LIVE_PROMOTE_DELETE_BY_ANCHOR", true);
                i2Var.X6(bVar, bundle);
                return;
            }
            return;
        }
        if (result.getInteger(2) <= 0 || (f52Var = (r45.f52) result.getCustom(3)) == null) {
            return;
        }
        long j17 = ((mm2.f6) i2Var.business(mm2.f6.class)).L;
        com.tencent.mars.xlog.Log.i(str, "[startPollingPromoteInfo] notify to replace, promoteIdHideByVisitor:" + j17 + ", currentInfo:" + pm0.b0.g(result));
        if (f52Var.getLong(4) != j17 || !kotlin.jvm.internal.o.b(f52Var.getString(13), result.getString(5))) {
            qo0.b bVar2 = qo0.b.N2;
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.toByteArray());
            i2Var.X6(bVar2, bundle2);
            return;
        }
        mm2.f6 f6Var2 = (mm2.f6) i2Var.business(mm2.f6.class);
        zl2.r4 r4Var = zl2.r4.f473950a;
        byte[] byteArray = f52Var.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        f6Var2.c7(r4Var.I2(byteArray));
        com.tencent.mars.xlog.Log.i(str, "[startPollingPromoteInfo] promoteIdHideByVisitor(" + j17 + ") == new_promote_info.id:(" + f52Var.getLong(4) + "), local sub_id(it.sub_id) == resp.sub_id(" + result.getString(5) + "), only update data ");
    }
}
