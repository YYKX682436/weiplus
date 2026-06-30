package com.tencent.mm.plugin.finder.search;

/* loaded from: classes8.dex */
public final class v5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.regex.Pattern f125947a;

    /* renamed from: b, reason: collision with root package name */
    public final int f125948b;

    /* renamed from: c, reason: collision with root package name */
    public final int f125949c;

    /* renamed from: d, reason: collision with root package name */
    public final int f125950d;

    /* renamed from: e, reason: collision with root package name */
    public final int f125951e;

    public v5(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f125947a = java.util.regex.Pattern.compile("<em class=\"highlight\">\\S+</em>");
        this.f125948b = 22;
        this.f125949c = 5;
        this.f125950d = context.getResources().getColor(com.tencent.mm.R.color.FG_0);
        this.f125951e = context.getResources().getColor(com.tencent.mm.R.color.FG_1);
    }
}
