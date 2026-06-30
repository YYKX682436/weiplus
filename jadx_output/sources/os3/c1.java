package os3;

/* loaded from: classes8.dex */
public class c1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public os3.a1 f348050d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f348051e = null;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI f348052f;

    public c1(com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI compressPreviewUI, os3.u0 u0Var) {
        this.f348052f = compressPreviewUI;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public os3.a1 getItem(int i17) {
        java.util.List list = this.f348051e;
        if (list == null || list.size() <= i17) {
            return null;
        }
        return (os3.a1) this.f348051e.get(i17);
    }

    public java.lang.String c() {
        java.lang.String str;
        os3.a1 a1Var = this.f348050d;
        if (a1Var != null && (str = a1Var.f348028c) != null) {
            if (str.length() == 0) {
                return "";
            }
            os3.a1 a1Var2 = this.f348050d;
            int indexOf = a1Var2.f348026a.indexOf(a1Var2.f348028c);
            if (indexOf >= 0) {
                return this.f348050d.f348026a.substring(0, indexOf) + this.f348050d.f348028c;
            }
        }
        return null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f348051e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = android.view.View.inflate(this.f348052f.getContext(), com.tencent.mm.R.layout.bvi, null);
            os3.b1 b1Var = new os3.b1(this, null);
            b1Var.f348037a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f484377e26);
            b1Var.f348038b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.e2b);
            b1Var.f348039c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.e2g);
            b1Var.f348040d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.e2h);
            view.setTag(b1Var);
        }
        os3.b1 b1Var2 = (os3.b1) view.getTag();
        os3.a1 item = getItem(i17);
        if (i17 != 0 || c() == null) {
            b1Var2.f348037a.setImageResource(item.f348029d == 1 ? com.tencent.mm.R.drawable.blm : o25.y.b(item.f348027b));
        } else {
            b1Var2.f348037a.setImageResource(com.tencent.mm.R.drawable.bll);
        }
        b1Var2.f348040d.setVisibility(item.f348031f ? 0 : 4);
        b1Var2.f348038b.setText(item.f348027b);
        b1Var2.f348039c.setText(item.f348030e);
        return view;
    }
}
