package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class zk {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.LinearLayout f133472a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f133473b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f133474c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f133475d;

    public zk(android.widget.LinearLayout container, android.widget.ImageView icon1, android.widget.ImageView icon2, android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(icon1, "icon1");
        kotlin.jvm.internal.o.g(icon2, "icon2");
        kotlin.jvm.internal.o.g(textView, "textView");
        this.f133472a = container;
        this.f133473b = icon1;
        this.f133474c = icon2;
        this.f133475d = textView;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.view.zk)) {
            return false;
        }
        com.tencent.mm.plugin.finder.view.zk zkVar = (com.tencent.mm.plugin.finder.view.zk) obj;
        return kotlin.jvm.internal.o.b(this.f133472a, zkVar.f133472a) && kotlin.jvm.internal.o.b(this.f133473b, zkVar.f133473b) && kotlin.jvm.internal.o.b(this.f133474c, zkVar.f133474c) && kotlin.jvm.internal.o.b(this.f133475d, zkVar.f133475d);
    }

    public int hashCode() {
        return (((((this.f133472a.hashCode() * 31) + this.f133473b.hashCode()) * 31) + this.f133474c.hashCode()) * 31) + this.f133475d.hashCode();
    }

    public java.lang.String toString() {
        return "SpeedItem(container=" + this.f133472a + ", icon1=" + this.f133473b + ", icon2=" + this.f133474c + ", textView=" + this.f133475d + ')';
    }
}
