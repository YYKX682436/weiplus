package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class p8 implements com.tencent.mm.sdk.platformtools.r8 {

    /* renamed from: a, reason: collision with root package name */
    public int f192932a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f192933b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f192934c;

    public p8(java.lang.StringBuilder sb6, java.util.ArrayList arrayList) {
        this.f192933b = sb6;
        this.f192934c = arrayList;
    }

    public void a(java.lang.String str) {
        if (this.f192932a < 30) {
            java.lang.StringBuilder sb6 = this.f192933b;
            sb6.append(str);
            sb6.append('\n');
        } else {
            this.f192934c.add(str);
        }
        this.f192932a++;
    }
}
