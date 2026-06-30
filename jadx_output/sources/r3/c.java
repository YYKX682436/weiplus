package r3;

/* loaded from: classes13.dex */
public abstract class c extends android.widget.BaseAdapter implements android.widget.Filterable, r3.d {

    /* renamed from: d, reason: collision with root package name */
    public boolean f368925d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f368926e;

    /* renamed from: f, reason: collision with root package name */
    public android.database.Cursor f368927f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f368928g;

    /* renamed from: h, reason: collision with root package name */
    public int f368929h;

    /* renamed from: i, reason: collision with root package name */
    public r3.a f368930i;

    /* renamed from: m, reason: collision with root package name */
    public android.database.DataSetObserver f368931m;

    /* renamed from: n, reason: collision with root package name */
    public r3.e f368932n;

    public c(android.content.Context context, android.database.Cursor cursor, boolean z17) {
        int i17 = z17 ? 1 : 2;
        if ((i17 & 1) == 1) {
            i17 |= 2;
            this.f368926e = true;
        } else {
            this.f368926e = false;
        }
        boolean z18 = cursor != null;
        this.f368927f = cursor;
        this.f368925d = z18;
        this.f368928g = context;
        this.f368929h = z18 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i17 & 2) == 2) {
            this.f368930i = new r3.a(this);
            this.f368931m = new r3.b(this);
        } else {
            this.f368930i = null;
            this.f368931m = null;
        }
        if (z18) {
            r3.a aVar = this.f368930i;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            android.database.DataSetObserver dataSetObserver = this.f368931m;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract void a(android.view.View view, android.content.Context context, android.database.Cursor cursor);

    public void c(android.database.Cursor cursor) {
        android.database.Cursor cursor2 = this.f368927f;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                r3.a aVar = this.f368930i;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                android.database.DataSetObserver dataSetObserver = this.f368931m;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f368927f = cursor;
            if (cursor != null) {
                r3.a aVar2 = this.f368930i;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                android.database.DataSetObserver dataSetObserver2 = this.f368931m;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f368929h = cursor.getColumnIndexOrThrow("_id");
                this.f368925d = true;
                notifyDataSetChanged();
            } else {
                this.f368929h = -1;
                this.f368925d = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract java.lang.CharSequence d(android.database.Cursor cursor);

    public abstract android.view.View f(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        android.database.Cursor cursor;
        if (!this.f368925d || (cursor = this.f368927f) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        if (!this.f368925d) {
            return null;
        }
        this.f368927f.moveToPosition(i17);
        if (view == null) {
            r3.f fVar = (r3.f) this;
            view = fVar.f368936q.inflate(fVar.f368935p, viewGroup, false);
        }
        a(view, this.f368928g, this.f368927f);
        return view;
    }

    @Override // android.widget.Filterable
    public android.widget.Filter getFilter() {
        if (this.f368932n == null) {
            this.f368932n = new r3.e(this);
        }
        return this.f368932n;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        android.database.Cursor cursor;
        if (!this.f368925d || (cursor = this.f368927f) == null) {
            return null;
        }
        cursor.moveToPosition(i17);
        return this.f368927f;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        android.database.Cursor cursor;
        if (this.f368925d && (cursor = this.f368927f) != null && cursor.moveToPosition(i17)) {
            return this.f368927f.getLong(this.f368929h);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        if (!this.f368925d) {
            throw new java.lang.IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f368927f.moveToPosition(i17)) {
            throw new java.lang.IllegalStateException("couldn't move cursor to position " + i17);
        }
        if (view == null) {
            view = f(this.f368928g, this.f368927f, viewGroup);
        }
        a(view, this.f368928g, this.f368927f);
        return view;
    }
}
