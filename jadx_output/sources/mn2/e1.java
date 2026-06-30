package mn2;

/* loaded from: classes10.dex */
public final class e1 extends mn2.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f329941e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f329942f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f329943g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f329944h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.yq4 f329945i;

    public e1(java.lang.String url, java.lang.String id6, java.lang.String name, boolean z17, boolean z18, r45.yq4 yq4Var, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 8) != 0 ? false : z17;
        z18 = (i17 & 16) != 0 ? false : z18;
        yq4Var = (i17 & 32) != 0 ? null : yq4Var;
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(name, "name");
        this.f329941e = url;
        this.f329942f = id6;
        this.f329943g = z17;
        this.f329944h = z18;
        this.f329945i = yq4Var;
    }

    @Override // mn2.h3
    public com.tencent.mm.plugin.finder.storage.y90 getMediaType() {
        return this.f329943g ? com.tencent.mm.plugin.finder.storage.y90.T : this.f329944h ? com.tencent.mm.plugin.finder.storage.y90.U : com.tencent.mm.plugin.finder.storage.y90.S;
    }

    @Override // mn2.h3
    public java.lang.String getPath() {
        return "";
    }

    @Override // mn2.h3
    public java.lang.String getUrl() {
        return this.f329941e;
    }

    @Override // mn2.h3
    public java.lang.String h() {
        return "";
    }

    @Override // mn2.h3
    public java.lang.String i() {
        return "";
    }

    @Override // mn2.h3
    public java.lang.String l() {
        return this.f329941e;
    }

    @Override // mn2.h3
    public java.lang.String m() {
        return "";
    }

    @Override // ip0.c
    public java.lang.String n() {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String str = this.f329942f;
        r45.yq4 yq4Var = this.f329945i;
        if (yq4Var == null || this.f329943g) {
            return str + '_' + getMediaType();
        }
        java.lang.String str2 = "";
        if (this.f329944h) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append('_');
            sb6.append(getMediaType());
            sb6.append('_');
            java.lang.String string3 = yq4Var.getString(0);
            if (string3 == null) {
                string3 = "";
            }
            sb6.append(string3);
            sb6.append('_');
            r45.gs5 gs5Var = (r45.gs5) yq4Var.getCustom(2);
            if (gs5Var != null && (string2 = gs5Var.getString(1)) != null) {
                str2 = string2;
            }
            sb6.append(str2);
            return sb6.toString();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(str);
        sb7.append('_');
        sb7.append(getMediaType());
        sb7.append('_');
        java.lang.String string4 = yq4Var.getString(0);
        if (string4 == null) {
            string4 = "";
        }
        sb7.append(string4);
        sb7.append('_');
        r45.gs5 gs5Var2 = (r45.gs5) yq4Var.getCustom(1);
        if (gs5Var2 != null && (string = gs5Var2.getString(1)) != null) {
            str2 = string;
        }
        sb7.append(str2);
        return sb7.toString();
    }
}
