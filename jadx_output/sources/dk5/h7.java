package dk5;

/* loaded from: classes12.dex */
public class h7 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final dk5.g7[] f234661d = {new dk5.g7(this, com.tencent.mm.R.string.bmb, com.tencent.mm.R.raw.share_to_friend_icon), new dk5.g7(this, com.tencent.mm.R.string.bmc, com.tencent.mm.R.raw.find_more_friend_photograph_icon), new dk5.g7(this, com.tencent.mm.R.string.bma, com.tencent.mm.R.raw.more_my_favorite)};

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.ShareImageSelectorUI f234662e;

    public h7(com.tencent.mm.ui.transmit.ShareImageSelectorUI shareImageSelectorUI) {
        this.f234662e = shareImageSelectorUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return 3;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f234661d[i17];
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        dk5.i7 i7Var;
        if (view == null || view.getTag() == null) {
            com.tencent.mm.ui.transmit.ShareImageSelectorUI shareImageSelectorUI = this.f234662e;
            android.view.View inflate = android.view.LayoutInflater.from(shareImageSelectorUI.getContext()).inflate(com.tencent.mm.R.layout.f489461cn4, (android.view.ViewGroup) null);
            dk5.i7 i7Var2 = new dk5.i7(shareImageSelectorUI, inflate);
            view = inflate;
            i7Var = i7Var2;
        } else {
            i7Var = (dk5.i7) view.getTag();
        }
        dk5.g7 g7Var = this.f234661d[i17];
        if (g7Var != null) {
            i7Var.f234681b.setText(g7Var.f234643a);
            i7Var.f234680a.setImageResource(g7Var.f234644b);
        }
        return view;
    }
}
