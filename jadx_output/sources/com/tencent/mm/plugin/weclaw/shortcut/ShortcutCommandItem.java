package com.tencent.mm.plugin.weclaw.shortcut;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandItem;", "Landroid/os/Parcelable;", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class ShortcutCommandItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem> CREATOR = new ry4.d0();

    /* renamed from: d, reason: collision with root package name */
    public final int f188079d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f188080e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f188081f;

    public ShortcutCommandItem(int i17, java.lang.String title, java.lang.String content) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(content, "content");
        this.f188079d = i17;
        this.f188080e = title;
        this.f188081f = content;
    }

    public static com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem b(com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem shortcutCommandItem, int i17, java.lang.String title, java.lang.String content, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = shortcutCommandItem.f188079d;
        }
        if ((i18 & 2) != 0) {
            title = shortcutCommandItem.f188080e;
        }
        if ((i18 & 4) != 0) {
            content = shortcutCommandItem.f188081f;
        }
        shortcutCommandItem.getClass();
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(content, "content");
        return new com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem(i17, title, content);
    }

    public final java.lang.String a() {
        java.lang.Object obj;
        java.lang.String str = this.f188081f;
        java.util.Iterator it = r26.n0.Q(str).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((java.lang.String) obj).length() > 0) {
                break;
            }
        }
        java.lang.String str2 = (java.lang.String) obj;
        return str2 == null ? (java.lang.String) kz5.n0.X(r26.n0.Q(str)) : str2;
    }

    public final java.lang.String c() {
        java.lang.Object obj;
        java.lang.String str = this.f188080e;
        java.util.Iterator it = r26.n0.Q(str).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((java.lang.String) obj).length() > 0) {
                break;
            }
        }
        java.lang.String str2 = (java.lang.String) obj;
        return str2 == null ? (java.lang.String) kz5.n0.X(r26.n0.Q(str)) : str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem)) {
            return false;
        }
        com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem shortcutCommandItem = (com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem) obj;
        return this.f188079d == shortcutCommandItem.f188079d && kotlin.jvm.internal.o.b(this.f188080e, shortcutCommandItem.f188080e) && kotlin.jvm.internal.o.b(this.f188081f, shortcutCommandItem.f188081f);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f188079d) * 31) + this.f188080e.hashCode()) * 31) + this.f188081f.hashCode();
    }

    public java.lang.String toString() {
        return "ShortcutCommandItem(id=" + this.f188079d + ", title=" + this.f188080e + ", content=" + this.f188081f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f188079d);
        out.writeString(this.f188080e);
        out.writeString(this.f188081f);
    }
}
