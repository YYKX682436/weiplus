package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes8.dex */
public class f9 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f180275d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f180276e;

    /* renamed from: f, reason: collision with root package name */
    public at4.j1 f180277f = null;

    public f9(android.content.Context context, java.util.ArrayList arrayList) {
        this.f180276e = context;
        this.f180275d = arrayList;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public at4.j1 getItem(int i17) {
        if (this.f180275d == null || getCount() <= i17) {
            return null;
        }
        return (at4.j1) this.f180275d.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.ArrayList arrayList = this.f180275d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.wallet_core.ui.e9 e9Var;
        if (view == null) {
            view = android.view.View.inflate(this.f180276e, com.tencent.mm.R.layout.d8k, null);
            e9Var = new com.tencent.mm.plugin.wallet_core.ui.e9(this, null);
            e9Var.f180256a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc);
            e9Var.f180257b = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.mki);
            view.setTag(e9Var);
        } else {
            e9Var = (com.tencent.mm.plugin.wallet_core.ui.e9) view.getTag();
        }
        at4.j1 item = getItem(i17);
        if (item != null) {
            e9Var.f180256a.setText(item.field_wallet_name);
            if (item.field_wallet_selected == 1) {
                this.f180277f = item;
                e9Var.f180257b.setImageResource(com.tencent.mm.R.raw.radio_on);
            } else {
                e9Var.f180257b.setImageResource(com.tencent.mm.R.raw.radio_off);
            }
        }
        return view;
    }
}
