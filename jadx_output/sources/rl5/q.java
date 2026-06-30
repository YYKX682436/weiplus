package rl5;

/* loaded from: classes15.dex */
public class q extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rl5.r f397331d;

    public q(rl5.r rVar, rl5.e eVar) {
        this.f397331d = rVar;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f397331d.f397356z.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (java.lang.String) ((android.view.MenuItem) ((java.util.ArrayList) this.f397331d.f397356z.f228344d).get(i17)).getTitle();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        rl5.p pVar;
        rl5.r rVar = this.f397331d;
        boolean z17 = rVar.F;
        android.view.LayoutInflater layoutInflater = rVar.f397337e;
        android.widget.TextView textView = null;
        if (z17) {
            if (view == null) {
                view = layoutInflater.inflate(com.tencent.mm.R.layout.c_9, viewGroup, false);
                pVar = new rl5.p(this, null);
                pVar.f397329a = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.h5n);
                pVar.f397330b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc);
                view.setTag(pVar);
            } else {
                pVar = (rl5.p) view.getTag();
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = pVar.f397329a;
            if (weImageView != null) {
                weImageView.setImageDrawable(((android.view.MenuItem) ((java.util.ArrayList) rVar.f397356z.f228344d).get(i17)).getIcon());
            }
            android.widget.TextView textView2 = pVar.f397330b;
            if (textView2 != null) {
                textView2.setText(((android.view.MenuItem) ((java.util.ArrayList) rVar.f397356z.f228344d).get(i17)).getTitle());
            }
            return view;
        }
        if (view == null) {
            textView = (android.widget.TextView) layoutInflater.inflate(com.tencent.mm.R.layout.c_a, viewGroup, false);
        } else if (view instanceof android.widget.TextView) {
            textView = (android.widget.TextView) view;
        }
        java.lang.String str = (java.lang.String) ((android.view.MenuItem) ((java.util.ArrayList) rVar.f397356z.f228344d).get(i17)).getTitle();
        if (textView != null) {
            textView.setTag(str);
            textView.setText(str);
            textView.setBackgroundResource(com.tencent.mm.R.drawable.auo);
        }
        if (rVar.U && rVar.T != 0) {
            textView.setTextColor(rVar.f397336d.getResources().getColor(rVar.T));
        }
        db5.r4 r4Var = rVar.f397352v;
        if (r4Var != null) {
            r4Var.a(textView, i17, (android.view.MenuItem) ((java.util.ArrayList) rVar.f397356z.f228344d).get(i17));
        }
        return textView;
    }
}
