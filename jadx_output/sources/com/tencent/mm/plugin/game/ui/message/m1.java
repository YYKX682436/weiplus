package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public abstract class m1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public android.database.Cursor f141587d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f141588e;

    /* renamed from: f, reason: collision with root package name */
    public final android.database.DataSetObserver f141589f;

    public m1(android.content.Context context, android.database.Cursor cursor) {
        this.f141587d = cursor;
        this.f141588e = cursor != null;
        com.tencent.mm.plugin.game.ui.message.l1 l1Var = new com.tencent.mm.plugin.game.ui.message.l1(this, null);
        this.f141589f = l1Var;
        android.database.Cursor cursor2 = this.f141587d;
        if (cursor2 != null) {
            cursor2.registerDataSetObserver(l1Var);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        android.database.Cursor cursor;
        if (!this.f141588e || (cursor = this.f141587d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        if (!this.f141588e) {
            throw new java.lang.IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f141587d.moveToPosition(i17)) {
            y(k3Var, this.f141587d);
        } else {
            throw new java.lang.IllegalStateException("couldn't move cursor to position " + i17);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public void setHasStableIds(boolean z17) {
        super.setHasStableIds(true);
    }

    public void x(android.database.Cursor cursor) {
        android.database.Cursor cursor2 = this.f141587d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            android.database.DataSetObserver dataSetObserver = this.f141589f;
            if (cursor2 != null && dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
            this.f141587d = cursor;
            if (cursor != null) {
                if (dataSetObserver != null) {
                    cursor.registerDataSetObserver(dataSetObserver);
                }
                this.f141588e = true;
                notifyDataSetChanged();
            } else {
                this.f141588e = false;
                notifyDataSetChanged();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract void y(androidx.recyclerview.widget.k3 k3Var, android.database.Cursor cursor);
}
