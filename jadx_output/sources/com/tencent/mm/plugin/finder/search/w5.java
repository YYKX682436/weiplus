package com.tencent.mm.plugin.finder.search;

/* loaded from: classes8.dex */
public final class w5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.regex.Pattern f125967a;

    /* renamed from: b, reason: collision with root package name */
    public final int f125968b;

    /* renamed from: c, reason: collision with root package name */
    public final int f125969c;

    /* renamed from: d, reason: collision with root package name */
    public final int f125970d;

    /* renamed from: e, reason: collision with root package name */
    public final int f125971e;

    public w5(android.content.Context context, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f125967a = java.util.regex.Pattern.compile("<em class=\"highlight\">\\S+</em>");
        this.f125968b = 22;
        this.f125969c = 5;
        this.f125970d = z17 ? z18 ? context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5) : context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5) : z18 ? context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5) : context.getResources().getColor(com.tencent.mm.R.color.FG_1);
        this.f125971e = z17 ? context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8) : z18 ? context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8) : context.getResources().getColor(com.tencent.mm.R.color.FG_0);
    }
}
