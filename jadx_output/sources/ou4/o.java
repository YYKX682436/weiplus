package ou4;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f348998a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f348999b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f349000c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f349001d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f349002e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f349003f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f349004g;

    public o(java.lang.String businessId, java.lang.String pluginName, java.lang.String str, java.util.List list, java.util.Set pluginWhitelist, boolean z17, java.util.Map extras, int i17, kotlin.jvm.internal.i iVar) {
        str = (i17 & 4) != 0 ? com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM : str;
        list = (i17 & 8) != 0 ? null : list;
        pluginWhitelist = (i17 & 16) != 0 ? kz5.r0.f314002d : pluginWhitelist;
        z17 = (i17 & 32) != 0 ? true : z17;
        extras = (i17 & 64) != 0 ? kz5.q0.f314001d : extras;
        kotlin.jvm.internal.o.g(businessId, "businessId");
        kotlin.jvm.internal.o.g(pluginName, "pluginName");
        kotlin.jvm.internal.o.g(pluginWhitelist, "pluginWhitelist");
        kotlin.jvm.internal.o.g(extras, "extras");
        this.f348998a = businessId;
        this.f348999b = pluginName;
        this.f349000c = str;
        this.f349001d = list;
        this.f349002e = pluginWhitelist;
        this.f349003f = z17;
        this.f349004g = extras;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou4.o)) {
            return false;
        }
        ou4.o oVar = (ou4.o) obj;
        return kotlin.jvm.internal.o.b(this.f348998a, oVar.f348998a) && kotlin.jvm.internal.o.b(this.f348999b, oVar.f348999b) && kotlin.jvm.internal.o.b(this.f349000c, oVar.f349000c) && kotlin.jvm.internal.o.b(this.f349001d, oVar.f349001d) && kotlin.jvm.internal.o.b(this.f349002e, oVar.f349002e) && this.f349003f == oVar.f349003f && kotlin.jvm.internal.o.b(this.f349004g, oVar.f349004g);
    }

    public int hashCode() {
        int hashCode = ((this.f348998a.hashCode() * 31) + this.f348999b.hashCode()) * 31;
        java.lang.String str = this.f349000c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.util.List list = this.f349001d;
        return ((((((hashCode2 + (list != null ? list.hashCode() : 0)) * 31) + this.f349002e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f349003f)) * 31) + this.f349004g.hashCode();
    }

    public java.lang.String toString() {
        return "FlutterBusinessConfig(businessId=" + this.f348998a + ", pluginName=" + this.f348999b + ", entryPoint=" + this.f349000c + ", initialPlugins=" + this.f349001d + ", pluginWhitelist=" + this.f349002e + ", enableErrorBoundary=" + this.f349003f + ", extras=" + this.f349004g + ')';
    }
}
