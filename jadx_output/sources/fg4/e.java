package fg4;

/* loaded from: classes8.dex */
public class e extends android.widget.BaseAdapter implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f262470d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f262471e = false;

    /* renamed from: f, reason: collision with root package name */
    public final int f262472f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f262473g;

    public e(android.content.Context context, int i17) {
        this.f262472f = 0;
        this.f262470d = context;
        this.f262472f = i17;
        a();
    }

    public final void a() {
        this.f262473g = new java.util.ArrayList();
        com.tencent.mm.pluginsdk.model.app.z Di = com.tencent.mm.pluginsdk.model.app.u5.Di();
        Di.getClass();
        android.database.Cursor rawQuery = Di.rawQuery("select * from AppInfo where status = " + this.f262472f + " and (appType is null or appType not like ',1,')", new java.lang.String[0]);
        if (rawQuery == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoStorage", "getAppByStatusExcludeByType: curosr is null");
            rawQuery = null;
        }
        if (rawQuery != null) {
            int count = rawQuery.getCount();
            for (int i17 = 0; i17 < count; i17++) {
                rawQuery.moveToPosition(i17);
                com.tencent.mm.pluginsdk.model.app.m mVar = new com.tencent.mm.pluginsdk.model.app.m();
                mVar.convertFrom(rawQuery);
                lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                java.lang.String str = mVar.field_appId;
                ((kt.c) i0Var).getClass();
                if (com.tencent.mm.pluginsdk.model.app.w.r(this.f262470d, str)) {
                    this.f262473g.add(mVar);
                }
            }
            rawQuery.close();
        }
    }

    public boolean c(int i17) {
        int size = ((java.util.ArrayList) this.f262473g).size();
        return i17 >= size && i17 < size + ((4 - (((java.util.ArrayList) this.f262473g).size() % 4)) % 4);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f262473g).size() + ((4 - (((java.util.ArrayList) this.f262473g).size() % 4)) % 4);
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        if (c(i17)) {
            return null;
        }
        return ((java.util.ArrayList) this.f262473g).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        fg4.s sVar;
        android.view.View view2;
        android.content.Context context = this.f262470d;
        if (view == null) {
            sVar = new fg4.s();
            view2 = android.view.View.inflate(context, com.tencent.mm.R.layout.f488128hx, null);
            sVar.f262491a = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.a3c);
            sVar.f262492b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.a3b);
            sVar.f262493c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.a3d);
            sVar.f262494d = view2.findViewById(com.tencent.mm.R.id.a3e);
            view2.setTag(sVar);
        } else {
            sVar = (fg4.s) view.getTag();
            view2 = view;
        }
        android.view.View view3 = sVar.f262494d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/openapi/AppAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/subapp/ui/openapi/AppAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (c(i17)) {
            sVar.f262491a.setVisibility(4);
            sVar.f262492b.setVisibility(4);
            sVar.f262493c.setVisibility(4);
            return view2;
        }
        com.tencent.mm.pluginsdk.model.app.m mVar = (com.tencent.mm.pluginsdk.model.app.m) getItem(i17);
        sVar.f262491a.setVisibility(0);
        android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(mVar.field_appId, 1, i65.a.g(context));
        if (Di == null) {
            sVar.f262491a.setBackgroundResource(com.tencent.mm.R.drawable.f480849bg4);
        } else {
            sVar.f262491a.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(Di));
        }
        sVar.f262493c.setVisibility(0);
        sVar.f262493c.setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(context, mVar));
        if (this.f262471e) {
            sVar.f262492b.setVisibility(0);
        } else {
            sVar.f262492b.setVisibility(8);
        }
        return view2;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        a();
        notifyDataSetChanged();
    }
}
