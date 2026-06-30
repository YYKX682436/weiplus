package pk2;

/* loaded from: classes3.dex */
public final class g7 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f355779a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f355780b;

    /* renamed from: c, reason: collision with root package name */
    public final db5.g4 f355781c;

    /* renamed from: d, reason: collision with root package name */
    public db5.o4 f355782d;

    /* renamed from: e, reason: collision with root package name */
    public db5.t4 f355783e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f355784f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f355785g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Integer f355786h;

    public g7(java.lang.String levelId, java.lang.String str, db5.g4 menu, db5.o4 o4Var, db5.t4 t4Var, boolean z17, android.view.View view, java.lang.Integer num, int i17, kotlin.jvm.internal.i iVar) {
        str = (i17 & 2) != 0 ? null : str;
        o4Var = (i17 & 8) != 0 ? null : o4Var;
        t4Var = (i17 & 16) != 0 ? null : t4Var;
        z17 = (i17 & 32) != 0 ? true : z17;
        view = (i17 & 64) != 0 ? null : view;
        num = (i17 & 128) != 0 ? null : num;
        kotlin.jvm.internal.o.g(levelId, "levelId");
        kotlin.jvm.internal.o.g(menu, "menu");
        this.f355779a = levelId;
        this.f355780b = str;
        this.f355781c = menu;
        this.f355782d = o4Var;
        this.f355783e = t4Var;
        this.f355784f = z17;
        this.f355785g = view;
        this.f355786h = num;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk2.g7)) {
            return false;
        }
        pk2.g7 g7Var = (pk2.g7) obj;
        return kotlin.jvm.internal.o.b(this.f355779a, g7Var.f355779a) && kotlin.jvm.internal.o.b(this.f355780b, g7Var.f355780b) && kotlin.jvm.internal.o.b(this.f355781c, g7Var.f355781c) && kotlin.jvm.internal.o.b(this.f355782d, g7Var.f355782d) && kotlin.jvm.internal.o.b(this.f355783e, g7Var.f355783e) && this.f355784f == g7Var.f355784f && kotlin.jvm.internal.o.b(this.f355785g, g7Var.f355785g) && kotlin.jvm.internal.o.b(this.f355786h, g7Var.f355786h);
    }

    public int hashCode() {
        int hashCode = this.f355779a.hashCode() * 31;
        java.lang.String str = this.f355780b;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f355781c.hashCode()) * 31;
        db5.o4 o4Var = this.f355782d;
        int hashCode3 = (hashCode2 + (o4Var == null ? 0 : o4Var.hashCode())) * 31;
        db5.t4 t4Var = this.f355783e;
        int hashCode4 = (((hashCode3 + (t4Var == null ? 0 : t4Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f355784f)) * 31;
        android.view.View view = this.f355785g;
        int hashCode5 = (hashCode4 + (view == null ? 0 : view.hashCode())) * 31;
        java.lang.Integer num = this.f355786h;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "LevelConfig(levelId=" + this.f355779a + ", title=" + this.f355780b + ", menu=" + this.f355781c + ", onCreateMenuListener=" + this.f355782d + ", onMenuSelectedListener=" + this.f355783e + ", visible=" + this.f355784f + ", customWidget=" + this.f355785g + ", highlightItemId=" + this.f355786h + ')';
    }
}
