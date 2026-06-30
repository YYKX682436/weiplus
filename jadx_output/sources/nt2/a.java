package nt2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f339702a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f339703b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f339704c;

    /* renamed from: d, reason: collision with root package name */
    public int f339705d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f339706e;

    /* renamed from: f, reason: collision with root package name */
    public int f339707f;

    public a(int i17, java.lang.String tabTitle, java.util.List feedList, int i18, com.tencent.mm.protobuf.g gVar, int i19, int i27, kotlin.jvm.internal.i iVar) {
        tabTitle = (i27 & 2) != 0 ? "" : tabTitle;
        feedList = (i27 & 4) != 0 ? new java.util.ArrayList() : feedList;
        i18 = (i27 & 8) != 0 ? 0 : i18;
        gVar = (i27 & 16) != 0 ? null : gVar;
        i19 = (i27 & 32) != 0 ? 0 : i19;
        kotlin.jvm.internal.o.g(tabTitle, "tabTitle");
        kotlin.jvm.internal.o.g(feedList, "feedList");
        this.f339702a = i17;
        this.f339703b = tabTitle;
        this.f339704c = feedList;
        this.f339705d = i18;
        this.f339706e = gVar;
        this.f339707f = i19;
    }

    public java.lang.String toString() {
        return "(tabId=" + this.f339702a + ", tabTitle=" + this.f339703b + ", feedSize=" + this.f339704c.size() + ')';
    }
}
