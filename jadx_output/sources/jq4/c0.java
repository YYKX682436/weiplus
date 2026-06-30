package jq4;

/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f301131c;

    /* renamed from: d, reason: collision with root package name */
    public int f301132d;

    /* renamed from: e, reason: collision with root package name */
    public int f301133e;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String[] f301129a = {""};

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f301130b = {"...", "", ".", ".."};

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f301134f = new com.tencent.mm.sdk.platformtools.b4(new jq4.b0(this), true);

    public final void a(android.widget.TextView tv6, java.lang.String baseStr, int i17) {
        kotlin.jvm.internal.o.g(tv6, "tv");
        kotlin.jvm.internal.o.g(baseStr, "baseStr");
        b();
        this.f301133e = 0;
        this.f301131c = tv6;
        this.f301132d = i17;
        java.lang.String[] strArr = this.f301130b;
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(baseStr + str);
        }
        this.f301129a = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f301134f;
        if (b4Var != null) {
            kotlin.jvm.internal.o.d(b4Var);
            long j17 = this.f301132d;
            b4Var.c(j17, j17);
        }
        com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.DynamicTextWrap", "start textview:" + tv6, new java.lang.Object[0]);
    }

    public final void b() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f301134f;
        if (b4Var != null) {
            kotlin.jvm.internal.o.d(b4Var);
            b4Var.d();
        }
        com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.DynamicTextWrap", "stop textview: " + this.f301131c, new java.lang.Object[0]);
        this.f301131c = null;
    }
}
