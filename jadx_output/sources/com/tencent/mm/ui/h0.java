package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class h0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AllRemindMsgUI f208766d;

    public h0(com.tencent.mm.ui.AllRemindMsgUI allRemindMsgUI) {
        this.f208766d = allRemindMsgUI;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.LinkedList linkedList = this.f208766d.f196573h;
        if (linkedList == null) {
            return 0;
        }
        return linkedList.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.ui.AllRemindMsgUI allRemindMsgUI = this.f208766d;
        com.tencent.mm.ui.o0 o0Var = (com.tencent.mm.ui.o0) allRemindMsgUI.f196573h.get(i17);
        com.tencent.mm.ui.n0 n0Var = (com.tencent.mm.ui.n0) k3Var;
        n0Var.f209390d.setTag(o0Var);
        android.widget.TextView textView = n0Var.f209393g;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity context = allRemindMsgUI.getContext();
        java.lang.String str = o0Var.f209435b;
        float textSize = n0Var.f209393g.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        android.widget.TextView textView2 = n0Var.f209391e;
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity context2 = allRemindMsgUI.getContext();
        java.lang.String str2 = o0Var.f209436c;
        float textSize2 = n0Var.f209391e.getTextSize();
        ((ke0.e) xVar2).getClass();
        textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, str2, textSize2));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = o0Var.f209437d;
        if (j17 - currentTimeMillis < 60000) {
            n0Var.f209392f.setText(allRemindMsgUI.getContext().getString(com.tencent.mm.R.string.fci, 1));
        } else if (j17 - currentTimeMillis < 3600000) {
            n0Var.f209392f.setText(allRemindMsgUI.getContext().getString(com.tencent.mm.R.string.fci, java.lang.Long.valueOf((o0Var.f209437d - currentTimeMillis) / 60000)));
        } else if (j17 - currentTimeMillis < 10800000) {
            android.widget.TextView textView3 = n0Var.f209392f;
            androidx.appcompat.app.AppCompatActivity context3 = allRemindMsgUI.getContext();
            java.lang.Long valueOf = java.lang.Long.valueOf((o0Var.f209437d - currentTimeMillis) / 3600000);
            long j18 = o0Var.f209437d;
            textView3.setText(context3.getString(com.tencent.mm.R.string.fch, valueOf, java.lang.Long.valueOf(((j18 - currentTimeMillis) - (((j18 - currentTimeMillis) / 3600000) * 3600000)) / 60000)));
        } else {
            n0Var.f209392f.setText(k35.m1.f(allRemindMsgUI.getContext(), o0Var.f209437d, true, false));
        }
        if (o0Var.f209438e == 2) {
            n0Var.f209394h.setImageDrawable(allRemindMsgUI.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f480769bv3));
            return;
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(n0Var.f209394h, o0Var.f209434a, null);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new com.tencent.mm.ui.n0(this.f208766d, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.cdx, viewGroup, false));
    }
}
