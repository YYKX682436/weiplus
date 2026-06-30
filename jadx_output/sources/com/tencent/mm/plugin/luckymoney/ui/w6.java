package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class w6 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f147635d;

    /* renamed from: e, reason: collision with root package name */
    public int f147636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI f147637f;

    public w6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI luckyMoneyMyRecordUI) {
        this.f147637f = luckyMoneyMyRecordUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f147635d.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (java.lang.String) this.f147635d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) android.view.LayoutInflater.from(this.f147637f.getContext()).inflate(com.tencent.mm.R.layout.f489625d70, viewGroup, false);
        checkedTextView.setText((java.lang.String) this.f147635d.get(i17));
        if (i17 == this.f147636e) {
            checkedTextView.setChecked(true);
        } else {
            checkedTextView.setChecked(false);
        }
        return checkedTextView;
    }
}
