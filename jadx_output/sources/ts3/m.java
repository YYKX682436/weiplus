package ts3;

/* loaded from: classes4.dex */
public class m extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final int[] f421680d = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192};

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f421681e;

    /* renamed from: f, reason: collision with root package name */
    public int f421682f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String[] f421683g;

    /* renamed from: h, reason: collision with root package name */
    public int f421684h;

    public m(android.content.Context context, int i17) {
        this.f421683g = null;
        int i18 = 0;
        this.f421684h = 0;
        this.f421681e = context;
        this.f421682f = i17;
        this.f421683g = context.getString(com.tencent.mm.R.string.hrk).split(";");
        int i19 = 0;
        while (true) {
            int[] iArr = this.f421680d;
            if (i18 >= iArr.length) {
                this.f421684h = i19;
                return;
            } else {
                if ((iArr[i18] & i17) != 0) {
                    i19++;
                }
                i18++;
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f421683g.length;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f421683g[i17];
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        ts3.l lVar;
        if (view == null) {
            lVar = new ts3.l();
            view2 = android.view.View.inflate(this.f421681e, com.tencent.mm.R.layout.cc8, null);
            lVar.f421678a = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.ljq);
            lVar.f421679b = (android.widget.CheckBox) view2.findViewById(com.tencent.mm.R.id.ljp);
            view2.setTag(lVar);
        } else {
            view2 = view;
            lVar = (ts3.l) view.getTag();
        }
        lVar.f421678a.setText(this.f421683g[i17]);
        lVar.f421679b.setChecked((this.f421680d[i17] & this.f421682f) != 0);
        return view2;
    }
}
