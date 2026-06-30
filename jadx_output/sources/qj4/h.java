package qj4;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f363911a;

    /* renamed from: b, reason: collision with root package name */
    public int f363912b;

    /* renamed from: c, reason: collision with root package name */
    public int f363913c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f363914d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f363915e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f363916f;

    public h(int i17, int i18, int i19, java.util.List custom_icon_list, java.util.List custom_word_list, int i27, kotlin.jvm.internal.i iVar) {
        i17 = (i27 & 1) != 0 ? 0 : i17;
        i18 = (i27 & 2) != 0 ? 0 : i18;
        i19 = (i27 & 4) != 0 ? 0 : i19;
        custom_icon_list = (i27 & 8) != 0 ? new java.util.ArrayList() : custom_icon_list;
        custom_word_list = (i27 & 16) != 0 ? new java.util.ArrayList() : custom_word_list;
        kotlin.jvm.internal.o.g(custom_icon_list, "custom_icon_list");
        kotlin.jvm.internal.o.g(custom_word_list, "custom_word_list");
        this.f363911a = i17;
        this.f363912b = i18;
        this.f363913c = i19;
        this.f363914d = custom_icon_list;
        this.f363915e = custom_word_list;
        this.f363916f = "MicroMsg.TextStatusIconPickerCustomStatusSdkReportModel";
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj4.h)) {
            return false;
        }
        qj4.h hVar = (qj4.h) obj;
        return this.f363911a == hVar.f363911a && this.f363912b == hVar.f363912b && this.f363913c == hVar.f363913c && kotlin.jvm.internal.o.b(this.f363914d, hVar.f363914d) && kotlin.jvm.internal.o.b(this.f363915e, hVar.f363915e);
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f363911a) * 31) + java.lang.Integer.hashCode(this.f363912b)) * 31) + java.lang.Integer.hashCode(this.f363913c)) * 31) + this.f363914d.hashCode()) * 31) + this.f363915e.hashCode();
    }

    public java.lang.String toString() {
        return "TextStatusIconPickerCustomStatusSdkReportModel(clk_custom_icon_pv=" + this.f363911a + ", clk_cancel_pv=" + this.f363912b + ", clk_finish_pv=" + this.f363913c + ", custom_icon_list=" + this.f363914d + ", custom_word_list=" + this.f363915e + ')';
    }
}
