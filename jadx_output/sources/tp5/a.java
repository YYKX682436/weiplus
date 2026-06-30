package tp5;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final tp5.f f421155a = new tp5.a$$a();

    public static void a(com.tencent.wcdb.core.Handle handle, android.os.CancellationSignal cancellationSignal) {
        if (cancellationSignal == null) {
            return;
        }
        final com.tencent.wcdb.core.Handle.CancellationSignal cancellationSignal2 = new com.tencent.wcdb.core.Handle.CancellationSignal();
        cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() { // from class: tp5.a$$b
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                com.tencent.wcdb.core.Handle.CancellationSignal.this.cancel();
            }
        });
        if (cancellationSignal.isCanceled()) {
            cancellationSignal2.cancel();
        }
        handle.attachCancellationSignal(cancellationSignal2);
    }

    public static void b(java.lang.Object obj, com.tencent.wcdb.core.Table table, java.lang.String[] strArr) {
        java.util.List d17 = d(strArr, table.getBinding().allBindingFields());
        java.util.Iterator it = d17.iterator();
        com.tencent.wcdb.winq.Expression expression = null;
        int i17 = 1;
        int i18 = 1;
        while (it.hasNext()) {
            int i19 = i18 + 1;
            com.tencent.wcdb.winq.Expression eq6 = ((com.tencent.wcdb.orm.Field) it.next()).eq(new com.tencent.wcdb.winq.BindParameter(i18));
            expression = expression == null ? eq6 : expression.and(eq6);
            i18 = i19;
        }
        com.tencent.wcdb.winq.StatementDelete where = new com.tencent.wcdb.winq.StatementDelete().deleteFrom(table.getTableName()).where(expression);
        com.tencent.wcdb.core.Handle handle = table.getDatabase().getHandle(true);
        try {
            com.tencent.wcdb.core.PreparedStatement preparedWithMainStatement = handle.preparedWithMainStatement(where);
            java.util.Iterator it6 = d17.iterator();
            while (it6.hasNext()) {
                preparedWithMainStatement.bindObject(obj, (com.tencent.wcdb.orm.Field) it6.next(), i17);
                i17++;
            }
            preparedWithMainStatement.step();
            preparedWithMainStatement.finalizeStatement();
            handle.close();
        } catch (java.lang.Throwable th6) {
            if (handle != null) {
                try {
                    handle.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public static tp5.c c(com.tencent.wcdb.core.Database database, java.lang.Object obj, java.lang.Object[] objArr, android.os.CancellationSignal cancellationSignal, tp5.f fVar) {
        com.tencent.wcdb.core.Handle handle;
        int i17 = 0;
        com.tencent.wcdb.core.PreparedStatement preparedStatement = null;
        try {
            handle = database.getHandle(false);
            try {
                a(handle, cancellationSignal);
                preparedStatement = obj instanceof com.tencent.wcdb.winq.Statement ? handle.prepareNewStatement((com.tencent.wcdb.winq.Statement) obj) : handle.prepareNewStatement(obj.toString());
                if (objArr != null) {
                    while (i17 < objArr.length) {
                        com.tencent.wcdb.base.Value value = new com.tencent.wcdb.base.Value(objArr[i17]);
                        i17++;
                        preparedStatement.bindValue(value, i17);
                    }
                }
                return new tp5.c(handle, preparedStatement, fVar);
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (preparedStatement != null) {
                    handle.finalizeAndReturnPreparedStatement(preparedStatement);
                }
                if (handle != null) {
                    handle.invalidate();
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            handle = null;
        }
    }

    public static java.util.List d(java.lang.String[] strArr, com.tencent.wcdb.orm.Field[] fieldArr) {
        int i17 = 0;
        if (strArr.length == 0) {
            int length = fieldArr.length;
            while (i17 < length) {
                com.tencent.wcdb.orm.Field field = fieldArr[i17];
                if (field.isPrimaryKey()) {
                    return java.util.Collections.singletonList(field);
                }
                i17++;
            }
            throw new java.lang.AssertionError("No primary key defined");
        }
        java.util.List asList = java.util.Arrays.asList(strArr);
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        int length2 = fieldArr.length;
        while (i17 < length2) {
            com.tencent.wcdb.orm.Field field2 = fieldArr[i17];
            if (asList.contains(field2.getName())) {
                arrayList.add(field2);
            }
            i17++;
        }
        return arrayList;
    }

    public static com.tencent.mm.protobuf.f e(byte[] bArr, java.lang.Class cls) {
        try {
            return ((com.tencent.mm.protobuf.f) cls.newInstance()).parseFrom(bArr);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WCDBHelper", e17, "Cannot parse protobuf", new java.lang.Object[0]);
            return null;
        }
    }

    public static android.database.Cursor f(com.tencent.wcdb.core.Database database, com.tencent.wcdb.winq.Statement statement, java.lang.Object[] objArr, android.os.CancellationSignal cancellationSignal) {
        return new tp5.b(c(database, statement, objArr, cancellationSignal, f421155a));
    }

    public static android.database.Cursor g(com.tencent.wcdb.core.Database database, java.lang.String str, java.lang.Object[] objArr, android.os.CancellationSignal cancellationSignal) {
        return new tp5.b(c(database, str, objArr, cancellationSignal, f421155a));
    }

    public static byte[] h(com.tencent.mm.protobuf.f fVar) {
        try {
            return fVar.toByteArray();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WCDBHelper", e17, "Cannot serialize protobuf", new java.lang.Object[0]);
            return null;
        }
    }

    public static void i(java.lang.Object obj, com.tencent.wcdb.core.Table table, java.lang.String[] strArr) {
        com.tencent.wcdb.orm.Field[] allBindingFields = table.getBinding().allBindingFields();
        int length = allBindingFields.length + 1;
        java.util.List d17 = d(strArr, allBindingFields);
        java.util.Iterator it = d17.iterator();
        com.tencent.wcdb.winq.Expression expression = null;
        while (it.hasNext()) {
            int i17 = length + 1;
            com.tencent.wcdb.winq.Expression eq6 = ((com.tencent.wcdb.orm.Field) it.next()).eq(new com.tencent.wcdb.winq.BindParameter(length));
            if (expression != null) {
                eq6 = expression.and(eq6);
            }
            expression = eq6;
            length = i17;
        }
        com.tencent.wcdb.winq.StatementUpdate where = new com.tencent.wcdb.winq.StatementUpdate().update(table.getTableName()).setColumnsToBindParameters(allBindingFields).where(expression);
        com.tencent.wcdb.core.Handle handle = table.getDatabase().getHandle(true);
        try {
            com.tencent.wcdb.core.PreparedStatement preparedWithMainStatement = handle.preparedWithMainStatement(where);
            preparedWithMainStatement.bindObject((com.tencent.wcdb.core.PreparedStatement) obj, (com.tencent.wcdb.orm.Field<com.tencent.wcdb.core.PreparedStatement>[]) allBindingFields);
            int length2 = allBindingFields.length + 1;
            java.util.Iterator it6 = d17.iterator();
            while (it6.hasNext()) {
                preparedWithMainStatement.bindObject(obj, (com.tencent.wcdb.orm.Field) it6.next(), length2);
                length2++;
            }
            preparedWithMainStatement.step();
            preparedWithMainStatement.finalizeStatement();
            handle.close();
        } catch (java.lang.Throwable th6) {
            if (handle != null) {
                try {
                    handle.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }
}
