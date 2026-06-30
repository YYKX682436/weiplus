package e95;

/* loaded from: classes12.dex */
public abstract class r implements android.database.CrossProcessCursor {

    /* renamed from: d, reason: collision with root package name */
    public int f250441d;

    /* renamed from: e, reason: collision with root package name */
    public int f250442e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f250443f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.ContentResolver f250444g;

    /* renamed from: h, reason: collision with root package name */
    public android.net.Uri f250445h;

    /* renamed from: m, reason: collision with root package name */
    public android.database.ContentObserver f250447m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f250448n;

    /* renamed from: q, reason: collision with root package name */
    public android.os.Bundle f250451q;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f250446i = new java.lang.Object();

    /* renamed from: o, reason: collision with root package name */
    public final android.database.DataSetObservable f250449o = new android.database.DataSetObservable();

    /* renamed from: p, reason: collision with root package name */
    public final android.database.ContentObservable f250450p = new android.database.ContentObservable();

    public r() {
        android.os.Bundle EMPTY = android.os.Bundle.EMPTY;
        kotlin.jvm.internal.o.f(EMPTY, "EMPTY");
        this.f250451q = EMPTY;
        this.f250441d = -1;
        this.f250442e = -1;
        new java.util.HashMap();
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f250443f = true;
        this.f250450p.unregisterAll();
        android.database.ContentObserver contentObserver = this.f250447m;
        if (contentObserver != null) {
            android.content.ContentResolver contentResolver = this.f250444g;
            if (contentResolver != null) {
                contentResolver.unregisterContentObserver(contentObserver);
            }
            this.f250448n = false;
        }
        this.f250449o.notifyInvalidated();
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i17, android.database.CharArrayBuffer buffer) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        java.lang.String string = ((e95.t) this).getString(i17);
        if (string == null) {
            buffer.sizeCopied = 0;
            return;
        }
        char[] cArr = buffer.data;
        if (cArr == null || cArr.length < string.length()) {
            char[] charArray = string.toCharArray();
            kotlin.jvm.internal.o.f(charArray, "toCharArray(...)");
            buffer.data = charArray;
        } else {
            string.getChars(0, string.length(), cArr, 0);
        }
        buffer.sizeCopied = string.length();
    }

    @Override // android.database.Cursor
    public void deactivate() {
        android.database.ContentObserver contentObserver = this.f250447m;
        if (contentObserver != null) {
            android.content.ContentResolver contentResolver = this.f250444g;
            if (contentResolver != null) {
                contentResolver.unregisterContentObserver(contentObserver);
            }
            this.f250448n = false;
        }
        this.f250449o.notifyInvalidated();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r3 >= r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r4 = r0.getString(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r4 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        r4 = r7.putString(r4, r6, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r4 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        r7.freeLastRow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (moveToNext() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        r4 = r7.putNull(r6, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        moveToPosition(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (moveToPosition(r6) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r7.allocRow() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        r3 = 0;
     */
    @Override // android.database.CrossProcessCursor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void fillWindow(int r6, android.database.CursorWindow r7) {
        /*
            r5 = this;
            java.lang.String r0 = "window"
            kotlin.jvm.internal.o.g(r7, r0)
            if (r6 < 0) goto L54
            r0 = r5
            e95.t r0 = (e95.t) r0
            int r1 = r0.getCount()
            if (r6 < r1) goto L12
            goto L54
        L12:
            int r1 = r5.f250441d
            int r2 = r5.getColumnCount()
            r7.clear()
            r7.setStartPosition(r6)
            r7.setNumColumns(r2)
            boolean r3 = r5.moveToPosition(r6)
            if (r3 == 0) goto L51
        L27:
            boolean r3 = r7.allocRow()
            if (r3 != 0) goto L2e
            goto L51
        L2e:
            r3 = 0
        L2f:
            if (r3 >= r2) goto L49
            java.lang.String r4 = r0.getString(r3)
            if (r4 == 0) goto L3c
            boolean r4 = r7.putString(r4, r6, r3)
            goto L40
        L3c:
            boolean r4 = r7.putNull(r6, r3)
        L40:
            if (r4 != 0) goto L46
            r7.freeLastRow()
            goto L49
        L46:
            int r3 = r3 + 1
            goto L2f
        L49:
            int r6 = r6 + 1
            boolean r3 = r5.moveToNext()
            if (r3 != 0) goto L27
        L51:
            r5.moveToPosition(r1)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e95.r.fillWindow(int, android.database.CursorWindow):void");
    }

    public final void finalize() {
        android.database.ContentObserver contentObserver;
        android.content.ContentResolver contentResolver;
        if (this.f250448n && (contentObserver = this.f250447m) != null && (contentResolver = this.f250444g) != null) {
            contentResolver.unregisterContentObserver(contentObserver);
        }
        try {
            if (this.f250443f) {
                return;
            }
            close();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        return ((e95.t) this).getColumnNames().length;
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(java.lang.String columnName) {
        kotlin.jvm.internal.o.g(columnName, "columnName");
        int columnIndex = ((e95.t) this).getColumnIndex(columnName);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new java.lang.IllegalArgumentException(("column '" + columnName + "' does not exist").toString());
    }

    @Override // android.database.Cursor
    public java.lang.String getColumnName(int i17) {
        return ((e95.t) this).getColumnNames()[i17];
    }

    @Override // android.database.Cursor
    public android.os.Bundle getExtras() {
        return this.f250451q;
    }

    @Override // android.database.Cursor
    public android.net.Uri getNotificationUri() {
        return this.f250445h;
    }

    @Override // android.database.Cursor
    public int getPosition() {
        return this.f250441d;
    }

    @Override // android.database.Cursor
    public int getType(int i17) {
        return 3;
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // android.database.CrossProcessCursor
    public android.database.CursorWindow getWindow() {
        return null;
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
        e95.t tVar = (e95.t) this;
        return tVar.getCount() == 0 || this.f250441d == tVar.getCount();
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
        return ((e95.t) this).getCount() == 0 || this.f250441d == -1;
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        return this.f250443f;
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
        return this.f250441d == 0 && ((e95.t) this).getCount() != 0;
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        int count = ((e95.t) this).getCount();
        return this.f250441d == count + (-1) && count != 0;
    }

    @Override // android.database.Cursor
    public boolean move(int i17) {
        return moveToPosition(this.f250441d + i17);
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        return moveToPosition(0);
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        return moveToPosition(((e95.t) this).getCount() - 1);
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        return moveToPosition(this.f250441d + 1);
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int i17) {
        e95.t tVar = (e95.t) this;
        int count = tVar.getCount();
        if (i17 >= count) {
            this.f250441d = count;
            return false;
        }
        if (i17 < 0) {
            this.f250441d = -1;
            return false;
        }
        int i18 = this.f250441d;
        if (i17 == i18) {
            return true;
        }
        tVar.onMove(i18, i17);
        this.f250441d = i17;
        int i19 = this.f250442e;
        if (i19 != -1) {
            tVar.getLong(i19);
        }
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        return moveToPosition(this.f250441d - 1);
    }

    @Override // android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        this.f250450p.registerObserver(observer);
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        this.f250449o.registerObserver(observer);
    }

    @Override // android.database.Cursor
    public boolean requery() {
        android.content.ContentResolver contentResolver;
        if (!this.f250448n) {
            android.net.Uri uri = this.f250445h;
            android.database.ContentObserver contentObserver = this.f250447m;
            if (uri != null && contentObserver != null && (contentResolver = this.f250444g) != null) {
                contentResolver.registerContentObserver(uri, true, contentObserver);
            }
            this.f250448n = true;
        }
        this.f250449o.notifyChanged();
        return true;
    }

    @Override // android.database.Cursor
    public android.os.Bundle respond(android.os.Bundle extras) {
        kotlin.jvm.internal.o.g(extras, "extras");
        android.os.Bundle EMPTY = android.os.Bundle.EMPTY;
        kotlin.jvm.internal.o.f(EMPTY, "EMPTY");
        return EMPTY;
    }

    @Override // android.database.Cursor
    public void setExtras(android.os.Bundle EMPTY) {
        if (EMPTY == null) {
            EMPTY = android.os.Bundle.EMPTY;
            kotlin.jvm.internal.o.f(EMPTY, "EMPTY");
        }
        this.f250451q = EMPTY;
    }

    @Override // android.database.Cursor
    public void setNotificationUri(android.content.ContentResolver cr6, android.net.Uri notifyUri) {
        android.content.ContentResolver contentResolver;
        kotlin.jvm.internal.o.g(cr6, "cr");
        kotlin.jvm.internal.o.g(notifyUri, "notifyUri");
        synchronized (this.f250446i) {
            this.f250445h = notifyUri;
            this.f250444g = cr6;
            android.database.ContentObserver contentObserver = this.f250447m;
            if (contentObserver != null) {
                cr6.unregisterContentObserver(contentObserver);
            }
            e95.q qVar = new e95.q(this);
            this.f250447m = qVar;
            android.net.Uri uri = this.f250445h;
            if (uri != null && (contentResolver = this.f250444g) != null) {
                contentResolver.registerContentObserver(uri, true, qVar);
            }
            this.f250448n = true;
        }
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        if (this.f250443f) {
            return;
        }
        this.f250450p.unregisterObserver(observer);
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        this.f250449o.unregisterObserver(observer);
    }
}
