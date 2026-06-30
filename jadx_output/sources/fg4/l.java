package fg4;

/* loaded from: classes8.dex */
public class l extends android.widget.BaseAdapter implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f262479d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f262480e = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f262481f;

    public l(android.content.Context context, java.util.List list) {
        this.f262479d = context;
        this.f262481f = list;
    }

    public boolean a(int i17) {
        java.util.List list = this.f262481f;
        int size = list.size();
        return i17 >= size && i17 < size + ((4 - (list.size() % 4)) % 4);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f262481f;
        return list.size() + ((4 - (list.size() % 4)) % 4);
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        if (a(i17)) {
            return null;
        }
        return this.f262481f.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        fg4.p pVar;
        android.view.View view2;
        android.content.Context context = this.f262479d;
        if (view == null) {
            pVar = new fg4.p();
            view2 = android.view.View.inflate(context, com.tencent.mm.R.layout.f488128hx, null);
            pVar.f262485a = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.a3c);
            pVar.f262486b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.a3b);
            pVar.f262487c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.a3d);
            pVar.f262488d = view2.findViewById(com.tencent.mm.R.id.a3e);
            view2.setTag(pVar);
        } else {
            pVar = (fg4.p) view.getTag();
            view2 = view;
        }
        android.view.View view3 = pVar.f262488d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/openapi/ServiceAppAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/subapp/ui/openapi/ServiceAppAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (a(i17)) {
            pVar.f262485a.setVisibility(4);
            pVar.f262486b.setVisibility(4);
            pVar.f262487c.setVisibility(4);
            return view2;
        }
        com.tencent.mm.pluginsdk.model.app.m mVar = (com.tencent.mm.pluginsdk.model.app.m) getItem(i17);
        pVar.f262485a.setVisibility(0);
        android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(mVar.field_appId, 5, i65.a.g(context));
        if (Di == null) {
            pVar.f262485a.setBackgroundResource(com.tencent.mm.R.drawable.f480849bg4);
        } else {
            pVar.f262485a.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(Di));
        }
        pVar.f262487c.setVisibility(0);
        pVar.f262487c.setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(context, mVar));
        if (this.f262480e) {
            pVar.f262486b.setVisibility(0);
        } else {
            pVar.f262486b.setVisibility(8);
        }
        return view2;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        notifyDataSetChanged();
    }
}
