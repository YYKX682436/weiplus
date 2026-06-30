package v11;

/* loaded from: classes11.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final v11.j0 f432394a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f432395b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f432396c;

    /* renamed from: d, reason: collision with root package name */
    public final int f432397d;

    /* renamed from: e, reason: collision with root package name */
    public final int f432398e;

    public h0(v11.j0 textView, java.lang.String blockSeparator, java.lang.String listItemSeparator, int i17, int i18) {
        kotlin.jvm.internal.o.g(textView, "textView");
        kotlin.jvm.internal.o.g(blockSeparator, "blockSeparator");
        kotlin.jvm.internal.o.g(listItemSeparator, "listItemSeparator");
        this.f432394a = textView;
        this.f432395b = blockSeparator;
        this.f432396c = listItemSeparator;
        this.f432397d = i17;
        this.f432398e = i18;
    }

    public static v11.h0 a(v11.h0 h0Var, v11.j0 textView, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            textView = h0Var.f432394a;
        }
        if ((i19 & 2) != 0) {
            str = h0Var.f432395b;
        }
        java.lang.String blockSeparator = str;
        if ((i19 & 4) != 0) {
            str2 = h0Var.f432396c;
        }
        java.lang.String listItemSeparator = str2;
        if ((i19 & 8) != 0) {
            i17 = h0Var.f432397d;
        }
        int i27 = i17;
        if ((i19 & 16) != 0) {
            i18 = h0Var.f432398e;
        }
        h0Var.getClass();
        kotlin.jvm.internal.o.g(textView, "textView");
        kotlin.jvm.internal.o.g(blockSeparator, "blockSeparator");
        kotlin.jvm.internal.o.g(listItemSeparator, "listItemSeparator");
        return new v11.h0(textView, blockSeparator, listItemSeparator, i27, i18);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.h0)) {
            return false;
        }
        v11.h0 h0Var = (v11.h0) obj;
        return kotlin.jvm.internal.o.b(this.f432394a, h0Var.f432394a) && kotlin.jvm.internal.o.b(this.f432395b, h0Var.f432395b) && kotlin.jvm.internal.o.b(this.f432396c, h0Var.f432396c) && this.f432397d == h0Var.f432397d && this.f432398e == h0Var.f432398e;
    }

    public int hashCode() {
        return (((((((this.f432394a.hashCode() * 31) + this.f432395b.hashCode()) * 31) + this.f432396c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f432397d)) * 31) + java.lang.Integer.hashCode(this.f432398e);
    }

    public java.lang.String toString() {
        return "NativeMarkdownTextSegmentConfig(textView=" + this.f432394a + ", blockSeparator=" + this.f432395b + ", listItemSeparator=" + this.f432396c + ", inlineNewlineSpacingPx=" + this.f432397d + ", blockSeparatorSpacingPx=" + this.f432398e + ')';
    }
}
