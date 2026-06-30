package on2;

/* loaded from: classes3.dex */
public final class j1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f346945d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f346946e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f346947f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.q f346948g;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f346945d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.atw, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new on2.z0(this, inflate);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e0  */
    @Override // androidx.recyclerview.widget.f2
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(on2.z0 r17, int r18) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: on2.j1.onBindViewHolder(on2.z0, int):void");
    }

    public final void y(android.widget.TextView textView, int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryPanelListAdapter", "setStatusBtn haveJoinLive:" + this.f346946e + ", status:" + i17 + ",statusWording:" + str + '!');
        if (!this.f346946e) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        if (str == null || str.length() == 0) {
            textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.dpo));
            textView.setEnabled(false);
            return;
        }
        if (i17 == 0) {
            textView.setText(str);
            textView.setEnabled(true);
            return;
        }
        if (i17 == 1) {
            textView.setText(str);
            textView.setEnabled(false);
        } else if (i17 == 2) {
            textView.setText(str);
            textView.setEnabled(true);
        } else {
            if (i17 != 3) {
                return;
            }
            textView.setText(str);
            textView.setEnabled(true);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        on2.z0 holder = (on2.z0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i17);
            return;
        }
        for (java.lang.Object obj : payloads) {
            if ((obj instanceof java.lang.Integer) && kotlin.jvm.internal.o.b(obj, 1)) {
                android.widget.TextView textView = holder.f347084i;
                kotlin.jvm.internal.o.f(textView, "<get-status>(...)");
                java.util.ArrayList arrayList = this.f346945d;
                int integer = ((r45.dz1) arrayList.get(i17)).getInteger(7);
                java.lang.String string = ((r45.dz1) arrayList.get(i17)).getString(8);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (string == null) {
                    string = "";
                }
                y(textView, integer, string);
            }
        }
    }
}
