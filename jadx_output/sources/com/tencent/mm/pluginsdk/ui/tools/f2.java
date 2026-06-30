package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public abstract class f2 {

    /* renamed from: a, reason: collision with root package name */
    public int f191623a;

    /* renamed from: b, reason: collision with root package name */
    public int f191624b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f191625c;

    public f2(int i17, int i18, java.lang.String str, int i19, kotlin.jvm.internal.i iVar) {
        i17 = (i19 & 1) != 0 ? 3 : i17;
        i18 = (i19 & 2) != 0 ? 1 : i18;
        str = (i19 & 4) != 0 ? null : str;
        this.f191623a = i17;
        this.f191624b = i18;
        this.f191625c = str;
    }
}
