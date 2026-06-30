package ot0;

/* loaded from: classes12.dex */
public abstract class d3 {
    public static final com.tencent.wcdb.core.Database a(l75.k0 k0Var) {
        kotlin.jvm.internal.o.e(k0Var, "null cannot be cast to non-null type com.tencent.mm.storagebase.SQLiteWrapper");
        com.tencent.wcdb.core.Database innerDB = ((d95.z) k0Var).f227718a.getInnerDB();
        kotlin.jvm.internal.o.f(innerDB, "getInnerDB(...)");
        return innerDB;
    }

    public static final com.tencent.wcdb.winq.Expression b(com.tencent.wcdb.winq.Expression expression, boolean z17, yz5.a block) {
        kotlin.jvm.internal.o.g(expression, "<this>");
        kotlin.jvm.internal.o.g(block, "block");
        if (z17) {
            expression = expression.and((com.tencent.wcdb.winq.ExpressionConvertible) block.invoke());
        }
        kotlin.jvm.internal.o.d(expression);
        return expression;
    }
}
