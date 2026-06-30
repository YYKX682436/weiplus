package so2;

/* loaded from: classes.dex */
public final class l3 implements so2.j5, in5.o0 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.yw2 f410468d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f410469e;

    /* renamed from: f, reason: collision with root package name */
    public final android.text.SpannableString f410470f;

    /* renamed from: g, reason: collision with root package name */
    public final int f410471g;

    public l3(r45.yw2 divider) {
        kotlin.jvm.internal.o.g(divider, "divider");
        this.f410468d = divider;
        this.f410469e = jz5.h.b(new so2.k3(this));
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String string = divider.getString(1);
        ((ke0.e) xVar).getClass();
        this.f410470f = com.tencent.mm.pluginsdk.ui.span.c0.i(context, string);
        this.f410471g = divider.getInteger(2);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (!(obj instanceof so2.l3)) {
            return -1;
        }
        r45.yw2 yw2Var = ((so2.l3) obj).f410468d;
        long j17 = yw2Var.getLong(3);
        r45.yw2 yw2Var2 = this.f410468d;
        if (j17 != yw2Var2.getLong(3) || yw2Var.getInteger(2) != yw2Var2.getInteger(2) || !kotlin.jvm.internal.o.b(yw2Var.getString(1), yw2Var2.getString(1))) {
            return -1;
        }
        r45.eo eoVar = (r45.eo) yw2Var.getCustom(8);
        java.lang.String string = eoVar != null ? eoVar.getString(0) : null;
        r45.eo eoVar2 = (r45.eo) yw2Var2.getCustom(8);
        if (!kotlin.jvm.internal.o.b(string, eoVar2 != null ? eoVar2.getString(0) : null)) {
            return -1;
        }
        r45.eo eoVar3 = (r45.eo) yw2Var.getCustom(8);
        java.lang.Integer valueOf = eoVar3 != null ? java.lang.Integer.valueOf(eoVar3.getInteger(1)) : null;
        r45.eo eoVar4 = (r45.eo) yw2Var2.getCustom(8);
        return kotlin.jvm.internal.o.b(valueOf, eoVar4 != null ? java.lang.Integer.valueOf(eoVar4.getInteger(1)) : null) ? 0 : -1;
    }

    @Override // in5.c
    public long getItemId() {
        return ((java.lang.Number) ((jz5.n) this.f410469e).getValue()).longValue();
    }

    @Override // in5.c
    public int h() {
        return 2023;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ItemId=");
        sb6.append(getItemId());
        sb6.append(",ItemType=2023 tipStyle=");
        sb6.append(this.f410471g);
        sb6.append(" tip=");
        sb6.append((java.lang.Object) this.f410470f);
        sb6.append(",wording=");
        r45.yw2 yw2Var = this.f410468d;
        sb6.append(yw2Var.getString(1));
        sb6.append(",bubble=");
        r45.eo eoVar = (r45.eo) yw2Var.getCustom(8);
        sb6.append(eoVar != null ? eoVar.getString(0) : null);
        sb6.append('(');
        r45.eo eoVar2 = (r45.eo) yw2Var.getCustom(8);
        sb6.append(eoVar2 != null ? java.lang.Integer.valueOf(eoVar2.getInteger(1)) : null);
        sb6.append("s)");
        return sb6.toString();
    }
}
