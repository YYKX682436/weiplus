package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public abstract class i6 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f147017d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f147018e;

    public i6(android.content.Context context) {
        this.f147018e = android.view.LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.luckymoney.model.o4 getItem(int i17) {
        return (com.tencent.mm.plugin.luckymoney.model.o4) this.f147017d.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f147017d.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }
}
