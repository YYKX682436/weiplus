package com.tencent.mm.plugin.webview.ui.tools.widget.input;

/* loaded from: classes8.dex */
public class WebViewSmileyGrid extends android.widget.GridView {

    /* renamed from: d, reason: collision with root package name */
    public ey4.y f187312d;

    /* renamed from: e, reason: collision with root package name */
    public ey4.c0 f187313e;

    /* renamed from: f, reason: collision with root package name */
    public int f187314f;

    /* renamed from: g, reason: collision with root package name */
    public int f187315g;

    /* renamed from: h, reason: collision with root package name */
    public int f187316h;

    /* renamed from: i, reason: collision with root package name */
    public int f187317i;

    /* renamed from: m, reason: collision with root package name */
    public int f187318m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemClickListener f187319n;

    public WebViewSmileyGrid(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f187315g = 0;
        this.f187317i = 0;
        this.f187318m = 0;
        this.f187319n = new ey4.x(this);
    }

    private int getRowSpacing() {
        return this.f187317i;
    }

    public void b(int i17, int i18, int i19, int i27, int i28, int i29) {
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        setBackgroundResource(0);
        setStretchMode(2);
        setOnItemClickListener(this.f187319n);
        this.f187316h = i17;
        this.f187314f = i18;
        this.f187315g = i19;
        this.f187317i = i29;
        this.f187318m = i28;
        setNumColumns(i27);
        int rowSpacing = getRowSpacing();
        int b17 = i65.a.b(getContext(), 6);
        int b18 = i65.a.b(getContext(), 6);
        if (rowSpacing == 0) {
            rowSpacing = i65.a.b(getContext(), 6);
        }
        setPadding(b17, rowSpacing, b18, 0);
        ey4.y yVar = new ey4.y(this, null);
        this.f187312d = yVar;
        setAdapter((android.widget.ListAdapter) yVar);
        this.f187312d.notifyDataSetChanged();
    }

    public void setPanelManager(ey4.c0 c0Var) {
        this.f187313e = c0Var;
    }
}
