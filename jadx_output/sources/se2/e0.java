package se2;

/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.tb f406851a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f406852b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f406853c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f406854d;

    public e0(com.tencent.mm.plugin.finder.live.plugin.tb plugin) {
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f406851a = plugin;
        this.f406852b = "BoxCommentViewCallback";
        jz5.g b17 = jz5.h.b(new se2.c0(this));
        this.f406853c = b17;
        this.f406854d = jz5.h.b(new se2.d0(this));
        java.lang.Object value = ((jz5.n) b17).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.view.ViewGroup) value).setOnClickListener(new se2.b0(this));
    }

    public final androidx.lifecycle.c1 a(java.lang.Class bu6) {
        kotlin.jvm.internal.o.g(bu6, "bu");
        return this.f406851a.S0().a(bu6);
    }

    public final void b(long j17) {
        java.lang.String string;
        jz5.g gVar = this.f406853c;
        if (j17 <= 0) {
            java.lang.Object value = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            ((android.view.ViewGroup) value).setVisibility(8);
            return;
        }
        java.lang.Object value2 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((android.view.ViewGroup) value2).setVisibility(0);
        int i17 = ((mm2.e0) a(mm2.e0.class)).f328975r;
        jz5.g gVar2 = this.f406854d;
        com.tencent.mm.plugin.finder.live.plugin.tb tbVar = this.f406851a;
        if (i17 > 0) {
            java.lang.Object value3 = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value3, "getValue(...)");
            java.lang.String string2 = tbVar.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.d_j);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.String format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
            kotlin.jvm.internal.o.f(format, "format(...)");
            ((android.widget.TextView) value3).setText(format);
            return;
        }
        if (j17 <= 99) {
            string = java.lang.String.valueOf(j17);
        } else {
            string = tbVar.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.dyj);
            kotlin.jvm.internal.o.d(string);
        }
        java.lang.Object value4 = ((jz5.n) gVar2).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        java.lang.String string3 = tbVar.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.dzs);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        java.lang.String format2 = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{string}, 1));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        ((android.widget.TextView) value4).setText(format2);
    }
}
