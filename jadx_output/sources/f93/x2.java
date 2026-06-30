package f93;

/* loaded from: classes9.dex */
public class x2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f260503d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f260504e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f260505f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f260506g = new android.util.SparseArray();

    public x2(android.content.Context context) {
        this.f260503d = context;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.String getItem(int i17) {
        if (this.f260505f == null || i17 >= getCount()) {
            return null;
        }
        return (java.lang.String) this.f260505f.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.ArrayList arrayList = this.f260505f;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        f93.d5 d5Var;
        android.content.Context context = this.f260503d;
        if (view == null || view.getTag() == null) {
            view = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a2c, viewGroup, false);
            d5Var = new f93.d5(view);
            view.setTag(d5Var);
        } else {
            d5Var = (f93.d5) view.getTag();
        }
        com.tencent.mm.ui.widget.MMTextView mMTextView = d5Var.f260313d;
        java.lang.String item = getItem(i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (item == null) {
            item = "";
        }
        int textSize = (int) d5Var.f260313d.getTextSize();
        int hashCode = item.hashCode();
        android.util.SparseArray sparseArray = this.f260506g;
        android.text.SpannableString spannableString = (android.text.SpannableString) sparseArray.get(hashCode);
        if (spannableString == null) {
            spannableString = new android.text.SpannableString(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, item, textSize));
            int indexOf = item.indexOf(this.f260504e);
            if (indexOf == -1) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelSearchAdapter", "hight light %s error.", item);
            } else {
                int length = this.f260504e.length() + indexOf;
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.aaq)), indexOf, length, 33);
                spannableString.setSpan(new android.text.style.StyleSpan(1), indexOf, length, 33);
                sparseArray.put(hashCode, spannableString);
            }
        }
        mMTextView.setText(spannableString);
        return view;
    }
}
