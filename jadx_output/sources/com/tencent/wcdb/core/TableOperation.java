package com.tencent.wcdb.core;

/* loaded from: classes12.dex */
public class TableOperation {
    java.lang.String tableName = null;
    com.tencent.wcdb.core.Database database = null;

    public void deleteValue() {
        deleteValue(new com.tencent.wcdb.winq.StatementDelete().deleteFrom(this.tableName));
    }

    public java.util.List<com.tencent.wcdb.base.Value[]> getAllRows(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr) {
        return getAllRowsFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(this.tableName));
    }

    public java.util.List<com.tencent.wcdb.base.Value[]> getAllRowsFromStatement(com.tencent.wcdb.winq.Statement statement) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        com.tencent.wcdb.core.Handle handle = this.database.getHandle(false);
        try {
            preparedStatement = handle.preparedWithMainStatement(statement);
            try {
                java.util.List<com.tencent.wcdb.base.Value[]> multiRows = preparedStatement.getMultiRows();
                preparedStatement.finalizeStatement();
                handle.invalidate();
                return multiRows;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                handle.invalidate();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            preparedStatement = null;
        }
    }

    public com.tencent.wcdb.core.Database getDatabase() {
        return this.database;
    }

    public java.util.List<com.tencent.wcdb.base.Value> getOneColumn(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible) {
        return getOneColumnFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName));
    }

    public java.util.List<byte[]> getOneColumnBLOB(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible) {
        return getOneColumnBLOBFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName));
    }

    public java.util.List<byte[]> getOneColumnBLOBFromStatement(com.tencent.wcdb.winq.Statement statement) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        com.tencent.wcdb.core.Handle handle = this.database.getHandle(false);
        try {
            preparedStatement = handle.preparedWithMainStatement(statement);
            try {
                java.util.List<byte[]> oneColumnBLOB = preparedStatement.getOneColumnBLOB();
                preparedStatement.finalizeStatement();
                handle.invalidate();
                return oneColumnBLOB;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                handle.invalidate();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            preparedStatement = null;
        }
    }

    public java.util.List<java.lang.Double> getOneColumnDouble(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible) {
        return getOneColumnDoubleFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName));
    }

    public java.util.List<java.lang.Double> getOneColumnDoubleFromStatement(com.tencent.wcdb.winq.Statement statement) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        com.tencent.wcdb.core.Handle handle = this.database.getHandle(false);
        try {
            preparedStatement = handle.preparedWithMainStatement(statement);
            try {
                java.util.List<java.lang.Double> oneColumnDouble = preparedStatement.getOneColumnDouble();
                preparedStatement.finalizeStatement();
                handle.invalidate();
                return oneColumnDouble;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                handle.invalidate();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            preparedStatement = null;
        }
    }

    public java.util.List<java.lang.Float> getOneColumnFloat(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible) {
        return getOneColumnFloatFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName));
    }

    public java.util.List<java.lang.Float> getOneColumnFloatFromStatement(com.tencent.wcdb.winq.Statement statement) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        com.tencent.wcdb.core.Handle handle = this.database.getHandle(false);
        try {
            preparedStatement = handle.preparedWithMainStatement(statement);
            try {
                java.util.List<java.lang.Float> oneColumnFloat = preparedStatement.getOneColumnFloat();
                preparedStatement.finalizeStatement();
                handle.invalidate();
                return oneColumnFloat;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                handle.invalidate();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            preparedStatement = null;
        }
    }

    public java.util.List<com.tencent.wcdb.base.Value> getOneColumnFromStatement(com.tencent.wcdb.winq.Statement statement) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        com.tencent.wcdb.core.Handle handle = this.database.getHandle(false);
        try {
            preparedStatement = handle.preparedWithMainStatement(statement);
            try {
                java.util.List<com.tencent.wcdb.base.Value> oneColumn = preparedStatement.getOneColumn();
                preparedStatement.finalizeStatement();
                handle.invalidate();
                return oneColumn;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                handle.invalidate();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            preparedStatement = null;
        }
    }

    public java.util.List<java.lang.Integer> getOneColumnInt(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible) {
        return getOneColumnIntFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName));
    }

    public java.util.List<java.lang.Integer> getOneColumnIntFromStatement(com.tencent.wcdb.winq.Statement statement) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        com.tencent.wcdb.core.Handle handle = this.database.getHandle(false);
        try {
            preparedStatement = handle.preparedWithMainStatement(statement);
            try {
                java.util.List<java.lang.Integer> oneColumnInt = preparedStatement.getOneColumnInt();
                preparedStatement.finalizeStatement();
                handle.invalidate();
                return oneColumnInt;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                handle.invalidate();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            preparedStatement = null;
        }
    }

    public java.util.List<java.lang.Long> getOneColumnLong(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible) {
        return getOneColumnLongFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName));
    }

    public java.util.List<java.lang.Long> getOneColumnLongFromStatement(com.tencent.wcdb.winq.Statement statement) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        com.tencent.wcdb.core.Handle handle = this.database.getHandle(false);
        try {
            preparedStatement = handle.preparedWithMainStatement(statement);
            try {
                java.util.List<java.lang.Long> oneColumnLong = preparedStatement.getOneColumnLong();
                preparedStatement.finalizeStatement();
                handle.invalidate();
                return oneColumnLong;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                handle.invalidate();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            preparedStatement = null;
        }
    }

    public java.util.List<java.lang.String> getOneColumnString(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible) {
        return getOneColumnStringFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName));
    }

    public java.util.List<java.lang.String> getOneColumnStringFromStatement(com.tencent.wcdb.winq.Statement statement) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        com.tencent.wcdb.core.Handle handle = this.database.getHandle(false);
        try {
            preparedStatement = handle.preparedWithMainStatement(statement);
            try {
                java.util.List<java.lang.String> oneColumnString = preparedStatement.getOneColumnString();
                preparedStatement.finalizeStatement();
                handle.invalidate();
                return oneColumnString;
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                handle.invalidate();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            preparedStatement = null;
        }
    }

    public com.tencent.wcdb.base.Value[] getOneRow(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr) {
        return getOneRowFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(this.tableName));
    }

    public com.tencent.wcdb.base.Value[] getOneRowFromStatement(com.tencent.wcdb.winq.Statement statement) {
        java.lang.Throwable th6;
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        com.tencent.wcdb.core.Handle handle = this.database.getHandle(false);
        try {
            preparedStatement = handle.preparedWithMainStatement(statement);
            try {
                preparedStatement.step();
                com.tencent.wcdb.base.Value[] oneRow = preparedStatement.isDone() ? null : preparedStatement.getOneRow();
                preparedStatement.finalizeStatement();
                handle.invalidate();
                return oneRow;
            } catch (java.lang.Throwable th7) {
                th6 = th7;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                handle.invalidate();
                throw th6;
            }
        } catch (java.lang.Throwable th8) {
            th6 = th8;
            preparedStatement = null;
        }
    }

    public java.lang.String getTableName() {
        return this.tableName;
    }

    public com.tencent.wcdb.base.Value getValue(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible) {
        return getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName));
    }

    public com.tencent.wcdb.base.Value getValueFromStatement(com.tencent.wcdb.winq.Statement statement) {
        com.tencent.wcdb.core.Handle handle = this.database.getHandle(false);
        com.tencent.wcdb.core.PreparedStatement preparedStatement = null;
        try {
            com.tencent.wcdb.core.PreparedStatement preparedWithMainStatement = handle.preparedWithMainStatement(statement);
            try {
                preparedWithMainStatement.step();
                com.tencent.wcdb.base.Value value = preparedWithMainStatement.isDone() ? null : preparedWithMainStatement.getValue(0);
                preparedWithMainStatement.finalizeStatement();
                handle.invalidate();
                return value;
            } catch (java.lang.Throwable th6) {
                th = th6;
                preparedStatement = preparedWithMainStatement;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                handle.invalidate();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public void insertOrIgnoreRow(com.tencent.wcdb.base.Value[] valueArr, com.tencent.wcdb.winq.Column[] columnArr) {
        insertOrIgnoreRows(java.util.Collections.singleton(valueArr), columnArr);
    }

    public void insertOrIgnoreRows(java.util.Collection<com.tencent.wcdb.base.Value[]> collection, com.tencent.wcdb.winq.Column[] columnArr) {
        insertRows(collection, columnArr, com.tencent.wcdb.winq.ConflictAction.Ignore);
    }

    public void insertOrReplaceRow(com.tencent.wcdb.base.Value[] valueArr, com.tencent.wcdb.winq.Column[] columnArr) {
        insertOrReplaceRows(java.util.Collections.singleton(valueArr), columnArr);
    }

    public void insertOrReplaceRows(java.util.Collection<com.tencent.wcdb.base.Value[]> collection, com.tencent.wcdb.winq.Column[] columnArr) {
        insertRows(collection, columnArr, com.tencent.wcdb.winq.ConflictAction.Replace);
    }

    public void insertRow(com.tencent.wcdb.base.Value[] valueArr, com.tencent.wcdb.winq.Column[] columnArr) {
        insertRows(java.util.Collections.singleton(valueArr), columnArr);
    }

    public void insertRows(java.util.Collection<com.tencent.wcdb.base.Value[]> collection, com.tencent.wcdb.winq.Column[] columnArr) {
        insertRows(collection, columnArr, com.tencent.wcdb.winq.ConflictAction.None);
    }

    public void updateRow(com.tencent.wcdb.base.Value[] valueArr, com.tencent.wcdb.winq.Column[] columnArr) {
        updateRow(valueArr, new com.tencent.wcdb.winq.StatementUpdate().update(this.tableName).setColumnsToBindParameters(columnArr));
    }

    public void updateValue(int i17, com.tencent.wcdb.winq.Column column) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(i17)}, new com.tencent.wcdb.winq.Column[]{column});
    }

    private void insertRows(final java.util.Collection<com.tencent.wcdb.base.Value[]> collection, com.tencent.wcdb.winq.Column[] columnArr, com.tencent.wcdb.winq.ConflictAction conflictAction) {
        final com.tencent.wcdb.winq.StatementInsert valuesWithBindParameters = new com.tencent.wcdb.winq.StatementInsert().insertInto(this.tableName).columns(columnArr).valuesWithBindParameters(columnArr.length);
        if (conflictAction == com.tencent.wcdb.winq.ConflictAction.Replace) {
            valuesWithBindParameters.orReplace();
        } else if (conflictAction == com.tencent.wcdb.winq.ConflictAction.Ignore) {
            valuesWithBindParameters.orIgnore();
        }
        com.tencent.wcdb.core.Handle handle = this.database.getHandle(true);
        try {
            if (collection.size() > 1) {
                handle.runTransaction(new com.tencent.wcdb.core.Transaction() { // from class: com.tencent.wcdb.core.TableOperation.1
                    @Override // com.tencent.wcdb.core.Transaction
                    public boolean insideTransaction(com.tencent.wcdb.core.Handle handle2) {
                        com.tencent.wcdb.core.TableOperation.this.insertRows((java.util.Collection<com.tencent.wcdb.base.Value[]>) collection, valuesWithBindParameters, handle2);
                        return true;
                    }
                });
            } else {
                insertRows(collection, valuesWithBindParameters, handle);
            }
        } finally {
            handle.invalidate();
        }
    }

    public java.util.List<com.tencent.wcdb.base.Value[]> getAllRows(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, com.tencent.wcdb.winq.Expression expression) {
        return getAllRowsFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(this.tableName).where(expression));
    }

    public java.util.List<com.tencent.wcdb.base.Value> getOneColumn(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression) {
        return getOneColumnFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression));
    }

    public java.util.List<byte[]> getOneColumnBLOB(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression) {
        return getOneColumnBLOBFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression));
    }

    public java.util.List<java.lang.Double> getOneColumnDouble(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression) {
        return getOneColumnDoubleFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression));
    }

    public java.util.List<java.lang.Float> getOneColumnFloat(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression) {
        return getOneColumnFloatFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression));
    }

    public java.util.List<java.lang.Integer> getOneColumnInt(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression) {
        return getOneColumnIntFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression));
    }

    public java.util.List<java.lang.Long> getOneColumnLong(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression) {
        return getOneColumnLongFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression));
    }

    public java.util.List<java.lang.String> getOneColumnString(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression) {
        return getOneColumnStringFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression));
    }

    public com.tencent.wcdb.base.Value[] getOneRow(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, com.tencent.wcdb.winq.Expression expression) {
        return getOneRowFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(this.tableName).where(expression));
    }

    public com.tencent.wcdb.base.Value getValue(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression) {
        return getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression));
    }

    public void updateValue(int i17, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.Expression expression) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(i17)}, new com.tencent.wcdb.winq.Column[]{column}, expression);
    }

    public void deleteValue(com.tencent.wcdb.winq.Expression expression) {
        deleteValue(new com.tencent.wcdb.winq.StatementDelete().deleteFrom(this.tableName).where(expression));
    }

    public java.util.List<com.tencent.wcdb.base.Value[]> getAllRows(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getAllRowsFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(this.tableName).where(expression).orderBy(orderingTerm));
    }

    public java.util.List<com.tencent.wcdb.base.Value> getOneColumn(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression).orderBy(orderingTerm));
    }

    public java.util.List<byte[]> getOneColumnBLOB(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnBLOBFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression).orderBy(orderingTerm));
    }

    public java.util.List<java.lang.Double> getOneColumnDouble(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnDoubleFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression).orderBy(orderingTerm));
    }

    public java.util.List<java.lang.Float> getOneColumnFloat(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnFloatFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression).orderBy(orderingTerm));
    }

    public java.util.List<java.lang.Integer> getOneColumnInt(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnIntFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression).orderBy(orderingTerm));
    }

    public java.util.List<java.lang.Long> getOneColumnLong(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnLongFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression).orderBy(orderingTerm));
    }

    public java.util.List<java.lang.String> getOneColumnString(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnStringFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression).orderBy(orderingTerm));
    }

    public com.tencent.wcdb.base.Value[] getOneRow(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneRowFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(this.tableName).where(expression).orderBy(orderingTerm));
    }

    public com.tencent.wcdb.base.Value getValue(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression).orderBy(orderingTerm));
    }

    public void updateRow(com.tencent.wcdb.base.Value[] valueArr, com.tencent.wcdb.winq.Column[] columnArr, com.tencent.wcdb.winq.Expression expression) {
        updateRow(valueArr, new com.tencent.wcdb.winq.StatementUpdate().update(this.tableName).setColumnsToBindParameters(columnArr).where(expression));
    }

    public void updateValue(int i17, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(i17)}, new com.tencent.wcdb.winq.Column[]{column}, expression, orderingTerm, i18);
    }

    public java.util.List<com.tencent.wcdb.base.Value[]> getAllRows(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getAllRowsFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(this.tableName).where(expression).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<com.tencent.wcdb.base.Value> getOneColumn(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<byte[]> getOneColumnBLOB(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnBLOBFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<java.lang.Double> getOneColumnDouble(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnDoubleFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<java.lang.Float> getOneColumnFloat(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnFloatFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<java.lang.Integer> getOneColumnInt(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnIntFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<java.lang.Long> getOneColumnLong(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnLongFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<java.lang.String> getOneColumnString(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnStringFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression).orderBy(orderingTerm).limit(i17));
    }

    public com.tencent.wcdb.base.Value[] getOneRow(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneRowFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(this.tableName).where(expression).orderBy(orderingTerm).limit(1L).offset(i17));
    }

    public com.tencent.wcdb.base.Value getValue(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression).orderBy(orderingTerm).limit(1L).offset(i17));
    }

    public void updateValue(int i17, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i18, int i19) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(i17)}, new com.tencent.wcdb.winq.Column[]{column}, expression, orderingTerm, i18, i19);
    }

    public void deleteValue(com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        deleteValue(new com.tencent.wcdb.winq.StatementDelete().deleteFrom(this.tableName).where(expression).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<com.tencent.wcdb.base.Value[]> getAllRows(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getAllRowsFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(this.tableName).where(expression).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<com.tencent.wcdb.base.Value> getOneColumn(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<byte[]> getOneColumnBLOB(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnBLOBFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<java.lang.Double> getOneColumnDouble(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnDoubleFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<java.lang.Float> getOneColumnFloat(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnFloatFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<java.lang.Integer> getOneColumnInt(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnIntFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<java.lang.Long> getOneColumnLong(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnLongFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<java.lang.String> getOneColumnString(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnStringFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).where(expression).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public com.tencent.wcdb.base.Value[] getOneRow(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneRowFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(this.tableName).orderBy(orderingTerm));
    }

    public com.tencent.wcdb.base.Value getValue(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).orderBy(orderingTerm));
    }

    public void updateRow(com.tencent.wcdb.base.Value[] valueArr, com.tencent.wcdb.winq.Column[] columnArr, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        updateRow(valueArr, new com.tencent.wcdb.winq.StatementUpdate().update(this.tableName).setColumnsToBindParameters(columnArr).where(expression).orderBy(orderingTerm).limit(i17));
    }

    public void updateValue(int i17, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(i17)}, new com.tencent.wcdb.winq.Column[]{column}, orderingTerm, i18);
    }

    public java.util.List<com.tencent.wcdb.base.Value[]> getAllRows(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getAllRowsFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(this.tableName).orderBy(orderingTerm));
    }

    public java.util.List<com.tencent.wcdb.base.Value> getOneColumn(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).orderBy(orderingTerm));
    }

    public java.util.List<byte[]> getOneColumnBLOB(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnBLOBFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).orderBy(orderingTerm));
    }

    public java.util.List<java.lang.Double> getOneColumnDouble(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnDoubleFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).orderBy(orderingTerm));
    }

    public java.util.List<java.lang.Float> getOneColumnFloat(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnFloatFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).orderBy(orderingTerm));
    }

    public java.util.List<java.lang.Integer> getOneColumnInt(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnIntFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).orderBy(orderingTerm));
    }

    public java.util.List<java.lang.Long> getOneColumnLong(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnLongFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).orderBy(orderingTerm));
    }

    public java.util.List<java.lang.String> getOneColumnString(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.OrderingTerm orderingTerm) {
        return getOneColumnStringFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).orderBy(orderingTerm));
    }

    public com.tencent.wcdb.base.Value[] getOneRow(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneRowFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(this.tableName).orderBy(orderingTerm).limit(1L).offset(i17));
    }

    public com.tencent.wcdb.base.Value getValue(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getValueFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).orderBy(orderingTerm).limit(1L).offset(i17));
    }

    public void updateValue(int i17, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i18, int i19) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(i17)}, new com.tencent.wcdb.winq.Column[]{column}, orderingTerm, i18, i19);
    }

    public void deleteValue(com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        deleteValue(new com.tencent.wcdb.winq.StatementDelete().deleteFrom(this.tableName).where(expression).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<com.tencent.wcdb.base.Value[]> getAllRows(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getAllRowsFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(this.tableName).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<com.tencent.wcdb.base.Value> getOneColumn(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<byte[]> getOneColumnBLOB(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnBLOBFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<java.lang.Double> getOneColumnDouble(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnDoubleFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<java.lang.Float> getOneColumnFloat(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnFloatFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<java.lang.Integer> getOneColumnInt(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnIntFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<java.lang.Long> getOneColumnLong(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnLongFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).orderBy(orderingTerm).limit(i17));
    }

    public java.util.List<java.lang.String> getOneColumnString(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        return getOneColumnStringFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).orderBy(orderingTerm).limit(i17));
    }

    public void updateRow(com.tencent.wcdb.base.Value[] valueArr, com.tencent.wcdb.winq.Column[] columnArr, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(valueArr, new com.tencent.wcdb.winq.StatementUpdate().update(this.tableName).setColumnsToBindParameters(columnArr).where(expression).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public void updateValue(long j17, com.tencent.wcdb.winq.Column column) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(j17)}, new com.tencent.wcdb.winq.Column[]{column});
    }

    public java.util.List<com.tencent.wcdb.base.Value[]> getAllRows(com.tencent.wcdb.winq.ResultColumnConvertible[] resultColumnConvertibleArr, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getAllRowsFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertibleArr).from(this.tableName).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<com.tencent.wcdb.base.Value> getOneColumn(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<byte[]> getOneColumnBLOB(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnBLOBFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<java.lang.Double> getOneColumnDouble(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnDoubleFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<java.lang.Float> getOneColumnFloat(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnFloatFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<java.lang.Integer> getOneColumnInt(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnIntFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<java.lang.Long> getOneColumnLong(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnLongFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public java.util.List<java.lang.String> getOneColumnString(com.tencent.wcdb.winq.ResultColumnConvertible resultColumnConvertible, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        return getOneColumnStringFromStatement(new com.tencent.wcdb.winq.StatementSelect().select(resultColumnConvertible).from(this.tableName).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public void updateValue(long j17, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.Expression expression) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(j17)}, new com.tencent.wcdb.winq.Column[]{column}, expression);
    }

    public void deleteValue(com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        deleteValue(new com.tencent.wcdb.winq.StatementDelete().deleteFrom(this.tableName).orderBy(orderingTerm).limit(i17));
    }

    public void updateRow(com.tencent.wcdb.base.Value[] valueArr, com.tencent.wcdb.winq.Column[] columnArr, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        updateRow(valueArr, new com.tencent.wcdb.winq.StatementUpdate().update(this.tableName).setColumnsToBindParameters(columnArr).orderBy(orderingTerm).limit(i17));
    }

    public void updateValue(long j17, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(j17)}, new com.tencent.wcdb.winq.Column[]{column}, expression, orderingTerm, i17);
    }

    public void updateValue(long j17, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(j17)}, new com.tencent.wcdb.winq.Column[]{column}, expression, orderingTerm, i17, i18);
    }

    public void deleteValue(com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        deleteValue(new com.tencent.wcdb.winq.StatementDelete().deleteFrom(this.tableName).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public void updateRow(com.tencent.wcdb.base.Value[] valueArr, com.tencent.wcdb.winq.Column[] columnArr, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(valueArr, new com.tencent.wcdb.winq.StatementUpdate().update(this.tableName).setColumnsToBindParameters(columnArr).orderBy(orderingTerm).limit(i17).offset(i18));
    }

    public void updateValue(long j17, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(j17)}, new com.tencent.wcdb.winq.Column[]{column}, orderingTerm, i17);
    }

    public void updateValue(long j17, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(j17)}, new com.tencent.wcdb.winq.Column[]{column}, orderingTerm, i17, i18);
    }

    private void deleteValue(com.tencent.wcdb.winq.StatementDelete statementDelete) {
        com.tencent.wcdb.core.Handle handle = this.database.getHandle(true);
        try {
            handle.execute(statementDelete);
        } finally {
            handle.invalidate();
        }
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

    private void updateRow(com.tencent.wcdb.base.Value[] valueArr, com.tencent.wcdb.winq.StatementUpdate statementUpdate) {
        com.tencent.wcdb.core.PreparedStatement preparedStatement;
        com.tencent.wcdb.core.Handle handle = this.database.getHandle(true);
        try {
            preparedStatement = handle.preparedWithMainStatement(statementUpdate);
            try {
                preparedStatement.bindRow(valueArr);
                preparedStatement.step();
                preparedStatement.finalizeStatement();
                handle.invalidate();
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (preparedStatement != null) {
                    preparedStatement.finalizeStatement();
                }
                handle.invalidate();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            preparedStatement = null;
        }
    }

    public void updateValue(float f17, com.tencent.wcdb.winq.Column column) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(f17)}, new com.tencent.wcdb.winq.Column[]{column});
    }

    public void updateValue(float f17, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.Expression expression) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(f17)}, new com.tencent.wcdb.winq.Column[]{column}, expression);
    }

    public void updateValue(float f17, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(f17)}, new com.tencent.wcdb.winq.Column[]{column}, expression, orderingTerm, i17);
    }

    public void updateValue(float f17, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(f17)}, new com.tencent.wcdb.winq.Column[]{column}, expression, orderingTerm, i17, i18);
    }

    public void updateValue(float f17, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(f17)}, new com.tencent.wcdb.winq.Column[]{column}, orderingTerm, i17);
    }

    public void updateValue(float f17, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(f17)}, new com.tencent.wcdb.winq.Column[]{column}, orderingTerm, i17, i18);
    }

    public void updateValue(double d17, com.tencent.wcdb.winq.Column column) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(d17)}, new com.tencent.wcdb.winq.Column[]{column});
    }

    public void updateValue(double d17, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.Expression expression) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(d17)}, new com.tencent.wcdb.winq.Column[]{column}, expression);
    }

    public void updateValue(double d17, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(d17)}, new com.tencent.wcdb.winq.Column[]{column}, expression, orderingTerm, i17);
    }

    public void updateValue(double d17, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(d17)}, new com.tencent.wcdb.winq.Column[]{column}, expression, orderingTerm, i17, i18);
    }

    public void updateValue(double d17, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(d17)}, new com.tencent.wcdb.winq.Column[]{column}, orderingTerm, i17);
    }

    public void updateValue(double d17, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(d17)}, new com.tencent.wcdb.winq.Column[]{column}, orderingTerm, i17, i18);
    }

    public void updateValue(java.lang.String str, com.tencent.wcdb.winq.Column column) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(str)}, new com.tencent.wcdb.winq.Column[]{column});
    }

    public void updateValue(java.lang.String str, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.Expression expression) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(str)}, new com.tencent.wcdb.winq.Column[]{column}, expression);
    }

    public void updateValue(java.lang.String str, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(str)}, new com.tencent.wcdb.winq.Column[]{column}, expression, orderingTerm, i17);
    }

    public void updateValue(java.lang.String str, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(str)}, new com.tencent.wcdb.winq.Column[]{column}, expression, orderingTerm, i17, i18);
    }

    public void updateValue(java.lang.String str, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(str)}, new com.tencent.wcdb.winq.Column[]{column}, orderingTerm, i17);
    }

    public void updateValue(java.lang.String str, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(str)}, new com.tencent.wcdb.winq.Column[]{column}, orderingTerm, i17, i18);
    }

    public void updateValue(byte[] bArr, com.tencent.wcdb.winq.Column column) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(bArr)}, new com.tencent.wcdb.winq.Column[]{column});
    }

    public void updateValue(byte[] bArr, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.Expression expression) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(bArr)}, new com.tencent.wcdb.winq.Column[]{column}, expression);
    }

    public void updateValue(byte[] bArr, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(bArr)}, new com.tencent.wcdb.winq.Column[]{column}, expression, orderingTerm, i17);
    }

    public void updateValue(byte[] bArr, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(bArr)}, new com.tencent.wcdb.winq.Column[]{column}, expression, orderingTerm, i17, i18);
    }

    public void updateValue(byte[] bArr, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(bArr)}, new com.tencent.wcdb.winq.Column[]{column}, orderingTerm, i17);
    }

    public void updateValue(byte[] bArr, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{new com.tencent.wcdb.base.Value(bArr)}, new com.tencent.wcdb.winq.Column[]{column}, orderingTerm, i17, i18);
    }

    public void updateValue(com.tencent.wcdb.base.Value value, com.tencent.wcdb.winq.Column column) {
        updateRow(new com.tencent.wcdb.base.Value[]{value}, new com.tencent.wcdb.winq.Column[]{column});
    }

    public void updateValue(com.tencent.wcdb.base.Value value, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.Expression expression) {
        updateRow(new com.tencent.wcdb.base.Value[]{value}, new com.tencent.wcdb.winq.Column[]{column}, expression);
    }

    public void updateValue(com.tencent.wcdb.base.Value value, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        updateRow(new com.tencent.wcdb.base.Value[]{value}, new com.tencent.wcdb.winq.Column[]{column}, expression, orderingTerm, i17);
    }

    public void updateValue(com.tencent.wcdb.base.Value value, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.Expression expression, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{value}, new com.tencent.wcdb.winq.Column[]{column}, expression, orderingTerm, i17, i18);
    }

    public void updateValue(com.tencent.wcdb.base.Value value, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17) {
        updateRow(new com.tencent.wcdb.base.Value[]{value}, new com.tencent.wcdb.winq.Column[]{column}, orderingTerm, i17);
    }

    public void updateValue(com.tencent.wcdb.base.Value value, com.tencent.wcdb.winq.Column column, com.tencent.wcdb.winq.OrderingTerm orderingTerm, int i17, int i18) {
        updateRow(new com.tencent.wcdb.base.Value[]{value}, new com.tencent.wcdb.winq.Column[]{column}, orderingTerm, i17, i18);
    }
}
