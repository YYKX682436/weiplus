package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class es {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f203931a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f203932b;

    /* renamed from: c, reason: collision with root package name */
    public final int f203933c;

    /* renamed from: d, reason: collision with root package name */
    public final int f203934d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f203935e;

    /* renamed from: f, reason: collision with root package name */
    public final yb5.d f203936f;

    public es(java.lang.String weapp_usename, java.lang.String weapp_path, int i17, int i18, java.lang.String templateId, yb5.d ui6) {
        kotlin.jvm.internal.o.g(weapp_usename, "weapp_usename");
        kotlin.jvm.internal.o.g(weapp_path, "weapp_path");
        kotlin.jvm.internal.o.g(templateId, "templateId");
        kotlin.jvm.internal.o.g(ui6, "ui");
        this.f203931a = weapp_usename;
        this.f203932b = weapp_path;
        this.f203933c = i17;
        this.f203934d = i18;
        this.f203935e = templateId;
        this.f203936f = ui6;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.viewitems.es)) {
            return false;
        }
        com.tencent.mm.ui.chatting.viewitems.es esVar = (com.tencent.mm.ui.chatting.viewitems.es) obj;
        return kotlin.jvm.internal.o.b(this.f203931a, esVar.f203931a) && kotlin.jvm.internal.o.b(this.f203932b, esVar.f203932b) && this.f203933c == esVar.f203933c && this.f203934d == esVar.f203934d && kotlin.jvm.internal.o.b(this.f203935e, esVar.f203935e) && kotlin.jvm.internal.o.b(this.f203936f, esVar.f203936f);
    }

    public int hashCode() {
        return (((((((((this.f203931a.hashCode() * 31) + this.f203932b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f203933c)) * 31) + java.lang.Integer.hashCode(this.f203934d)) * 31) + this.f203935e.hashCode()) * 31) + this.f203936f.hashCode();
    }

    public java.lang.String toString() {
        return "TemplateWeappWrap(weapp_usename=" + this.f203931a + ", weapp_path=" + this.f203932b + ", weapp_state=" + this.f203933c + ", weapp_version=" + this.f203934d + ", templateId=" + this.f203935e + ", ui=" + this.f203936f + ')';
    }
}
