package com.tencent.wcdb.core;

/* loaded from: classes12.dex */
public abstract class HandleOperation extends com.tencent.wcdb.base.CppObject {
    public abstract boolean autoInvalidateHandle();

    public void beginTransaction() {
        com.tencent.wcdb.core.Handle handle = getHandle(true);
        com.tencent.wcdb.base.WCDBException createException = !com.tencent.wcdb.core.Handle.beginTransaction(handle.getCppHandle()) ? handle.createException() : null;
        if (autoInvalidateHandle()) {
            handle.invalidate();
        }
        if (createException != null) {
            throw createException;
        }
    }

    public void commitTransaction() {
        com.tencent.wcdb.core.Handle handle = getHandle(true);
        com.tencent.wcdb.base.WCDBException createException = !com.tencent.wcdb.core.Handle.commitTransaction(handle.getCppHandle()) ? handle.createException() : null;
        if (autoInvalidateHandle()) {
            handle.invalidate();
        }
        if (createException != null) {
            throw createException;
        }
    }

    public void deleteValue(java.lang.String str) {
        deleteValue(new com.tencent.wcdb.winq.StatementDelete().deleteFrom(str));
    }

    public void execute(com.tencent.wcdb.winq.Statement statement) {
        com.tencent.wcdb.core.Handle handle = getHandle(statement.isWriteStatement());
        com.tencent.wcdb.base.WCDBException createException = !com.tencent.wcdb.core.Handle.execute(handle.getCppHandle(), com.tencent.wcdb.base.CppObject.get((com.tencent.wcdb.base.CppObject) statement)) ? handle.createException() : null;
        if (autoInvalidateHandle()) {
            handle.invalidate();
        }
        if (createException != null) {
            throw createException;
        }
    }

