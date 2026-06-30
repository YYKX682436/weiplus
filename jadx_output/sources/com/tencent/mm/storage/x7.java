package com.tencent.mm.storage;

/* loaded from: classes8.dex */
public final class x7 extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.storage.x7 f196331d = new com.tencent.mm.storage.x7();

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f196332e = {"*", "rowid"};

    /* renamed from: f, reason: collision with root package name */
    public static final l75.k0 f196333f;

    static {
        l75.k0 k0Var = gm0.j1.u().f273153f;
        kotlin.jvm.internal.o.d(k0Var);
        f196333f = k0Var;
    }

    public x7() {
        super(gm0.j1.u().f273153f, qk.h6.f364150p1, "FunctionMsgItem", new java.lang.String[]{"CREATE INDEX IF NOT EXISTS functionIdIndex ON FunctionMsgItem(functionmsgid)"});
    }

    public final qk.h6 y0(java.lang.String functionMsgId) {
        kotlin.jvm.internal.o.g(functionMsgId, "functionMsgId");
        if (com.tencent.mm.sdk.platformtools.t8.K0(functionMsgId)) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgStorage", "getByFunctionMsgId, functionMsgId: %s", functionMsgId);
        android.database.Cursor D = f196333f.D("FunctionMsgItem", f196332e, "functionmsgid=?", new java.lang.String[]{functionMsgId}, null, null, null, 2);
        try {
            kotlin.jvm.internal.o.d(D);
            if (!D.moveToFirst()) {
                vz5.b.a(D, null);
                return null;
            }
            qk.h6 h6Var = new qk.h6();
            h6Var.convertFrom(D);
            vz5.b.a(D, null);
            return h6Var;
        } finally {
        }
    }

    public final void z0(java.lang.String functionMsgId, qk.h6 newFunctionMsgItem) {
        r45.j4 j4Var;
        kotlin.jvm.internal.o.g(functionMsgId, "functionMsgId");
        kotlin.jvm.internal.o.g(newFunctionMsgItem, "newFunctionMsgItem");
        com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgStorage", "updateByFunctionMsgId, functionMsgId: %s", functionMsgId);
        qk.h6 y07 = y0(functionMsgId);
        if (y07 != null) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = functionMsgId;
                objArr[1] = java.lang.Boolean.valueOf(newFunctionMsgItem.field_addMsg == null);
                objArr[2] = java.lang.Boolean.valueOf(y07.field_addMsg == null);
                com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgStorage", "updateByFunctionMsgId, functionMsgId: %s, newFunctionMsgItem.msgContent==null: %s,oldFunctionMsgItem.msgContent==null: %s", objArr);
                android.content.ContentValues convertTo = newFunctionMsgItem.convertTo();
                if (convertTo.get("addMsg") == null && (j4Var = y07.field_addMsg) != null) {
                    kotlin.jvm.internal.o.d(j4Var);
                    convertTo.put("addMsg", j4Var.toByteArray());
                }
                com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgStorage", "updateByFunctionMsgId, ret: %s", java.lang.Integer.valueOf(f196333f.p("FunctionMsgItem", convertTo, "functionmsgid=?", new java.lang.String[]{functionMsgId})));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("FunctionMsg.FunctionMsgStorage", "updateByFunctionMsgId error: %s", e17.getMessage());
            }
        }
    }
}
