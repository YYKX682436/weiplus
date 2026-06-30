package com.tencent.mm.storage;

/* loaded from: classes4.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.u f195284d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.storage.u uVar) {
        super(0);
        this.f195284d = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.storage.u uVar = this.f195284d;
        uVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        l75.k0 k0Var = uVar.f195344d;
        android.database.Cursor B = k0Var.B("SELECT count(*) FROM BizAdInfo", null);
        if (B != null) {
            r4 = B.moveToFirst() ? B.getInt(0) : 0;
            B.close();
        }
        if (r4 > 100) {
            java.lang.String format = java.lang.String.format("DELETE FROM %s WHERE %s IN ( SELECT %s FROM %s ORDER BY %s LIMIT %d )", java.util.Arrays.copyOf(new java.lang.Object[]{"BizAdInfo", "aId", "aId", "BizAdInfo", "exposeTime", 50}, 6));
            kotlin.jvm.internal.o.f(format, "format(...)");
            k0Var.A("BizAdInfo", format);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAdInfoStorage", "deleteTooOldData delete cost: %d, count: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(r4));
        }
        return jz5.f0.f302826a;
    }
}
