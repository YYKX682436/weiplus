package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class h extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f153291d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f153292e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f153293f;

    /* renamed from: g, reason: collision with root package name */
    public int f153294g = 1;

    public h(android.content.Context context) {
        this.f153291d = context;
    }

    public void a(android.app.Activity activity, android.view.View view, int i17) {
        com.tencent.mm.plugin.product.ui.i iVar = (com.tencent.mm.plugin.product.ui.i) view.getTag();
        com.tencent.mars.xlog.Log.i("MicroMsg.MallCustomActionAdapter", "onItemClick holder.type" + iVar.f153302f);
        com.tencent.mars.xlog.Log.i("MicroMsg.MallCustomActionAdapter", "onItemClick holder.content" + iVar.f153303g);
        int i18 = iVar.f153302f;
        if (i18 != 0) {
            if (i18 == 1) {
                java.lang.Object obj = iVar.f153303g;
                if (obj instanceof java.lang.String) {
                    com.tencent.mm.wallet_core.ui.r1.W(this.f153291d, (java.lang.String) obj, false, 10000);
                    return;
                }
                return;
            }
            if (i18 == 2) {
                java.lang.Object obj2 = iVar.f153303g;
                if (obj2 instanceof java.util.ArrayList) {
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.product.ui.MallGalleryUI.class);
                    intent.putExtra("keys_img_urls", (java.util.ArrayList) obj2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/product/ui/MallCustomActionAdapter", "onItemClick", "(Landroid/app/Activity;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activity.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activity, "com/tencent/mm/plugin/product/ui/MallCustomActionAdapter", "onItemClick", "(Landroid/app/Activity;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                }
                return;
            }
            if (i18 != 4) {
                if (i18 == 5) {
                    if (((java.lang.Boolean) ((java.util.ArrayList) this.f153293f).get(i17)).booleanValue()) {
                        ((java.util.ArrayList) this.f153293f).set(i17, java.lang.Boolean.FALSE);
                    } else {
                        ((java.util.ArrayList) this.f153293f).set(i17, java.lang.Boolean.TRUE);
                    }
                    notifyDataSetChanged();
                    return;
                }
                if (i18 != 6) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MallCustomActionAdapter", "not support type");
                    return;
                }
            }
            java.lang.Object obj3 = iVar.f153303g;
            if (obj3 instanceof java.lang.String) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, iVar.f153301e);
                intent2.putExtra("neverGetA8Key", false);
                intent2.putExtra("showShare", false);
                intent2.putExtra("show_bottom", false);
                intent2.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, (java.lang.String) obj3);
                intent2.putExtra("QRDataFlag", false);
                com.tencent.mm.wallet_core.ui.r1.T(activity, intent2);
            }
        }
    }

    public void c(java.util.List list) {
        this.f153292e = list;
        this.f153294g = 0;
        this.f153293f = new java.util.ArrayList();
        if (this.f153292e != null) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                xq3.a aVar = (xq3.a) it.next();
                this.f153293f.add(java.lang.Boolean.FALSE);
                hashSet.add(java.lang.Integer.valueOf(aVar.f456054f));
            }
            this.f153294g = list.size();
        }
        if (this.f153294g < 1) {
            this.f153294g = 1;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f153292e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (xq3.a) this.f153292e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return ((xq3.a) this.f153292e.get(i17)).f456054f;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.product.ui.i iVar;
        if (view == null) {
            view = android.view.View.inflate(this.f153291d, com.tencent.mm.R.layout.cad, null);
            iVar = new com.tencent.mm.plugin.product.ui.i();
            iVar.f153297a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.odf);
            iVar.f153298b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.nsf);
            iVar.f153299c = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f485338hc3);
            iVar.f153300d = (com.tencent.mm.plugin.product.ui.HtmlTextView) view.findViewById(com.tencent.mm.R.id.cw6);
            view.setTag(iVar);
        } else {
            iVar = (com.tencent.mm.plugin.product.ui.i) view.getTag();
        }
        xq3.a aVar = (xq3.a) this.f153292e.get(i17);
        if (aVar != null) {
            iVar.f153297a.setText(aVar.f456052d);
            iVar.f153298b.setText(aVar.f456053e);
            int i18 = aVar.f456054f;
            iVar.f153302f = i18;
            iVar.f153303g = aVar.f456055g;
            iVar.f153301e = aVar.f456052d;
            if (i18 == 0) {
                iVar.f153299c.setVisibility(8);
            } else if (i18 == 5 || i18 == 6) {
                if (((java.lang.Boolean) ((java.util.ArrayList) this.f153293f).get(i17)).booleanValue()) {
                    iVar.f153300d.setVisibility(0);
                } else {
                    iVar.f153300d.setVisibility(8);
                }
                if (!iVar.f153300d.getText().equals(aVar.f456055g)) {
                    iVar.f153300d.setText(aVar.f456055g);
                }
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return this.f153294g;
    }
}
