package tv4;

/* loaded from: classes12.dex */
public final class e extends jv4.q {

    /* renamed from: b, reason: collision with root package name */
    public final rv4.x f422365b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(rv4.x data) {
        super(jv4.m.f302251q);
        kotlin.jvm.internal.o.g(data, "data");
        this.f422365b = data;
    }

    @Override // jv4.j
    public int a() {
        return 1;
    }

    @Override // jv4.n
    public void c(androidx.recyclerview.widget.k3 holder) {
        android.widget.TextView i17;
        android.widget.TextView i18;
        android.widget.TextView i19;
        android.widget.TextView i27;
        kotlin.jvm.internal.o.g(holder, "holder");
        qv4.b0 b0Var = holder instanceof qv4.b0 ? (qv4.b0) holder : null;
        if (!this.f422365b.f400562c) {
            i17 = b0Var != null ? b0Var.i() : null;
            if (i17 != null) {
                i17.setClickable(false);
            }
            if (b0Var == null || (i18 = b0Var.i()) == null) {
                return;
            }
            i18.setTextColor(0);
            return;
        }
        i17 = b0Var != null ? b0Var.i() : null;
        if (i17 != null) {
            i17.setClickable(true);
        }
        if (b0Var != null && (i27 = b0Var.i()) != null) {
            i27.setTextColor(b0Var.itemView.getResources().getColor(com.tencent.mm.R.color.f478524a5));
        }
        if (b0Var == null || (i19 = b0Var.i()) == null) {
            return;
        }
        i19.setOnClickListener(new tv4.d(this));
    }

    @Override // nv4.g
    public java.lang.String v() {
        return this.f422365b.v();
    }

    @Override // nv4.g
    public void w() {
        this.f422365b.w();
    }
}
