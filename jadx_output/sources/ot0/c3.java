package ot0;

/* loaded from: classes12.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f348437a = jz5.h.b(ot0.a3.f348375d);

    public static final ot0.c3 l() {
        return (ot0.c3) ((jz5.n) f348437a).getValue();
    }

    public final boolean a(java.lang.String methodName, yz5.a ormCall, yz5.a sqlCall) {
        kotlin.jvm.internal.o.g(methodName, "methodName");
        kotlin.jvm.internal.o.g(ormCall, "ormCall");
        kotlin.jvm.internal.o.g(sqlCall, "sqlCall");
        if (!ot0.l3.a()) {
            return ((java.lang.Boolean) ormCall.invoke()).booleanValue();
        }
        try {
            boolean booleanValue = ((java.lang.Boolean) sqlCall.invoke()).booleanValue();
            boolean booleanValue2 = ((java.lang.Boolean) ormCall.invoke()).booleanValue();
            if (booleanValue2 != booleanValue) {
                throw ot0.k3.f348566d.a(methodName, booleanValue2 ? 1 : 0, booleanValue ? 1 : 0);
            }
            return booleanValue2;
        } catch (ot0.k3 e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OrmCorrectnessChecker", methodName.concat(": Correctness check failed"), e17);
            m(methodName, e17);
            return ((java.lang.Boolean) ormCall.invoke()).booleanValue();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OrmCorrectnessChecker", methodName.concat(": Unexpected error during correctness check"), e18);
            return ((java.lang.Boolean) ormCall.invoke()).booleanValue();
        }
    }

    public final int b(java.lang.String methodName, yz5.a ormCall, yz5.a sqlCall) {
        kotlin.jvm.internal.o.g(methodName, "methodName");
        kotlin.jvm.internal.o.g(ormCall, "ormCall");
        kotlin.jvm.internal.o.g(sqlCall, "sqlCall");
        if (!ot0.l3.a()) {
            return ((java.lang.Number) ormCall.invoke()).intValue();
        }
        try {
            int intValue = ((java.lang.Number) sqlCall.invoke()).intValue();
            int intValue2 = ((java.lang.Number) ormCall.invoke()).intValue();
            if (intValue2 == intValue) {
                return intValue2;
            }
            throw ot0.k3.f348566d.a(methodName, intValue2, intValue);
        } catch (ot0.k3 e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OrmCorrectnessChecker", methodName.concat(": Correctness check failed"), e17);
            m(methodName, e17);
            return ((java.lang.Number) ormCall.invoke()).intValue();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OrmCorrectnessChecker", methodName.concat(": Unexpected error during correctness check"), e18);
            return ((java.lang.Number) ormCall.invoke()).intValue();
        }
    }

    public final android.database.Cursor c(java.lang.String methodName, yz5.a ormCall, yz5.a sqlCall) {
        kotlin.jvm.internal.o.g(methodName, "methodName");
        kotlin.jvm.internal.o.g(ormCall, "ormCall");
        kotlin.jvm.internal.o.g(sqlCall, "sqlCall");
        if (!ot0.l3.a()) {
            return (android.database.Cursor) ormCall.invoke();
        }
        try {
            ot0.b3 k17 = k(sqlCall);
            ot0.b3 k18 = k(ormCall);
            if (h(k18, k17)) {
                return (android.database.Cursor) ormCall.invoke();
            }
            throw ot0.k3.f348566d.b(methodName, "First row data mismatch: ORM hasData=" + k18.f348404a + ", SQL hasData=" + k17.f348404a);
        } catch (ot0.k3 e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OrmCorrectnessChecker", methodName.concat(": Correctness check failed"), e17);
            m(methodName, e17);
            return (android.database.Cursor) ormCall.invoke();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OrmCorrectnessChecker", methodName.concat(": Unexpected error during correctness check"), e18);
            return (android.database.Cursor) ormCall.invoke();
        }
    }

    public final int d(java.lang.String methodName, yz5.a ormCall, yz5.a sqlCall) {
        kotlin.jvm.internal.o.g(methodName, "methodName");
        kotlin.jvm.internal.o.g(ormCall, "ormCall");
        kotlin.jvm.internal.o.g(sqlCall, "sqlCall");
        return b(methodName, ormCall, sqlCall);
    }

    public final java.util.List e(java.lang.String methodName, yz5.a ormCall, yz5.a sqlCall) {
        kotlin.jvm.internal.o.g(methodName, "methodName");
        kotlin.jvm.internal.o.g(ormCall, "ormCall");
        kotlin.jvm.internal.o.g(sqlCall, "sqlCall");
        if (!ot0.l3.a()) {
            return (java.util.List) ormCall.invoke();
        }
        try {
            java.util.List list = (java.util.List) sqlCall.invoke();
            java.util.List list2 = (java.util.List) ormCall.invoke();
            if (i(list2, list)) {
                list2.size();
                return list2;
            }
            ot0.j3 j3Var = ot0.k3.f348566d;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(((com.tencent.mm.storage.f9) it.next()).getMsgId()));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                arrayList2.add(java.lang.Long.valueOf(((com.tencent.mm.storage.f9) it6.next()).getMsgId()));
            }
            throw j3Var.d(methodName, arrayList, arrayList2);
        } catch (ot0.k3 e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OrmCorrectnessChecker", methodName.concat(": Correctness check failed"), e17);
            m(methodName, e17);
            return (java.util.List) ormCall.invoke();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OrmCorrectnessChecker", methodName.concat(": Unexpected error during correctness check"), e18);
            return (java.util.List) ormCall.invoke();
        }
    }

    public final long f(java.lang.String methodName, yz5.a ormCall, yz5.a sqlCall) {
        kotlin.jvm.internal.o.g(methodName, "methodName");
        kotlin.jvm.internal.o.g(ormCall, "ormCall");
        kotlin.jvm.internal.o.g(sqlCall, "sqlCall");
        if (!ot0.l3.a()) {
            return ((java.lang.Number) ormCall.invoke()).longValue();
        }
        try {
            long longValue = ((java.lang.Number) sqlCall.invoke()).longValue();
            long longValue2 = ((java.lang.Number) ormCall.invoke()).longValue();
            if (longValue2 == longValue) {
                return longValue2;
            }
            throw ot0.k3.f348566d.a(methodName, (int) longValue2, (int) longValue);
        } catch (ot0.k3 e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OrmCorrectnessChecker", methodName.concat(": Correctness check failed"), e17);
            m(methodName, e17);
            return ((java.lang.Number) ormCall.invoke()).longValue();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OrmCorrectnessChecker", methodName.concat(": Unexpected error during correctness check"), e18);
            return ((java.lang.Number) ormCall.invoke()).longValue();
        }
    }

    public final com.tencent.mm.storage.f9 g(java.lang.String methodName, yz5.a ormCall, yz5.a sqlCall) {
        kotlin.jvm.internal.o.g(methodName, "methodName");
        kotlin.jvm.internal.o.g(ormCall, "ormCall");
        kotlin.jvm.internal.o.g(sqlCall, "sqlCall");
        if (!ot0.l3.a()) {
            return (com.tencent.mm.storage.f9) ormCall.invoke();
        }
        try {
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) sqlCall.invoke();
            com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) ormCall.invoke();
            if (f9Var2.getMsgId() == f9Var.getMsgId()) {
                return f9Var2;
            }
            throw ot0.k3.f348566d.e(methodName, f9Var2.getMsgId(), f9Var.getMsgId());
        } catch (ot0.k3 e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OrmCorrectnessChecker", methodName.concat(": Correctness check failed"), e17);
            m(methodName, e17);
            return (com.tencent.mm.storage.f9) ormCall.invoke();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OrmCorrectnessChecker", methodName.concat(": Unexpected error during correctness check"), e18);
            return (com.tencent.mm.storage.f9) ormCall.invoke();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ca, code lost:
    
        if (java.lang.Math.abs(((java.lang.Number) r6).doubleValue() - ((java.lang.Number) r7).doubleValue()) < 1.0E-4d) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d6, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d4, code lost:
    
        if (r7 == null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(ot0.b3 r13, ot0.b3 r14) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ot0.c3.h(ot0.b3, ot0.b3):boolean");
    }

    public final boolean i(java.util.List list, java.util.List list2) {
        if (list.size() != list2.size()) {
            list.size();
            list2.size();
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((com.tencent.mm.storage.f9) it.next()).getMsgId()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            arrayList2.add(java.lang.Long.valueOf(((com.tencent.mm.storage.f9) it6.next()).getMsgId()));
        }
        boolean b17 = kotlin.jvm.internal.o.b(arrayList, arrayList2);
        if (!b17) {
            kz5.n0.K0(arrayList, 10).toString();
            kz5.n0.K0(arrayList2, 10).toString();
        }
        return b17;
    }

    public final boolean j(com.tencent.mm.storage.f9[] f9VarArr, com.tencent.mm.storage.f9[] f9VarArr2) {
        if (f9VarArr == null && f9VarArr2 == null) {
            return true;
        }
        if (f9VarArr == null || f9VarArr2 == null || f9VarArr.length != f9VarArr2.length) {
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(f9VarArr.length);
        for (com.tencent.mm.storage.f9 f9Var : f9VarArr) {
            arrayList.add(java.lang.Long.valueOf(f9Var.getMsgId()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(f9VarArr2.length);
        for (com.tencent.mm.storage.f9 f9Var2 : f9VarArr2) {
            arrayList2.add(java.lang.Long.valueOf(f9Var2.getMsgId()));
        }
        boolean b17 = kotlin.jvm.internal.o.b(arrayList, arrayList2);
        if (!b17) {
            kz5.n0.K0(arrayList, 10).toString();
            kz5.n0.K0(arrayList2, 10).toString();
        }
        return b17;
    }

    public final ot0.b3 k(yz5.a aVar) {
        java.lang.Throwable th6;
        android.database.Cursor cursor;
        java.lang.Object obj;
        try {
            cursor = (android.database.Cursor) aVar.invoke();
            try {
                if (!cursor.moveToFirst()) {
                    kz5.p0 p0Var = kz5.p0.f313996d;
                    ot0.b3 b3Var = new ot0.b3(false, 0, p0Var, p0Var, p0Var);
                    cursor.close();
                    return b3Var;
                }
                int columnCount = cursor.getColumnCount();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (int i17 = 0; i17 < columnCount; i17++) {
                    java.lang.String columnName = cursor.getColumnName(i17);
                    kotlin.jvm.internal.o.f(columnName, "getColumnName(...)");
                    arrayList.add(columnName);
                    int type = cursor.getType(i17);
                    arrayList2.add(java.lang.Integer.valueOf(type));
                    if (type != 0) {
                        if (type == 1) {
                            obj = java.lang.Long.valueOf(cursor.getLong(i17));
                        } else if (type == 2) {
                            obj = java.lang.Double.valueOf(cursor.getDouble(i17));
                        } else if (type == 3) {
                            obj = cursor.getString(i17);
                        } else if (type == 4) {
                            obj = cursor.getBlob(i17);
                        }
                        arrayList3.add(obj);
                    }
                    obj = null;
                    arrayList3.add(obj);
                }
                ot0.b3 b3Var2 = new ot0.b3(true, columnCount, arrayList, arrayList2, arrayList3);
                cursor.close();
                return b3Var2;
            } catch (java.lang.Throwable th7) {
                th6 = th7;
                if (cursor != null) {
                    cursor.close();
                }
                throw th6;
            }
        } catch (java.lang.Throwable th8) {
            th6 = th8;
            cursor = null;
        }
    }

    public final void m(java.lang.String str, ot0.k3 k3Var) {
        try {
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(k3Var);
            kotlin.jvm.internal.o.f(stackTraceString, "getStackTraceString(...)");
            com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct msgRefactorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct();
            msgRefactorReportStruct.p("orm_correctness_exception");
            msgRefactorReportStruct.u(r26.i0.u(stackTraceString, ',', ';', false, 4, null));
            msgRefactorReportStruct.r(str);
            java.lang.String message = k3Var.getMessage();
            msgRefactorReportStruct.s(message != null ? r26.i0.u(message, ',', ';', false, 4, null) : null);
            msgRefactorReportStruct.q(com.tencent.mm.sdk.platformtools.z.f193109e);
            msgRefactorReportStruct.k();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OrmCorrectnessChecker", "Failed to report OrmCorrectnessException: " + e17.getMessage());
        }
    }
}
