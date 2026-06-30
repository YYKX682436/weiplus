package so2;

/* loaded from: classes2.dex */
public final class d5 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.r03 f410314d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.r23 f410315e;

    public d5(r45.r03 topicInfo) {
        kotlin.jvm.internal.o.g(topicInfo, "topicInfo");
        this.f410314d = topicInfo;
        this.f410315e = (r45.r23) topicInfo.getCustom(23);
    }

    public final java.lang.String a() {
        r45.rz6 rz6Var;
        r45.b70 b70Var;
        r45.r23 r23Var = (r45.r23) this.f410314d.getCustom(23);
        java.lang.String str = (r23Var == null || (rz6Var = (r45.rz6) r23Var.getCustom(1)) == null || (b70Var = rz6Var.f385323g) == null) ? null : b70Var.f370585g;
        return str == null ? "" : str;
    }

    public final java.lang.String b() {
        r45.rz6 rz6Var;
        r45.b70 b70Var;
        r45.r23 r23Var = (r45.r23) this.f410314d.getCustom(23);
        java.lang.String str = (r23Var == null || (rz6Var = (r45.rz6) r23Var.getCustom(1)) == null || (b70Var = rz6Var.f385323g) == null) ? null : b70Var.f370582d;
        return str == null ? "" : str;
    }

    public final int c() {
        r45.rz6 rz6Var;
        r45.b70 b70Var;
        r45.r23 r23Var = (r45.r23) this.f410314d.getCustom(23);
        if (r23Var == null || (rz6Var = (r45.rz6) r23Var.getCustom(1)) == null || (b70Var = rz6Var.f385323g) == null) {
            return 0;
        }
        return b70Var.f370583e;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        r45.r23 r23Var;
        r45.rz6 rz6Var;
        java.lang.String str;
        r45.rz6 rz6Var2;
        kotlin.jvm.internal.o.g(obj, "obj");
        if (!(obj instanceof so2.d5) || (r23Var = this.f410315e) == null || (rz6Var = (r45.rz6) r23Var.getCustom(1)) == null || (str = rz6Var.f385320d) == null) {
            return 0;
        }
        r45.r23 r23Var2 = ((so2.d5) obj).f410315e;
        java.lang.String str2 = (r23Var2 == null || (rz6Var2 = (r45.rz6) r23Var2.getCustom(1)) == null) ? null : rz6Var2.f385320d;
        if (str2 == null) {
            str2 = "";
        }
        return str.compareTo(str2);
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return so2.d5.class.getName().hashCode();
    }
}
