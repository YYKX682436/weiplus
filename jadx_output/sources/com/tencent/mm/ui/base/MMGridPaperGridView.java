package com.tencent.mm.ui.base;

/* loaded from: classes8.dex */
public final class MMGridPaperGridView extends android.widget.GridView {

    /* renamed from: d, reason: collision with root package name */
    public int f197418d;

    /* renamed from: e, reason: collision with root package name */
    public int f197419e;

    /* renamed from: f, reason: collision with root package name */
    public int f197420f;

    /* renamed from: g, reason: collision with root package name */
    public int f197421g;

    /* renamed from: h, reason: collision with root package name */
    public int f197422h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f197423i;

    /* renamed from: m, reason: collision with root package name */
    public db5.y2 f197424m;

    /* renamed from: n, reason: collision with root package name */
    public db5.v2 f197425n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemClickListener f197426o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemLongClickListener f197427p;

    public MMGridPaperGridView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f197422h = -1;
        this.f197423i = false;
        this.f197426o = new db5.w2(this);
        this.f197427p = new db5.x2(this);
    }

    public void b(int i17, int i18, int i19, db5.v2 v2Var) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = java.lang.Integer.valueOf(i19);
        objArr[3] = java.lang.Boolean.valueOf(v2Var == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMGridPaperGridView", "index[%d], rows[%d], columns[%d], adapter is null[%B]", objArr);
        this.f197418d = i17;
        this.f197419e = i19;
        this.f197425n = v2Var;
        int i27 = i18 * i19;
        this.f197420f = i27;
        this.f197421g = i17 * i27;
        if (v2Var != null && ((za3.b) v2Var).f470889b.size() - this.f197421g < this.f197420f) {
            this.f197420f = ((za3.b) this.f197425n).f470889b.size() - this.f197421g;
        }
        if (getAdapter() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMGridPaperGridView", "get adapter null, new one");
            db5.y2 y2Var = new db5.y2(this, null);
            this.f197424m = y2Var;
            setAdapter((android.widget.ListAdapter) y2Var);
        }
        setNumColumns(this.f197419e);
        setColumnWidth(3);
        setOnItemClickListener(this.f197426o);
        setOnItemLongClickListener(this.f197427p);
    }

    public int getIndex() {
        return this.f197418d;
    }

    public void setClearMode(boolean z17) {
        this.f197423i = z17;
    }

    public void setHiddenIndex(int i17) {
        this.f197422h = i17;
    }

    public MMGridPaperGridView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197422h = -1;
        this.f197423i = false;
        this.f197426o = new db5.w2(this);
        this.f197427p = new db5.x2(this);
    }
}
