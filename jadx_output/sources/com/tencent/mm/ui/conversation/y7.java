package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class y7 extends android.database.AbstractCursor {

    /* renamed from: f, reason: collision with root package name */
    public android.database.Cursor f208266f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.conversation.t7[] f208267g;

    /* renamed from: h, reason: collision with root package name */
    public final int f208268h;

    /* renamed from: d, reason: collision with root package name */
    public final android.database.DataSetObserver f208264d = new com.tencent.mm.ui.conversation.r7(this);

    /* renamed from: e, reason: collision with root package name */
    public int f208265e = -1;

    /* renamed from: i, reason: collision with root package name */
    public final int f208269i = 100;

    /* renamed from: m, reason: collision with root package name */
    public int f208270m = -1;

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f208271n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.ui.conversation.u7 f208272o = new com.tencent.mm.ui.conversation.u7();

    public y7(com.tencent.mm.ui.conversation.x7 x7Var, com.tencent.mm.ui.conversation.t7... t7VarArr) {
        this.f208268h = 1;
        this.f208268h = x7Var.f208237d;
        if (t7VarArr.length < 2) {
            this.f208267g = t7VarArr;
        } else {
            this.f208267g = new com.tencent.mm.ui.conversation.t7[]{t7VarArr[0], t7VarArr[1]};
        }
        this.f208266f = this.f208267g[0].d();
        for (int i17 = 0; i17 < this.f208267g.length; i17++) {
            if (i(i17) != null) {
                i(i17).registerDataSetObserver(this.f208264d);
            }
        }
    }

    public static /* synthetic */ int a(com.tencent.mm.ui.conversation.y7 y7Var, int i17) {
        ((android.database.AbstractCursor) y7Var).mPos = i17;
        return i17;
    }

    public static /* synthetic */ int b(com.tencent.mm.ui.conversation.y7 y7Var, int i17) {
        ((android.database.AbstractCursor) y7Var).mPos = i17;
        return i17;
    }

    public void c() {
        if (this.f208270m != -1) {
            this.f208272o.f208102c++;
        }
        this.f208270m = -1;
        this.f208271n = new java.util.LinkedList();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int length = this.f208267g.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i(i17) != null) {
                i(i17).close();
            }
        }
        super.close();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public void deactivate() {
        int length = this.f208267g.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i(i17) != null) {
                i(i17).deactivate();
            }
        }
        super.deactivate();
    }

    public final android.database.Cursor f() {
        android.database.Cursor cursor = this.f208266f;
        if (cursor == null || cursor.isClosed()) {
            onMove(-1, this.f208265e);
        }
        return this.f208266f;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public byte[] getBlob(int i17) {
        return f().getBlob(i17);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return this.f208266f != null ? f().getColumnNames() : new java.lang.String[0];
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getCount() {
        int length = this.f208267g.length;
        int i17 = 0;
        for (int i18 = 0; i18 < length; i18++) {
            if (i(i18) != null) {
                i17 += i(i18).getCount();
            }
        }
        return i17;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public double getDouble(int i17) {
        return f().getDouble(i17);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public float getFloat(int i17) {
        return f().getFloat(i17);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getInt(int i17) {
        return f().getInt(i17);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public long getLong(int i17) {
        return f().getLong(i17);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public short getShort(int i17) {
        return f().getShort(i17);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public java.lang.String getString(int i17) {
        return f().getString(i17);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getType(int i17) {
        return f().getType(i17);
    }

    public final android.database.Cursor i(int i17) {
        return this.f208267g[i17].d();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public boolean isNull(int i17) {
        return f().isNull(i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.database.AbstractCursor, android.database.CrossProcessCursor
    public boolean onMove(int i17, int i18) {
        int i19;
        int i27;
        com.tencent.mm.ui.conversation.v7 v7Var;
        com.tencent.mm.ui.conversation.u7 u7Var = this.f208272o;
        u7Var.f208100a++;
        this.f208265e = i18;
        com.tencent.mm.ui.conversation.t7[] t7VarArr = this.f208267g;
        if (t7VarArr.length < 2) {
            try {
                u7Var.f208101b++;
                android.database.Cursor d17 = t7VarArr[0].d();
                this.f208266f = d17;
                return d17.moveToPosition(i18);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.w("MergeSortCursorWrapper", "onMoveOneCursorOnly fail:" + th6.getMessage());
                return false;
            }
        }
        int i28 = this.f208270m;
        int size = this.f208271n.size() + i28;
        if (i28 > i18 || i18 >= size) {
            u7Var.f208103d++;
            com.tencent.mm.ui.conversation.t7 t7Var = t7VarArr[0];
            int i29 = 1;
            com.tencent.mm.ui.conversation.t7 t7Var2 = t7VarArr[1];
            int i37 = this.f208269i;
            if (i18 > 0) {
                i37 *= ((i37 - 1) + i18) / i37;
            }
            int i38 = i37 * 2;
            int min = java.lang.Math.min(i38, getCount());
            if (min < i38) {
                i37 = min;
            }
            com.tencent.mm.ui.conversation.w7 b17 = t7Var.b(0);
            com.tencent.mm.ui.conversation.w7 b18 = t7Var2.b(0);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            int i39 = 0;
            int i47 = 0;
            int i48 = 0;
            while (i48 < i37) {
                com.tencent.mm.ui.conversation.w7 w7Var = com.tencent.mm.ui.conversation.w7.f208220f;
                if (w7Var == b17 && w7Var == b18) {
                    break;
                }
                if (w7Var == b17) {
                    linkedList.add(new com.tencent.mm.ui.conversation.v7(i29, i39, b18));
                    i39++;
                    b18 = t7Var2.b(i39);
                } else if (w7Var == b18) {
                    linkedList.add(new com.tencent.mm.ui.conversation.v7(0, i47, b17));
                    i47++;
                    b17 = t7Var.b(i47);
                } else {
                    u7Var.f208104e++;
                    if (this.f208268h * b17.compareTo(b18) <= 0) {
                        linkedList.add(new com.tencent.mm.ui.conversation.v7(0, i47, b17));
                        i47++;
                        b17 = t7Var.b(i47);
                        i27 = 1;
                    } else {
                        i27 = 1;
                        linkedList.add(new com.tencent.mm.ui.conversation.v7(1, i39, b18));
                        i39++;
                        b18 = t7Var2.b(i39);
                    }
                    i48++;
                    i29 = i27;
                }
                i27 = 1;
                i48++;
                i29 = i27;
            }
            if (linkedList.size() != i37) {
                i19 = 0;
                com.tencent.mars.xlog.Log.w("MergeSortCursorWrapper", "fillWindow K=%d, N=%d (%d), iterator=[%d, %d]", 0, java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i47), java.lang.Integer.valueOf(i39));
            } else {
                i19 = 0;
            }
            this.f208270m = i19;
            this.f208271n = linkedList;
        } else {
            u7Var.f208101b++;
            i19 = 0;
        }
        try {
            v7Var = (com.tencent.mm.ui.conversation.v7) this.f208271n.get(i18 - this.f208270m);
        } catch (java.lang.IndexOutOfBoundsException e17) {
            com.tencent.mars.xlog.Log.w("MergeSortCursorWrapper", "locateElement fail:" + e17.getMessage());
            v7Var = null;
        }
        if (v7Var != null) {
            try {
                android.database.Cursor d18 = t7VarArr[v7Var.f208191a].d();
                this.f208266f = d18;
                return d18.moveToPosition(v7Var.f208192b);
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.w("MergeSortCursorWrapper", "onMoveTwoCursorMixed fail:" + th7.getMessage());
            }
        }
        return i19;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
        int length = this.f208267g.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i(i17) != null) {
                i(i17).registerContentObserver(contentObserver);
            }
        }
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        int length = this.f208267g.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i(i17) != null) {
                i(i17).registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public boolean requery() {
        int length = this.f208267g.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i(i17) != null && !i(i17).requery()) {
                return false;
            }
        }
        return true;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
        int length = this.f208267g.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i(i17) != null) {
                i(i17).unregisterContentObserver(contentObserver);
            }
        }
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        int length = this.f208267g.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i(i17) != null) {
                i(i17).unregisterDataSetObserver(dataSetObserver);
            }
        }
    }
}
