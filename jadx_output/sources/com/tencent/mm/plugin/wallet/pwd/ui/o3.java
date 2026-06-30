package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class o3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f179045d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f179046e;

    public o3(android.content.Context context) {
        this.f179045d = context;
    }

    public void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUniversalPayOrderUI", "swipe: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f179046e.add(i18, (r45.pr6) this.f179046e.remove(i17));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f179046e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.List list = this.f179046e;
        if (list == null) {
            return null;
        }
        return (r45.pr6) list.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = android.view.LayoutInflater.from(this.f179045d).inflate(com.tencent.mm.R.layout.d6a, viewGroup, false);
            view.setTag(new com.tencent.mm.plugin.wallet.pwd.ui.p3(view));
        }
        java.util.List list = this.f179046e;
        r45.pr6 pr6Var = list == null ? null : (r45.pr6) list.get(i17);
        com.tencent.mm.plugin.wallet.pwd.ui.p3 p3Var = (com.tencent.mm.plugin.wallet.pwd.ui.p3) view.getTag();
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = p3Var.f179056b;
        cdnImageView.setImageBitmap(null);
        cdnImageView.b(pr6Var.f383341e, 0, 0, com.tencent.mm.R.drawable.f482190b84);
        p3Var.f179057c.setText(pr6Var.f383342f);
        return view;
    }
}
