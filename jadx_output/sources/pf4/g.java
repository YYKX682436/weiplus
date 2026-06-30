package pf4;

/* loaded from: classes4.dex */
public final class g extends pf4.h {
    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f353869d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        long j17;
        pf4.f holder = (pf4.f) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f353869d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        java.lang.String str = (java.lang.String) obj;
        if (kotlin.jvm.internal.o.b(str, "")) {
            return;
        }
        df4.a aVar = df4.b.f232038a;
        try {
            java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{"-"}, false, 0, 6, null);
            j17 = new java.util.GregorianCalendar(java.lang.Integer.parseInt((java.lang.String) f07.get(0)), java.lang.Integer.parseInt((java.lang.String) f07.get(1)) - 1, java.lang.Integer.parseInt((java.lang.String) f07.get(2))).getTimeInMillis();
        } catch (java.lang.Exception e17) {
            df4.a aVar2 = df4.b.f232038a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.StoryTimeUtil", e17, e17.getMessage(), new java.lang.Object[0]);
            j17 = 0;
        }
        java.lang.CharSequence format = android.text.format.DateFormat.format(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jms), j17);
        kotlin.jvm.internal.o.f(format, "format(...)");
        java.util.List f08 = r26.n0.f0(format, new java.lang.String[]{":"}, false, 0, 6, null);
        int size = f08.size();
        android.widget.TextView textView = holder.f353864e;
        if (size == 3) {
            textView.setText(((java.lang.String) f08.get(1)) + ((java.lang.String) f08.get(2)));
        }
        pm0.v.c(textView);
        holder.f353863d.setBackground(null);
        holder.f353865f.setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.cwl, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new pf4.f(this, inflate);
    }
}