    public java.util.List<com.tencent.wcdb.base.Value[]> getAllRows(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, java.lang.String str) {
        return getAllRowsFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(str));
    }

    public java.util.List<com.tencent.wcdb.base.Value[]> getAllRowsFromSQL(java.lang.String str) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        com.tencent.wcdb.core.Handle handle = getHandle(false);
        try {
            preparedStatement = handle.preparedWithMainStatement(str);
            try {
                java.util.List<com.tencent.wcdb.base.Value[]> multiRows = preparedStatement.getMultiRows();
                preparedStatement.finalizeStatement();
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                return multiRows;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            preparedStatement = null;
        }
    }

    public java.util.List<com.tencent.wcdb.base.Value[]> getAllRowsFromStatement(com.tencent.wcdb.winq.Statement statement) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        com.tencent.wcdb.core.Handle handle = getHandle(false);
        try {
            preparedStatement = handle.preparedWithMainStatement(statement);
            try {
                java.util.List<com.tencent.wcdb.base.Value[]> multiRows = preparedStatement.getMultiRows();
                preparedStatement.finalizeStatement();
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                return multiRows;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            preparedStatement = null;
        }
    }

    public abstract com.tencent.wcdb.core.Handle getHandle(boolean z17);

    public java.util.List<com.tencent.wcdb.base.Value> getOneColumn(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str) {
        return getOneColumnFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str));
    }

    public java.util.List<byte[]> getOneColumnBLOB(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str) {
        return getOneColumnBLOBFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str));
    }

    public java.util.List<byte[]> getOneColumnBLOBFromStatement(com.tencent.wcdb.winq.Statement statement) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        com.tencent.wcdb.core.Handle handle = getHandle(false);
        try {
            preparedStatement = handle.preparedWithMainStatement(statement);
            try {
                java.util.List<byte[]> oneColumnBLOB = preparedStatement.getOneColumnBLOB();
                preparedStatement.finalizeStatement();
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                return oneColumnBLOB;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            preparedStatement = null;
        }
    }

    public java.util.List<java.lang.Double> getOneColumnDouble(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str) {
        return getOneColumnDoubleFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str));
    }

    public java.util.List<java.lang.Double> getOneColumnDoubleFromStatement(com.tencent.wcdb.winq.Statement statement) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        com.tencent.wcdb.core.Handle handle = getHandle(false);
        try {
            preparedStatement = handle.preparedWithMainStatement(statement);
            try {
                java.util.List<java.lang.Double> oneColumnDouble = preparedStatement.getOneColumnDouble();
                preparedStatement.finalizeStatement();
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                return oneColumnDouble;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            preparedStatement = null;
        }
    }

    public java.util.List<java.lang.Float> getOneColumnFloat(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str) {
        return getOneColumnFloatFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str));
    }

    public java.util.List<java.lang.Float> getOneColumnFloatFromStatement(com.tencent.wcdb.winq.Statement statement) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        com.tencent.wcdb.core.Handle handle = getHandle(false);
        try {
            preparedStatement = handle.preparedWithMainStatement(statement);
            try {
                java.util.List<java.lang.Float> oneColumnFloat = preparedStatement.getOneColumnFloat();
                preparedStatement.finalizeStatement();
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                return oneColumnFloat;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            preparedStatement = null;
        }
    }

    public java.util.List<com.tencent.wcdb.base.Value> getOneColumnFromSQL(java.lang.String str) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        com.tencent.wcdb.core.Handle handle = getHandle(false);
        try {
            preparedStatement = handle.preparedWithMainStatement(str);
            try {
                java.util.List<com.tencent.wcdb.base.Value> oneColumn = preparedStatement.getOneColumn();
                preparedStatement.finalizeStatement();
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                return oneColumn;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            preparedStatement = null;
        }
    }

    public java.util.List<com.tencent.wcdb.base.Value> getOneColumnFromStatement(com.tencent.wcdb.winq.Statement statement) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        com.tencent.wcdb.core.Handle handle = getHandle(false);
        try {
            preparedStatement = handle.preparedWithMainStatement(statement);
            try {
                java.util.List<com.tencent.wcdb.base.Value> oneColumn = preparedStatement.getOneColumn();
                preparedStatement.finalizeStatement();
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                return oneColumn;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            preparedStatement = null;
        }
    }

    public java.util.List<java.lang.Integer> getOneColumnInt(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str) {
        return getOneColumnIntFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str));
    }

    public java.util.List<java.lang.Integer> getOneColumnIntFromStatement(com.tencent.wcdb.winq.Statement statement) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        com.tencent.wcdb.core.Handle handle = getHandle(false);
        try {
            preparedStatement = handle.preparedWithMainStatement(statement);
            try {
                java.util.List<java.lang.Integer> oneColumnInt = preparedStatement.getOneColumnInt();
                preparedStatement.finalizeStatement();
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                return oneColumnInt;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            preparedStatement = null;
        }
    }

    public java.util.List<java.lang.Long> getOneColumnLong(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str) {
        return getOneColumnLongFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str));
    }

    public java.util.List<java.lang.Long> getOneColumnLongFromStatement(com.tencent.wcdb.winq.Statement statement) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        com.tencent.wcdb.core.Handle handle = getHandle(false);
        try {
            preparedStatement = handle.preparedWithMainStatement(statement);
            try {
                java.util.List<java.lang.Long> oneColumnLong = preparedStatement.getOneColumnLong();
                preparedStatement.finalizeStatement();
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                return oneColumnLong;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            preparedStatement = null;
        }
    }

    public java.util.List<java.lang.String> getOneColumnString(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str) {
        return getOneColumnStringFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str));
    }

    public java.util.List<java.lang.String> getOneColumnStringFromStatement(com.tencent.wcdb.winq.Statement statement) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        com.tencent.wcdb.core.Handle handle = getHandle(false);
        try {
            preparedStatement = handle.preparedWithMainStatement(statement);
            try {
                java.util.List<java.lang.String> oneColumnString = preparedStatement.getOneColumnString();
                preparedStatement.finalizeStatement();
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                return oneColumnString;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            preparedStatement = null;
        }
    }

    public com.tencent.wcdb.base.Value[] getOneRow(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, java.lang.String str) {
        return getOneRowFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(str));
    }

    public com.tencent.wcdb.base.Value[] getOneRowFromSQL(java.lang.String str) {
        java.lang.Throwable th6;
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        com.tencent.wcdb.core.Handle handle = getHandle(false);
        try {
            preparedStatement = handle.preparedWithMainStatement(str);
            try {
                preparedStatement.step();
                com.tencent.wcdb.base.Value[] oneRow = preparedStatement.isDone() ? null : preparedStatement.getOneRow();
                preparedStatement.finalizeStatement();
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                return oneRow;
            } catch (java.lang.Throwable th7) {
                th6 = th7;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                throw th6;
            }
        } catch (java.lang.Throwable th8) {
            th6 = th8;
            preparedStatement = null;
        }
    }

    public com.tencent.wcdb.base.Value[] getOneRowFromStatement(com.tencent.wcdb.winq.Statement statement) {
        java.lang.Throwable th6;
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        com.tencent.wcdb.core.Handle handle = getHandle(false);
        try {
            preparedStatement = handle.preparedWithMainStatement(statement);
            try {
                preparedStatement.step();
                com.tencent.wcdb.base.Value[] oneRow = preparedStatement.isDone() ? null : preparedStatement.getOneRow();
                preparedStatement.finalizeStatement();
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                return oneRow;
            } catch (java.lang.Throwable th7) {
                th6 = th7;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                throw th6;
            }
        } catch (java.lang.Throwable th8) {
            th6 = th8;
            preparedStatement = null;
        }
    }

    public com.tencent.wcdb.base.Value getValue(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str) {
        return getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str));
    }

    public com.tencent.wcdb.base.Value getValueFromSQL(java.lang.String str) {
        com.tencent.wcdb.core.Handle handle = getHandle(false);
        com.tencent.wcdb.core.PreparedStatement preparedStatement = null;
        try {
            com.tencent.wcdb.core.PreparedStatement preparedWithMainStatement = handle.preparedWithMainStatement(str);
            try {
                preparedWithMainStatement.step();
                com.tencent.wcdb.base.Value value = preparedWithMainStatement.isDone() ? null : preparedWithMainStatement.getValue(0);
                preparedWithMainStatement.finalizeStatement();
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                return value;
            } catch (java.lang.Throwable th6) {
                th = th6;
                preparedStatement = preparedWithMainStatement;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public com.tencent.wcdb.base.Value getValueFromStatement(com.tencent.wcdb.winq.Statement statement) {
        com.tencent.wcdb.core.Handle handle = getHandle(false);
        com.tencent.wcdb.core.PreparedStatement preparedStatement = null;
        try {
            com.tencent.wcdb.core.PreparedStatement preparedWithMainStatement = handle.preparedWithMainStatement(statement);
            try {
                preparedWithMainStatement.step();
                com.tencent.wcdb.base.Value value = preparedWithMainStatement.isDone() ? null : preparedWithMainStatement.getValue(0);
                preparedWithMainStatement.finalizeStatement();
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                return value;
            } catch (java.lang.Throwable th6) {
                th = th6;
                preparedStatement = preparedWithMainStatement;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public void insertOrIgnoreRow(com.tencent.wcdb.base.Value[] valueArr, com.tencent.wcdb.winq.Column[] columnArr, java.lang.String str) {
        insertOrIgnoreRows(java.util.Collections.singleton(valueArr), columnArr, str);
    }

    public void insertOrIgnoreRows(java.util.Collection<com.tencent.wcdb.base.Value[]> collection, com.tencent.wcdb.winq.Column[] columnArr, java.lang.String str) {
        insertRows(collection, columnArr, str, com.tencent.wcdb.winq.ConflictAction.Ignore);
    }

    public void insertOrReplaceRow(com.tencent.wcdb.base.Value[] valueArr, com.tencent.wcdb.winq.Column[] columnArr, java.lang.String str) {
        insertOrReplaceRows(java.util.Collections.singleton(valueArr), columnArr, str);
    }

    public void insertOrReplaceRows(java.util.Collection<com.tencent.wcdb.base.Value[]> collection, com.tencent.wcdb.winq.Column[] columnArr, java.lang.String str) {
        insertRows(collection, columnArr, str, com.tencent.wcdb.winq.ConflictAction.Replace);
    }

    public void insertRow(com.tencent.wcdb.base.Value[] valueArr, com.tencent.wcdb.winq.Column[] columnArr, java.lang.String str) {
        insertRows(java.util.Collections.singleton(valueArr), columnArr, str);
    }

    public void insertRows(java.util.Collection<com.tencent.wcdb.base.Value[]> collection, com.tencent.wcdb.winq.Column[] columnArr, java.lang.String str) {
        insertRows(collection, columnArr, str, com.tencent.wcdb.winq.ConflictAction.None);
    }

    public boolean isInTransaction() {
        com.tencent.wcdb.core.Handle handle;
        try {
            handle = getHandle(false);
            try {
                boolean isInTransaction = com.tencent.wcdb.core.Handle.isInTransaction(handle.getCppHandle());
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                return isInTransaction;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (handle != null && autoInvalidateHandle()) {
                    handle.invalidate();
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            handle = null;
        }
    }

    public void rollbackTransaction() {
        com.tencent.wcdb.core.Handle handle = getHandle(true);
        com.tencent.wcdb.core.Handle.rollbackTransaction(handle.getCppHandle());
        if (autoInvalidateHandle()) {
            handle.invalidate();
        }
    }

    public void runPausableTransaction(com.tencent.wcdb.core.PausableTransaction pausableTransaction) {
        com.tencent.wcdb.core.Handle handle = getHandle(true);
        com.tencent.wcdb.base.WCDBException createException = !handle.runPausableTransaction(handle.getCppHandle(), pausableTransaction) ? handle.createException() : null;
        if (autoInvalidateHandle()) {
            handle.invalidate();
        }
        if (createException != null) {
            throw createException;
        }
    }

    public void runTransaction(com.tencent.wcdb.core.Transaction transaction) {
        com.tencent.wcdb.core.Handle handle = getHandle(true);
        com.tencent.wcdb.base.WCDBException createException = !handle.runTransaction(handle.getCppHandle(), transaction) ? handle.createException() : null;
        if (autoInvalidateHandle()) {
            handle.invalidate();
        }
        if (createException != null) {
            throw createException;
        }
    }

    public void updateRow(com.tencent.wcdb.base.Value[] valueArr, com.tencent.wcdb.winq.Column[] columnArr, java.lang.String str) {
        updateRow(valueArr, new com.tencent.wcdb.winq.StatementUpdate().update(str).setColumnsToBindParameters(columnArr));
    }

    public void updateValue(int i17, com.tencent.wcdb.winq.Column column, java.lang.String str) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(i17)}, new com.tencent.wcdb.winq.Column[]{column}, str);
    }

    private void insertRows(final java.util.Collection<com.tencent.wcdb.base.Value[]> collection, com.tencent.wcdb.winq.Column[] columnArr, java.lang.String str, com.tencent.wcdb.winq.ConflictAction conflictAction) {
        final com.tencent.wcdb.winq.StatementInsert valuesWithBindParameters = new com.tencent.wcdb.winq.StatementInsert().insertInto(str).columns(columnArr).valuesWithBindParameters(columnArr.length);
        if (conflictAction == com.tencent.wcdb.winq.ConflictAction.Replace) {
            valuesWithBindParameters.orReplace();
        } else if (conflictAction == com.tencent.wcdb.winq.ConflictAction.Ignore) {
            valuesWithBindParameters.orIgnore();
        }
        com.tencent.wcdb.core.Handle handle = getHandle(true);
        try {
            if (collection.size() > 1) {
                handle.runTransaction(new com.tencent.wcdb.core.Transaction() { // from class: com.tencent.wcdb.core.HandleOperation.1
                    @Override // com.tencent.wcdb.core.Transaction
                    public boolean insideTransaction(com.tencent.wcdb.core.Handle handle2) {
                        com.tencent.wcdb.core.HandleOperation.this.insertRows((java.util.Collection<com.tencent.wcdb.base.Value[]>) collection, valuesWithBindParameters, handle2);
                        return true;
                    }
                });
            } else {
                insertRows(collection, valuesWithBindParameters, handle);
            }
        } finally {
            if (autoInvalidateHandle()) {
                handle.invalidate();
            }
        }
    }

    public java.util.List<com.tencent.wcdb.base.Value[]> getAllRows(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression) {
        return getAllRowsFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(str).where(expression));
    }

    public java.util.List<com.tencent.wcdb.base.Value> getOneColumn(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression) {
        return getOneColumnFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression));
    }

    public java.util.List<byte[]> getOneColumnBLOB(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression) {
        return getOneColumnBLOBFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression));
    }

    public java.util.List<java.lang.Double> getOneColumnDouble(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression) {
        return getOneColumnDoubleFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression));
    }

    public java.util.List<java.lang.Float> getOneColumnFloat(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression) {
        return getOneColumnFloatFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression));
    }

    public java.util.List<java.lang.Integer> getOneColumnInt(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression) {
        return getOneColumnIntFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression));
    }

    public java.util.List<java.lang.Long> getOneColumnLong(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression) {
        return getOneColumnLongFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression));
    }

    public java.util.List<java.lang.String> getOneColumnString(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression) {
        return getOneColumnStringFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression));
    }

    public com.tencent.wcdb.base.Value[] getOneRow(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression) {
        return getOneRowFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(str).where(expression));
    }

    public com.tencent.wcdb.base.Value getValue(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression) {
        return getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression));
    }

    public void updateValue(int i17, com.tencent.wcdb.winq.Column column, java.lang.String str, com.tencent.wcdb.winq.Expression expression) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(i17)}, new com.tencent.wcdb.winq.Column[]{column}, str, expression);
    }

    public void deleteValue(java.lang.String str, com.tencent.wcdb.winq.Expression expression) {
        deleteValue(new com.tencent.wcdb.winq.StatementDelete().deleteFrom(str).where(expression));
    }

    public java.util.List<com.tencent.wcdb.base.Value[]> getAllRows(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getAllRowsFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(str).where(expression).orderBy(orderingTerm));
    }

    public java.util.List<com.tencent.wcdb.base.Value> getOneColumn(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression).orderBy(orderingTerm));
    }

    public java.util.List<byte[]> getOneColumnBLOB(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnBLOBFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression).orderBy(orderingTerm));
    }

    public java.util.List<java.lang.Double> getOneColumnDouble(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnDoubleFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression).orderBy(orderingTerm));
    }

    public java.util.List<java.lang.Float> getOneColumnFloat(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnFloatFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression).orderBy(orderingTerm));
    }

    public java.util.List<java.lang.Integer> getOneColumnInt(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnIntFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression).orderBy(orderingTerm));
    }

    public java.util.List<java.lang.Long> getOneColumnLong(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnLongFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression).orderBy(orderingTerm));
    }

    public java.util.List<java.lang.String> getOneColumnString(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnStringFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression).orderBy(orderingTerm));
    }

    public com.tencent.wcdb.base.Value[] getOneRow(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneRowFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(str).where(expression).orderBy(orderingTerm));
    }

    public com.tencent.wcdb.base.Value getValue(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression).orderBy(orderingTerm));
    }

    public void updateRow(com.tencent.wcdb.base.Value[] valueArr, com.tencent.wcdb.winq.Column[] columnArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression) {
        updateRow(valueArr, new com.tencent.wcdb.winq.StatementUpdate().update(str).setColumnsToBindParameters(columnArr).where(expression));
    }

    public void updateValue(int i17, com.tencent.wcdb.winq.Column column, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(i17)}, new com.tencent.wcdb.winq.Column[]{column}, str, expression, orderingTerm, i18);
    }

    public java.util.List<com.tencent.wcdb.base.Value[]> getAllRows(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getAllRowsFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(str).where(expression).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<com.tencent.wcdb.base.Value> getOneColumn(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<byte[]> getOneColumnBLOB(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnBLOBFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<java.lang.Double> getOneColumnDouble(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnDoubleFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<java.lang.Float> getOneColumnFloat(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnFloatFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<java.lang.Integer> getOneColumnInt(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnIntFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<java.lang.Long> getOneColumnLong(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnLongFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<java.lang.String> getOneColumnString(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnStringFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression).orderBy(orderingTerm).limit(i17));
    }

    public com.tencent.wcdb.base.Value[] getOneRow(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneRowFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(str).where(expression).orderBy(orderingTerm).limit(1L).offset(i17));
    }

    public com.tencent.wcdb.base.Value getValue(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression).orderBy(orderingTerm).limit(1L).offset(i17));
    }

    public void updateValue(int i17, com.tencent.wcdb.winq.Column column, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i18, int i19) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(i17)}, new com.tencent.wcdb.winq.Column[]{column}, str, expression, orderingTerm, i18, i19);
    }

    public void deleteValue(java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        deleteValue(new com.tencent.wcdb.winq.StatementDelete().deleteFrom(str).where(expression).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<com.tencent.wcdb.base.Value[]> getAllRows(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getAllRowsFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(str).where(expression).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<com.tencent.wcdb.base.Value> getOneColumn(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<byte[]> getOneColumnBLOB(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnBLOBFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<java.lang.Double> getOneColumnDouble(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnDoubleFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<java.lang.Float> getOneColumnFloat(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnFloatFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<java.lang.Integer> getOneColumnInt(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnIntFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<java.lang.Long> getOneColumnLong(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnLongFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<java.lang.String> getOneColumnString(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnStringFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).where(expression).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public com.tencent.wcdb.base.Value[] getOneRow(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneRowFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(str).orderBy(orderingTerm));
    }

    public com.tencent.wcdb.base.Value getValue(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).orderBy(orderingTerm));
    }

    public void updateRow(com.tencent.wcdb.base.Value[] valueArr, com.tencent.wcdb.winq.Column[] columnArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        updateRow(valueArr, new com.tencent.wcdb.winq.StatementUpdate().update(str).setColumnsToBindParameters(columnArr).where(expression).orderBy(orderingTerm).limit(i17));
    }

    public void updateValue(int i17, com.tencent.wcdb.winq.Column column, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(i17)}, new com.tencent.wcdb.winq.Column[]{column}, str, orderingTerm, i18);
    }

    public java.util.List<com.tencent.wcdb.base.Value[]> getAllRows(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getAllRowsFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(str).orderBy(orderingTerm));
    }

    public java.util.List<com.tencent.wcdb.base.Value> getOneColumn(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).orderBy(orderingTerm));
    }

    public java.util.List<byte[]> getOneColumnBLOB(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnBLOBFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).orderBy(orderingTerm));
    }

    public java.util.List<java.lang.Double> getOneColumnDouble(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnDoubleFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).orderBy(orderingTerm));
    }

    public java.util.List<java.lang.Float> getOneColumnFloat(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnFloatFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).orderBy(orderingTerm));
    }

    public java.util.List<java.lang.Integer> getOneColumnInt(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnIntFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).orderBy(orderingTerm));
    }

    public java.util.List<java.lang.Long> getOneColumnLong(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnLongFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).orderBy(orderingTerm));
    }

    public java.util.List<java.lang.String> getOneColumnString(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnStringFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).orderBy(orderingTerm));
    }

    public com.tencent.wcdb.base.Value[] getOneRow(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneRowFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(str).orderBy(orderingTerm).limit(1L).offset(i17));
    }

    public com.tencent.wcdb.base.Value getValue(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).orderBy(orderingTerm).limit(1L).offset(i17));
    }

    public void updateValue(int i17, com.tencent.wcdb.winq.Column column, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i18, int i19) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(i17)}, new com.tencent.wcdb.winq.Column[]{column}, str, orderingTerm, i18, i19);
    }

    public void deleteValue(java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        deleteValue(new com.tencent.wcdb.winq.StatementDelete().deleteFrom(str).where(expression).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public void execute(java.lang.String str) {
        com.tencent.wcdb.core.Handle handle = getHandle(false);
        com.tencent.wcdb.base.WCDBException createException = !com.tencent.wcdb.core.Handle.executeSQL(handle.getCppHandle(), str) ? handle.createException() : null;
        if (autoInvalidateHandle()) {
            handle.invalidate();
        }
        if (createException != null) {
            throw createException;
        }
    }

    public java.util.List<com.tencent.wcdb.base.Value[]> getAllRows(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getAllRowsFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(str).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<com.tencent.wcdb.base.Value> getOneColumn(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<byte[]> getOneColumnBLOB(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnBLOBFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<java.lang.Double> getOneColumnDouble(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnDoubleFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<java.lang.Float> getOneColumnFloat(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnFloatFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<java.lang.Integer> getOneColumnInt(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnIntFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<java.lang.Long> getOneColumnLong(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnLongFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<java.lang.String> getOneColumnString(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnStringFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).orderBy(orderingTerm).limit(i17));
    }

    public void updateRow(com.tencent.wcdb.base.Value[] valueArr, com.tencent.wcdb.winq.Column[] columnArr, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(valueArr, new com.tencent.wcdb.winq.StatementUpdate().update(str).setColumnsToBindParameters(columnArr).where(expression).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public void updateValue(long j17, com.tencent.wcdb.winq.Column column, java.lang.String str) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(j17)}, new com.tencent.wcdb.winq.Column[]{column}, str);
    }

    public java.util.List<com.tencent.wcdb.base.Value[]> getAllRows(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getAllRowsFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(str).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<com.tencent.wcdb.base.Value> getOneColumn(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<byte[]> getOneColumnBLOB(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnBLOBFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<java.lang.Double> getOneColumnDouble(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnDoubleFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<java.lang.Float> getOneColumnFloat(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnFloatFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<java.lang.Integer> getOneColumnInt(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnIntFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<java.lang.Long> getOneColumnLong(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnLongFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<java.lang.String> getOneColumnString(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnStringFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(str).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public void updateValue(double d17, com.tencent.wcdb.winq.Column column, java.lang.String str, com.tencent.wcdb.winq.Expression expression) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(d17)}, new com.tencent.wcdb.winq.Column[]{column}, str, expression);
    }

    public void deleteValue(java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        deleteValue(new com.tencent.wcdb.winq.StatementDelete().deleteFrom(str).orderBy(orderingTerm).limit(i17));
    }

    public void updateRow(com.tencent.wcdb.base.Value[] valueArr, com.tencent.wcdb.winq.Column[] columnArr, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        updateRow(valueArr, new com.tencent.wcdb.winq.StatementUpdate().update(str).setColumnsToBindParameters(columnArr).orderBy(orderingTerm).limit(i17));
    }

    public void updateValue(double d17, com.tencent.wcdb.winq.Column column, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(d17)}, new com.tencent.wcdb.winq.Column[]{column}, str, expression, orderingTerm, i17);
    }

    public void updateValue(double d17, com.tencent.wcdb.winq.Column column, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(d17)}, new com.tencent.wcdb.winq.Column[]{column}, str, expression, orderingTerm, i17, i18);
    }

    public void deleteValue(java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        deleteValue(new com.tencent.wcdb.winq.StatementDelete().deleteFrom(str).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public void updateRow(com.tencent.wcdb.base.Value[] valueArr, com.tencent.wcdb.winq.Column[] columnArr, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(valueArr, new com.tencent.wcdb.winq.StatementUpdate().update(str).setColumnsToBindParameters(columnArr).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public void updateValue(double d17, com.tencent.wcdb.winq.Column column, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(d17)}, new com.tencent.wcdb.winq.Column[]{column}, str, orderingTerm, i17);
    }

    public void updateValue(double d17, com.tencent.wcdb.winq.Column column, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(d17)}, new com.tencent.wcdb.winq.Column[]{column}, str, orderingTerm, i17, i18);
    }

    private void deleteValue(com.tencent.wcdb.winq.StatementDelete statementDelete) {
        com.tencent.wcdb.core.Handle handle = getHandle(true);
        try {
            handle.execute(statementDelete);
        } finally {
            if (autoInvalidateHandle()) {
                handle.invalidate();
            }
        }
    }

    private void updateRow(com.tencent.wcdb.base.Value[] valueArr, com.tencent.wcdb.winq.StatementUpdate statementUpdate) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        com.tencent.wcdb.core.Handle handle = getHandle(true);
        try {
            preparedStatement = handle.preparedWithMainStatement(statementUpdate);
            try {
                preparedStatement.bindRow(valueArr);
                preparedStatement.step();
                preparedStatement.finalizeStatement();
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                if (autoInvalidateHandle()) {
                    handle.invalidate();
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            preparedStatement = null;
        }
    }

    public void updateValue(java.lang.String str, com.tencent.wcdb.winq.Column column, java.lang.String str2) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(str)}, new com.tencent.wcdb.winq.Column[]{column}, str2);
    }

    public void updateValue(java.lang.String str, com.tencent.wcdb.winq.Column column, java.lang.String str2, com.tencent.wcdb.winq.Expression expression) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(str)}, new com.tencent.wcdb.winq.Column[]{column}, str2, expression);
    }

    public void updateValue(java.lang.String str, com.tencent.wcdb.winq.Column column, java.lang.String str2, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(str)}, new com.tencent.wcdb.winq.Column[]{column}, str2, expression, orderingTerm, i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void insertRows(java.util.Collection<com.tencent.wcdb.base.Value[]> collection, com.tencent.wcdb.winq.StatementInsert statementInsert, com.tencent.wcdb.core.Handle handle) {
        com.tencent.wcdb.core.PreparedStatement preparedWithMainStatement = handle.preparedWithMainStatement(statementInsert);
        for (com.tencent.wcdb.base.Value[] valueArr : collection) {
            preparedWithMainStatement.reset();
            preparedWithMainStatement.bindRow(valueArr);
            preparedWithMainStatement.step();
        }
        preparedWithMainStatement.finalizeStatement();
    }

    public void updateValue(java.lang.String str, com.tencent.wcdb.winq.Column column, java.lang.String str2, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(str)}, new com.tencent.wcdb.winq.Column[]{column}, str2, expression, orderingTerm, i17, i18);
    }

    public void updateValue(java.lang.String str, com.tencent.wcdb.winq.Column column, java.lang.String str2, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(str)}, new com.tencent.wcdb.winq.Column[]{column}, str2, orderingTerm, i17);
    }

    public void updateValue(java.lang.String str, com.tencent.wcdb.winq.Column column, java.lang.String str2, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(str)}, new com.tencent.wcdb.winq.Column[]{column}, str2, orderingTerm, i17, i18);
    }

    public void updateValue(byte[] bArr, com.tencent.wcdb.winq.Column column, java.lang.String str) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(bArr)}, new com.tencent.wcdb.winq.Column[]{column}, str);
    }

    public void updateValue(byte[] bArr, com.tencent.wcdb.winq.Column column, java.lang.String str, com.tencent.wcdb.winq.Expression expression) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(bArr)}, new com.tencent.wcdb.winq.Column[]{column}, str, expression);
    }

    public void updateValue(byte[] bArr, com.tencent.wcdb.winq.Column column, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(bArr)}, new com.tencent.wcdb.winq.Column[]{column}, str, expression, orderingTerm, i17);
    }

    public void updateValue(byte[] bArr, com.tencent.wcdb.winq.Column column, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(bArr)}, new com.tencent.wcdb.winq.Column[]{column}, str, expression, orderingTerm, i17, i18);
    }

    public void updateValue(byte[] bArr, com.tencent.wcdb.winq.Column column, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(bArr)}, new com.tencent.wcdb.winq.Column[]{column}, str, orderingTerm, i17);
    }

    public void updateValue(byte[] bArr, com.tencent.wcdb.winq.Column column, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(bArr)}, new com.tencent.wcdb.winq.Column[]{column}, str, orderingTerm, i17, i18);
    }

    public void updateValue(com.tencent.wcdb.base.Value value, com.tencent.wcdb.winq.Column column, java.lang.String str) {
        if (value == null) {
            value = new com.tencent.wcdb.base.Value();
        }
        updateRow(new com.tencent.wcdb.base.Value[]{value}, new com.tencent.wcdb.winq.Column[]{column}, str);
    }

    public void updateValue(com.tencent.wcdb.base.Value value, com.tencent.wcdb.winq.Column column, java.lang.String str, com.tencent.wcdb.winq.Expression expression) {
        if (value == null) {
            value = new com.tencent.wcdb.base.Value();
        }
        updateRow(new com.tencent.wcdb.base.Value[]{value}, new com.tencent.wcdb.winq.Column[]{column}, str, expression);
    }

    public void updateValue(com.tencent.wcdb.base.Value value, com.tencent.wcdb.winq.Column column, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        if (value == null) {
            value = new com.tencent.wcdb.base.Value();
        }
        updateRow(new com.tencent.wcdb.base.Value[]{value}, new com.tencent.wcdb.winq.Column[]{column}, str, expression, orderingTerm, i17);
    }

    public void updateValue(com.tencent.wcdb.base.Value value, com.tencent.wcdb.winq.Column column, java.lang.String str, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{value}, new com.tencent.wcdb.winq.Column[]{column}, str, expression, orderingTerm, i17, i18);
    }

    public void updateValue(com.tencent.wcdb.base.Value value, com.tencent.wcdb.winq.Column column, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        if (value == null) {
            value = new com.tencent.wcdb.base.Value();
        }
        updateRow(new com.tencent.wcdb.base.Value[]{value}, new com.tencent.wcdb.winq.Column[]{column}, str, orderingTerm, i17);
    }

    public void updateValue(com.tencent.wcdb.base.Value value, com.tencent.wcdb.winq.Column column, java.lang.String str, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{value}, new com.tencent.wcdb.winq.Column[]{column}, str, orderingTerm, i17, i18);
    }
}
