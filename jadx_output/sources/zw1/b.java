package zw1;

/* loaded from: classes9.dex */
public class b extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f476580d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f476581e = new java.util.ArrayList();

    public b(android.content.Context context) {
        this.f476580d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f476581e).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return ((java.util.ArrayList) this.f476581e).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.content.Context context = this.f476580d;
        if (view == null) {
            view = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488631z1, viewGroup, false);
            view.setTag(new zw1.a(view));
        }
        ww1.g gVar = (ww1.g) ((java.util.ArrayList) this.f476581e).get(i17);
        zw1.a aVar = (zw1.a) view.getTag();
        aVar.f476567a.setText(new java.text.SimpleDateFormat(context.getString(com.tencent.mm.R.string.b9i)).format(new java.util.Date(gVar.f450189c * 1000)));
        aVar.f476568b.setText(ww1.d0.b(gVar.f450191e));
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(gVar.f450190d);
        android.widget.TextView textView = aVar.f476569c;
        if (K0) {
            textView.setVisibility(8);
        } else {
            textView.setText(gVar.f450190d);
            textView.setVisibility(0);
        }
        return view;
    }
}
